import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        int int5 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "__tsethi!", true);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getRuleFunctionContextStructName(ruleFunction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tsethi\"" + "'", str10, "\"_tsethi\"");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        boolean boolean7 = python3Target1.templatesExist();
        boolean boolean8 = python3Target1.wantsBaseVisitor();
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_Python3", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target1.getCodeGenerator();
        java.lang.String str13 = python3Target1.getImplicitRuleLabel("\"___tsethi!\"");
        org.antlr.v4.tool.Rule rule14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getRuleFunctionContextStructName(rule14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_\"___tsethi!\"" + "'", str13, "_\"___tsethi!\"");
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        boolean boolean5 = python3Target1.templatesExist();
        java.lang.String str7 = python3Target1.getImplicitSetLabel("__hi!");
        boolean boolean8 = python3Target1.templatesExist();
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset__hi!" + "'", str7, "_tset__hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\\\\1", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "\\\\n", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getElementListName("\"\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\\\\\\\1" + "'", str6, "\\\\\\\\1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\n" + "'", str10, "\\n");
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target1.getCodeGenerator();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\\n", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_\\\"\\\\1", true);
        org.antlr.v4.tool.Grammar grammar11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getTokenTypeAsTargetLabel(grammar11, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\\\n" + "'", str6, "\\\\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"\\\\\"" + "'", str10, "\"\\\"\\\\\"");
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getImplicitTokenLabel("\\\\1Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\1" + "'", str6, "\\1");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getImplicitRuleLabel("\"\\\"Python3Contex\\\"\"");
        int int8 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\\\"_tsethi\\\"", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_\"\\\"Python3Contex\\\"\"" + "'", str7, "_\"\\\"Python3Contex\\\"\"");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\\"_tsethi\\\"" + "'", str12, "\\\"_tsethi\\\"");
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_Python3", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target1.getCodeGenerator();
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\"\"", true);
        int int15 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str16 = python3Target1.getLanguage();
        java.lang.String str18 = python3Target1.getImplicitSetLabel("_i");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python3Target1.getElementListName("_Python3ContextContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"\\\"\"" + "'", str14, "\"\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Python3" + "'", str16, "Python3");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset_i" + "'", str18, "_tset_i");
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("_tsethi", false);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("\\\"hi!\\\"");
        boolean boolean11 = python3Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target1.getTemplates();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getRuleFunctionContextStructName(ruleFunction13);
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
        org.junit.Assert.assertNotNull(sTGroup12);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getElementListName("Python3");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.util.Set<java.lang.String> strSet4 = python3Target1.getBadWords();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        int int6 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet7 = python3Target1.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getImplicitTokenLabel("_tset_Python3Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
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
        java.lang.String str21 = python3Target1.getImplicitRuleLabel("_hi!Context");
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "__hi!Context" + "'", str21, "__hi!Context");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "_Python3Context", true);
        java.lang.String str9 = python3Target1.getListLabel("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target1.getCodeGenerator();
        java.lang.String str12 = python3Target1.getAltLabelContextStructName("_tset_Python3");
        boolean boolean13 = python3Target1.templatesExist();
        boolean boolean14 = python3Target1.supportsOverloadedMethods();
        java.lang.String str16 = python3Target1.getListLabel("__\"___tsethi!\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python3Target1.getLoopLabel(grammarAST17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"Python3Contex\"" + "'", str7, "\"Python3Contex\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_Python3Context" + "'", str12, "_tset_Python3Context");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "__\"___tsethi!\"" + "'", str16, "__\"___tsethi!\"");
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getAltLabelContextStructName("_Python3");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "__tsethi!", false);
        boolean boolean9 = python3Target1.wantsBaseListener();
        boolean boolean10 = python3Target1.wantsBaseVisitor();
        java.lang.String str12 = python3Target1.encodeIntAsCharEscape((int) (short) 10);
        boolean boolean13 = python3Target1.templatesExist();
        org.antlr.v4.tool.Rule rule14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getRuleFunctionContextStructName(rule14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\n" + "'", str12, "\\n");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\"Python3Contex\"");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("_\"___tsethi!\"");
        java.lang.String str9 = python3Target1.getVersion();
        boolean boolean10 = python3Target1.wantsBaseVisitor();
        boolean boolean11 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\"Python3Contex\\\"\"" + "'", str6, "\"\\\"Python3Contex\\\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "__\"___tsethi!\"" + "'", str8, "__\"___tsethi!\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("Python3");
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.getTemplates();
        java.lang.String str12 = python3Target1.getImplicitSetLabel("PythonContext");
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("_\"___tsethi!\"");
        java.lang.String str16 = python3Target1.getImplicitSetLabel("\"4.5.2.1\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python3Target1.getElementListName("_tset_tset_Python3");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_Python3" + "'", str9, "_Python3");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsetPythonContext" + "'", str12, "_tsetPythonContext");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"_\\\"___tsethi!\\\"\"" + "'", str14, "\"_\\\"___tsethi!\\\"\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_tset\"4.5.2.1\"" + "'", str16, "_tset\"4.5.2.1\"");
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "_Python3Context", true);
        java.lang.String str7 = python3Target1.encodeIntAsCharEscape((int) (short) 10);
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        boolean boolean9 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.getTemplates();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python3Contex\"" + "'", str5, "\"Python3Contex\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\n" + "'", str7, "\\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(sTGroup10);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("____tsethi!", false);
        org.antlr.v4.tool.Grammar grammar12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getTokenTypeAsTargetLabel(grammar12, (int) (short) 1);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "____tsethi!" + "'", str11, "____tsethi!");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_Python3", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target1.getCodeGenerator();
        boolean boolean12 = python3Target1.supportsOverloadedMethods();
        boolean boolean13 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "_Python3Context", true);
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python3Contex\"" + "'", str5, "\"Python3Contex\"");
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        int int6 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getLoopLabel(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 29 + "'", int6 == 29);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.wantsBaseListener();
        java.lang.String str7 = python3Target1.getListLabel("\\\\1Context");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\\\1Context" + "'", str7, "\\\\1Context");
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getLanguage();
        boolean boolean8 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("_tsethi!", false);
        int int7 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python3Target1.getAltLabelContextStructName("_tset4.5.2.1");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getRuleFunctionContextStructName(ruleFunction10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tsethi!" + "'", str6, "_tsethi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset4.5.2.1Context" + "'", str9, "_tset4.5.2.1Context");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("__tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        boolean boolean10 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "_ ", true);
        java.lang.String str15 = python3Target1.getLanguage();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "___tsethi!" + "'", str8, "___tsethi!");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"" + "'", str14, "\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python3" + "'", str15, "Python3");
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getImplicitRuleLabel("\"_Python3\"");
        boolean boolean8 = python3Target1.wantsBaseVisitor();
        java.lang.String str9 = python3Target1.getLanguage();
        java.lang.String str11 = python3Target1.getImplicitRuleLabel("\"__tset_Python3ContextContext\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_\"_Python3\"" + "'", str7, "_\"_Python3\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python3" + "'", str9, "Python3");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_\"__tset_Python3ContextContext\"" + "'", str11, "_\"__tset_Python3ContextContext\"");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target1.getCodeGenerator();
        java.lang.String str11 = python3Target1.getLanguage();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_" + "'", str8, "_");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python3" + "'", str11, "Python3");
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_Python3", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target1.getCodeGenerator();
        java.lang.String str13 = python3Target1.getAltLabelContextStructName("Python");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getImplicitTokenLabel("_\"hi!\"");
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
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getImplicitRuleLabel("\"_Python3\"");
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "_tsetPython", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_\"_Python3\"" + "'", str7, "_\"_Python3\"");
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "tsetPytho" + "'", str12, "tsetPytho");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "__tset_Python3ContextContext", false);
        boolean boolean8 = python3Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset_Python3ContextContex" + "'", str7, "_tset_Python3ContextContex");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "_Python3Context", true);
        java.lang.String str7 = python3Target1.getListLabel("Python");
        java.lang.String str9 = python3Target1.getAltLabelContextStructName("\\\\1");
        java.lang.String str10 = python3Target1.getVersion();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python3Contex\"" + "'", str5, "\"Python3Contex\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python" + "'", str7, "Python");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\\\1Context" + "'", str9, "\\\\1Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getAltLabelContextStructName("_Python3");
        java.lang.String str6 = python3Target1.getListLabel("\"\\\\1\"");
        java.lang.String str8 = python3Target1.getListLabel("\"\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\\1\"" + "'", str6, "\"\\\\1\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"" + "'", str8, "\"\"");
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("__tsethi!");
        java.lang.String str9 = python3Target1.getVersion();
        int int10 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str12 = python3Target1.getAltLabelContextStructName("tsetPythonContex");
        org.antlr.v4.tool.Grammar grammar13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getTokenTypeAsTargetLabel(grammar13, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "___tsethi!" + "'", str8, "___tsethi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "TsetPythonContexContext" + "'", str12, "TsetPythonContexContext");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.wantsBaseListener();
        java.lang.String str6 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getImplicitTokenLabel("\\\"_tsethi\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        boolean boolean5 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.getTemplates();
        org.antlr.v4.tool.Rule rule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getRuleFunctionContextStructName(rule7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(sTGroup6);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python3Target1.getLoopCounter(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        boolean boolean8 = python3Target1.templatesExist();
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("hi!");
        java.lang.String str12 = python3Target1.getImplicitRuleLabel("\"hi!\"");
        java.lang.String str13 = python3Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getElementName("\"\\\"_Python3\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"hi!\"" + "'", str10, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_\"hi!\"" + "'", str12, "_\"hi!\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python3" + "'", str13, "Python3");
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("_tsethi", false);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("\\\"hi!\\\"");
        boolean boolean11 = python3Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "_tseti", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python3Target1.getLoopLabel(grammarAST17);
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
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "tset" + "'", str16, "tset");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str6 = python3Target1.getLanguage();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("_\\\"\\\"Python3Contex\\\"", true);
        java.lang.String str11 = python3Target1.getImplicitSetLabel("\\\"\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\1Context\\\\\\\"\\\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"_\\\\\\\"\\\\\\\"Python3Contex\\\\\\\"\"" + "'", str9, "\"_\\\\\\\"\\\\\\\"Python3Contex\\\\\\\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset\\\"\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\1Context\\\\\\\"\\\"" + "'", str11, "_tset\\\"\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\1Context\\\\\\\"\\\"");
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
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
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("_\"_Python3\"");
        java.lang.String str17 = python3Target1.getAltLabelContextStructName("\"hi!\"ContextContext");
        java.lang.String str18 = python3Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"_\\\"_Python3\\\"\"" + "'", str15, "\"_\\\"_Python3\\\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"hi!\"ContextContextContext" + "'", str17, "\"hi!\"ContextContextContext");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python3" + "'", str18, "Python3");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        boolean boolean8 = python3Target1.templatesExist();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getRuleFunctionContextStructName(ruleFunction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
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
        java.lang.String str13 = python3Target1.getAltLabelContextStructName("_hi!");
        int int14 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_hi!Context" + "'", str13, "_hi!Context");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.encodeIntAsCharEscape((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_" + "'", str8, "_");
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("\"\\\\1\"");
        java.lang.String str8 = python3Target1.getListLabel("__tset_Python3ContextContext");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_\"\\\\1\"" + "'", str6, "_\"\\\\1\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "__tset_Python3ContextContext" + "'", str8, "__tset_Python3ContextContext");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\\n", true);
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"_tset\\\"_tsethi\\\"\"");
        org.antlr.v4.tool.Rule rule12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getRuleFunctionContextStructName(rule12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"" + "'", str9, "\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"_tset\\\"_tsethi\\\"\"Context" + "'", str11, "\"_tset\\\"_tsethi\\\"\"Context");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("_\"hi!\"", false);
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass10 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_\\\"hi!\\\"" + "'", str8, "_\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        boolean boolean7 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "4.5.2.1", false);
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target1.getTemplates();
        java.lang.String str14 = python3Target1.encodeIntAsCharEscape(10);
        boolean boolean15 = python3Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python3Target1.getTokenTypeAsTargetLabel(grammar16, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".5.2." + "'", str11, ".5.2.");
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\n" + "'", str14, "\\n");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\\\\1", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "\\\\n", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getElementListName("\\\"___tsethi!\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\\\\\\\1" + "'", str6, "\\\\\\\\1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\n" + "'", str10, "\\n");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
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
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target17 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator16);
        java.lang.String str19 = python3Target17.encodeIntAsCharEscape(1);
        java.lang.String str20 = python3Target17.getVersion();
        java.lang.String str22 = python3Target17.getImplicitRuleLabel("_tsethi!");
        java.lang.String str24 = python3Target17.getImplicitRuleLabel("__tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = python3Target17.getCodeGenerator();
        boolean boolean26 = python3Target17.supportsOverloadedMethods();
        java.lang.String str29 = python3Target17.getTargetStringLiteralFromString("\"_Python3\"", true);
        java.util.Set<java.lang.String> strSet30 = python3Target17.getBadWords();
        org.antlr.v4.tool.Grammar grammar31 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target33 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator32);
        boolean boolean34 = python3Target33.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = python3Target33.getCodeGenerator();
        java.lang.String str38 = python3Target33.getTargetStringLiteralFromString("\\n", false);
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
        java.lang.String[] strArray50 = python3Target33.getTokenTypesAsTargetLabels(grammar39, intArray48);
        java.lang.String[] strArray51 = python3Target17.getTokenTypesAsTargetLabels(grammar31, intArray48);
        java.lang.String[] strArray52 = python3Target1.getTokenTypesAsTargetLabels(grammar15, intArray48);
        boolean boolean53 = python3Target1.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str55 = python3Target1.getElementListName("_\"Python3\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "@" + "'", str14, "@");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\\1" + "'", str19, "\\1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4.5.2.1" + "'", str20, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "__tsethi!" + "'", str22, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "___tsethi!" + "'", str24, "___tsethi!");
        org.junit.Assert.assertNull(codeGenerator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\\\"_Python3\\\"\"" + "'", str29, "\"\\\"_Python3\\\"\"");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(codeGenerator35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\\\\n" + "'", str38, "\\\\n");
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
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("Python3");
        boolean boolean10 = python3Target1.wantsBaseListener();
        java.lang.String str12 = python3Target1.getImplicitSetLabel("_\"\\\\1\"");
        org.antlr.v4.tool.Grammar grammar13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getTokenTypeAsTargetLabel(grammar13, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_Python3" + "'", str9, "_Python3");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_\"\\\\1\"" + "'", str12, "_tset_\"\\\\1\"");
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getTargetStringLiteralFromString("\"_Python3\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "\"\\\"4.5.2.1\\\"\"", false);
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\\\"_Python3\\\"\"" + "'", str4, "\"\\\"_Python3\\\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\\"4.5.2.1\\\"" + "'", str8, "\\\"4.5.2.1\\\"");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
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
        org.antlr.v4.tool.Rule rule16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.getRuleFunctionContextStructName(rule16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        java.lang.String str6 = python3Target1.getListLabel("_Python3Context");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target1.getTemplates();
        java.lang.String str10 = python3Target1.getImplicitRuleLabel("\"Python3\"");
        java.lang.String str12 = python3Target1.encodeIntAsCharEscape((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_Python3Context" + "'", str6, "_Python3Context");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_\"Python3\"" + "'", str10, "_\"Python3\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\64" + "'", str12, "\\64");
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        boolean boolean8 = python3Target1.templatesExist();
        boolean boolean9 = python3Target1.wantsBaseListener();
        org.antlr.v4.tool.Rule rule10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getRuleFunctionContextStructName(rule10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        boolean boolean8 = python3Target1.templatesExist();
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("hi!");
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "_\"hi!\"", false);
        java.lang.String str17 = python3Target1.encodeIntAsCharEscape((int) '4');
        java.lang.Class<?> wildcardClass18 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"hi!\"" + "'", str10, "\"hi!\"");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\\"hi!" + "'", str15, "\\\"hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\64" + "'", str17, "\\64");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("Python3");
        java.lang.String str11 = python3Target1.getImplicitSetLabel("_Python3");
        boolean boolean12 = python3Target1.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getElementListName("_tset\\\\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_Python3" + "'", str9, "_Python3");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset_Python3" + "'", str11, "_tset_Python3");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
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
        java.lang.String str19 = python3Target1.getImplicitSetLabel("\"\\\\\\\"_tsethi\\\\\\\"\"");
        java.lang.String str21 = python3Target1.getImplicitSetLabel("_tset_tset");
        java.util.Set<java.lang.String> strSet22 = python3Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup23 = python3Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset" + "'", str11, "_tset");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_\\\"hi!\\\"" + "'", str13, "_\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str17, "\"\\\"\\\\\\\\1\\\"\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_tset\"\\\\\\\"_tsethi\\\\\\\"\"" + "'", str19, "_tset\"\\\\\\\"_tsethi\\\\\\\"\"");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "_tset_tset_tset" + "'", str21, "_tset_tset_tset");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(sTGroup23);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("Python3");
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getImplicitTokenLabel("_hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_Python3" + "'", str9, "_Python3");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python3" + "'", str11, "Python3");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        java.lang.String str7 = python3Target1.encodeIntAsCharEscape((int) ' ');
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("\"_tsethi\"", false);
        boolean boolean11 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getLoopLabel(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\\"_tsethi\\\"" + "'", str10, "\\\"_tsethi\\\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean5 = python3Target1.templatesExist();
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        java.lang.Class<?> wildcardClass7 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str6 = python3Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertNotNull(sTGroup7);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        int int9 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.encodeIntAsCharEscape((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("__tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        boolean boolean10 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "_ ", true);
        java.lang.String str15 = python3Target1.getLanguage();
        java.lang.String str17 = python3Target1.encodeIntAsCharEscape(1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "___tsethi!" + "'", str8, "___tsethi!");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"" + "'", str14, "\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python3" + "'", str15, "Python3");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\1" + "'", str17, "\\1");
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("_\"hi!\"", false);
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        boolean boolean10 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "_tsethi", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_\\\"hi!\\\"" + "'", str8, "_\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"tseth\"" + "'", str14, "\"tseth\"");
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getImplicitSetLabel("\"\\\"\\\\\\\"_Python3\\\\\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\"\\\"\\\\\\\"_Python3\\\\\\\"\\\"\"" + "'", str7, "_tset\"\\\"\\\\\\\"_Python3\\\\\\\"\\\"\"");
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("__tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        java.lang.String str11 = python3Target1.getListLabel("Python3");
        java.lang.String str13 = python3Target1.encodeIntAsCharEscape(29);
        boolean boolean14 = python3Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target1.getTemplates();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "___tsethi!" + "'", str8, "___tsethi!");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python3" + "'", str11, "Python3");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\35" + "'", str13, "\\35");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(sTGroup15);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
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
        org.antlr.v4.tool.Grammar grammar15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.getTokenTypeAsTargetLabel(grammar15, (int) '#');
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
        org.junit.Assert.assertNull(codeGenerator14);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("__tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        java.lang.String str11 = python3Target1.getListLabel("Python3");
        java.lang.String str13 = python3Target1.encodeIntAsCharEscape(29);
        boolean boolean14 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getLoopLabel(grammarAST15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        java.lang.String str3 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target1.getRuleFunctionContextStructName(ruleFunction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
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
        java.lang.String str16 = python3Target1.getAltLabelContextStructName("_hi!Context");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python3Target1.getElementName("\\\"hi!\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python3" + "'", str14, "Python3");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_hi!ContextContext" + "'", str16, "_hi!ContextContext");
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
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
        int int14 = python3Target1.getInlineTestSetWordSize();
        int int15 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str17 = python3Target1.getImplicitSetLabel("\\n");
        java.lang.String str19 = python3Target1.getAltLabelContextStructName("_tset_Python3Context");
        org.antlr.v4.tool.Grammar grammar20 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target22 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator21);
        boolean boolean23 = python3Target22.wantsBaseListener();
        java.lang.String str25 = python3Target22.getAltLabelContextStructName("_Python3");
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        java.lang.String str29 = python3Target22.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator26, "__tsethi!", false);
        java.lang.String str31 = python3Target22.encodeIntAsCharEscape((int) (short) 100);
        boolean boolean32 = python3Target22.supportsOverloadedMethods();
        int int33 = python3Target22.getInlineTestSetWordSize();
        int int34 = python3Target22.getSerializedATNSegmentLimit();
        int int35 = python3Target22.getInlineTestSetWordSize();
        int int36 = python3Target22.getSerializedATNSegmentLimit();
        java.lang.String str38 = python3Target22.getImplicitSetLabel("\\n");
        java.lang.String str40 = python3Target22.getAltLabelContextStructName("_tset_Python3Context");
        org.antlr.v4.tool.Grammar grammar41 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target43 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator42);
        java.lang.String str45 = python3Target43.encodeIntAsCharEscape(1);
        java.lang.String str46 = python3Target43.getVersion();
        java.lang.String str48 = python3Target43.getImplicitRuleLabel("_tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator49 = null;
        java.lang.String str52 = python3Target43.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator49, "_Python3", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator53 = python3Target43.getCodeGenerator();
        boolean boolean54 = python3Target43.supportsOverloadedMethods();
        java.lang.String str56 = python3Target43.encodeIntAsCharEscape(64);
        org.antlr.v4.tool.Grammar grammar57 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator58 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target59 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator58);
        java.lang.String str61 = python3Target59.encodeIntAsCharEscape(1);
        java.lang.String str62 = python3Target59.getVersion();
        java.lang.String str64 = python3Target59.getImplicitRuleLabel("_tsethi!");
        java.lang.String str66 = python3Target59.getImplicitRuleLabel("__tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator67 = python3Target59.getCodeGenerator();
        boolean boolean68 = python3Target59.supportsOverloadedMethods();
        java.lang.String str71 = python3Target59.getTargetStringLiteralFromString("\"_Python3\"", true);
        java.util.Set<java.lang.String> strSet72 = python3Target59.getBadWords();
        org.antlr.v4.tool.Grammar grammar73 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator74 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target75 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator74);
        boolean boolean76 = python3Target75.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator77 = python3Target75.getCodeGenerator();
        java.lang.String str80 = python3Target75.getTargetStringLiteralFromString("\\n", false);
        org.antlr.v4.tool.Grammar grammar81 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator82 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target83 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator82);
        boolean boolean84 = python3Target83.wantsBaseListener();
        java.util.Set<java.lang.String> strSet85 = python3Target83.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup86 = python3Target83.getTemplates();
        java.lang.String str88 = python3Target83.getImplicitRuleLabel("\"\\\\1\"");
        org.antlr.v4.tool.Grammar grammar89 = null;
        int[] intArray90 = new int[] {};
        java.lang.String[] strArray91 = python3Target83.getTokenTypesAsTargetLabels(grammar89, intArray90);
        java.lang.String[] strArray92 = python3Target75.getTokenTypesAsTargetLabels(grammar81, intArray90);
        java.lang.String[] strArray93 = python3Target59.getTokenTypesAsTargetLabels(grammar73, intArray90);
        java.lang.String[] strArray94 = python3Target43.getTokenTypesAsTargetLabels(grammar57, intArray90);
        java.lang.String[] strArray95 = python3Target22.getTokenTypesAsTargetLabels(grammar41, intArray90);
        java.lang.String[] strArray96 = python3Target1.getTokenTypesAsTargetLabels(grammar20, intArray90);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29 + "'", int13 == 29);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_tset\\n" + "'", str17, "_tset\\n");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_tset_Python3ContextContext" + "'", str19, "_tset_Python3ContextContext");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "_Python3Context" + "'", str25, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "_tsethi" + "'", str29, "_tsethi");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "d" + "'", str31, "d");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 64 + "'", int33 == 64);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 29 + "'", int34 == 29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 64 + "'", int35 == 64);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 29 + "'", int36 == 29);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "_tset\\n" + "'", str38, "_tset\\n");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "_tset_Python3ContextContext" + "'", str40, "_tset_Python3ContextContext");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\\1" + "'", str45, "\\1");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "4.5.2.1" + "'", str46, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "__tsethi!" + "'", str48, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Python" + "'", str52, "Python");
        org.junit.Assert.assertNull(codeGenerator53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "@" + "'", str56, "@");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "\\1" + "'", str61, "\\1");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "4.5.2.1" + "'", str62, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "__tsethi!" + "'", str64, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "___tsethi!" + "'", str66, "___tsethi!");
        org.junit.Assert.assertNull(codeGenerator67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "\"\\\"_Python3\\\"\"" + "'", str71, "\"\\\"_Python3\\\"\"");
        org.junit.Assert.assertNotNull(strSet72);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(codeGenerator77);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "\\\\n" + "'", str80, "\\\\n");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(strSet85);
        org.junit.Assert.assertNotNull(sTGroup86);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "_\"\\\\1\"" + "'", str88, "_\"\\\\1\"");
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[]");
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertNotNull(strArray94);
        org.junit.Assert.assertNotNull(strArray95);
        org.junit.Assert.assertNotNull(strArray96);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getAltLabelContextStructName("_Python3");
        java.lang.String str6 = python3Target1.getListLabel("\"\\\\1\"");
        boolean boolean7 = python3Target1.templatesExist();
        java.lang.String str9 = python3Target1.getListLabel("\"\\\"\\\\\"");
        int int10 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar11 = null;
        int[] intArray18 = new int[] { (byte) 1, 0, '4', (short) -1, 10, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray19 = python3Target1.getTokenTypesAsTargetLabels(grammar11, intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\\1\"" + "'", str6, "\"\\\\1\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"\\\\\"" + "'", str9, "\"\\\"\\\\\"");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 0, 52, -1, 10, 0]");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "Python3", true);
        int int10 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromString("4.5.2.1");
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"ython\"" + "'", str9, "\"ython\"");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"4.5.2.1\"" + "'", str12, "\"4.5.2.1\"");
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        java.lang.String str7 = python3Target1.getImplicitSetLabel("a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tseta" + "'", str7, "_tseta");
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "_Python3Context", true);
        java.lang.String str7 = python3Target1.encodeIntAsCharEscape((int) (short) 10);
        int int8 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar9 = null;
        int[] intArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray11 = python3Target1.getTokenTypesAsTargetLabels(grammar9, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python3Contex\"" + "'", str5, "\"Python3Contex\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\n" + "'", str7, "\\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getAltLabelContextStructName("_Python3");
        java.lang.String str6 = python3Target1.getImplicitSetLabel("i");
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("_tset_tsethi!");
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("___\"___tsethi!\"", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tseti" + "'", str6, "_tseti");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset_tsethi!Context" + "'", str8, "_tset_tsethi!Context");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "___\\\"___tsethi!\\\"" + "'", str11, "___\\\"___tsethi!\\\"");
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
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
        org.antlr.v4.tool.Rule rule23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = python3Target1.getRuleFunctionContextStructName(rule23);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\"\"" + "'", str19, "\"\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\\n" + "'", str21, "\\n");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        boolean boolean8 = python3Target1.templatesExist();
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("hi!");
        java.lang.String str12 = python3Target1.getImplicitRuleLabel("\"hi!\"");
        java.lang.String str14 = python3Target1.getListLabel("\"\\\"\\\"\"");
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.getImplicitTokenLabel("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"hi!\"" + "'", str10, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_\"hi!\"" + "'", str12, "_\"hi!\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"\\\"\"" + "'", str14, "\"\\\"\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup15);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        int int5 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "hi!", false);
        java.lang.String str12 = python3Target1.getListLabel("\"Python3Contex\"");
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("\\64", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.getElementName("__Python3ContextContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "i" + "'", str10, "i");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"Python3Contex\"" + "'", str12, "\"Python3Contex\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\\\64" + "'", str15, "\\\\64");
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("_tsethi", false);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("\\\"hi!\\\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getElementName("\"_ \"");
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
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\"Python3Contex\"");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("_\"___tsethi!\"");
        java.lang.String str9 = python3Target1.getVersion();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getRuleFunctionContextStructName(ruleFunction10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\"Python3Contex\\\"\"" + "'", str6, "\"\\\"Python3Contex\\\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "__\"___tsethi!\"" + "'", str8, "__\"___tsethi!\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("__tsethi!");
        java.lang.String str9 = python3Target1.getVersion();
        boolean boolean10 = python3Target1.wantsBaseVisitor();
        java.lang.String str12 = python3Target1.getImplicitRuleLabel("\"\\\"Python3Context\\\"\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "___tsethi!" + "'", str8, "___tsethi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_\"\\\"Python3Context\\\"\"" + "'", str12, "_\"\\\"Python3Context\\\"\"");
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
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
        java.lang.String str19 = python3Target1.getImplicitSetLabel("\"\\\\\\\"_tsethi\\\\\\\"\"");
        java.lang.String str21 = python3Target1.getImplicitRuleLabel("\"_\\\\\\\"\\\\\\\"Python3Contex\\\\\\\"\"");
        org.antlr.v4.tool.Rule rule22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = python3Target1.getRuleFunctionContextStructName(rule22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset" + "'", str11, "_tset");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_\\\"hi!\\\"" + "'", str13, "_\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str17, "\"\\\"\\\\\\\\1\\\"\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_tset\"\\\\\\\"_tsethi\\\\\\\"\"" + "'", str19, "_tset\"\\\\\\\"_tsethi\\\\\\\"\"");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "_\"_\\\\\\\"\\\\\\\"Python3Contex\\\\\\\"\"" + "'", str21, "_\"_\\\\\\\"\\\\\\\"Python3Contex\\\\\\\"\"");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "Python3", true);
        java.lang.String str10 = python3Target1.getLanguage();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"ython\"" + "'", str9, "\"ython\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python3" + "'", str10, "Python3");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getTargetStringLiteralFromString("\"_Python3\"");
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("ython");
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\\\"_Python3\\\"\"" + "'", str4, "\"\\\"_Python3\\\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "YthonContext" + "'", str6, "YthonContext");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        boolean boolean5 = python3Target1.templatesExist();
        java.lang.String str7 = python3Target1.getImplicitSetLabel("__hi!");
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset__hi!" + "'", str7, "_tset__hi!");
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "_Python3Context", true);
        java.lang.String str7 = python3Target1.getListLabel("Python");
        boolean boolean8 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet9 = python3Target1.getBadWords();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python3Contex\"" + "'", str5, "\"Python3Contex\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python" + "'", str7, "Python");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        int int6 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python3Target1.getListLabel("_i");
        java.lang.String str10 = python3Target1.getImplicitRuleLabel("\\0");
        org.antlr.v4.tool.Rule rule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getRuleFunctionContextStructName(rule11);
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
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getTargetStringLiteralFromString("\"_Python3\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "\"\\\"4.5.2.1\\\"\"", false);
        org.antlr.v4.tool.Rule rule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getRuleFunctionContextStructName(rule9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\\\"_Python3\\\"\"" + "'", str4, "\"\\\"_Python3\\\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\\"4.5.2.1\\\"" + "'", str8, "\\\"4.5.2.1\\\"");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
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
        java.lang.String str16 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python3Target1.getCodeGenerator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python3" + "'", str14, "Python3");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "4.5.2.1" + "'", str16, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator17);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("__tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet11 = python3Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getLoopLabel(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "___tsethi!" + "'", str8, "___tsethi!");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "_Python3Context", true);
        java.lang.String str7 = python3Target1.encodeIntAsCharEscape((int) (short) 10);
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        boolean boolean9 = python3Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getLoopCounter(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python3Contex\"" + "'", str5, "\"Python3Contex\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\n" + "'", str7, "\\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        int int5 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "hi!", false);
        int int11 = python3Target1.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target1.getTemplates();
        java.lang.String str14 = python3Target1.getListLabel("\\\"ContextContex");
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "i" + "'", str10, "i");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29 + "'", int11 == 29);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\\"ContextContex" + "'", str14, "\\\"ContextContex");
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\\"\\\"Python3Contex\\\"" + "'", str11, "\\\"\\\"Python3Contex\\\"");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_\"_tsethi!\"" + "'", str15, "_\"_tsethi!\"");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("__tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("\"_Python3\"", true);
        java.util.Set<java.lang.String> strSet14 = python3Target1.getBadWords();
        java.lang.Class<?> wildcardClass15 = python3Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "___tsethi!" + "'", str8, "___tsethi!");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"_Python3\\\"\"" + "'", str13, "\"\\\"_Python3\\\"\"");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\"Python3Contex\"");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("_\"___tsethi!\"");
        java.lang.String str9 = python3Target1.getVersion();
        boolean boolean10 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getLoopCounter(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\"Python3Contex\\\"\"" + "'", str6, "\"\\\"Python3Contex\\\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "__\"___tsethi!\"" + "'", str8, "__\"___tsethi!\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
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
        java.lang.String str22 = python3Target1.encodeIntAsCharEscape((int) '#');
        java.lang.String str24 = python3Target1.getImplicitRuleLabel("");
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#" + "'", str22, "#");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "_" + "'", str24, "_");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.getLoopLabel(grammarAST16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_Python3" + "'", str9, "_Python3");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsetPythonContext" + "'", str12, "_tsetPythonContext");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python3" + "'", str13, "Python3");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
        org.junit.Assert.assertNull(codeGenerator15);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("__tsethi!");
        java.lang.String str9 = python3Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getTokenTypeAsTargetLabel(grammar10, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "___tsethi!" + "'", str8, "___tsethi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        java.lang.String str3 = python3Target1.getVersion();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.Class<?> wildcardClass5 = python3Target1.getClass();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
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
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target17 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator16);
        java.lang.String str19 = python3Target17.encodeIntAsCharEscape(1);
        java.lang.String str20 = python3Target17.getVersion();
        java.lang.String str22 = python3Target17.getImplicitRuleLabel("_tsethi!");
        java.lang.String str24 = python3Target17.getImplicitRuleLabel("__tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = python3Target17.getCodeGenerator();
        boolean boolean26 = python3Target17.supportsOverloadedMethods();
        java.lang.String str29 = python3Target17.getTargetStringLiteralFromString("\"_Python3\"", true);
        java.util.Set<java.lang.String> strSet30 = python3Target17.getBadWords();
        org.antlr.v4.tool.Grammar grammar31 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target33 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator32);
        boolean boolean34 = python3Target33.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = python3Target33.getCodeGenerator();
        java.lang.String str38 = python3Target33.getTargetStringLiteralFromString("\\n", false);
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
        java.lang.String[] strArray50 = python3Target33.getTokenTypesAsTargetLabels(grammar39, intArray48);
        java.lang.String[] strArray51 = python3Target17.getTokenTypesAsTargetLabels(grammar31, intArray48);
        java.lang.String[] strArray52 = python3Target1.getTokenTypesAsTargetLabels(grammar15, intArray48);
        boolean boolean53 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction54 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str55 = python3Target1.getRuleFunctionContextStructName(ruleFunction54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "@" + "'", str14, "@");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\\1" + "'", str19, "\\1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4.5.2.1" + "'", str20, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "__tsethi!" + "'", str22, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "___tsethi!" + "'", str24, "___tsethi!");
        org.junit.Assert.assertNull(codeGenerator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\\\"_Python3\\\"\"" + "'", str29, "\"\\\"_Python3\\\"\"");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(codeGenerator35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\\\\n" + "'", str38, "\\\\n");
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
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "_Python3Context", true);
        java.lang.String str7 = python3Target1.getListLabel("Python");
        java.lang.String str9 = python3Target1.encodeIntAsCharEscape((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getElementName("_\\\"\\\\1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python3Contex\"" + "'", str5, "\"Python3Contex\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python" + "'", str7, "Python");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\0" + "'", str9, "\\0");
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_Python3", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target1.getCodeGenerator();
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\"\"", true);
        boolean boolean15 = python3Target1.templatesExist();
        java.lang.String str18 = python3Target1.getTargetStringLiteralFromString("_tset__Python3", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"\\\"\"" + "'", str14, "\"\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset__Python3" + "'", str18, "_tset__Python3");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("__tsethi!");
        java.lang.String str9 = python3Target1.getVersion();
        int int10 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str12 = python3Target1.getAltLabelContextStructName("tsetPythonContex");
        boolean boolean13 = python3Target1.templatesExist();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "___tsethi!" + "'", str8, "___tsethi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "TsetPythonContexContext" + "'", str12, "TsetPythonContexContext");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("__tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet11 = python3Target1.getBadWords();
        java.lang.Class<?> wildcardClass12 = strSet11.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "___tsethi!" + "'", str8, "___tsethi!");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
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
        int int16 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset" + "'", str11, "_tset");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\"Context" + "'", str13, "\"\"Context");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 29 + "'", int16 == 29);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target7 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator6);
        java.lang.String str9 = python3Target7.encodeIntAsCharEscape(1);
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target7.getTemplates();
        boolean boolean11 = python3Target7.supportsOverloadedMethods();
        boolean boolean12 = python3Target7.templatesExist();
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target15 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator14);
        java.lang.String str17 = python3Target15.encodeIntAsCharEscape(1);
        java.lang.String str18 = python3Target15.getVersion();
        java.lang.String str20 = python3Target15.getImplicitRuleLabel("_tsethi!");
        java.lang.String str22 = python3Target15.getImplicitRuleLabel("__tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = python3Target15.getCodeGenerator();
        boolean boolean24 = python3Target15.supportsOverloadedMethods();
        java.lang.String str27 = python3Target15.getTargetStringLiteralFromString("\"_Python3\"", true);
        java.util.Set<java.lang.String> strSet28 = python3Target15.getBadWords();
        org.antlr.v4.tool.Grammar grammar29 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator30 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target31 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator30);
        boolean boolean32 = python3Target31.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = python3Target31.getCodeGenerator();
        java.lang.String str36 = python3Target31.getTargetStringLiteralFromString("\\n", false);
        org.antlr.v4.tool.Grammar grammar37 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator38 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target39 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator38);
        boolean boolean40 = python3Target39.wantsBaseListener();
        java.util.Set<java.lang.String> strSet41 = python3Target39.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup42 = python3Target39.getTemplates();
        java.lang.String str44 = python3Target39.getImplicitRuleLabel("\"\\\\1\"");
        org.antlr.v4.tool.Grammar grammar45 = null;
        int[] intArray46 = new int[] {};
        java.lang.String[] strArray47 = python3Target39.getTokenTypesAsTargetLabels(grammar45, intArray46);
        java.lang.String[] strArray48 = python3Target31.getTokenTypesAsTargetLabels(grammar37, intArray46);
        java.lang.String[] strArray49 = python3Target15.getTokenTypesAsTargetLabels(grammar29, intArray46);
        java.lang.String[] strArray50 = python3Target7.getTokenTypesAsTargetLabels(grammar13, intArray46);
        java.lang.String[] strArray51 = python3Target1.getTokenTypesAsTargetLabels(grammar5, intArray46);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str53 = python3Target1.getElementName("__tset_Python3ContextContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\1" + "'", str9, "\\1");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\1" + "'", str17, "\\1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "__tsethi!" + "'", str20, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "___tsethi!" + "'", str22, "___tsethi!");
        org.junit.Assert.assertNull(codeGenerator23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"\\\"_Python3\\\"\"" + "'", str27, "\"\\\"_Python3\\\"\"");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(codeGenerator33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\\\\n" + "'", str36, "\\\\n");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNotNull(sTGroup42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "_\"\\\\1\"" + "'", str44, "_\"\\\\1\"");
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[]");
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray51);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean5 = python3Target1.templatesExist();
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getImplicitTokenLabel("\"\\\"\\\"\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("__tsethi!");
        java.lang.String str9 = python3Target1.getVersion();
        boolean boolean10 = python3Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.encodeIntAsCharEscape((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "___tsethi!" + "'", str8, "___tsethi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getTargetStringLiteralFromString("\"_Python3\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        boolean boolean6 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\\\"_Python3\\\"\"" + "'", str4, "\"\\\"_Python3\\\"\"");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "_Python3Context", true);
        java.lang.String str7 = python3Target1.getListLabel("Python");
        java.lang.String str9 = python3Target1.encodeIntAsCharEscape((int) (byte) 0);
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getLoopLabel(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python3Contex\"" + "'", str5, "\"Python3Contex\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python" + "'", str7, "Python");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\0" + "'", str9, "\\0");
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        boolean boolean8 = python3Target1.templatesExist();
        java.lang.String str9 = python3Target1.getLanguage();
        boolean boolean10 = python3Target1.wantsBaseVisitor();
        int int11 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getLoopCounter(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python3" + "'", str9, "Python3");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29 + "'", int11 == 29);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
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
        java.lang.String str19 = python3Target1.getLanguage();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Python3" + "'", str19, "Python3");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape((int) (short) 1);
        boolean boolean6 = python3Target1.wantsBaseVisitor();
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("\\\"_tset\\\\\\\"_tsethi\\\\\\\"\\\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\1" + "'", str5, "\\1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_\\\"_tset\\\\\\\"_tsethi\\\\\\\"\\\"" + "'", str8, "_\\\"_tset\\\\\\\"_tsethi\\\\\\\"\\\"");
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "_Python3Context", true);
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getAltLabelContextStructName("tset");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python3Contex\"" + "'", str5, "\"Python3Contex\"");
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "TsetContext" + "'", str9, "TsetContext");
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        java.lang.String str6 = python3Target1.getListLabel("_Python3Context");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "a", true);
        java.lang.String str11 = python3Target1.getVersion();
        boolean boolean12 = python3Target1.wantsBaseListener();
        int int13 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_Python3Context" + "'", str6, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\\\\1", false);
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        java.lang.String str8 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\\\\\\\1" + "'", str6, "\\\\\\\\1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python3" + "'", str9, "Python3");
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        java.lang.String str4 = python3Target1.getVersion();
        int int5 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_\\\"hi!\\\"");
        int int8 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_\\\\\\\"hi!\\\\\\\"\"" + "'", str7, "\"_\\\\\\\"hi!\\\\\\\"\"");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.util.Set<java.lang.String> strSet4 = python3Target1.getBadWords();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        int int6 = python3Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getImplicitTokenLabel("tset_Python");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "_Python3Context", true);
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getLoopCounter(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python3Contex\"" + "'", str5, "\"Python3Contex\"");
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        boolean boolean7 = python3Target1.templatesExist();
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("\\1", true);
        java.lang.String str12 = python3Target1.getImplicitSetLabel("\\\\n");
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getRuleFunctionContextStructName(ruleFunction14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10, "\"\\\\1\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset\\\\n" + "'", str12, "_tset\\\\n");
        org.junit.Assert.assertNull(codeGenerator13);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        boolean boolean8 = python3Target1.templatesExist();
        boolean boolean9 = python3Target1.wantsBaseListener();
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromString("_\\\"_Python3\\\"", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_\\\\\\\"_Python3\\\\\\\"" + "'", str12, "_\\\\\\\"_Python3\\\\\\\"");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getAltLabelContextStructName("_Python3");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "__tsethi!", false);
        java.lang.String str10 = python3Target1.encodeIntAsCharEscape((int) (short) 100);
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        int int12 = python3Target1.getInlineTestSetWordSize();
        boolean boolean13 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("Python3", true);
        java.lang.String str12 = python3Target1.getImplicitSetLabel("hi!");
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\"Python3Contex\"");
        boolean boolean15 = python3Target1.supportsOverloadedMethods();
        int int16 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str18 = python3Target1.getAltLabelContextStructName("_tset\\\"___tsethi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Python3\"" + "'", str10, "\"Python3\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsethi!" + "'", str12, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"Python3Contex\\\"\"" + "'", str14, "\"\\\"Python3Contex\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 29 + "'", int16 == 29);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset\\\"___tsethi!Context" + "'", str18, "_tset\\\"___tsethi!Context");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
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
        int int19 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"Python3Contex\"" + "'", str7, "\"Python3Contex\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_Python3Context" + "'", str12, "_tset_Python3Context");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str14, "\"\\\"\\\\\\\\1\\\"\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\\\"hi!\\\"" + "'", str18, "\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 29 + "'", int19 == 29);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("__tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        boolean boolean10 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "_ ", true);
        java.lang.String str15 = python3Target1.getLanguage();
        org.antlr.v4.tool.Rule rule16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.getRuleFunctionContextStructName(rule16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "___tsethi!" + "'", str8, "___tsethi!");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"" + "'", str14, "\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python3" + "'", str15, "Python3");
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        int int5 = python3Target1.getInlineTestSetWordSize();
        boolean boolean6 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_\"\\\"\\\\\\\\1\\\"\"", true);
        java.lang.Class<?> wildcardClass11 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"\\\"\\\\\\\\1\\\"\"" + "'", str10, "\"\\\"\\\"\\\\\\\\1\\\"\"");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("Python3");
        java.lang.String str11 = python3Target1.getListLabel("");
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target1.getTemplates();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getRuleFunctionContextStructName(ruleFunction13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_Python3" + "'", str9, "_Python3");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(sTGroup12);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
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
        java.lang.String str19 = python3Target1.getTargetStringLiteralFromString("_tset__\"\\\\1\"", false);
        java.lang.String str20 = python3Target1.getLanguage();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "___tsethi!" + "'", str8, "___tsethi!");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"_Python3\\\"\"" + "'", str13, "\"\\\"_Python3\\\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_" + "'", str15, "_");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_tset__\\\"\\\\\\\\1\\\"" + "'", str19, "_tset__\\\"\\\\\\\\1\\\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Python3" + "'", str20, "Python3");
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        java.lang.String str6 = python3Target1.getListLabel("_Python3Context");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "a", true);
        java.lang.String str11 = python3Target1.getVersion();
        java.lang.String str13 = python3Target1.getListLabel("_4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_Python3Context" + "'", str6, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_4.5.2.1" + "'", str13, "_4.5.2.1");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        boolean boolean7 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "4.5.2.1", false);
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target1.getTemplates();
        boolean boolean13 = python3Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup14 = python3Target1.getTemplates();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".5.2." + "'", str11, ".5.2.");
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(sTGroup14);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "_Python3Context", true);
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getVersion();
        boolean boolean8 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Rule rule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getRuleFunctionContextStructName(rule9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python3Contex\"" + "'", str5, "\"Python3Contex\"");
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str6 = python3Target1.getListLabel("\"_\\\"\\\\\\\"Python3Contex\\\\\\\"\\\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset\\\\n", false);
        java.lang.String str12 = python3Target1.getImplicitRuleLabel("_tset_Python3Context");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_\\\"\\\\\\\"Python3Contex\\\\\\\"\\\"\"" + "'", str6, "\"_\\\"\\\\\\\"Python3Contex\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "tset\\\\" + "'", str10, "tset\\\\");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "__tset_Python3Context" + "'", str12, "__tset_Python3Context");
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str9 = python3Target1.encodeIntAsCharEscape((int) (byte) 10);
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("_Python3");
        java.lang.String str13 = python3Target1.getAltLabelContextStructName("Python3");
        java.util.Set<java.lang.String> strSet14 = python3Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.getTokenTypeAsTargetLabel(grammar15, (int) (short) 10);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python3Context" + "'", str13, "Python3Context");
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getImplicitRuleLabel("\"_Python3\"");
        java.lang.String str8 = python3Target1.getLanguage();
        org.antlr.v4.tool.Grammar grammar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getTokenTypeAsTargetLabel(grammar9, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_\"_Python3\"" + "'", str7, "_\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python3" + "'", str8, "Python3");
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("_tsethi", false);
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "i", true);
        java.lang.String str19 = python3Target1.getImplicitRuleLabel("_tset\"\\\"\\\\\\\\1\\\"\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python3Target1.getElementName("_");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "__tset\"\\\"\\\\\\\\1\\\"\"" + "'", str19, "__tset\"\\\"\\\\\\\\1\\\"\"");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator9);
        java.lang.String str12 = python3Target10.encodeIntAsCharEscape(1);
        java.lang.String str13 = python3Target10.getVersion();
        java.lang.String str15 = python3Target10.getImplicitRuleLabel("_tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        java.lang.String str19 = python3Target10.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator16, "_Python3", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python3Target10.getCodeGenerator();
        boolean boolean21 = python3Target10.supportsOverloadedMethods();
        java.lang.String str23 = python3Target10.encodeIntAsCharEscape(64);
        org.antlr.v4.tool.Grammar grammar24 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target26 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator25);
        java.lang.String str28 = python3Target26.encodeIntAsCharEscape(1);
        java.lang.String str29 = python3Target26.getVersion();
        java.lang.String str31 = python3Target26.getImplicitRuleLabel("_tsethi!");
        java.lang.String str33 = python3Target26.getImplicitRuleLabel("__tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = python3Target26.getCodeGenerator();
        boolean boolean35 = python3Target26.supportsOverloadedMethods();
        java.lang.String str38 = python3Target26.getTargetStringLiteralFromString("\"_Python3\"", true);
        java.util.Set<java.lang.String> strSet39 = python3Target26.getBadWords();
        org.antlr.v4.tool.Grammar grammar40 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator41 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target42 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator41);
        boolean boolean43 = python3Target42.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator44 = python3Target42.getCodeGenerator();
        java.lang.String str47 = python3Target42.getTargetStringLiteralFromString("\\n", false);
        org.antlr.v4.tool.Grammar grammar48 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator49 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target50 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator49);
        boolean boolean51 = python3Target50.wantsBaseListener();
        java.util.Set<java.lang.String> strSet52 = python3Target50.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup53 = python3Target50.getTemplates();
        java.lang.String str55 = python3Target50.getImplicitRuleLabel("\"\\\\1\"");
        org.antlr.v4.tool.Grammar grammar56 = null;
        int[] intArray57 = new int[] {};
        java.lang.String[] strArray58 = python3Target50.getTokenTypesAsTargetLabels(grammar56, intArray57);
        java.lang.String[] strArray59 = python3Target42.getTokenTypesAsTargetLabels(grammar48, intArray57);
        java.lang.String[] strArray60 = python3Target26.getTokenTypesAsTargetLabels(grammar40, intArray57);
        java.lang.String[] strArray61 = python3Target10.getTokenTypesAsTargetLabels(grammar24, intArray57);
        java.lang.String[] strArray62 = python3Target1.getTokenTypesAsTargetLabels(grammar8, intArray57);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str64 = python3Target1.getElementListName("\\64");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\1" + "'", str12, "\\1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "__tsethi!" + "'", str15, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Python" + "'", str19, "Python");
        org.junit.Assert.assertNull(codeGenerator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "@" + "'", str23, "@");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\\1" + "'", str28, "\\1");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "4.5.2.1" + "'", str29, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "__tsethi!" + "'", str31, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "___tsethi!" + "'", str33, "___tsethi!");
        org.junit.Assert.assertNull(codeGenerator34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\"\\\"_Python3\\\"\"" + "'", str38, "\"\\\"_Python3\\\"\"");
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(codeGenerator44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\\\\n" + "'", str47, "\\\\n");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertNotNull(sTGroup53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "_\"\\\\1\"" + "'", str55, "_\"\\\\1\"");
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[]");
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(strArray62);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
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
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromString("\"hi!\"ContextContext", false);
        java.lang.String str17 = python3Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python3Target1.getTokenTypeAsTargetLabel(grammar18, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\\\"hi!\\\"ContextContext" + "'", str16, "\\\"hi!\\\"ContextContext");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "_Python3Context", true);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("____tsethi!", false);
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("\\\"_tset\\\\\\\"_tsethi\\\\\\\"\\\"", true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python3Contex\"" + "'", str5, "\"Python3Contex\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "____tsethi!" + "'", str8, "____tsethi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\\\\\"_tset\\\\\\\\\\\\\\\"_tsethi\\\\\\\\\\\\\\\"\\\\\\\"\"" + "'", str11, "\"\\\\\\\"_tset\\\\\\\\\\\\\\\"_tsethi\\\\\\\\\\\\\\\"\\\\\\\"\"");
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet10 = python3Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_" + "'", str8, "_");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.util.Set<java.lang.String> strSet4 = python3Target1.getBadWords();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        int int6 = python3Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.encodeIntAsCharEscape((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getImplicitTokenLabel("_\\\\\\\"_Python3\\\\\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\n" + "'", str5, "\\n");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\\\n" + "'", str9, "\\\\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d" + "'", str11, "d");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
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
        int int29 = python3Target1.getInlineTestSetWordSize();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 64 + "'", int29 == 64);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        boolean boolean4 = python3Target1.wantsBaseListener();
        java.lang.String str5 = python3Target1.getVersion();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("__tsethi!");
        java.lang.String str9 = python3Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getTokenTypeAsTargetLabel(grammar10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "___tsethi!" + "'", str8, "___tsethi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getAltLabelContextStructName("_Python3");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "__tsethi!", false);
        java.lang.String str9 = python3Target1.getVersion();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getRuleFunctionContextStructName(ruleFunction10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        boolean boolean4 = python3Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target1.getElementListName("\"\\\"__\\\\\\\"___tsethi!\\\\\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\"_\\\"_Python3\\\"\"", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"_\\\"_Python3\\\"\"" + "'", str9, "\"_\\\"_Python3\\\"\"");
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitSetLabel("_tsethi!");
        java.lang.String str7 = python3Target1.getVersion();
        java.util.Set<java.lang.String> strSet8 = python3Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
        java.lang.String str10 = python3Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset_tsethi!" + "'", str6, "_tset_tsethi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python3" + "'", str10, "Python3");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str9 = python3Target1.encodeIntAsCharEscape((int) (byte) 10);
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("_Python3");
        java.lang.String str13 = python3Target1.getAltLabelContextStructName("Python3");
        java.lang.String str15 = python3Target1.getAltLabelContextStructName("__\\\"___tsethi!\\\"Context");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\n" + "'", str9, "\\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"_Python3\"" + "'", str11, "\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python3Context" + "'", str13, "Python3Context");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "__\\\"___tsethi!\\\"ContextContext" + "'", str15, "__\\\"___tsethi!\\\"ContextContext");
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getAltLabelContextStructName("_Python3");
        java.lang.String str6 = python3Target1.getListLabel("\"\\\"Python3Contex\\\"\"");
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("\"_tset\\\"_tsethi\\\"\"", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.encodeIntAsCharEscape((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\"Python3Contex\\\"\"" + "'", str6, "\"\\\"Python3Contex\\\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\\"_tset\\\\\\\"_tsethi\\\\\\\"\\\"" + "'", str9, "\\\"_tset\\\\\\\"_tsethi\\\\\\\"\\\"");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
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
        boolean boolean14 = python3Target1.templatesExist();
        java.lang.String str15 = python3Target1.getVersion();
        boolean boolean16 = python3Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar17 = null;
        int[] intArray18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray19 = python3Target1.getTokenTypesAsTargetLabels(grammar17, intArray18);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4.5.2.1" + "'", str15, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
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
        org.antlr.v4.codegen.model.RuleFunction ruleFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getRuleFunctionContextStructName(ruleFunction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset_tset_Python3" + "'", str8, "_tset_tset_Python3");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python3" + "'", str10, "Python3");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        boolean boolean7 = python3Target1.templatesExist();
        boolean boolean8 = python3Target1.wantsBaseVisitor();
        boolean boolean9 = python3Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getLoopLabel(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(codeGenerator10);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        boolean boolean7 = python3Target1.templatesExist();
        java.lang.String str9 = python3Target1.getAltLabelContextStructName("\"\"Context");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getImplicitTokenLabel("_tset_Python3ContextContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"ContextContext" + "'", str9, "\"\"ContextContext");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str9 = python3Target1.encodeIntAsCharEscape((int) (byte) 10);
        int int10 = python3Target1.getInlineTestSetWordSize();
        java.lang.Class<?> wildcardClass11 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\n" + "'", str9, "\\n");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\\\\1", false);
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        java.lang.String str8 = python3Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getImplicitTokenLabel("_\"__tset_Python3ContextContext\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\\\\\\\1" + "'", str6, "\\\\\\\\1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("__tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        java.lang.String str11 = python3Target1.getListLabel("Python3");
        java.lang.String str13 = python3Target1.encodeIntAsCharEscape(29);
        java.lang.String str14 = python3Target1.getLanguage();
        boolean boolean15 = python3Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet16 = python3Target1.getBadWords();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "___tsethi!" + "'", str8, "___tsethi!");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python3" + "'", str11, "Python3");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\35" + "'", str13, "\\35");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python3" + "'", str14, "Python3");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        int int5 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet7 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "_\"\\\"Python3Contex\\\"\"", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getLoopCounter(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"\\\"Python3Contex\\\"\"" + "'", str11, "\"\\\"\\\"Python3Contex\\\"\"");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getTargetStringLiteralFromString("\"_Python3\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getListLabel("\\\"\\\"Python3Contex\\\"");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\\\"_Python3\\\"\"" + "'", str4, "\"\\\"_Python3\\\"\"");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\\"\\\"Python3Contex\\\"" + "'", str7, "\\\"\\\"Python3Contex\\\"");
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
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
        int int19 = python3Target1.getInlineTestSetWordSize();
        java.lang.Class<?> wildcardClass20 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_Python3" + "'", str9, "_Python3");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3" + "'", str13, "3");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_\"hi!\"" + "'", str15, "_\"hi!\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\\\"Python3Context\\\"\"" + "'", str18, "\"\\\"Python3Context\\\"\"");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 64 + "'", int19 == 64);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
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
        int int16 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python3Target1.getLoopLabel(grammarAST17);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 29 + "'", int16 == 29);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getAltLabelContextStructName("_Python3");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "__tsethi!", false);
        java.lang.String str9 = python3Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
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
        java.lang.String str14 = python3Target1.getImplicitSetLabel("_tset__Python3");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python3" + "'", str9, "Python3");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\n" + "'", str12, "\\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset_tset__Python3" + "'", str14, "_tset_tset__Python3");
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        int int5 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "hi!", false);
        int int11 = python3Target1.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getImplicitTokenLabel("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "i" + "'", str10, "i");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29 + "'", int11 == 29);
        org.junit.Assert.assertNotNull(sTGroup12);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("__tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet11 = python3Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar12 = null;
        int[] intArray14 = new int[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray15 = python3Target1.getTokenTypesAsTargetLabels(grammar12, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "___tsethi!" + "'", str8, "___tsethi!");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[97]");
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape((int) (short) 1);
        boolean boolean6 = python3Target1.wantsBaseVisitor();
        java.lang.String str8 = python3Target1.encodeIntAsCharEscape(29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getElementListName("d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\1" + "'", str5, "\\1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\35" + "'", str8, "\\35");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getImplicitTokenLabel("tsetPytho");
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
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"Python3Contex\"" + "'", str13, "\"Python3Contex\"");
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        java.lang.String str10 = python3Target1.getImplicitRuleLabel("\\1");
        boolean boolean11 = python3Target1.templatesExist();
        java.lang.String str13 = python3Target1.getImplicitRuleLabel("_\"\\\"_Python\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_\\1" + "'", str10, "_\\1");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "__\"\\\"_Python\\\"\"" + "'", str13, "__\"\\\"_Python\\\"\"");
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_Python3", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target1.getCodeGenerator();
        boolean boolean12 = python3Target1.supportsOverloadedMethods();
        java.lang.String str14 = python3Target1.getImplicitRuleLabel("_hi!");
        java.lang.String str15 = python3Target1.getLanguage();
        org.antlr.v4.tool.Rule rule16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.getRuleFunctionContextStructName(rule16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "__hi!" + "'", str14, "__hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python3" + "'", str15, "Python3");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target1.getTemplates();
        java.lang.String str10 = python3Target1.getImplicitRuleLabel("\\\"_tset\\\\\\\"_tsethi\\\\\\\"\\\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_\\\"_tset\\\\\\\"_tsethi\\\\\\\"\\\"" + "'", str10, "_\\\"_tset\\\\\\\"_tsethi\\\\\\\"\\\"");
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "_Python3Context", true);
        java.lang.String str9 = python3Target1.getListLabel("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target1.getCodeGenerator();
        java.lang.String str12 = python3Target1.getAltLabelContextStructName("_tset_Python3");
        boolean boolean13 = python3Target1.templatesExist();
        boolean boolean14 = python3Target1.supportsOverloadedMethods();
        boolean boolean15 = python3Target1.supportsOverloadedMethods();
        int int16 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"Python3Contex\"" + "'", str7, "\"Python3Contex\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_Python3Context" + "'", str12, "_tset_Python3Context");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("_\"hi!\"", false);
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getImplicitTokenLabel("_tset_tset__tset_Python3Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_\\\"hi!\\\"" + "'", str8, "_\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str9 = python3Target1.encodeIntAsCharEscape((int) (byte) 10);
        int int10 = python3Target1.getInlineTestSetWordSize();
        boolean boolean11 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "\"__\\\"___tsethi!\\\"Context\"Context", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\n" + "'", str9, "\\n");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"__\\\"___tsethi!\\\"Context\\\"Contex\"" + "'", str15, "\"__\\\"___tsethi!\\\"Context\\\"Contex\"");
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
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
        int int19 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str22 = python3Target1.getTargetStringLiteralFromString("", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_Python3" + "'", str9, "_Python3");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3" + "'", str13, "3");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_\"hi!\"" + "'", str15, "_\"hi!\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\\\"Python3Context\\\"\"" + "'", str18, "\"\\\"Python3Context\\\"\"");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 64 + "'", int19 == 64);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("Python3", true);
        java.lang.String str12 = python3Target1.getImplicitSetLabel("hi!");
        java.lang.Class<?> wildcardClass13 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Python3\"" + "'", str10, "\"Python3\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsethi!" + "'", str12, "_tsethi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getAltLabelContextStructName("_Python3");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "__tsethi!", false);
        java.lang.String str9 = python3Target1.getVersion();
        java.lang.String str10 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "#", true);
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"" + "'", str14, "\"\"");
        org.junit.Assert.assertNotNull(sTGroup15);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        java.lang.String str3 = python3Target1.getVersion();
        java.lang.String str5 = python3Target1.getAltLabelContextStructName("\"_tset\\\"_tsethi\\\"\"");
        java.lang.String str7 = python3Target1.getImplicitRuleLabel("\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\1Context\\\\\\\\\\\\\\\"\\\\\\\"\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"_tset\\\"_tsethi\\\"\"Context" + "'", str5, "\"_tset\\\"_tsethi\\\"\"Context");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\1Context\\\\\\\\\\\\\\\"\\\\\\\"\"" + "'", str7, "_\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\1Context\\\\\\\\\\\\\\\"\\\\\\\"\"");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
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
        org.antlr.v4.tool.Rule rule13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getRuleFunctionContextStructName(rule13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"hi!\"" + "'", str10, "\"hi!\"");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.encodeIntAsCharEscape((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getElementName("_tset\"___tsethi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#" + "'", str7, "#");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\\\\1", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_\"\\\"Python3Contex\\\"\"", false);
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getLoopLabel(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\\\\\\\1" + "'", str6, "\\\\\\\\1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\\"\\\"Python3Contex\\\"" + "'", str10, "\\\"\\\"Python3Contex\\\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("Python3");
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.getTemplates();
        java.lang.String str12 = python3Target1.getImplicitSetLabel("PythonContext");
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("_\"___tsethi!\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getImplicitTokenLabel("\"_tset\\\"_tsethi\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_Python3" + "'", str9, "_Python3");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsetPythonContext" + "'", str12, "_tsetPythonContext");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"_\\\"___tsethi!\\\"\"" + "'", str14, "\"_\\\"___tsethi!\\\"\"");
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python3Target1.getVersion();
        java.util.Set<java.lang.String> strSet9 = python3Target1.getBadWords();
        boolean boolean10 = python3Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.wantsBaseListener();
        int int6 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("__hi!", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "__hi!", false);
        java.util.Set<java.lang.String> strSet14 = python3Target1.getBadWords();
        org.antlr.v4.tool.Rule rule15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getRuleFunctionContextStructName(rule15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 29 + "'", int6 == 29);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"__hi!\"" + "'", str9, "\"__hi!\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_hi" + "'", str13, "_hi");
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
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
        int int16 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean17 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python3Target1.getTokenTypeAsTargetLabel(grammar18, 29);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 29 + "'", int16 == 29);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel(".5.2.");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("_\"\\\\1\"");
        boolean boolean9 = python3Target1.templatesExist();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_.5.2." + "'", str6, "_.5.2.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "__\"\\\\1\"" + "'", str8, "__\"\\\\1\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getImplicitTokenLabel("_\\\\\\\"_Python3\\\\\\\"");
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
        org.junit.Assert.assertNotNull(sTGroup11);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("\"\\\\1\"");
        org.antlr.v4.tool.Grammar grammar7 = null;
        int[] intArray8 = new int[] {};
        java.lang.String[] strArray9 = python3Target1.getTokenTypesAsTargetLabels(grammar7, intArray8);
        java.lang.String str11 = python3Target1.getListLabel("\"tseth\"Context");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_\"\\\\1\"" + "'", str6, "_\"\\\\1\"");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"tseth\"Context" + "'", str11, "\"tseth\"Context");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("Python3");
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getLoopCounter(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_Python3" + "'", str9, "_Python3");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        boolean boolean8 = python3Target1.templatesExist();
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("hi!");
        java.lang.String str12 = python3Target1.getImplicitRuleLabel("\"hi!\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "__\"\\\\1\"", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python3Target1.getLoopCounter(grammarAST17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"hi!\"" + "'", str10, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_\"hi!\"" + "'", str12, "_\"hi!\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_\\\"\\\\1" + "'", str16, "_\\\"\\\\1");
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.encodeIntAsCharEscape((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNull(codeGenerator5);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target1.getCodeGenerator();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\\n", false);
        java.lang.String str7 = python3Target1.getVersion();
        boolean boolean8 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\\\n" + "'", str6, "\\\\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        int int5 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getLoopLabel(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = python3Target1.getLoopCounter(grammarAST23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getImplicitRuleLabel("\"_Python3\"");
        boolean boolean8 = python3Target1.wantsBaseVisitor();
        java.lang.String str10 = python3Target1.getImplicitRuleLabel("__tsethi!");
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_\"_Python3\"" + "'", str7, "_\"_Python3\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "___tsethi!" + "'", str10, "___tsethi!");
        org.junit.Assert.assertNotNull(sTGroup11);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("Python3");
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getLanguage();
        java.lang.String str12 = python3Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getLoopLabel(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_Python3" + "'", str9, "_Python3");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python3" + "'", str11, "Python3");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        boolean boolean4 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet5 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getImplicitTokenLabel("ython");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("__tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        java.lang.String str11 = python3Target1.getListLabel("Python3");
        java.lang.String str13 = python3Target1.encodeIntAsCharEscape(29);
        java.lang.String str14 = python3Target1.getLanguage();
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromString("__hi!Context");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "___tsethi!" + "'", str8, "___tsethi!");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python3" + "'", str11, "Python3");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\35" + "'", str13, "\\35");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python3" + "'", str14, "Python3");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"__hi!Context\"" + "'", str16, "\"__hi!Context\"");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getImplicitRuleLabel("\"_Python3\"");
        boolean boolean8 = python3Target1.wantsBaseVisitor();
        java.lang.String str9 = python3Target1.getLanguage();
        org.antlr.v4.tool.Grammar grammar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getTokenTypeAsTargetLabel(grammar10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_\"_Python3\"" + "'", str7, "_\"_Python3\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python3" + "'", str9, "Python3");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("_tsethi!");
        java.lang.String str10 = python3Target1.getListLabel("_tset\\\\\\\\n");
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi!Context" + "'", str8, "_tsethi!Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_tset\\\\\\\\n" + "'", str10, "_tset\\\\\\\\n");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("_tsethi", false);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("\\\"hi!\\\"");
        boolean boolean11 = python3Target1.wantsBaseVisitor();
        boolean boolean12 = python3Target1.templatesExist();
        java.lang.String str14 = python3Target1.getImplicitRuleLabel("\"hi!\"ContextContextContext");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\\\\\"hi!\\\\\\\"\"" + "'", str10, "\"\\\\\\\"hi!\\\\\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_\"hi!\"ContextContextContext" + "'", str14, "_\"hi!\"ContextContextContext");
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        java.lang.String str10 = python3Target1.getImplicitRuleLabel("\\1");
        boolean boolean11 = python3Target1.templatesExist();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getRuleFunctionContextStructName(ruleFunction12);
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_\\1" + "'", str10, "_\\1");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("__tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        java.lang.String str11 = python3Target1.getListLabel("Python3");
        java.lang.String str13 = python3Target1.encodeIntAsCharEscape(29);
        java.lang.String str14 = python3Target1.getLanguage();
        int int15 = python3Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.getImplicitTokenLabel("__\\\"___tsethi!\\\"ContextContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "___tsethi!" + "'", str8, "___tsethi!");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python3" + "'", str11, "Python3");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\35" + "'", str13, "\\35");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python3" + "'", str14, "Python3");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getAltLabelContextStructName("_Python3");
        boolean boolean5 = python3Target1.templatesExist();
        java.lang.String str7 = python3Target1.getListLabel("__tsethi!");
        org.antlr.v4.tool.Rule rule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getRuleFunctionContextStructName(rule8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "__tsethi!" + "'", str7, "__tsethi!");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        int int5 = python3Target1.getInlineTestSetWordSize();
        boolean boolean6 = python3Target1.wantsBaseVisitor();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("\\35", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getElementName("_\"Python3\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\\\35" + "'", str9, "\\\\35");
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
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
        int int14 = python3Target1.getInlineTestSetWordSize();
        int int15 = python3Target1.getSerializedATNSegmentLimit();
        int int16 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str17 = python3Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29 + "'", int13 == 29);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 29 + "'", int16 == 29);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Python3" + "'", str17, "Python3");
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_Python3", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target1.getCodeGenerator();
        boolean boolean12 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "", false);
        int int17 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        java.lang.String str21 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator18, "__Python3", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar23 = null;
        int[] intArray24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray25 = python3Target1.getTokenTypesAsTargetLabels(grammar23, intArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"_Python\"" + "'", str21, "\"_Python\"");
        org.junit.Assert.assertNull(codeGenerator22);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str6 = python3Target1.getLanguage();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("_\\\"\\\"Python3Contex\\\"", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getElementListName("\"__\\\"___tsethi!\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"_\\\\\\\"\\\\\\\"Python3Contex\\\\\\\"\"" + "'", str9, "\"_\\\\\\\"\\\\\\\"Python3Contex\\\\\\\"\"");
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getAltLabelContextStructName("_Python3");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "__tsethi!", false);
        boolean boolean9 = python3Target1.wantsBaseListener();
        java.lang.String str11 = python3Target1.getImplicitSetLabel("");
        java.lang.String str13 = python3Target1.getAltLabelContextStructName("\"\"");
        java.lang.String str15 = python3Target1.getImplicitSetLabel("__tset_Python3Context");
        java.lang.String str16 = python3Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset" + "'", str11, "_tset");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\"Context" + "'", str13, "\"\"Context");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset__tset_Python3Context" + "'", str15, "_tset__tset_Python3Context");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Python3" + "'", str16, "Python3");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("Python3", true);
        java.lang.String str12 = python3Target1.getImplicitSetLabel("hi!");
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\"Python3Contex\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python3Target1.getCodeGenerator();
        java.lang.String str17 = python3Target1.getListLabel("\"4.5.2.1\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python3Target1.getTokenTypeAsTargetLabel(grammar19, (int) (short) 0);
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
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"4.5.2.1\"" + "'", str17, "\"4.5.2.1\"");
        org.junit.Assert.assertNull(codeGenerator18);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_Python3", false);
        java.lang.String str12 = python3Target1.getAltLabelContextStructName("\"hi!\"Context");
        java.lang.String str14 = python3Target1.getAltLabelContextStructName("_hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getElementListName("_tset\"\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"ContextContext" + "'", str12, "\"hi!\"ContextContext");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_hi!Context" + "'", str14, "_hi!Context");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("__tsethi!");
        java.lang.String str9 = python3Target1.getVersion();
        int int10 = python3Target1.getInlineTestSetWordSize();
        boolean boolean11 = python3Target1.templatesExist();
        boolean boolean12 = python3Target1.templatesExist();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "___tsethi!" + "'", str8, "___tsethi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
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
        java.lang.String str16 = python3Target1.getAltLabelContextStructName("_hi!Context");
        java.lang.String str18 = python3Target1.getImplicitRuleLabel("_\\\"_Python3\\\"ContextContext");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python3" + "'", str14, "Python3");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_hi!ContextContext" + "'", str16, "_hi!ContextContext");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "__\\\"_Python3\\\"ContextContext" + "'", str18, "__\\\"_Python3\\\"ContextContext");
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        boolean boolean7 = python3Target1.wantsBaseListener();
        java.lang.String str9 = python3Target1.getAltLabelContextStructName("_tset");
        org.antlr.v4.tool.Rule rule10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getRuleFunctionContextStructName(rule10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tsetContext" + "'", str9, "_tsetContext");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str4 = python3Target1.getTargetStringLiteralFromString("", true);
        java.lang.String str5 = python3Target1.getLanguage();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        boolean boolean6 = python3Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator8);
        java.lang.String str11 = python3Target9.encodeIntAsCharEscape(1);
        java.lang.String str12 = python3Target9.getVersion();
        java.lang.String str14 = python3Target9.getImplicitRuleLabel("_tsethi!");
        java.lang.String str16 = python3Target9.getImplicitRuleLabel("__tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python3Target9.getCodeGenerator();
        boolean boolean18 = python3Target9.supportsOverloadedMethods();
        java.lang.String str21 = python3Target9.getTargetStringLiteralFromString("\"_Python3\"", true);
        java.util.Set<java.lang.String> strSet22 = python3Target9.getBadWords();
        org.antlr.v4.tool.Grammar grammar23 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target25 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator24);
        boolean boolean26 = python3Target25.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = python3Target25.getCodeGenerator();
        java.lang.String str30 = python3Target25.getTargetStringLiteralFromString("\\n", false);
        org.antlr.v4.tool.Grammar grammar31 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target33 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator32);
        boolean boolean34 = python3Target33.wantsBaseListener();
        java.util.Set<java.lang.String> strSet35 = python3Target33.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup36 = python3Target33.getTemplates();
        java.lang.String str38 = python3Target33.getImplicitRuleLabel("\"\\\\1\"");
        org.antlr.v4.tool.Grammar grammar39 = null;
        int[] intArray40 = new int[] {};
        java.lang.String[] strArray41 = python3Target33.getTokenTypesAsTargetLabels(grammar39, intArray40);
        java.lang.String[] strArray42 = python3Target25.getTokenTypesAsTargetLabels(grammar31, intArray40);
        java.lang.String[] strArray43 = python3Target9.getTokenTypesAsTargetLabels(grammar23, intArray40);
        java.lang.String[] strArray44 = python3Target1.getTokenTypesAsTargetLabels(grammar7, intArray40);
        java.lang.Class<?> wildcardClass45 = strArray44.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\1" + "'", str11, "\\1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "__tsethi!" + "'", str14, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "___tsethi!" + "'", str16, "___tsethi!");
        org.junit.Assert.assertNull(codeGenerator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"\\\"_Python3\\\"\"" + "'", str21, "\"\\\"_Python3\\\"\"");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(codeGenerator27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\\\\n" + "'", str30, "\\\\n");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNotNull(sTGroup36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "_\"\\\\1\"" + "'", str38, "_\"\\\\1\"");
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[]");
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("__tsethi!");
        org.antlr.v4.tool.Grammar grammar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getTokenTypeAsTargetLabel(grammar9, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "___tsethi!" + "'", str8, "___tsethi!");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
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
        java.lang.String str23 = python3Target1.getTargetStringLiteralFromString("\"_\\\"\\\\\\\\1\\\"\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = python3Target1.getLoopLabel(grammarAST24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset" + "'", str11, "_tset");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_\\\"hi!\\\"" + "'", str13, "_\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str17, "\"\\\"\\\\\\\\1\\\"\"");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\\\"ContextContex" + "'", str21, "\\\"ContextContex");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"\\\"_\\\\\\\"\\\\\\\\\\\\\\\\1\\\\\\\"\\\"\"" + "'", str23, "\"\\\"_\\\\\\\"\\\\\\\\\\\\\\\\1\\\\\\\"\\\"\"");
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        java.lang.String str6 = python3Target1.getListLabel("_Python3Context");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_Python3Context" + "'", str6, "_Python3Context");
        org.junit.Assert.assertNull(codeGenerator7);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "_Python3Context", true);
        java.lang.String str9 = python3Target1.getListLabel("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target1.getCodeGenerator();
        java.lang.String str12 = python3Target1.getAltLabelContextStructName("_tset_Python3");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getImplicitTokenLabel("_\\\"_Python3\\\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"Python3Contex\"" + "'", str7, "\"Python3Contex\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_Python3Context" + "'", str12, "_tset_Python3Context");
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("Python3");
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.getTemplates();
        java.lang.String str12 = python3Target1.getImplicitSetLabel("PythonContext");
        java.lang.String str14 = python3Target1.getAltLabelContextStructName("__\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_Python3" + "'", str9, "_Python3");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsetPythonContext" + "'", str12, "_tsetPythonContext");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "__\"hi!\"Context" + "'", str14, "__\"hi!\"Context");
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        java.lang.String str8 = python3Target1.encodeIntAsCharEscape((int) '#');
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#" + "'", str8, "#");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "_Python3Context", true);
        java.lang.String str7 = python3Target1.encodeIntAsCharEscape((int) (short) 10);
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getRuleFunctionContextStructName(ruleFunction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python3Contex\"" + "'", str5, "\"Python3Contex\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\n" + "'", str7, "\\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("__tsethi!");
        java.lang.String str9 = python3Target1.getVersion();
        int int10 = python3Target1.getInlineTestSetWordSize();
        boolean boolean11 = python3Target1.templatesExist();
        java.lang.String str13 = python3Target1.getImplicitSetLabel("\"_\\\\\\\"hi!\\\\\\\"\"");
        java.util.Set<java.lang.String> strSet14 = python3Target1.getBadWords();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "___tsethi!" + "'", str8, "___tsethi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_tset\"_\\\\\\\"hi!\\\\\\\"\"" + "'", str13, "_tset\"_\\\\\\\"hi!\\\\\\\"\"");
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\\\"ython\\\"", true);
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_tset\\\\\\\"ython\\\\\\\"\"" + "'", str7, "\"_tset\\\\\\\"ython\\\\\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup8);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.getLoopLabel(grammarAST16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset" + "'", str11, "_tset");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\"Context" + "'", str13, "\"\"Context");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python3Target1.getLanguage();
        java.util.Set<java.lang.String> strSet9 = python3Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python3" + "'", str8, "Python3");
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
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
        org.antlr.v4.tool.Rule rule18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target1.getRuleFunctionContextStructName(rule18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "@" + "'", str14, "@");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_\\\"_Python3\\\"" + "'", str17, "_\\\"_Python3\\\"");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel(".5.2.");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("\"Python\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_.5.2." + "'", str6, "_.5.2.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_\"Python\"" + "'", str8, "_\"Python\"");
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel(".5.2.");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("\"Python\"");
        java.lang.String str10 = python3Target1.getListLabel("\"Python\"");
        java.lang.Class<?> wildcardClass11 = python3Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_.5.2." + "'", str6, "_.5.2.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_\"Python\"" + "'", str8, "_\"Python\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Python\"" + "'", str10, "\"Python\"");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.util.Set<java.lang.String> strSet4 = python3Target1.getBadWords();
        java.lang.String str6 = python3Target1.getImplicitSetLabel("_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset_tset" + "'", str6, "_tset_tset");
        org.junit.Assert.assertNull(codeGenerator7);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        boolean boolean7 = python3Target1.templatesExist();
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("\\1", true);
        java.lang.String str12 = python3Target1.getImplicitSetLabel("\\\\n");
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target1.getCodeGenerator();
        java.lang.String str14 = python3Target1.getLanguage();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\\1\"" + "'", str10, "\"\\\\1\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset\\\\n" + "'", str12, "_tset\\\\n");
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python3" + "'", str14, "Python3");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target1.getCodeGenerator();
        int int5 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Rule rule6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getRuleFunctionContextStructName(rule6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 29 + "'", int5 == 29);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("\"\\\\\\\\1Context\"");
        int int9 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"\\\\\\\\\\\\\\\\1Context\\\"\"" + "'", str8, "\"\\\"\\\\\\\\\\\\\\\\1Context\\\"\"");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        java.lang.String str6 = python3Target1.getListLabel("_Python3Context");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "a", true);
        java.lang.String str11 = python3Target1.getVersion();
        boolean boolean12 = python3Target1.wantsBaseListener();
        int int13 = python3Target1.getInlineTestSetWordSize();
        int int14 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_Python3Context" + "'", str6, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "@" + "'", str14, "@");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_\\\"_Python3\\\"" + "'", str17, "_\\\"_Python3\\\"");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "_Python3Context", true);
        java.lang.String str9 = python3Target1.getListLabel("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target1.getCodeGenerator();
        java.lang.String str12 = python3Target1.getAltLabelContextStructName("_tset_Python3");
        boolean boolean13 = python3Target1.templatesExist();
        boolean boolean14 = python3Target1.supportsOverloadedMethods();
        boolean boolean15 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"Python3Contex\"" + "'", str7, "\"Python3Contex\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_Python3Context" + "'", str12, "_tset_Python3Context");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
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
            boolean boolean20 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST19);
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
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\\\\1", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "\\\\n", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getElementName("\"\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\\\\\\\1" + "'", str6, "\\\\\\\\1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\n" + "'", str10, "\\n");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("Python3");
        boolean boolean10 = python3Target1.wantsBaseListener();
        java.lang.String str12 = python3Target1.getImplicitSetLabel("_\"\\\\1\"");
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target15 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator14);
        boolean boolean16 = python3Target15.wantsBaseListener();
        java.lang.String str18 = python3Target15.getListLabel("");
        java.lang.String str19 = python3Target15.getLanguage();
        java.lang.String str21 = python3Target15.encodeIntAsCharEscape((int) '#');
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target24 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator23);
        boolean boolean25 = python3Target24.wantsBaseListener();
        java.util.Set<java.lang.String> strSet26 = python3Target24.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup27 = python3Target24.getTemplates();
        java.lang.String str29 = python3Target24.getImplicitRuleLabel("\"\\\\1\"");
        org.antlr.v4.tool.Grammar grammar30 = null;
        int[] intArray31 = new int[] {};
        java.lang.String[] strArray32 = python3Target24.getTokenTypesAsTargetLabels(grammar30, intArray31);
        java.lang.String[] strArray33 = python3Target15.getTokenTypesAsTargetLabels(grammar22, intArray31);
        java.lang.String[] strArray34 = python3Target1.getTokenTypesAsTargetLabels(grammar13, intArray31);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_Python3" + "'", str9, "_Python3");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_\"\\\\1\"" + "'", str12, "_tset_\"\\\\1\"");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Python3" + "'", str19, "Python3");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "#" + "'", str21, "#");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(sTGroup27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "_\"\\\\1\"" + "'", str29, "_\"\\\\1\"");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[]");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray34);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
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
        boolean boolean23 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Rule rule24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = python3Target1.getRuleFunctionContextStructName(rule24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.util.Set<java.lang.String> strSet4 = python3Target1.getBadWords();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getLoopLabel(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("_tset\"_tsethi\"", true);
        java.lang.String str9 = python3Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getLoopCounter(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_tset\\\"_tsethi\\\"\"" + "'", str8, "\"_tset\\\"_tsethi\\\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.util.Set<java.lang.String> strSet4 = python3Target1.getBadWords();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        int int6 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python3Target1.getImplicitSetLabel("_tset_Python3");
        boolean boolean9 = python3Target1.templatesExist();
        java.lang.String str11 = python3Target1.getImplicitSetLabel("\"Python3Contex\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getLoopCounter(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset_tset_Python3" + "'", str8, "_tset_tset_Python3");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset\"Python3Contex\"" + "'", str11, "_tset\"Python3Contex\"");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\\\\1", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_\"\\\"Python3Contex\\\"\"", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getElementName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\\\\\\\1" + "'", str6, "\\\\\\\\1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\\"\\\"Python3Contex\\\"" + "'", str10, "\\\"\\\"Python3Contex\\\"");
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "\"\\\\1\"", false);
        boolean boolean9 = python3Target1.templatesExist();
        int int10 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str11 = python3Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getElementListName("_tset_Python3ContextContex");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\\\1" + "'", str8, "\\\\1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python3" + "'", str11, "Python3");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_Python3", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.encodeIntAsCharEscape((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\\\\1", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_\"\\\"Python3Contex\\\"\"", false);
        java.lang.String str11 = python3Target1.getLanguage();
        java.lang.String str13 = python3Target1.getImplicitRuleLabel("hi!");
        java.lang.Class<?> wildcardClass14 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\\\\\\\1" + "'", str6, "\\\\\\\\1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\\"\\\"Python3Contex\\\"" + "'", str10, "\\\"\\\"Python3Contex\\\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python3" + "'", str11, "Python3");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_hi!" + "'", str13, "_hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getAltLabelContextStructName("_Python3");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "__tsethi!", false);
        java.lang.String str10 = python3Target1.encodeIntAsCharEscape((int) (short) 100);
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        java.lang.String str12 = python3Target1.getLanguage();
        java.lang.String str13 = python3Target1.getLanguage();
        java.lang.String str15 = python3Target1.getImplicitSetLabel("tset_Python");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Python3" + "'", str12, "Python3");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python3" + "'", str13, "Python3");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tsettset_Python" + "'", str15, "_tsettset_Python");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "_Python3Context", true);
        java.lang.String str9 = python3Target1.getListLabel("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target1.getCodeGenerator();
        java.lang.String str12 = python3Target1.getAltLabelContextStructName("_tset_Python3");
        java.lang.String str14 = python3Target1.getImplicitRuleLabel("_tset_Python3Context");
        org.antlr.v4.tool.Grammar grammar15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.getTokenTypeAsTargetLabel(grammar15, (int) (short) 100);
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
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getImplicitSetLabel("_\"4.5.2.1\"");
        org.antlr.v4.tool.Grammar grammar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getTokenTypeAsTargetLabel(grammar9, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset_\"4.5.2.1\"" + "'", str8, "_tset_\"4.5.2.1\"");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
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
        java.lang.Class<?> wildcardClass14 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"Python3Contex\"" + "'", str13, "\"Python3Contex\"");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        boolean boolean3 = python3Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python3Target1.getBadWords();
        int int5 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("\"_tset_i\"");
        java.lang.String str10 = python3Target1.encodeIntAsCharEscape((int) (byte) 1);
        java.lang.String str12 = python3Target1.getListLabel("_hi!ContextContextContext");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"_tset_i\\\"\"" + "'", str8, "\"\\\"_tset_i\\\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\1" + "'", str10, "\\1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_hi!ContextContextContext" + "'", str12, "_hi!ContextContextContext");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("Python3", true);
        java.lang.String str12 = python3Target1.getImplicitSetLabel("hi!");
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\"Python3Contex\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python3Target1.getCodeGenerator();
        boolean boolean16 = python3Target1.wantsBaseVisitor();
        java.lang.String str19 = python3Target1.getTargetStringLiteralFromString("_tset_i", true);
        boolean boolean20 = python3Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = python3Target1.encodeIntAsCharEscape((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Python3\"" + "'", str10, "\"Python3\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsethi!" + "'", str12, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"Python3Contex\\\"\"" + "'", str14, "\"\\\"Python3Contex\\\"\"");
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"_tset_i\"" + "'", str19, "\"_tset_i\"");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("__tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        boolean boolean10 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "___tsethi!" + "'", str8, "___tsethi!");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getImplicitRuleLabel("\"_Python3\"");
        boolean boolean8 = python3Target1.wantsBaseVisitor();
        java.lang.String str10 = python3Target1.encodeIntAsCharEscape((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_\"_Python3\"" + "'", str7, "_\"_Python3\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\1" + "'", str10, "\\1");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.util.Set<java.lang.String> strSet4 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "\"\\\"Python3Contex\\\"\"", true);
        int int9 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromString("___tsethi!", true);
        java.lang.String str14 = python3Target1.getImplicitRuleLabel("PythonContextContext");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"Python3Contex\\\"\"" + "'", str8, "\"\\\"Python3Contex\\\"\"");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"___tsethi!\"" + "'", str12, "\"___tsethi!\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_PythonContextContext" + "'", str14, "_PythonContextContext");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "_Python3Context", true);
        java.lang.String str7 = python3Target1.encodeIntAsCharEscape((int) (short) 10);
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        java.lang.String str10 = python3Target1.encodeIntAsCharEscape(1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target1.getCodeGenerator();
        boolean boolean12 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python3Contex\"" + "'", str5, "\"Python3Contex\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\n" + "'", str7, "\\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\1" + "'", str10, "\\1");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "_Python3Context", true);
        java.lang.String str7 = python3Target1.encodeIntAsCharEscape((int) (short) 10);
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        boolean boolean9 = python3Target1.templatesExist();
        java.lang.String str10 = python3Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getElementName("_4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python3Contex\"" + "'", str5, "\"Python3Contex\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\n" + "'", str7, "\\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("Python3", true);
        java.lang.String str12 = python3Target1.getImplicitSetLabel("hi!");
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\"Python3Contex\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python3Target1.getCodeGenerator();
        boolean boolean16 = python3Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python3Target1.getElementName("_tset__\\\\\\\"\\\\\\\\\\\\\\\\1\\\\\\\"Context");
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
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_Python3", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target1.getCodeGenerator();
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\"\"", true);
        int int15 = python3Target1.getInlineTestSetWordSize();
        int int16 = python3Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup17 = python3Target1.getTemplates();
        boolean boolean18 = python3Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup19 = python3Target1.getTemplates();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"\\\"\"" + "'", str14, "\"\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(sTGroup19);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
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
        boolean boolean15 = python3Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"hi!\"" + "'", str10, "\"hi!\"");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "d" + "'", str14, "d");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("Python3", true);
        java.lang.String str12 = python3Target1.getImplicitSetLabel("hi!");
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\"Python3Contex\"");
        java.lang.String str16 = python3Target1.encodeIntAsCharEscape((int) (byte) 10);
        java.lang.String str18 = python3Target1.getAltLabelContextStructName("\"\\\"ython\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Python3\"" + "'", str10, "\"Python3\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsethi!" + "'", str12, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"Python3Contex\\\"\"" + "'", str14, "\"\\\"Python3Contex\\\"\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\\n" + "'", str16, "\\n");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\\\"ython\\\"\"Context" + "'", str18, "\"\\\"ython\\\"\"Context");
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        boolean boolean8 = python3Target1.templatesExist();
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "_\\\"hi!\\\"", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getImplicitTokenLabel("6");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"hi!\"" + "'", str10, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\\"hi!\\\"" + "'", str14, "\\\"hi!\\\"");
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        boolean boolean8 = python3Target1.templatesExist();
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("hi!");
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        boolean boolean12 = python3Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"hi!\"" + "'", str10, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python3Target1.getCodeGenerator();
        java.lang.String str17 = python3Target1.getImplicitRuleLabel("_tsetPythonContext");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_Python3" + "'", str9, "_Python3");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsetPythonContext" + "'", str12, "_tsetPythonContext");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python3" + "'", str13, "Python3");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "__tsetPythonContext" + "'", str17, "__tsetPythonContext");
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        boolean boolean4 = python3Target1.templatesExist();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("\"Python3Contex\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_\"Python3Contex\"" + "'", str6, "_\"Python3Contex\"");
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
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
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("_\"_Python3\"");
        java.lang.String str17 = python3Target1.getAltLabelContextStructName("\"hi!\"ContextContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        java.lang.String str21 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator18, "___Python3ContextContext", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"_\\\"_Python3\\\"\"" + "'", str15, "\"_\\\"_Python3\\\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"hi!\"ContextContextContext" + "'", str17, "\"hi!\"ContextContextContext");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"__Python3ContextContex\"" + "'", str21, "\"__Python3ContextContex\"");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
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
        org.antlr.v4.tool.Rule rule18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target1.getRuleFunctionContextStructName(rule18);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "@" + "'", str17, "@");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        boolean boolean7 = python3Target1.templatesExist();
        java.lang.String str9 = python3Target1.getListLabel("\"__tset_Python3ContextContext\"");
        org.antlr.v4.tool.Rule rule10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getRuleFunctionContextStructName(rule10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"__tset_Python3ContextContext\"" + "'", str9, "\"__tset_Python3ContextContext\"");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitSetLabel("_tsethi!");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("");
        org.antlr.v4.tool.Rule rule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getRuleFunctionContextStructName(rule9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset_tsethi!" + "'", str6, "_tset_tsethi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_" + "'", str8, "_");
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
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
        java.lang.String str19 = python3Target1.getImplicitSetLabel("\"\\\\\\\"_tsethi\\\\\\\"\"");
        java.lang.String str21 = python3Target1.getImplicitRuleLabel("\"_\\\\\\\"\\\\\\\"Python3Contex\\\\\\\"\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = python3Target1.getImplicitTokenLabel("\"__\\\"\\\\\\\\1\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset" + "'", str11, "_tset");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_\\\"hi!\\\"" + "'", str13, "_\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str17, "\"\\\"\\\\\\\\1\\\"\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_tset\"\\\\\\\"_tsethi\\\\\\\"\"" + "'", str19, "_tset\"\\\\\\\"_tsethi\\\\\\\"\"");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "_\"_\\\\\\\"\\\\\\\"Python3Contex\\\\\\\"\"" + "'", str21, "_\"_\\\\\\\"\\\\\\\"Python3Contex\\\\\\\"\"");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("Python3", true);
        java.lang.String str12 = python3Target1.getImplicitSetLabel("hi!");
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\"Python3Contex\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python3Target1.getCodeGenerator();
        boolean boolean16 = python3Target1.wantsBaseVisitor();
        java.lang.String str19 = python3Target1.getTargetStringLiteralFromString("_tset_i", true);
        boolean boolean20 = python3Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass21 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Python3\"" + "'", str10, "\"Python3\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsethi!" + "'", str12, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"Python3Contex\\\"\"" + "'", str14, "\"\\\"Python3Contex\\\"\"");
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"_tset_i\"" + "'", str19, "\"_tset_i\"");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
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
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target17 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator16);
        java.lang.String str19 = python3Target17.encodeIntAsCharEscape(1);
        java.lang.String str20 = python3Target17.getVersion();
        java.lang.String str22 = python3Target17.getImplicitRuleLabel("_tsethi!");
        java.lang.String str24 = python3Target17.getImplicitRuleLabel("__tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = python3Target17.getCodeGenerator();
        boolean boolean26 = python3Target17.supportsOverloadedMethods();
        java.lang.String str29 = python3Target17.getTargetStringLiteralFromString("\"_Python3\"", true);
        java.util.Set<java.lang.String> strSet30 = python3Target17.getBadWords();
        org.antlr.v4.tool.Grammar grammar31 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target33 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator32);
        boolean boolean34 = python3Target33.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = python3Target33.getCodeGenerator();
        java.lang.String str38 = python3Target33.getTargetStringLiteralFromString("\\n", false);
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
        java.lang.String[] strArray50 = python3Target33.getTokenTypesAsTargetLabels(grammar39, intArray48);
        java.lang.String[] strArray51 = python3Target17.getTokenTypesAsTargetLabels(grammar31, intArray48);
        java.lang.String[] strArray52 = python3Target1.getTokenTypesAsTargetLabels(grammar15, intArray48);
        org.antlr.v4.tool.Rule rule53 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str54 = python3Target1.getRuleFunctionContextStructName(rule53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "@" + "'", str14, "@");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\\1" + "'", str19, "\\1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4.5.2.1" + "'", str20, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "__tsethi!" + "'", str22, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "___tsethi!" + "'", str24, "___tsethi!");
        org.junit.Assert.assertNull(codeGenerator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\\\"_Python3\\\"\"" + "'", str29, "\"\\\"_Python3\\\"\"");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(codeGenerator35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\\\\n" + "'", str38, "\\\\n");
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
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("Python3", true);
        java.lang.String str12 = python3Target1.getImplicitSetLabel("hi!");
        java.util.Set<java.lang.String> strSet13 = python3Target1.getBadWords();
        int int14 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Python3\"" + "'", str10, "\"Python3\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsethi!" + "'", str12, "_tsethi!");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitSetLabel("_tsethi!");
        java.lang.String str7 = python3Target1.getVersion();
        java.util.Set<java.lang.String> strSet8 = python3Target1.getBadWords();
        java.lang.String str9 = python3Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getTokenTypeAsTargetLabel(grammar10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset_tsethi!" + "'", str6, "_tset_tsethi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getTokenTypeAsTargetLabel(grammar7, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
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
        java.lang.String str15 = python3Target1.encodeIntAsCharEscape(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.getImplicitTokenLabel("_\\\"\\\"Python3Contex\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\\"\\\"Python3Contex\\\"" + "'", str11, "\\\"\\\"Python3Contex\\\"");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\1" + "'", str15, "\\1");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "_Python3Context", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python3" + "'", str9, "Python3");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"Python3Contex\"" + "'", str15, "\"Python3Contex\"");
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        boolean boolean8 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
        int int10 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str12 = python3Target1.getListLabel("\"_\\\"_Python3\\\"\"");
        int int13 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str15 = python3Target1.getImplicitSetLabel("_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_\\\"_Python3\\\"\"" + "'", str12, "\"_\\\"_Python3\\\"\"");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset_tsethi!" + "'", str15, "_tset_tsethi!");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str6 = python3Target1.getImplicitSetLabel("_tset\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset_tset\"\"Context" + "'", str6, "_tset_tset\"\"Context");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        boolean boolean4 = python3Target1.wantsBaseListener();
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("_\\\"_Python3\\\"Context");
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("_tset__\\\\\\\"\\\\\\\\\\\\\\\\1\\\\\\\"");
        org.antlr.v4.tool.Rule rule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getRuleFunctionContextStructName(rule9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_\\\"_Python3\\\"ContextContext" + "'", str6, "_\\\"_Python3\\\"ContextContext");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset__\\\\\\\"\\\\\\\\\\\\\\\\1\\\\\\\"Context" + "'", str8, "_tset__\\\\\\\"\\\\\\\\\\\\\\\\1\\\\\\\"Context");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_Python3", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target1.getCodeGenerator();
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\"\"", true);
        boolean boolean15 = python3Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet16 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        java.lang.String str20 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator17, "\"_Python3\"", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"\\\"\"" + "'", str14, "\"\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "_Python3" + "'", str20, "_Python3");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_\"\\\"Python3Contex\\\"\"", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getLoopCounter(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_\\\"\\\\\\\"Python3Contex\\\\\\\"\\\"\"" + "'", str7, "\"_\\\"\\\\\\\"Python3Contex\\\\\\\"\\\"\"");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\\n", true);
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"_tset\\\"_tsethi\\\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target1.getCodeGenerator();
        boolean boolean13 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"" + "'", str9, "\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"_tset\\\"_tsethi\\\"\"Context" + "'", str11, "\"_tset\\\"_tsethi\\\"\"Context");
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "_tsethi!", false);
        java.lang.String str19 = python3Target1.getListLabel("__tsethi");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "tsethi" + "'", str17, "tsethi");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "__tsethi" + "'", str19, "__tsethi");
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
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
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target17 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator16);
        java.lang.String str19 = python3Target17.encodeIntAsCharEscape(1);
        java.lang.String str20 = python3Target17.getVersion();
        java.lang.String str22 = python3Target17.getImplicitRuleLabel("_tsethi!");
        java.lang.String str24 = python3Target17.getImplicitRuleLabel("__tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = python3Target17.getCodeGenerator();
        boolean boolean26 = python3Target17.supportsOverloadedMethods();
        java.lang.String str29 = python3Target17.getTargetStringLiteralFromString("\"_Python3\"", true);
        java.util.Set<java.lang.String> strSet30 = python3Target17.getBadWords();
        org.antlr.v4.tool.Grammar grammar31 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target33 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator32);
        boolean boolean34 = python3Target33.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = python3Target33.getCodeGenerator();
        java.lang.String str38 = python3Target33.getTargetStringLiteralFromString("\\n", false);
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
        java.lang.String[] strArray50 = python3Target33.getTokenTypesAsTargetLabels(grammar39, intArray48);
        java.lang.String[] strArray51 = python3Target17.getTokenTypesAsTargetLabels(grammar31, intArray48);
        java.lang.String[] strArray52 = python3Target1.getTokenTypesAsTargetLabels(grammar15, intArray48);
        int int53 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "@" + "'", str14, "@");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\\1" + "'", str19, "\\1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4.5.2.1" + "'", str20, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "__tsethi!" + "'", str22, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "___tsethi!" + "'", str24, "___tsethi!");
        org.junit.Assert.assertNull(codeGenerator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\\\"_Python3\\\"\"" + "'", str29, "\"\\\"_Python3\\\"\"");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(codeGenerator35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\\\\n" + "'", str38, "\\\\n");
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
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 64 + "'", int53 == 64);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        int int6 = python3Target1.getInlineTestSetWordSize();
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("Python3", true);
        java.lang.String str12 = python3Target1.getImplicitSetLabel("hi!");
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("___tsethi!");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getRuleFunctionContextStructName(ruleFunction15);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"___tsethi!\"" + "'", str14, "\"___tsethi!\"");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getTargetStringLiteralFromString("\"_Python3\"");
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_Python3ContextContext");
        int int7 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\\\"_Python3\\\"\"" + "'", str4, "\"\\\"_Python3\\\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__Python3ContextContext" + "'", str6, "__Python3ContextContext");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        boolean boolean8 = python3Target1.templatesExist();
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("hi!");
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "_\"hi!\"", false);
        boolean boolean16 = python3Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python3Target1.getImplicitTokenLabel("_tset\"___tsethi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"hi!\"" + "'", str10, "\"hi!\"");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\\"hi!" + "'", str15, "\\\"hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getElementListName("_tset4.5.2.1Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
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
        boolean boolean15 = python3Target1.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.getLoopLabel(grammarAST16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python3" + "'", str14, "Python3");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        java.lang.String str7 = python3Target1.getImplicitRuleLabel("__Python3ContextContext");
        org.antlr.v4.tool.Grammar grammar8 = null;
        int[] intArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray10 = python3Target1.getTokenTypesAsTargetLabels(grammar8, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "___Python3ContextContext" + "'", str7, "___Python3ContextContext");
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("____tsethi!", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST12);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "____tsethi!" + "'", str11, "____tsethi!");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str5 = python3Target1.getImplicitRuleLabel("hi!");
        java.lang.String str7 = python3Target1.getImplicitRuleLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\"\\\"\\\"\"Context", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getElementListName("\"\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_hi!" + "'", str5, "_hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_4.5.2.1" + "'", str7, "_4.5.2.1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"\\\"\\\"Contex\"" + "'", str11, "\"\\\"\\\"\\\"Contex\"");
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getElementListName("\"_tsethi!\"");
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
        org.junit.Assert.assertNull(codeGenerator14);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("Python3");
        java.lang.String str11 = python3Target1.getImplicitSetLabel("_Python3");
        boolean boolean12 = python3Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "_tset4.5.2.1", false);
        org.antlr.v4.tool.Grammar grammar17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target1.getTokenTypeAsTargetLabel(grammar17, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_Python3" + "'", str9, "_Python3");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset_Python3" + "'", str11, "_tset_Python3");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "tset4.5.2." + "'", str16, "tset4.5.2.");
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        java.lang.String str3 = python3Target1.getLanguage();
        java.lang.Class<?> wildcardClass4 = python3Target1.getClass();
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python3" + "'", str3, "Python3");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.util.Set<java.lang.String> strSet4 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "\"\\\"Python3Contex\\\"\"", true);
        int int9 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromString("___tsethi!", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getLoopCounter(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"Python3Contex\\\"\"" + "'", str8, "\"\\\"Python3Contex\\\"\"");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"___tsethi!\"" + "'", str12, "\"___tsethi!\"");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_Python3", false);
        java.lang.String str12 = python3Target1.getAltLabelContextStructName("__tset_Python3Context");
        java.lang.String str14 = python3Target1.getListLabel("\"__hi!\"");
        org.antlr.v4.tool.Grammar grammar15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.getTokenTypeAsTargetLabel(grammar15, 29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "__tset_Python3ContextContext" + "'", str12, "__tset_Python3ContextContext");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"__hi!\"" + "'", str14, "\"__hi!\"");
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        java.lang.String str3 = python3Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python3Target1.getElementName("\\\"ContextContex");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python3Target1.getCodeGenerator();
        java.lang.String str17 = python3Target1.getAltLabelContextStructName("_tset__\\\\\\\"\\\\\\\\\\\\\\\\1\\\\\\\"Context");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_Python3" + "'", str9, "_Python3");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsetPythonContext" + "'", str12, "_tsetPythonContext");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python3" + "'", str13, "Python3");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_tset__\\\\\\\"\\\\\\\\\\\\\\\\1\\\\\\\"ContextContext" + "'", str17, "_tset__\\\\\\\"\\\\\\\\\\\\\\\\1\\\\\\\"ContextContext");
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel(".5.2.");
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_.5.2." + "'", str6, "_.5.2.");
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("__tsethi!");
        java.lang.String str9 = python3Target1.getVersion();
        int int10 = python3Target1.getInlineTestSetWordSize();
        boolean boolean11 = python3Target1.templatesExist();
        java.lang.String str13 = python3Target1.getImplicitSetLabel("\"_\\\\\\\"hi!\\\\\\\"\"");
        int int14 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "___tsethi!" + "'", str8, "___tsethi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_tset\"_\\\\\\\"hi!\\\\\\\"\"" + "'", str13, "_tset\"_\\\\\\\"hi!\\\\\\\"\"");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_Python3", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target1.getCodeGenerator();
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\"\"", true);
        int int15 = python3Target1.getInlineTestSetWordSize();
        int int16 = python3Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup17 = python3Target1.getTemplates();
        java.lang.String str19 = python3Target1.getAltLabelContextStructName("_tset__Python3");
        org.antlr.v4.tool.Grammar grammar20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = python3Target1.getTokenTypeAsTargetLabel(grammar20, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"\\\"\"" + "'", str14, "\"\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_tset__Python3Context" + "'", str19, "_tset__Python3Context");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
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
        int int22 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str25 = python3Target1.getTargetStringLiteralFromString("\\\"\\\"Python3Contex\\\"", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset" + "'", str11, "_tset");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_\\\"hi!\\\"" + "'", str13, "_\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str17, "\"\\\"\\\\\\\\1\\\"\"");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\\\"ContextContex" + "'", str21, "\\\"ContextContex");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 64 + "'", int22 == 64);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\\\\\\\"\\\\\\\"Python3Contex\\\\\\\"" + "'", str25, "\\\\\\\"\\\\\\\"Python3Contex\\\\\\\"");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("__tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        java.lang.String str10 = python3Target1.getLanguage();
        java.lang.String str12 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str13 = python3Target1.getLanguage();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "___tsethi!" + "'", str8, "___tsethi!");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python3" + "'", str10, "Python3");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\1" + "'", str12, "\\1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python3" + "'", str13, "Python3");
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_Python3", false);
        java.util.Set<java.lang.String> strSet11 = python3Target1.getBadWords();
        boolean boolean12 = python3Target1.wantsBaseListener();
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("_Python3ContextContext", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = python3Target1.getCodeGenerator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_Python3ContextContext" + "'", str15, "_Python3ContextContext");
        org.junit.Assert.assertNull(codeGenerator16);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitSetLabel("_tsethi!");
        java.lang.String str7 = python3Target1.getVersion();
        java.util.Set<java.lang.String> strSet8 = python3Target1.getBadWords();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset_tsethi!" + "'", str6, "_tset_tsethi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(sTGroup9);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        boolean boolean7 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "4.5.2.1", false);
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target1.getTemplates();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getRuleFunctionContextStructName(ruleFunction13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".5.2." + "'", str11, ".5.2.");
        org.junit.Assert.assertNotNull(sTGroup12);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str6 = python3Target1.getLanguage();
        org.antlr.v4.tool.Grammar grammar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getTokenTypeAsTargetLabel(grammar7, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getAltLabelContextStructName("_Python3");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "__tsethi!", false);
        java.lang.String str10 = python3Target1.encodeIntAsCharEscape((int) (short) 100);
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        java.lang.String str12 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getLoopCounter(grammarAST14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Python3" + "'", str12, "Python3");
        org.junit.Assert.assertNull(codeGenerator13);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str9 = python3Target1.encodeIntAsCharEscape((int) (byte) 10);
        int int10 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromString("_\"_Python3\"");
        java.lang.String str13 = python3Target1.getVersion();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\n" + "'", str9, "\\n");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_\\\"_Python3\\\"\"" + "'", str12, "\"_\\\"_Python3\\\"\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getAltLabelContextStructName("_Python3");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "__tsethi!", false);
        java.lang.String str10 = python3Target1.encodeIntAsCharEscape((int) (short) 100);
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        int int12 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str14 = python3Target1.getAltLabelContextStructName("__tset_Python3Context");
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromString("\"ython\"");
        java.lang.String str19 = python3Target1.getTargetStringLiteralFromString("_tset\\\"\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\1Context\\\\\\\"\\\"", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "__tset_Python3ContextContext" + "'", str14, "__tset_Python3ContextContext");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\\"ython\\\"\"" + "'", str16, "\"\\\"ython\\\"\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"_tset\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\1Context\\\\\\\\\\\\\\\"\\\\\\\"\"" + "'", str19, "\"_tset\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\1Context\\\\\\\\\\\\\\\"\\\\\\\"\"");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.encodeIntAsCharEscape((int) ' ');
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator9);
        boolean boolean11 = python3Target10.wantsBaseListener();
        java.lang.String str13 = python3Target10.getAltLabelContextStructName("_Python3");
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target10.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "__tsethi!", false);
        java.lang.String str19 = python3Target10.encodeIntAsCharEscape((int) (short) 100);
        boolean boolean20 = python3Target10.supportsOverloadedMethods();
        int int21 = python3Target10.getInlineTestSetWordSize();
        int int22 = python3Target10.getSerializedATNSegmentLimit();
        int int23 = python3Target10.getInlineTestSetWordSize();
        int int24 = python3Target10.getSerializedATNSegmentLimit();
        java.lang.String str26 = python3Target10.getImplicitSetLabel("\\n");
        java.lang.String str28 = python3Target10.getAltLabelContextStructName("_tset_Python3Context");
        org.antlr.v4.tool.Grammar grammar29 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator30 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target31 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator30);
        java.lang.String str33 = python3Target31.encodeIntAsCharEscape(1);
        java.lang.String str34 = python3Target31.getVersion();
        java.lang.String str36 = python3Target31.getImplicitRuleLabel("_tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator37 = null;
        java.lang.String str40 = python3Target31.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator37, "_Python3", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator41 = python3Target31.getCodeGenerator();
        boolean boolean42 = python3Target31.supportsOverloadedMethods();
        java.lang.String str44 = python3Target31.encodeIntAsCharEscape(64);
        org.antlr.v4.tool.Grammar grammar45 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator46 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target47 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator46);
        java.lang.String str49 = python3Target47.encodeIntAsCharEscape(1);
        java.lang.String str50 = python3Target47.getVersion();
        java.lang.String str52 = python3Target47.getImplicitRuleLabel("_tsethi!");
        java.lang.String str54 = python3Target47.getImplicitRuleLabel("__tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator55 = python3Target47.getCodeGenerator();
        boolean boolean56 = python3Target47.supportsOverloadedMethods();
        java.lang.String str59 = python3Target47.getTargetStringLiteralFromString("\"_Python3\"", true);
        java.util.Set<java.lang.String> strSet60 = python3Target47.getBadWords();
        org.antlr.v4.tool.Grammar grammar61 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator62 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target63 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator62);
        boolean boolean64 = python3Target63.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator65 = python3Target63.getCodeGenerator();
        java.lang.String str68 = python3Target63.getTargetStringLiteralFromString("\\n", false);
        org.antlr.v4.tool.Grammar grammar69 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator70 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target71 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator70);
        boolean boolean72 = python3Target71.wantsBaseListener();
        java.util.Set<java.lang.String> strSet73 = python3Target71.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup74 = python3Target71.getTemplates();
        java.lang.String str76 = python3Target71.getImplicitRuleLabel("\"\\\\1\"");
        org.antlr.v4.tool.Grammar grammar77 = null;
        int[] intArray78 = new int[] {};
        java.lang.String[] strArray79 = python3Target71.getTokenTypesAsTargetLabels(grammar77, intArray78);
        java.lang.String[] strArray80 = python3Target63.getTokenTypesAsTargetLabels(grammar69, intArray78);
        java.lang.String[] strArray81 = python3Target47.getTokenTypesAsTargetLabels(grammar61, intArray78);
        java.lang.String[] strArray82 = python3Target31.getTokenTypesAsTargetLabels(grammar45, intArray78);
        java.lang.String[] strArray83 = python3Target10.getTokenTypesAsTargetLabels(grammar29, intArray78);
        java.lang.String[] strArray84 = python3Target1.getTokenTypesAsTargetLabels(grammar8, intArray78);
        boolean boolean85 = python3Target1.supportsOverloadedMethods();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_Python3Context" + "'", str13, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_tsethi" + "'", str17, "_tsethi");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "d" + "'", str19, "d");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 29 + "'", int22 == 29);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 64 + "'", int23 == 64);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 29 + "'", int24 == 29);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "_tset\\n" + "'", str26, "_tset\\n");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "_tset_Python3ContextContext" + "'", str28, "_tset_Python3ContextContext");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\\1" + "'", str33, "\\1");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "4.5.2.1" + "'", str34, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "__tsethi!" + "'", str36, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Python" + "'", str40, "Python");
        org.junit.Assert.assertNull(codeGenerator41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "@" + "'", str44, "@");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\\1" + "'", str49, "\\1");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "4.5.2.1" + "'", str50, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "__tsethi!" + "'", str52, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "___tsethi!" + "'", str54, "___tsethi!");
        org.junit.Assert.assertNull(codeGenerator55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "\"\\\"_Python3\\\"\"" + "'", str59, "\"\\\"_Python3\\\"\"");
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(codeGenerator65);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "\\\\n" + "'", str68, "\\\\n");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(strSet73);
        org.junit.Assert.assertNotNull(sTGroup74);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "_\"\\\\1\"" + "'", str76, "_\"\\\\1\"");
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[]");
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\\\\1", false);
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        java.lang.String str8 = python3Target1.getLanguage();
        int int9 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\\\\\\\1" + "'", str6, "\\\\\\\\1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python3" + "'", str8, "Python3");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\\\"ython\\\"", true);
        java.lang.String str9 = python3Target1.getAltLabelContextStructName("_\"___tsethi!\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_tset\\\\\\\"ython\\\\\\\"\"" + "'", str7, "\"_tset\\\\\\\"ython\\\\\\\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"___tsethi!\"Context" + "'", str9, "_\"___tsethi!\"Context");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.wantsBaseListener();
        java.lang.String str6 = python3Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getElementListName("@");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_Python3", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target1.getCodeGenerator();
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\"\"", true);
        boolean boolean15 = python3Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet16 = python3Target1.getBadWords();
        org.antlr.v4.tool.Rule rule17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python3Target1.getRuleFunctionContextStructName(rule17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"\\\"\"" + "'", str14, "\"\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        boolean boolean8 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
        int int10 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str12 = python3Target1.getListLabel("\"_\\\"_Python3\\\"\"");
        int int13 = python3Target1.getInlineTestSetWordSize();
        int int14 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST15);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_\\\"_Python3\\\"\"" + "'", str12, "\"_\\\"_Python3\\\"\"");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("Python3");
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target1.getCodeGenerator();
        java.lang.String str13 = python3Target1.getListLabel("\"4.5.2.1\"");
        org.antlr.v4.tool.Rule rule14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getRuleFunctionContextStructName(rule14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_Python3" + "'", str9, "_Python3");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"4.5.2.1\"" + "'", str13, "\"4.5.2.1\"");
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target1.getTemplates();
        java.lang.String str10 = python3Target1.getListLabel("_tset\\\\n");
        java.lang.String str12 = python3Target1.getListLabel("_tset\\\"___tsethi!Context");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_tset\\\\n" + "'", str10, "_tset\\\\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset\\\"___tsethi!Context" + "'", str12, "_tset\\\"___tsethi!Context");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("_\"hi!\"", false);
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        boolean boolean10 = python3Target1.wantsBaseVisitor();
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromString("_\"\\\\1\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getElementName("_\\\"_Python3\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_\\\"hi!\\\"" + "'", str8, "_\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_\\\"\\\\\\\\1\\\"\"" + "'", str12, "\"_\\\"\\\\\\\\1\\\"\"");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
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
        java.lang.Class<?> wildcardClass15 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset" + "'", str11, "_tset");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_\\\"hi!\\\"" + "'", str13, "_\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\\\\1", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_\"\\\"Python3Contex\\\"\"", false);
        java.util.Set<java.lang.String> strSet11 = python3Target1.getBadWords();
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("#", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\\\\\\\1" + "'", str6, "\\\\\\\\1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\\"\\\"Python3Contex\\\"" + "'", str10, "\\\"\\\"Python3Contex\\\"");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#" + "'", str14, "#");
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getAltLabelContextStructName("_Python3");
        java.lang.String str6 = python3Target1.getListLabel("\"\\\"Python3Contex\\\"\"");
        boolean boolean7 = python3Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\"Python3Contex\\\"\"" + "'", str6, "\"\\\"Python3Contex\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getImplicitSetLabel("\"_tset\\\\\\\"ython\\\\\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\"_tset\\\\\\\"ython\\\\\\\"\"" + "'", str7, "_tset\"_tset\\\\\\\"ython\\\\\\\"\"");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
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
        java.lang.String str15 = python3Target1.getImplicitRuleLabel("6");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\n" + "'", str5, "\\n");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\\\n" + "'", str9, "\\\\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\n" + "'", str11, "\\n");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_6" + "'", str15, "_6");
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.util.Set<java.lang.String> strSet4 = python3Target1.getBadWords();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        int int6 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet7 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        int int9 = python3Target1.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
        org.junit.Assert.assertNotNull(sTGroup10);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("Python3");
        java.lang.String str11 = python3Target1.getListLabel("");
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getElementListName("_\"hi!\"ContextContextContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_Python3" + "'", str9, "_Python3");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(sTGroup12);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.getLoopCounter(grammarAST16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_Python3" + "'", str9, "_Python3");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3" + "'", str13, "3");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_\"hi!\"" + "'", str15, "_\"hi!\"");
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        int int7 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.util.Set<java.lang.String> strSet4 = python3Target1.getBadWords();
        java.lang.String str6 = python3Target1.getImplicitSetLabel("_tset");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getImplicitTokenLabel("\"__\\\"___tsethi!\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset_tset" + "'", str6, "_tset_tset");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "_Python3Context", true);
        java.lang.String str7 = python3Target1.encodeIntAsCharEscape((int) (short) 10);
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        java.lang.String str10 = python3Target1.encodeIntAsCharEscape(1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getImplicitTokenLabel("\"\\\"hi!\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python3Contex\"" + "'", str5, "\"Python3Contex\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\n" + "'", str7, "\\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\1" + "'", str10, "\\1");
        org.junit.Assert.assertNull(codeGenerator11);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
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
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\"\\\"Python3Context\\\"\"", false);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getRuleFunctionContextStructName(ruleFunction15);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\\"\\\\\\\"Python3Context\\\\\\\"\\\"" + "'", str14, "\\\"\\\\\\\"Python3Context\\\\\\\"\\\"");
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "_Python3Context", true);
        java.lang.String str9 = python3Target1.getListLabel("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target1.getCodeGenerator();
        java.lang.String str12 = python3Target1.getAltLabelContextStructName("_tset_Python3");
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target1.getCodeGenerator();
        boolean boolean14 = python3Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getLoopCounter(grammarAST15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"Python3Contex\"" + "'", str7, "\"Python3Contex\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_Python3Context" + "'", str12, "_tset_Python3Context");
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
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
        java.lang.String str19 = python3Target1.getImplicitSetLabel("\"\\\\\\\"_tsethi\\\\\\\"\"");
        java.lang.String str21 = python3Target1.getImplicitRuleLabel("\"_\\\\\\\"\\\\\\\"Python3Contex\\\\\\\"\"");
        boolean boolean22 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset" + "'", str11, "_tset");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_\\\"hi!\\\"" + "'", str13, "_\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str17, "\"\\\"\\\\\\\\1\\\"\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_tset\"\\\\\\\"_tsethi\\\\\\\"\"" + "'", str19, "_tset\"\\\\\\\"_tsethi\\\\\\\"\"");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "_\"_\\\\\\\"\\\\\\\"Python3Contex\\\\\\\"\"" + "'", str21, "_\"_\\\\\\\"\\\\\\\"Python3Contex\\\\\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset" + "'", str11, "_tset");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_\\\"hi!\\\"" + "'", str13, "_\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str17, "\"\\\"\\\\\\\\1\\\"\"");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("Python3", true);
        java.lang.String str12 = python3Target1.getImplicitSetLabel("hi!");
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\"Python3Contex\"");
        java.lang.String str16 = python3Target1.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        java.lang.String str20 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator17, "_tsetPythonContext", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Python3\"" + "'", str10, "\"Python3\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsethi!" + "'", str12, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"Python3Contex\\\"\"" + "'", str14, "\"\\\"Python3Contex\\\"\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\\n" + "'", str16, "\\n");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "tsetPythonContex" + "'", str20, "tsetPythonContex");
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.util.Set<java.lang.String> strSet4 = python3Target1.getBadWords();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("\\\"\\\"Python3Contex\\\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getLoopLabel(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_\\\"\\\"Python3Contex\\\"" + "'", str6, "_\\\"\\\"Python3Contex\\\"");
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape((int) (short) 10);
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        org.antlr.v4.tool.Rule rule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getRuleFunctionContextStructName(rule7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\n" + "'", str5, "\\n");
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_Python3", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target1.getCodeGenerator();
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\"\"", true);
        boolean boolean15 = python3Target1.templatesExist();
        java.util.Set<java.lang.String> strSet16 = python3Target1.getBadWords();
        boolean boolean17 = python3Target1.templatesExist();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"\\\"\"" + "'", str14, "\"\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape((int) (short) 10);
        java.lang.String str7 = python3Target1.encodeIntAsCharEscape((int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\n" + "'", str5, "\\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#" + "'", str7, "#");
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str6 = python3Target1.getListLabel("\"_\\\"\\\\\\\"Python3Contex\\\\\\\"\\\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset\\\\n", false);
        java.lang.String str12 = python3Target1.encodeIntAsCharEscape((int) ' ');
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getLoopCounter(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_\\\"\\\\\\\"Python3Contex\\\\\\\"\\\"\"" + "'", str6, "\"_\\\"\\\\\\\"Python3Contex\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "tset\\\\" + "'", str10, "tset\\\\");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " " + "'", str12, " ");
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
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
        java.lang.String str14 = python3Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getElementName("_\\\"_Python3\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_Python3" + "'", str9, "_Python3");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsetPythonContext" + "'", str12, "_tsetPythonContext");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python3" + "'", str13, "Python3");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("_tsethi", false);
        int int9 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str9 = python3Target1.encodeIntAsCharEscape((int) (byte) 10);
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("_Python3");
        java.lang.String str13 = python3Target1.getAltLabelContextStructName("Python3");
        java.lang.String str14 = python3Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getLoopCounter(grammarAST15);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python3Context" + "'", str13, "Python3Context");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python3" + "'", str14, "Python3");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.util.Set<java.lang.String> strSet4 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "\"\\\"Python3Contex\\\"\"", true);
        java.util.Set<java.lang.String> strSet9 = python3Target1.getBadWords();
        boolean boolean10 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"Python3Contex\\\"\"" + "'", str8, "\"\\\"Python3Contex\\\"\"");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"" + "'", str14, "\"\"");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "_Python3Context", true);
        java.lang.String str7 = python3Target1.getListLabel("Python");
        java.util.Set<java.lang.String> strSet8 = python3Target1.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getElementName("_\"_\\\"\\\\\\\"Python3Contex\\\\\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python3Contex\"" + "'", str5, "\"Python3Contex\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python" + "'", str7, "Python");
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
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
        boolean boolean16 = python3Target1.wantsBaseListener();
        java.lang.String str17 = python3Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target1.getElementListName("_hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29 + "'", int13 == 29);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"hi!\"Context" + "'", str15, "\"hi!\"Context");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        java.lang.String str3 = python3Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_\"hi!\"");
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getTokenTypeAsTargetLabel(grammar8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python3" + "'", str3, "Python3");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__\"hi!\"" + "'", str6, "__\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup9);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
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
        int int14 = python3Target1.getInlineTestSetWordSize();
        int int15 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str17 = python3Target1.getImplicitSetLabel("\\n");
        java.lang.String str19 = python3Target1.getAltLabelContextStructName("_tset_Python3Context");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python3Target1.getElementListName("\"_tset_\\\"\\\\\\\"\\\\\\\\\\\\\\\\1\\\\\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29 + "'", int13 == 29);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_tset\\n" + "'", str17, "_tset\\n");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_tset_Python3ContextContext" + "'", str19, "_tset_Python3ContextContext");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "_Python3Context", true);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("____tsethi!", false);
        boolean boolean9 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python3Contex\"" + "'", str5, "\"Python3Contex\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "____tsethi!" + "'", str8, "____tsethi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("Python3");
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.getTemplates();
        java.lang.String str11 = python3Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getLoopCounter(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_Python3" + "'", str9, "_Python3");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python3" + "'", str11, "Python3");
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "_Python3Context", true);
        java.lang.String str9 = python3Target1.getListLabel("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target1.getCodeGenerator();
        java.lang.String str12 = python3Target1.getAltLabelContextStructName("_tset_Python3");
        boolean boolean13 = python3Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"_tset\\\"ython\\\"\"", false);
        java.lang.String str18 = python3Target1.getVersion();
        java.lang.String str20 = python3Target1.encodeIntAsCharEscape((int) (byte) 0);
        java.util.Set<java.lang.String> strSet21 = python3Target1.getBadWords();
        org.antlr.v4.tool.Rule rule22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = python3Target1.getRuleFunctionContextStructName(rule22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"Python3Contex\"" + "'", str7, "\"Python3Contex\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_Python3Context" + "'", str12, "_tset_Python3Context");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_tset\\\"ython\\\"" + "'", str17, "_tset\\\"ython\\\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\\0" + "'", str20, "\\0");
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.wantsBaseListener();
        int int6 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("__hi!", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "__hi!", false);
        int int14 = python3Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 29 + "'", int6 == 29);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"__hi!\"" + "'", str9, "\"__hi!\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_hi" + "'", str13, "_hi");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNotNull(sTGroup15);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
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
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target17 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator16);
        java.lang.String str19 = python3Target17.encodeIntAsCharEscape(1);
        java.lang.String str20 = python3Target17.getVersion();
        java.lang.String str22 = python3Target17.getImplicitRuleLabel("_tsethi!");
        java.lang.String str24 = python3Target17.getImplicitRuleLabel("__tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = python3Target17.getCodeGenerator();
        boolean boolean26 = python3Target17.supportsOverloadedMethods();
        java.lang.String str29 = python3Target17.getTargetStringLiteralFromString("\"_Python3\"", true);
        java.util.Set<java.lang.String> strSet30 = python3Target17.getBadWords();
        org.antlr.v4.tool.Grammar grammar31 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target33 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator32);
        boolean boolean34 = python3Target33.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = python3Target33.getCodeGenerator();
        java.lang.String str38 = python3Target33.getTargetStringLiteralFromString("\\n", false);
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
        java.lang.String[] strArray50 = python3Target33.getTokenTypesAsTargetLabels(grammar39, intArray48);
        java.lang.String[] strArray51 = python3Target17.getTokenTypesAsTargetLabels(grammar31, intArray48);
        java.lang.String[] strArray52 = python3Target1.getTokenTypesAsTargetLabels(grammar15, intArray48);
        org.antlr.v4.tool.ast.GrammarAST grammarAST53 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str54 = python3Target1.getLoopCounter(grammarAST53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "@" + "'", str14, "@");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\\1" + "'", str19, "\\1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4.5.2.1" + "'", str20, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "__tsethi!" + "'", str22, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "___tsethi!" + "'", str24, "___tsethi!");
        org.junit.Assert.assertNull(codeGenerator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\\\"_Python3\\\"\"" + "'", str29, "\"\\\"_Python3\\\"\"");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(codeGenerator35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\\\\n" + "'", str38, "\\\\n");
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
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "_Python3Context", true);
        java.lang.String str7 = python3Target1.getListLabel("Python");
        java.util.Set<java.lang.String> strSet8 = python3Target1.getBadWords();
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString(".5.2.Context", true);
        java.lang.String str13 = python3Target1.getImplicitSetLabel("_\"\\\"\\\\\\\\1\\\"\"");
        java.lang.String str15 = python3Target1.getListLabel("\\\\35");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python3Contex\"" + "'", str5, "\"Python3Contex\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python" + "'", str7, "Python");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\".5.2.Context\"" + "'", str11, "\".5.2.Context\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_tset_\"\\\"\\\\\\\\1\\\"\"" + "'", str13, "_tset_\"\\\"\\\\\\\\1\\\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\\\35" + "'", str15, "\\\\35");
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "_Python3Context", true);
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.getTemplates();
        int int7 = python3Target1.getInlineTestSetWordSize();
        boolean boolean8 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python3Contex\"" + "'", str5, "\"Python3Contex\"");
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str9 = python3Target1.encodeIntAsCharEscape((int) (byte) 10);
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("_Python3");
        org.antlr.v4.tool.Grammar grammar12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getTokenTypeAsTargetLabel(grammar12, (int) (byte) 100);
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
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("__tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("\"_Python3\"", true);
        java.util.Set<java.lang.String> strSet14 = python3Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target17 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator16);
        boolean boolean18 = python3Target17.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = python3Target17.getCodeGenerator();
        java.lang.String str22 = python3Target17.getTargetStringLiteralFromString("\\n", false);
        org.antlr.v4.tool.Grammar grammar23 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target25 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator24);
        boolean boolean26 = python3Target25.wantsBaseListener();
        java.util.Set<java.lang.String> strSet27 = python3Target25.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup28 = python3Target25.getTemplates();
        java.lang.String str30 = python3Target25.getImplicitRuleLabel("\"\\\\1\"");
        org.antlr.v4.tool.Grammar grammar31 = null;
        int[] intArray32 = new int[] {};
        java.lang.String[] strArray33 = python3Target25.getTokenTypesAsTargetLabels(grammar31, intArray32);
        java.lang.String[] strArray34 = python3Target17.getTokenTypesAsTargetLabels(grammar23, intArray32);
        java.lang.String[] strArray35 = python3Target1.getTokenTypesAsTargetLabels(grammar15, intArray32);
        java.lang.String str37 = python3Target1.encodeIntAsCharEscape((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "___tsethi!" + "'", str8, "___tsethi!");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"_Python3\\\"\"" + "'", str13, "\"\\\"_Python3\\\"\"");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(codeGenerator19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\\\\n" + "'", str22, "\\\\n");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(sTGroup28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "_\"\\\\1\"" + "'", str30, "_\"\\\\1\"");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[]");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\\n" + "'", str37, "\\n");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("Python3");
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.getTemplates();
        java.lang.String str12 = python3Target1.getImplicitSetLabel("PythonContext");
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("_\"___tsethi!\"");
        java.lang.String str16 = python3Target1.getImplicitSetLabel("\"4.5.2.1\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python3Target1.getElementName("\"_tset_Python3\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_Python3" + "'", str9, "_Python3");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsetPythonContext" + "'", str12, "_tsetPythonContext");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"_\\\"___tsethi!\\\"\"" + "'", str14, "\"_\\\"___tsethi!\\\"\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_tset\"4.5.2.1\"" + "'", str16, "_tset\"4.5.2.1\"");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "_Python3Context", true);
        java.lang.String str9 = python3Target1.getListLabel("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target1.getCodeGenerator();
        java.lang.String str12 = python3Target1.getAltLabelContextStructName("_tset_Python3");
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"Python3Contex\"" + "'", str7, "\"Python3Contex\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_Python3Context" + "'", str12, "_tset_Python3Context");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\"" + "'", str15, "\"\"");
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        int int6 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python3Target1.getListLabel("_i");
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 29 + "'", int6 == 29);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_i" + "'", str8, "_i");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target1.getCodeGenerator();
        int int5 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean6 = python3Target1.templatesExist();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("\"tseth\"");
        org.antlr.v4.tool.Grammar grammar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getTokenTypeAsTargetLabel(grammar9, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 29 + "'", int5 == 29);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"tseth\"Context" + "'", str8, "\"tseth\"Context");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("__tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        boolean boolean10 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getRuleFunctionContextStructName(ruleFunction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "___tsethi!" + "'", str8, "___tsethi!");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
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
        java.lang.String str13 = python3Target1.getImplicitSetLabel("\\\\n");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getImplicitTokenLabel("Python3");
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
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_tset\\\\n" + "'", str13, "_tset\\\\n");
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
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
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("_\"_Python3\"");
        java.lang.String str17 = python3Target1.getAltLabelContextStructName("\"hi!\"ContextContext");
        int int18 = python3Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python3Target1.getElementListName("_\\\"_Python3\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"_\\\"_Python3\\\"\"" + "'", str15, "\"_\\\"_Python3\\\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"hi!\"ContextContextContext" + "'", str17, "\"hi!\"ContextContextContext");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.getCodeGenerator();
        boolean boolean8 = python3Target1.templatesExist();
        java.lang.String str10 = python3Target1.getImplicitRuleLabel("\"hi!\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getElementListName("\"\\\"Python3Contex\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_\"hi!\"" + "'", str10, "_\"hi!\"");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        boolean boolean7 = python3Target1.wantsBaseVisitor();
        int int8 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet9 = python3Target1.getBadWords();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "Python3", true);
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromString("\"_tset_Python3\"", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getElementListName("\"Python3\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"ython\"" + "'", str9, "\"ython\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"_tset_Python3\\\"\"" + "'", str12, "\"\\\"_tset_Python3\\\"\"");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "_Python3Context", true);
        java.lang.String str7 = python3Target1.getListLabel("Python");
        boolean boolean8 = python3Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python3Contex\"" + "'", str5, "\"Python3Contex\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python" + "'", str7, "Python");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(sTGroup9);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        boolean boolean4 = python3Target1.wantsBaseVisitor();
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target1.getCodeGenerator();
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape((int) (short) 10);
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        java.lang.String str7 = python3Target1.getLanguage();
        java.lang.String str9 = python3Target1.getListLabel("\\\\n");
        java.lang.String str11 = python3Target1.encodeIntAsCharEscape((int) (short) 10);
        boolean boolean12 = python3Target1.wantsBaseVisitor();
        java.lang.String str14 = python3Target1.encodeIntAsCharEscape((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\n" + "'", str5, "\\n");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\\\n" + "'", str9, "\\\\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\n" + "'", str11, "\\n");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\0" + "'", str14, "\\0");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_Python3", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target1.getCodeGenerator();
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\"\"", true);
        int int15 = python3Target1.getInlineTestSetWordSize();
        int int16 = python3Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup17 = python3Target1.getTemplates();
        java.lang.String str19 = python3Target1.getAltLabelContextStructName("_tset__Python3");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python3Target1.getImplicitTokenLabel("\"_tset\\\"_tsethi\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"\\\"\"" + "'", str14, "\"\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_tset__Python3Context" + "'", str19, "_tset__Python3Context");
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target1.getCodeGenerator();
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape((int) (short) 10);
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        java.lang.String str7 = python3Target1.getLanguage();
        java.lang.String str9 = python3Target1.getListLabel("\\\\n");
        java.lang.String str11 = python3Target1.encodeIntAsCharEscape(100);
        java.lang.String str13 = python3Target1.encodeIntAsCharEscape((int) '#');
        boolean boolean14 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\n" + "'", str5, "\\n");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\\\n" + "'", str9, "\\\\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d" + "'", str11, "d");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#" + "'", str13, "#");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.wantsBaseListener();
        java.lang.String str6 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getImplicitRuleLabel("\"_Python3\"");
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_\"_Python3\"" + "'", str7, "_\"_Python3\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
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
        java.lang.String str16 = python3Target1.getVersion();
        java.lang.String str18 = python3Target1.getListLabel("\\\"\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\1Context\\\\\\\"\\\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Python3\"" + "'", str10, "\"Python3\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsethi!" + "'", str12, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"Python3Contex\\\"\"" + "'", str14, "\"\\\"Python3Contex\\\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python3" + "'", str15, "Python3");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "4.5.2.1" + "'", str16, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\\\"\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\1Context\\\\\\\"\\\"" + "'", str18, "\\\"\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\1Context\\\\\\\"\\\"");
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
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
        java.lang.String str16 = python3Target1.getVersion();
        int int17 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target1.getRuleFunctionContextStructName(ruleFunction18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python3" + "'", str14, "Python3");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "4.5.2.1" + "'", str16, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 29 + "'", int17 == 29);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
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
        boolean boolean15 = python3Target1.wantsBaseListener();
        java.lang.String str17 = python3Target1.getAltLabelContextStructName("\"\"Context");
        int int18 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Rule rule19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python3Target1.getRuleFunctionContextStructName(rule19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python3" + "'", str14, "Python3");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"ContextContext" + "'", str17, "\"\"ContextContext");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 29 + "'", int18 == 29);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getAltLabelContextStructName("_Python3");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "__tsethi!", false);
        boolean boolean9 = python3Target1.wantsBaseListener();
        int int10 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str12 = python3Target1.getImplicitRuleLabel("_hi!Context");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "__hi!Context" + "'", str12, "__hi!Context");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        boolean boolean8 = python3Target1.templatesExist();
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "_\\\"hi!\\\"", false);
        java.lang.String str16 = python3Target1.getImplicitSetLabel("__Python3");
        java.lang.String str18 = python3Target1.getImplicitSetLabel("\\\"___tsethi!");
        java.lang.String str20 = python3Target1.getListLabel("\\0");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = python3Target1.getElementListName("_\"Python3\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"hi!\"" + "'", str10, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\\"hi!\\\"" + "'", str14, "\\\"hi!\\\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_tset__Python3" + "'", str16, "_tset__Python3");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset\\\"___tsethi!" + "'", str18, "_tset\\\"___tsethi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\\0" + "'", str20, "\\0");
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
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
        int int19 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str22 = python3Target1.getTargetStringLiteralFromString("", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        java.lang.String str26 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator23, "\"_\\\"\\\\\\\"Python3Contex\\\\\\\"\\\"\"", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_Python3" + "'", str9, "_Python3");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3" + "'", str13, "3");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_\"hi!\"" + "'", str15, "_\"hi!\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\\\"Python3Context\\\"\"" + "'", str18, "\"\\\"Python3Context\\\"\"");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 64 + "'", int19 == 64);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "_\\\"\\\\\\\"Python3Contex\\\\\\\"\\\"" + "'", str26, "_\\\"\\\\\\\"Python3Contex\\\\\\\"\\\"");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str4 = python3Target1.getTargetStringLiteralFromString("", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getListLabel("__Python3ContextContext");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getImplicitTokenLabel("_tset_\"4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "__Python3ContextContext" + "'", str7, "__Python3ContextContext");
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
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
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromString("\"hi!\"ContextContext", false);
        java.lang.String str19 = python3Target1.getTargetStringLiteralFromString("\"\\\"\\\\\\\"Python3Contex\\\\\\\"\\\"\"", false);
        org.antlr.v4.tool.Rule rule20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python3Target1.getRuleFunctionContextStructName(rule20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\\\"hi!\\\"ContextContext" + "'", str16, "\\\"hi!\\\"ContextContext");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\\\"\\\\\\\"\\\\\\\\\\\\\\\"Python3Contex\\\\\\\\\\\\\\\"\\\\\\\"\\\"" + "'", str19, "\\\"\\\\\\\"\\\\\\\\\\\\\\\"Python3Contex\\\\\\\\\\\\\\\"\\\\\\\"\\\"");
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        boolean boolean8 = python3Target1.templatesExist();
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("hi!");
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "_\"hi!\"", false);
        boolean boolean16 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"hi!\"" + "'", str10, "\"hi!\"");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\\"hi!" + "'", str15, "\\\"hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_Python3", false);
        java.lang.String str12 = python3Target1.getAltLabelContextStructName("\"hi!\"Context");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getElementListName("_tset_Python3Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"ContextContext" + "'", str12, "\"hi!\"ContextContext");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.util.Set<java.lang.String> strSet4 = python3Target1.getBadWords();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        int int6 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet7 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        int int9 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getLoopCounter(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        boolean boolean6 = python3Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator8);
        boolean boolean10 = python3Target9.wantsBaseListener();
        java.util.Set<java.lang.String> strSet11 = python3Target9.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target9.getTemplates();
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target15 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator14);
        boolean boolean16 = python3Target15.wantsBaseListener();
        boolean boolean17 = python3Target15.templatesExist();
        java.lang.String str18 = python3Target15.getVersion();
        java.lang.String str20 = python3Target15.getImplicitSetLabel("_tsethi!");
        java.lang.String str21 = python3Target15.getVersion();
        java.util.Set<java.lang.String> strSet22 = python3Target15.getBadWords();
        java.lang.String str23 = python3Target15.getVersion();
        java.lang.String str25 = python3Target15.getListLabel("_tset");
        org.antlr.v4.tool.Grammar grammar26 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target28 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator27);
        boolean boolean29 = python3Target28.wantsBaseListener();
        java.lang.String str31 = python3Target28.getAltLabelContextStructName("_Python3");
        java.lang.String str33 = python3Target28.getImplicitSetLabel("i");
        org.antlr.v4.tool.Grammar grammar34 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target36 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator35);
        boolean boolean37 = python3Target36.wantsBaseListener();
        java.lang.String str39 = python3Target36.getListLabel("");
        java.lang.String str40 = python3Target36.getLanguage();
        java.lang.String str42 = python3Target36.encodeIntAsCharEscape((int) '#');
        org.antlr.v4.tool.Grammar grammar43 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator44 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target45 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator44);
        boolean boolean46 = python3Target45.wantsBaseListener();
        java.util.Set<java.lang.String> strSet47 = python3Target45.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup48 = python3Target45.getTemplates();
        java.lang.String str50 = python3Target45.getImplicitRuleLabel("\"\\\\1\"");
        org.antlr.v4.tool.Grammar grammar51 = null;
        int[] intArray52 = new int[] {};
        java.lang.String[] strArray53 = python3Target45.getTokenTypesAsTargetLabels(grammar51, intArray52);
        java.lang.String[] strArray54 = python3Target36.getTokenTypesAsTargetLabels(grammar43, intArray52);
        java.lang.String[] strArray55 = python3Target28.getTokenTypesAsTargetLabels(grammar34, intArray52);
        java.lang.String[] strArray56 = python3Target15.getTokenTypesAsTargetLabels(grammar26, intArray52);
        java.lang.String[] strArray57 = python3Target9.getTokenTypesAsTargetLabels(grammar13, intArray52);
        java.lang.String[] strArray58 = python3Target1.getTokenTypesAsTargetLabels(grammar7, intArray52);
        org.antlr.v4.tool.Rule rule59 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str60 = python3Target1.getRuleFunctionContextStructName(rule59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "_tset_tsethi!" + "'", str20, "_tset_tsethi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4.5.2.1" + "'", str21, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "4.5.2.1" + "'", str23, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "_tset" + "'", str25, "_tset");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "_Python3Context" + "'", str31, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "_tseti" + "'", str33, "_tseti");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Python3" + "'", str40, "Python3");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "#" + "'", str42, "#");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertNotNull(sTGroup48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "_\"\\\\1\"" + "'", str50, "_\"\\\\1\"");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[]");
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(strArray58);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape((int) (short) 1);
        boolean boolean6 = python3Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getElementName("\"_tset_i\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\1" + "'", str5, "\\1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        boolean boolean4 = python3Target1.wantsBaseListener();
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("_\\\"_Python3\\\"Context");
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_\\\"_Python3\\\"ContextContext" + "'", str6, "_\\\"_Python3\\\"ContextContext");
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        java.lang.String str20 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator17, "6", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Python3\"" + "'", str10, "\"Python3\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsethi!" + "'", str12, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"Python3Contex\\\"\"" + "'", str14, "\"\\\"Python3Contex\\\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python3" + "'", str15, "Python3");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 29 + "'", int16 == 29);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\"" + "'", str20, "\"\"");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.getImplicitRuleLabel("\"_Python3\"");
        java.lang.String str8 = python3Target1.getLanguage();
        boolean boolean9 = python3Target1.wantsBaseListener();
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("_tsethi!");
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("\"_ \"");
        java.lang.String str15 = python3Target1.encodeIntAsCharEscape(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_\"_Python3\"" + "'", str7, "_\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python3" + "'", str8, "Python3");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"_tsethi!\"" + "'", str11, "\"_tsethi!\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"_ \\\"\"" + "'", str13, "\"\\\"_ \\\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\0" + "'", str15, "\\0");
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.util.Set<java.lang.String> strSet4 = python3Target1.getBadWords();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        int int6 = python3Target1.getInlineTestSetWordSize();
        boolean boolean7 = python3Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getElementName("\"_tset\\\\\\\"ython\\\\\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getImplicitRuleLabel("\"\\\"Python3Contex\\\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.wantsBaseListener();
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("\"__hi!Context\"");
        java.lang.String str12 = python3Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_\"\\\"Python3Contex\\\"\"" + "'", str7, "_\"\\\"Python3Contex\\\"\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"__hi!Context\\\"\"" + "'", str11, "\"\\\"__hi!Context\\\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Python3" + "'", str12, "Python3");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_Python3", false);
        java.util.Set<java.lang.String> strSet11 = python3Target1.getBadWords();
        boolean boolean12 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "\\\"\\\\\\\\1\\\"", true);
        boolean boolean17 = python3Target1.templatesExist();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str16, "\"\\\"\\\\\\\\1\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.util.Set<java.lang.String> strSet4 = python3Target1.getBadWords();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        int int6 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python3Target1.getImplicitSetLabel("_tset_Python3");
        boolean boolean9 = python3Target1.templatesExist();
        java.lang.String str11 = python3Target1.getImplicitSetLabel("\"Python3Contex\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getElementListName("_tset__Python3");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset_tset_Python3" + "'", str8, "_tset_tset_Python3");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset\"Python3Contex\"" + "'", str11, "_tset\"Python3Contex\"");
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getAltLabelContextStructName("_Python3");
        java.lang.String str6 = python3Target1.getListLabel("\"\\\\1\"");
        boolean boolean7 = python3Target1.templatesExist();
        java.lang.String str9 = python3Target1.getListLabel("\"\\\"\\\\\"");
        java.lang.String str11 = python3Target1.getListLabel("__hi!");
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getLoopCounter(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\\1\"" + "'", str6, "\"\\\\1\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"\\\\\"" + "'", str9, "\"\\\"\\\\\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "__hi!" + "'", str11, "__hi!");
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("__tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        java.lang.String str10 = python3Target1.getLanguage();
        java.lang.String str12 = python3Target1.encodeIntAsCharEscape(1);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getRuleFunctionContextStructName(ruleFunction13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "___tsethi!" + "'", str8, "___tsethi!");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python3" + "'", str10, "Python3");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\1" + "'", str12, "\\1");
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
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
        int int16 = python3Target1.getSerializedATNSegmentLimit();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 29 + "'", int16 == 29);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python3Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_Python3" + "'", str9, "_Python3");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsetPythonContext" + "'", str12, "_tsetPythonContext");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python3" + "'", str13, "Python3");
        org.junit.Assert.assertNull(codeGenerator14);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getAltLabelContextStructName("_Python3");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "__tsethi!", false);
        java.lang.String str9 = python3Target1.getVersion();
        java.lang.String str10 = python3Target1.getVersion();
        boolean boolean11 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
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
        int int16 = python3Target1.getSerializedATNSegmentLimit();
        java.util.Set<java.lang.String> strSet17 = python3Target1.getBadWords();
        java.lang.String str19 = python3Target1.getTargetStringLiteralFromString("_tset\"_tset\\\"_tsethi\\\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29 + "'", int13 == 29);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"hi!\"Context" + "'", str15, "\"hi!\"Context");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 29 + "'", int16 == 29);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"_tset\\\"_tset\\\\\\\"_tsethi\\\\\\\"\\\"Context\"" + "'", str19, "\"_tset\\\"_tset\\\\\\\"_tsethi\\\\\\\"\\\"Context\"");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        int int5 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet7 = python3Target1.getBadWords();
        int int8 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
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
        java.util.Set<java.lang.String> strSet23 = python3Target1.getBadWords();
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
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.wantsBaseListener();
        int int6 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("_tsethi!", true);
        java.lang.String str10 = python3Target1.getVersion();
        int int11 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 29 + "'", int6 == 29);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"_tsethi!\"" + "'", str9, "\"_tsethi!\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        java.lang.String str5 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getLanguage();
        boolean boolean8 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\\\"\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\1Context\\\\\\\"\\\"", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\\"\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\1Context\\\\\\\"\\\"" + "'", str12, "\\\"\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\1Context\\\\\\\"\\\"");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("Python3", true);
        java.lang.String str12 = python3Target1.getImplicitSetLabel("hi!");
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\"Python3Contex\"");
        boolean boolean15 = python3Target1.supportsOverloadedMethods();
        int int16 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str18 = python3Target1.getImplicitSetLabel("_\\1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Python3\"" + "'", str10, "\"Python3\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsethi!" + "'", str12, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"Python3Contex\\\"\"" + "'", str14, "\"\\\"Python3Contex\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 29 + "'", int16 == 29);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset_\\1" + "'", str18, "_tset_\\1");
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str9 = python3Target1.encodeIntAsCharEscape((int) (byte) 10);
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("_Python3");
        java.lang.String str13 = python3Target1.getAltLabelContextStructName("Python3");
        java.lang.String str14 = python3Target1.getVersion();
        int int15 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\n" + "'", str9, "\\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"_Python3\"" + "'", str11, "\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python3Context" + "'", str13, "Python3Context");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        java.lang.String str7 = python3Target1.getImplicitSetLabel("_\\\"__\\\\\\\"___tsethi!\\\\\\\"Context\\\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset_\\\"__\\\\\\\"___tsethi!\\\\\\\"Context\\\"" + "'", str7, "_tset_\\\"__\\\\\\\"___tsethi!\\\\\\\"Context\\\"");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.wantsBaseListener();
        java.lang.String str6 = python3Target1.getVersion();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getRuleFunctionContextStructName(ruleFunction7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("Python3", true);
        java.lang.String str12 = python3Target1.getImplicitSetLabel("hi!");
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\"Python3Contex\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python3Target1.getCodeGenerator();
        java.lang.String str17 = python3Target1.getListLabel("\"4.5.2.1\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target1.getElementName("\"Python\"");
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
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"4.5.2.1\"" + "'", str17, "\"4.5.2.1\"");
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("_\"hi!\"", false);
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.encodeIntAsCharEscape((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_\\\"hi!\\\"" + "'", str8, "_\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d" + "'", str11, "d");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getAltLabelContextStructName("_Python3");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "__tsethi!", false);
        boolean boolean9 = python3Target1.wantsBaseListener();
        int int10 = python3Target1.getSerializedATNSegmentLimit();
        int int11 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29 + "'", int11 == 29);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("Python3");
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "\\35", false);
        boolean boolean14 = python3Target1.templatesExist();
        java.lang.String str15 = python3Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_Python3" + "'", str9, "_Python3");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3" + "'", str13, "3");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python3" + "'", str15, "Python3");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        boolean boolean8 = python3Target1.templatesExist();
        java.lang.String str9 = python3Target1.getLanguage();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\\\\1");
        java.lang.String str13 = python3Target1.getImplicitSetLabel("4.5.2.1");
        java.util.Set<java.lang.String> strSet14 = python3Target1.getBadWords();
        java.lang.String str16 = python3Target1.getAltLabelContextStructName("_tset\\\"\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\1Context\\\\\\\"\\\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python3" + "'", str9, "Python3");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\\\1Context" + "'", str11, "\\\\1Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_tset4.5.2.1" + "'", str13, "_tset4.5.2.1");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_tset\\\"\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\1Context\\\\\\\"\\\"Context" + "'", str16, "_tset\\\"\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\1Context\\\\\\\"\\\"Context");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("Python3");
        boolean boolean10 = python3Target1.wantsBaseListener();
        java.lang.String str12 = python3Target1.getImplicitSetLabel("_\"\\\\1\"");
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\\\"\\\"Context");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_Python3" + "'", str9, "_Python3");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_\"\\\\1\"" + "'", str12, "_tset_\"\\\\1\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\\\\\"\\\\\\\"Context\"" + "'", str14, "\"\\\\\\\"\\\\\\\"Context\"");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "_\"__tset_Python3ContextContext\"", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_" + "'", str8, "_");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\\"__tset_Python3ContextContext" + "'", str13, "\\\"__tset_Python3ContextContext");
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("__tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        java.lang.String str10 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target1.getTemplates();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "___tsethi!" + "'", str8, "___tsethi!");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        int int6 = python3Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getElementName("__\"_Python3\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "_Python3Context", true);
        java.lang.String str9 = python3Target1.encodeIntAsCharEscape((int) '4');
        boolean boolean10 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"Python3Contex\"" + "'", str7, "\"Python3Contex\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\64" + "'", str9, "\\64");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        boolean boolean7 = python3Target1.templatesExist();
        int int8 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_Python3", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target1.getCodeGenerator();
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\"\"", true);
        boolean boolean15 = python3Target1.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.getElementListName("PythonContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"\\\"\"" + "'", str14, "\"\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
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
        java.lang.String str22 = python3Target1.encodeIntAsCharEscape((int) '#');
        int int23 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str25 = python3Target1.getTargetStringLiteralFromString("tset_Python");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = python3Target1.getImplicitTokenLabel("_tset\"ython\"");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "__Python3" + "'", str20, "__Python3");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#" + "'", str22, "#");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 29 + "'", int23 == 29);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"tset_Python\"" + "'", str25, "\"tset_Python\"");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("i");
        java.lang.String str8 = python3Target1.getImplicitSetLabel("__tset_Python3Context");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getElementName("_tset_tset\"\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_i" + "'", str6, "_i");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset__tset_Python3Context" + "'", str8, "_tset__tset_Python3Context");
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        java.lang.String str3 = python3Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_\"hi!\"");
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        java.lang.String str9 = python3Target1.getImplicitSetLabel("_hi!ContextContext");
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python3" + "'", str3, "Python3");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__\"hi!\"" + "'", str6, "__\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset_hi!ContextContext" + "'", str9, "_tset_hi!ContextContext");
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\\\"\\\"Python3Contex\\\"", false);
        java.lang.String str11 = python3Target1.getImplicitRuleLabel("\"\\\"\\\"\"Context");
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\\"\\\"Python3Contex\\\"" + "'", str9, "\\\"\\\"Python3Contex\\\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_\"\\\"\\\"\"Context" + "'", str11, "_\"\\\"\\\"\"Context");
        org.junit.Assert.assertNotNull(sTGroup12);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        boolean boolean7 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "4.5.2.1", false);
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target1.getTemplates();
        java.lang.String str14 = python3Target1.encodeIntAsCharEscape(10);
        boolean boolean15 = python3Target1.templatesExist();
        boolean boolean16 = python3Target1.wantsBaseVisitor();
        java.lang.String str18 = python3Target1.getTargetStringLiteralFromString("\"\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\"\"");
        java.lang.String str21 = python3Target1.getTargetStringLiteralFromString("_tset__\\\\\\\"\\\\\\\\\\\\\\\\1\\\\\\\"ContextContext", true);
        java.lang.Class<?> wildcardClass22 = python3Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".5.2." + "'", str11, ".5.2.");
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\n" + "'", str14, "\\n");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"" + "'", str18, "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"_tset__\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\1\\\\\\\\\\\\\\\"ContextContext\"" + "'", str21, "\"_tset__\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\1\\\\\\\\\\\\\\\"ContextContext\"");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("");
        int int9 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getRuleFunctionContextStructName(ruleFunction10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_" + "'", str8, "_");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
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
        java.lang.String str14 = python3Target1.getAltLabelContextStructName("_Python3Context");
        int int15 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python3Target1.getTokenTypeAsTargetLabel(grammar16, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"hi!\"" + "'", str10, "\"hi!\"");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_Python3ContextContext" + "'", str14, "_Python3ContextContext");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getImplicitTokenLabel("__hi!");
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
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
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
        org.stringtemplate.v4.STGroup sTGroup17 = python3Target1.getTemplates();
        java.lang.String str18 = python3Target1.getLanguage();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"Python3Contex\"" + "'", str7, "\"Python3Contex\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_Python3Context" + "'", str12, "_tset_Python3Context");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "__tset_Python3Context" + "'", str14, "__tset_Python3Context");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python3" + "'", str18, "Python3");
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\"Python3Contex\"");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("_\"___tsethi!\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getLoopCounter(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\"Python3Contex\\\"\"" + "'", str6, "\"\\\"Python3Contex\\\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "__\"___tsethi!\"" + "'", str8, "__\"___tsethi!\"");
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target1.getElementName("_tset_tset\"\\\\\\\"_tsethi\\\\\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("__tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("\"_Python3\"", true);
        java.lang.String str15 = python3Target1.getImplicitRuleLabel("\"_\\\"_Python3\\\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = python3Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python3Target1.getElementName("\"_tset\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\1Context\\\\\\\\\\\\\\\"\\\\\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "___tsethi!" + "'", str8, "___tsethi!");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"_Python3\\\"\"" + "'", str13, "\"\\\"_Python3\\\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_\"_\\\"_Python3\\\"\"" + "'", str15, "_\"_\\\"_Python3\\\"\"");
        org.junit.Assert.assertNull(codeGenerator16);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target1.getCodeGenerator();
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape((int) (short) 10);
        java.lang.String str7 = python3Target1.getListLabel("_\"_tsethi!\"");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getRuleFunctionContextStructName(ruleFunction8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\n" + "'", str5, "\\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_\"_tsethi!\"" + "'", str7, "_\"_tsethi!\"");
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("__tsethi!");
        java.lang.String str9 = python3Target1.getVersion();
        int int10 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "___tsethi!" + "'", str8, "___tsethi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
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
        org.antlr.v4.tool.Rule rule12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getRuleFunctionContextStructName(rule12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python3Context" + "'", str9, "Python3Context");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str9 = python3Target1.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean10 = python3Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\n" + "'", str9, "\\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
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
        int int16 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str19 = python3Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_Python3Context" + "'", str4, "_Python3Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29 + "'", int13 == 29);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"hi!\"Context" + "'", str15, "\"hi!\"Context");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 29 + "'", int16 == 29);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str19, "\"\\\"\\\\\\\\1\\\"\"");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
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
        java.lang.String str22 = python3Target1.getImplicitSetLabel("\\64");
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "_tset\\64" + "'", str22, "_tset\\64");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
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
        java.lang.String str15 = python3Target1.getListLabel("\"_tset\\\"_tsethi\\\"\"Context");
        java.lang.String str17 = python3Target1.getImplicitSetLabel("_\"_tset_i\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_\"4.5.2.1\"" + "'", str13, "_\"4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"_tset\\\"_tsethi\\\"\"Context" + "'", str15, "\"_tset\\\"_tsethi\\\"\"Context");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_tset_\"_tset_i\"" + "'", str17, "_tset_\"_tset_i\"");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_Python3", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target1.getCodeGenerator();
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\"\"", true);
        boolean boolean15 = python3Target1.templatesExist();
        java.util.Set<java.lang.String> strSet16 = python3Target1.getBadWords();
        int int17 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"\\\"\"" + "'", str14, "\"\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
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
        java.lang.String str23 = python3Target1.getAltLabelContextStructName("\"\\\"\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"Context" + "'", str23, "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"Context");
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        int int5 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "hi!", false);
        java.lang.String str12 = python3Target1.getListLabel("\"Python3Contex\"");
        boolean boolean13 = python3Target1.wantsBaseListener();
        boolean boolean14 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Rule rule15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getRuleFunctionContextStructName(rule15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "i" + "'", str10, "i");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"Python3Contex\"" + "'", str12, "\"Python3Contex\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
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
        java.lang.String str22 = python3Target1.encodeIntAsCharEscape((int) '#');
        java.lang.String str23 = python3Target1.getLanguage();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "#" + "'", str22, "#");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Python3" + "'", str23, "Python3");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
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
        java.lang.String str15 = python3Target1.getLanguage();
        java.lang.Class<?> wildcardClass16 = python3Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python3" + "'", str14, "Python3");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python3" + "'", str15, "Python3");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
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
        java.lang.String str26 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator23, "_tset_tset", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST27 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST27);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "__Python3" + "'", str20, "__Python3");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "PythonContextContext" + "'", str22, "PythonContextContext");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"tset_tse\"" + "'", str26, "\"tset_tse\"");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        boolean boolean7 = python3Target1.wantsBaseVisitor();
        java.lang.String str9 = python3Target1.getImplicitSetLabel("_\"_\\\"_Python3\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset_\"_\\\"_Python3\\\"\"" + "'", str9, "_tset_\"_\\\"_Python3\\\"\"");
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.String str7 = python3Target1.encodeIntAsCharEscape(64);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getElementName("seth");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "@" + "'", str7, "@");
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("Python3");
        java.lang.String str11 = python3Target1.getImplicitSetLabel("_Python3");
        boolean boolean12 = python3Target1.templatesExist();
        int int13 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_Python3" + "'", str9, "_Python3");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset_Python3" + "'", str11, "_tset_Python3");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29 + "'", int13 == 29);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseListener();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\\\\1", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "\\\\n", false);
        java.lang.String str11 = python3Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\\\\\\\1" + "'", str6, "\\\\\\\\1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\n" + "'", str10, "\\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python3" + "'", str11, "Python3");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
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
        java.lang.String str20 = python3Target1.getImplicitSetLabel("_tset\"Python3Contex\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Python3\"" + "'", str10, "\"Python3\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsethi!" + "'", str12, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"Python3Contex\\\"\"" + "'", str14, "\"\\\"Python3Contex\\\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"4.5.2.1\"" + "'", str17, "\"4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "_tset_tset\"Python3Contex\"" + "'", str20, "_tset_tset\"Python3Contex\"");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("\"\\\\1\"");
        org.antlr.v4.tool.Grammar grammar7 = null;
        int[] intArray8 = new int[] {};
        java.lang.String[] strArray9 = python3Target1.getTokenTypesAsTargetLabels(grammar7, intArray8);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target1.getCodeGenerator();
        java.lang.String str12 = python3Target1.encodeIntAsCharEscape((int) (short) 100);
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("_tset_\\1", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_\"\\\\1\"" + "'", str6, "_\"\\\\1\"");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "d" + "'", str12, "d");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"_tset_\\\\1\"" + "'", str15, "\"_tset_\\\\1\"");
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        boolean boolean8 = python3Target1.templatesExist();
        java.lang.String str9 = python3Target1.getLanguage();
        java.lang.String str11 = python3Target1.getImplicitRuleLabel("_\"_Python3\"");
        boolean boolean12 = python3Target1.wantsBaseListener();
        java.lang.String str13 = python3Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getElementName("\"__tset_Python3ContextContext\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python3" + "'", str9, "Python3");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "__\"_Python3\"" + "'", str11, "__\"_Python3\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python3" + "'", str13, "Python3");
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
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
        boolean boolean14 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python3" + "'", str9, "Python3");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\n" + "'", str12, "\\n");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        boolean boolean7 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "4.5.2.1", false);
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getElementListName("_tseta");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ".5.2." + "'", str11, ".5.2.");
        org.junit.Assert.assertNotNull(sTGroup12);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getLanguage();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
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
        boolean boolean13 = python3Target1.wantsBaseListener();
        java.lang.String str15 = python3Target1.getListLabel("__\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\n" + "'", str5, "\\n");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\\\n" + "'", str9, "\\\\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\n" + "'", str11, "\\n");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "__\"hi!\"" + "'", str15, "__\"hi!\"");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        boolean boolean8 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
        int int10 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNull(codeGenerator11);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        boolean boolean8 = python3Target1.templatesExist();
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("hi!");
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target1.getTemplates();
        java.lang.String str13 = python3Target1.getImplicitSetLabel("_tset\"___tsethi!\"");
        java.lang.Class<?> wildcardClass14 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"hi!\"" + "'", str10, "\"hi!\"");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_tset_tset\"___tsethi!\"" + "'", str13, "_tset_tset\"___tsethi!\"");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        int int7 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        org.antlr.v4.tool.Grammar grammar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getTokenTypeAsTargetLabel(grammar8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\\n", true);
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"_tset\\\"_tsethi\\\"\"");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"" + "'", str9, "\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"_tset\\\"_tsethi\\\"\"Context" + "'", str11, "\"_tset\\\"_tsethi\\\"\"Context");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_Python3", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target1.getCodeGenerator();
        java.lang.String str13 = python3Target1.getAltLabelContextStructName("Python");
        int int14 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PythonContext" + "'", str13, "PythonContext");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
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
        java.lang.String str15 = python3Target1.getImplicitSetLabel("_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset_tset4.5.2.1" + "'", str15, "_tset_tset4.5.2.1");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        boolean boolean8 = python3Target1.templatesExist();
        java.lang.String str9 = python3Target1.getLanguage();
        boolean boolean10 = python3Target1.wantsBaseVisitor();
        int int11 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str13 = python3Target1.encodeIntAsCharEscape((int) (byte) 0);
        int int14 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python3" + "'", str9, "Python3");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29 + "'", int11 == 29);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\0" + "'", str13, "\\0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        java.lang.String str3 = python3Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_\"hi!\"");
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python3" + "'", str3, "Python3");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__\"hi!\"" + "'", str6, "__\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.getCodeGenerator();
        java.lang.String str9 = python3Target1.getAltLabelContextStructName("Python3");
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromString("_tset_tset", true);
        org.antlr.v4.tool.Grammar grammar13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getTokenTypeAsTargetLabel(grammar13, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python3Context" + "'", str9, "Python3Context");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_tset_tset\"" + "'", str12, "\"_tset_tset\"");
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "tsethi", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_Python3" + "'", str9, "_Python3");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsetPythonContext" + "'", str12, "_tsetPythonContext");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python3" + "'", str13, "Python3");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "seth" + "'", str17, "seth");
        org.junit.Assert.assertNull(codeGenerator18);
        org.junit.Assert.assertNull(codeGenerator19);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("_tsethi", false);
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("\\\"hi!\\\"");
        boolean boolean11 = python3Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "_tseti", false);
        boolean boolean17 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\\\\\"hi!\\\\\\\"\"" + "'", str10, "\"\\\\\\\"hi!\\\\\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "tset" + "'", str16, "tset");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target1.getCodeGenerator();
        int int5 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean6 = python3Target1.templatesExist();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("\"tseth\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getLoopLabel(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 29 + "'", int5 == 29);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"tseth\"Context" + "'", str8, "\"tseth\"Context");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        boolean boolean7 = python3Target1.templatesExist();
        boolean boolean8 = python3Target1.wantsBaseVisitor();
        boolean boolean9 = python3Target1.templatesExist();
        java.lang.String str11 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str13 = python3Target1.encodeIntAsCharEscape(10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\0" + "'", str11, "\\0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\n" + "'", str13, "\\n");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str4 = python3Target1.getTargetStringLiteralFromString("", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getImplicitTokenLabel("\\35");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertNull(codeGenerator5);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
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
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromString("\"hi!\"ContextContext", false);
        java.lang.String str17 = python3Target1.getVersion();
        java.lang.String str19 = python3Target1.encodeIntAsCharEscape(29);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\\\"hi!\\\"ContextContext" + "'", str16, "\\\"hi!\\\"ContextContext");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\\35" + "'", str19, "\\35");
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target1.getCodeGenerator();
        java.lang.String str5 = python3Target1.encodeIntAsCharEscape((int) (short) 10);
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        java.lang.String str7 = python3Target1.getLanguage();
        boolean boolean8 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\n" + "'", str5, "\\n");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
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
        java.lang.String str22 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = python3Target1.getCodeGenerator();
        java.lang.String str26 = python3Target1.getTargetStringLiteralFromString("\\\"hi!\\\"", false);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Python3" + "'", str22, "Python3");
        org.junit.Assert.assertNull(codeGenerator23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\\\\\\\"hi!\\\\\\\"" + "'", str26, "\\\\\\\"hi!\\\\\\\"");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getLanguage();
        boolean boolean12 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_" + "'", str8, "_");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python3" + "'", str11, "Python3");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        boolean boolean8 = python3Target1.templatesExist();
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("hi!");
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "_\"hi!\"", false);
        boolean boolean16 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python3Target1.getLoopCounter(grammarAST17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"hi!\"" + "'", str10, "\"hi!\"");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\\"hi!" + "'", str15, "\\\"hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.wantsBaseVisitor();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        boolean boolean8 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
        int int10 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str12 = python3Target1.getListLabel("\"_\\\"_Python3\\\"\"");
        int int13 = python3Target1.getInlineTestSetWordSize();
        int int14 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getLoopLabel(grammarAST15);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_\\\"_Python3\\\"\"" + "'", str12, "\"_\\\"_Python3\\\"\"");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "_Python3Context", true);
        java.lang.String str9 = python3Target1.getListLabel("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target1.getCodeGenerator();
        java.lang.String str12 = python3Target1.getAltLabelContextStructName("_tset_Python3");
        boolean boolean13 = python3Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "_tset_Python3", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target1.getImplicitTokenLabel("\"\\\"_tset_\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\1\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"Python3Contex\"" + "'", str7, "\"Python3Contex\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_Python3Context" + "'", str12, "_tset_Python3Context");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "tset_Python" + "'", str17, "tset_Python");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_Python3", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target1.getCodeGenerator();
        boolean boolean12 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "", false);
        int int17 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        java.lang.String str21 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator18, "__Python3", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = python3Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = python3Target1.getElementName(".5.2.Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python" + "'", str10, "Python");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"_Python\"" + "'", str21, "\"_Python\"");
        org.junit.Assert.assertNull(codeGenerator22);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
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
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\"_tset\\\"ython\\\"\"", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python3Context" + "'", str9, "Python3Context");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"_tset\\\\\\\"ython\\\\\\\"\\\"\"" + "'", str14, "\"\\\"_tset\\\\\\\"ython\\\\\\\"\\\"\"");
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        boolean boolean3 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.getTemplates();
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("_tsethi", false);
        boolean boolean9 = python3Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi" + "'", str8, "_tsethi");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = python3Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Python3\"" + "'", str10, "\"Python3\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsethi!" + "'", str12, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"Python3Contex\\\"\"" + "'", str14, "\"\\\"Python3Contex\\\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"4.5.2.1\"" + "'", str17, "\"4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python3" + "'", str18, "Python3");
        org.junit.Assert.assertNull(codeGenerator19);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        java.lang.String str4 = python3Target1.getListLabel("");
        boolean boolean5 = python3Target1.wantsBaseListener();
        int int6 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean7 = python3Target1.templatesExist();
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 29 + "'", int6 == 29);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(1);
        java.lang.String str4 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("_tsethi!");
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("__tsethi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("\"_Python3\"", true);
        java.lang.String str15 = python3Target1.getImplicitRuleLabel("\"_\\\"_Python3\\\"\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.getImplicitTokenLabel("\"tseth\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tsethi!" + "'", str6, "__tsethi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "___tsethi!" + "'", str8, "___tsethi!");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"_Python3\\\"\"" + "'", str13, "\"\\\"_Python3\\\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_\"_\\\"_Python3\\\"\"" + "'", str15, "_\"_\\\"_Python3\\\"\"");
    }
}

