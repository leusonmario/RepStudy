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
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"Python3\"");
        boolean boolean12 = python3Target1.wantsBaseListener();
        int int13 = python3Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup14 = python3Target1.getTemplates();
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromString("_tset_tset\\\".5.2.", false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"Python3\"Context" + "'", str11, "\"Python3\"Context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_tset_tset\\\\\\\".5.2." + "'", str17, "_tset_tset\\\\\\\".5.2.");
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"Python3\"");
        java.lang.String str13 = python3Target1.getImplicitRuleLabel("");
        java.lang.String str15 = python3Target1.getListLabel("_tset_\"hi!\"ContextContext");
        java.lang.String str17 = python3Target1.encodeIntAsCharEscape(10);
        java.lang.String str19 = python3Target1.getImplicitSetLabel("\"_tsettset\\\\\\\"hi!\"");
        java.lang.String str21 = python3Target1.encodeIntAsCharEscape(0);
        boolean boolean22 = python3Target1.templatesExist();
        java.lang.String str25 = python3Target1.getTargetStringLiteralFromString("\"\\\"_\\\"hi!\\\"Contex\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        java.lang.String str29 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator26, "__Python3", false);
        java.lang.String str31 = python3Target1.getImplicitSetLabel("tset\\\"\\\"Python3\\\"Context");
        java.lang.String str33 = python3Target1.getListLabel("_\\\\\\\"tset\\\\\\\\\\\\\\\"_Python3\\\\\\\"");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = python3Target1.getRuleFunctionContextStructName(ruleFunction34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"Python3\"Context" + "'", str11, "\"Python3\"Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_" + "'", str13, "_");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset_\"hi!\"ContextContext" + "'", str15, "_tset_\"hi!\"ContextContext");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\n" + "'", str17, "\\n");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_tset\"_tsettset\\\\\\\"hi!\"" + "'", str19, "_tset\"_tsettset\\\\\\\"hi!\"");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\\0" + "'", str21, "\\0");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\\\"\\\\\\\"_\\\\\\\"hi!\\\\\\\"Contex\\\"" + "'", str25, "\\\"\\\\\\\"_\\\\\\\"hi!\\\\\\\"Contex\\\"");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "_Python" + "'", str29, "_Python");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "_tsettset\\\"\\\"Python3\\\"Context" + "'", str31, "_tsettset\\\"\\\"Python3\\\"Context");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "_\\\\\\\"tset\\\\\\\\\\\\\\\"_Python3\\\\\\\"" + "'", str33, "_\\\\\\\"tset\\\\\\\\\\\\\\\"_Python3\\\\\\\"");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        boolean boolean6 = python3Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        int int4 = python3Target1.getInlineTestSetWordSize();
        boolean boolean5 = python3Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("hi!");
        java.lang.String str11 = python3Target1.getListLabel("");
        java.lang.String str12 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "_tset_tset_\"hi!\"Context", false);
        org.stringtemplate.v4.STGroup sTGroup17 = python3Target1.getTemplates();
        boolean boolean18 = python3Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"hi!\"" + "'", str9, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "tset_tset_\\\"hi!\\\"Contex" + "'", str16, "tset_tset_\\\"hi!\\\"Contex");
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getImplicitSetLabel("_\"hi!\"Context");
        java.util.Set<java.lang.String> strSet8 = python3Target1.getBadWords();
        java.lang.String str10 = python3Target1.getImplicitSetLabel("_tset_tset_\"Python3\"");
        java.lang.String str12 = python3Target1.getImplicitSetLabel("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset_\"hi!\"Context" + "'", str7, "_tset_\"hi!\"Context");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_tset_tset_tset_\"Python3\"" + "'", str10, "_tset_tset_tset_\"Python3\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset" + "'", str12, "_tset");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        boolean boolean7 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "_\"\\\"hi!\\\"\"", true);
        boolean boolean13 = python3Target1.wantsBaseVisitor();
        boolean boolean14 = python3Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python3Target1.getCodeGenerator();
        java.lang.String str17 = python3Target1.getImplicitSetLabel("\"t\\\"hContex\"");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"\\\"hi!\\\"\"" + "'", str12, "\"\\\"\\\"hi!\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_tset\"t\\\"hContex\"" + "'", str17, "_tset\"t\\\"hContex\"");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        boolean boolean11 = python3Target1.wantsBaseVisitor();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("\"_Python3\"");
        java.lang.String str15 = python3Target1.getListLabel("\"\\\"_\\\"hi!\\\"Contex\"");
        boolean boolean16 = python3Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"_Python3\\\"\"" + "'", str13, "\"\\\"_Python3\\\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"_\\\"hi!\\\"Contex\"" + "'", str15, "\"\\\"_\\\"hi!\\\"Contex\"");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("\"\\\"Python3\\\"Context\"");
        java.lang.String str5 = python3Target1.getAltLabelContextStructName("_tset\\\"\\\\\\\"hi!\\\\\\\"\\\"Context");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getRuleFunctionContextStructName(ruleFunction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\\\"\\\\\\\"Python3\\\\\\\"Context\\\"\"" + "'", str3, "\"\\\"\\\\\\\"Python3\\\\\\\"Context\\\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tset\\\"\\\\\\\"hi!\\\\\\\"\\\"ContextContext" + "'", str5, "_tset\\\"\\\\\\\"hi!\\\\\\\"\\\"ContextContext");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\".5.2.\"", false);
        int int10 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".5.2." + "'", str9, ".5.2.");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\"hi!\"");
        boolean boolean7 = python3Target1.templatesExist();
        int int8 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "_tset\"_Python3\"", true);
        boolean boolean13 = python3Target1.supportsOverloadedMethods();
        java.lang.String str15 = python3Target1.getListLabel("\"tset_\\\\\\\"hi!\\\\\\\"Contex\"");
        int int16 = python3Target1.getSerializedATNSegmentLimit();
        java.util.Set<java.lang.String> strSet17 = python3Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"Context" + "'", str6, "\"hi!\"Context");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"tset\\\"_Python3\"" + "'", str12, "\"tset\\\"_Python3\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"tset_\\\\\\\"hi!\\\\\\\"Contex\"" + "'", str15, "\"tset_\\\\\\\"hi!\\\\\\\"Contex\"");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 29 + "'", int16 == 29);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getLanguage();
        boolean boolean6 = python3Target1.templatesExist();
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        java.lang.String str9 = python3Target1.getAltLabelContextStructName("\"Tset\\\\\\\"hi!Context\"");
        java.lang.String str11 = python3Target1.getListLabel("\"\\\"\\\\\\\"_Python3\\\\\\\"\\\"ContextContext\"");
        java.lang.String str13 = python3Target1.encodeIntAsCharEscape((int) '4');
        java.util.Set<java.lang.String> strSet14 = python3Target1.getBadWords();
        java.lang.Class<?> wildcardClass15 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"Tset\\\\\\\"hi!Context\"Context" + "'", str9, "\"Tset\\\\\\\"hi!Context\"Context");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"\\\\\\\"_Python3\\\\\\\"\\\"ContextContext\"" + "'", str11, "\"\\\"\\\\\\\"_Python3\\\\\\\"\\\"ContextContext\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\64" + "'", str13, "\\64");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\"hi!\"");
        boolean boolean7 = python3Target1.templatesExist();
        int int8 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "_tset\"_Python3\"", true);
        java.lang.String str13 = python3Target1.getLanguage();
        java.lang.String str14 = python3Target1.getVersion();
        java.lang.String str16 = python3Target1.getAltLabelContextStructName("\"\\\"_Python3\\\"\"Context");
        java.lang.String str18 = python3Target1.getImplicitRuleLabel("\"\\\"hi!\\\"\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python3Target1.encodeIntAsCharEscape((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"Context" + "'", str6, "\"hi!\"Context");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"tset\\\"_Python3\"" + "'", str12, "\"tset\\\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python3" + "'", str13, "Python3");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\\"_Python3\\\"\"ContextContext" + "'", str16, "\"\\\"_Python3\\\"\"ContextContext");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_\"\\\"hi!\\\"\"" + "'", str18, "_\"\\\"hi!\\\"\"");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        boolean boolean11 = python3Target1.wantsBaseVisitor();
        int int12 = python3Target1.getSerializedATNSegmentLimit();
        int int13 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("#");
        java.lang.String str17 = python3Target1.getImplicitSetLabel("hi!");
        boolean boolean18 = python3Target1.wantsBaseVisitor();
        java.lang.String str19 = python3Target1.getLanguage();
        java.lang.String str21 = python3Target1.getTargetStringLiteralFromString("__Python3");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 29 + "'", int12 == 29);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29 + "'", int13 == 29);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"#\"" + "'", str15, "\"#\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_tsethi!" + "'", str17, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Python3" + "'", str19, "Python3");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"__Python3\"" + "'", str21, "\"__Python3\"");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getLanguage();
        boolean boolean6 = python3Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset_\"Python3\"Context", true);
        boolean boolean11 = python3Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "tset\\\"hi!", true);
        java.lang.String str17 = python3Target1.getImplicitSetLabel("\"\\\"tset\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"Python3\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"Context\\\"\"");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"tset_\\\"Python3\\\"Contex\"" + "'", str10, "\"tset_\\\"Python3\\\"Contex\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"set\\\"hi\"" + "'", str15, "\"set\\\"hi\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_tset\"\\\"tset\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"Python3\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"Context\\\"\"" + "'", str17, "_tset\"\\\"tset\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"Python3\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"Context\\\"\"");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        boolean boolean7 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "_\"\\\"hi!\\\"\"", true);
        boolean boolean13 = python3Target1.wantsBaseVisitor();
        java.lang.String str15 = python3Target1.getImplicitSetLabel("_\"_tsettset\\\\\\\"\\\\\\\"Python3\\\\\\\"Context\"");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"\\\"hi!\\\"\"" + "'", str12, "\"\\\"\\\"hi!\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset_\"_tsettset\\\\\\\"\\\\\\\"Python3\\\\\\\"Context\"" + "'", str15, "_tset_\"_tsettset\\\\\\\"\\\\\\\"Python3\\\\\\\"Context\"");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("hi!");
        java.lang.String str11 = python3Target1.getListLabel("");
        java.lang.String str12 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "_tset_tset_\"hi!\"Context", false);
        org.stringtemplate.v4.STGroup sTGroup17 = python3Target1.getTemplates();
        boolean boolean18 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        java.lang.String str22 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator19, "\"\\\"_tsettset\\\\\\\\\\\\\\\"hi!\\\"\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        java.lang.String str26 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator23, "_\\35", true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"hi!\"" + "'", str9, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "tset_tset_\\\"hi!\\\"Contex" + "'", str16, "tset_tset_\\\"hi!\\\"Contex");
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"\\\"_tsettset\\\\\\\\\\\\\\\"hi!\\\"\"" + "'", str22, "\"\\\"_tsettset\\\\\\\\\\\\\\\"hi!\\\"\"");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"3\"" + "'", str26, "\"3\"");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\"hi!\"Context");
        java.lang.String str10 = python3Target1.getLanguage();
        java.lang.String str12 = python3Target1.getListLabel("_tset_\"hi!\"Context");
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("\"Python3\"Context", false);
        java.lang.String str18 = python3Target1.getTargetStringLiteralFromString("_tset\"\\\\35\"", false);
        boolean boolean19 = python3Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"hi!\"Context" + "'", str9, "_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python3" + "'", str10, "Python3");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_\"hi!\"Context" + "'", str12, "_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\\"Python3\\\"Context" + "'", str15, "\\\"Python3\\\"Context");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset\\\"\\\\\\\\35\\\"" + "'", str18, "_tset\\\"\\\\\\\\35\\\"");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        boolean boolean6 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getImplicitRuleLabel("_\"hi!\"Context");
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape((int) '#');
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_\\\\\\\"tset\\\\\\\\\\\\\\\"_Python3\\\\\\\"", false);
        int int11 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "__\"hi!\"Context" + "'", str3, "__\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#" + "'", str6, "#");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\\\\\\"tset\\\\\\\\\\\\\\\"_Python3\\\\\\\"" + "'", str10, "\\\\\\\"tset\\\\\\\\\\\\\\\"_Python3\\\\\\\"");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29 + "'", int11 == 29);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\0" + "'", str5, "\\0");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\"hi!\"Context");
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("_Python3");
        boolean boolean12 = python3Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python3Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"hi!\"Context" + "'", str9, "_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"_Python3\"" + "'", str11, "\"_Python3\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertNull(codeGenerator14);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getLanguage();
        boolean boolean6 = python3Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset_\"Python3\"Context", true);
        boolean boolean11 = python3Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "tset\\\"hi!", true);
        java.util.Set<java.lang.String> strSet16 = python3Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"tset_\\\"Python3\\\"Contex\"" + "'", str10, "\"tset_\\\"Python3\\\"Contex\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"set\\\"hi\"" + "'", str15, "\"set\\\"hi\"");
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.getTemplates();
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "tset\\\"hi!", false);
        java.lang.String str13 = python3Target1.getListLabel("_tset_\\\"hi!\\\"Contex");
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "#", false);
        int int18 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "set\\\"hi" + "'", str11, "set\\\"hi");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_tset_\\\"hi!\\\"Contex" + "'", str13, "_tset_\\\"hi!\\\"Contex");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 29 + "'", int18 == 29);
        org.junit.Assert.assertNull(codeGenerator19);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\"hi!\"Context");
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("_Python3");
        boolean boolean12 = python3Target1.wantsBaseListener();
        int int13 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target16 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator15);
        int int17 = python3Target16.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet18 = python3Target16.getBadWords();
        int int19 = python3Target16.getInlineTestSetWordSize();
        java.lang.String str22 = python3Target16.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = python3Target16.getCodeGenerator();
        boolean boolean24 = python3Target16.supportsOverloadedMethods();
        java.lang.String str26 = python3Target16.getAltLabelContextStructName("\"Python3\"");
        boolean boolean27 = python3Target16.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup28 = python3Target16.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup29 = python3Target16.getTemplates();
        java.util.Set<java.lang.String> strSet30 = python3Target16.getBadWords();
        java.lang.String str32 = python3Target16.encodeIntAsCharEscape((int) '4');
        java.lang.String str33 = python3Target16.getLanguage();
        org.antlr.v4.tool.Grammar grammar34 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target36 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator35);
        org.antlr.v4.codegen.CodeGenerator codeGenerator37 = null;
        java.lang.String str40 = python3Target36.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator37, "4.5.2.1", true);
        boolean boolean41 = python3Target36.templatesExist();
        org.antlr.v4.tool.Grammar grammar42 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator43 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target44 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator43);
        int int45 = python3Target44.getInlineTestSetWordSize();
        java.lang.String str47 = python3Target44.getImplicitSetLabel("\"hi!\"");
        java.lang.String str49 = python3Target44.encodeIntAsCharEscape(0);
        java.lang.String str50 = python3Target44.getVersion();
        java.lang.String str52 = python3Target44.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.tool.Grammar grammar53 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator54 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target55 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator54);
        boolean boolean56 = python3Target55.supportsOverloadedMethods();
        java.lang.String str58 = python3Target55.getTargetStringLiteralFromString("_Python3");
        org.antlr.v4.tool.Grammar grammar59 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator60 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target61 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator60);
        int int62 = python3Target61.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet63 = python3Target61.getBadWords();
        int int64 = python3Target61.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator65 = python3Target61.getCodeGenerator();
        java.lang.String str67 = python3Target61.getImplicitSetLabel("_\"hi!\"Context");
        java.lang.String str69 = python3Target61.getImplicitSetLabel("_tset");
        java.lang.String str71 = python3Target61.getImplicitSetLabel("\"\\\"Python3\\\"Context\"");
        int int72 = python3Target61.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar73 = null;
        int[] intArray74 = new int[] {};
        java.lang.String[] strArray75 = python3Target61.getTokenTypesAsTargetLabels(grammar73, intArray74);
        java.lang.String[] strArray76 = python3Target55.getTokenTypesAsTargetLabels(grammar59, intArray74);
        java.lang.String[] strArray77 = python3Target44.getTokenTypesAsTargetLabels(grammar53, intArray74);
        java.lang.String[] strArray78 = python3Target36.getTokenTypesAsTargetLabels(grammar42, intArray74);
        java.lang.String[] strArray79 = python3Target16.getTokenTypesAsTargetLabels(grammar34, intArray74);
        java.lang.String[] strArray80 = python3Target1.getTokenTypesAsTargetLabels(grammar14, intArray74);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"hi!\"Context" + "'", str9, "_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"_Python3\"" + "'", str11, "\"_Python3\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 64 + "'", int19 == 64);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "_tset\\\"hi!\\\"" + "'", str22, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"Python3\"Context" + "'", str26, "\"Python3\"Context");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(sTGroup28);
        org.junit.Assert.assertNotNull(sTGroup29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\\64" + "'", str32, "\\64");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Python3" + "'", str33, "Python3");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\".5.2.\"" + "'", str40, "\".5.2.\"");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 64 + "'", int45 == 64);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "_tset\"hi!\"" + "'", str47, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\\0" + "'", str49, "\\0");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "4.5.2.1" + "'", str50, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\"hi!\"" + "'", str52, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\"_Python3\"" + "'", str58, "\"_Python3\"");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 64 + "'", int62 == 64);
        org.junit.Assert.assertNotNull(strSet63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 64 + "'", int64 == 64);
        org.junit.Assert.assertNull(codeGenerator65);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "_tset_\"hi!\"Context" + "'", str67, "_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "_tset_tset" + "'", str69, "_tset_tset");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "_tset\"\\\"Python3\\\"Context\"" + "'", str71, "_tset\"\\\"Python3\\\"Context\"");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 29 + "'", int72 == 29);
        org.junit.Assert.assertNotNull(intArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray74), "[]");
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(strArray80);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\"hi!\"Context");
        java.lang.String str10 = python3Target1.getLanguage();
        java.lang.String str12 = python3Target1.getListLabel("_tset_\"hi!\"Context");
        java.lang.String str14 = python3Target1.getImplicitRuleLabel(" ");
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromString("\"_\\\"Python3\\\"\"Context", true);
        java.lang.String str19 = python3Target1.getListLabel("_\"\\\"hi!\\\"\"Context");
        boolean boolean20 = python3Target1.templatesExist();
        java.lang.String str22 = python3Target1.getTargetStringLiteralFromString("_tset_tsettset\\\"\\\"_\\\\\\\"Python3\\\\\\\"\\\"Context");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"hi!\"Context" + "'", str9, "_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python3" + "'", str10, "Python3");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_\"hi!\"Context" + "'", str12, "_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_ " + "'", str14, "_ ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\\\"_\\\\\\\"Python3\\\\\\\"\\\"Context\"" + "'", str17, "\"\\\"_\\\\\\\"Python3\\\\\\\"\\\"Context\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_\"\\\"hi!\\\"\"Context" + "'", str19, "_\"\\\"hi!\\\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"_tset_tsettset\\\\\\\"\\\\\\\"_\\\\\\\\\\\\\\\"Python3\\\\\\\\\\\\\\\"\\\\\\\"Context\"" + "'", str22, "\"_tset_tsettset\\\\\\\"\\\\\\\"_\\\\\\\\\\\\\\\"Python3\\\\\\\\\\\\\\\"\\\\\\\"Context\"");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getSerializedATNSegmentLimit();
        int int3 = python3Target1.getInlineTestSetWordSize();
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str6 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("_tset__tset", false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\0" + "'", str8, "\\0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset__tset" + "'", str11, "_tset__tset");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target1.getCodeGenerator();
        int int11 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str12 = python3Target1.getVersion();
        java.lang.String str13 = python3Target1.getVersion();
        boolean boolean14 = python3Target1.wantsBaseVisitor();
        int int15 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29 + "'", int11 == 29);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\"hi!\"");
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python3Target1.getVersion();
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"Context" + "'", str6, "\"hi!\"Context");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        boolean boolean10 = python3Target1.wantsBaseListener();
        java.lang.String str12 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str14 = python3Target1.getImplicitSetLabel("_");
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset_" + "'", str14, "_tset_");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str6 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getListLabel("tset\\\"hi!");
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "_tset_\"hi!\"Context", false);
        boolean boolean14 = python3Target1.supportsOverloadedMethods();
        java.lang.String str15 = python3Target1.getVersion();
        boolean boolean16 = python3Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "tset\\\"hi!" + "'", str8, "tset\\\"hi!");
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "tset_\\\"hi!\\\"Contex" + "'", str13, "tset_\\\"hi!\\\"Contex");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4.5.2.1" + "'", str15, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("", false);
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        java.lang.String str8 = python3Target1.getListLabel("\\0");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        java.lang.String str10 = python3Target1.getLanguage();
        org.antlr.v4.tool.Grammar grammar11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getTokenTypeAsTargetLabel(grammar11, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\0" + "'", str8, "\\0");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python3" + "'", str10, "Python3");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\"hi!\"Context");
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("_Python3");
        boolean boolean12 = python3Target1.wantsBaseListener();
        java.lang.String str13 = python3Target1.getLanguage();
        org.antlr.v4.tool.Grammar grammar14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getTokenTypeAsTargetLabel(grammar14, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"hi!\"Context" + "'", str9, "_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"_Python3\"" + "'", str11, "\"_Python3\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python3" + "'", str13, "Python3");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("Python3", true);
        java.lang.String str12 = python3Target1.getImplicitSetLabel("_tset\"tset\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"Python3\\\\\\\\\\\\\\\"Context\"");
        java.lang.String str14 = python3Target1.getImplicitRuleLabel("\"\\\"Python3\\\"Context\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        java.lang.String str18 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator15, "\\\\n", true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Python3\"" + "'", str10, "\"Python3\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_tset\"tset\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"Python3\\\\\\\\\\\\\\\"Context\"" + "'", str12, "_tset_tset\"tset\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"Python3\\\\\\\\\\\\\\\"Context\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_\"\\\"Python3\\\"Context\"" + "'", str14, "_\"\\\"Python3\\\"Context\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\\n\"" + "'", str18, "\"\\n\"");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator11);
        boolean boolean13 = python3Target12.supportsOverloadedMethods();
        java.lang.String str15 = python3Target12.getTargetStringLiteralFromString("_Python3");
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target18 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator17);
        int int19 = python3Target18.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet20 = python3Target18.getBadWords();
        int int21 = python3Target18.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = python3Target18.getCodeGenerator();
        java.lang.String str24 = python3Target18.getImplicitSetLabel("_\"hi!\"Context");
        java.lang.String str26 = python3Target18.getImplicitSetLabel("_tset");
        java.lang.String str28 = python3Target18.getImplicitSetLabel("\"\\\"Python3\\\"Context\"");
        int int29 = python3Target18.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar30 = null;
        int[] intArray31 = new int[] {};
        java.lang.String[] strArray32 = python3Target18.getTokenTypesAsTargetLabels(grammar30, intArray31);
        java.lang.String[] strArray33 = python3Target12.getTokenTypesAsTargetLabels(grammar16, intArray31);
        java.lang.String[] strArray34 = python3Target1.getTokenTypesAsTargetLabels(grammar10, intArray31);
        java.lang.String str37 = python3Target1.getTargetStringLiteralFromString("a", false);
        java.lang.String str38 = python3Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"hi!\"" + "'", str9, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"_Python3\"" + "'", str15, "\"_Python3\"");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 64 + "'", int19 == 64);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertNull(codeGenerator22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "_tset_\"hi!\"Context" + "'", str24, "_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "_tset_tset" + "'", str26, "_tset_tset");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "_tset\"\\\"Python3\\\"Context\"" + "'", str28, "_tset\"\\\"Python3\\\"Context\"");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 29 + "'", int29 == 29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[]");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "a" + "'", str37, "a");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Python3" + "'", str38, "Python3");
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\"hi!\"");
        boolean boolean7 = python3Target1.templatesExist();
        int int8 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.getTemplates();
        java.lang.String str12 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, ".5.2.", true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"Context" + "'", str6, "\"hi!\"Context");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"5.2\"" + "'", str16, "\"5.2\"");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getImplicitTokenLabel("__\\nContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNotNull(sTGroup6);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        boolean boolean6 = python3Target1.templatesExist();
        java.lang.String str8 = python3Target1.getListLabel("_tset__\"\\\"_\\\"hi!\\\"Contex\"ContextContext");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getRuleFunctionContextStructName(ruleFunction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset__\"\\\"_\\\"hi!\\\"Contex\"ContextContext" + "'", str8, "_tset__\"\\\"_\\\"hi!\\\"Contex\"ContextContext");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getListLabel("\"_Python3\"");
        int int5 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_\\nContext");
        java.lang.String str9 = python3Target1.getListLabel("\"_\"Context");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 29 + "'", int5 == 29);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_\\\\nContext\"" + "'", str7, "\"_\\\\nContext\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"_\"Context" + "'", str9, "\"_\"Context");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("Python3");
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromString("\"hi!\"", true);
        boolean boolean13 = python3Target1.templatesExist();
        boolean boolean14 = python3Target1.supportsOverloadedMethods();
        int int15 = python3Target1.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.encodeIntAsCharEscape((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_Python3" + "'", str9, "_Python3");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str12, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getLanguage();
        boolean boolean6 = python3Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset_\"Python3\"Context", true);
        java.lang.String str12 = python3Target1.getImplicitRuleLabel("tset\\\"\\\"_\\\\\\\"Python3\\\\\\\"\\\"Context");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"tset_\\\"Python3\\\"Contex\"" + "'", str10, "\"tset_\\\"Python3\\\"Contex\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset\\\"\\\"_\\\\\\\"Python3\\\\\\\"\\\"Context" + "'", str12, "_tset\\\"\\\"_\\\\\\\"Python3\\\\\\\"\\\"Context");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target1.getTemplates();
        java.lang.String str13 = python3Target1.encodeIntAsCharEscape((int) (short) 100);
        java.lang.String str14 = python3Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "d" + "'", str13, "d");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python3" + "'", str14, "Python3");
        org.junit.Assert.assertNotNull(sTGroup15);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.getTemplates();
        boolean boolean7 = python3Target1.wantsBaseListener();
        boolean boolean8 = python3Target1.wantsBaseListener();
        java.lang.String str10 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str12 = python3Target1.getImplicitSetLabel("\\35");
        boolean boolean13 = python3Target1.wantsBaseVisitor();
        int int14 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\0" + "'", str10, "\\0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset\\35" + "'", str12, "_tset\\35");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str6 = python3Target1.getImplicitSetLabel("_tset_\"hi!\"Context");
        java.lang.String str8 = python3Target1.getListLabel("_tsettset\\\"hi!");
        java.lang.String str10 = python3Target1.getAltLabelContextStructName("\"\\\"_Python3\\\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet12 = python3Target1.getBadWords();
        java.lang.String str14 = python3Target1.getImplicitSetLabel("\"\\\"\\\\\\\"hi!\\\\\\\"\\\"Context\"");
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromString("\"4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset_tset_\"hi!\"Context" + "'", str6, "_tset_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsettset\\\"hi!" + "'", str8, "_tsettset\\\"hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"_Python3\\\"\"Context" + "'", str10, "\"\\\"_Python3\\\"\"Context");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"Context\"" + "'", str14, "_tset\"\\\"\\\\\\\"hi!\\\\\\\"\\\"Context\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\\"4.5.2.1\\\"\"" + "'", str16, "\"\\\"4.5.2.1\\\"\"");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("\"\\\"hi!\\\"\"Context", false);
        java.lang.String str13 = python3Target1.getListLabel("_\"Python3\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "_tsettset_\\\"hi!\\\"Contex", false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\\"\\\\\\\"hi!\\\\\\\"\\\"Context" + "'", str11, "\\\"\\\\\\\"hi!\\\\\\\"\\\"Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_\"Python3\"" + "'", str13, "_\"Python3\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "tsettset_\\\"hi!\\\"Conte" + "'", str17, "tsettset_\\\"hi!\\\"Conte");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        boolean boolean11 = python3Target1.wantsBaseVisitor();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("\"_Python3\"");
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("\"_\\\"\\\"_\\\"hi!\\\"Contex\\\"Contex\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.encodeIntAsCharEscape((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"_Python3\\\"\"" + "'", str13, "\"\\\"_Python3\\\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"_\\\\\\\"\\\\\\\"_\\\\\\\"hi!\\\\\\\"Contex\\\\\\\"Contex\\\"\"" + "'", str15, "\"\\\"_\\\\\\\"\\\\\\\"_\\\\\\\"hi!\\\\\\\"Contex\\\\\\\"Contex\\\"\"");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        boolean boolean4 = python3Target1.wantsBaseListener();
        java.lang.String str6 = python3Target1.getImplicitSetLabel("__\\nContext");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset__\\nContext" + "'", str6, "_tset__\\nContext");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "4.5.2.1", true);
        java.lang.String str6 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("\"\\\"_\\\"hi!\\\"Contex\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        int int10 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str12 = python3Target1.getAltLabelContextStructName("__Python3Contex");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\".5.2.\"" + "'", str5, "\".5.2.\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_\"\\\"_\\\"hi!\\\"Contex\"" + "'", str8, "_\"\\\"_\\\"hi!\\\"Contex\"");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "__Python3ContexContext" + "'", str12, "__Python3ContexContext");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"Python3\"");
        boolean boolean12 = python3Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup14 = python3Target1.getTemplates();
        java.util.Set<java.lang.String> strSet15 = python3Target1.getBadWords();
        java.lang.String str17 = python3Target1.encodeIntAsCharEscape((int) '4');
        java.lang.String str18 = python3Target1.getLanguage();
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target21 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator20);
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        java.lang.String str25 = python3Target21.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator22, "4.5.2.1", true);
        boolean boolean26 = python3Target21.templatesExist();
        org.antlr.v4.tool.Grammar grammar27 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator28 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target29 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator28);
        int int30 = python3Target29.getInlineTestSetWordSize();
        java.lang.String str32 = python3Target29.getImplicitSetLabel("\"hi!\"");
        java.lang.String str34 = python3Target29.encodeIntAsCharEscape(0);
        java.lang.String str35 = python3Target29.getVersion();
        java.lang.String str37 = python3Target29.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.tool.Grammar grammar38 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator39 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target40 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator39);
        boolean boolean41 = python3Target40.supportsOverloadedMethods();
        java.lang.String str43 = python3Target40.getTargetStringLiteralFromString("_Python3");
        org.antlr.v4.tool.Grammar grammar44 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator45 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target46 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator45);
        int int47 = python3Target46.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet48 = python3Target46.getBadWords();
        int int49 = python3Target46.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator50 = python3Target46.getCodeGenerator();
        java.lang.String str52 = python3Target46.getImplicitSetLabel("_\"hi!\"Context");
        java.lang.String str54 = python3Target46.getImplicitSetLabel("_tset");
        java.lang.String str56 = python3Target46.getImplicitSetLabel("\"\\\"Python3\\\"Context\"");
        int int57 = python3Target46.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar58 = null;
        int[] intArray59 = new int[] {};
        java.lang.String[] strArray60 = python3Target46.getTokenTypesAsTargetLabels(grammar58, intArray59);
        java.lang.String[] strArray61 = python3Target40.getTokenTypesAsTargetLabels(grammar44, intArray59);
        java.lang.String[] strArray62 = python3Target29.getTokenTypesAsTargetLabels(grammar38, intArray59);
        java.lang.String[] strArray63 = python3Target21.getTokenTypesAsTargetLabels(grammar27, intArray59);
        java.lang.String[] strArray64 = python3Target1.getTokenTypesAsTargetLabels(grammar19, intArray59);
        java.lang.String str65 = python3Target1.getLanguage();
        java.lang.String str66 = python3Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"Python3\"Context" + "'", str11, "\"Python3\"Context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\64" + "'", str17, "\\64");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python3" + "'", str18, "Python3");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\".5.2.\"" + "'", str25, "\".5.2.\"");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 64 + "'", int30 == 64);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "_tset\"hi!\"" + "'", str32, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\\0" + "'", str34, "\\0");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "4.5.2.1" + "'", str35, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\"hi!\"" + "'", str37, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\"_Python3\"" + "'", str43, "\"_Python3\"");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 64 + "'", int47 == 64);
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 64 + "'", int49 == 64);
        org.junit.Assert.assertNull(codeGenerator50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "_tset_\"hi!\"Context" + "'", str52, "_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "_tset_tset" + "'", str54, "_tset_tset");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "_tset\"\\\"Python3\\\"Context\"" + "'", str56, "_tset\"\\\"Python3\\\"Context\"");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 29 + "'", int57 == 29);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[]");
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Python3" + "'", str65, "Python3");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Python3" + "'", str66, "Python3");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.templatesExist();
        int int10 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromString("_tsettset\\\"hi!");
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getLoopLabel(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_tsettset\\\\\\\"hi!\"" + "'", str12, "\"_tsettset\\\\\\\"hi!\"");
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\"tset\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"Python3\\\\\\\\\\\\\\\"Context\"");
        java.lang.Class<?> wildcardClass7 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\"tset\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"Python3\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"Context\\\"\"" + "'", str6, "\"\\\"tset\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"Python3\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"Context\\\"\"");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.templatesExist();
        java.lang.String str11 = python3Target1.getListLabel("\"hi!\"Context");
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromString("\"\\\"_\\\\\\\"Python3\\\\\\\"\\\"Context\"", true);
        boolean boolean18 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"hi!\"Context" + "'", str11, "\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"4.5.2.1\"" + "'", str14, "\"4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\\\"\\\\\\\"_\\\\\\\\\\\\\\\"Python3\\\\\\\\\\\\\\\"\\\\\\\"Context\\\"\"" + "'", str17, "\"\\\"\\\\\\\"_\\\\\\\\\\\\\\\"Python3\\\\\\\\\\\\\\\"\\\\\\\"Context\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.encodeIntAsCharEscape(100);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\\0Context", true);
        boolean boolean13 = python3Target1.wantsBaseVisitor();
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromString("\"\\\"hi!\\\"\"Context", true);
        java.lang.String str18 = python3Target1.getImplicitRuleLabel("_tset_\"Python3\"");
        boolean boolean19 = python3Target1.wantsBaseListener();
        java.lang.String str21 = python3Target1.getTargetStringLiteralFromString("\"tset\\\"_Python3\"");
        int int22 = python3Target1.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup23 = python3Target1.getTemplates();
        java.lang.String str25 = python3Target1.getImplicitRuleLabel("_\"_\\\\0Context\"");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"0Contex\"" + "'", str12, "\"0Contex\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\\"\\\\\\\"hi!\\\\\\\"\\\"Context\"" + "'", str16, "\"\\\"\\\\\\\"hi!\\\\\\\"\\\"Context\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "__tset_\"Python3\"" + "'", str18, "__tset_\"Python3\"");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"\\\"tset\\\\\\\"_Python3\\\"\"" + "'", str21, "\"\\\"tset\\\\\\\"_Python3\\\"\"");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 29 + "'", int22 == 29);
        org.junit.Assert.assertNotNull(sTGroup23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "__\"_\\\\0Context\"" + "'", str25, "__\"_\\\\0Context\"");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getImplicitSetLabel("_\"hi!\"Context");
        java.lang.String str9 = python3Target1.getImplicitSetLabel("_tset");
        java.lang.String str11 = python3Target1.getImplicitSetLabel("\"\\\"Python3\\\"Context\"");
        java.lang.Class<?> wildcardClass12 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset_\"hi!\"Context" + "'", str7, "_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset_tset" + "'", str9, "_tset_tset");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset\"\\\"Python3\\\"Context\"" + "'", str11, "_tset\"\\\"Python3\\\"Context\"");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("hi!");
        boolean boolean10 = python3Target1.templatesExist();
        java.lang.String str12 = python3Target1.getImplicitRuleLabel("tset_\\\"hi!\\\"Contex");
        java.lang.String str14 = python3Target1.encodeIntAsCharEscape(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"hi!\"" + "'", str9, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_\\\"hi!\\\"Contex" + "'", str12, "_tset_\\\"hi!\\\"Contex");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\0" + "'", str14, "\\0");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "4.5.2.1", true);
        java.lang.String str6 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("\"\\\"_\\\"hi!\\\"Contex\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        int int10 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Rule rule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getRuleFunctionContextStructName(rule11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\".5.2.\"" + "'", str5, "\".5.2.\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_\"\\\"_\\\"hi!\\\"Contex\"" + "'", str8, "_\"\\\"_\\\"hi!\\\"Contex\"");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\"hi!\"Context");
        java.lang.String str10 = python3Target1.getLanguage();
        boolean boolean11 = python3Target1.wantsBaseListener();
        java.lang.String str12 = python3Target1.getLanguage();
        java.lang.String str14 = python3Target1.getImplicitSetLabel("_tset__\"\\\"_\\\"hi!\\\"Contex\"ContextContext");
        java.lang.String str15 = python3Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"hi!\"Context" + "'", str9, "_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python3" + "'", str10, "Python3");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Python3" + "'", str12, "Python3");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset_tset__\"\\\"_\\\"hi!\\\"Contex\"ContextContext" + "'", str14, "_tset_tset__\"\\\"_\\\"hi!\\\"Contex\"ContextContext");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python3" + "'", str15, "Python3");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getListLabel("\"_Python3\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str6 = python3Target1.getVersion();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\"hi!\"Context");
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("_Python3");
        java.lang.String str12 = python3Target1.getVersion();
        boolean boolean13 = python3Target1.supportsOverloadedMethods();
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromString("\"\\\"\\\\\\\"Python3\\\\\\\"Context\\\"\"", true);
        java.lang.String str18 = python3Target1.encodeIntAsCharEscape(29);
        int int19 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"hi!\"Context" + "'", str9, "_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"_Python3\"" + "'", str11, "\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"Python3\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\"" + "'", str16, "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"Python3\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\\35" + "'", str18, "\\35");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 29 + "'", int19 == 29);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        int int8 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python3Target1.getImplicitRuleLabel("_tset_\"hi!\"ContextContext");
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass12 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "__tset_\"hi!\"ContextContext" + "'", str10, "__tset_\"hi!\"ContextContext");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getListLabel("\"_Python3\"");
        int int5 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet7 = python3Target1.getBadWords();
        java.lang.String str9 = python3Target1.getImplicitSetLabel("_tset\"\\\"_Python3\\\"\"");
        java.lang.String str11 = python3Target1.getImplicitSetLabel("__\\0Context");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset_tset\"\\\"_Python3\\\"\"" + "'", str9, "_tset_tset\"\\\"_Python3\\\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset__\\0Context" + "'", str11, "_tset__\\0Context");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("Python3");
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromString("\"hi!\"", true);
        int int13 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str14 = python3Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target1.getTemplates();
        boolean boolean16 = python3Target1.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python3Target1.getElementName("_tset\"\\\"_Python3\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_Python3" + "'", str9, "_Python3");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str12, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29 + "'", int13 == 29);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python3" + "'", str14, "Python3");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.getTemplates();
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "tset\\\"hi!", false);
        java.lang.String str13 = python3Target1.getListLabel("_tset_\\\"hi!\\\"Contex");
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "#", false);
        int int18 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str20 = python3Target1.encodeIntAsCharEscape(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "set\\\"hi" + "'", str11, "set\\\"hi");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_tset_\\\"hi!\\\"Contex" + "'", str13, "_tset_\\\"hi!\\\"Contex");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\\1" + "'", str20, "\\1");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getAltLabelContextStructName("\"hi!\"ContextContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"hi!\"ContextContextContext" + "'", str7, "\"hi!\"ContextContextContext");
        org.junit.Assert.assertNull(codeGenerator8);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.templatesExist();
        java.lang.String str11 = python3Target1.getListLabel("\"hi!\"Context");
        boolean boolean12 = python3Target1.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        java.util.Set<java.lang.String> strSet14 = python3Target1.getBadWords();
        java.lang.String str16 = python3Target1.encodeIntAsCharEscape((int) (short) 0);
        java.lang.String str18 = python3Target1.getListLabel("_tset_tset\\\\\\\"\\\\\\\"Python3\\\\\\\"Context");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"hi!\"Context" + "'", str11, "\"hi!\"Context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\\0" + "'", str16, "\\0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset_tset\\\\\\\"\\\\\\\"Python3\\\\\\\"Context" + "'", str18, "_tset_tset\\\\\\\"\\\\\\\"Python3\\\\\\\"Context");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getLanguage();
        boolean boolean6 = python3Target1.templatesExist();
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        java.lang.String str9 = python3Target1.getAltLabelContextStructName("\"Tset\\\\\\\"hi!Context\"");
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromString("\"\\\"tset_\\\\\\\"\\\\\\\"tset\\\\\\\\\\\\\\\"_Python3\\\\\\\"\\\"\"", false);
        java.lang.String str14 = python3Target1.getImplicitSetLabel("_tset\"\\\"_\\\"hi!\\\"Contex\"");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"Tset\\\\\\\"hi!Context\"Context" + "'", str9, "\"Tset\\\\\\\"hi!Context\"Context");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\\"\\\\\\\"tset_\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"tset\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"_Python3\\\\\\\\\\\\\\\"\\\\\\\"\\\"" + "'", str12, "\\\"\\\\\\\"tset_\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"tset\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"_Python3\\\\\\\\\\\\\\\"\\\\\\\"\\\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset_tset\"\\\"_\\\"hi!\\\"Contex\"" + "'", str14, "_tset_tset\"\\\"_\\\"hi!\\\"Contex\"");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("\\n");
        java.lang.String str10 = python3Target1.getAltLabelContextStructName("\"set\\\\\\\"hi\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\nContext" + "'", str8, "\\nContext");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"set\\\\\\\"hi\"Context" + "'", str10, "\"set\\\\\\\"hi\"Context");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\"hi!\"");
        java.lang.String str7 = python3Target1.getVersion();
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet9 = python3Target1.getBadWords();
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("_tset", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target17 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator16);
        int int18 = python3Target17.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet19 = python3Target17.getBadWords();
        int int20 = python3Target17.getInlineTestSetWordSize();
        java.lang.String str23 = python3Target17.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = python3Target17.getCodeGenerator();
        boolean boolean25 = python3Target17.templatesExist();
        org.antlr.v4.tool.Grammar grammar26 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target28 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator27);
        int int29 = python3Target28.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet30 = python3Target28.getBadWords();
        int int31 = python3Target28.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = python3Target28.getCodeGenerator();
        java.lang.String str34 = python3Target28.getImplicitSetLabel("_\"hi!\"Context");
        java.lang.String str36 = python3Target28.getImplicitSetLabel("_tset");
        java.lang.String str38 = python3Target28.getImplicitSetLabel("\"\\\"Python3\\\"Context\"");
        int int39 = python3Target28.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar40 = null;
        int[] intArray41 = new int[] {};
        java.lang.String[] strArray42 = python3Target28.getTokenTypesAsTargetLabels(grammar40, intArray41);
        java.lang.String[] strArray43 = python3Target17.getTokenTypesAsTargetLabels(grammar26, intArray41);
        java.lang.String[] strArray44 = python3Target1.getTokenTypesAsTargetLabels(grammar15, intArray41);
        boolean boolean45 = python3Target1.wantsBaseVisitor();
        java.lang.String str48 = python3Target1.getTargetStringLiteralFromString("_tsethi!\\\\\\\"Contex", true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"Context" + "'", str6, "\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"_tset\"" + "'", str13, "\"_tset\"");
        org.junit.Assert.assertNull(codeGenerator14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 64 + "'", int20 == 64);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "_tset\\\"hi!\\\"" + "'", str23, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 64 + "'", int29 == 64);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 64 + "'", int31 == 64);
        org.junit.Assert.assertNull(codeGenerator32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "_tset_\"hi!\"Context" + "'", str34, "_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "_tset_tset" + "'", str36, "_tset_tset");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "_tset\"\\\"Python3\\\"Context\"" + "'", str38, "_tset\"\\\"Python3\\\"Context\"");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 29 + "'", int39 == 29);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[]");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\"_tsethi!\\\\\\\\\\\\\\\"Contex\"" + "'", str48, "\"_tsethi!\\\\\\\\\\\\\\\"Contex\"");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"Python3\"");
        boolean boolean12 = python3Target1.wantsBaseListener();
        boolean boolean13 = python3Target1.templatesExist();
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromString("", true);
        java.lang.String str17 = python3Target1.getLanguage();
        java.lang.String str19 = python3Target1.getImplicitRuleLabel("0Contex");
        java.util.Set<java.lang.String> strSet20 = python3Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"Python3\"Context" + "'", str11, "\"Python3\"Context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"" + "'", str16, "\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Python3" + "'", str17, "Python3");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_0Contex" + "'", str19, "_0Contex");
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getListLabel("\"_Python3\"");
        int int5 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getLoopLabel(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("hi!");
        java.lang.String str11 = python3Target1.getImplicitSetLabel("_tset\".5.2.\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getLoopLabel(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"hi!\"" + "'", str9, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset_tset\".5.2.\"" + "'", str11, "_tset_tset\".5.2.\"");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("hi!");
        java.lang.String str11 = python3Target1.getListLabel("");
        java.lang.String str12 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "_tset_tset_\"hi!\"Context", false);
        org.stringtemplate.v4.STGroup sTGroup17 = python3Target1.getTemplates();
        java.util.Set<java.lang.String> strSet18 = python3Target1.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python3Target1.getImplicitTokenLabel("_tset_\\\\\\\"hi!\\\\\\\"ContexContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"hi!\"" + "'", str9, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "tset_tset_\\\"hi!\\\"Contex" + "'", str16, "tset_tset_\\\"hi!\\\"Contex");
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\"hi!\"");
        java.lang.String str7 = python3Target1.getVersion();
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet9 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target1.getCodeGenerator();
        java.lang.String str12 = python3Target1.getAltLabelContextStructName("\"\\\"tset_\\\\\\\"Python3\\\\\\\"Contex\\\"\"");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"Context" + "'", str6, "\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"tset_\\\\\\\"Python3\\\\\\\"Contex\\\"\"Context" + "'", str12, "\"\\\"tset_\\\\\\\"Python3\\\\\\\"Contex\\\"\"Context");
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("", false);
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "__\"hi!\"Context", true);
        java.lang.String str12 = python3Target1.getImplicitRuleLabel("Et\\\"hContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "_tset\"_Python3\"", true);
        java.lang.String str18 = python3Target1.getTargetStringLiteralFromString("tset\\\\\\\"\\\\\\\"Python3\\\\\\\"Context");
        java.lang.String str20 = python3Target1.getTargetStringLiteralFromString("\"\\\"_tset_\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"Contex\\\\\\\\\\\\\\\"Context\\\"\"");
        int int21 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_\\\"hi!\\\"Contex\"" + "'", str10, "\"_\\\"hi!\\\"Contex\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_Et\\\"hContext" + "'", str12, "_Et\\\"hContext");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"tset\\\"_Python3\"" + "'", str16, "\"tset\\\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"tset\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"Python3\\\\\\\\\\\\\\\"Context\"" + "'", str18, "\"tset\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"Python3\\\\\\\\\\\\\\\"Context\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\\\"\\\\\\\"_tset_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"Contex\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\"" + "'", str20, "\"\\\"\\\\\\\"_tset_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"Contex\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "\"hi!\"", true);
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("\"tset_\\\\\\\"hi!\\\\\\\"Contex\"Context");
        boolean boolean10 = python3Target1.templatesExist();
        boolean boolean11 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"hi!\"" + "'", str7, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"tset_\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"Contex\\\"Context\"" + "'", str9, "\"\\\"tset_\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"Contex\\\"Context\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getLanguage();
        java.lang.String str13 = python3Target1.getImplicitRuleLabel("\"\\\".5.2.\\\"Context\"");
        boolean boolean14 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python3" + "'", str11, "Python3");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_\"\\\".5.2.\\\"Context\"" + "'", str13, "_\"\\\".5.2.\\\"Context\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target1.getCodeGenerator();
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape((int) (short) 10);
        java.util.Set<java.lang.String> strSet7 = python3Target1.getBadWords();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\n" + "'", str6, "\\n");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_4.5.2.1" + "'", str9, "_4.5.2.1");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_Python3");
        int int8 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean9 = python3Target1.wantsBaseListener();
        java.lang.String str11 = python3Target1.getImplicitSetLabel("tset_\\\"hi!\\\"Contex");
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_Python3\"" + "'", str7, "\"_Python3\"");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tsettset_\\\"hi!\\\"Contex" + "'", str11, "_tsettset_\\\"hi!\\\"Contex");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"Python3\"");
        boolean boolean12 = python3Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup14 = python3Target1.getTemplates();
        java.util.Set<java.lang.String> strSet15 = python3Target1.getBadWords();
        java.lang.String str17 = python3Target1.encodeIntAsCharEscape((int) '4');
        int int18 = python3Target1.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup19 = python3Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"Python3\"Context" + "'", str11, "\"Python3\"Context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\64" + "'", str17, "\\64");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 29 + "'", int18 == 29);
        org.junit.Assert.assertNotNull(sTGroup19);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\"hi!\"Context");
        java.lang.String str10 = python3Target1.getLanguage();
        java.lang.String str12 = python3Target1.getListLabel("_tset_\"hi!\"Context");
        java.lang.String str14 = python3Target1.getImplicitRuleLabel(" ");
        java.lang.String str16 = python3Target1.getImplicitSetLabel("_tset\".5.2.\"");
        java.lang.String str18 = python3Target1.getAltLabelContextStructName("\"\\\"_\\\\\\\"Python3\\\\\\\"\\\"Context\"");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"hi!\"Context" + "'", str9, "_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python3" + "'", str10, "Python3");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_\"hi!\"Context" + "'", str12, "_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_ " + "'", str14, "_ ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_tset_tset\".5.2.\"" + "'", str16, "_tset_tset\".5.2.\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\\\"_\\\\\\\"Python3\\\\\\\"\\\"Context\"Context" + "'", str18, "\"\\\"_\\\\\\\"Python3\\\\\\\"\\\"Context\"Context");
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\"hi!\"");
        boolean boolean7 = python3Target1.templatesExist();
        boolean boolean8 = python3Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"Context" + "'", str6, "\"hi!\"Context");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        boolean boolean8 = python3Target1.templatesExist();
        java.lang.String str9 = python3Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getLoopCounter(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getImplicitSetLabel("_\"hi!\"Context");
        java.lang.String str9 = python3Target1.getImplicitSetLabel("_tset");
        boolean boolean10 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "\"\\\"\\\\\\\\35\\\"\"", true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset_\"hi!\"Context" + "'", str7, "_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset_tset" + "'", str9, "_tset_tset");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"\\\\\\\\35\\\"\"" + "'", str14, "\"\\\"\\\\\\\\35\\\"\"");
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.getTemplates();
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        java.lang.String str9 = python3Target1.encodeIntAsCharEscape((int) '#');
        java.lang.String str11 = python3Target1.encodeIntAsCharEscape((int) '#');
        boolean boolean12 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target15 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator14);
        int int16 = python3Target15.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet17 = python3Target15.getBadWords();
        int int18 = python3Target15.getInlineTestSetWordSize();
        java.lang.String str21 = python3Target15.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        boolean boolean22 = python3Target15.supportsOverloadedMethods();
        java.lang.String str25 = python3Target15.getTargetStringLiteralFromString("\"\\\"hi!\\\"\"Context", false);
        org.antlr.v4.tool.Grammar grammar26 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target28 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator27);
        int int29 = python3Target28.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet30 = python3Target28.getBadWords();
        int int31 = python3Target28.getInlineTestSetWordSize();
        java.lang.String str33 = python3Target28.getAltLabelContextStructName("\"hi!\"");
        boolean boolean34 = python3Target28.templatesExist();
        int int35 = python3Target28.getSerializedATNSegmentLimit();
        boolean boolean36 = python3Target28.wantsBaseVisitor();
        java.lang.String str38 = python3Target28.getAltLabelContextStructName("\"\\\"hi!\\\"\"");
        java.lang.String str40 = python3Target28.getImplicitRuleLabel("tset_\\\"hi!\\\"Contex");
        org.antlr.v4.tool.Grammar grammar41 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target43 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator42);
        int int44 = python3Target43.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet45 = python3Target43.getBadWords();
        int int46 = python3Target43.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator47 = python3Target43.getCodeGenerator();
        java.lang.String str49 = python3Target43.getImplicitSetLabel("_\"hi!\"Context");
        java.lang.String str51 = python3Target43.getImplicitSetLabel("_tset");
        java.lang.String str53 = python3Target43.getImplicitSetLabel("\"\\\"Python3\\\"Context\"");
        int int54 = python3Target43.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar55 = null;
        int[] intArray56 = new int[] {};
        java.lang.String[] strArray57 = python3Target43.getTokenTypesAsTargetLabels(grammar55, intArray56);
        java.lang.String[] strArray58 = python3Target28.getTokenTypesAsTargetLabels(grammar41, intArray56);
        java.lang.String[] strArray59 = python3Target15.getTokenTypesAsTargetLabels(grammar26, intArray56);
        java.lang.String[] strArray60 = python3Target1.getTokenTypesAsTargetLabels(grammar13, intArray56);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#" + "'", str9, "#");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#" + "'", str11, "#");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "_tset\\\"hi!\\\"" + "'", str21, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\\\"\\\\\\\"hi!\\\\\\\"\\\"Context" + "'", str25, "\\\"\\\\\\\"hi!\\\\\\\"\\\"Context");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 64 + "'", int29 == 64);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 64 + "'", int31 == 64);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"hi!\"Context" + "'", str33, "\"hi!\"Context");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 29 + "'", int35 == 29);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\"\\\"hi!\\\"\"Context" + "'", str38, "\"\\\"hi!\\\"\"Context");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "_tset_\\\"hi!\\\"Contex" + "'", str40, "_tset_\\\"hi!\\\"Contex");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 64 + "'", int44 == 64);
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 64 + "'", int46 == 64);
        org.junit.Assert.assertNull(codeGenerator47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "_tset_\"hi!\"Context" + "'", str49, "_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "_tset_tset" + "'", str51, "_tset_tset");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "_tset\"\\\"Python3\\\"Context\"" + "'", str53, "_tset\"\\\"Python3\\\"Context\"");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 29 + "'", int54 == 29);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[]");
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(strArray60);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"Python3\"");
        java.lang.String str13 = python3Target1.getImplicitRuleLabel("");
        java.lang.String str15 = python3Target1.getListLabel("");
        java.lang.String str17 = python3Target1.getImplicitRuleLabel("_tsettset\\\"hi!Context");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target1.getRuleFunctionContextStructName(ruleFunction18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"Python3\"Context" + "'", str11, "\"Python3\"Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_" + "'", str13, "_");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "__tsettset\\\"hi!Context" + "'", str17, "__tsettset\\\"hi!Context");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("\"\\\"hi!\\\"\"Context", false);
        boolean boolean12 = python3Target1.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\\"\\\\\\\"hi!\\\\\\\"\\\"Context" + "'", str11, "\\\"\\\\\\\"hi!\\\\\\\"\\\"Context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(sTGroup13);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("", false);
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "__\"hi!\"Context", true);
        java.lang.String str12 = python3Target1.getImplicitRuleLabel("Et\\\"hContext");
        boolean boolean13 = python3Target1.wantsBaseListener();
        boolean boolean14 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_\\\"hi!\\\"Contex\"" + "'", str10, "\"_\\\"hi!\\\"Contex\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_Et\\\"hContext" + "'", str12, "_Et\\\"hContext");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        boolean boolean4 = python3Target1.wantsBaseListener();
        boolean boolean5 = python3Target1.wantsBaseListener();
        int int6 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("\\\"_\\\\\\\"Python3\\\\\\\"\\\"");
        boolean boolean9 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 29 + "'", int6 == 29);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_\\\"_\\\\\\\"Python3\\\\\\\"\\\"" + "'", str8, "_\\\"_\\\\\\\"Python3\\\\\\\"\\\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\"hi!\"Context");
        java.lang.String str10 = python3Target1.getLanguage();
        java.lang.String str12 = python3Target1.getListLabel("_tset_\"hi!\"Context");
        java.lang.String str14 = python3Target1.getImplicitRuleLabel(" ");
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromString("\"_\\\"Python3\\\"\"Context", true);
        java.lang.String str19 = python3Target1.getListLabel("_\"\\\"hi!\\\"\"Context");
        java.lang.String str21 = python3Target1.getImplicitRuleLabel("\"hi!\"ContextContext");
        java.lang.String str22 = python3Target1.getVersion();
        java.lang.String str23 = python3Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = python3Target1.getImplicitTokenLabel("\"\\\"\\\\\\\"tse\\\\\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"hi!\"Context" + "'", str9, "_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python3" + "'", str10, "Python3");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_\"hi!\"Context" + "'", str12, "_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_ " + "'", str14, "_ ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\\\"_\\\\\\\"Python3\\\\\\\"\\\"Context\"" + "'", str17, "\"\\\"_\\\\\\\"Python3\\\\\\\"\\\"Context\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_\"\\\"hi!\\\"\"Context" + "'", str19, "_\"\\\"hi!\\\"\"Context");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "_\"hi!\"ContextContext" + "'", str21, "_\"hi!\"ContextContext");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4.5.2.1" + "'", str22, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "4.5.2.1" + "'", str23, "4.5.2.1");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.templatesExist();
        java.lang.String str11 = python3Target1.getListLabel("\"hi!\"Context");
        java.lang.String str13 = python3Target1.getListLabel("Python3");
        boolean boolean14 = python3Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        java.lang.String str18 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator15, "", true);
        java.lang.String str20 = python3Target1.encodeIntAsCharEscape((int) (byte) 10);
        java.lang.String str22 = python3Target1.getListLabel("\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"Context\"");
        java.lang.String str24 = python3Target1.getListLabel("tset_tset_\\\"hi!\\\"Contex");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"hi!\"Context" + "'", str11, "\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python3" + "'", str13, "Python3");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\"" + "'", str18, "\"\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\\n" + "'", str20, "\\n");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"Context\"" + "'", str22, "\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"Context\"");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "tset_tset_\\\"hi!\\\"Contex" + "'", str24, "tset_tset_\\\"hi!\\\"Contex");
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("", false);
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        java.lang.String str8 = python3Target1.getListLabel("\\0");
        int int9 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "\"_\\\\0Context\"", false);
        boolean boolean14 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\0" + "'", str8, "\\0");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_\\\\0Context" + "'", str13, "_\\\\0Context");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("", false);
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "__\"hi!\"Context", true);
        java.lang.String str12 = python3Target1.getImplicitRuleLabel("Et\\\"hContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "_tset\"_Python3\"", true);
        java.lang.String str18 = python3Target1.getTargetStringLiteralFromString("tset\\\\\\\"\\\\\\\"Python3\\\\\\\"Context");
        java.lang.String str20 = python3Target1.getTargetStringLiteralFromString("\"\\\"_tset_\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"Contex\\\\\\\\\\\\\\\"Context\\\"\"");
        java.lang.String str23 = python3Target1.getTargetStringLiteralFromString("\"tset_\\\"Python3\\\"Contex\"", false);
        java.lang.String str25 = python3Target1.getListLabel("_\\\"hi!\\\"Contex");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_\\\"hi!\\\"Contex\"" + "'", str10, "\"_\\\"hi!\\\"Contex\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_Et\\\"hContext" + "'", str12, "_Et\\\"hContext");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"tset\\\"_Python3\"" + "'", str16, "\"tset\\\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"tset\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"Python3\\\\\\\\\\\\\\\"Context\"" + "'", str18, "\"tset\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"Python3\\\\\\\\\\\\\\\"Context\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\\\"\\\\\\\"_tset_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"Contex\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\"" + "'", str20, "\"\\\"\\\\\\\"_tset_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"Contex\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\\\"tset_\\\\\\\"Python3\\\\\\\"Contex\\\"" + "'", str23, "\\\"tset_\\\\\\\"Python3\\\\\\\"Contex\\\"");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "_\\\"hi!\\\"Contex" + "'", str25, "_\\\"hi!\\\"Contex");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.templatesExist();
        java.lang.String str11 = python3Target1.getListLabel("\"hi!\"Context");
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromString("\"\\\"_\\\\\\\"Python3\\\\\\\"\\\"Context\"", true);
        java.lang.Class<?> wildcardClass18 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"hi!\"Context" + "'", str11, "\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"4.5.2.1\"" + "'", str14, "\"4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\\\"\\\\\\\"_\\\\\\\\\\\\\\\"Python3\\\\\\\\\\\\\\\"\\\\\\\"Context\\\"\"" + "'", str17, "\"\\\"\\\\\\\"_\\\\\\\\\\\\\\\"Python3\\\\\\\\\\\\\\\"\\\\\\\"Context\\\"\"");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getSerializedATNSegmentLimit();
        int int3 = python3Target1.getInlineTestSetWordSize();
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str6 = python3Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getElementListName("_tset_tset\"\\\"hi!\\\"\"ContextContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "4.5.2.1", true);
        java.lang.String str6 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("\"\\\"_\\\"hi!\\\"Contex\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        int int10 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "_tset\\\"hi!\\\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.getLoopCounter(grammarAST16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\".5.2.\"" + "'", str5, "\".5.2.\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_\"\\\"_\\\"hi!\\\"Contex\"" + "'", str8, "_\"\\\"_\\\"hi!\\\"Contex\"");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"tset\\\"hi!\\\"\"" + "'", str14, "\"tset\\\"hi!\\\"\"");
        org.junit.Assert.assertNull(codeGenerator15);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("hi!");
        boolean boolean10 = python3Target1.templatesExist();
        java.lang.String str12 = python3Target1.getImplicitRuleLabel("tset_\\\"hi!\\\"Contex");
        boolean boolean13 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"hi!\"" + "'", str9, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_\\\"hi!\\\"Contex" + "'", str12, "_tset_\\\"hi!\\\"Contex");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        boolean boolean5 = python3Target1.wantsBaseListener();
        int int6 = python3Target1.getInlineTestSetWordSize();
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("", false);
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target1.getTemplates();
        java.lang.String str10 = python3Target1.getImplicitRuleLabel("_\"_\\\"hi!\\\"Contex\"Context");
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromString("\"\\\"\\\"_\\\"hi!\\\"Contex\\\"Contex\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "__\"_\\\"hi!\\\"Contex\"Context" + "'", str10, "__\"_\\\"hi!\\\"Contex\"Context");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"\\\\\\\"\\\\\\\"_\\\\\\\"hi!\\\\\\\"Contex\\\\\\\"Contex\\\"\"" + "'", str12, "\"\\\"\\\\\\\"\\\\\\\"_\\\\\\\"hi!\\\\\\\"Contex\\\\\\\"Contex\\\"\"");
        org.junit.Assert.assertNull(codeGenerator13);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\".5.2.\"", false);
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"__\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        java.lang.String str12 = python3Target1.getVersion();
        java.util.Set<java.lang.String> strSet13 = python3Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".5.2." + "'", str9, ".5.2.");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"__\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context" + "'", str11, "\"__\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        int int6 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "\"_tset4.5.2.1\"", true);
        java.util.Set<java.lang.String> strSet11 = python3Target1.getBadWords();
        java.lang.String str13 = python3Target1.encodeIntAsCharEscape(29);
        java.lang.String str14 = python3Target1.getLanguage();
        java.lang.String str16 = python3Target1.getImplicitSetLabel("\"\\\"tset\\\\\\\"_Python3\\\"\"Context");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python3Target1.getRuleFunctionContextStructName(ruleFunction17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tset4.5.2.1\"" + "'", str10, "\"_tset4.5.2.1\"");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\35" + "'", str13, "\\35");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python3" + "'", str14, "Python3");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_tset\"\\\"tset\\\\\\\"_Python3\\\"\"Context" + "'", str16, "_tset\"\\\"tset\\\\\\\"_Python3\\\"\"Context");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target1.getCodeGenerator();
        int int11 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str12 = python3Target1.getVersion();
        java.lang.String str13 = python3Target1.getVersion();
        boolean boolean14 = python3Target1.wantsBaseVisitor();
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromString("set_\\\\\\\"hi!\\\\\\\"Conte", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29 + "'", int11 == 29);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"set_\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"Conte\"" + "'", str17, "\"set_\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"Conte\"");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        boolean boolean8 = python3Target1.wantsBaseListener();
        java.lang.String str10 = python3Target1.getListLabel(".5.2.");
        java.util.Set<java.lang.String> strSet11 = python3Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".5.2." + "'", str10, ".5.2.");
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"Python3\"");
        boolean boolean12 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"Python3\"Context" + "'", str11, "\"Python3\"Context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(codeGenerator13);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("\"\\\"hi!\\\"\"Context", false);
        java.lang.String str13 = python3Target1.getListLabel("_\"Python3\"");
        java.util.Set<java.lang.String> strSet14 = python3Target1.getBadWords();
        boolean boolean15 = python3Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\\"\\\\\\\"hi!\\\\\\\"\\\"Context" + "'", str11, "\\\"\\\\\\\"hi!\\\\\\\"\\\"Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_\"Python3\"" + "'", str13, "_\"Python3\"");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.getTemplates();
        boolean boolean7 = python3Target1.wantsBaseListener();
        boolean boolean8 = python3Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        java.lang.String str12 = python3Target1.encodeIntAsCharEscape(64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "@" + "'", str12, "@");
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\"hi!\"");
        java.lang.String str7 = python3Target1.getVersion();
        int int8 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"Context" + "'", str6, "\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("", false);
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        java.util.Set<java.lang.String> strSet7 = python3Target1.getBadWords();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\"@\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "\\0ContextContext", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getElementListName("\"_Et\\\\\\\"hContext\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"@\"" + "'", str9, "_\"@\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0ContextContex" + "'", str13, "0ContextContex");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"Python3\"");
        boolean boolean12 = python3Target1.wantsBaseListener();
        int int13 = python3Target1.getInlineTestSetWordSize();
        boolean boolean14 = python3Target1.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target17 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator16);
        int int18 = python3Target17.getInlineTestSetWordSize();
        java.lang.String str20 = python3Target17.getImplicitSetLabel("\"hi!\"");
        java.lang.String str22 = python3Target17.encodeIntAsCharEscape(0);
        java.lang.String str23 = python3Target17.getVersion();
        java.lang.String str25 = python3Target17.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.tool.Grammar grammar26 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target28 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator27);
        boolean boolean29 = python3Target28.supportsOverloadedMethods();
        java.lang.String str31 = python3Target28.getTargetStringLiteralFromString("_Python3");
        org.antlr.v4.tool.Grammar grammar32 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target34 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator33);
        int int35 = python3Target34.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet36 = python3Target34.getBadWords();
        int int37 = python3Target34.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator38 = python3Target34.getCodeGenerator();
        java.lang.String str40 = python3Target34.getImplicitSetLabel("_\"hi!\"Context");
        java.lang.String str42 = python3Target34.getImplicitSetLabel("_tset");
        java.lang.String str44 = python3Target34.getImplicitSetLabel("\"\\\"Python3\\\"Context\"");
        int int45 = python3Target34.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar46 = null;
        int[] intArray47 = new int[] {};
        java.lang.String[] strArray48 = python3Target34.getTokenTypesAsTargetLabels(grammar46, intArray47);
        java.lang.String[] strArray49 = python3Target28.getTokenTypesAsTargetLabels(grammar32, intArray47);
        java.lang.String[] strArray50 = python3Target17.getTokenTypesAsTargetLabels(grammar26, intArray47);
        java.lang.String[] strArray51 = python3Target1.getTokenTypesAsTargetLabels(grammar15, intArray47);
        java.lang.String str53 = python3Target1.encodeIntAsCharEscape((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"Python3\"Context" + "'", str11, "\"Python3\"Context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "_tset\"hi!\"" + "'", str20, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\\0" + "'", str22, "\\0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "4.5.2.1" + "'", str23, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"hi!\"" + "'", str25, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\"_Python3\"" + "'", str31, "\"_Python3\"");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 64 + "'", int35 == 64);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 64 + "'", int37 == 64);
        org.junit.Assert.assertNull(codeGenerator38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "_tset_\"hi!\"Context" + "'", str40, "_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "_tset_tset" + "'", str42, "_tset_tset");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "_tset\"\\\"Python3\\\"Context\"" + "'", str44, "_tset\"\\\"Python3\\\"Context\"");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 29 + "'", int45 == 29);
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[]");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\\n" + "'", str53, "\\n");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str6 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getListLabel("tset\\\"hi!");
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromString("_tset_tset_\"hi!\"Context", true);
        boolean boolean13 = python3Target1.supportsOverloadedMethods();
        java.lang.String str15 = python3Target1.encodeIntAsCharEscape(100);
        java.util.Set<java.lang.String> strSet16 = python3Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "tset\\\"hi!" + "'", str8, "tset\\\"hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_tset_tset_\\\"hi!\\\"Context\"" + "'", str12, "\"_tset_tset_\\\"hi!\\\"Context\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "d" + "'", str15, "d");
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\"hi!\"");
        java.lang.String str7 = python3Target1.getVersion();
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet9 = python3Target1.getBadWords();
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("_tset", true);
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("\"tset\\\"_Python3\"");
        java.util.Set<java.lang.String> strSet16 = python3Target1.getBadWords();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python3Target1.getRuleFunctionContextStructName(ruleFunction17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"Context" + "'", str6, "\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"_tset\"" + "'", str13, "\"_tset\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"tset\\\\\\\"_Python3\\\"\"" + "'", str15, "\"\\\"tset\\\\\\\"_Python3\\\"\"");
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        boolean boolean11 = python3Target1.wantsBaseVisitor();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("\"_Python3\"");
        java.lang.String str14 = python3Target1.getVersion();
        boolean boolean15 = python3Target1.supportsOverloadedMethods();
        boolean boolean16 = python3Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"_Python3\\\"\"" + "'", str13, "\"\\\"_Python3\\\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        java.lang.String str8 = python3Target1.getVersion();
        org.antlr.v4.tool.Rule rule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getRuleFunctionContextStructName(rule9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator11);
        boolean boolean13 = python3Target12.supportsOverloadedMethods();
        java.lang.String str15 = python3Target12.getTargetStringLiteralFromString("_Python3");
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target18 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator17);
        int int19 = python3Target18.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet20 = python3Target18.getBadWords();
        int int21 = python3Target18.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = python3Target18.getCodeGenerator();
        java.lang.String str24 = python3Target18.getImplicitSetLabel("_\"hi!\"Context");
        java.lang.String str26 = python3Target18.getImplicitSetLabel("_tset");
        java.lang.String str28 = python3Target18.getImplicitSetLabel("\"\\\"Python3\\\"Context\"");
        int int29 = python3Target18.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar30 = null;
        int[] intArray31 = new int[] {};
        java.lang.String[] strArray32 = python3Target18.getTokenTypesAsTargetLabels(grammar30, intArray31);
        java.lang.String[] strArray33 = python3Target12.getTokenTypesAsTargetLabels(grammar16, intArray31);
        java.lang.String[] strArray34 = python3Target1.getTokenTypesAsTargetLabels(grammar10, intArray31);
        java.lang.String str37 = python3Target1.getTargetStringLiteralFromString("a", false);
        boolean boolean38 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"hi!\"" + "'", str9, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"_Python3\"" + "'", str15, "\"_Python3\"");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 64 + "'", int19 == 64);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertNull(codeGenerator22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "_tset_\"hi!\"Context" + "'", str24, "_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "_tset_tset" + "'", str26, "_tset_tset");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "_tset\"\\\"Python3\\\"Context\"" + "'", str28, "_tset\"\\\"Python3\\\"Context\"");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 29 + "'", int29 == 29);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[]");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "a" + "'", str37, "a");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        boolean boolean4 = python3Target1.wantsBaseListener();
        int int5 = python3Target1.getSerializedATNSegmentLimit();
        int int6 = python3Target1.getSerializedATNSegmentLimit();
        java.util.Set<java.lang.String> strSet7 = python3Target1.getBadWords();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("__\"\\\"hi!\\\"\"");
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 29 + "'", int5 == 29);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 29 + "'", int6 == 29);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "___\"\\\"hi!\\\"\"" + "'", str9, "___\"\\\"hi!\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str5 = python3Target1.getAltLabelContextStructName("_tset4.5.2.1");
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator7);
        int int9 = python3Target8.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet10 = python3Target8.getBadWords();
        int int11 = python3Target8.getInlineTestSetWordSize();
        java.lang.String str14 = python3Target8.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python3Target8.getCodeGenerator();
        boolean boolean16 = python3Target8.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python3Target8.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup18 = python3Target8.getTemplates();
        java.lang.String str20 = python3Target8.encodeIntAsCharEscape((int) (short) 100);
        java.lang.String str21 = python3Target8.getLanguage();
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target24 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator23);
        int int25 = python3Target24.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet26 = python3Target24.getBadWords();
        int int27 = python3Target24.getInlineTestSetWordSize();
        java.lang.String str30 = python3Target24.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = python3Target24.getCodeGenerator();
        boolean boolean32 = python3Target24.templatesExist();
        org.antlr.v4.tool.Grammar grammar33 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target35 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator34);
        int int36 = python3Target35.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet37 = python3Target35.getBadWords();
        int int38 = python3Target35.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator39 = python3Target35.getCodeGenerator();
        java.lang.String str41 = python3Target35.getImplicitSetLabel("_\"hi!\"Context");
        java.lang.String str43 = python3Target35.getImplicitSetLabel("_tset");
        java.lang.String str45 = python3Target35.getImplicitSetLabel("\"\\\"Python3\\\"Context\"");
        int int46 = python3Target35.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar47 = null;
        int[] intArray48 = new int[] {};
        java.lang.String[] strArray49 = python3Target35.getTokenTypesAsTargetLabels(grammar47, intArray48);
        java.lang.String[] strArray50 = python3Target24.getTokenTypesAsTargetLabels(grammar33, intArray48);
        java.lang.String[] strArray51 = python3Target8.getTokenTypesAsTargetLabels(grammar22, intArray48);
        java.lang.String[] strArray52 = python3Target1.getTokenTypesAsTargetLabels(grammar6, intArray48);
        boolean boolean53 = python3Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str55 = python3Target1.getImplicitTokenLabel("_tsetd");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tset4.5.2.1Context" + "'", str5, "_tset4.5.2.1Context");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset\\\"hi!\\\"" + "'", str14, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(codeGenerator17);
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "d" + "'", str20, "d");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Python3" + "'", str21, "Python3");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 64 + "'", int25 == 64);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 64 + "'", int27 == 64);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "_tset\\\"hi!\\\"" + "'", str30, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 64 + "'", int36 == 64);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 64 + "'", int38 == 64);
        org.junit.Assert.assertNull(codeGenerator39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "_tset_\"hi!\"Context" + "'", str41, "_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "_tset_tset" + "'", str43, "_tset_tset");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "_tset\"\\\"Python3\\\"Context\"" + "'", str45, "_tset\"\\\"Python3\\\"Context\"");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 29 + "'", int46 == 29);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[]");
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str6 = python3Target1.getImplicitSetLabel("_tset_\"hi!\"Context");
        java.lang.String str8 = python3Target1.getListLabel("_tsettset\\\"hi!");
        java.lang.String str10 = python3Target1.encodeIntAsCharEscape(100);
        boolean boolean11 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset_tset_\"hi!\"Context" + "'", str6, "_tset_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsettset\\\"hi!" + "'", str8, "_tsettset\\\"hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target1.getCodeGenerator();
        boolean boolean11 = python3Target1.wantsBaseVisitor();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("_Python3");
        java.lang.String str15 = python3Target1.getImplicitSetLabel("\\\"\\\\\\\"hi!\\\\\\\"\\\"Context");
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.getLoopCounter(grammarAST16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"_Python3\"" + "'", str13, "\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset\\\"\\\\\\\"hi!\\\\\\\"\\\"Context" + "'", str15, "_tset\\\"\\\\\\\"hi!\\\\\\\"\\\"Context");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.getTemplates();
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "tset\\\"hi!", false);
        java.lang.String str13 = python3Target1.getListLabel("_tset_\\\"hi!\\\"Contex");
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "#", false);
        int int18 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target21 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator20);
        int int22 = python3Target21.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet23 = python3Target21.getBadWords();
        int int24 = python3Target21.getInlineTestSetWordSize();
        java.lang.String str27 = python3Target21.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        boolean boolean28 = python3Target21.supportsOverloadedMethods();
        java.lang.String str31 = python3Target21.getTargetStringLiteralFromString("\"\\\"hi!\\\"\"Context", false);
        org.antlr.v4.tool.Grammar grammar32 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target34 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator33);
        int int35 = python3Target34.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet36 = python3Target34.getBadWords();
        int int37 = python3Target34.getInlineTestSetWordSize();
        java.lang.String str39 = python3Target34.getAltLabelContextStructName("\"hi!\"");
        boolean boolean40 = python3Target34.templatesExist();
        int int41 = python3Target34.getSerializedATNSegmentLimit();
        boolean boolean42 = python3Target34.wantsBaseVisitor();
        java.lang.String str44 = python3Target34.getAltLabelContextStructName("\"\\\"hi!\\\"\"");
        java.lang.String str46 = python3Target34.getImplicitRuleLabel("tset_\\\"hi!\\\"Contex");
        org.antlr.v4.tool.Grammar grammar47 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator48 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target49 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator48);
        int int50 = python3Target49.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet51 = python3Target49.getBadWords();
        int int52 = python3Target49.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator53 = python3Target49.getCodeGenerator();
        java.lang.String str55 = python3Target49.getImplicitSetLabel("_\"hi!\"Context");
        java.lang.String str57 = python3Target49.getImplicitSetLabel("_tset");
        java.lang.String str59 = python3Target49.getImplicitSetLabel("\"\\\"Python3\\\"Context\"");
        int int60 = python3Target49.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar61 = null;
        int[] intArray62 = new int[] {};
        java.lang.String[] strArray63 = python3Target49.getTokenTypesAsTargetLabels(grammar61, intArray62);
        java.lang.String[] strArray64 = python3Target34.getTokenTypesAsTargetLabels(grammar47, intArray62);
        java.lang.String[] strArray65 = python3Target21.getTokenTypesAsTargetLabels(grammar32, intArray62);
        java.lang.String[] strArray66 = python3Target1.getTokenTypesAsTargetLabels(grammar19, intArray62);
        org.antlr.v4.tool.ast.GrammarAST grammarAST67 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean68 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "set\\\"hi" + "'", str11, "set\\\"hi");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_tset_\\\"hi!\\\"Contex" + "'", str13, "_tset_\\\"hi!\\\"Contex");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 29 + "'", int18 == 29);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 64 + "'", int22 == 64);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 64 + "'", int24 == 64);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "_tset\\\"hi!\\\"" + "'", str27, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\\\"\\\\\\\"hi!\\\\\\\"\\\"Context" + "'", str31, "\\\"\\\\\\\"hi!\\\\\\\"\\\"Context");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 64 + "'", int35 == 64);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 64 + "'", int37 == 64);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\"hi!\"Context" + "'", str39, "\"hi!\"Context");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 29 + "'", int41 == 29);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\"\\\"hi!\\\"\"Context" + "'", str44, "\"\\\"hi!\\\"\"Context");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "_tset_\\\"hi!\\\"Contex" + "'", str46, "_tset_\\\"hi!\\\"Contex");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 64 + "'", int50 == 64);
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 64 + "'", int52 == 64);
        org.junit.Assert.assertNull(codeGenerator53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "_tset_\"hi!\"Context" + "'", str55, "_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "_tset_tset" + "'", str57, "_tset_tset");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "_tset\"\\\"Python3\\\"Context\"" + "'", str59, "_tset\"\\\"Python3\\\"Context\"");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 29 + "'", int60 == 29);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[]");
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(strArray66);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\"hi!\"Context");
        java.lang.String str10 = python3Target1.getLanguage();
        java.lang.String str12 = python3Target1.getListLabel("_tset_\"hi!\"Context");
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.antlr.v4.tool.Rule rule14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getRuleFunctionContextStructName(rule14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"hi!\"Context" + "'", str9, "_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python3" + "'", str10, "Python3");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_\"hi!\"Context" + "'", str12, "_tset_\"hi!\"Context");
        org.junit.Assert.assertNotNull(sTGroup13);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"Python3\"");
        boolean boolean12 = python3Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup14 = python3Target1.getTemplates();
        java.util.Set<java.lang.String> strSet15 = python3Target1.getBadWords();
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromString("_\"\\\"_\\\"hi!\\\"Contex\"Context");
        java.lang.String str19 = python3Target1.getTargetStringLiteralFromString("\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"Context\"ContextContext");
        java.util.Set<java.lang.String> strSet20 = python3Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"Python3\"Context" + "'", str11, "\"Python3\"Context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"_\\\"\\\\\\\"_\\\\\\\"hi!\\\\\\\"Contex\\\"Context\"" + "'", str17, "\"_\\\"\\\\\\\"_\\\\\\\"hi!\\\\\\\"Contex\\\"Context\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"Context\\\"ContextContext\"" + "'", str19, "\"\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"Context\\\"ContextContext\"");
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("Python3");
        boolean boolean7 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target1.getTemplates();
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        java.lang.String str10 = python3Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getLoopLabel(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"Python3\"" + "'", str6, "\"Python3\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python3" + "'", str10, "Python3");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("Python3");
        boolean boolean7 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target1.getTemplates();
        org.antlr.v4.tool.Grammar grammar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getTokenTypeAsTargetLabel(grammar9, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"Python3\"" + "'", str6, "\"Python3\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(sTGroup8);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getListLabel("\"_Python3\"");
        int int5 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_\\nContext");
        java.lang.String str8 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getLoopCounter(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 29 + "'", int5 == 29);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_\\\\nContext\"" + "'", str7, "\"_\\\\nContext\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup9);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"Python3\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "\"_Python3\"", true);
        boolean boolean16 = python3Target1.templatesExist();
        java.lang.String str18 = python3Target1.getTargetStringLiteralFromString("_\"_\\\"Python3\\\"\"Context");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"Python3\"Context" + "'", str11, "\"Python3\"Context");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"_Python3\"" + "'", str15, "\"_Python3\"");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"_\\\"_\\\\\\\"Python3\\\\\\\"\\\"Context\"" + "'", str18, "\"_\\\"_\\\\\\\"Python3\\\\\\\"\\\"Context\"");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        int int6 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "\"_tset4.5.2.1\"", true);
        java.lang.String str11 = python3Target1.getLanguage();
        java.lang.String str13 = python3Target1.getImplicitRuleLabel("_tset\".5.2.\"");
        java.lang.String str15 = python3Target1.getListLabel("\"set\\\\\\\"hi\"Context");
        java.lang.String str17 = python3Target1.getAltLabelContextStructName("\"_\\\"\\\\\\\"#\\\\\\\"\\\"\"");
        int int18 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        java.lang.String str22 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator19, "_tset0ContextContex", false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tset4.5.2.1\"" + "'", str10, "\"_tset4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python3" + "'", str11, "Python3");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "__tset\".5.2.\"" + "'", str13, "__tset\".5.2.\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"set\\\\\\\"hi\"Context" + "'", str15, "\"set\\\\\\\"hi\"Context");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"_\\\"\\\\\\\"#\\\\\\\"\\\"\"Context" + "'", str17, "\"_\\\"\\\\\\\"#\\\\\\\"\\\"\"Context");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "tset0ContextConte" + "'", str22, "tset0ContextConte");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"Python3\"");
        boolean boolean12 = python3Target1.wantsBaseListener();
        int int13 = python3Target1.getInlineTestSetWordSize();
        boolean boolean14 = python3Target1.wantsBaseListener();
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromString("\"_\\\"Python3\\\"\"", false);
        java.lang.String str19 = python3Target1.getAltLabelContextStructName("_tset0Contex");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"Python3\"Context" + "'", str11, "\"Python3\"Context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\\"_\\\\\\\"Python3\\\\\\\"\\\"" + "'", str17, "\\\"_\\\\\\\"Python3\\\\\\\"\\\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_tset0ContexContext" + "'", str19, "_tset0ContexContext");
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("hi!");
        java.lang.String str11 = python3Target1.getListLabel("");
        java.lang.String str12 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "_tset_tset_\"hi!\"Context", false);
        org.stringtemplate.v4.STGroup sTGroup17 = python3Target1.getTemplates();
        boolean boolean18 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        java.lang.String str22 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator19, "\"\\\"_tsettset\\\\\\\\\\\\\\\"hi!\\\"\"", true);
        boolean boolean23 = python3Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"hi!\"" + "'", str9, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "tset_tset_\\\"hi!\\\"Contex" + "'", str16, "tset_tset_\\\"hi!\\\"Contex");
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"\\\"_tsettset\\\\\\\\\\\\\\\"hi!\\\"\"" + "'", str22, "\"\\\"_tsettset\\\\\\\\\\\\\\\"hi!\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "4.5.2.1", true);
        java.lang.String str6 = python3Target1.getVersion();
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str9 = python3Target1.getListLabel("tset_\\\"hi!\\\"Contex");
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("\"tse\"");
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target14 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator13);
        int int15 = python3Target14.getInlineTestSetWordSize();
        java.lang.String str17 = python3Target14.getImplicitSetLabel("\"hi!\"");
        java.lang.String str19 = python3Target14.encodeIntAsCharEscape(0);
        boolean boolean20 = python3Target14.supportsOverloadedMethods();
        int int21 = python3Target14.getInlineTestSetWordSize();
        java.lang.String str23 = python3Target14.getImplicitRuleLabel("_tset_\"hi!\"ContextContext");
        java.lang.String str25 = python3Target14.getAltLabelContextStructName("_tset__\"\\\"_\\\"hi!\\\"Contex\"Context");
        org.antlr.v4.tool.Grammar grammar26 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target28 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator27);
        org.antlr.v4.codegen.CodeGenerator codeGenerator29 = null;
        java.lang.String str32 = python3Target28.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator29, "4.5.2.1", true);
        boolean boolean33 = python3Target28.templatesExist();
        org.antlr.v4.tool.Grammar grammar34 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target36 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator35);
        int int37 = python3Target36.getInlineTestSetWordSize();
        java.lang.String str39 = python3Target36.getImplicitSetLabel("\"hi!\"");
        java.lang.String str41 = python3Target36.encodeIntAsCharEscape(0);
        java.lang.String str42 = python3Target36.getVersion();
        java.lang.String str44 = python3Target36.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.tool.Grammar grammar45 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator46 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target47 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator46);
        boolean boolean48 = python3Target47.supportsOverloadedMethods();
        java.lang.String str50 = python3Target47.getTargetStringLiteralFromString("_Python3");
        org.antlr.v4.tool.Grammar grammar51 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator52 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target53 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator52);
        int int54 = python3Target53.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet55 = python3Target53.getBadWords();
        int int56 = python3Target53.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator57 = python3Target53.getCodeGenerator();
        java.lang.String str59 = python3Target53.getImplicitSetLabel("_\"hi!\"Context");
        java.lang.String str61 = python3Target53.getImplicitSetLabel("_tset");
        java.lang.String str63 = python3Target53.getImplicitSetLabel("\"\\\"Python3\\\"Context\"");
        int int64 = python3Target53.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar65 = null;
        int[] intArray66 = new int[] {};
        java.lang.String[] strArray67 = python3Target53.getTokenTypesAsTargetLabels(grammar65, intArray66);
        java.lang.String[] strArray68 = python3Target47.getTokenTypesAsTargetLabels(grammar51, intArray66);
        java.lang.String[] strArray69 = python3Target36.getTokenTypesAsTargetLabels(grammar45, intArray66);
        java.lang.String[] strArray70 = python3Target28.getTokenTypesAsTargetLabels(grammar34, intArray66);
        java.lang.String[] strArray71 = python3Target14.getTokenTypesAsTargetLabels(grammar26, intArray66);
        java.lang.String[] strArray72 = python3Target1.getTokenTypesAsTargetLabels(grammar12, intArray66);
        org.stringtemplate.v4.STGroup sTGroup73 = python3Target1.getTemplates();
        org.antlr.v4.tool.Rule rule74 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str75 = python3Target1.getRuleFunctionContextStructName(rule74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\".5.2.\"" + "'", str5, "\".5.2.\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "tset_\\\"hi!\\\"Contex" + "'", str9, "tset_\\\"hi!\\\"Contex");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"tse\\\"\"" + "'", str11, "\"\\\"tse\\\"\"");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_tset\"hi!\"" + "'", str17, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\\0" + "'", str19, "\\0");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "__tset_\"hi!\"ContextContext" + "'", str23, "__tset_\"hi!\"ContextContext");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "_tset__\"\\\"_\\\"hi!\\\"Contex\"ContextContext" + "'", str25, "_tset__\"\\\"_\\\"hi!\\\"Contex\"ContextContext");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\".5.2.\"" + "'", str32, "\".5.2.\"");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 64 + "'", int37 == 64);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "_tset\"hi!\"" + "'", str39, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\\0" + "'", str41, "\\0");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "4.5.2.1" + "'", str42, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\"hi!\"" + "'", str44, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\"_Python3\"" + "'", str50, "\"_Python3\"");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 64 + "'", int54 == 64);
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 64 + "'", int56 == 64);
        org.junit.Assert.assertNull(codeGenerator57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "_tset_\"hi!\"Context" + "'", str59, "_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "_tset_tset" + "'", str61, "_tset_tset");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "_tset\"\\\"Python3\\\"Context\"" + "'", str63, "_tset\"\\\"Python3\\\"Context\"");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 29 + "'", int64 == 29);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[]");
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(sTGroup73);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getListLabel("\"_Python3\"");
        int int5 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet7 = python3Target1.getBadWords();
        java.lang.String str9 = python3Target1.getListLabel("\"set\\\\\\\"hi\"Context");
        boolean boolean10 = python3Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"set\\\\\\\"hi\"Context" + "'", str9, "\"set\\\\\\\"hi\"Context");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_Python3");
        boolean boolean8 = python3Target1.wantsBaseListener();
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.encodeIntAsCharEscape((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_Python3\"" + "'", str7, "\"_Python3\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "4.5.2.1", true);
        java.lang.String str6 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("\"\\\"_\\\"hi!\\\"Contex\"");
        boolean boolean9 = python3Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.getTemplates();
        java.lang.String str11 = python3Target1.getVersion();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\".5.2.\"" + "'", str5, "\".5.2.\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_\"\\\"_\\\"hi!\\\"Contex\"" + "'", str8, "_\"\\\"_\\\"hi!\\\"Contex\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_\"\\\"_Python3\\\"\"", false);
        java.lang.String str8 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_\\\"\\\\\\\"_Python3\\\\\\\"\\\"" + "'", str7, "_\\\"\\\\\\\"_Python3\\\\\\\"\\\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator9);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"Python3\"");
        boolean boolean12 = python3Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        int int14 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str16 = python3Target1.getListLabel("\"tset_\\\\\\\"hi!\\\\\\\"Contex\"");
        boolean boolean17 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet18 = python3Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"Python3\"Context" + "'", str11, "\"Python3\"Context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"tset_\\\\\\\"hi!\\\\\\\"Contex\"" + "'", str16, "\"tset_\\\\\\\"hi!\\\\\\\"Contex\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"Python3\"");
        boolean boolean12 = python3Target1.supportsOverloadedMethods();
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"Python3\"Context" + "'", str11, "\"Python3\"Context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"a\"" + "'", str14, "\"a\"");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("hi!");
        boolean boolean10 = python3Target1.templatesExist();
        java.lang.String str12 = python3Target1.getImplicitRuleLabel("tset_\\\"hi!\\\"Contex");
        boolean boolean13 = python3Target1.wantsBaseVisitor();
        boolean boolean14 = python3Target1.templatesExist();
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromString("___\"\\\"hi!\\\"\"", false);
        java.lang.String str20 = python3Target1.getTargetStringLiteralFromString("__tset\"\\\"_Python3\\\"\"", true);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = python3Target1.getRuleFunctionContextStructName(ruleFunction21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"hi!\"" + "'", str9, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_\\\"hi!\\\"Contex" + "'", str12, "_tset_\\\"hi!\\\"Contex");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "___\\\"\\\\\\\"hi!\\\\\\\"\\\"" + "'", str17, "___\\\"\\\\\\\"hi!\\\\\\\"\\\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"__tset\\\"\\\\\\\"_Python3\\\\\\\"\\\"\"" + "'", str20, "\"__tset\\\"\\\\\\\"_Python3\\\\\\\"\\\"\"");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_Python3");
        int int8 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str10 = python3Target1.getAltLabelContextStructName("\"\\\"hi!\\\"\"Context");
        java.lang.String str12 = python3Target1.getImplicitRuleLabel("\\35");
        boolean boolean13 = python3Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_Python3\"" + "'", str7, "\"_Python3\"");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"hi!\\\"\"ContextContext" + "'", str10, "\"\\\"hi!\\\"\"ContextContext");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_\\35" + "'", str12, "_\\35");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("hi!");
        boolean boolean10 = python3Target1.templatesExist();
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        boolean boolean12 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "tset\\\"\\\"Python3\\\"Context", false);
        java.lang.String str19 = python3Target1.getTargetStringLiteralFromString("tset\\\"hi!", true);
        boolean boolean20 = python3Target1.wantsBaseListener();
        java.lang.String str21 = python3Target1.getVersion();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"hi!\"" + "'", str9, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "set\\\"\\\"Python3\\\"Contex" + "'", str16, "set\\\"\\\"Python3\\\"Contex");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"tset\\\\\\\"hi!\"" + "'", str19, "\"tset\\\\\\\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4.5.2.1" + "'", str21, "4.5.2.1");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        java.lang.String str12 = python3Target1.getImplicitRuleLabel("_\"hi!\"Context");
        java.lang.String str14 = python3Target1.getImplicitRuleLabel("\"_\\\"hi!\\\"Contex\"");
        java.lang.String str16 = python3Target1.getImplicitSetLabel("\"tset\\\\\\\"hi!\"");
        boolean boolean17 = python3Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target1.getElementListName("\"\\\"_\\\\\\\"\\\\\\\"_\\\\\\\"hi!\\\\\\\"Contex\\\\\\\"Contex\\\"\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "__\"hi!\"Context" + "'", str12, "__\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_\"_\\\"hi!\\\"Contex\"" + "'", str14, "_\"_\\\"hi!\\\"Contex\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_tset\"tset\\\\\\\"hi!\"" + "'", str16, "_tset\"tset\\\\\\\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getImplicitRuleLabel("_tset_Python3Contex");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "__tset_Python3Contex" + "'", str4, "__tset_Python3Contex");
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getSerializedATNSegmentLimit();
        int int3 = python3Target1.getInlineTestSetWordSize();
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str6 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("\"\\\"\\\\\\\"Python3\\\\\\\"Context\\\"\"");
        java.lang.String str10 = python3Target1.getImplicitRuleLabel("\"_\\\\nContext\"");
        int int11 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"\\\\\\\"Python3\\\\\\\"Context\\\"\"Context" + "'", str8, "\"\\\"\\\\\\\"Python3\\\\\\\"Context\\\"\"Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_\"_\\\\nContext\"" + "'", str10, "_\"_\\\\nContext\"");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29 + "'", int11 == 29);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target1.getCodeGenerator();
        int int12 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\"\\\"_\\\\\\\"\\\\\\\\\\\\\\\"_\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"Contex\\\\\\\"Context\\\"\"");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"\\\\\\\"_\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"Contex\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\"" + "'", str14, "\"\\\"\\\\\\\"_\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"Contex\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\"");
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"Python3\"");
        boolean boolean12 = python3Target1.wantsBaseListener();
        boolean boolean13 = python3Target1.templatesExist();
        java.util.Set<java.lang.String> strSet14 = python3Target1.getBadWords();
        boolean boolean15 = python3Target1.templatesExist();
        java.lang.String str16 = python3Target1.getVersion();
        int int17 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"Python3\"Context" + "'", str11, "\"Python3\"Context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "4.5.2.1" + "'", str16, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getAltLabelContextStructName("\"_\\\"Python3\\\"\"");
        java.lang.String str9 = python3Target1.getAltLabelContextStructName("\"\\\"tset\\\\\\\"_Python3\\\"\"");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_\\\"Python3\\\"\"Context" + "'", str7, "\"_\\\"Python3\\\"\"Context");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"tset\\\\\\\"_Python3\\\"\"Context" + "'", str9, "\"\\\"tset\\\\\\\"_Python3\\\"\"Context");
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("Python3");
        boolean boolean7 = python3Target1.templatesExist();
        int int8 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\"hi!\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"Python3\"" + "'", str6, "\"Python3\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
        org.junit.Assert.assertNull(codeGenerator13);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\"hi!\"Context");
        java.lang.String str10 = python3Target1.getLanguage();
        java.lang.String str12 = python3Target1.getListLabel("_tset_\"hi!\"Context");
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        int int14 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str16 = python3Target1.getImplicitSetLabel("__tset_\"Python3\"");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"hi!\"Context" + "'", str9, "_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python3" + "'", str10, "Python3");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_\"hi!\"Context" + "'", str12, "_tset_\"hi!\"Context");
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_tset__tset_\"Python3\"" + "'", str16, "_tset__tset_\"Python3\"");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getListLabel("\"_Python3\"");
        int int5 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getElementName("_tsetet\\\"h");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"Python3\"");
        boolean boolean12 = python3Target1.wantsBaseListener();
        boolean boolean13 = python3Target1.templatesExist();
        java.lang.String str15 = python3Target1.getAltLabelContextStructName("DContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        java.lang.String str19 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator16, "DContext", true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"Python3\"Context" + "'", str11, "\"Python3\"Context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DContextContext" + "'", str15, "DContextContext");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"Contex\"" + "'", str19, "\"Contex\"");
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\"hi!\"");
        boolean boolean7 = python3Target1.templatesExist();
        int int8 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.getTemplates();
        java.lang.String str12 = python3Target1.encodeIntAsCharEscape(0);
        int int13 = python3Target1.getInlineTestSetWordSize();
        boolean boolean14 = python3Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"Context" + "'", str6, "\"hi!\"Context");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        boolean boolean7 = python3Target1.templatesExist();
        java.lang.String str8 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getTokenTypeAsTargetLabel(grammar10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator9);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getListLabel("\"_Python3\"");
        int int5 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 29 + "'", int5 == 29);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target1.getCodeGenerator();
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\"\\\"_\\\"hi!\\\"Contex\"");
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str9 = python3Target1.getAltLabelContextStructName("__tset\\\"hi!\\\"");
        java.lang.String str10 = python3Target1.getVersion();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\"_\\\"hi!\\\"Contex\"Context" + "'", str6, "\"\\\"_\\\"hi!\\\"Contex\"Context");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "__tset\\\"hi!\\\"Context" + "'", str9, "__tset\\\"hi!\\\"Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("_tset\"\\\"_Python3\\\"\"");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getRuleFunctionContextStructName(ruleFunction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "__tset\"\\\"_Python3\\\"\"" + "'", str8, "__tset\"\\\"_Python3\\\"\"");
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"Python3\"");
        java.lang.String str13 = python3Target1.getImplicitRuleLabel("");
        java.lang.String str15 = python3Target1.getListLabel("_tset_\"hi!\"ContextContext");
        java.lang.String str17 = python3Target1.encodeIntAsCharEscape(10);
        java.lang.String str19 = python3Target1.getImplicitSetLabel("\"_tsettset\\\\\\\"hi!\"");
        java.lang.String str21 = python3Target1.encodeIntAsCharEscape(0);
        boolean boolean22 = python3Target1.templatesExist();
        java.lang.String str25 = python3Target1.getTargetStringLiteralFromString("\"\\\"_\\\"hi!\\\"Contex\"", false);
        java.lang.String str27 = python3Target1.getTargetStringLiteralFromString("\"_tset\\\"\\\\\\\"_\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"Contex\\\\\\\"\\\"\"Context");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = python3Target1.getImplicitTokenLabel("\"\\\"\\\\\\\\\\\\\\\"tset\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"_Python3\\\\\\\\\\\\\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"Python3\"Context" + "'", str11, "\"Python3\"Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_" + "'", str13, "_");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset_\"hi!\"ContextContext" + "'", str15, "_tset_\"hi!\"ContextContext");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\n" + "'", str17, "\\n");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_tset\"_tsettset\\\\\\\"hi!\"" + "'", str19, "_tset\"_tsettset\\\\\\\"hi!\"");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\\0" + "'", str21, "\\0");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\\\"\\\\\\\"_\\\\\\\"hi!\\\\\\\"Contex\\\"" + "'", str25, "\\\"\\\\\\\"_\\\\\\\"hi!\\\\\\\"Contex\\\"");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"\\\"_tset\\\\\\\"\\\\\\\\\\\\\\\"_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"Contex\\\\\\\\\\\\\\\"\\\\\\\"\\\"Context\"" + "'", str27, "\"\\\"_tset\\\\\\\"\\\\\\\\\\\\\\\"_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"Contex\\\\\\\\\\\\\\\"\\\\\\\"\\\"Context\"");
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"Python3\"");
        boolean boolean12 = python3Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        boolean boolean14 = python3Target1.wantsBaseVisitor();
        java.lang.String str16 = python3Target1.encodeIntAsCharEscape((int) (short) 10);
        java.lang.String str18 = python3Target1.getAltLabelContextStructName("4.5.2.1");
        java.lang.String str20 = python3Target1.getAltLabelContextStructName("\\\"_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"Python3\"Context" + "'", str11, "\"Python3\"Context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\\n" + "'", str16, "\\n");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1Context" + "'", str18, "4.5.2.1Context");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\\\"_tset4.5.2.1Context" + "'", str20, "\\\"_tset4.5.2.1Context");
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getTargetStringLiteralFromString("_Python3");
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        int int6 = python3Target1.getSerializedATNSegmentLimit();
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 29 + "'", int6 == 29);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str6 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getListLabel("tset\\\"hi!");
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
        java.lang.String str11 = python3Target1.getImplicitSetLabel("\"\\\"hi!\\\"\"ContextContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "_tset_tset\".5.2.\"", false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "tset\\\"hi!" + "'", str8, "tset\\\"hi!");
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset\"\\\"hi!\\\"\"ContextContext" + "'", str11, "_tset\"\\\"hi!\\\"\"ContextContext");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "tset_tset\\\".5.2." + "'", str15, "tset_tset\\\".5.2.");
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.getTemplates();
        boolean boolean7 = python3Target1.wantsBaseListener();
        boolean boolean8 = python3Target1.templatesExist();
        java.lang.String str9 = python3Target1.getLanguage();
        java.lang.String str11 = python3Target1.getImplicitRuleLabel("_tset\"tset\\\"_Python3\"");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python3" + "'", str9, "Python3");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "__tset\"tset\\\"_Python3\"" + "'", str11, "__tset\"tset\\\"_Python3\"");
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"Python3\"");
        boolean boolean12 = python3Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup14 = python3Target1.getTemplates();
        java.util.Set<java.lang.String> strSet15 = python3Target1.getBadWords();
        java.lang.String str17 = python3Target1.encodeIntAsCharEscape((int) '4');
        java.lang.String str18 = python3Target1.getLanguage();
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target21 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator20);
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        java.lang.String str25 = python3Target21.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator22, "4.5.2.1", true);
        boolean boolean26 = python3Target21.templatesExist();
        org.antlr.v4.tool.Grammar grammar27 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator28 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target29 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator28);
        int int30 = python3Target29.getInlineTestSetWordSize();
        java.lang.String str32 = python3Target29.getImplicitSetLabel("\"hi!\"");
        java.lang.String str34 = python3Target29.encodeIntAsCharEscape(0);
        java.lang.String str35 = python3Target29.getVersion();
        java.lang.String str37 = python3Target29.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.tool.Grammar grammar38 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator39 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target40 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator39);
        boolean boolean41 = python3Target40.supportsOverloadedMethods();
        java.lang.String str43 = python3Target40.getTargetStringLiteralFromString("_Python3");
        org.antlr.v4.tool.Grammar grammar44 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator45 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target46 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator45);
        int int47 = python3Target46.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet48 = python3Target46.getBadWords();
        int int49 = python3Target46.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator50 = python3Target46.getCodeGenerator();
        java.lang.String str52 = python3Target46.getImplicitSetLabel("_\"hi!\"Context");
        java.lang.String str54 = python3Target46.getImplicitSetLabel("_tset");
        java.lang.String str56 = python3Target46.getImplicitSetLabel("\"\\\"Python3\\\"Context\"");
        int int57 = python3Target46.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar58 = null;
        int[] intArray59 = new int[] {};
        java.lang.String[] strArray60 = python3Target46.getTokenTypesAsTargetLabels(grammar58, intArray59);
        java.lang.String[] strArray61 = python3Target40.getTokenTypesAsTargetLabels(grammar44, intArray59);
        java.lang.String[] strArray62 = python3Target29.getTokenTypesAsTargetLabels(grammar38, intArray59);
        java.lang.String[] strArray63 = python3Target21.getTokenTypesAsTargetLabels(grammar27, intArray59);
        java.lang.String[] strArray64 = python3Target1.getTokenTypesAsTargetLabels(grammar19, intArray59);
        org.stringtemplate.v4.STGroup sTGroup65 = python3Target1.getTemplates();
        java.lang.Class<?> wildcardClass66 = sTGroup65.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"Python3\"Context" + "'", str11, "\"Python3\"Context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\64" + "'", str17, "\\64");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python3" + "'", str18, "Python3");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\".5.2.\"" + "'", str25, "\".5.2.\"");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 64 + "'", int30 == 64);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "_tset\"hi!\"" + "'", str32, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\\0" + "'", str34, "\\0");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "4.5.2.1" + "'", str35, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\"hi!\"" + "'", str37, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\"_Python3\"" + "'", str43, "\"_Python3\"");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 64 + "'", int47 == 64);
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 64 + "'", int49 == 64);
        org.junit.Assert.assertNull(codeGenerator50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "_tset_\"hi!\"Context" + "'", str52, "_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "_tset_tset" + "'", str54, "_tset_tset");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "_tset\"\\\"Python3\\\"Context\"" + "'", str56, "_tset\"\\\"Python3\\\"Context\"");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 29 + "'", int57 == 29);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[]");
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(sTGroup65);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\".5.2.\"", false);
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getVersion();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".5.2." + "'", str9, ".5.2.");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        boolean boolean4 = python3Target1.wantsBaseListener();
        java.lang.String str5 = python3Target1.getVersion();
        boolean boolean6 = python3Target1.templatesExist();
        java.util.Set<java.lang.String> strSet7 = python3Target1.getBadWords();
        java.lang.String str9 = python3Target1.encodeIntAsCharEscape((int) ' ');
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target1.getCodeGenerator();
        java.lang.String str11 = python3Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target1.getTemplates();
        java.lang.Class<?> wildcardClass13 = sTGroup12.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python3" + "'", str11, "Python3");
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"Python3\"");
        java.lang.String str13 = python3Target1.getImplicitRuleLabel("");
        java.lang.String str15 = python3Target1.getListLabel("_tset_\"hi!\"ContextContext");
        java.lang.String str17 = python3Target1.encodeIntAsCharEscape(10);
        java.lang.String str19 = python3Target1.getImplicitSetLabel("\"_tsettset\\\\\\\"hi!\"");
        java.lang.String str21 = python3Target1.encodeIntAsCharEscape(0);
        boolean boolean22 = python3Target1.templatesExist();
        java.lang.String str23 = python3Target1.getLanguage();
        int int24 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"Python3\"Context" + "'", str11, "\"Python3\"Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_" + "'", str13, "_");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset_\"hi!\"ContextContext" + "'", str15, "_tset_\"hi!\"ContextContext");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\n" + "'", str17, "\\n");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_tset\"_tsettset\\\\\\\"hi!\"" + "'", str19, "_tset\"_tsettset\\\\\\\"hi!\"");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\\0" + "'", str21, "\\0");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Python3" + "'", str23, "Python3");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 29 + "'", int24 == 29);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        int int6 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "\"_tset4.5.2.1\"", true);
        java.lang.String str11 = python3Target1.getLanguage();
        int int12 = python3Target1.getSerializedATNSegmentLimit();
        int int13 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tset4.5.2.1\"" + "'", str10, "\"_tset4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python3" + "'", str11, "Python3");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 29 + "'", int12 == 29);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("Python3");
        boolean boolean7 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target1.getTemplates();
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        java.lang.String str10 = python3Target1.getLanguage();
        java.lang.String str12 = python3Target1.getAltLabelContextStructName("#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"Python3\"" + "'", str6, "\"Python3\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python3" + "'", str10, "Python3");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#Context" + "'", str12, "#Context");
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\"hi!\"Context");
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("_Python3");
        boolean boolean12 = python3Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        boolean boolean14 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python3Target1.getCodeGenerator();
        java.lang.String str17 = python3Target1.getImplicitRuleLabel("_tset_tset\"\\\"_Python3\\\"\"");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"hi!\"Context" + "'", str9, "_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"_Python3\"" + "'", str11, "\"_Python3\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "__tset_tset\"\\\"_Python3\\\"\"" + "'", str17, "__tset_tset\"\\\"_Python3\\\"\"");
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\"hi!\"");
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"Python3\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"Contex\"");
        org.antlr.v4.tool.Rule rule10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getRuleFunctionContextStructName(rule10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"Context" + "'", str6, "\"hi!\"Context");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"Python3\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"Contex\"" + "'", str9, "_\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"Python3\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"Contex\"");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.encodeIntAsCharEscape(100);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\\0Context", true);
        boolean boolean13 = python3Target1.wantsBaseVisitor();
        int int14 = python3Target1.getInlineTestSetWordSize();
        boolean boolean15 = python3Target1.wantsBaseListener();
        java.lang.String str16 = python3Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"0Contex\"" + "'", str12, "\"0Contex\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Python3" + "'", str16, "Python3");
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getImplicitRuleLabel("_\"hi!\"Context");
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target1.getRuleFunctionContextStructName(ruleFunction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "__\"hi!\"Context" + "'", str3, "__\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.getTemplates();
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str6 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getListLabel("tset\\\"hi!");
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "_tset_\"hi!\"Context", false);
        boolean boolean14 = python3Target1.supportsOverloadedMethods();
        boolean boolean15 = python3Target1.wantsBaseVisitor();
        java.lang.String str17 = python3Target1.getImplicitRuleLabel("Et\\\"hContext");
        java.util.Set<java.lang.String> strSet18 = python3Target1.getBadWords();
        boolean boolean19 = python3Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "tset\\\"hi!" + "'", str8, "tset\\\"hi!");
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "tset_\\\"hi!\\\"Contex" + "'", str13, "tset_\\\"hi!\\\"Contex");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_Et\\\"hContext" + "'", str17, "_Et\\\"hContext");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.templatesExist();
        java.lang.String str11 = python3Target1.getListLabel("\"hi!\"Context");
        boolean boolean12 = python3Target1.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        java.lang.String str14 = python3Target1.getVersion();
        boolean boolean15 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"hi!\"Context" + "'", str11, "\"hi!\"Context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\"hi!\"");
        boolean boolean7 = python3Target1.templatesExist();
        int int8 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "_tset\"_Python3\"", true);
        java.lang.String str13 = python3Target1.getVersion();
        java.util.Set<java.lang.String> strSet14 = python3Target1.getBadWords();
        java.lang.String str16 = python3Target1.getImplicitSetLabel("\"\\\"_Python3\\\"\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python3Target1.getElementName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"Context" + "'", str6, "\"hi!\"Context");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"tset\\\"_Python3\"" + "'", str12, "\"tset\\\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_tset\"\\\"_Python3\\\"\"" + "'", str16, "_tset\"\\\"_Python3\\\"\"");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        boolean boolean3 = python3Target1.wantsBaseListener();
        int int4 = python3Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target1.getImplicitTokenLabel("_tset_\\\\\\\"hi!\\\\\\\"ContexContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.getTemplates();
        boolean boolean7 = python3Target1.wantsBaseListener();
        boolean boolean8 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet9 = python3Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getLoopCounter(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"Python3\"");
        boolean boolean12 = python3Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup14 = python3Target1.getTemplates();
        java.util.Set<java.lang.String> strSet15 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = python3Target1.getCodeGenerator();
        int int17 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        java.lang.String str21 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator18, "_tset_\"Python3\"ContextContext", true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"Python3\"Context" + "'", str11, "\"Python3\"Context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(codeGenerator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 29 + "'", int17 == 29);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"tset_\\\"Python3\\\"ContextContex\"" + "'", str21, "\"tset_\\\"Python3\\\"ContextContex\"");
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\"tset\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"Python3\\\\\\\\\\\\\\\"Context\"");
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("_tsettset_\\\"hi!\\\"Contex");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\"tset\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"Python3\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"Context\\\"\"" + "'", str6, "\"\\\"tset\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"Python3\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"Context\\\"\"");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "__tsettset_\\\"hi!\\\"Contex" + "'", str9, "__tsettset_\\\"hi!\\\"Contex");
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet10 = python3Target1.getBadWords();
        boolean boolean11 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.encodeIntAsCharEscape(100);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\\0Context", true);
        boolean boolean13 = python3Target1.wantsBaseVisitor();
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromString("\"\\\"hi!\\\"\"Context", true);
        boolean boolean17 = python3Target1.wantsBaseVisitor();
        int int18 = python3Target1.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python3Target1.getImplicitTokenLabel("\"\\\\\\\"tset\\\\\\\\\\\\\\\"_Python3\\\\\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"0Contex\"" + "'", str12, "\"0Contex\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\\"\\\\\\\"hi!\\\\\\\"\\\"Context\"" + "'", str16, "\"\\\"\\\\\\\"hi!\\\\\\\"\\\"Context\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 29 + "'", int18 == 29);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\"hi!\"Context");
        boolean boolean10 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"hi!\"Context" + "'", str9, "_\"hi!\"Context");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("Python3", true);
        java.lang.String str12 = python3Target1.getImplicitRuleLabel("\"Python3\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target1.getCodeGenerator();
        int int14 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean15 = python3Target1.templatesExist();
        java.lang.Class<?> wildcardClass16 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Python3\"" + "'", str10, "\"Python3\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_\"Python3\"" + "'", str12, "_\"Python3\"");
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str6 = python3Target1.getImplicitSetLabel("_tset_\"hi!\"Context");
        java.lang.String str8 = python3Target1.getListLabel("_tsettset\\\"hi!");
        java.util.Set<java.lang.String> strSet9 = python3Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getLoopCounter(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset_tset_\"hi!\"Context" + "'", str6, "_tset_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsettset\\\"hi!" + "'", str8, "_tsettset\\\"hi!");
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        boolean boolean5 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getLanguage();
        int int8 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("_tset_\\\"hi!\\\"ContexContext", false);
        boolean boolean12 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset_\\\\\\\"hi!\\\\\\\"ContexContext" + "'", str11, "_tset_\\\\\\\"hi!\\\\\\\"ContexContext");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\"hi!\"Context");
        java.lang.String str10 = python3Target1.getLanguage();
        java.lang.String str12 = python3Target1.getListLabel("_tset_\"hi!\"Context");
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        int int14 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet15 = python3Target1.getBadWords();
        java.util.Set<java.lang.String> strSet16 = python3Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"hi!\"Context" + "'", str9, "_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python3" + "'", str10, "Python3");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_\"hi!\"Context" + "'", str12, "_tset_\"hi!\"Context");
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        boolean boolean4 = python3Target1.wantsBaseListener();
        boolean boolean5 = python3Target1.wantsBaseListener();
        boolean boolean6 = python3Target1.wantsBaseListener();
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getListLabel("\"_Python3\"");
        java.lang.String str5 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        int int9 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str11 = python3Target1.encodeIntAsCharEscape((int) 'a');
        java.lang.String str13 = python3Target1.getListLabel("\"\\\"_\\\"hi!\\\"Contex\"Context");
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("_\"@\"Context");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python3" + "'", str8, "Python3");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "a" + "'", str11, "a");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"_\\\"hi!\\\"Contex\"Context" + "'", str13, "\"\\\"_\\\"hi!\\\"Contex\"Context");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"_\\\"@\\\"Context\"" + "'", str15, "\"_\\\"@\\\"Context\"");
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        boolean boolean4 = python3Target1.wantsBaseListener();
        java.lang.String str5 = python3Target1.getVersion();
        boolean boolean6 = python3Target1.templatesExist();
        java.util.Set<java.lang.String> strSet7 = python3Target1.getBadWords();
        java.lang.String str9 = python3Target1.encodeIntAsCharEscape((int) ' ');
        java.lang.String str11 = python3Target1.getListLabel("_Python3");
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getLoopLabel(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_Python3" + "'", str11, "_Python3");
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "4.5.2.1", true);
        java.lang.String str6 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("\"\\\"_\\\"hi!\\\"Contex\"");
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\".5.2.\"" + "'", str5, "\".5.2.\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_\"\\\"_\\\"hi!\\\"Contex\"" + "'", str8, "_\"\\\"_\\\"hi!\\\"Contex\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        boolean boolean7 = python3Target1.templatesExist();
        java.lang.String str8 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        int int10 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        int int8 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python3Target1.getImplicitRuleLabel("_tset_\"hi!\"ContextContext");
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target1.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target1.getTemplates();
        java.util.Set<java.lang.String> strSet13 = python3Target1.getBadWords();
        org.antlr.v4.tool.Rule rule14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getRuleFunctionContextStructName(rule14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "__tset_\"hi!\"ContextContext" + "'", str10, "__tset_\"hi!\"ContextContext");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getTargetStringLiteralFromString("_Python3");
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target7 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator6);
        int int8 = python3Target7.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet9 = python3Target7.getBadWords();
        int int10 = python3Target7.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target7.getCodeGenerator();
        java.lang.String str13 = python3Target7.getImplicitSetLabel("_\"hi!\"Context");
        java.lang.String str15 = python3Target7.getImplicitSetLabel("_tset");
        java.lang.String str17 = python3Target7.getImplicitSetLabel("\"\\\"Python3\\\"Context\"");
        int int18 = python3Target7.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar19 = null;
        int[] intArray20 = new int[] {};
        java.lang.String[] strArray21 = python3Target7.getTokenTypesAsTargetLabels(grammar19, intArray20);
        java.lang.String[] strArray22 = python3Target1.getTokenTypesAsTargetLabels(grammar5, intArray20);
        int int23 = python3Target1.getInlineTestSetWordSize();
        java.lang.Class<?> wildcardClass24 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_tset_\"hi!\"Context" + "'", str13, "_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset_tset" + "'", str15, "_tset_tset");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_tset\"\\\"Python3\\\"Context\"" + "'", str17, "_tset\"\\\"Python3\\\"Context\"");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 29 + "'", int18 == 29);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[]");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 64 + "'", int23 == 64);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("hi!");
        boolean boolean10 = python3Target1.templatesExist();
        java.lang.String str12 = python3Target1.getImplicitRuleLabel("tset_\\\"hi!\\\"Contex");
        boolean boolean13 = python3Target1.wantsBaseVisitor();
        boolean boolean14 = python3Target1.templatesExist();
        java.lang.String str15 = python3Target1.getLanguage();
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target18 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator17);
        int int19 = python3Target18.getInlineTestSetWordSize();
        java.lang.String str21 = python3Target18.getImplicitSetLabel("\"hi!\"");
        java.lang.String str23 = python3Target18.encodeIntAsCharEscape(0);
        java.lang.String str24 = python3Target18.getVersion();
        java.lang.String str27 = python3Target18.getTargetStringLiteralFromString("Python3", true);
        java.lang.String str29 = python3Target18.getImplicitRuleLabel("\"Python3\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator30 = python3Target18.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar31 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target33 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator32);
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        java.lang.String str37 = python3Target33.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator34, "4.5.2.1", true);
        boolean boolean38 = python3Target33.templatesExist();
        org.antlr.v4.tool.Grammar grammar39 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator40 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target41 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator40);
        int int42 = python3Target41.getInlineTestSetWordSize();
        java.lang.String str44 = python3Target41.getImplicitSetLabel("\"hi!\"");
        java.lang.String str46 = python3Target41.encodeIntAsCharEscape(0);
        java.lang.String str47 = python3Target41.getVersion();
        java.lang.String str49 = python3Target41.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.tool.Grammar grammar50 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator51 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target52 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator51);
        boolean boolean53 = python3Target52.supportsOverloadedMethods();
        java.lang.String str55 = python3Target52.getTargetStringLiteralFromString("_Python3");
        org.antlr.v4.tool.Grammar grammar56 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator57 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target58 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator57);
        int int59 = python3Target58.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet60 = python3Target58.getBadWords();
        int int61 = python3Target58.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator62 = python3Target58.getCodeGenerator();
        java.lang.String str64 = python3Target58.getImplicitSetLabel("_\"hi!\"Context");
        java.lang.String str66 = python3Target58.getImplicitSetLabel("_tset");
        java.lang.String str68 = python3Target58.getImplicitSetLabel("\"\\\"Python3\\\"Context\"");
        int int69 = python3Target58.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar70 = null;
        int[] intArray71 = new int[] {};
        java.lang.String[] strArray72 = python3Target58.getTokenTypesAsTargetLabels(grammar70, intArray71);
        java.lang.String[] strArray73 = python3Target52.getTokenTypesAsTargetLabels(grammar56, intArray71);
        java.lang.String[] strArray74 = python3Target41.getTokenTypesAsTargetLabels(grammar50, intArray71);
        java.lang.String[] strArray75 = python3Target33.getTokenTypesAsTargetLabels(grammar39, intArray71);
        java.lang.String[] strArray76 = python3Target18.getTokenTypesAsTargetLabels(grammar31, intArray71);
        java.lang.String[] strArray77 = python3Target1.getTokenTypesAsTargetLabels(grammar16, intArray71);
        org.antlr.v4.codegen.CodeGenerator codeGenerator78 = python3Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"hi!\"" + "'", str9, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_\\\"hi!\\\"Contex" + "'", str12, "_tset_\\\"hi!\\\"Contex");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python3" + "'", str15, "Python3");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 64 + "'", int19 == 64);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "_tset\"hi!\"" + "'", str21, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\\0" + "'", str23, "\\0");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4.5.2.1" + "'", str24, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"Python3\"" + "'", str27, "\"Python3\"");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "_\"Python3\"" + "'", str29, "_\"Python3\"");
        org.junit.Assert.assertNull(codeGenerator30);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\".5.2.\"" + "'", str37, "\".5.2.\"");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 64 + "'", int42 == 64);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "_tset\"hi!\"" + "'", str44, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\\0" + "'", str46, "\\0");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "4.5.2.1" + "'", str47, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\"hi!\"" + "'", str49, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\"_Python3\"" + "'", str55, "\"_Python3\"");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 64 + "'", int59 == 64);
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 64 + "'", int61 == 64);
        org.junit.Assert.assertNull(codeGenerator62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "_tset_\"hi!\"Context" + "'", str64, "_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "_tset_tset" + "'", str66, "_tset_tset");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "_tset\"\\\"Python3\\\"Context\"" + "'", str68, "_tset\"\\\"Python3\\\"Context\"");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 29 + "'", int69 == 29);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[]");
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNull(codeGenerator78);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        int int8 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python3Target1.getImplicitRuleLabel("_tset_\"hi!\"ContextContext");
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target1.getTemplates();
        java.lang.String str14 = python3Target1.getAltLabelContextStructName("_tset\"_tset_\\\\\\\"\\\\\\\\\\\\\\\"_\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"Contex\\\\\\\"Context\"");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "__tset_\"hi!\"ContextContext" + "'", str10, "__tset_\"hi!\"ContextContext");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset\"_tset_\\\\\\\"\\\\\\\\\\\\\\\"_\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"Contex\\\\\\\"Context\"Context" + "'", str14, "_tset\"_tset_\\\\\\\"\\\\\\\\\\\\\\\"_\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"Contex\\\\\\\"Context\"Context");
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_Python3");
        int int8 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean9 = python3Target1.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getElementName("\"\\\"hi!\\\"\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_Python3\"" + "'", str7, "\"_Python3\"");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str6 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getListLabel("tset\\\"hi!");
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "_tset_\"hi!\"Context", false);
        boolean boolean14 = python3Target1.supportsOverloadedMethods();
        java.lang.String str16 = python3Target1.getImplicitSetLabel("");
        boolean boolean17 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "tset\\\"hi!" + "'", str8, "tset\\\"hi!");
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "tset_\\\"hi!\\\"Contex" + "'", str13, "tset_\\\"hi!\\\"Contex");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_tset" + "'", str16, "_tset");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"Python3\"");
        boolean boolean12 = python3Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        boolean boolean14 = python3Target1.wantsBaseVisitor();
        java.lang.String str16 = python3Target1.encodeIntAsCharEscape((int) (short) 10);
        java.lang.String str18 = python3Target1.getImplicitRuleLabel("d");
        java.lang.String str20 = python3Target1.getImplicitRuleLabel("_tset\"\\\"hi!\\\"\"ContextContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        java.lang.String str24 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator21, "\"hi!\\\\\\\"Contex\"", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = python3Target1.getElementListName("_tset__\"\\\"_\\\"hi!\\\"Contex\"ContextContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"Python3\"Context" + "'", str11, "\"Python3\"Context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\\n" + "'", str16, "\\n");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_d" + "'", str18, "_d");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "__tset\"\\\"hi!\\\"\"ContextContext" + "'", str20, "__tset\"\\\"hi!\\\"\"ContextContext");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!\\\\\\\"Contex" + "'", str24, "hi!\\\\\\\"Contex");
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        boolean boolean6 = python3Target1.templatesExist();
        int int7 = python3Target1.getInlineTestSetWordSize();
        int int8 = python3Target1.getInlineTestSetWordSize();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromString("_\\\"hi!\\\"", false);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getRuleFunctionContextStructName(ruleFunction13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_\\\\\\\"hi!\\\\\\\"" + "'", str12, "_\\\\\\\"hi!\\\\\\\"");
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("Python3");
        java.lang.String str8 = python3Target1.getImplicitSetLabel("_tset_\"Python3\"");
        int int9 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getLoopCounter(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"Python3\"" + "'", str6, "\"Python3\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset_tset_\"Python3\"" + "'", str8, "_tset_tset_\"Python3\"");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        boolean boolean10 = python3Target1.wantsBaseListener();
        java.lang.String str12 = python3Target1.getListLabel("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        boolean boolean10 = python3Target1.wantsBaseListener();
        java.lang.String str12 = python3Target1.getImplicitSetLabel("");
        java.lang.String str14 = python3Target1.getImplicitRuleLabel("\\0");
        java.lang.String str16 = python3Target1.getImplicitSetLabel("tset\\\"\\\"_Python3\\\"\\\"Contex");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset" + "'", str12, "_tset");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_\\0" + "'", str14, "_\\0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_tsettset\\\"\\\"_Python3\\\"\\\"Contex" + "'", str16, "_tsettset\\\"\\\"_Python3\\\"\\\"Contex");
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("hi!");
        boolean boolean10 = python3Target1.templatesExist();
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        boolean boolean12 = python3Target1.supportsOverloadedMethods();
        java.lang.String str13 = python3Target1.getVersion();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"hi!\"" + "'", str9, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\"hi!\"");
        java.lang.String str7 = python3Target1.getVersion();
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet9 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target13 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator12);
        int int14 = python3Target13.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet15 = python3Target13.getBadWords();
        int int16 = python3Target13.getInlineTestSetWordSize();
        java.lang.String str19 = python3Target13.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python3Target13.getCodeGenerator();
        boolean boolean21 = python3Target13.templatesExist();
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target24 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator23);
        int int25 = python3Target24.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet26 = python3Target24.getBadWords();
        int int27 = python3Target24.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator28 = python3Target24.getCodeGenerator();
        java.lang.String str30 = python3Target24.getImplicitSetLabel("_\"hi!\"Context");
        java.lang.String str32 = python3Target24.getImplicitSetLabel("_tset");
        java.lang.String str34 = python3Target24.getImplicitSetLabel("\"\\\"Python3\\\"Context\"");
        int int35 = python3Target24.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar36 = null;
        int[] intArray37 = new int[] {};
        java.lang.String[] strArray38 = python3Target24.getTokenTypesAsTargetLabels(grammar36, intArray37);
        java.lang.String[] strArray39 = python3Target13.getTokenTypesAsTargetLabels(grammar22, intArray37);
        java.lang.String[] strArray40 = python3Target1.getTokenTypesAsTargetLabels(grammar11, intArray37);
        org.stringtemplate.v4.STGroup sTGroup41 = python3Target1.getTemplates();
        boolean boolean42 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"Context" + "'", str6, "\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_tset\\\"hi!\\\"" + "'", str19, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 64 + "'", int25 == 64);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 64 + "'", int27 == 64);
        org.junit.Assert.assertNull(codeGenerator28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "_tset_\"hi!\"Context" + "'", str30, "_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "_tset_tset" + "'", str32, "_tset_tset");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "_tset\"\\\"Python3\\\"Context\"" + "'", str34, "_tset\"\\\"Python3\\\"Context\"");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 29 + "'", int35 == 29);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[]");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(sTGroup41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("\"\\\"hi!\\\"\"Context", false);
        java.lang.String str13 = python3Target1.getListLabel("_\"Python3\"");
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("");
        boolean boolean16 = python3Target1.supportsOverloadedMethods();
        java.lang.String str18 = python3Target1.getAltLabelContextStructName("_\\0");
        java.lang.String str20 = python3Target1.getImplicitRuleLabel("\"_\\\\0Context\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\\"\\\\\\\"hi!\\\\\\\"\\\"Context" + "'", str11, "\\\"\\\\\\\"hi!\\\\\\\"\\\"Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_\"Python3\"" + "'", str13, "_\"Python3\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\"" + "'", str15, "\"\"");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_\\0Context" + "'", str18, "_\\0Context");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "_\"_\\\\0Context\"" + "'", str20, "_\"_\\\\0Context\"");
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\"hi!\"Context");
        java.lang.String str10 = python3Target1.getLanguage();
        java.lang.String str12 = python3Target1.getListLabel("_tset_\"hi!\"Context");
        java.lang.String str14 = python3Target1.getImplicitRuleLabel(" ");
        boolean boolean15 = python3Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"hi!\"Context" + "'", str9, "_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python3" + "'", str10, "Python3");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_\"hi!\"Context" + "'", str12, "_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_ " + "'", str14, "_ ");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target1.getCodeGenerator();
        int int11 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str12 = python3Target1.getVersion();
        boolean boolean13 = python3Target1.supportsOverloadedMethods();
        boolean boolean14 = python3Target1.wantsBaseListener();
        java.lang.String str15 = python3Target1.getLanguage();
        boolean boolean16 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29 + "'", int11 == 29);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python3" + "'", str15, "Python3");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        boolean boolean11 = python3Target1.wantsBaseVisitor();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("\"_Python3\"");
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("\"__\\\"\\\\\\\"hi!\\\\\\\"\\\"\"Context");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"_Python3\\\"\"" + "'", str13, "\"\\\"_Python3\\\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"__\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"Context\"" + "'", str15, "\"\\\"__\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"\\\"Context\"");
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str6 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getListLabel("tset\\\"hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        int int10 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = codeGenerator11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "tset\\\"hi!" + "'", str8, "tset\\\"hi!");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertNull(codeGenerator11);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\"hi!\"");
        java.lang.String str7 = python3Target1.getVersion();
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet9 = python3Target1.getBadWords();
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("_tset", true);
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("\"tset\\\"_Python3\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python3Target1.getCodeGenerator();
        int int18 = python3Target1.getInlineTestSetWordSize();
        int int19 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"Context" + "'", str6, "\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"_tset\"" + "'", str13, "\"_tset\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"tset\\\\\\\"_Python3\\\"\"" + "'", str15, "\"\\\"tset\\\\\\\"_Python3\\\"\"");
        org.junit.Assert.assertNull(codeGenerator16);
        org.junit.Assert.assertNull(codeGenerator17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 64 + "'", int19 == 64);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "_tset\"hi!\"", false);
        boolean boolean10 = python3Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getElementListName("_tset_\"hi!\"ContextContextContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "tset\\\"hi!" + "'", str9, "tset\\\"hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(codeGenerator11);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.templatesExist();
        java.util.Set<java.lang.String> strSet10 = python3Target1.getBadWords();
        int int11 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        int int8 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python3Target1.getImplicitRuleLabel("_tset_\"hi!\"ContextContext");
        java.lang.String str12 = python3Target1.getAltLabelContextStructName("_tset__\"\\\"_\\\"hi!\\\"Contex\"Context");
        java.lang.String str13 = python3Target1.getVersion();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "__tset_\"hi!\"ContextContext" + "'", str10, "__tset_\"hi!\"ContextContext");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset__\"\\\"_\\\"hi!\\\"Contex\"ContextContext" + "'", str12, "_tset__\"\\\"_\\\"hi!\\\"Contex\"ContextContext");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.encodeIntAsCharEscape(100);
        java.lang.String str10 = python3Target1.getAltLabelContextStructName("_\"_tset\\\"\\\\\\\"_\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"Contex\\\\\\\"\\\"\"Context");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_\"_tset\\\"\\\\\\\"_\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"Contex\\\\\\\"\\\"\"ContextContext" + "'", str10, "_\"_tset\\\"\\\\\\\"_\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"Contex\\\\\\\"\\\"\"ContextContext");
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\"hi!\"");
        java.lang.String str7 = python3Target1.getVersion();
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        java.lang.String str10 = python3Target1.getListLabel("\"hi!\"");
        java.lang.String str11 = python3Target1.getLanguage();
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\"_tset_\\\\35\"", true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"Context" + "'", str6, "\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"hi!\"" + "'", str10, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python3" + "'", str11, "Python3");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"_tset_\\\\\\\\35\\\"\"" + "'", str14, "\"\\\"_tset_\\\\\\\\35\\\"\"");
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getImplicitSetLabel("\"_Python3\"");
        java.lang.String str8 = python3Target1.getVersion();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\"_Python3\"" + "'", str7, "_tset\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(sTGroup10);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("hi!");
        boolean boolean10 = python3Target1.templatesExist();
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        boolean boolean12 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "tset\\\"\\\"Python3\\\"Context", false);
        java.lang.String str19 = python3Target1.getTargetStringLiteralFromString("tset\\\"hi!", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        java.lang.String str23 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator20, "\\\"tset_\\\\\\\"hi!\\\\\\\"ContextContex\\\"", true);
        java.lang.String str25 = python3Target1.getAltLabelContextStructName("\\\"@\\\"");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"hi!\"" + "'", str9, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "set\\\"\\\"Python3\\\"Contex" + "'", str16, "set\\\"\\\"Python3\\\"Contex");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"tset\\\\\\\"hi!\"" + "'", str19, "\"tset\\\\\\\"hi!\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"\\\"tset_\\\\\\\"hi!\\\\\\\"ContextContex\\\"\"" + "'", str23, "\"\\\"tset_\\\\\\\"hi!\\\\\\\"ContextContex\\\"\"");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\\\"@\\\"Context" + "'", str25, "\\\"@\\\"Context");
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\"hi!\"Context");
        java.lang.String str10 = python3Target1.getLanguage();
        java.lang.String str12 = python3Target1.getListLabel("_tset_\"hi!\"Context");
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("\"Python3\"Context", false);
        java.lang.String str18 = python3Target1.getTargetStringLiteralFromString("_tset\"\\\\35\"", false);
        int int19 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"hi!\"Context" + "'", str9, "_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python3" + "'", str10, "Python3");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_\"hi!\"Context" + "'", str12, "_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\\"Python3\\\"Context" + "'", str15, "\\\"Python3\\\"Context");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset\\\"\\\\\\\\35\\\"" + "'", str18, "_tset\\\"\\\\\\\\35\\\"");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 64 + "'", int19 == 64);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\"hi!\"Context");
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("_Python3");
        int int12 = python3Target1.getInlineTestSetWordSize();
        boolean boolean13 = python3Target1.wantsBaseListener();
        org.antlr.v4.tool.Rule rule14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getRuleFunctionContextStructName(rule14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"hi!\"Context" + "'", str9, "_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"_Python3\"" + "'", str11, "\"_Python3\"");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"Python3\"");
        java.lang.String str13 = python3Target1.getImplicitRuleLabel("\"Python3\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\\0ContextContext", false);
        java.lang.String str19 = python3Target1.getListLabel("\"tset4.5.2.1Contex\"");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"Python3\"Context" + "'", str11, "\"Python3\"Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_\"Python3\"" + "'", str13, "_\"Python3\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0ContextContex" + "'", str17, "0ContextContex");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"tset4.5.2.1Contex\"" + "'", str19, "\"tset4.5.2.1Contex\"");
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str6 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("_tset_\"Python3\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getElementName("\"hi!\\\\\\\"Contex\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset_\"Python3\"Context" + "'", str8, "_tset_\"Python3\"Context");
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("hi!");
        boolean boolean10 = python3Target1.templatesExist();
        boolean boolean11 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target15 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator14);
        int int16 = python3Target15.getInlineTestSetWordSize();
        java.lang.String str18 = python3Target15.getImplicitSetLabel("\"hi!\"");
        java.lang.String str20 = python3Target15.encodeIntAsCharEscape(0);
        boolean boolean21 = python3Target15.supportsOverloadedMethods();
        int int22 = python3Target15.getInlineTestSetWordSize();
        java.lang.String str24 = python3Target15.getImplicitRuleLabel("_tset_\"hi!\"ContextContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = python3Target15.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        java.lang.String str29 = python3Target15.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator26, "__\"\\\"_\\\"hi!\\\"Contex\"Context", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator30 = python3Target15.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar31 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target33 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator32);
        boolean boolean34 = python3Target33.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet35 = python3Target33.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator36 = python3Target33.getCodeGenerator();
        java.lang.String str38 = python3Target33.getAltLabelContextStructName("\"\\\"_\\\"hi!\\\"Contex\"");
        java.lang.String str40 = python3Target33.getListLabel("_tset\"\\\"_\\\"hi!\\\"Contex\"");
        org.antlr.v4.tool.Grammar grammar41 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target43 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator42);
        int int44 = python3Target43.getInlineTestSetWordSize();
        java.lang.String str46 = python3Target43.getImplicitSetLabel("\"hi!\"");
        java.lang.String str48 = python3Target43.encodeIntAsCharEscape(0);
        java.lang.String str49 = python3Target43.getVersion();
        java.lang.String str51 = python3Target43.getTargetStringLiteralFromString("hi!");
        java.lang.String str53 = python3Target43.getListLabel("");
        java.lang.String str54 = python3Target43.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator55 = null;
        java.lang.String str58 = python3Target43.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator55, "_tset_tset_\"hi!\"Context", false);
        org.stringtemplate.v4.STGroup sTGroup59 = python3Target43.getTemplates();
        org.antlr.v4.tool.Grammar grammar60 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator61 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target62 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator61);
        int int63 = python3Target62.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet64 = python3Target62.getBadWords();
        boolean boolean65 = python3Target62.wantsBaseListener();
        int int66 = python3Target62.getSerializedATNSegmentLimit();
        boolean boolean67 = python3Target62.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar68 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator69 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target70 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator69);
        int int71 = python3Target70.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet72 = python3Target70.getBadWords();
        int int73 = python3Target70.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator74 = python3Target70.getCodeGenerator();
        java.lang.String str76 = python3Target70.getImplicitSetLabel("_\"hi!\"Context");
        java.lang.String str78 = python3Target70.getImplicitSetLabel("_tset");
        java.lang.String str80 = python3Target70.getImplicitSetLabel("\"\\\"Python3\\\"Context\"");
        int int81 = python3Target70.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar82 = null;
        int[] intArray83 = new int[] {};
        java.lang.String[] strArray84 = python3Target70.getTokenTypesAsTargetLabels(grammar82, intArray83);
        java.lang.String[] strArray85 = python3Target62.getTokenTypesAsTargetLabels(grammar68, intArray83);
        java.lang.String[] strArray86 = python3Target43.getTokenTypesAsTargetLabels(grammar60, intArray83);
        java.lang.String[] strArray87 = python3Target33.getTokenTypesAsTargetLabels(grammar41, intArray83);
        java.lang.String[] strArray88 = python3Target15.getTokenTypesAsTargetLabels(grammar31, intArray83);
        java.lang.String[] strArray89 = python3Target1.getTokenTypesAsTargetLabels(grammar13, intArray83);
        org.antlr.v4.tool.Rule rule90 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str91 = python3Target1.getRuleFunctionContextStructName(rule90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"hi!\"" + "'", str9, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset\"hi!\"" + "'", str18, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\\0" + "'", str20, "\\0");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 64 + "'", int22 == 64);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "__tset_\"hi!\"ContextContext" + "'", str24, "__tset_\"hi!\"ContextContext");
        org.junit.Assert.assertNull(codeGenerator25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"_\\\"\\\"_\\\"hi!\\\"Contex\\\"Contex\"" + "'", str29, "\"_\\\"\\\"_\\\"hi!\\\"Contex\\\"Contex\"");
        org.junit.Assert.assertNull(codeGenerator30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNull(codeGenerator36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\"\\\"_\\\"hi!\\\"Contex\"Context" + "'", str38, "\"\\\"_\\\"hi!\\\"Contex\"Context");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "_tset\"\\\"_\\\"hi!\\\"Contex\"" + "'", str40, "_tset\"\\\"_\\\"hi!\\\"Contex\"");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 64 + "'", int44 == 64);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "_tset\"hi!\"" + "'", str46, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\\0" + "'", str48, "\\0");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "4.5.2.1" + "'", str49, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\"hi!\"" + "'", str51, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "4.5.2.1" + "'", str54, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "tset_tset_\\\"hi!\\\"Contex" + "'", str58, "tset_tset_\\\"hi!\\\"Contex");
        org.junit.Assert.assertNotNull(sTGroup59);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 64 + "'", int63 == 64);
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 29 + "'", int66 == 29);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 64 + "'", int71 == 64);
        org.junit.Assert.assertNotNull(strSet72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 64 + "'", int73 == 64);
        org.junit.Assert.assertNull(codeGenerator74);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "_tset_\"hi!\"Context" + "'", str76, "_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "_tset_tset" + "'", str78, "_tset_tset");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "_tset\"\\\"Python3\\\"Context\"" + "'", str80, "_tset\"\\\"Python3\\\"Context\"");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 29 + "'", int81 == 29);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[]");
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertNotNull(strArray89);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.encodeIntAsCharEscape(100);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\\0Context", true);
        boolean boolean13 = python3Target1.wantsBaseVisitor();
        int int14 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python3Target1.getCodeGenerator();
        java.lang.String str17 = python3Target1.getImplicitSetLabel("_tset\\\"_tset_\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"Contex\\\"");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target1.getRuleFunctionContextStructName(ruleFunction18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"0Contex\"" + "'", str12, "\"0Contex\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_tset_tset\\\"_tset_\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"Contex\\\"" + "'", str17, "_tset_tset\\\"_tset_\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"Contex\\\"");
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        boolean boolean10 = python3Target1.wantsBaseListener();
        java.lang.String str12 = python3Target1.encodeIntAsCharEscape((int) (byte) 0);
        java.lang.String str14 = python3Target1.getImplicitRuleLabel("");
        java.lang.String str15 = python3Target1.getVersion();
        java.lang.String str17 = python3Target1.getAltLabelContextStructName("\"\\\"\\\\\\\"Python3\\\\\\\"Context\\\"\"Context");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_" + "'", str14, "_");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4.5.2.1" + "'", str15, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\\\"\\\\\\\"Python3\\\\\\\"Context\\\"\"ContextContext" + "'", str17, "\"\\\"\\\\\\\"Python3\\\\\\\"Context\\\"\"ContextContext");
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("", false);
        boolean boolean6 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(codeGenerator7);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str6 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getListLabel("tset\\\"hi!");
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "_tset_\"hi!\"Context", false);
        boolean boolean14 = python3Target1.supportsOverloadedMethods();
        java.lang.String str16 = python3Target1.getImplicitSetLabel("");
        java.lang.String str18 = python3Target1.getTargetStringLiteralFromString("__Python3Context");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "tset\\\"hi!" + "'", str8, "tset\\\"hi!");
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "tset_\\\"hi!\\\"Contex" + "'", str13, "tset_\\\"hi!\\\"Contex");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_tset" + "'", str16, "_tset");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"__Python3Context\"" + "'", str18, "\"__Python3Context\"");
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        boolean boolean4 = python3Target1.wantsBaseListener();
        boolean boolean5 = python3Target1.wantsBaseListener();
        boolean boolean6 = python3Target1.wantsBaseListener();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("\"_\\\"Tset\\\\\\\\\\\\\\\"hi!Context\\\"Context\"");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getRuleFunctionContextStructName(ruleFunction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"_\\\\\\\"Tset\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!Context\\\\\\\"Context\\\"\"" + "'", str8, "\"\\\"_\\\\\\\"Tset\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!Context\\\\\\\"Context\\\"\"");
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("\\n");
        java.lang.String str10 = python3Target1.getAltLabelContextStructName("\"set\\\\\\\"hi\"");
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromString("\"tset\\\"\\\\\\\\35\\\"\"");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\nContext" + "'", str8, "\\nContext");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"set\\\\\\\"hi\"Context" + "'", str10, "\"set\\\\\\\"hi\"Context");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"tset\\\\\\\"\\\\\\\\\\\\\\\\35\\\\\\\"\\\"\"" + "'", str12, "\"\\\"tset\\\\\\\"\\\\\\\\\\\\\\\\35\\\\\\\"\\\"\"");
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"Python3\"");
        boolean boolean12 = python3Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        boolean boolean14 = python3Target1.wantsBaseVisitor();
        java.lang.String str15 = python3Target1.getLanguage();
        org.antlr.v4.tool.Grammar grammar16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python3Target1.getTokenTypeAsTargetLabel(grammar16, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"Python3\"Context" + "'", str11, "\"Python3\"Context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python3" + "'", str15, "Python3");
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\\0", false);
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("\"Python3\"");
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator10);
        int int12 = python3Target11.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet13 = python3Target11.getBadWords();
        int int14 = python3Target11.getInlineTestSetWordSize();
        java.lang.String str17 = python3Target11.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python3Target11.getCodeGenerator();
        boolean boolean19 = python3Target11.templatesExist();
        org.antlr.v4.tool.Grammar grammar20 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target22 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator21);
        int int23 = python3Target22.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet24 = python3Target22.getBadWords();
        int int25 = python3Target22.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = python3Target22.getCodeGenerator();
        java.lang.String str28 = python3Target22.getImplicitSetLabel("_\"hi!\"Context");
        java.lang.String str30 = python3Target22.getImplicitSetLabel("_tset");
        java.lang.String str32 = python3Target22.getImplicitSetLabel("\"\\\"Python3\\\"Context\"");
        int int33 = python3Target22.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar34 = null;
        int[] intArray35 = new int[] {};
        java.lang.String[] strArray36 = python3Target22.getTokenTypesAsTargetLabels(grammar34, intArray35);
        java.lang.String[] strArray37 = python3Target11.getTokenTypesAsTargetLabels(grammar20, intArray35);
        java.lang.String[] strArray38 = python3Target1.getTokenTypesAsTargetLabels(grammar9, intArray35);
        boolean boolean39 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\\\0" + "'", str6, "\\\\0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_\"Python3\"" + "'", str8, "_\"Python3\"");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_tset\\\"hi!\\\"" + "'", str17, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 64 + "'", int23 == 64);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 64 + "'", int25 == 64);
        org.junit.Assert.assertNull(codeGenerator26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "_tset_\"hi!\"Context" + "'", str28, "_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "_tset_tset" + "'", str30, "_tset_tset");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "_tset\"\\\"Python3\\\"Context\"" + "'", str32, "_tset\"\\\"Python3\\\"Context\"");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 29 + "'", int33 == 29);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[]");
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("hi!");
        java.lang.String str11 = python3Target1.getListLabel("");
        java.lang.String str12 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "_tset_tset_\"hi!\"Context", false);
        org.stringtemplate.v4.STGroup sTGroup17 = python3Target1.getTemplates();
        boolean boolean18 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        java.lang.String str22 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator19, "\"\\\"_tsettset\\\\\\\\\\\\\\\"hi!\\\"\"", true);
        java.lang.String str24 = python3Target1.getImplicitSetLabel("\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"Python3\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\"Context");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"hi!\"" + "'", str9, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "tset_tset_\\\"hi!\\\"Contex" + "'", str16, "tset_tset_\\\"hi!\\\"Contex");
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"\\\"_tsettset\\\\\\\\\\\\\\\"hi!\\\"\"" + "'", str22, "\"\\\"_tsettset\\\\\\\\\\\\\\\"hi!\\\"\"");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "_tset\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"Python3\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\"Context" + "'", str24, "_tset\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"Python3\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\"Context");
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getImplicitRuleLabel("\"tset4.5.2.1Contex\"");
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape(10);
        int int6 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_\"tset4.5.2.1Contex\"" + "'", str3, "_\"tset4.5.2.1Contex\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\n" + "'", str5, "\\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("Python3", true);
        java.lang.String str12 = python3Target1.getImplicitRuleLabel("\"Python3\"");
        java.lang.String str13 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"Python3\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\"", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target1.encodeIntAsCharEscape((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Python3\"" + "'", str10, "\"Python3\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_\"Python3\"" + "'", str12, "_\"Python3\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python3" + "'", str13, "Python3");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\\"\\\\\\\"\\\\\\\\\\\\\\\"Python3\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"" + "'", str17, "\\\"\\\\\\\"\\\\\\\\\\\\\\\"Python3\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"");
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getLanguage();
        boolean boolean6 = python3Target1.templatesExist();
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        java.lang.String str9 = python3Target1.getAltLabelContextStructName("\"Tset\\\\\\\"hi!Context\"");
        java.lang.String str11 = python3Target1.getListLabel("\"\\\"\\\\\\\"_Python3\\\\\\\"\\\"ContextContext\"");
        java.lang.String str13 = python3Target1.encodeIntAsCharEscape((int) '4');
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("\"_\"");
        boolean boolean16 = python3Target1.wantsBaseListener();
        java.lang.String str17 = python3Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"Tset\\\\\\\"hi!Context\"Context" + "'", str9, "\"Tset\\\\\\\"hi!Context\"Context");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"\\\\\\\"_Python3\\\\\\\"\\\"ContextContext\"" + "'", str11, "\"\\\"\\\\\\\"_Python3\\\\\\\"\\\"ContextContext\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\64" + "'", str13, "\\64");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"_\\\"\"" + "'", str15, "\"\\\"_\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Python3" + "'", str17, "Python3");
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.encodeIntAsCharEscape(100);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\\0Context", true);
        boolean boolean13 = python3Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup14 = python3Target1.getTemplates();
        boolean boolean15 = python3Target1.wantsBaseVisitor();
        java.lang.String str17 = python3Target1.encodeIntAsCharEscape((int) '4');
        boolean boolean18 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = python3Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python3Target1.getImplicitTokenLabel("__DContextContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"0Contex\"" + "'", str12, "\"0Contex\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\64" + "'", str17, "\\64");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(codeGenerator19);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        boolean boolean4 = python3Target1.wantsBaseListener();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("\"\\\"hi!\\\"\"");
        int int7 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_\"\\\"hi!\\\"\"" + "'", str6, "_\"\\\"hi!\\\"\"");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target1.getCodeGenerator();
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape((int) (short) 10);
        java.util.Set<java.lang.String> strSet7 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\"0ContextContex\"", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\n" + "'", str6, "\\n");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"0ContextContex\"" + "'", str11, "\"0ContextContex\"");
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        boolean boolean6 = python3Target1.templatesExist();
        int int7 = python3Target1.getInlineTestSetWordSize();
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getLoopCounter(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "4.5.2.1", true);
        java.lang.String str6 = python3Target1.getVersion();
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str9 = python3Target1.getListLabel("tset_\\\"hi!\\\"Contex");
        int int10 = python3Target1.getSerializedATNSegmentLimit();
        int int11 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\".5.2.\"" + "'", str5, "\".5.2.\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "tset_\\\"hi!\\\"Contex" + "'", str9, "tset_\\\"hi!\\\"Contex");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29 + "'", int11 == 29);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("Python3", true);
        java.lang.String str12 = python3Target1.getImplicitRuleLabel("\"Python3\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target16 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator15);
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        java.lang.String str20 = python3Target16.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator17, "4.5.2.1", true);
        boolean boolean21 = python3Target16.templatesExist();
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target24 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator23);
        int int25 = python3Target24.getInlineTestSetWordSize();
        java.lang.String str27 = python3Target24.getImplicitSetLabel("\"hi!\"");
        java.lang.String str29 = python3Target24.encodeIntAsCharEscape(0);
        java.lang.String str30 = python3Target24.getVersion();
        java.lang.String str32 = python3Target24.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.tool.Grammar grammar33 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target35 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator34);
        boolean boolean36 = python3Target35.supportsOverloadedMethods();
        java.lang.String str38 = python3Target35.getTargetStringLiteralFromString("_Python3");
        org.antlr.v4.tool.Grammar grammar39 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator40 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target41 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator40);
        int int42 = python3Target41.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet43 = python3Target41.getBadWords();
        int int44 = python3Target41.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator45 = python3Target41.getCodeGenerator();
        java.lang.String str47 = python3Target41.getImplicitSetLabel("_\"hi!\"Context");
        java.lang.String str49 = python3Target41.getImplicitSetLabel("_tset");
        java.lang.String str51 = python3Target41.getImplicitSetLabel("\"\\\"Python3\\\"Context\"");
        int int52 = python3Target41.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar53 = null;
        int[] intArray54 = new int[] {};
        java.lang.String[] strArray55 = python3Target41.getTokenTypesAsTargetLabels(grammar53, intArray54);
        java.lang.String[] strArray56 = python3Target35.getTokenTypesAsTargetLabels(grammar39, intArray54);
        java.lang.String[] strArray57 = python3Target24.getTokenTypesAsTargetLabels(grammar33, intArray54);
        java.lang.String[] strArray58 = python3Target16.getTokenTypesAsTargetLabels(grammar22, intArray54);
        java.lang.String[] strArray59 = python3Target1.getTokenTypesAsTargetLabels(grammar14, intArray54);
        java.lang.String str60 = python3Target1.getVersion();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Python3\"" + "'", str10, "\"Python3\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_\"Python3\"" + "'", str12, "_\"Python3\"");
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\".5.2.\"" + "'", str20, "\".5.2.\"");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 64 + "'", int25 == 64);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "_tset\"hi!\"" + "'", str27, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\\0" + "'", str29, "\\0");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "4.5.2.1" + "'", str30, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"hi!\"" + "'", str32, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\"_Python3\"" + "'", str38, "\"_Python3\"");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 64 + "'", int42 == 64);
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 64 + "'", int44 == 64);
        org.junit.Assert.assertNull(codeGenerator45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "_tset_\"hi!\"Context" + "'", str47, "_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "_tset_tset" + "'", str49, "_tset_tset");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "_tset\"\\\"Python3\\\"Context\"" + "'", str51, "_tset\"\\\"Python3\\\"Context\"");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 29 + "'", int52 == 29);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[]");
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "4.5.2.1" + "'", str60, "4.5.2.1");
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("Python3", true);
        java.lang.String str12 = python3Target1.getImplicitRuleLabel("\"Python3\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target1.getCodeGenerator();
        int int14 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        java.lang.String str18 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator15, "_tset4.5.2.1Context", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Python3\"" + "'", str10, "\"Python3\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_\"Python3\"" + "'", str12, "_\"Python3\"");
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"tset4.5.2.1Contex\"" + "'", str18, "\"tset4.5.2.1Contex\"");
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        boolean boolean10 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet11 = python3Target1.getBadWords();
        int int12 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "\"tset\\\"hi!\\\"\"", false);
        java.lang.String str18 = python3Target1.getAltLabelContextStructName("\"\\\"_\\\\\\\"@\\\\\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 29 + "'", int12 == 29);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "tset\\\"hi!\\\"" + "'", str16, "tset\\\"hi!\\\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\\\"_\\\\\\\"@\\\\\\\"\\\"\"Context" + "'", str18, "\"\\\"_\\\\\\\"@\\\\\\\"\\\"\"Context");
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getImplicitSetLabel("tset\\\"hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\\0Context", true);
        org.antlr.v4.tool.Grammar grammar12 = null;
        int[] intArray13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray14 = python3Target1.getTokenTypesAsTargetLabels(grammar12, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tsettset\\\"hi!" + "'", str7, "_tsettset\\\"hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"0Contex\"" + "'", str11, "\"0Contex\"");
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        boolean boolean5 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getLanguage();
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("_", false);
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_" + "'", str10, "_");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getListLabel("\"_Python3\"");
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\"_tset4.5.2.1\"");
        boolean boolean7 = python3Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet8 = python3Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\"_tset4.5.2.1\\\"\"" + "'", str6, "\"\\\"_tset4.5.2.1\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("", false);
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        java.lang.String str8 = python3Target1.getListLabel("\\0");
        int int9 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "\"_\\\\0Context\"", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getImplicitTokenLabel("_tset\\0ContextContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\0" + "'", str8, "\\0");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_\\\\0Context" + "'", str13, "_\\\\0Context");
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        int int8 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python3Target1.getImplicitRuleLabel("_tset_\"hi!\"ContextContext");
        java.lang.String str12 = python3Target1.getAltLabelContextStructName("_tset__\"\\\"_\\\"hi!\\\"Contex\"Context");
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target15 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator14);
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        java.lang.String str19 = python3Target15.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator16, "4.5.2.1", true);
        boolean boolean20 = python3Target15.templatesExist();
        org.antlr.v4.tool.Grammar grammar21 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target23 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator22);
        int int24 = python3Target23.getInlineTestSetWordSize();
        java.lang.String str26 = python3Target23.getImplicitSetLabel("\"hi!\"");
        java.lang.String str28 = python3Target23.encodeIntAsCharEscape(0);
        java.lang.String str29 = python3Target23.getVersion();
        java.lang.String str31 = python3Target23.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.tool.Grammar grammar32 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target34 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator33);
        boolean boolean35 = python3Target34.supportsOverloadedMethods();
        java.lang.String str37 = python3Target34.getTargetStringLiteralFromString("_Python3");
        org.antlr.v4.tool.Grammar grammar38 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator39 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target40 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator39);
        int int41 = python3Target40.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet42 = python3Target40.getBadWords();
        int int43 = python3Target40.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator44 = python3Target40.getCodeGenerator();
        java.lang.String str46 = python3Target40.getImplicitSetLabel("_\"hi!\"Context");
        java.lang.String str48 = python3Target40.getImplicitSetLabel("_tset");
        java.lang.String str50 = python3Target40.getImplicitSetLabel("\"\\\"Python3\\\"Context\"");
        int int51 = python3Target40.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar52 = null;
        int[] intArray53 = new int[] {};
        java.lang.String[] strArray54 = python3Target40.getTokenTypesAsTargetLabels(grammar52, intArray53);
        java.lang.String[] strArray55 = python3Target34.getTokenTypesAsTargetLabels(grammar38, intArray53);
        java.lang.String[] strArray56 = python3Target23.getTokenTypesAsTargetLabels(grammar32, intArray53);
        java.lang.String[] strArray57 = python3Target15.getTokenTypesAsTargetLabels(grammar21, intArray53);
        java.lang.String[] strArray58 = python3Target1.getTokenTypesAsTargetLabels(grammar13, intArray53);
        java.lang.String str59 = python3Target1.getVersion();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction60 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str61 = python3Target1.getRuleFunctionContextStructName(ruleFunction60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "__tset_\"hi!\"ContextContext" + "'", str10, "__tset_\"hi!\"ContextContext");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset__\"\\\"_\\\"hi!\\\"Contex\"ContextContext" + "'", str12, "_tset__\"\\\"_\\\"hi!\\\"Contex\"ContextContext");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\".5.2.\"" + "'", str19, "\".5.2.\"");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 64 + "'", int24 == 64);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "_tset\"hi!\"" + "'", str26, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\\0" + "'", str28, "\\0");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "4.5.2.1" + "'", str29, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\"hi!\"" + "'", str31, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\"_Python3\"" + "'", str37, "\"_Python3\"");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 64 + "'", int41 == 64);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 64 + "'", int43 == 64);
        org.junit.Assert.assertNull(codeGenerator44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "_tset_\"hi!\"Context" + "'", str46, "_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "_tset_tset" + "'", str48, "_tset_tset");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "_tset\"\\\"Python3\\\"Context\"" + "'", str50, "_tset\"\\\"Python3\\\"Context\"");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 29 + "'", int51 == 29);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[]");
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "4.5.2.1" + "'", str59, "4.5.2.1");
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\"hi!\"");
        boolean boolean7 = python3Target1.templatesExist();
        int int8 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "_tset\"_Python3\"", true);
        java.lang.String str13 = python3Target1.getLanguage();
        java.lang.String str14 = python3Target1.getVersion();
        java.lang.String str16 = python3Target1.getImplicitSetLabel("");
        java.lang.String str18 = python3Target1.encodeIntAsCharEscape((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python3Target1.getElementName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"Context" + "'", str6, "\"hi!\"Context");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"tset\\\"_Python3\"" + "'", str12, "\"tset\\\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python3" + "'", str13, "Python3");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_tset" + "'", str16, "_tset");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "#" + "'", str18, "#");
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.encodeIntAsCharEscape(100);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\\0Context", true);
        boolean boolean13 = python3Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup14 = python3Target1.getTemplates();
        java.lang.String str16 = python3Target1.getListLabel("\"Tset\\\\\\\"hi!Context\"");
        java.lang.String str18 = python3Target1.getImplicitSetLabel("\\\\35");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"0Contex\"" + "'", str12, "\"0Contex\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"Tset\\\\\\\"hi!Context\"" + "'", str16, "\"Tset\\\\\\\"hi!Context\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset\\\\35" + "'", str18, "_tset\\\\35");
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.getTemplates();
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "tset\\\"hi!", false);
        java.lang.String str13 = python3Target1.getListLabel("_tset_\\\"hi!\\\"Contex");
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "#", false);
        int int18 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target21 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator20);
        boolean boolean22 = python3Target21.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet23 = python3Target21.getBadWords();
        java.util.Set<java.lang.String> strSet24 = python3Target21.getBadWords();
        java.lang.String str25 = python3Target21.getVersion();
        org.antlr.v4.tool.Grammar grammar26 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target28 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator27);
        int int29 = python3Target28.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet30 = python3Target28.getBadWords();
        int int31 = python3Target28.getInlineTestSetWordSize();
        java.lang.String str34 = python3Target28.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = python3Target28.getCodeGenerator();
        boolean boolean36 = python3Target28.templatesExist();
        org.antlr.v4.tool.Grammar grammar37 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator38 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target39 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator38);
        int int40 = python3Target39.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet41 = python3Target39.getBadWords();
        int int42 = python3Target39.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator43 = python3Target39.getCodeGenerator();
        java.lang.String str45 = python3Target39.getImplicitSetLabel("_\"hi!\"Context");
        java.lang.String str47 = python3Target39.getImplicitSetLabel("_tset");
        java.lang.String str49 = python3Target39.getImplicitSetLabel("\"\\\"Python3\\\"Context\"");
        int int50 = python3Target39.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar51 = null;
        int[] intArray52 = new int[] {};
        java.lang.String[] strArray53 = python3Target39.getTokenTypesAsTargetLabels(grammar51, intArray52);
        java.lang.String[] strArray54 = python3Target28.getTokenTypesAsTargetLabels(grammar37, intArray52);
        java.lang.String[] strArray55 = python3Target21.getTokenTypesAsTargetLabels(grammar26, intArray52);
        java.lang.String[] strArray56 = python3Target1.getTokenTypesAsTargetLabels(grammar19, intArray52);
        org.antlr.v4.tool.ast.GrammarAST grammarAST57 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean58 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "set\\\"hi" + "'", str11, "set\\\"hi");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_tset_\\\"hi!\\\"Contex" + "'", str13, "_tset_\\\"hi!\\\"Contex");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 29 + "'", int18 == 29);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4.5.2.1" + "'", str25, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 64 + "'", int29 == 64);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 64 + "'", int31 == 64);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "_tset\\\"hi!\\\"" + "'", str34, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 64 + "'", int40 == 64);
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 64 + "'", int42 == 64);
        org.junit.Assert.assertNull(codeGenerator43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "_tset_\"hi!\"Context" + "'", str45, "_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "_tset_tset" + "'", str47, "_tset_tset");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "_tset\"\\\"Python3\\\"Context\"" + "'", str49, "_tset\"\\\"Python3\\\"Context\"");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 29 + "'", int50 == 29);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[]");
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strArray56);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        boolean boolean10 = python3Target1.wantsBaseListener();
        java.lang.String str12 = python3Target1.encodeIntAsCharEscape((int) (byte) 0);
        java.lang.String str14 = python3Target1.getImplicitRuleLabel("");
        java.lang.String str15 = python3Target1.getVersion();
        int int16 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_" + "'", str14, "_");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4.5.2.1" + "'", str15, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getListLabel("\"_Python3\"");
        java.lang.String str5 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString(" ", true);
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("\\\\0", false);
        java.lang.String str13 = python3Target1.getImplicitRuleLabel("__tset");
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromString("tset_tset_\\\"hi!\\\"Contex", false);
        org.antlr.v4.tool.Rule rule17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python3Target1.getRuleFunctionContextStructName(rule17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\" \"" + "'", str8, "\" \"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\\\\\\\0" + "'", str11, "\\\\\\\\0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "___tset" + "'", str13, "___tset");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "tset_tset_\\\\\\\"hi!\\\\\\\"Contex" + "'", str16, "tset_tset_\\\\\\\"hi!\\\\\\\"Contex");
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\"hi!\"");
        boolean boolean7 = python3Target1.templatesExist();
        int int8 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "_tset\"_Python3\"", true);
        java.lang.String str13 = python3Target1.getLanguage();
        java.lang.String str14 = python3Target1.getVersion();
        java.lang.String str16 = python3Target1.getAltLabelContextStructName("\"\\\"_Python3\\\"\"Context");
        java.lang.String str18 = python3Target1.getImplicitRuleLabel("\"\\\"hi!\\\"\"");
        int int19 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"Context" + "'", str6, "\"hi!\"Context");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"tset\\\"_Python3\"" + "'", str12, "\"tset\\\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python3" + "'", str13, "Python3");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\\"_Python3\\\"\"ContextContext" + "'", str16, "\"\\\"_Python3\\\"\"ContextContext");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_\"\\\"hi!\\\"\"" + "'", str18, "_\"\\\"hi!\\\"\"");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 64 + "'", int19 == 64);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getListLabel("\"_Python3\"");
        java.lang.String str5 = python3Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        int int7 = python3Target1.getInlineTestSetWordSize();
        boolean boolean8 = python3Target1.templatesExist();
        boolean boolean9 = python3Target1.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getTokenTypeAsTargetLabel(grammar10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\"hi!\"");
        java.lang.String str7 = python3Target1.getVersion();
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet9 = python3Target1.getBadWords();
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("_tset", true);
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("\"tset\\\"_Python3\"");
        java.util.Set<java.lang.String> strSet16 = python3Target1.getBadWords();
        java.lang.String str18 = python3Target1.getListLabel("\\\\0");
        java.lang.String str20 = python3Target1.encodeIntAsCharEscape((int) (short) 1);
        java.lang.String str22 = python3Target1.getImplicitRuleLabel("_DContextContext");
        java.lang.String str24 = python3Target1.getListLabel("\\\"tset\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"Python3\\\\\\\\\\\\\\\"Context\\\"");
        java.lang.String str26 = python3Target1.getAltLabelContextStructName("_tset\"_tsettset\\\\\\\"hi!\"");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"Context" + "'", str6, "\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"_tset\"" + "'", str13, "\"_tset\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"tset\\\\\\\"_Python3\\\"\"" + "'", str15, "\"\\\"tset\\\\\\\"_Python3\\\"\"");
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\\\\0" + "'", str18, "\\\\0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\\1" + "'", str20, "\\1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "__DContextContext" + "'", str22, "__DContextContext");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\\\"tset\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"Python3\\\\\\\\\\\\\\\"Context\\\"" + "'", str24, "\\\"tset\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"Python3\\\\\\\\\\\\\\\"Context\\\"");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "_tset\"_tsettset\\\\\\\"hi!\"Context" + "'", str26, "_tset\"_tsettset\\\\\\\"hi!\"Context");
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("hi!");
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"\\\"hi!\\\"\"Context");
        boolean boolean12 = python3Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"hi!\"" + "'", str9, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"hi!\\\"\"ContextContext" + "'", str11, "\"\\\"hi!\\\"\"ContextContext");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getLanguage();
        boolean boolean6 = python3Target1.templatesExist();
        java.lang.String str7 = python3Target1.getVersion();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        boolean boolean7 = python3Target1.templatesExist();
        java.lang.String str8 = python3Target1.getVersion();
        java.lang.String str10 = python3Target1.getAltLabelContextStructName("tset\\\"hi!");
        boolean boolean11 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "Python3", false);
        java.lang.Class<?> wildcardClass16 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tset\\\"hi!Context" + "'", str10, "Tset\\\"hi!Context");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ython" + "'", str15, "ython");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_Python3");
        int int8 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str10 = python3Target1.getAltLabelContextStructName("\"\\\"hi!\\\"\"Context");
        java.lang.String str12 = python3Target1.getImplicitRuleLabel("\\35");
        java.lang.String str14 = python3Target1.getAltLabelContextStructName("_\"@\"");
        boolean boolean15 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_Python3\"" + "'", str7, "\"_Python3\"");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"hi!\\\"\"ContextContext" + "'", str10, "\"\\\"hi!\\\"\"ContextContext");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_\\35" + "'", str12, "_\\35");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_\"@\"Context" + "'", str14, "_\"@\"Context");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\"hi!\"Context");
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("_Python3");
        int int12 = python3Target1.getInlineTestSetWordSize();
        boolean boolean13 = python3Target1.wantsBaseListener();
        int int14 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        java.lang.String str18 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator15, "_\"_tset\\\"_Python3\\\"\"", true);
        java.lang.String str20 = python3Target1.encodeIntAsCharEscape((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"hi!\"Context" + "'", str9, "_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"_Python3\"" + "'", str11, "\"_Python3\"");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\\\"_tset\\\"_Python3\\\"\"" + "'", str18, "\"\\\"_tset\\\"_Python3\\\"\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\\64" + "'", str20, "\\64");
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"Python3\"");
        boolean boolean12 = python3Target1.wantsBaseListener();
        int int13 = python3Target1.getInlineTestSetWordSize();
        boolean boolean14 = python3Target1.wantsBaseListener();
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromString("\"_tset\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        java.lang.String str20 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator17, "\"_\"", true);
        java.lang.String str22 = python3Target1.getTargetStringLiteralFromString("\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"_Python3\\\\\\\\\\\\\\\"\\\\\\\"ContextContext\\\"\"");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"Python3\"Context" + "'", str11, "\"Python3\"Context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\\"_tset\\\"\"" + "'", str16, "\"\\\"_tset\\\"\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"_\"" + "'", str20, "\"_\"");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"_Python3\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"ContextContext\\\\\\\"\\\"\"" + "'", str22, "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"_Python3\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"ContextContext\\\\\\\"\\\"\"");
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("\\\\0", false);
        java.lang.String str9 = python3Target1.getListLabel("");
        int int10 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean11 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\\\\\\\0" + "'", str7, "\\\\\\\\0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }
}

