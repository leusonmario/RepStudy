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
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        boolean boolean8 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getVersion();
        java.lang.String str12 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target1.getCodeGenerator();
        java.lang.String str15 = python3Target1.getAltLabelContextStructName("\\\"ContextContex");
        org.stringtemplate.v4.STGroup sTGroup16 = python3Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Python3" + "'", str12, "Python3");
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\\"ContextContexContext" + "'", str15, "\\\"ContextContexContext");
        org.junit.Assert.assertNotNull(sTGroup16);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "_Python3Context", true);
        java.lang.String str7 = python3Target1.getListLabel("Python");
        java.util.Set<java.lang.String> strSet8 = python3Target1.getBadWords();
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString(".5.2.Context", true);
        java.lang.String str13 = python3Target1.getImplicitSetLabel("_\"\\\"\\\\\\\\1\\\"\"");
        boolean boolean14 = python3Target1.templatesExist();
        java.lang.String str15 = python3Target1.getLanguage();
        org.antlr.v4.tool.Rule rule16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.getRuleFunctionContextStructName(rule16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python3Contex\"" + "'", str5, "\"Python3Contex\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python" + "'", str7, "Python");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\".5.2.Context\"" + "'", str11, "\".5.2.Context\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_tset_\"\\\"\\\\\\\\1\\\"\"" + "'", str13, "_tset_\"\\\"\\\\\\\\1\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python3" + "'", str15, "Python3");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        java.lang.String str6 = python3Target1.getListLabel("_Python3Context");
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        java.lang.String str9 = python3Target1.getAltLabelContextStructName("\"\\\"ython\\\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_Python3Context" + "'", str6, "_Python3Context");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"ython\\\"\"ContextContext" + "'", str9, "\"\\\"ython\\\"\"ContextContext");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("_tsethi", false);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("\\\"hi!\\\"");
        java.lang.String str12 = python3Target1.getImplicitSetLabel("_hi!ContextContextContext");
        int int13 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\\\\\"hi!\\\\\\\"\"" + "'", str10, "\"\\\\\\\"hi!\\\\\\\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_hi!ContextContextContext" + "'", str12, "_tset_hi!ContextContextContext");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("__tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        java.lang.String str11 = python3Target1.getListLabel("Python3");
        java.lang.String str13 = python3Target1.encodeIntAsCharEscape(29);
        boolean boolean14 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "___tsethi!" + "'", str8, "___tsethi!");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python3" + "'", str11, "Python3");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\35" + "'", str13, "\\35");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getAltLabelContextStructName("_Python3");
        java.lang.String str6 = python3Target1.getImplicitSetLabel("i");
        java.lang.String str7 = python3Target1.getLanguage();
        java.lang.String str9 = python3Target1.getListLabel("_hi!");
        boolean boolean10 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tseti" + "'", str6, "_tseti");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_hi!" + "'", str9, "_hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        boolean boolean4 = python3Target1.wantsBaseVisitor();
        int int5 = python3Target1.getInlineTestSetWordSize();
        boolean boolean6 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "_Python3Context", true);
        java.lang.String str7 = python3Target1.encodeIntAsCharEscape((int) (short) 10);
        boolean boolean8 = python3Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
        boolean boolean10 = python3Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet11 = python3Target1.getBadWords();
        java.lang.String str13 = python3Target1.getImplicitRuleLabel("\"\\\"_\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"Python3Contex\\\\\\\\\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python3Contex\"" + "'", str5, "\"Python3Contex\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\n" + "'", str7, "\\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_\"\\\"_\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"Python3Contex\\\\\\\\\\\\\\\"\\\"\"" + "'", str13, "_\"\\\"_\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"Python3Contex\\\\\\\\\\\\\\\"\\\"\"");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.wantsBaseListener();
        int int6 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean7 = python3Target1.templatesExist();
        boolean boolean8 = python3Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 29 + "'", int6 == 29);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("Python3");
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "\\35", false);
        java.lang.String str15 = python3Target1.getImplicitRuleLabel("\"hi!\"");
        java.lang.String str18 = python3Target1.getTargetStringLiteralFromString("\"Python3Context\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        java.lang.String str22 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator19, "_tsethi!Context", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        java.lang.String str26 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator23, "\"__\\\"_Python3\\\"\"", true);
        org.stringtemplate.v4.STGroup sTGroup27 = python3Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_Python3" + "'", str9, "_Python3");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3" + "'", str13, "3");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_\"hi!\"" + "'", str15, "_\"hi!\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\\\"Python3Context\\\"\"" + "'", str18, "\"\\\"Python3Context\\\"\"");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "tsethi!Contex" + "'", str22, "tsethi!Contex");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"__\\\"_Python3\\\"\"" + "'", str26, "\"__\\\"_Python3\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup27);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getAltLabelContextStructName("_Python3");
        java.lang.String str6 = python3Target1.getListLabel("\"\\\\1\"");
        int int7 = python3Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\\1\"" + "'", str6, "\"\\\\1\"");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertNotNull(sTGroup8);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.util.Set<java.lang.String> strSet4 = python3Target1.getBadWords();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        int int6 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python3Target1.getImplicitSetLabel("_tset_Python3");
        boolean boolean9 = python3Target1.templatesExist();
        java.lang.String str10 = python3Target1.getLanguage();
        java.lang.String str12 = python3Target1.getAltLabelContextStructName("\"\\\"4.5.2.1\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset_tset_Python3" + "'", str8, "_tset_tset_Python3");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python3" + "'", str10, "Python3");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"4.5.2.1\\\"\"Context" + "'", str12, "\"\\\"4.5.2.1\\\"\"Context");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        boolean boolean8 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getVersion();
        java.lang.String str12 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target1.getCodeGenerator();
        java.lang.String str15 = python3Target1.getAltLabelContextStructName("\\\"ContextContex");
        java.lang.String str18 = python3Target1.getTargetStringLiteralFromString("\\\\\\\\1", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Python3" + "'", str12, "Python3");
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\\"ContextContexContext" + "'", str15, "\\\"ContextContexContext");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\\\\\\\\\\\\\\\\1\"" + "'", str18, "\"\\\\\\\\\\\\\\\\1\"");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("__tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("\"_Python3\"", true);
        java.lang.String str15 = python3Target1.getImplicitRuleLabel("");
        boolean boolean16 = python3Target1.wantsBaseListener();
        boolean boolean17 = python3Target1.templatesExist();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "___tsethi!" + "'", str8, "___tsethi!");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"_Python3\\\"\"" + "'", str13, "\"\\\"_Python3\\\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_" + "'", str15, "_");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str6 = python3Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getLoopCounter(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        boolean boolean8 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getVersion();
        java.lang.String str13 = python3Target1.getImplicitRuleLabel("\"4.5.2.1\"");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getRuleFunctionContextStructName(ruleFunction14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_\"4.5.2.1\"" + "'", str13, "_\"4.5.2.1\"");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getAltLabelContextStructName("_Python3");
        boolean boolean5 = python3Target1.templatesExist();
        int int6 = python3Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertNotNull(sTGroup7);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "_Python3Context", true);
        java.lang.String str7 = python3Target1.encodeIntAsCharEscape((int) (short) 10);
        int int8 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean9 = python3Target1.templatesExist();
        boolean boolean10 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python3Contex\"" + "'", str5, "\"Python3Contex\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\n" + "'", str7, "\\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_Python3", false);
        java.lang.String str12 = python3Target1.getAltLabelContextStructName("__tset_Python3Context");
        java.lang.String str14 = python3Target1.getListLabel("\"__hi!\"");
        java.lang.String str16 = python3Target1.getImplicitRuleLabel("_tset\"_\\\"hi!\\\"ContextContextContext\"");
        java.lang.String str18 = python3Target1.getTargetStringLiteralFromString("\"__tsethi\"");
        boolean boolean19 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "__tset_Python3ContextContext" + "'", str12, "__tset_Python3ContextContext");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"__hi!\"" + "'", str14, "\"__hi!\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "__tset\"_\\\"hi!\\\"ContextContextContext\"" + "'", str16, "__tset\"_\\\"hi!\\\"ContextContextContext\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\\\"__tsethi\\\"\"" + "'", str18, "\"\\\"__tsethi\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.util.Set<java.lang.String> strSet4 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "\"\\\"Python3Contex\\\"\"", true);
        int int9 = python3Target1.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getImplicitTokenLabel("__tsetPythonContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"Python3Contex\\\"\"" + "'", str8, "\"\\\"Python3Contex\\\"\"");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel(".5.2.");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("\"Python\"");
        java.lang.String str10 = python3Target1.getAltLabelContextStructName("_hi!Context");
        java.lang.String str12 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str14 = python3Target1.getListLabel("\\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_.5.2." + "'", str6, "_.5.2.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_\"Python\"" + "'", str8, "_\"Python\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_hi!ContextContext" + "'", str10, "_hi!ContextContext");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\n" + "'", str14, "\\n");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        boolean boolean7 = python3Target1.templatesExist();
        boolean boolean8 = python3Target1.wantsBaseVisitor();
        boolean boolean9 = python3Target1.templatesExist();
        java.lang.String str11 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "_\"ython\"", true);
        boolean boolean16 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\0" + "'", str11, "\\0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"ython\"" + "'", str15, "\"\\\"ython\"");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        boolean boolean8 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
        int int10 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str12 = python3Target1.getImplicitRuleLabel("_Python3");
        java.lang.String str13 = python3Target1.getVersion();
        java.lang.String str15 = python3Target1.getListLabel("Python3");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "__Python3" + "'", str12, "__Python3");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python3" + "'", str15, "Python3");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getAltLabelContextStructName("_Python3");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "__tsethi!", false);
        java.lang.String str10 = python3Target1.encodeIntAsCharEscape((int) (short) 100);
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        int int12 = python3Target1.getInlineTestSetWordSize();
        int int13 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str15 = python3Target1.getAltLabelContextStructName("\"hi!\"");
        java.lang.String str17 = python3Target1.getListLabel("i");
        org.stringtemplate.v4.STGroup sTGroup18 = python3Target1.getTemplates();
        java.lang.Class<?> wildcardClass19 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29 + "'", int13 == 29);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"hi!\"Context" + "'", str15, "\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "i" + "'", str17, "i");
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        boolean boolean8 = python3Target1.templatesExist();
        java.lang.String str10 = python3Target1.getImplicitRuleLabel("\"ython\"");
        java.lang.String str11 = python3Target1.getVersion();
        boolean boolean12 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_\"ython\"" + "'", str10, "_\"ython\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("Python3", true);
        java.lang.String str12 = python3Target1.getImplicitSetLabel("hi!");
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\"Python3Contex\"");
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        java.lang.String str18 = python3Target1.getLanguage();
        java.lang.String str20 = python3Target1.getImplicitRuleLabel("_Python3");
        java.lang.String str22 = python3Target1.getAltLabelContextStructName("PythonContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        java.lang.String str26 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator23, "\"\\\"\\\\\\\"_Python3\\\\\\\"\\\"\"", false);
        boolean boolean27 = python3Target1.templatesExist();
        java.lang.String str28 = python3Target1.getVersion();
        boolean boolean29 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Python3\"" + "'", str10, "\"Python3\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsethi!" + "'", str12, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"Python3Contex\\\"\"" + "'", str14, "\"\\\"Python3Contex\\\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"4.5.2.1\"" + "'", str17, "\"4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python3" + "'", str18, "Python3");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "__Python3" + "'", str20, "__Python3");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PythonContextContext" + "'", str22, "PythonContextContext");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\\\"\\\\\\\"_Python3\\\\\\\"\\\"" + "'", str26, "\\\"\\\\\\\"_Python3\\\\\\\"\\\"");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "4.5.2.1" + "'", str28, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target1.getCodeGenerator();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\\n", false);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getListLabel("\"\\\"\\\"Python3Contex\\\"\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getLoopCounter(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\\\n" + "'", str6, "\\\\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"\\\"Python3Contex\\\"\"" + "'", str9, "\"\\\"\\\"Python3Contex\\\"\"");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\\\\1", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "\\\\n", false);
        java.lang.String str12 = python3Target1.getImplicitRuleLabel("\"_\\\\\\\"\\\\\\\"Python3Contex\\\\\\\"\"");
        int int13 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str15 = python3Target1.getImplicitSetLabel("_tset\\\"4.5.2.1\\\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\\\\\\\1" + "'", str6, "\\\\\\\\1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\n" + "'", str10, "\\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_\"_\\\\\\\"\\\\\\\"Python3Contex\\\\\\\"\"" + "'", str12, "_\"_\\\\\\\"\\\\\\\"Python3Contex\\\\\\\"\"");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset_tset\\\"4.5.2.1\\\"" + "'", str15, "_tset_tset\\\"4.5.2.1\\\"");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        java.lang.String str6 = python3Target1.getListLabel("_Python3Context");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet8 = python3Target1.getBadWords();
        int int9 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("_tset\\\\n");
        boolean boolean12 = python3Target1.wantsBaseListener();
        int int13 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_Python3Context" + "'", str6, "_Python3Context");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset\\\\nContext" + "'", str11, "_tset\\\\nContext");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29 + "'", int13 == 29);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        java.lang.String str10 = python3Target1.getListLabel("_\"Python\"");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getRuleFunctionContextStructName(ruleFunction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_\"Python\"" + "'", str10, "_\"Python\"");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str9 = python3Target1.encodeIntAsCharEscape((int) (byte) 10);
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("_Python3");
        java.lang.String str12 = python3Target1.getLanguage();
        boolean boolean13 = python3Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\n" + "'", str9, "\\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"_Python3\"" + "'", str11, "\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Python3" + "'", str12, "Python3");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("Python3", true);
        java.lang.String str12 = python3Target1.getImplicitSetLabel("hi!");
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\"Python3Contex\"");
        java.lang.String str15 = python3Target1.getLanguage();
        int int16 = python3Target1.getSerializedATNSegmentLimit();
        int int17 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str19 = python3Target1.getTargetStringLiteralFromString("\"\\\\\\\"hi!\\\\\\\"\"");
        java.lang.String str21 = python3Target1.encodeIntAsCharEscape((int) (short) 10);
        boolean boolean22 = python3Target1.wantsBaseListener();
        boolean boolean23 = python3Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet25 = python3Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Python3\"" + "'", str10, "\"Python3\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsethi!" + "'", str12, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"Python3Contex\\\"\"" + "'", str14, "\"\\\"Python3Contex\\\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python3" + "'", str15, "Python3");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 29 + "'", int16 == 29);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 29 + "'", int17 == 29);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\"\"" + "'", str19, "\"\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\\n" + "'", str21, "\\n");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(codeGenerator24);
        org.junit.Assert.assertNotNull(strSet25);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        boolean boolean8 = python3Target1.templatesExist();
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("hi!");
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target1.getTemplates();
        boolean boolean12 = python3Target1.supportsOverloadedMethods();
        java.lang.String str14 = python3Target1.encodeIntAsCharEscape((int) (short) 100);
        int int15 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean16 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"hi!\"" + "'", str10, "\"hi!\"");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "d" + "'", str14, "d");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_Python3", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target1.getCodeGenerator();
        java.lang.String str13 = python3Target1.getAltLabelContextStructName("Python");
        java.util.Set<java.lang.String> strSet14 = python3Target1.getBadWords();
        java.lang.String str16 = python3Target1.getImplicitRuleLabel("_\\\"hi!\\\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python3Target1.getCodeGenerator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PythonContext" + "'", str13, "PythonContext");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "__\\\"hi!\\\"" + "'", str16, "__\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator17);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getAltLabelContextStructName("_Python3");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "__tsethi!", false);
        java.lang.String str10 = python3Target1.encodeIntAsCharEscape((int) (short) 100);
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        java.lang.String str13 = python3Target1.getImplicitSetLabel("_tset__tset_Python3Context");
        java.lang.String str15 = python3Target1.getListLabel("");
        java.lang.String str17 = python3Target1.encodeIntAsCharEscape(64);
        boolean boolean18 = python3Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_tset_tset__tset_Python3Context" + "'", str13, "_tset_tset__tset_Python3Context");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "@" + "'", str17, "@");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        boolean boolean7 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "4.5.2.1", false);
        int int12 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".5.2." + "'", str11, ".5.2.");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("Python3", true);
        java.lang.String str12 = python3Target1.getImplicitSetLabel("hi!");
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\"Python3Contex\"");
        java.lang.String str15 = python3Target1.getLanguage();
        int int16 = python3Target1.getSerializedATNSegmentLimit();
        int int17 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str18 = python3Target1.getVersion();
        boolean boolean19 = python3Target1.wantsBaseVisitor();
        boolean boolean20 = python3Target1.wantsBaseVisitor();
        boolean boolean21 = python3Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = python3Target1.getElementListName("\\\\1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Python3\"" + "'", str10, "\"Python3\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsethi!" + "'", str12, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"Python3Contex\\\"\"" + "'", str14, "\"\\\"Python3Contex\\\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python3" + "'", str15, "Python3");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 29 + "'", int16 == 29);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 29 + "'", int17 == 29);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        int int5 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.encodeIntAsCharEscape((int) (short) 1);
        java.lang.String str9 = python3Target1.encodeIntAsCharEscape((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\1" + "'", str7, "\\1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\n" + "'", str9, "\\n");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target1.getCodeGenerator();
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape((int) (short) 10);
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        java.lang.String str7 = python3Target1.getLanguage();
        java.lang.String str9 = python3Target1.getListLabel("\\\\n");
        java.lang.String str11 = python3Target1.encodeIntAsCharEscape(100);
        boolean boolean12 = python3Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup14 = python3Target1.getTemplates();
        boolean boolean15 = python3Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet16 = python3Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\n" + "'", str5, "\\n");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\\\n" + "'", str9, "\\\\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d" + "'", str11, "d");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getRuleFunctionContextStructName(ruleFunction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape((int) (short) 10);
        int int6 = python3Target1.getInlineTestSetWordSize();
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\n" + "'", str5, "\\n");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target1.getCodeGenerator();
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape((int) (short) 10);
        java.lang.String str7 = python3Target1.getListLabel("_\"_tsethi!\"");
        java.lang.String str9 = python3Target1.getListLabel("__\\\"___tsethi!\\\"Context");
        org.antlr.v4.tool.Rule rule10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getRuleFunctionContextStructName(rule10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\n" + "'", str5, "\\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_\"_tsethi!\"" + "'", str7, "_\"_tsethi!\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "__\\\"___tsethi!\\\"Context" + "'", str9, "__\\\"___tsethi!\\\"Context");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        boolean boolean8 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target1.getTemplates();
        java.lang.String str13 = python3Target1.getListLabel("\"Python3Contex\"");
        boolean boolean14 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"Python3Contex\"" + "'", str13, "\"Python3Contex\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_Python3", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target1.getCodeGenerator();
        boolean boolean12 = python3Target1.supportsOverloadedMethods();
        java.lang.String str14 = python3Target1.encodeIntAsCharEscape(64);
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromString("_\"_Python3\"", false);
        java.lang.String str18 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        java.lang.String str22 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator19, "_\"ython\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        java.lang.String str26 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator23, "_\"hi!\"ContextContextContext", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        java.lang.String str30 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator27, "_tset\"4.5.2.1\"", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "@" + "'", str14, "@");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_\\\"_Python3\\\"" + "'", str17, "_\\\"_Python3\\\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"\\\"ython\"" + "'", str22, "\"\\\"ython\"");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\\\"hi!\\\"ContextContextContex" + "'", str26, "\\\"hi!\\\"ContextContextContex");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\"tset\\\"4.5.2.1\"" + "'", str30, "\"tset\\\"4.5.2.1\"");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getAltLabelContextStructName("_Python3");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "__tsethi!", false);
        boolean boolean9 = python3Target1.wantsBaseListener();
        boolean boolean10 = python3Target1.wantsBaseVisitor();
        java.lang.String str12 = python3Target1.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target15 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator14);
        java.lang.String str17 = python3Target15.encodeIntAsCharEscape(1);
        java.lang.String str18 = python3Target15.getVersion();
        java.lang.String str20 = python3Target15.getImplicitRuleLabel("_tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        java.lang.String str24 = python3Target15.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator21, "_Python3", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = python3Target15.getCodeGenerator();
        boolean boolean26 = python3Target15.supportsOverloadedMethods();
        boolean boolean27 = python3Target15.templatesExist();
        boolean boolean28 = python3Target15.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup29 = python3Target15.getTemplates();
        org.antlr.v4.tool.Grammar grammar30 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target32 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator31);
        boolean boolean33 = python3Target32.wantsBaseListener();
        java.lang.String str35 = python3Target32.getAltLabelContextStructName("_Python3");
        java.lang.String str37 = python3Target32.getListLabel("\"\\\\1\"");
        boolean boolean38 = python3Target32.templatesExist();
        org.antlr.v4.tool.Grammar grammar39 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator40 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target41 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator40);
        boolean boolean42 = python3Target41.wantsBaseListener();
        java.util.Set<java.lang.String> strSet43 = python3Target41.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup44 = python3Target41.getTemplates();
        java.lang.String str46 = python3Target41.getImplicitRuleLabel("\"\\\\1\"");
        org.antlr.v4.tool.Grammar grammar47 = null;
        int[] intArray48 = new int[] {};
        java.lang.String[] strArray49 = python3Target41.getTokenTypesAsTargetLabels(grammar47, intArray48);
        java.lang.String[] strArray50 = python3Target32.getTokenTypesAsTargetLabels(grammar39, intArray48);
        java.lang.String[] strArray51 = python3Target15.getTokenTypesAsTargetLabels(grammar30, intArray48);
        java.lang.String[] strArray52 = python3Target1.getTokenTypesAsTargetLabels(grammar13, intArray48);
        java.lang.String str53 = python3Target1.getVersion();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\n" + "'", str12, "\\n");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\1" + "'", str17, "\\1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "__tsethi!" + "'", str20, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Python" + "'", str24, "Python");
        org.junit.Assert.assertNull(codeGenerator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(sTGroup29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "_Python3Context" + "'", str35, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\"\\\\1\"" + "'", str37, "\"\\\\1\"");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertNotNull(sTGroup44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "_\"\\\\1\"" + "'", str46, "_\"\\\\1\"");
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[]");
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "4.5.2.1" + "'", str53, "4.5.2.1");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        int int7 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str9 = python3Target1.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean10 = python3Target1.wantsBaseListener();
        org.antlr.v4.tool.Rule rule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getRuleFunctionContextStructName(rule11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\n" + "'", str9, "\\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        java.lang.String str7 = python3Target1.encodeIntAsCharEscape((int) ' ');
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\"\\\"\\\"Python3Contex\\\"\"", false);
        int int12 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str13 = python3Target1.getVersion();
        java.lang.String str15 = python3Target1.getImplicitRuleLabel("\"_tsethi!\"");
        boolean boolean16 = python3Target1.templatesExist();
        java.util.Set<java.lang.String> strSet17 = python3Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\\"\\\"Python3Contex\\\"" + "'", str11, "\\\"\\\"Python3Contex\\\"");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_\"_tsethi!\"" + "'", str15, "_\"_tsethi!\"");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getAltLabelContextStructName("_Python3");
        java.lang.String str6 = python3Target1.getImplicitSetLabel("i");
        java.lang.String str7 = python3Target1.getLanguage();
        java.lang.String str9 = python3Target1.getListLabel("_hi!");
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getLoopLabel(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tseti" + "'", str6, "_tseti");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_hi!" + "'", str9, "_hi!");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getAltLabelContextStructName("_Python3");
        java.lang.String str6 = python3Target1.getListLabel("\"\\\\1\"");
        boolean boolean7 = python3Target1.templatesExist();
        boolean boolean8 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getTokenTypeAsTargetLabel(grammar9, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\\1\"" + "'", str6, "\"\\\\1\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        boolean boolean7 = python3Target1.templatesExist();
        boolean boolean8 = python3Target1.wantsBaseVisitor();
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("__\"___tsethi!\"", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getLoopCounter(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "__\\\"___tsethi!\\\"" + "'", str11, "__\\\"___tsethi!\\\"");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.util.Set<java.lang.String> strSet4 = python3Target1.getBadWords();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        int int6 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet7 = python3Target1.getBadWords();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("__\"___tsethi!\"Context");
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "_tset", false);
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("___tsetPython");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"__\\\"___tsethi!\\\"Context\"" + "'", str9, "\"__\\\"___tsethi!\\\"Context\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "tse" + "'", str13, "tse");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"___tsetPython\"" + "'", str15, "\"___tsetPython\"");
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("__tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        boolean boolean10 = python3Target1.wantsBaseVisitor();
        boolean boolean11 = python3Target1.wantsBaseVisitor();
        java.lang.String str13 = python3Target1.getAltLabelContextStructName("d");
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\\\"\\\\\\\"_Python3\\\\\\\"\\\"", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "___tsethi!" + "'", str8, "___tsethi!");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DContext" + "'", str13, "DContext");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\\"\\\\\\\"_Python3\\\\\\\"\\\"" + "'", str17, "\\\"\\\\\\\"_Python3\\\\\\\"\\\"");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("Python3", true);
        java.lang.String str12 = python3Target1.getImplicitSetLabel("hi!");
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\"Python3Contex\"");
        java.lang.String str15 = python3Target1.getLanguage();
        int int16 = python3Target1.getSerializedATNSegmentLimit();
        int int17 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str19 = python3Target1.getTargetStringLiteralFromString("\"\\\\\\\"hi!\\\\\\\"\"");
        java.lang.String str21 = python3Target1.encodeIntAsCharEscape((int) (short) 10);
        boolean boolean22 = python3Target1.wantsBaseListener();
        boolean boolean23 = python3Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = python3Target1.getCodeGenerator();
        java.lang.String str26 = python3Target1.getListLabel("\"4.5.2.1\"");
        java.lang.String str28 = python3Target1.getImplicitRuleLabel("\\\\n");
        java.lang.String str30 = python3Target1.getAltLabelContextStructName("_\\\"ContextContex");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Python3\"" + "'", str10, "\"Python3\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsethi!" + "'", str12, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"Python3Contex\\\"\"" + "'", str14, "\"\\\"Python3Contex\\\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python3" + "'", str15, "Python3");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 29 + "'", int16 == 29);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 29 + "'", int17 == 29);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\"\"" + "'", str19, "\"\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\\n" + "'", str21, "\\n");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(codeGenerator24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"4.5.2.1\"" + "'", str26, "\"4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "_\\\\n" + "'", str28, "_\\\\n");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "_\\\"ContextContexContext" + "'", str30, "_\\\"ContextContexContext");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        boolean boolean4 = python3Target1.wantsBaseListener();
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("_\\\"_Python3\\\"Context");
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("_tset__\\\\\\\"\\\\\\\\\\\\\\\\1\\\\\\\"");
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_\\\"_Python3\\\"ContextContext" + "'", str6, "_\\\"_Python3\\\"ContextContext");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset__\\\\\\\"\\\\\\\\\\\\\\\\1\\\\\\\"Context" + "'", str8, "_tset__\\\\\\\"\\\\\\\\\\\\\\\\1\\\\\\\"Context");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        java.lang.String str6 = python3Target1.getListLabel("_Python3Context");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target1.getTemplates();
        java.lang.String str10 = python3Target1.getImplicitRuleLabel("\"Python3\"");
        org.antlr.v4.tool.Rule rule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getRuleFunctionContextStructName(rule11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_Python3Context" + "'", str6, "_Python3Context");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_\"Python3\"" + "'", str10, "_\"Python3\"");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.getCodeGenerator();
        java.lang.String str9 = python3Target1.getAltLabelContextStructName("Python3");
        int int10 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        java.lang.String str13 = python3Target1.encodeIntAsCharEscape((int) 'a');
        java.lang.String str15 = python3Target1.getImplicitSetLabel("__tset\"_\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\1Context\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\"\"");
        boolean boolean16 = python3Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python3Context" + "'", str9, "Python3Context");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "a" + "'", str13, "a");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset__tset\"_\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\1Context\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\"\"" + "'", str15, "_tset__tset\"_\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\1Context\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        boolean boolean4 = python3Target1.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target7 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator6);
        boolean boolean8 = python3Target7.wantsBaseListener();
        java.lang.String str10 = python3Target7.getListLabel("");
        java.lang.String str11 = python3Target7.getLanguage();
        java.lang.String str13 = python3Target7.encodeIntAsCharEscape((int) '#');
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target16 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator15);
        boolean boolean17 = python3Target16.wantsBaseListener();
        java.util.Set<java.lang.String> strSet18 = python3Target16.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup19 = python3Target16.getTemplates();
        java.lang.String str21 = python3Target16.getImplicitRuleLabel("\"\\\\1\"");
        org.antlr.v4.tool.Grammar grammar22 = null;
        int[] intArray23 = new int[] {};
        java.lang.String[] strArray24 = python3Target16.getTokenTypesAsTargetLabels(grammar22, intArray23);
        java.lang.String[] strArray25 = python3Target7.getTokenTypesAsTargetLabels(grammar14, intArray23);
        java.lang.String[] strArray26 = python3Target1.getTokenTypesAsTargetLabels(grammar5, intArray23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = python3Target1.encodeIntAsCharEscape((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python3" + "'", str11, "Python3");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#" + "'", str13, "#");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "_\"\\\\1\"" + "'", str21, "_\"\\\\1\"");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray26);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target1.getCodeGenerator();
        java.lang.String str5 = python3Target1.getVersion();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("\\\\1Context", true);
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getImplicitRuleLabel("");
        boolean boolean12 = python3Target1.wantsBaseVisitor();
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("\"\\\"\\\\\\\"_Python3\\\\\\\"\\\"\"", false);
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromString("_\"\\\\1\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\\\\\\1Context\"" + "'", str8, "\"\\\\\\\\1Context\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_" + "'", str11, "_");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\\"\\\\\\\"\\\\\\\\\\\\\\\"_Python3\\\\\\\\\\\\\\\"\\\\\\\"\\\"" + "'", str15, "\\\"\\\\\\\"\\\\\\\\\\\\\\\"_Python3\\\\\\\\\\\\\\\"\\\\\\\"\\\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"_\\\"\\\\\\\\1\\\"\"" + "'", str17, "\"_\\\"\\\\\\\\1\\\"\"");
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("_tsethi", false);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("\\\"hi!\\\"");
        java.util.Set<java.lang.String> strSet11 = python3Target1.getBadWords();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getRuleFunctionContextStructName(ruleFunction12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\\\\\"hi!\\\\\\\"\"" + "'", str10, "\"\\\\\\\"hi!\\\\\\\"\"");
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.util.Set<java.lang.String> strSet4 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "\"\\\"Python3Contex\\\"\"", true);
        int int9 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromString("___tsethi!", true);
        boolean boolean13 = python3Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"Python3Contex\\\"\"" + "'", str8, "\"\\\"Python3Contex\\\"\"");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"___tsethi!\"" + "'", str12, "\"___tsethi!\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_Python3", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target1.getCodeGenerator();
        boolean boolean12 = python3Target1.supportsOverloadedMethods();
        boolean boolean13 = python3Target1.templatesExist();
        java.lang.String str14 = python3Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target1.getTemplates();
        int int16 = python3Target1.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup17 = python3Target1.getTemplates();
        java.lang.String str18 = python3Target1.getLanguage();
        int int19 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str20 = python3Target1.getVersion();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python3" + "'", str14, "Python3");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 29 + "'", int16 == 29);
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python3" + "'", str18, "Python3");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 29 + "'", int19 == 29);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4.5.2.1" + "'", str20, "4.5.2.1");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getImplicitRuleLabel("_tsettset_Python");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python3Target1.getElementListName("_\"_Python3\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "__tsettset_Python" + "'", str3, "__tsettset_Python");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        java.lang.String str6 = python3Target1.getListLabel("_Python3Context");
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\"\\\"\\\"Python3Contex\\\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_Python3Context" + "'", str6, "_Python3Context");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"\\\"\\\"Python3Contex\\\"\"Context" + "'", str9, "_\"\\\"\\\"Python3Contex\\\"\"Context");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\\\"\\\"Python3Contex\\\"", false);
        java.lang.String str11 = python3Target1.getImplicitRuleLabel("\"\\\"\\\"\"Context");
        int int12 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\\"\\\"Python3Contex\\\"" + "'", str9, "\\\"\\\"Python3Contex\\\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_\"\\\"\\\"\"Context" + "'", str11, "_\"\\\"\\\"\"Context");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 29 + "'", int12 == 29);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        java.lang.String str6 = python3Target1.getListLabel("_Python3Context");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet8 = python3Target1.getBadWords();
        java.util.Set<java.lang.String> strSet9 = python3Target1.getBadWords();
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("_\\\"\\\"Python3Contex\\\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_Python3Context" + "'", str6, "_Python3Context");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"_\\\\\\\"\\\\\\\"Python3Contex\\\\\\\"\"" + "'", str11, "\"_\\\\\\\"\\\\\\\"Python3Contex\\\\\\\"\"");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("Python3", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target1.getCodeGenerator();
        int int12 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Python3\"" + "'", str10, "\"Python3\"");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "_Python3Context", true);
        boolean boolean6 = python3Target1.wantsBaseVisitor();
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str9 = python3Target1.getAltLabelContextStructName("_\"tseth\"Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python3Contex\"" + "'", str5, "\"Python3Contex\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"tseth\"ContextContext" + "'", str9, "_\"tseth\"ContextContext");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getAltLabelContextStructName("_Python3");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "__tsethi!", false);
        boolean boolean9 = python3Target1.wantsBaseListener();
        java.lang.String str11 = python3Target1.getImplicitSetLabel("");
        java.lang.String str13 = python3Target1.getAltLabelContextStructName("\"\"");
        java.lang.String str15 = python3Target1.getListLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = python3Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset" + "'", str11, "_tset");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\"Context" + "'", str13, "\"\"Context");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(codeGenerator16);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        java.lang.String str3 = python3Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_\"hi!\"");
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        boolean boolean8 = python3Target1.wantsBaseListener();
        java.lang.String str10 = python3Target1.getImplicitSetLabel("_tset\\\"ContextContexContext");
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python3" + "'", str3, "Python3");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__\"hi!\"" + "'", str6, "__\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_tset_tset\\\"ContextContexContext" + "'", str10, "_tset_tset\\\"ContextContexContext");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("Python3");
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target1.getCodeGenerator();
        boolean boolean14 = python3Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_Python3" + "'", str9, "_Python3");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        java.lang.String str6 = python3Target1.getListLabel("_Python3Context");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getRuleFunctionContextStructName(ruleFunction10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_Python3Context" + "'", str6, "_Python3Context");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertNotNull(sTGroup9);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        java.lang.String str6 = python3Target1.getListLabel("_Python3Context");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet8 = python3Target1.getBadWords();
        int int9 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("_tset\\\\n");
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\"\\\"Python3Contex\\\"\"Context", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getElementListName("\"\\\"ython\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_Python3Context" + "'", str6, "_Python3Context");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset\\\\nContext" + "'", str11, "_tset\\\\nContext");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\\"\\\\\\\"Python3Contex\\\\\\\"\\\"Context" + "'", str14, "\\\"\\\\\\\"Python3Contex\\\\\\\"\\\"Context");
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        boolean boolean8 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
        int int10 = python3Target1.getInlineTestSetWordSize();
        int int11 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean12 = python3Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29 + "'", int11 == 29);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        java.lang.String str3 = python3Target1.getVersion();
        java.lang.String str5 = python3Target1.getAltLabelContextStructName("\"_tset\\\"_tsethi\\\"\"");
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator7);
        java.lang.String str10 = python3Target8.encodeIntAsCharEscape(1);
        java.lang.String str11 = python3Target8.getVersion();
        java.lang.String str13 = python3Target8.getImplicitRuleLabel("_tsethi!");
        java.lang.String str15 = python3Target8.getImplicitRuleLabel("__tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = python3Target8.getCodeGenerator();
        boolean boolean17 = python3Target8.supportsOverloadedMethods();
        java.lang.String str20 = python3Target8.getTargetStringLiteralFromString("\"_Python3\"", true);
        java.util.Set<java.lang.String> strSet21 = python3Target8.getBadWords();
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target24 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator23);
        boolean boolean25 = python3Target24.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = python3Target24.getCodeGenerator();
        java.lang.String str29 = python3Target24.getTargetStringLiteralFromString("\\n", false);
        org.antlr.v4.tool.Grammar grammar30 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target32 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator31);
        boolean boolean33 = python3Target32.wantsBaseListener();
        java.util.Set<java.lang.String> strSet34 = python3Target32.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup35 = python3Target32.getTemplates();
        java.lang.String str37 = python3Target32.getImplicitRuleLabel("\"\\\\1\"");
        org.antlr.v4.tool.Grammar grammar38 = null;
        int[] intArray39 = new int[] {};
        java.lang.String[] strArray40 = python3Target32.getTokenTypesAsTargetLabels(grammar38, intArray39);
        java.lang.String[] strArray41 = python3Target24.getTokenTypesAsTargetLabels(grammar30, intArray39);
        java.lang.String[] strArray42 = python3Target8.getTokenTypesAsTargetLabels(grammar22, intArray39);
        java.lang.String[] strArray43 = python3Target1.getTokenTypesAsTargetLabels(grammar6, intArray39);
        org.antlr.v4.codegen.CodeGenerator codeGenerator44 = python3Target1.getCodeGenerator();
        java.lang.String str46 = python3Target1.encodeIntAsCharEscape(29);
        org.antlr.v4.tool.Grammar grammar47 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str49 = python3Target1.getTokenTypeAsTargetLabel(grammar47, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"_tset\\\"_tsethi\\\"\"Context" + "'", str5, "\"_tset\\\"_tsethi\\\"\"Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\1" + "'", str10, "\\1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "__tsethi!" + "'", str13, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "___tsethi!" + "'", str15, "___tsethi!");
        org.junit.Assert.assertNull(codeGenerator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\\\"_Python3\\\"\"" + "'", str20, "\"\\\"_Python3\\\"\"");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(codeGenerator26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\\\\n" + "'", str29, "\\\\n");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNotNull(sTGroup35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "_\"\\\\1\"" + "'", str37, "_\"\\\\1\"");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[]");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNull(codeGenerator44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\\35" + "'", str46, "\\35");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("_tsethi", false);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("\\\"hi!\\\"");
        boolean boolean11 = python3Target1.wantsBaseVisitor();
        int int12 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\\\\\"hi!\\\\\\\"\"" + "'", str10, "\"\\\\\\\"hi!\\\\\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        boolean boolean8 = python3Target1.templatesExist();
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("hi!");
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target1.getTemplates();
        boolean boolean12 = python3Target1.supportsOverloadedMethods();
        java.lang.String str14 = python3Target1.encodeIntAsCharEscape((int) (short) 100);
        int int15 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean16 = python3Target1.templatesExist();
        java.lang.String str17 = python3Target1.getVersion();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"hi!\"" + "'", str10, "\"hi!\"");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "d" + "'", str14, "d");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\\n", true);
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("_tset_Python3");
        boolean boolean12 = python3Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target15 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator14);
        boolean boolean16 = python3Target15.wantsBaseListener();
        java.lang.String str18 = python3Target15.getListLabel("");
        boolean boolean19 = python3Target15.supportsOverloadedMethods();
        java.lang.String str21 = python3Target15.encodeIntAsCharEscape((int) ' ');
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        java.lang.String str25 = python3Target15.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator22, "\"\\\"\\\"Python3Contex\\\"\"", false);
        int int26 = python3Target15.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar27 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator28 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target29 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator28);
        java.lang.String str31 = python3Target29.encodeIntAsCharEscape(1);
        java.lang.String str32 = python3Target29.getVersion();
        java.lang.String str34 = python3Target29.getImplicitRuleLabel("_tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        java.lang.String str38 = python3Target29.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator35, "_Python3", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator39 = python3Target29.getCodeGenerator();
        boolean boolean40 = python3Target29.supportsOverloadedMethods();
        java.lang.String str42 = python3Target29.encodeIntAsCharEscape(64);
        org.antlr.v4.tool.Grammar grammar43 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator44 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target45 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator44);
        java.lang.String str47 = python3Target45.encodeIntAsCharEscape(1);
        java.lang.String str48 = python3Target45.getVersion();
        java.lang.String str50 = python3Target45.getImplicitRuleLabel("_tsethi!");
        java.lang.String str52 = python3Target45.getImplicitRuleLabel("__tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator53 = python3Target45.getCodeGenerator();
        boolean boolean54 = python3Target45.supportsOverloadedMethods();
        java.lang.String str57 = python3Target45.getTargetStringLiteralFromString("\"_Python3\"", true);
        java.util.Set<java.lang.String> strSet58 = python3Target45.getBadWords();
        org.antlr.v4.tool.Grammar grammar59 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator60 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target61 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator60);
        boolean boolean62 = python3Target61.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator63 = python3Target61.getCodeGenerator();
        java.lang.String str66 = python3Target61.getTargetStringLiteralFromString("\\n", false);
        org.antlr.v4.tool.Grammar grammar67 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator68 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target69 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator68);
        boolean boolean70 = python3Target69.wantsBaseListener();
        java.util.Set<java.lang.String> strSet71 = python3Target69.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup72 = python3Target69.getTemplates();
        java.lang.String str74 = python3Target69.getImplicitRuleLabel("\"\\\\1\"");
        org.antlr.v4.tool.Grammar grammar75 = null;
        int[] intArray76 = new int[] {};
        java.lang.String[] strArray77 = python3Target69.getTokenTypesAsTargetLabels(grammar75, intArray76);
        java.lang.String[] strArray78 = python3Target61.getTokenTypesAsTargetLabels(grammar67, intArray76);
        java.lang.String[] strArray79 = python3Target45.getTokenTypesAsTargetLabels(grammar59, intArray76);
        java.lang.String[] strArray80 = python3Target29.getTokenTypesAsTargetLabels(grammar43, intArray76);
        java.lang.String[] strArray81 = python3Target15.getTokenTypesAsTargetLabels(grammar27, intArray76);
        java.lang.String[] strArray82 = python3Target1.getTokenTypesAsTargetLabels(grammar13, intArray76);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"" + "'", str9, "\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"_tset_Python3\"" + "'", str11, "\"_tset_Python3\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " " + "'", str21, " ");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\\\"\\\"Python3Contex\\\"" + "'", str25, "\\\"\\\"Python3Contex\\\"");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 64 + "'", int26 == 64);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\\1" + "'", str31, "\\1");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "4.5.2.1" + "'", str32, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "__tsethi!" + "'", str34, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Python" + "'", str38, "Python");
        org.junit.Assert.assertNull(codeGenerator39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "@" + "'", str42, "@");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\\1" + "'", str47, "\\1");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "4.5.2.1" + "'", str48, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "__tsethi!" + "'", str50, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "___tsethi!" + "'", str52, "___tsethi!");
        org.junit.Assert.assertNull(codeGenerator53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "\"\\\"_Python3\\\"\"" + "'", str57, "\"\\\"_Python3\\\"\"");
        org.junit.Assert.assertNotNull(strSet58);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(codeGenerator63);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "\\\\n" + "'", str66, "\\\\n");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(strSet71);
        org.junit.Assert.assertNotNull(sTGroup72);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "_\"\\\\1\"" + "'", str74, "_\"\\\\1\"");
        org.junit.Assert.assertNotNull(intArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray76), "[]");
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertNotNull(strArray82);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        boolean boolean3 = python3Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python3Target1.getBadWords();
        int int5 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("\"_tset_i\"");
        java.lang.String str10 = python3Target1.encodeIntAsCharEscape((int) (byte) 1);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getRuleFunctionContextStructName(ruleFunction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"_tset_i\\\"\"" + "'", str8, "\"\\\"_tset_i\\\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\1" + "'", str10, "\\1");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getAltLabelContextStructName("_Python3");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "__tsethi!", false);
        java.lang.String str10 = python3Target1.encodeIntAsCharEscape((int) (short) 100);
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        java.lang.String str13 = python3Target1.getImplicitSetLabel("_tset__tset_Python3Context");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getImplicitTokenLabel("__\\\"___tsethi!\\\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_tset_tset__tset_Python3Context" + "'", str13, "_tset_tset__tset_Python3Context");
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel(".5.2.");
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("\"\\\"_Python3\\\"\"");
        java.lang.String str10 = python3Target1.getAltLabelContextStructName("\"_ \"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_.5.2." + "'", str6, "_.5.2.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"\\\\\\\"_Python3\\\\\\\"\\\"\"" + "'", str8, "\"\\\"\\\\\\\"_Python3\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_ \"Context" + "'", str10, "\"_ \"Context");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getAltLabelContextStructName("_Python3");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "__tsethi!", false);
        java.lang.String str10 = python3Target1.encodeIntAsCharEscape((int) (short) 100);
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        int int12 = python3Target1.getInlineTestSetWordSize();
        int int13 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str15 = python3Target1.getAltLabelContextStructName("\"hi!\"");
        boolean boolean16 = python3Target1.templatesExist();
        boolean boolean17 = python3Target1.supportsOverloadedMethods();
        int int18 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29 + "'", int13 == 29);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"hi!\"Context" + "'", str15, "\"hi!\"Context");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 29 + "'", int18 == 29);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        java.lang.String str3 = python3Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_\"hi!\"");
        java.util.Set<java.lang.String> strSet7 = python3Target1.getBadWords();
        java.lang.String str9 = python3Target1.getAltLabelContextStructName("\"_\\\\\\\"hi!\\\\\\\"\"");
        int int10 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "___\\\"___tsethi!\\\"", false);
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python3" + "'", str3, "Python3");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__\"hi!\"" + "'", str6, "__\"hi!\"");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"_\\\\\\\"hi!\\\\\\\"\"Context" + "'", str9, "\"_\\\\\\\"hi!\\\\\\\"\"Context");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "__\\\"___tsethi!\\\"" + "'", str14, "__\\\"___tsethi!\\\"");
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("Python3", true);
        java.lang.String str12 = python3Target1.getImplicitSetLabel("hi!");
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\"Python3Contex\"");
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        int int18 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target21 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator20);
        java.lang.String str23 = python3Target21.encodeIntAsCharEscape(1);
        org.stringtemplate.v4.STGroup sTGroup24 = python3Target21.getTemplates();
        boolean boolean25 = python3Target21.supportsOverloadedMethods();
        boolean boolean26 = python3Target21.templatesExist();
        org.antlr.v4.tool.Grammar grammar27 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator28 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target29 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator28);
        java.lang.String str31 = python3Target29.encodeIntAsCharEscape(1);
        java.lang.String str32 = python3Target29.getVersion();
        java.lang.String str34 = python3Target29.getImplicitRuleLabel("_tsethi!");
        java.lang.String str36 = python3Target29.getImplicitRuleLabel("__tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator37 = python3Target29.getCodeGenerator();
        boolean boolean38 = python3Target29.supportsOverloadedMethods();
        java.lang.String str41 = python3Target29.getTargetStringLiteralFromString("\"_Python3\"", true);
        java.util.Set<java.lang.String> strSet42 = python3Target29.getBadWords();
        org.antlr.v4.tool.Grammar grammar43 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator44 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target45 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator44);
        boolean boolean46 = python3Target45.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator47 = python3Target45.getCodeGenerator();
        java.lang.String str50 = python3Target45.getTargetStringLiteralFromString("\\n", false);
        org.antlr.v4.tool.Grammar grammar51 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator52 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target53 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator52);
        boolean boolean54 = python3Target53.wantsBaseListener();
        java.util.Set<java.lang.String> strSet55 = python3Target53.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup56 = python3Target53.getTemplates();
        java.lang.String str58 = python3Target53.getImplicitRuleLabel("\"\\\\1\"");
        org.antlr.v4.tool.Grammar grammar59 = null;
        int[] intArray60 = new int[] {};
        java.lang.String[] strArray61 = python3Target53.getTokenTypesAsTargetLabels(grammar59, intArray60);
        java.lang.String[] strArray62 = python3Target45.getTokenTypesAsTargetLabels(grammar51, intArray60);
        java.lang.String[] strArray63 = python3Target29.getTokenTypesAsTargetLabels(grammar43, intArray60);
        java.lang.String[] strArray64 = python3Target21.getTokenTypesAsTargetLabels(grammar27, intArray60);
        java.lang.String[] strArray65 = python3Target1.getTokenTypesAsTargetLabels(grammar19, intArray60);
        int int66 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean67 = python3Target1.supportsOverloadedMethods();
        boolean boolean68 = python3Target1.supportsOverloadedMethods();
        java.lang.String str70 = python3Target1.getImplicitRuleLabel("_tset_tset\"4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Python3\"" + "'", str10, "\"Python3\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsethi!" + "'", str12, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"Python3Contex\\\"\"" + "'", str14, "\"\\\"Python3Contex\\\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"4.5.2.1\"" + "'", str17, "\"4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\\1" + "'", str23, "\\1");
        org.junit.Assert.assertNotNull(sTGroup24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\\1" + "'", str31, "\\1");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "4.5.2.1" + "'", str32, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "__tsethi!" + "'", str34, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "___tsethi!" + "'", str36, "___tsethi!");
        org.junit.Assert.assertNull(codeGenerator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\"\\\"_Python3\\\"\"" + "'", str41, "\"\\\"_Python3\\\"\"");
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(codeGenerator47);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\\\\n" + "'", str50, "\\\\n");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertNotNull(sTGroup56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "_\"\\\\1\"" + "'", str58, "_\"\\\\1\"");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[]");
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 29 + "'", int66 == 29);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "__tset_tset\"4.5.2.1\"" + "'", str70, "__tset_tset\"4.5.2.1\"");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str9 = python3Target1.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean10 = python3Target1.templatesExist();
        int int11 = python3Target1.getInlineTestSetWordSize();
        java.lang.Class<?> wildcardClass12 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\n" + "'", str9, "\\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        boolean boolean8 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target1.getCodeGenerator();
        boolean boolean11 = python3Target1.wantsBaseVisitor();
        java.lang.String str12 = python3Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Python3" + "'", str12, "Python3");
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.util.Set<java.lang.String> strSet4 = python3Target1.getBadWords();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        java.lang.String str6 = python3Target1.getLanguage();
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        java.lang.String str3 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.getLanguage();
        int int5 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        java.lang.String str6 = python3Target1.getListLabel("_Python3Context");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet8 = python3Target1.getBadWords();
        java.util.Set<java.lang.String> strSet9 = python3Target1.getBadWords();
        java.lang.String str10 = python3Target1.getLanguage();
        int int11 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str13 = python3Target1.getAltLabelContextStructName("_hi!Context");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_Python3Context" + "'", str6, "_Python3Context");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python3" + "'", str10, "Python3");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29 + "'", int11 == 29);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_hi!ContextContext" + "'", str13, "_hi!ContextContext");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("tsetPytho");
        java.util.Set<java.lang.String> strSet5 = python3Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tsettsetPytho" + "'", str4, "_tsettsetPytho");
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("_\"hi!\"", false);
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        boolean boolean10 = python3Target1.wantsBaseVisitor();
        int int11 = python3Target1.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target1.getTemplates();
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("_\"\\\"\\\"\"Context", true);
        boolean boolean16 = python3Target1.templatesExist();
        java.lang.String str18 = python3Target1.getImplicitRuleLabel("_tset\"\\\"\\\\\\\\1\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_\\\"hi!\\\"" + "'", str8, "_\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29 + "'", int11 == 29);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"_\\\"\\\\\\\"\\\\\\\"\\\"Context\"" + "'", str15, "\"_\\\"\\\\\\\"\\\\\\\"\\\"Context\"");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "__tset\"\\\"\\\\\\\\1\\\"\"" + "'", str18, "__tset\"\\\"\\\\\\\\1\\\"\"");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.util.Set<java.lang.String> strSet4 = python3Target1.getBadWords();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        int int6 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("\\\"\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\1Context\\\\\\\"\\\"", true);
        boolean boolean10 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Rule rule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getRuleFunctionContextStructName(rule11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\1Context\\\\\\\\\\\\\\\"\\\\\\\"\"" + "'", str9, "\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\1Context\\\\\\\\\\\\\\\"\\\\\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target1.getCodeGenerator();
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape((int) (short) 10);
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        java.lang.String str7 = python3Target1.getLanguage();
        java.lang.String str9 = python3Target1.getListLabel("\\\\n");
        java.lang.String str11 = python3Target1.encodeIntAsCharEscape((int) (short) 10);
        boolean boolean12 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet13 = python3Target1.getBadWords();
        java.lang.String str15 = python3Target1.encodeIntAsCharEscape(29);
        java.lang.String str16 = python3Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\n" + "'", str5, "\\n");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\\\n" + "'", str9, "\\\\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\n" + "'", str11, "\\n");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\35" + "'", str15, "\\35");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Python3" + "'", str16, "Python3");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str7 = python3Target1.getVersion();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getRuleFunctionContextStructName(ruleFunction8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\1" + "'", str6, "\\1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("Python3");
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "\\35", false);
        java.lang.String str15 = python3Target1.getImplicitRuleLabel("\"hi!\"");
        boolean boolean16 = python3Target1.supportsOverloadedMethods();
        boolean boolean17 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_Python3" + "'", str9, "_Python3");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3" + "'", str13, "3");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_\"hi!\"" + "'", str15, "_\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        boolean boolean8 = python3Target1.templatesExist();
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("hi!");
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target1.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target1.getTemplates();
        java.lang.String str14 = python3Target1.getListLabel("d");
        java.lang.String str16 = python3Target1.encodeIntAsCharEscape(64);
        boolean boolean17 = python3Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"hi!\"" + "'", str10, "\"hi!\"");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "d" + "'", str14, "d");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "@" + "'", str16, "@");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("Python3");
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.getTemplates();
        java.lang.String str12 = python3Target1.getImplicitSetLabel("PythonContext");
        java.lang.String str13 = python3Target1.getLanguage();
        int int14 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str15 = python3Target1.getVersion();
        boolean boolean16 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_Python3" + "'", str9, "_Python3");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsetPythonContext" + "'", str12, "_tsetPythonContext");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python3" + "'", str13, "Python3");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4.5.2.1" + "'", str15, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        boolean boolean8 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getVersion();
        java.lang.String str12 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target1.getCodeGenerator();
        java.lang.String str15 = python3Target1.getAltLabelContextStructName("\\\"ContextContex");
        boolean boolean16 = python3Target1.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python3Target1.getElementName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Python3" + "'", str12, "Python3");
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\\"ContextContexContext" + "'", str15, "\\\"ContextContexContext");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.wantsBaseListener();
        java.lang.String str6 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet9 = python3Target1.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getImplicitTokenLabel("\"\\\\\\\"\\\\\\\\\\\\\\\"_Python3\\\\\\\\\\\\\\\"\\\\\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_Python3", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target1.getCodeGenerator();
        java.lang.String str13 = python3Target1.getAltLabelContextStructName("Python");
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("__\"_Python3\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.getLoopCounter(grammarAST16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PythonContext" + "'", str13, "PythonContext");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"__\\\"_Python3\\\"\"" + "'", str15, "\"__\\\"_Python3\\\"\"");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        int int6 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python3Target1.getListLabel("_i");
        java.lang.String str10 = python3Target1.encodeIntAsCharEscape((int) (short) 1);
        boolean boolean11 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "_\"\\\"_\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"Python3Contex\\\\\\\\\\\\\\\"\\\"\"", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 29 + "'", int6 == 29);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_i" + "'", str8, "_i");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\1" + "'", str10, "\\1");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"\\\"_\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"Python3Contex\\\\\\\\\\\\\\\"\\\"\"" + "'", str15, "\"\\\"\\\"_\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"Python3Contex\\\\\\\\\\\\\\\"\\\"\"");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getImplicitRuleLabel("\"_Python3\"");
        boolean boolean8 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        java.lang.String str11 = python3Target1.getImplicitRuleLabel("__tset_tset\"4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_\"_Python3\"" + "'", str7, "_\"_Python3\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "___tset_tset\"4.5.2.1\"" + "'", str11, "___tset_tset\"4.5.2.1\"");
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getTargetStringLiteralFromString("\"_Python3\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target1.getImplicitTokenLabel("\"\\\"\\\\\\\"ython\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\\\"_Python3\\\"\"" + "'", str4, "\"\\\"_Python3\\\"\"");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getAltLabelContextStructName("_Python3");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "__tsethi!", false);
        boolean boolean9 = python3Target1.wantsBaseListener();
        java.lang.String str11 = python3Target1.getImplicitSetLabel("");
        java.lang.String str13 = python3Target1.getListLabel("_\\\"hi!\\\"");
        boolean boolean14 = python3Target1.templatesExist();
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        java.lang.String str21 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator18, "\"\"ContextContext", false);
        java.util.Set<java.lang.String> strSet22 = python3Target1.getBadWords();
        boolean boolean23 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset" + "'", str11, "_tset");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_\\\"hi!\\\"" + "'", str13, "_\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str17, "\"\\\"\\\\\\\\1\\\"\"");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\\\"ContextContex" + "'", str21, "\\\"ContextContex");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.util.Set<java.lang.String> strSet4 = python3Target1.getBadWords();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        int int6 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python3Target1.getImplicitSetLabel("_tset_Python3");
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset_tset_Python3" + "'", str8, "_tset_tset_Python3");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "_Python3Context", true);
        java.lang.String str9 = python3Target1.getListLabel("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target1.getCodeGenerator();
        java.lang.String str12 = python3Target1.getAltLabelContextStructName("_tset_Python3");
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\"\\\\1\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        java.lang.String str18 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator15, "\\\"hi!\\\"", false);
        java.lang.String str20 = python3Target1.getImplicitRuleLabel("___tsethi!");
        org.stringtemplate.v4.STGroup sTGroup21 = python3Target1.getTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = python3Target1.getLoopCounter(grammarAST22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"Python3Contex\"" + "'", str7, "\"Python3Contex\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_Python3Context" + "'", str12, "_tset_Python3Context");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str14, "\"\\\"\\\\\\\\1\\\"\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\\\"hi!\\\"" + "'", str18, "\\\"hi!\\\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "____tsethi!" + "'", str20, "____tsethi!");
        org.junit.Assert.assertNotNull(sTGroup21);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        boolean boolean8 = python3Target1.templatesExist();
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("hi!");
        java.lang.String str12 = python3Target1.getImplicitRuleLabel("\"hi!\"");
        java.util.Set<java.lang.String> strSet13 = python3Target1.getBadWords();
        boolean boolean14 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"hi!\"" + "'", str10, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_\"hi!\"" + "'", str12, "_\"hi!\"");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
        java.util.Set<java.lang.String> strSet10 = python3Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target1.getCodeGenerator();
        java.lang.String str5 = python3Target1.getVersion();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("\\\\1Context", true);
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getImplicitRuleLabel("");
        boolean boolean12 = python3Target1.wantsBaseVisitor();
        java.lang.Class<?> wildcardClass13 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\\\\\\1Context\"" + "'", str8, "\"\\\\\\\\1Context\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_" + "'", str11, "_");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        boolean boolean8 = python3Target1.templatesExist();
        java.lang.String str9 = python3Target1.getLanguage();
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        java.lang.String str12 = python3Target1.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean13 = python3Target1.templatesExist();
        java.lang.String str15 = python3Target1.getImplicitRuleLabel("_tset4.5.2.1");
        int int16 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str18 = python3Target1.getTargetStringLiteralFromString("_tset\\\"Tset_tseContext\\\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python3" + "'", str9, "Python3");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\n" + "'", str12, "\\n");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "__tset4.5.2.1" + "'", str15, "__tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 29 + "'", int16 == 29);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"_tset\\\\\\\"Tset_tseContext\\\\\\\"\"" + "'", str18, "\"_tset\\\\\\\"Tset_tseContext\\\\\\\"\"");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("Python3", true);
        java.lang.String str12 = python3Target1.getImplicitSetLabel("hi!");
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\"Python3Contex\"");
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        java.lang.String str18 = python3Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python3Target1.getLoopLabel(grammarAST19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Python3\"" + "'", str10, "\"Python3\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsethi!" + "'", str12, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"Python3Contex\\\"\"" + "'", str14, "\"\\\"Python3Contex\\\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"4.5.2.1\"" + "'", str17, "\"4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python3" + "'", str18, "Python3");
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        boolean boolean8 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getVersion();
        java.lang.String str12 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python3Target1.getCodeGenerator();
        int int15 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromString("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Python3" + "'", str12, "Python3");
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertNull(codeGenerator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        boolean boolean8 = python3Target1.templatesExist();
        java.lang.String str9 = python3Target1.getLanguage();
        boolean boolean10 = python3Target1.wantsBaseVisitor();
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\\\"_hi\\\"", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python3" + "'", str9, "Python3");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\\\\\\"_hi\\\\\\\"" + "'", str14, "\\\\\\\"_hi\\\\\\\"");
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "_Python3Context", true);
        java.lang.String str9 = python3Target1.getListLabel("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target1.getCodeGenerator();
        java.lang.String str12 = python3Target1.getAltLabelContextStructName("_tset_Python3");
        java.lang.String str14 = python3Target1.getImplicitRuleLabel("_tset_Python3Context");
        boolean boolean15 = python3Target1.templatesExist();
        int int16 = python3Target1.getInlineTestSetWordSize();
        boolean boolean17 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Rule rule18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target1.getRuleFunctionContextStructName(rule18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"Python3Contex\"" + "'", str7, "\"Python3Contex\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_Python3Context" + "'", str12, "_tset_Python3Context");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "__tset_Python3Context" + "'", str14, "__tset_Python3Context");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        int int6 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python3Target1.getListLabel("_i");
        java.lang.String str10 = python3Target1.getImplicitRuleLabel("\\0");
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = codeGenerator12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 29 + "'", int6 == 29);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_i" + "'", str8, "_i");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_\\0" + "'", str10, "_\\0");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(codeGenerator12);
    }
}

