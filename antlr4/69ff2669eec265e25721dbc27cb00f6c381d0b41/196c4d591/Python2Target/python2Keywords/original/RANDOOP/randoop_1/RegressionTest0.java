import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.Class<?> wildcardClass2 = python2Target1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python2Target1.getAltLabelContextStructName("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getLoopCounter(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = python2Target1.getElementName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python2Target1.getElementName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getElementName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        java.lang.String str7 = python2Target1.getImplicitSetLabel("hi!");
        org.antlr.v4.tool.Grammar grammar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getTokenTypeAsTargetLabel(grammar8, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tsethi!" + "'", str7, "_tsethi!");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getLoopCounter(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getElementListName("_tsethi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getLoopLabel(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getLoopLabel(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getElementName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.lang.String str3 = python2Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getElementName("_tsethi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getRuleFunctionContextStructName(ruleFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.tool.ast.GrammarAST grammarAST2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python2Target1.getLoopLabel(grammarAST3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getElementListName("4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getElementListName("4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        java.lang.String str7 = python2Target1.getImplicitSetLabel("hi!");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getRuleFunctionContextStructName(ruleFunction8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tsethi!" + "'", str7, "_tsethi!");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        org.antlr.v4.tool.Rule rule5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getRuleFunctionContextStructName(rule5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getTokenTypeAsTargetLabel(grammar3, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target1.getImplicitSetLabel("hi!");
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getLoopCounter(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi!" + "'", str8, "_tsethi!");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Rule rule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getRuleFunctionContextStructName(rule7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getTokenTypeAsTargetLabel(grammar3, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getTokenTypeAsTargetLabel(grammar4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(codeGenerator3);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python2Target1.getImplicitTokenLabel("_4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar5 = null;
        int[] intArray6 = new int[] {};
        java.lang.String[] strArray7 = python2Target1.getTokenTypesAsTargetLabels(grammar5, intArray6);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getRuleFunctionContextStructName(ruleFunction8);
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
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getImplicitTokenLabel("_tsethi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getTokenTypeAsTargetLabel(grammar7, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementName("\\0Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        int[] intArray7 = new int[] { (short) 10, ' ', (byte) 1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = python2Target1.getTokenTypesAsTargetLabels(grammar2, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 32, 1, 1]");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("4.5.2.1");
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getLoopCounter(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_4.5.2.1" + "'", str6, "_4.5.2.1");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("4.5.2.1");
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getTokenTypeAsTargetLabel(grammar10, (int) (short) 0);
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
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getLoopCounter(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertNull(codeGenerator4);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Rule rule6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getRuleFunctionContextStructName(rule6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target1.getImplicitSetLabel("hi!");
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi!" + "'", str8, "_tsethi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementName("\\0Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getImplicitTokenLabel("_tsetContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementListName("\\0Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Rule rule5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getRuleFunctionContextStructName(rule5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getElementListName("d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python2Target1.getImplicitTokenLabel("_tset");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.lang.String str3 = python2Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getElementListName("\"_tsetContext\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
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
        org.antlr.v4.tool.Rule rule30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = python2Target1.getRuleFunctionContextStructName(rule30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
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
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        java.lang.String str4 = python2Target1.getLanguage();
        org.antlr.v4.tool.Grammar grammar5 = null;
        int[] intArray7 = new int[] { (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = python2Target1.getTokenTypesAsTargetLabels(grammar5, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getElementListName("d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("4.5.2.1");
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 0);
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getLoopCounter(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_4.5.2.1" + "'", str6, "_4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\0" + "'", str8, "\\0");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getTokenTypeAsTargetLabel(grammar4, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.templatesExist();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\".5.2.\"", true);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getRuleFunctionContextStructName(ruleFunction10);
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
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean8 = python2Target1.templatesExist();
        boolean boolean9 = python2Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getElementName("\"hi!\"");
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
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        java.lang.String str5 = python2Target1.getListLabel("");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getTokenTypeAsTargetLabel(grammar7, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.lang.String str3 = python2Target1.getVersion();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape(64);
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        java.lang.String str5 = python2Target1.getListLabel("_4.5.2.1");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getElementName("___tset");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_4.5.2.1" + "'", str5, "_4.5.2.1");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.antlr.v4.tool.Rule rule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getRuleFunctionContextStructName(rule7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getElementName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getElementListName("_tset\\0Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python2" + "'", str7, "Python2");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.lang.String str3 = python2Target1.getVersion();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape(64);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getElementName("\"i\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
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
        org.antlr.v4.tool.Rule rule13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getRuleFunctionContextStructName(rule13);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_tset\\0Context" + "'", str12, "_tset_tset\\0Context");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.templatesExist();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python2Target1.getRuleFunctionContextStructName(ruleFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
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
        org.antlr.v4.codegen.model.RuleFunction ruleFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getRuleFunctionContextStructName(ruleFunction13);
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
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getElementName("\"_tset\\\\0Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        int int4 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Rule rule5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getRuleFunctionContextStructName(rule5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        boolean boolean4 = python2Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getTokenTypeAsTargetLabel(grammar5, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", true);
        java.lang.Class<?> wildcardClass6 = python2Target1.getClass();
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python2\"" + "'", str5, "\"Python2\"");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.tool.Rule rule2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = python2Target1.getRuleFunctionContextStructName(rule2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        java.lang.String str6 = python2Target1.getListLabel("Python2");
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getLoopCounter(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getImplicitTokenLabel("@");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target1.getElementListName("\"\\\".5.2.\\\"\"");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"_tsetContext\"" + "'", str14, "\"_tsetContext\"");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getLoopLabel(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertNotNull(sTGroup5);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.lang.String str3 = python2Target1.getVersion();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getLoopCounter(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        boolean boolean4 = python2Target1.templatesExist();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getImplicitTokenLabel("\"_tset\\\\0Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\1" + "'", str6, "\\1");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getImplicitTokenLabel("Python2");
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
        org.junit.Assert.assertNull(codeGenerator11);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.Class<?> wildcardClass7 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getLoopLabel(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.templatesExist();
        boolean boolean7 = python2Target1.wantsBaseVisitor();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\".5.2.\"", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST11);
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
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementName("_4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getLoopLabel(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        int int4 = python2Target1.getInlineTestSetWordSize();
        int int5 = python2Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getImplicitTokenLabel("#");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass5 = strSet4.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("4.5.2.1");
        int int7 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getElementListName("_tset\\0Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_4.5.2.1" + "'", str6, "_4.5.2.1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator8);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST23);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
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
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromString("_4.5.2.1", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target1.getLoopLabel(grammarAST15);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "__hi!" + "'", str11, "__hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_4.5.2.1" + "'", str14, "_4.5.2.1");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean8 = python2Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getElementListName("\"\\\".5.2.\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(sTGroup9);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d" + "'", str7, "d");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_hi!" + "'", str12, "_tset_hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_d" + "'", str14, "_d");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getImplicitTokenLabel("_tsethi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = python2Target1.getElementListName("__tset");
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
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("4.5.2.1");
        int int7 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.encodeIntAsCharEscape(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: 2147483647");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_4.5.2.1" + "'", str6, "_4.5.2.1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator8);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        java.lang.String str6 = python2Target1.getAltLabelContextStructName("___tset");
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getLoopCounter(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "___tsetContext" + "'", str6, "___tsetContext");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("4.5.2.1");
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getRuleFunctionContextStructName(ruleFunction10);
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
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getImplicitTokenLabel("_tset_tset\\0Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python2\"" + "'", str5, "\"Python2\"");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getElementName("\"_tset\\\\0Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getElementListName("\"_tsetContext\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar5 = null;
        int[] intArray6 = new int[] {};
        java.lang.String[] strArray7 = python2Target1.getTokenTypesAsTargetLabels(grammar5, intArray6);
        java.lang.Class<?> wildcardClass8 = intArray6.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = codeGenerator3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(codeGenerator3);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
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
        java.util.Set<java.lang.String> strSet22 = python2Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = python2Target1.getTokenTypeAsTargetLabel(grammar23, (int) (byte) 100);
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
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass6 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.Class<?> wildcardClass7 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("_tset");
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("_tset_hi!");
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getRuleFunctionContextStructName(ruleFunction12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsetContext" + "'", str8, "_tsetContext");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tset_hi!\"" + "'", str10, "\"_tset_hi!\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.templatesExist();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\".5.2.\"", true);
        java.lang.Class<?> wildcardClass10 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\".5.2.\\\"\"" + "'", str9, "\"\\\".5.2.\\\"\"");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getTokenTypeAsTargetLabel(grammar6, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getLoopCounter(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
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
            boolean boolean12 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST11);
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
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getImplicitSetLabel("");
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("_tset");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getElementListName("_tsethi!");
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
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getRuleFunctionContextStructName(ruleFunction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        boolean boolean4 = python2Target1.templatesExist();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        org.antlr.v4.tool.Rule rule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getRuleFunctionContextStructName(rule7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\1" + "'", str6, "\\1");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"i\"");
        org.antlr.v4.tool.Rule rule6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getRuleFunctionContextStructName(rule6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"i\"Context" + "'", str5, "\"i\"Context");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("4.5.2.1");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_4.5.2.1" + "'", str6, "_4.5.2.1");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getElementListName("_hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target1.getListLabel("_4.5.2.1");
        org.antlr.v4.tool.Grammar grammar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getTokenTypeAsTargetLabel(grammar9, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_4.5.2.1" + "'", str8, "_4.5.2.1");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target1.getImplicitRuleLabel("");
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_" + "'", str8, "_");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementName("_tset_tset\\0Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getLoopCounter(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target1.getListLabel("_4.5.2.1");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getElementName("__hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_4.5.2.1" + "'", str8, "_4.5.2.1");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getElementListName("_tset_tset\\0Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getRuleFunctionContextStructName(ruleFunction7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getTokenTypeAsTargetLabel(grammar8, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getRuleFunctionContextStructName(ruleFunction8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getVersion();
        int int8 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python2Target1.getListLabel("Python2");
        java.lang.Class<?> wildcardClass11 = python2Target1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        java.lang.String str6 = python2Target1.getAltLabelContextStructName("___tset");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementListName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "___tsetContext" + "'", str6, "___tsetContext");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        java.lang.String str5 = python2Target1.getListLabel("_4.5.2.1");
        java.lang.String str6 = python2Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getLoopCounter(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_4.5.2.1" + "'", str5, "_4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        java.lang.String str5 = python2Target1.getListLabel("");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getLoopLabel(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("___tset");
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("@");
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "____tset" + "'", str6, "____tset");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"@\"" + "'", str8, "\"@\"");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.lang.String str3 = python2Target1.getVersion();
        java.lang.String str4 = python2Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getLoopCounter(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("_tset");
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getLoopLabel(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsetContext" + "'", str8, "_tsetContext");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        java.lang.String str5 = python2Target1.getListLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_tset\\0Context");
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\"_tset_hi!\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getImplicitTokenLabel("4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_tset\\\\0Context\"" + "'", str8, "\"_tset\\\\0Context\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"_tset_hi!\\\"\"" + "'", str10, "\"\\\"_tset_hi!\\\"\"");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getImplicitTokenLabel("\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertNull(codeGenerator9);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("");
        boolean boolean7 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getTokenTypeAsTargetLabel(grammar8, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_" + "'", str6, "_");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("_tset");
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("_tset_hi!");
        java.lang.String str12 = python2Target1.encodeIntAsCharEscape(100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsetContext" + "'", str8, "_tsetContext");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tset_hi!\"" + "'", str10, "\"_tset_hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "d" + "'", str12, "d");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.templatesExist();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\".5.2.\"", true);
        org.antlr.v4.tool.Grammar grammar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getTokenTypeAsTargetLabel(grammar10, (int) '#');
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
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        boolean boolean3 = python2Target1.wantsBaseListener();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (short) 10);
        java.lang.Class<?> wildcardClass6 = python2Target1.getClass();
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\n" + "'", str5, "\\n");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
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
        int[] intArray15 = new int[] { 2147483647, 64 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray16 = python2Target1.getTokenTypesAsTargetLabels(grammar12, intArray15);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "__hi!" + "'", str11, "__hi!");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[2147483647, 64]");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getTokenTypeAsTargetLabel(grammar7, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("\"@\"");
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2");
        java.lang.String str7 = python2Target1.getAltLabelContextStructName("\\0Context");
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset\"@\"" + "'", str3, "_tset\"@\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python2\"" + "'", str5, "\"Python2\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\0ContextContext" + "'", str7, "\\0ContextContext");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("d", false);
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("_4.5.2.1");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getElementName("i");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "d" + "'", str6, "d");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_4.5.2.1Context" + "'", str8, "_4.5.2.1Context");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!");
        java.lang.String str6 = python2Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getLoopCounter(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"hi!\"" + "'", str5, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        java.lang.String str5 = python2Target1.getListLabel("_4.5.2.1");
        java.lang.String str6 = python2Target1.getLanguage();
        boolean boolean7 = python2Target1.wantsBaseVisitor();
        boolean boolean8 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_4.5.2.1" + "'", str5, "_4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", false);
        java.lang.String str9 = python2Target1.getImplicitSetLabel("\\0Context");
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST11);
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
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        java.lang.String str5 = python2Target1.getListLabel("_4.5.2.1");
        java.lang.String str6 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getTokenTypeAsTargetLabel(grammar9, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_4.5.2.1" + "'", str5, "_4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("4.5.2.1");
        int int7 = python2Target1.getSerializedATNSegmentLimit();
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_4.5.2.1" + "'", str6, "_4.5.2.1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
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
        java.lang.Class<?> wildcardClass30 = strArray29.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        java.lang.String str5 = python2Target1.getListLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean8 = python2Target1.templatesExist();
        boolean boolean9 = python2Target1.templatesExist();
        java.lang.String str11 = python2Target1.getListLabel("\"\\\"_tset_hi!\\\"\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getImplicitTokenLabel("_4.5.2.1");
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
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getImplicitSetLabel("");
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target1.getCodeGenerator();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "__tset" + "'", str10, "__tset");
        org.junit.Assert.assertNull(codeGenerator11);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
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
        org.antlr.v4.codegen.model.RuleFunction ruleFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getRuleFunctionContextStructName(ruleFunction12);
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
        org.junit.Assert.assertNull(codeGenerator11);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getImplicitTokenLabel("_#");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "__hi!" + "'", str11, "__hi!");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
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
        java.lang.String str13 = python2Target1.getListLabel("\".5.2.\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python2Target1.getCodeGenerator();
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
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"i\"" + "'", str11, "\"i\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\".5.2.\"" + "'", str13, "\".5.2.\"");
        org.junit.Assert.assertNull(codeGenerator14);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("hi!");
        java.lang.String str9 = python2Target1.getListLabel("_tset\\0Context");
        java.lang.String str11 = python2Target1.getListLabel("\\1");
        org.antlr.v4.tool.Rule rule12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getRuleFunctionContextStructName(rule12);
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
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getLoopCounter(grammarAST14);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_tset\\0Context" + "'", str12, "_tset_tset\\0Context");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target1.getImplicitRuleLabel("");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getRuleFunctionContextStructName(ruleFunction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_" + "'", str8, "_");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = python2Target1.getElementListName("\\\"@\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", false);
        java.lang.String str9 = python2Target1.getImplicitSetLabel("\\0Context");
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getElementListName("_#");
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
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python2Target1.getCodeGenerator();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\".5.2.\"" + "'", str10, "\".5.2.\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset\\0Context" + "'", str12, "_tset\\0Context");
        org.junit.Assert.assertNull(codeGenerator13);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        java.lang.String str5 = python2Target1.getListLabel("_4.5.2.1");
        java.lang.String str6 = python2Target1.getLanguage();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("\"i\"");
        java.lang.String str9 = python2Target1.getLanguage();
        org.antlr.v4.tool.Grammar grammar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getTokenTypeAsTargetLabel(grammar10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_4.5.2.1" + "'", str5, "_4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"i\\\"\"" + "'", str8, "\"\\\"i\\\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        java.lang.String str5 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getVersion();
        boolean boolean7 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.Rule rule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getRuleFunctionContextStructName(rule8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("hi!");
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape(0);
        java.lang.Class<?> wildcardClass10 = python2Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_hi!" + "'", str7, "_hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\0" + "'", str9, "\\0");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        java.lang.String str5 = python2Target1.getListLabel("_4.5.2.1");
        java.lang.String str6 = python2Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getLoopLabel(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_4.5.2.1" + "'", str5, "_4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementName("_tset\"4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d" + "'", str7, "d");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_tset\\0Context" + "'", str12, "_tset_tset\\0Context");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getLoopCounter(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
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
        org.antlr.v4.codegen.model.RuleFunction ruleFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getRuleFunctionContextStructName(ruleFunction12);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python2" + "'", str11, "Python2");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("_tsethi!");
        java.lang.String str7 = python2Target1.encodeIntAsCharEscape(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getElementListName("_tset\"@\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"_tsethi!\"" + "'", str5, "\"_tsethi!\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\0" + "'", str7, "\\0");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!");
        java.lang.String str6 = python2Target1.getLanguage();
        java.lang.Class<?> wildcardClass7 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"hi!\"" + "'", str5, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("\"@\"");
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getRuleFunctionContextStructName(ruleFunction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset\"@\"" + "'", str3, "_tset\"@\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python2\"" + "'", str5, "\"Python2\"");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("_tsethi!");
        org.antlr.v4.tool.Grammar grammar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getTokenTypeAsTargetLabel(grammar6, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"_tsethi!\"" + "'", str5, "\"_tsethi!\"");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        int int6 = python2Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementListName("Python2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        java.lang.String str5 = python2Target1.getListLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getTokenTypeAsTargetLabel(grammar7, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        java.lang.String str5 = python2Target1.getListLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_tset\\0Context");
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Rule rule10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getRuleFunctionContextStructName(rule10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_tset\\\\0Context\"" + "'", str8, "\"_tset\\\\0Context\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        java.lang.String str7 = python2Target1.getImplicitSetLabel("hi!");
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target1.getTemplates();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tsethi!" + "'", str7, "_tsethi!");
        org.junit.Assert.assertNotNull(sTGroup8);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        boolean boolean3 = python2Target1.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getElementName("_d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getImplicitTokenLabel("_tset_hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        java.lang.String str11 = python2Target1.getImplicitSetLabel("\\0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset\\0" + "'", str11, "_tset\\0");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST18);
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
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        java.lang.String str7 = python2Target1.encodeIntAsCharEscape((int) (short) 100);
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getLoopCounter(grammarAST9);
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
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getImplicitSetLabel("");
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("_tset");
        java.lang.String str11 = python2Target1.getLanguage();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "__tset" + "'", str10, "__tset");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python2" + "'", str11, "Python2");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getImplicitTokenLabel("#");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getTokenTypeAsTargetLabel(grammar7, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        java.lang.String str7 = python2Target1.getImplicitSetLabel("hi!");
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tsethi!" + "'", str7, "_tsethi!");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        int int6 = python2Target1.getInlineTestSetWordSize();
        java.lang.Class<?> wildcardClass7 = python2Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.lang.String str3 = python2Target1.getVersion();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementName("_tset_tset_hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean8 = python2Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        java.lang.String str11 = python2Target1.getImplicitRuleLabel("#");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getImplicitTokenLabel("\"ython\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_#" + "'", str11, "_#");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        java.lang.String str6 = python2Target1.getListLabel("Python2");
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getVersion();
        int int8 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python2Target1.getListLabel("Python2");
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getLoopCounter(grammarAST11);
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
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("_tset");
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("_tset_hi!");
        java.lang.String str11 = python2Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getLoopCounter(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsetContext" + "'", str8, "_tsetContext");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tset_hi!\"" + "'", str10, "\"_tset_hi!\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getRuleFunctionContextStructName(ruleFunction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        java.lang.String str5 = python2Target1.getListLabel("_4.5.2.1");
        java.lang.String str6 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "_tset_tset\\0Context", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getLoopCounter(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_4.5.2.1" + "'", str5, "_4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "tset_tset0Contex" + "'", str12, "tset_tset0Contex");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        java.lang.String str9 = python2Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getImplicitTokenLabel("_\"\\\".5.2.\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
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
        org.antlr.v4.tool.Rule rule13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getRuleFunctionContextStructName(rule13);
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
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        java.lang.String str5 = python2Target1.getListLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_tset\\0Context");
        java.lang.String str9 = python2Target1.getVersion();
        java.lang.String str10 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup11 = python2Target1.getTemplates();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_tset\\\\0Context\"" + "'", str8, "\"_tset\\\\0Context\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertNotNull(sTGroup11);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getVersion();
        int int8 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python2Target1.getListLabel("Python2");
        java.lang.String str11 = python2Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getElementListName("_#");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup12);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str5 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        boolean boolean7 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getLoopLabel(grammarAST16);
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
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean8 = python2Target1.templatesExist();
        boolean boolean9 = python2Target1.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(sTGroup10);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getElementListName("\"__tset\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\".5.2.\"" + "'", str10, "\".5.2.\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset\\0Context" + "'", str12, "_tset\\0Context");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("4.5.2.1");
        int int7 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("\"\\\".5.2.\\\"\"");
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getTokenTypeAsTargetLabel(grammar11, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_4.5.2.1" + "'", str6, "_4.5.2.1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"\\\".5.2.\\\"\"" + "'", str9, "_\"\\\".5.2.\\\"\"");
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("___tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "____tset" + "'", str6, "____tset");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.tool.Grammar grammar6 = null;
        int[] intArray12 = new int[] { (short) 1, 1, '#', 10, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray13 = python2Target1.getTokenTypesAsTargetLabels(grammar6, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"hi!\"" + "'", str5, "\"hi!\"");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 1, 35, 10, 32]");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        java.lang.String str5 = python2Target1.getListLabel("");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.Rule rule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getRuleFunctionContextStructName(rule8);
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
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getImplicitSetLabel("");
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("_tset");
        java.lang.String str11 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "__tset" + "'", str10, "__tset");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python2" + "'", str11, "Python2");
        org.junit.Assert.assertNull(codeGenerator12);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("hi!");
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape(0);
        boolean boolean10 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_hi!" + "'", str7, "_hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\0" + "'", str9, "\\0");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("hi!");
        java.lang.String str9 = python2Target1.getListLabel("_tset\\0Context");
        java.lang.String str11 = python2Target1.getListLabel("\\1");
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getLoopLabel(grammarAST12);
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
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("hi!");
        java.lang.String str9 = python2Target1.getListLabel("_tset\\0Context");
        boolean boolean10 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_hi!" + "'", str7, "_hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset\\0Context" + "'", str9, "_tset\\0Context");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target1.getImplicitSetLabel("hi!");
        boolean boolean9 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getLoopCounter(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi!" + "'", str8, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
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
        java.lang.Class<?> wildcardClass11 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_tsetContext\"" + "'", str8, "\"_tsetContext\"");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getLoopLabel(grammarAST14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\".5.2.\"" + "'", str10, "\".5.2.\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset\\0Context" + "'", str12, "_tset\\0Context");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getElementName("tset0Contex");
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
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target1.getImplicitSetLabel("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getImplicitTokenLabel("__\"__tset\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi!" + "'", str8, "_tsethi!");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!");
        java.lang.String str6 = python2Target1.getLanguage();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"hi!\"" + "'", str5, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
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
            java.lang.String str13 = python2Target1.getLoopCounter(grammarAST12);
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
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getTokenTypeAsTargetLabel(grammar12, (int) 'a');
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
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
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
        org.antlr.v4.tool.Grammar grammar17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python2Target1.getTokenTypeAsTargetLabel(grammar17, 1);
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
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseListener();
        java.lang.String str7 = python2Target1.getLanguage();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python2" + "'", str7, "Python2");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        int int8 = python2Target1.getInlineTestSetWordSize();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getVersion();
        boolean boolean8 = python2Target1.templatesExist();
        org.antlr.v4.tool.Rule rule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getRuleFunctionContextStructName(rule9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
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
        java.lang.Class<?> wildcardClass24 = python2Target1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
        boolean boolean15 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python2Target1.getTokenTypeAsTargetLabel(grammar16, 0);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"_tsetContext\"" + "'", str14, "\"_tsetContext\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(codeGenerator4);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
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
        int int18 = python2Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python2Target1.getImplicitTokenLabel("\\1");
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", true);
        int int6 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python2Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.encodeIntAsCharEscape(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: 2147483647");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python2\"" + "'", str5, "\"Python2\"");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
        org.antlr.v4.tool.Rule rule22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = python2Target1.getRuleFunctionContextStructName(rule22);
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
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
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
        boolean boolean12 = python2Target1.supportsOverloadedMethods();
        java.lang.String str14 = python2Target1.getImplicitRuleLabel("_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d" + "'", str7, "d");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "__hi!" + "'", str11, "__hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "__tsethi!" + "'", str14, "__tsethi!");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementListName("__tset_hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "hi!", false);
        java.lang.String str9 = python2Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getImplicitTokenLabel("_4.5.2.1Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i" + "'", str8, "i");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getLoopLabel(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getLoopLabel(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("4.5.2.1");
        int int7 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getTokenTypeAsTargetLabel(grammar8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_4.5.2.1" + "'", str6, "_4.5.2.1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("hi!");
        java.lang.String str9 = python2Target1.getListLabel("_tset\\0Context");
        boolean boolean10 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getLoopCounter(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_hi!" + "'", str7, "_hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset\\0Context" + "'", str9, "_tset\\0Context");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getTokenTypeAsTargetLabel(grammar3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean8 = python2Target1.templatesExist();
        java.lang.String str9 = python2Target1.getLanguage();
        org.antlr.v4.tool.Grammar grammar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getTokenTypeAsTargetLabel(grammar10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getVersion();
        boolean boolean8 = python2Target1.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getElementName("\".5.2.\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getImplicitTokenLabel("_tset\".5.2.\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("4.5.2.1");
        int int7 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("@");
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getLoopLabel(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_4.5.2.1" + "'", str6, "_4.5.2.1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "@Context" + "'", str10, "@Context");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("4.5.2.1");
        int int7 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        java.lang.String str9 = python2Target1.getLanguage();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getRuleFunctionContextStructName(ruleFunction10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_4.5.2.1" + "'", str6, "_4.5.2.1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("4.5.2.1");
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST10);
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
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
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
        java.util.Set<java.lang.String> strSet22 = python2Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar23 = null;
        int[] intArray24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray25 = python2Target1.getTokenTypesAsTargetLabels(grammar23, intArray24);
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
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str7 = python2Target1.getImplicitSetLabel("\".5.2.\"");
        org.antlr.v4.tool.Grammar grammar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getTokenTypeAsTargetLabel(grammar8, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\".5.2.\"" + "'", str7, "_tset\".5.2.\"");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("Python2");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getRuleFunctionContextStructName(ruleFunction8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"Python2\"" + "'", str6, "\"Python2\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        boolean boolean6 = python2Target1.wantsBaseListener();
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("Python2");
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2Context" + "'", str8, "Python2Context");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("4.5.2.1");
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 0);
        org.antlr.v4.tool.Grammar grammar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getTokenTypeAsTargetLabel(grammar9, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_4.5.2.1" + "'", str6, "_4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\0" + "'", str8, "\\0");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
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
        int int18 = python2Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python2Target1.getImplicitTokenLabel("\\\"@\\\"");
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getVersion();
        int int8 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("hi!");
        int int8 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_hi!" + "'", str7, "_hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("d", false);
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("_4.5.2.1");
        java.lang.String str10 = python2Target1.getListLabel("\"_tsetContext\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "d" + "'", str6, "d");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_4.5.2.1Context" + "'", str8, "_4.5.2.1Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tsetContext\"" + "'", str10, "\"_tsetContext\"");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "_tset_tset_hi!", true);
        java.lang.String str18 = python2Target1.getListLabel("\"\\\"tset_tset0Contex\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\".5.2.\\\"\"" + "'", str10, "\"\\\".5.2.\\\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_tset_hi!\"Context" + "'", str12, "\"_tset_hi!\"Context");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"tset_tset_hi\"" + "'", str16, "\"tset_tset_hi\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\\\"tset_tset0Contex\\\"\"" + "'", str18, "\"\\\"tset_tset0Contex\\\"\"");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
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
        int int18 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python2Target1.getLoopLabel(grammarAST19);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python2Target1.getTokenTypeAsTargetLabel(grammar2, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.templatesExist();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\".5.2.\"", true);
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape(64);
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromString("i", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\".5.2.\\\"\"" + "'", str9, "\"\\\".5.2.\\\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "@" + "'", str11, "@");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "i" + "'", str14, "i");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python2Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getElementName("\\0Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\".5.2.\"" + "'", str10, "\".5.2.\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset\\0Context" + "'", str12, "_tset\\0Context");
        org.junit.Assert.assertNull(codeGenerator13);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean8 = python2Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        java.lang.Class<?> wildcardClass10 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\\64");
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset\\64" + "'", str8, "_tset\\64");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        java.lang.String str6 = python2Target1.getVersion();
        int int7 = python2Target1.getSerializedATNSegmentLimit();
        int int8 = python2Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getElementName("_tset\"\\\"ython\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("___tset");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getRuleFunctionContextStructName(ruleFunction7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "____tset" + "'", str6, "____tset");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("4.5.2.1");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getRuleFunctionContextStructName(ruleFunction7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_4.5.2.1" + "'", str6, "_4.5.2.1");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        java.lang.String str5 = python2Target1.getListLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_tset\\0Context");
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\"_tset_hi!\"");
        java.lang.Class<?> wildcardClass11 = python2Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_tset\\\\0Context\"" + "'", str8, "\"_tset\\\\0Context\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"_tset_hi!\\\"\"" + "'", str10, "\"\\\"_tset_hi!\\\"\"");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator8);
        java.lang.String str11 = python2Target9.getAltLabelContextStructName("\\0");
        boolean boolean12 = python2Target9.wantsBaseListener();
        java.lang.String str14 = python2Target9.getImplicitRuleLabel("___tset");
        java.lang.String str16 = python2Target9.getTargetStringLiteralFromString("@");
        java.util.Set<java.lang.String> strSet17 = python2Target9.getBadWords();
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target20 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator19);
        boolean boolean21 = python2Target20.supportsOverloadedMethods();
        boolean boolean22 = python2Target20.wantsBaseListener();
        boolean boolean23 = python2Target20.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup24 = python2Target20.getTemplates();
        boolean boolean25 = python2Target20.templatesExist();
        java.lang.String str27 = python2Target20.getTargetStringLiteralFromString("_tsetContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator28 = python2Target20.getCodeGenerator();
        boolean boolean29 = python2Target20.templatesExist();
        org.antlr.v4.tool.Grammar grammar30 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target32 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator31);
        boolean boolean33 = python2Target32.supportsOverloadedMethods();
        boolean boolean34 = python2Target32.wantsBaseListener();
        boolean boolean35 = python2Target32.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar36 = null;
        int[] intArray37 = new int[] {};
        java.lang.String[] strArray38 = python2Target32.getTokenTypesAsTargetLabels(grammar36, intArray37);
        org.antlr.v4.codegen.CodeGenerator codeGenerator39 = null;
        java.lang.String str42 = python2Target32.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator39, "hi!", true);
        org.antlr.v4.tool.Grammar grammar43 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator44 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target45 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator44);
        boolean boolean46 = python2Target45.supportsOverloadedMethods();
        boolean boolean47 = python2Target45.wantsBaseListener();
        boolean boolean48 = python2Target45.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar49 = null;
        int[] intArray50 = new int[] {};
        java.lang.String[] strArray51 = python2Target45.getTokenTypesAsTargetLabels(grammar49, intArray50);
        java.lang.String[] strArray52 = python2Target32.getTokenTypesAsTargetLabels(grammar43, intArray50);
        java.lang.String[] strArray53 = python2Target20.getTokenTypesAsTargetLabels(grammar30, intArray50);
        java.lang.String[] strArray54 = python2Target9.getTokenTypesAsTargetLabels(grammar18, intArray50);
        java.lang.String[] strArray55 = python2Target1.getTokenTypesAsTargetLabels(grammar7, intArray50);
        java.lang.String str58 = python2Target1.getTargetStringLiteralFromString("\"__tset\"", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\0Context" + "'", str11, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "____tset" + "'", str14, "____tset");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"@\"" + "'", str16, "\"@\"");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(sTGroup24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"_tsetContext\"" + "'", str27, "\"_tsetContext\"");
        org.junit.Assert.assertNull(codeGenerator28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[]");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\"i\"" + "'", str42, "\"i\"");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[]");
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\\\"__tset\\\"" + "'", str58, "\\\"__tset\\\"");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
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
        org.antlr.v4.tool.Grammar grammar35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = python2Target1.getTokenTypeAsTargetLabel(grammar35, (int) (short) 100);
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
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("Python2");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        boolean boolean8 = python2Target1.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getElementName("_tset\"\\\"ython\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"Python2\"" + "'", str6, "\"Python2\"");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        boolean boolean4 = python2Target1.templatesExist();
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("\"i\"Context", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"i\\\"Context\"" + "'", str8, "\"\\\"i\\\"Context\"");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("_tset_tsetPython2");
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getLoopLabel(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tset_tsetPython2" + "'", str6, "__tset_tsetPython2");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
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
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass13 = strSet12.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"i\"" + "'", str11, "\"i\"");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
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
        java.lang.String str36 = python2Target1.getListLabel("_tset#");
        boolean boolean37 = python2Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = python2Target1.getElementName("a");
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "_tset#" + "'", str36, "_tset#");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", true);
        int int6 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python2Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "__tset_tset\\0Context", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getElementListName("_\"__tset\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python2\"" + "'", str5, "\"Python2\"");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset_tset0Contex" + "'", str11, "_tset_tset0Contex");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        java.lang.String str5 = python2Target1.getListLabel("_4.5.2.1");
        java.lang.String str6 = python2Target1.getLanguage();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("\"i\"");
        java.lang.String str9 = python2Target1.getLanguage();
        int int10 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_4.5.2.1" + "'", str5, "_4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"i\\\"\"" + "'", str8, "\"\\\"i\\\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        java.lang.String str7 = python2Target1.encodeIntAsCharEscape((int) (short) 100);
        java.lang.String str9 = python2Target1.getListLabel("_tset_hi!");
        java.lang.String str11 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d" + "'", str7, "d");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset_hi!" + "'", str9, "_tset_hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset\"4.5.2.1\"" + "'", str11, "_tset\"4.5.2.1\"");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        java.lang.String str6 = python2Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "Python2", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getElementListName("Python2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"ython\"" + "'", str10, "\"ython\"");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getRuleFunctionContextStructName(ruleFunction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.lang.String str5 = python2Target1.getImplicitRuleLabel("__tset");
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("Python2Context");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getRuleFunctionContextStructName(ruleFunction8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "___tset" + "'", str5, "___tset");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_Python2Context" + "'", str7, "_Python2Context");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", false);
        java.lang.String str9 = python2Target1.getImplicitSetLabel("\\0Context");
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        java.util.Set<java.lang.String> strSet11 = python2Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getLoopLabel(grammarAST12);
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
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("4.5.2.1");
        int int7 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("\"\\\".5.2.\\\"\"");
        int int10 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getLoopLabel(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_4.5.2.1" + "'", str6, "_4.5.2.1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"\\\".5.2.\\\"\"" + "'", str9, "_\"\\\".5.2.\\\"\"");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        int int4 = python2Target1.getInlineTestSetWordSize();
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.lang.Class<?> wildcardClass6 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
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
        java.lang.String str31 = python2Target1.encodeIntAsCharEscape((int) (short) 100);
        java.lang.Class<?> wildcardClass32 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "d" + "'", str31, "d");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("_tsethi!");
        java.lang.String str7 = python2Target1.getAltLabelContextStructName("__tset_hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getElementListName("_hi");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"_tsethi!\"" + "'", str5, "\"_tsethi!\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "__tset_hi!Context" + "'", str7, "__tset_hi!Context");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean8 = python2Target1.templatesExist();
        java.lang.String str9 = python2Target1.getLanguage();
        org.antlr.v4.tool.Grammar grammar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getTokenTypeAsTargetLabel(grammar10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        int int3 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str4 = python2Target1.getLanguage();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tsetPython2");
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getLoopCounter(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tsetPython2\"" + "'", str6, "\"_tsetPython2\"");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        java.lang.String str5 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getVersion();
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getImplicitTokenLabel("@");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "__hi!" + "'", str11, "__hi!");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", true);
        boolean boolean6 = python2Target1.templatesExist();
        boolean boolean7 = python2Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target1.getTemplates();
        org.antlr.v4.tool.Rule rule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getRuleFunctionContextStructName(rule9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python2\"" + "'", str5, "\"Python2\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(sTGroup8);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("d", false);
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("_4.5.2.1");
        java.util.Set<java.lang.String> strSet9 = python2Target1.getBadWords();
        java.lang.String str10 = python2Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getElementName("\"a\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "d" + "'", str6, "d");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_4.5.2.1Context" + "'", str8, "_4.5.2.1Context");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("\"@\"");
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2");
        boolean boolean6 = python2Target1.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementName("_tset\".5.2.\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset\"@\"" + "'", str3, "_tset\"@\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python2\"" + "'", str5, "\"Python2\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getElementListName("_tset_tset\\0Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(codeGenerator3);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        java.lang.String str7 = python2Target1.getImplicitSetLabel("hi!");
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        java.lang.String str11 = python2Target1.getAltLabelContextStructName("_4.5.2.1");
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "_", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python2Target1.getImplicitTokenLabel("_tset\"\\\"ython\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tsethi!" + "'", str7, "_tsethi!");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_4.5.2.1Context" + "'", str11, "_4.5.2.1Context");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        int int4 = python2Target1.getInlineTestSetWordSize();
        int int5 = python2Target1.getInlineTestSetWordSize();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getLoopCounter(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.lang.String str3 = python2Target1.getVersion();
        java.lang.String str4 = python2Target1.getVersion();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getRuleFunctionContextStructName(ruleFunction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getImplicitTokenLabel("_tset\"@\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        boolean boolean3 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getLanguage();
        java.lang.String str6 = python2Target1.getAltLabelContextStructName("\"i\"");
        org.antlr.v4.tool.Rule rule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getRuleFunctionContextStructName(rule7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"i\"Context" + "'", str6, "\"i\"Context");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("\"@\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "_4.5.2.1ContextContext", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset\"@\"" + "'", str3, "_tset\"@\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1ContextContex" + "'", str7, "4.5.2.1ContextContex");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        boolean boolean6 = python2Target1.wantsBaseListener();
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("Python2");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getElementListName("____tset");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2Context" + "'", str8, "Python2Context");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        boolean boolean3 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("_tset");
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("_tset_hi!");
        java.lang.String str11 = python2Target1.getVersion();
        boolean boolean12 = python2Target1.templatesExist();
        java.lang.Class<?> wildcardClass13 = python2Target1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsetContext" + "'", str8, "_tsetContext");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tset_hi!\"" + "'", str10, "\"_tset_hi!\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        java.lang.String str5 = python2Target1.getListLabel("");
        boolean boolean6 = python2Target1.wantsBaseListener();
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("\"i\"Context");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getRuleFunctionContextStructName(ruleFunction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"i\"ContextContext" + "'", str8, "\"i\"ContextContext");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("\"@\"");
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2");
        java.lang.String str7 = python2Target1.getAltLabelContextStructName("\\0Context");
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        java.lang.String str10 = python2Target1.getImplicitSetLabel("4.5.2.1ContextContex");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset\"@\"" + "'", str3, "_tset\"@\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python2\"" + "'", str5, "\"Python2\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\0ContextContext" + "'", str7, "\\0ContextContext");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_tset4.5.2.1ContextContex" + "'", str10, "_tset4.5.2.1ContextContex");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("\"@\"");
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2");
        boolean boolean6 = python2Target1.templatesExist();
        boolean boolean7 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass9 = strSet8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset\"@\"" + "'", str3, "_tset\"@\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python2\"" + "'", str5, "\"Python2\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        int int4 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str5 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getElementName("_tset\"_tsetContext\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\0" + "'", str8, "\\0");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.templatesExist();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_tsetContext");
        java.lang.String str9 = python2Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST10);
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
        java.lang.String str36 = python2Target1.getListLabel("_tset#");
        org.antlr.v4.tool.ast.GrammarAST grammarAST37 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST37);
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "_tset#" + "'", str36, "_tset#");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
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
        boolean boolean13 = python2Target1.wantsBaseListener();
        java.lang.String str14 = python2Target1.getLanguage();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        java.lang.String str5 = python2Target1.getListLabel("");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("__tset_tset\\0Context", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"__tset_tset\\\\0Context\"" + "'", str9, "\"__tset_tset\\\\0Context\"");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
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
        org.antlr.v4.tool.Rule rule14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getRuleFunctionContextStructName(rule14);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator13);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        boolean boolean4 = python2Target1.templatesExist();
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        int int6 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getImplicitSetLabel("\\64");
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset\\64" + "'", str8, "_tset\\64");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.lang.String str3 = python2Target1.getVersion();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getTokenTypeAsTargetLabel(grammar6, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("\"_tset_hi!\"");
        java.lang.String str4 = python2Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        java.lang.String str7 = python2Target1.encodeIntAsCharEscape(10);
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\\\"_tset_hi!\\\"\"" + "'", str3, "\"\\\"_tset_hi!\\\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\n" + "'", str7, "\\n");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.Class<?> wildcardClass7 = python2Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("4.5.2.1");
        int int7 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("\"\\\".5.2.\\\"\"");
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_4.5.2.1" + "'", str6, "_4.5.2.1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"\\\".5.2.\\\"\"" + "'", str9, "_\"\\\".5.2.\\\"\"");
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("_tsethi!");
        java.lang.String str7 = python2Target1.encodeIntAsCharEscape(0);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("_tset_tset_hi!", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"_tsethi!\"" + "'", str5, "\"_tsethi!\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\0" + "'", str7, "\\0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tset_tset_hi!\"" + "'", str10, "\"_tset_tset_hi!\"");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("_tset");
        java.lang.String str10 = python2Target1.encodeIntAsCharEscape((int) '#');
        int int11 = python2Target1.getInlineTestSetWordSize();
        boolean boolean12 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsetContext" + "'", str8, "_tsetContext");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#" + "'", str10, "#");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        java.lang.String str5 = python2Target1.getListLabel("");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getImplicitTokenLabel("_tset#");
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
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        boolean boolean3 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getLoopLabel(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        java.lang.String str7 = python2Target1.encodeIntAsCharEscape((int) (short) 100);
        java.lang.String str9 = python2Target1.getListLabel("_tset_hi!");
        java.lang.String str11 = python2Target1.getImplicitSetLabel("\"4.5.2.1\"");
        java.lang.Class<?> wildcardClass12 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d" + "'", str7, "d");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset_hi!" + "'", str9, "_tset_hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset\"4.5.2.1\"" + "'", str11, "_tset\"4.5.2.1\"");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        java.lang.String str6 = python2Target1.getListLabel("Python2");
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        java.lang.String str9 = python2Target1.getImplicitSetLabel("_tset_tset0Contex");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset_tset_tset0Contex" + "'", str9, "_tset_tset_tset0Contex");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.lang.String str6 = python2Target1.getVersion();
        int int7 = python2Target1.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getElementName("_tset4.5.2.1ContextContex");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target1.getTemplates();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getRuleFunctionContextStructName(ruleFunction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup8);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        int int3 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str4 = python2Target1.getLanguage();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tsetPython2");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tsetPython2\"" + "'", str6, "\"_tsetPython2\"");
        org.junit.Assert.assertNull(codeGenerator7);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
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
        java.lang.Class<?> wildcardClass11 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_tsetContext\"" + "'", str8, "\"_tsetContext\"");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("Python2");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"Python2\"" + "'", str6, "\"Python2\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        boolean boolean3 = python2Target1.wantsBaseListener();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (short) 10);
        boolean boolean6 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        boolean boolean8 = python2Target1.wantsBaseVisitor();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\n" + "'", str5, "\\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        int int10 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
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
        java.lang.String str35 = python2Target1.getLanguage();
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Python2" + "'", str35, "Python2");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
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
        boolean boolean13 = python2Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getElementListName("\\\"__tset\\\"");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
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
        java.lang.String str13 = python2Target1.getListLabel("\".5.2.\"");
        java.lang.String str15 = python2Target1.getImplicitSetLabel("____tset");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getElementName("_\"\\\".5.2.\\\"\"");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\".5.2.\"" + "'", str13, "\".5.2.\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset____tset" + "'", str15, "_tset____tset");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", false);
        java.lang.String str9 = python2Target1.getImplicitSetLabel("\\0Context");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getImplicitTokenLabel("__\"_tsethi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset\\0Context" + "'", str9, "_tset\\0Context");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        java.lang.String str6 = python2Target1.getVersion();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(codeGenerator8);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("_tset");
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("_tset_hi!");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getRuleFunctionContextStructName(ruleFunction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsetContext" + "'", str8, "_tsetContext");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tset_hi!\"" + "'", str10, "\"_tset_hi!\"");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getRuleFunctionContextStructName(ruleFunction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
        java.lang.String str13 = python2Target1.getListLabel("\".5.2.\"");
        int int14 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python2Target1.getCodeGenerator();
        java.lang.String str17 = python2Target1.getTargetStringLiteralFromString("\" \"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST18);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\".5.2.\"" + "'", str13, "\".5.2.\"");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\\\" \\\"\"" + "'", str17, "\"\\\" \\\"\"");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        java.lang.String str5 = python2Target1.getListLabel("");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.templatesExist();
        org.antlr.v4.tool.Rule rule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getRuleFunctionContextStructName(rule8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
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
        java.lang.String str13 = python2Target1.getAltLabelContextStructName("___tse");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d" + "'", str7, "d");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "___tseContext" + "'", str13, "___tseContext");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean8 = python2Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"tset_tset0Contex\"", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getElementListName("_tset_tset\\0Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"tset_tset0Contex\\\"\"" + "'", str12, "\"\\\"tset_tset0Contex\\\"\"");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getLoopCounter(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getElementName("_4.5.2.1ContextContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(codeGenerator4);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        boolean boolean3 = python2Target1.wantsBaseListener();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = codeGenerator6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\n" + "'", str5, "\\n");
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        java.lang.String str5 = python2Target1.getListLabel("_4.5.2.1");
        java.lang.String str6 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "_tset_tset\\0Context", false);
        boolean boolean13 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass14 = python2Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_4.5.2.1" + "'", str5, "_4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "tset_tset0Contex" + "'", str12, "tset_tset0Contex");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.templatesExist();
        boolean boolean7 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getRuleFunctionContextStructName(ruleFunction10);
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
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(codeGenerator9);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("_tset");
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("_tset_hi!");
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromString("____tset");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getElementName("\"_d\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsetContext" + "'", str8, "_tsetContext");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tset_hi!\"" + "'", str10, "\"_tset_hi!\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"____tset\"" + "'", str13, "\"____tset\"");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        java.lang.String str5 = python2Target1.getListLabel("_4.5.2.1");
        java.lang.String str6 = python2Target1.getLanguage();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("\"i\"");
        java.lang.String str9 = python2Target1.getLanguage();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getRuleFunctionContextStructName(ruleFunction10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_4.5.2.1" + "'", str5, "_4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"i\\\"\"" + "'", str8, "\"\\\"i\\\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str51 = python2Target1.getElementName("_tset4.5.2.1ContextContex");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        java.lang.String str6 = python2Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getTokenTypeAsTargetLabel(grammar7, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        boolean boolean4 = python2Target1.templatesExist();
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "_d", false);
        boolean boolean10 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getRuleFunctionContextStructName(ruleFunction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
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
        java.lang.String str31 = python2Target1.getTargetStringLiteralFromString("_d");
        org.antlr.v4.tool.ast.GrammarAST grammarAST32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = python2Target1.getLoopCounter(grammarAST32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\"_d\"" + "'", str31, "\"_d\"");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = python2Target1.getElementName("_\"hi!\"");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"\\\"ython\\\"\"" + "'", str25, "\"\\\"ython\\\"\"");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        boolean boolean3 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "\"_tsethi!\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_tsethi!\"" + "'", str7, "\"_tsethi!\"");
        org.junit.Assert.assertNull(codeGenerator8);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target1.getImplicitRuleLabel("_d");
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromString("tset0Contex", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "__d" + "'", str8, "__d");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"tset0Contex\"" + "'", str11, "\"tset0Contex\"");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        java.lang.String str7 = python2Target1.getImplicitSetLabel("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getElementName("_tset__tset_hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tsethi!" + "'", str7, "_tsethi!");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        java.lang.String str5 = python2Target1.getListLabel("_4.5.2.1");
        java.lang.String str6 = python2Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_4.5.2.1" + "'", str5, "_4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("\"_tset_hi!\"");
        java.lang.Class<?> wildcardClass4 = python2Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\\\"_tset_hi!\\\"\"" + "'", str3, "\"\\\"_tset_hi!\\\"\"");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("hi!");
        int int8 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_hi!" + "'", str7, "_hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
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
        int int14 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\".5.2.\"" + "'", str10, "\".5.2.\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset\\0Context" + "'", str12, "_tset\\0Context");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target1.getImplicitSetLabel("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getElementName("__tset_hi!Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi!" + "'", str8, "_tsethi!");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getLanguage();
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python2" + "'", str7, "Python2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\n" + "'", str9, "\\n");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        java.lang.String str5 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.String str8 = python2Target1.getListLabel("hi!");
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getLoopCounter(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
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
        java.lang.Class<?> wildcardClass22 = strArray21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        java.lang.String str5 = python2Target1.getListLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_tset\\0Context");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getRuleFunctionContextStructName(ruleFunction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_tset\\\\0Context\"" + "'", str8, "\"_tset\\\\0Context\"");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "4.5.2.1", true);
        java.lang.String str11 = python2Target1.getVersion();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\".5.2.\"" + "'", str10, "\".5.2.\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        boolean boolean6 = python2Target1.wantsBaseListener();
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("Python2");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getElementName("_tset\\0Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2Context" + "'", str8, "Python2Context");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        boolean boolean4 = python2Target1.templatesExist();
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass7 = python2Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        boolean boolean4 = python2Target1.templatesExist();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        int int7 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\1" + "'", str6, "\\1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("_tset");
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("_tset_hi!");
        java.lang.String str12 = python2Target1.encodeIntAsCharEscape((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsetContext" + "'", str8, "_tsetContext");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tset_hi!\"" + "'", str10, "\"_tset_hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\n" + "'", str12, "\\n");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("");
        java.lang.String str10 = python2Target1.getLanguage();
        java.lang.String str11 = python2Target1.getVersion();
        java.lang.Class<?> wildcardClass12 = python2Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_" + "'", str6, "_");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_" + "'", str9, "_");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        java.lang.String str5 = python2Target1.getListLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getImplicitTokenLabel("\"ython\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("__tset_tsetPython2", true);
        java.lang.String str9 = python2Target1.getAltLabelContextStructName("\"\\\"i\\\"Context\"");
        org.antlr.v4.tool.Rule rule10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getRuleFunctionContextStructName(rule10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"__tset_tsetPython2\"" + "'", str7, "\"__tset_tsetPython2\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"i\\\"Context\"Context" + "'", str9, "\"\\\"i\\\"Context\"Context");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        java.lang.String str10 = python2Target7.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup11 = python2Target7.getTemplates();
        int int12 = python2Target7.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target15 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator14);
        java.lang.String str17 = python2Target15.getAltLabelContextStructName("\\0");
        boolean boolean18 = python2Target15.wantsBaseListener();
        java.lang.String str20 = python2Target15.getImplicitRuleLabel("___tset");
        java.lang.String str22 = python2Target15.getTargetStringLiteralFromString("@");
        java.util.Set<java.lang.String> strSet23 = python2Target15.getBadWords();
        org.antlr.v4.tool.Grammar grammar24 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target26 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator25);
        boolean boolean27 = python2Target26.supportsOverloadedMethods();
        boolean boolean28 = python2Target26.wantsBaseListener();
        boolean boolean29 = python2Target26.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup30 = python2Target26.getTemplates();
        boolean boolean31 = python2Target26.templatesExist();
        java.lang.String str33 = python2Target26.getTargetStringLiteralFromString("_tsetContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = python2Target26.getCodeGenerator();
        boolean boolean35 = python2Target26.templatesExist();
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
        java.lang.String[] strArray59 = python2Target26.getTokenTypesAsTargetLabels(grammar36, intArray56);
        java.lang.String[] strArray60 = python2Target15.getTokenTypesAsTargetLabels(grammar24, intArray56);
        java.lang.String[] strArray61 = python2Target7.getTokenTypesAsTargetLabels(grammar13, intArray56);
        java.lang.String[] strArray62 = python2Target1.getTokenTypesAsTargetLabels(grammar5, intArray56);
        java.lang.Class<?> wildcardClass63 = python2Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\0Context" + "'", str17, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "____tset" + "'", str20, "____tset");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"@\"" + "'", str22, "\"@\"");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(sTGroup30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"_tsetContext\"" + "'", str33, "\"_tsetContext\"");
        org.junit.Assert.assertNull(codeGenerator34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
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
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
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
        java.util.Set<java.lang.String> strSet22 = python2Target1.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = python2Target1.getElementListName("__tset");
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
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
        java.lang.String str14 = python2Target1.getAltLabelContextStructName("\"_tset\\\"\\\\\\\"ython\\\\\\\"\\\"\"");
        org.antlr.v4.tool.Grammar grammar15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getTokenTypeAsTargetLabel(grammar15, (int) (byte) 10);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_tset\\0Context" + "'", str12, "_tset_tset\\0Context");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"_tset\\\"\\\\\\\"ython\\\\\\\"\\\"\"Context" + "'", str14, "\"_tset\\\"\\\\\\\"ython\\\\\\\"\\\"\"Context");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        java.lang.String str9 = python2Target1.getLanguage();
        java.lang.String str11 = python2Target1.getImplicitRuleLabel("\"\\\"____tset\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_\"\\\"____tset\\\"\"" + "'", str11, "_\"\\\"____tset\\\"\"");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getLoopCounter(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        int int6 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getRuleFunctionContextStructName(ruleFunction7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementName("\"_tset\\\"@\\\"Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = python2Target1.getImplicitTokenLabel("__4.5.2.1ContextContext");
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
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        java.lang.String str5 = python2Target1.getListLabel("_4.5.2.1");
        org.antlr.v4.tool.Rule rule6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getRuleFunctionContextStructName(rule6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_4.5.2.1" + "'", str5, "_4.5.2.1");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "_d", false);
        boolean boolean10 = python2Target1.wantsBaseVisitor();
        java.lang.String str12 = python2Target1.encodeIntAsCharEscape(1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\1" + "'", str12, "\\1");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        boolean boolean3 = python2Target1.wantsBaseListener();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (short) 10);
        boolean boolean6 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        boolean boolean8 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet9 = python2Target1.getBadWords();
        int int10 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\n" + "'", str5, "\\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("");
        boolean boolean10 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getLoopCounter(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_" + "'", str6, "_");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_" + "'", str9, "_");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
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
        int int13 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Rule rule14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getRuleFunctionContextStructName(rule14);
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
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("___tset");
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("@");
        java.util.Set<java.lang.String> strSet9 = python2Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target12 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator11);
        boolean boolean13 = python2Target12.supportsOverloadedMethods();
        boolean boolean14 = python2Target12.wantsBaseListener();
        boolean boolean15 = python2Target12.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup16 = python2Target12.getTemplates();
        boolean boolean17 = python2Target12.templatesExist();
        java.lang.String str19 = python2Target12.getTargetStringLiteralFromString("_tsetContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python2Target12.getCodeGenerator();
        boolean boolean21 = python2Target12.templatesExist();
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
        java.lang.String[] strArray45 = python2Target12.getTokenTypesAsTargetLabels(grammar22, intArray42);
        java.lang.String[] strArray46 = python2Target1.getTokenTypesAsTargetLabels(grammar10, intArray42);
        org.antlr.v4.codegen.CodeGenerator codeGenerator47 = python2Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str49 = python2Target1.getElementListName("\" \"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "____tset" + "'", str6, "____tset");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"@\"" + "'", str8, "\"@\"");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(sTGroup16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"_tsetContext\"" + "'", str19, "\"_tsetContext\"");
        org.junit.Assert.assertNull(codeGenerator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
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
        org.junit.Assert.assertNull(codeGenerator47);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.getLanguage();
        java.lang.String str7 = python2Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getLoopCounter(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python2" + "'", str7, "Python2");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        java.lang.String str5 = python2Target1.getListLabel("_4.5.2.1");
        java.lang.String str6 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getLoopLabel(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_4.5.2.1" + "'", str5, "_4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(sTGroup9);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
        boolean boolean14 = python2Target1.wantsBaseListener();
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
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\".5.2.\\\"\"" + "'", str9, "\"\\\".5.2.\\\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\64" + "'", str11, "\\64");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#" + "'", str13, "#");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("hi!");
        java.lang.String str9 = python2Target1.getListLabel("_tset\\0Context");
        boolean boolean10 = python2Target1.wantsBaseVisitor();
        int int11 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Rule rule12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getRuleFunctionContextStructName(rule12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_hi!" + "'", str7, "_hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset\\0Context" + "'", str9, "_tset\\0Context");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("Python2");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"Python2\"" + "'", str6, "\"Python2\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        java.lang.String str5 = python2Target1.getListLabel("_4.5.2.1");
        java.lang.String str6 = python2Target1.getLanguage();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 0);
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getLoopLabel(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_4.5.2.1" + "'", str5, "_4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\0" + "'", str8, "\\0");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
        org.antlr.v4.tool.Rule rule19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python2Target1.getRuleFunctionContextStructName(rule19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
        org.stringtemplate.v4.STGroup sTGroup16 = python2Target1.getTemplates();
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
        org.junit.Assert.assertNotNull(sTGroup16);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("4.5.2.1");
        int int7 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("\"\\\".5.2.\\\"\"");
        int int10 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Rule rule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getRuleFunctionContextStructName(rule11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_4.5.2.1" + "'", str6, "_4.5.2.1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"\\\".5.2.\\\"\"" + "'", str9, "_\"\\\".5.2.\\\"\"");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target1.getImplicitSetLabel("hi!");
        boolean boolean9 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass10 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi!" + "'", str8, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("_tset");
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("_tset_hi!");
        boolean boolean11 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getLoopCounter(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsetContext" + "'", str8, "_tsetContext");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tset_hi!\"" + "'", str10, "\"_tset_hi!\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("\"@\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getLoopCounter(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset\"@\"" + "'", str3, "_tset\"@\"");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.String str8 = python2Target1.getListLabel("_hi");
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("_tset_tset_hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getImplicitTokenLabel("_tset\\0Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_hi" + "'", str8, "_hi");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tset_tset_hi!\"" + "'", str10, "\"_tset_tset_hi!\"");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        boolean boolean4 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getRuleFunctionContextStructName(ruleFunction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        boolean boolean6 = python2Target1.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getImplicitTokenLabel("\\\"tset\\\\\\\"\\\\\\\"ython\\\\\\\"\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar5 = null;
        int[] intArray6 = new int[] {};
        java.lang.String[] strArray7 = python2Target1.getTokenTypesAsTargetLabels(grammar5, intArray6);
        boolean boolean8 = python2Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(sTGroup9);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean8 = python2Target1.templatesExist();
        java.lang.String str9 = python2Target1.getLanguage();
        java.lang.String str10 = python2Target1.getLanguage();
        java.lang.String str12 = python2Target1.getImplicitRuleLabel("_\"\\\"____tset\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "__\"\\\"____tset\\\"\"" + "'", str12, "__\"\\\"____tset\\\"\"");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python2Target1.getLoopLabel(grammarAST17);
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
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getVersion();
        int int8 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python2Target1.getListLabel("Python2");
        java.lang.String str11 = python2Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.getTemplates();
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target15 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator14);
        boolean boolean16 = python2Target15.supportsOverloadedMethods();
        boolean boolean17 = python2Target15.wantsBaseListener();
        boolean boolean18 = python2Target15.wantsBaseVisitor();
        java.lang.String str20 = python2Target15.getImplicitRuleLabel("4.5.2.1");
        java.lang.String str22 = python2Target15.getListLabel("_tset_hi!");
        java.lang.String str24 = python2Target15.getListLabel("");
        org.antlr.v4.tool.Grammar grammar25 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target27 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator26);
        boolean boolean28 = python2Target27.supportsOverloadedMethods();
        boolean boolean29 = python2Target27.wantsBaseListener();
        boolean boolean30 = python2Target27.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar31 = null;
        int[] intArray32 = new int[] {};
        java.lang.String[] strArray33 = python2Target27.getTokenTypesAsTargetLabels(grammar31, intArray32);
        java.lang.String[] strArray34 = python2Target15.getTokenTypesAsTargetLabels(grammar25, intArray32);
        java.lang.String[] strArray35 = python2Target1.getTokenTypesAsTargetLabels(grammar13, intArray32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = python2Target1.getElementName("\"\\\"____tset\\\"\"");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "_4.5.2.1" + "'", str20, "_4.5.2.1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "_tset_hi!" + "'", str22, "_tset_hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[]");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray35);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_tset\\0Context");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getElementName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_tset\\\\0Context\"" + "'", str8, "\"_tset\\\\0Context\"");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        int int5 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str7 = python2Target1.getAltLabelContextStructName("\"_tsethi!\"");
        org.antlr.v4.tool.Rule rule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getRuleFunctionContextStructName(rule8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_tsethi!\"Context" + "'", str7, "\"_tsethi!\"Context");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.encodeIntAsCharEscape((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python2\"" + "'", str5, "\"Python2\"");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        int int4 = python2Target1.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getImplicitTokenLabel("_tset\\0Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(sTGroup5);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.tool.Grammar grammar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getTokenTypeAsTargetLabel(grammar6, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"hi!\"" + "'", str5, "\"hi!\"");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.templatesExist();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\".5.2.\"", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getLoopLabel(grammarAST10);
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
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("");
        boolean boolean7 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_" + "'", str6, "_");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("hi!");
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.Rule rule10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getRuleFunctionContextStructName(rule10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_hi!" + "'", str7, "_hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\0" + "'", str9, "\\0");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("___tset");
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("@");
        java.util.Set<java.lang.String> strSet9 = python2Target1.getBadWords();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\"i\\\"\"", false);
        java.lang.String str14 = python2Target1.getListLabel("___tse");
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target1.getLoopCounter(grammarAST15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "____tset" + "'", str6, "____tset");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"@\"" + "'", str8, "\"@\"");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\\"\\\\\\\"i\\\\\\\"\\\"" + "'", str12, "\\\"\\\\\\\"i\\\\\\\"\\\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "___tse" + "'", str14, "___tse");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("_tset");
        java.lang.String str10 = python2Target1.encodeIntAsCharEscape((int) '#');
        org.antlr.v4.tool.Grammar grammar11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getTokenTypeAsTargetLabel(grammar11, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsetContext" + "'", str8, "_tsetContext");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "#" + "'", str10, "#");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("_tsethi!");
        java.lang.String str7 = python2Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"_tsethi!\"" + "'", str5, "\"_tsethi!\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\0" + "'", str7, "\\0");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("Python2");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getRuleFunctionContextStructName(ruleFunction7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"Python2\"" + "'", str6, "\"Python2\"");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", true);
        int int6 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target9 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator8);
        java.lang.String str12 = python2Target9.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target9.getTemplates();
        int int14 = python2Target9.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target17 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator16);
        java.lang.String str19 = python2Target17.getAltLabelContextStructName("\\0");
        boolean boolean20 = python2Target17.wantsBaseListener();
        java.lang.String str22 = python2Target17.getImplicitRuleLabel("___tset");
        java.lang.String str24 = python2Target17.getTargetStringLiteralFromString("@");
        java.util.Set<java.lang.String> strSet25 = python2Target17.getBadWords();
        org.antlr.v4.tool.Grammar grammar26 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target28 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator27);
        boolean boolean29 = python2Target28.supportsOverloadedMethods();
        boolean boolean30 = python2Target28.wantsBaseListener();
        boolean boolean31 = python2Target28.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup32 = python2Target28.getTemplates();
        boolean boolean33 = python2Target28.templatesExist();
        java.lang.String str35 = python2Target28.getTargetStringLiteralFromString("_tsetContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator36 = python2Target28.getCodeGenerator();
        boolean boolean37 = python2Target28.templatesExist();
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
        java.lang.String[] strArray61 = python2Target28.getTokenTypesAsTargetLabels(grammar38, intArray58);
        java.lang.String[] strArray62 = python2Target17.getTokenTypesAsTargetLabels(grammar26, intArray58);
        java.lang.String[] strArray63 = python2Target9.getTokenTypesAsTargetLabels(grammar15, intArray58);
        java.lang.String[] strArray64 = python2Target1.getTokenTypesAsTargetLabels(grammar7, intArray58);
        java.lang.String str66 = python2Target1.getImplicitSetLabel("\\0Context");
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python2\"" + "'", str5, "\"Python2\"");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\\0Context" + "'", str19, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "____tset" + "'", str22, "____tset");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"@\"" + "'", str24, "\"@\"");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(sTGroup32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\"_tsetContext\"" + "'", str35, "\"_tsetContext\"");
        org.junit.Assert.assertNull(codeGenerator36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
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
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "_tset\\0Context" + "'", str66, "_tset\\0Context");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getElementListName("\"ython\"");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "@" + "'", str11, "@");
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertNotNull(sTGroup6);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", true);
        int int6 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python2Target1.getVersion();
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("\"__tset\"");
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        java.lang.String str12 = python2Target1.getVersion();
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python2\"" + "'", str5, "\"Python2\"");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"__tset\"" + "'", str9, "_\"__tset\"");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str5 = python2Target1.getLanguage();
        boolean boolean6 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getTokenTypeAsTargetLabel(grammar7, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("d", false);
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("_4.5.2.1");
        java.util.Set<java.lang.String> strSet9 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass10 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "d" + "'", str6, "d");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_4.5.2.1Context" + "'", str8, "_4.5.2.1Context");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target1.getImplicitRuleLabel("_tset\\0Context");
        java.lang.String str9 = python2Target1.getLanguage();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "__tset\\0Context" + "'", str8, "__tset\\0Context");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("___tset");
        java.lang.String str8 = python2Target1.getImplicitRuleLabel("_\"_tsethi!\"");
        boolean boolean9 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getLoopLabel(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "____tset" + "'", str6, "____tset");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "__\"_tsethi!\"" + "'", str8, "__\"_tsethi!\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        int int3 = python2Target1.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getElementListName("____tsetContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape(10);
        java.util.Set<java.lang.String> strSet9 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass10 = strSet9.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\n" + "'", str8, "\\n");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target1.getLoopLabel(grammarAST15);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#" + "'", str13, "#");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
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
        java.lang.String str18 = python2Target1.getImplicitSetLabel("\"\\\"ython\\\"\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python2Target1.getLoopCounter(grammarAST19);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset\"\\\"ython\\\"\"" + "'", str18, "_tset\"\\\"ython\\\"\"");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", true);
        int int6 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python2Target1.getVersion();
        boolean boolean8 = python2Target1.templatesExist();
        boolean boolean9 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar11 = null;
        int[] intArray17 = new int[] { 64, 2147483647, 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray18 = python2Target1.getTokenTypesAsTargetLabels(grammar11, intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python2\"" + "'", str5, "\"Python2\"");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[64, 2147483647, 100, 1, 1]");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("_tset_tsetPython2");
        java.lang.String str7 = python2Target1.getLanguage();
        org.antlr.v4.tool.Grammar grammar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getTokenTypeAsTargetLabel(grammar8, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tset_tsetPython2" + "'", str6, "__tset_tsetPython2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python2" + "'", str7, "Python2");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "__tset_tset\\0Context", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getLoopCounter(grammarAST16);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python2" + "'", str11, "Python2");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset_tset0Contex" + "'", str15, "_tset_tset0Contex");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        boolean boolean6 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getLoopLabel(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("_tsethi!");
        java.lang.String str7 = python2Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getRuleFunctionContextStructName(ruleFunction8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"_tsethi!\"" + "'", str5, "\"_tsethi!\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\0" + "'", str7, "\\0");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        boolean boolean4 = python2Target1.templatesExist();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getImplicitTokenLabel("__tset_tset\\0Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\1" + "'", str6, "\\1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        int int4 = python2Target1.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("tset_tset_hi", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"tset_tset_hi\"" + "'", str8, "\"tset_tset_hi\"");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        java.lang.String str5 = python2Target1.getListLabel("");
        boolean boolean6 = python2Target1.wantsBaseListener();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("\"__tset\"");
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"__tset\\\"\"" + "'", str8, "\"\\\"__tset\\\"\"");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("\"@\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "_4.5.2.1ContextContext", false);
        boolean boolean8 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset\"@\"" + "'", str3, "_tset\"@\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1ContextContex" + "'", str7, "4.5.2.1ContextContex");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("Python2");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        boolean boolean8 = python2Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getTokenTypeAsTargetLabel(grammar9, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"Python2\"" + "'", str6, "\"Python2\"");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        java.lang.String str5 = python2Target1.getListLabel("");
        boolean boolean6 = python2Target1.wantsBaseListener();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("\"__tset\"");
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target11 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator10);
        java.lang.String str13 = python2Target11.getAltLabelContextStructName("\\0");
        boolean boolean14 = python2Target11.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python2Target11.getCodeGenerator();
        int int16 = python2Target11.getSerializedATNSegmentLimit();
        java.lang.String str18 = python2Target11.getImplicitRuleLabel("");
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target21 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator20);
        boolean boolean22 = python2Target21.supportsOverloadedMethods();
        boolean boolean23 = python2Target21.wantsBaseListener();
        boolean boolean24 = python2Target21.wantsBaseVisitor();
        boolean boolean25 = python2Target21.supportsOverloadedMethods();
        java.lang.String str27 = python2Target21.encodeIntAsCharEscape((int) (short) 100);
        int int28 = python2Target21.getInlineTestSetWordSize();
        java.lang.String str29 = python2Target21.getLanguage();
        java.lang.String str31 = python2Target21.getImplicitRuleLabel("_hi!");
        org.antlr.v4.tool.Grammar grammar32 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target34 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator33);
        boolean boolean35 = python2Target34.supportsOverloadedMethods();
        boolean boolean36 = python2Target34.wantsBaseListener();
        boolean boolean37 = python2Target34.wantsBaseVisitor();
        boolean boolean38 = python2Target34.supportsOverloadedMethods();
        java.lang.String str40 = python2Target34.encodeIntAsCharEscape((int) (short) 100);
        int int41 = python2Target34.getInlineTestSetWordSize();
        java.lang.String str43 = python2Target34.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar44 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator45 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target46 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator45);
        boolean boolean47 = python2Target46.supportsOverloadedMethods();
        boolean boolean48 = python2Target46.wantsBaseListener();
        boolean boolean49 = python2Target46.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup50 = python2Target46.getTemplates();
        org.antlr.v4.tool.Grammar grammar51 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator52 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target53 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator52);
        boolean boolean54 = python2Target53.supportsOverloadedMethods();
        boolean boolean55 = python2Target53.wantsBaseListener();
        boolean boolean56 = python2Target53.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar57 = null;
        int[] intArray58 = new int[] {};
        java.lang.String[] strArray59 = python2Target53.getTokenTypesAsTargetLabels(grammar57, intArray58);
        org.antlr.v4.codegen.CodeGenerator codeGenerator60 = null;
        java.lang.String str63 = python2Target53.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator60, "hi!", true);
        org.antlr.v4.tool.Grammar grammar64 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator65 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target66 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator65);
        boolean boolean67 = python2Target66.supportsOverloadedMethods();
        boolean boolean68 = python2Target66.wantsBaseListener();
        boolean boolean69 = python2Target66.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar70 = null;
        int[] intArray71 = new int[] {};
        java.lang.String[] strArray72 = python2Target66.getTokenTypesAsTargetLabels(grammar70, intArray71);
        java.lang.String[] strArray73 = python2Target53.getTokenTypesAsTargetLabels(grammar64, intArray71);
        java.lang.String[] strArray74 = python2Target46.getTokenTypesAsTargetLabels(grammar51, intArray71);
        java.lang.String[] strArray75 = python2Target34.getTokenTypesAsTargetLabels(grammar44, intArray71);
        java.lang.String[] strArray76 = python2Target21.getTokenTypesAsTargetLabels(grammar32, intArray71);
        java.lang.String[] strArray77 = python2Target11.getTokenTypesAsTargetLabels(grammar19, intArray71);
        java.lang.String[] strArray78 = python2Target1.getTokenTypesAsTargetLabels(grammar9, intArray71);
        org.stringtemplate.v4.STGroup sTGroup79 = python2Target1.getTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST80 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str81 = python2Target1.getLoopCounter(grammarAST80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"__tset\\\"\"" + "'", str8, "\"\\\"__tset\\\"\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\0Context" + "'", str13, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_" + "'", str18, "_");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "d" + "'", str27, "d");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 64 + "'", int28 == 64);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Python2" + "'", str29, "Python2");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "__hi!" + "'", str31, "__hi!");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "d" + "'", str40, "d");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 64 + "'", int41 == 64);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\\n" + "'", str43, "\\n");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(sTGroup50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[]");
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "\"i\"" + "'", str63, "\"i\"");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[]");
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(sTGroup79);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", true);
        boolean boolean6 = python2Target1.templatesExist();
        boolean boolean7 = python2Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getLoopCounter(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python2\"" + "'", str5, "\"Python2\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target1.getImplicitSetLabel("hi!");
        boolean boolean9 = python2Target1.supportsOverloadedMethods();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean13 = python2Target1.wantsBaseListener();
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsethi!" + "'", str8, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getImplicitSetLabel("");
        java.lang.String str10 = python2Target1.getImplicitRuleLabel("_tset");
        int int11 = python2Target1.getSerializedATNSegmentLimit();
        boolean boolean12 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "__tset" + "'", str10, "__tset");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("\"__tset_tsetPython2\"", false);
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\\"__tset_tsetPython2\\\"" + "'", str6, "\\\"__tset_tsetPython2\\\"");
        org.junit.Assert.assertNotNull(sTGroup7);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        java.lang.String str5 = python2Target1.getListLabel("");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.templatesExist();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getRuleFunctionContextStructName(ruleFunction8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
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
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromString("_4.5.2.1", false);
        java.lang.String str16 = python2Target1.encodeIntAsCharEscape(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python2Target1.getElementListName("\\n");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "__hi!" + "'", str11, "__hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_4.5.2.1" + "'", str14, "_4.5.2.1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\\n" + "'", str16, "\\n");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("4.5.2.1");
        int int7 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("@");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.encodeIntAsCharEscape(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: 2147483647");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_4.5.2.1" + "'", str6, "_4.5.2.1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "@Context" + "'", str10, "@Context");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", false);
        java.lang.String str9 = python2Target1.getImplicitSetLabel("\\0Context");
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        boolean boolean11 = python2Target1.templatesExist();
        org.antlr.v4.tool.Rule rule12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getRuleFunctionContextStructName(rule12);
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
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.templatesExist();
        java.lang.String str4 = python2Target1.getListLabel("_\\64");
        org.antlr.v4.tool.Grammar grammar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getTokenTypeAsTargetLabel(grammar5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_\\64" + "'", str4, "_\\64");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("___tset");
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("@");
        java.util.Set<java.lang.String> strSet9 = python2Target1.getBadWords();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"\\\"i\\\"\"", false);
        java.lang.String str14 = python2Target1.getListLabel("___tse");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target1.getImplicitTokenLabel("_\"_tset_hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "____tset" + "'", str6, "____tset");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"@\"" + "'", str8, "\"@\"");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\\"\\\\\\\"i\\\\\\\"\\\"" + "'", str12, "\\\"\\\\\\\"i\\\\\\\"\\\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "___tse" + "'", str14, "___tse");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
        java.lang.String str51 = python2Target1.getListLabel("");
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
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
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
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromString("tset_tset0Contex");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getElementListName("\"\\\" \\\"\"");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python2" + "'", str11, "Python2");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"tset_tset0Contex\"" + "'", str13, "\"tset_tset0Contex\"");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_tset\\0Context");
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromString("a", true);
        org.antlr.v4.tool.Rule rule12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getRuleFunctionContextStructName(rule12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_tset\\\\0Context\"" + "'", str8, "\"_tset\\\\0Context\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"a\"" + "'", str11, "\"a\"");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        java.lang.String str5 = python2Target1.getListLabel("_4.5.2.1");
        java.lang.String str6 = python2Target1.getLanguage();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("\"i\"");
        java.lang.String str9 = python2Target1.getLanguage();
        int int10 = python2Target1.getSerializedATNSegmentLimit();
        boolean boolean11 = python2Target1.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getElementName("__hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_4.5.2.1" + "'", str5, "_4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"i\\\"\"" + "'", str8, "\"\\\"i\\\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str6 = python2Target1.getImplicitSetLabel("\\\"@\\\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "_tset_tset_hi!", false);
        org.antlr.v4.tool.Rule rule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getRuleFunctionContextStructName(rule11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset\\\"@\\\"" + "'", str6, "_tset\\\"@\\\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "tset_tset_hi" + "'", str10, "tset_tset_hi");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getVersion();
        int int8 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python2Target1.getListLabel("Python2");
        java.lang.String str11 = python2Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.getTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getLoopLabel(grammarAST13);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup12);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
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
        org.antlr.v4.codegen.model.RuleFunction ruleFunction18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python2Target1.getRuleFunctionContextStructName(ruleFunction18);
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
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
        java.lang.String str14 = python2Target1.getAltLabelContextStructName("\"_tset\\\"\\\\\\\"ython\\\\\\\"\\\"\"");
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_tset\\0Context" + "'", str12, "_tset_tset\\0Context");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"_tset\\\"\\\\\\\"ython\\\\\\\"\\\"\"Context" + "'", str14, "\"_tset\\\"\\\\\\\"ython\\\\\\\"\\\"\"Context");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("d", false);
        boolean boolean7 = python2Target1.wantsBaseListener();
        boolean boolean8 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet9 = python2Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "d" + "'", str6, "d");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
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
        java.lang.String str51 = python2Target1.getAltLabelContextStructName("\"\\\".5.2.\\\"\"");
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
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "\"\\\".5.2.\\\"\"Context" + "'", str51, "\"\\\".5.2.\\\"\"Context");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "\"_tset\"", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset\\0Context" + "'", str9, "_tset\\0Context");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"_tset\"" + "'", str16, "\"_tset\"");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        java.lang.String str7 = python2Target1.getImplicitSetLabel("hi!");
        int int8 = python2Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getElementListName("\"_tsethi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tsethi!" + "'", str7, "_tsethi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("hi!");
        java.lang.String str9 = python2Target1.getListLabel("_tset\\0Context");
        boolean boolean10 = python2Target1.wantsBaseVisitor();
        int int11 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getLoopCounter(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_hi!" + "'", str7, "_hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset\\0Context" + "'", str9, "_tset\\0Context");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("\"@\"");
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2");
        java.lang.String str7 = python2Target1.getAltLabelContextStructName("\\0Context");
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset\"@\"" + "'", str3, "_tset\"@\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python2\"" + "'", str5, "\"Python2\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\0ContextContext" + "'", str7, "\\0ContextContext");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("4.5.2.1");
        int int7 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        java.lang.String str9 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "_tset", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getElementListName("_");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_4.5.2.1" + "'", str6, "_4.5.2.1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"tse\"" + "'", str13, "\"tse\"");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        org.antlr.v4.codegen.model.RuleFunction ruleFunction16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getRuleFunctionContextStructName(ruleFunction16);
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
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean8 = python2Target1.templatesExist();
        boolean boolean9 = python2Target1.templatesExist();
        java.lang.String str11 = python2Target1.getListLabel("\"\\\"_tset_hi!\\\"\"");
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromString("_tset\"\\\"ython\\\"\"", true);
        java.lang.String str15 = python2Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target18 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator17);
        java.lang.String str20 = python2Target18.getImplicitSetLabel("hi!");
        java.lang.String str22 = python2Target18.getListLabel("");
        boolean boolean23 = python2Target18.wantsBaseListener();
        java.lang.String str25 = python2Target18.getTargetStringLiteralFromString("\"__tset\"");
        org.antlr.v4.tool.Grammar grammar26 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target28 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator27);
        java.lang.String str30 = python2Target28.getAltLabelContextStructName("\\0");
        boolean boolean31 = python2Target28.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = python2Target28.getCodeGenerator();
        int int33 = python2Target28.getSerializedATNSegmentLimit();
        java.lang.String str35 = python2Target28.getImplicitRuleLabel("");
        org.antlr.v4.tool.Grammar grammar36 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator37 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target38 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator37);
        boolean boolean39 = python2Target38.supportsOverloadedMethods();
        boolean boolean40 = python2Target38.wantsBaseListener();
        boolean boolean41 = python2Target38.wantsBaseVisitor();
        boolean boolean42 = python2Target38.supportsOverloadedMethods();
        java.lang.String str44 = python2Target38.encodeIntAsCharEscape((int) (short) 100);
        int int45 = python2Target38.getInlineTestSetWordSize();
        java.lang.String str46 = python2Target38.getLanguage();
        java.lang.String str48 = python2Target38.getImplicitRuleLabel("_hi!");
        org.antlr.v4.tool.Grammar grammar49 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator50 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target51 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator50);
        boolean boolean52 = python2Target51.supportsOverloadedMethods();
        boolean boolean53 = python2Target51.wantsBaseListener();
        boolean boolean54 = python2Target51.wantsBaseVisitor();
        boolean boolean55 = python2Target51.supportsOverloadedMethods();
        java.lang.String str57 = python2Target51.encodeIntAsCharEscape((int) (short) 100);
        int int58 = python2Target51.getInlineTestSetWordSize();
        java.lang.String str60 = python2Target51.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.Grammar grammar61 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator62 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target63 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator62);
        boolean boolean64 = python2Target63.supportsOverloadedMethods();
        boolean boolean65 = python2Target63.wantsBaseListener();
        boolean boolean66 = python2Target63.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup67 = python2Target63.getTemplates();
        org.antlr.v4.tool.Grammar grammar68 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator69 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target70 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator69);
        boolean boolean71 = python2Target70.supportsOverloadedMethods();
        boolean boolean72 = python2Target70.wantsBaseListener();
        boolean boolean73 = python2Target70.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar74 = null;
        int[] intArray75 = new int[] {};
        java.lang.String[] strArray76 = python2Target70.getTokenTypesAsTargetLabels(grammar74, intArray75);
        org.antlr.v4.codegen.CodeGenerator codeGenerator77 = null;
        java.lang.String str80 = python2Target70.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator77, "hi!", true);
        org.antlr.v4.tool.Grammar grammar81 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator82 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target83 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator82);
        boolean boolean84 = python2Target83.supportsOverloadedMethods();
        boolean boolean85 = python2Target83.wantsBaseListener();
        boolean boolean86 = python2Target83.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar87 = null;
        int[] intArray88 = new int[] {};
        java.lang.String[] strArray89 = python2Target83.getTokenTypesAsTargetLabels(grammar87, intArray88);
        java.lang.String[] strArray90 = python2Target70.getTokenTypesAsTargetLabels(grammar81, intArray88);
        java.lang.String[] strArray91 = python2Target63.getTokenTypesAsTargetLabels(grammar68, intArray88);
        java.lang.String[] strArray92 = python2Target51.getTokenTypesAsTargetLabels(grammar61, intArray88);
        java.lang.String[] strArray93 = python2Target38.getTokenTypesAsTargetLabels(grammar49, intArray88);
        java.lang.String[] strArray94 = python2Target28.getTokenTypesAsTargetLabels(grammar36, intArray88);
        java.lang.String[] strArray95 = python2Target18.getTokenTypesAsTargetLabels(grammar26, intArray88);
        java.lang.String[] strArray96 = python2Target1.getTokenTypesAsTargetLabels(grammar16, intArray88);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"_tset_hi!\\\"\"" + "'", str11, "\"\\\"_tset_hi!\\\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"_tset\\\"\\\\\\\"ython\\\\\\\"\\\"\"" + "'", str14, "\"_tset\\\"\\\\\\\"ython\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4.5.2.1" + "'", str15, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "_tsethi!" + "'", str20, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"\\\"__tset\\\"\"" + "'", str25, "\"\\\"__tset\\\"\"");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\\0Context" + "'", str30, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(codeGenerator32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "_" + "'", str35, "_");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "d" + "'", str44, "d");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 64 + "'", int45 == 64);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Python2" + "'", str46, "Python2");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "__hi!" + "'", str48, "__hi!");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "d" + "'", str57, "d");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 64 + "'", int58 == 64);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "\\n" + "'", str60, "\\n");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(sTGroup67);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(intArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray75), "[]");
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "\"i\"" + "'", str80, "\"i\"");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(intArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray88), "[]");
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertNotNull(strArray94);
        org.junit.Assert.assertNotNull(strArray95);
        org.junit.Assert.assertNotNull(strArray96);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "_d", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getElementName("__\"__tset\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getVersion();
        boolean boolean8 = python2Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        boolean boolean10 = python2Target1.templatesExist();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        java.lang.String str5 = python2Target1.getListLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_tset\\0Context");
        java.lang.String str9 = python2Target1.getVersion();
        java.lang.String str10 = python2Target1.getLanguage();
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("\\1");
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromString("\"_tset_hi!Contex\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_tset\\\\0Context\"" + "'", str8, "\"_tset\\\\0Context\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\1Context" + "'", str12, "\\1Context");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"_tset_hi!Contex\\\"\"" + "'", str14, "\"\\\"_tset_hi!Contex\\\"\"");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        java.lang.Class<?> wildcardClass6 = python2Target1.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_tset\\0Context");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getElementListName("\"\\\"_tset\\\\\\\"\\\\\\\\\\\\\\\"ython\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_tset\\\\0Context\"" + "'", str8, "\"_tset\\\\0Context\"");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
        boolean boolean14 = python2Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target1.getElementListName("\"\\\".5.2.\\\"\"");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"i\"" + "'", str11, "\"i\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"_tsetContext\"" + "'", str14, "\"_tsetContext\"");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("__tset_tsetPython2", true);
        java.lang.String str9 = python2Target1.getAltLabelContextStructName("\"\\\"i\\\"Context\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getElementName("\"\\\"tset_tset0Contex\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"__tset_tsetPython2\"" + "'", str7, "\"__tset_tsetPython2\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"i\\\"Context\"Context" + "'", str9, "\"\\\"i\\\"Context\"Context");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("___tset");
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("@");
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\\\"@\\\"", false);
        org.antlr.v4.tool.Grammar grammar13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getTokenTypeAsTargetLabel(grammar13, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "____tset" + "'", str6, "____tset");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"@\"" + "'", str8, "\"@\"");
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\\\\\\"@\\\\\\\"" + "'", str12, "\\\\\\\"@\\\\\\\"");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str5 = python2Target1.getLanguage();
        java.lang.String str7 = python2Target1.getImplicitSetLabel("\".5.2.\"");
        int int8 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getLoopCounter(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\".5.2.\"" + "'", str7, "_tset\".5.2.\"");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("\\0");
        java.lang.String str5 = python2Target1.getListLabel("_4.5.2.1");
        java.lang.String str6 = python2Target1.getLanguage();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("\"i\"");
        java.lang.String str9 = python2Target1.getLanguage();
        int int10 = python2Target1.getSerializedATNSegmentLimit();
        boolean boolean11 = python2Target1.templatesExist();
        int int12 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Rule rule13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getRuleFunctionContextStructName(rule13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\0Context" + "'", str3, "\\0Context");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_4.5.2.1" + "'", str5, "_4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"i\\\"\"" + "'", str8, "\"\\\"i\\\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        java.lang.String str5 = python2Target1.getImplicitRuleLabel("_tset_tsetPython2");
        boolean boolean6 = python2Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementName("\\64");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "__tset_tsetPython2" + "'", str5, "__tset_tsetPython2");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        java.lang.String str5 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getVersion();
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python2Target1.getCodeGenerator();
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2", true);
        boolean boolean6 = python2Target1.templatesExist();
        boolean boolean7 = python2Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target1.getTemplates();
        boolean boolean9 = python2Target1.templatesExist();
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python2\"" + "'", str5, "\"Python2\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        java.lang.String str5 = python2Target1.getListLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_tset\\0Context");
        java.lang.String str10 = python2Target1.getListLabel("\"_tsethi!\"");
        java.lang.String str11 = python2Target1.getLanguage();
        java.lang.String str12 = python2Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getLoopCounter(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_tset\\\\0Context\"" + "'", str8, "\"_tset\\\\0Context\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tsethi!\"" + "'", str10, "\"_tsethi!\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python2" + "'", str11, "Python2");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Python2" + "'", str12, "Python2");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("_tset");
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("_tset_hi!");
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromString("____tset");
        org.antlr.v4.tool.Grammar grammar14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target1.getTokenTypeAsTargetLabel(grammar14, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsetContext" + "'", str8, "_tsetContext");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tset_hi!\"" + "'", str10, "\"_tset_hi!\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"____tset\"" + "'", str13, "\"____tset\"");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        boolean boolean6 = python2Target1.wantsBaseListener();
        java.lang.String str8 = python2Target1.getListLabel("_tset\\\"@\\\"Context");
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset\\\"@\\\"Context" + "'", str8, "_tset\\\"@\\\"Context");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("");
        java.lang.String str10 = python2Target1.getLanguage();
        boolean boolean11 = python2Target1.wantsBaseVisitor();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_" + "'", str9, "_");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        java.lang.String str5 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getVersion();
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.lang.String str8 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getLoopLabel(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertNotNull(sTGroup9);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.String str8 = python2Target1.getListLabel("\"tset_tset_hi\"");
        java.lang.String str10 = python2Target1.getImplicitSetLabel("__tset_hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getImplicitTokenLabel("_\\\\\\\"\\\\\\\\\\\\\\\".5.2.\\\\\\\\\\\\\\\"\\\\\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"tset_tset_hi\"" + "'", str8, "\"tset_tset_hi\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_tset__tset_hi!" + "'", str10, "_tset__tset_hi!");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        java.lang.String str6 = python2Target1.getVersion();
        int int7 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator8);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target1.getElementName("\"__tset_tset\\\\0Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_4.5.2.1" + "'", str6, "_4.5.2.1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "@Context" + "'", str10, "@Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_\\\"_tsethi!\\\"" + "'", str13, "_\\\"_tsethi!\\\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("Python2");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementName("\"i\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"Python2\"" + "'", str6, "\"Python2\"");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        java.lang.String str18 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator15, "___tsetContext", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python2Target1.getImplicitTokenLabel("_tset\".5.2.\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsetContext" + "'", str8, "_tsetContext");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tset_hi!\"" + "'", str10, "\"_tset_hi!\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"____tset\"" + "'", str13, "\"____tset\"");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"__tsetContex\"" + "'", str18, "\"__tsetContex\"");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str4 = python2Target1.getTargetStringLiteralFromString("", false);
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        java.lang.String str7 = python2Target1.getImplicitSetLabel("hi!");
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getElementListName("__\"_tset_hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tsethi!" + "'", str7, "_tsethi!");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("");
        java.lang.String str10 = python2Target1.getLanguage();
        boolean boolean11 = python2Target1.templatesExist();
        int int12 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str14 = python2Target1.getImplicitSetLabel("\"\\\"_tset\\\\\\\"\\\\\\\\\\\\\\\"ython\\\\\\\\\\\\\\\"\\\\\\\"\\\"Context\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_" + "'", str6, "_");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_" + "'", str9, "_");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset\"\\\"_tset\\\\\\\"\\\\\\\\\\\\\\\"ython\\\\\\\\\\\\\\\"\\\\\\\"\\\"Context\"" + "'", str14, "_tset\"\\\"_tset\\\\\\\"\\\\\\\\\\\\\\\"ython\\\\\\\\\\\\\\\"\\\\\\\"\\\"Context\"");
        org.junit.Assert.assertNull(codeGenerator15);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
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
        java.lang.String str18 = python2Target1.getImplicitRuleLabel("_tset\"4.5.2.1\"");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "__tset\"4.5.2.1\"" + "'", str18, "__tset\"4.5.2.1\"");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("d", false);
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("_4.5.2.1");
        java.lang.String str10 = python2Target1.getListLabel("\"_tsetContext\"");
        org.antlr.v4.tool.Grammar grammar11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getTokenTypeAsTargetLabel(grammar11, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "d" + "'", str6, "d");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_4.5.2.1Context" + "'", str8, "_4.5.2.1Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tsetContext\"" + "'", str10, "\"_tsetContext\"");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.wantsBaseListener();
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        java.lang.String str7 = python2Target1.encodeIntAsCharEscape((int) (short) 100);
        int int8 = python2Target1.getInlineTestSetWordSize();
        int int9 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d" + "'", str7, "d");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        java.lang.String str5 = python2Target1.getListLabel("");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        boolean boolean7 = python2Target1.wantsBaseListener();
        boolean boolean8 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Rule rule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getRuleFunctionContextStructName(rule9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("", false);
        boolean boolean8 = python2Target1.templatesExist();
        boolean boolean9 = python2Target1.templatesExist();
        java.lang.String str10 = python2Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getLoopLabel(grammarAST11);
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python2" + "'", str10, "Python2");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("Python2");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        boolean boolean8 = python2Target1.templatesExist();
        boolean boolean9 = python2Target1.templatesExist();
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
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"Python2\"" + "'", str6, "\"Python2\"");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("d", false);
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("_4.5.2.1");
        java.util.Set<java.lang.String> strSet9 = python2Target1.getBadWords();
        int int10 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromString("_hi", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "d" + "'", str6, "d");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_4.5.2.1Context" + "'", str8, "_4.5.2.1Context");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_hi" + "'", str13, "_hi");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        int int6 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getTokenTypeAsTargetLabel(grammar7, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tsethi!" + "'", str3, "_tsethi!");
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("tset0", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getImplicitTokenLabel("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "tset0" + "'", str8, "tset0");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("\"@\"");
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("Python2");
        boolean boolean6 = python2Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset\"@\"" + "'", str3, "_tset\"@\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"Python2\"" + "'", str5, "\"Python2\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }
}

