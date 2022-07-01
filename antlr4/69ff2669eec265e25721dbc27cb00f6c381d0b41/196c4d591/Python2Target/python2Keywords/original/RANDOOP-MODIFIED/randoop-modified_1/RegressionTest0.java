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
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getTokenTypeAsTargetLabel(grammar3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.Class<?> wildcardClass3 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getElementListName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        org.antlr.v4.tool.Grammar grammar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getTokenTypeAsTargetLabel(grammar5, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getLoopCounter(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
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
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        int int4 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getRuleFunctionContextStructName(ruleFunction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementListName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python2Target1.getLoopCounter(grammarAST3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getElementName("4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"Context" + "'", str5, "\"\"Context");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        org.antlr.v4.tool.Rule rule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getRuleFunctionContextStructName(rule7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getTokenTypeAsTargetLabel(grammar4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getRuleFunctionContextStructName(ruleFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getElementListName("\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"Context" + "'", str5, "\"\"Context");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar4 = null;
        int[] intArray6 = new int[] { 2147483647 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray7 = python2Target1.getTokenTypesAsTargetLabels(grammar4, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[2147483647]");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        org.antlr.v4.tool.Grammar grammar7 = null;
        int[] intArray10 = new int[] { '#', 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray11 = python2Target1.getTokenTypesAsTargetLabels(grammar7, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[35, 1]");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getImplicitSetLabel("4.5.2.1");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getImplicitTokenLabel("\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset4.5.2.1" + "'", str6, "_tset4.5.2.1");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getElementListName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"Context" + "'", str5, "\"\"Context");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Rule rule4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getRuleFunctionContextStructName(rule4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python2Target1.getLoopLabel(grammarAST3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getElementName("\"\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
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
        org.junit.Assert.assertNull(codeGenerator4);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = python2Target1.getImplicitTokenLabel("\"\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        org.antlr.v4.tool.Grammar grammar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getTokenTypeAsTargetLabel(grammar8, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getElementName("4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        org.antlr.v4.tool.Grammar grammar4 = null;
        int[] intArray9 = new int[] { (-1), (short) 100, '4', 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray10 = python2Target1.getTokenTypesAsTargetLabels(grammar4, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 100, 52, 10]");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getLoopCounter(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "\"\"Context", false);
        org.antlr.v4.tool.Grammar grammar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getTokenTypeAsTargetLabel(grammar9, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\\"Contex" + "'", str8, "\\\"Contex");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar3 = null;
        int[] intArray8 = new int[] { 1, 100, 100, 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = python2Target1.getTokenTypesAsTargetLabels(grammar3, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 100, 100, 0]");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getLoopCounter(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.encodeIntAsCharEscape((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        org.antlr.v4.tool.Grammar grammar7 = null;
        int[] intArray11 = new int[] { (short) 1, 64, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray12 = python2Target1.getTokenTypesAsTargetLabels(grammar7, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 64, 97]");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.Class<?> wildcardClass4 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getLoopLabel(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getElementListName("_tsethi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getElementListName("Python2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.String str5 = python2Target1.getImplicitSetLabel("hi!");
        boolean boolean6 = python2Target1.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getImplicitTokenLabel("_tsethi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tsethi!" + "'", str5, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str6 = python2Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementListName("\"\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset4.5.2.1", true);
        org.antlr.v4.tool.Rule rule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getRuleFunctionContextStructName(rule8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_tset4.5.2.1\"" + "'", str7, "\"_tset4.5.2.1\"");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.encodeIntAsCharEscape(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: 2147483647");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getElementListName("\"\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getRuleFunctionContextStructName(ruleFunction7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\1" + "'", str6, "\\1");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getElementName("\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.lang.String str8 = python2Target1.getImplicitRuleLabel("hi!");
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_hi!" + "'", str8, "_hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementName("Python2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\1" + "'", str6, "\\1");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getElementName("_hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        org.antlr.v4.tool.Rule rule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getRuleFunctionContextStructName(rule11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getElementName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset4.5.2.1", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getElementListName("d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_tset4.5.2.1\"" + "'", str7, "\"_tset4.5.2.1\"");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python2Target1.getElementName("Python2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.tool.Rule rule4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getRuleFunctionContextStructName(rule4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        java.lang.String str4 = python2Target1.getLanguage();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("_tset4.5.2.1");
        int int7 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getRuleFunctionContextStructName(ruleFunction8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tset4.5.2.1" + "'", str6, "__tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        java.lang.String str7 = python2Target1.getLanguage();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("_tset_tset4.5.2.1", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getElementName("Python2");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\1" + "'", str6, "\\1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python2" + "'", str7, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tset_tset4.5.2.1\"" + "'", str10, "\"_tset_tset4.5.2.1\"");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\"");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.antlr.v4.tool.Rule rule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getRuleFunctionContextStructName(rule7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"Context" + "'", str5, "\"\"Context");
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getTokenTypeAsTargetLabel(grammar6, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass3 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Rule rule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getRuleFunctionContextStructName(rule7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getLoopCounter(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\1" + "'", str6, "\\1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getImplicitTokenLabel("\"\\\\n\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        java.lang.String str7 = python2Target1.getLanguage();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("_tset_tset4.5.2.1", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getElementListName("\"_tset4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\1" + "'", str6, "\\1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python2" + "'", str7, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tset_tset4.5.2.1\"" + "'", str10, "\"_tset_tset4.5.2.1\"");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\"\"", true);
        java.lang.String str11 = python2Target1.getListLabel("_tsetPython2");
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getLoopLabel(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"\\\"\"" + "'", str9, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tsetPython2" + "'", str11, "_tsetPython2");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.String str5 = python2Target1.getImplicitSetLabel("hi!");
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getImplicitTokenLabel("\"\\\\n\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tsethi!" + "'", str5, "_tsethi!");
        org.junit.Assert.assertNotNull(sTGroup6);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        java.lang.String str7 = python2Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getImplicitTokenLabel("_tsethi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\1" + "'", str6, "\\1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python2" + "'", str7, "Python2");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.Class<?> wildcardClass7 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("hi!");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getRuleFunctionContextStructName(ruleFunction13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!Context" + "'", str12, "Hi!Context");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getLoopLabel(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
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
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.String str5 = python2Target1.getImplicitSetLabel("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getElementName("__tset4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tsethi!" + "'", str5, "_tsethi!");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        java.lang.String str11 = python2Target1.getAltLabelContextStructName("hi!");
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getLoopLabel(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!Context" + "'", str11, "Hi!Context");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str6 = python2Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getImplicitTokenLabel("\\\"Contex");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.templatesExist();
        java.lang.Class<?> wildcardClass6 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.String str5 = python2Target1.getImplicitSetLabel("hi!");
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getRuleFunctionContextStructName(ruleFunction7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tsethi!" + "'", str5, "_tsethi!");
        org.junit.Assert.assertNotNull(sTGroup6);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.templatesExist();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str5 = python2Target1.getVersion();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("d");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"d\"" + "'", str8, "\"d\"");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.String str5 = python2Target1.getImplicitSetLabel("hi!");
        boolean boolean6 = python2Target1.templatesExist();
        java.lang.Class<?> wildcardClass7 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tsethi!" + "'", str5, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getElementListName("\"\\\\n\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("4.5.2.1");
        int int5 = python2Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getImplicitTokenLabel("\"\\\\n\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseListener();
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getLoopLabel(grammarAST6);
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
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getElementListName("_tset_tset4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"_tsethi!\\\"\"" + "'", str10, "\"\\\"_tsethi!\\\"\"");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
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
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.String str5 = python2Target1.getImplicitSetLabel("hi!");
        boolean boolean6 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getLoopCounter(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tsethi!" + "'", str5, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(codeGenerator7);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        java.lang.String str9 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getRuleFunctionContextStructName(ruleFunction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNull(codeGenerator10);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.String str5 = python2Target1.getImplicitSetLabel("hi!");
        boolean boolean6 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getImplicitTokenLabel("_tsethi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tsethi!" + "'", str5, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(codeGenerator7);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getElementName("#");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getElementListName("_hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        int int4 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.encodeIntAsCharEscape(2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: 2147483647");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        int int4 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = codeGenerator5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        java.lang.String str9 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet11 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass12 = strSet11.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str7 = python2Target1.getListLabel("_tset_tset4.5.2.1");
        org.antlr.v4.tool.Rule rule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getRuleFunctionContextStructName(rule8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset_tset4.5.2.1" + "'", str7, "_tset_tset4.5.2.1");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("\"\\\\n\"");
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass12 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\\n\"Context" + "'", str10, "\"\\\\n\"Context");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
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
        java.lang.Class<?> wildcardClass14 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getRuleFunctionContextStructName(ruleFunction12);
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
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getImplicitSetLabel("4.5.2.1");
        java.lang.Class<?> wildcardClass7 = python2Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset4.5.2.1" + "'", str6, "_tset4.5.2.1");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.lang.String str8 = python2Target1.getImplicitRuleLabel("hi!");
        org.antlr.v4.tool.Grammar grammar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getTokenTypeAsTargetLabel(grammar9, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_hi!" + "'", str8, "_hi!");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
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
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"_tsethi!\\\"\"" + "'", str10, "\"\\\"_tsethi!\\\"\"");
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("\\1");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_\\1" + "'", str6, "_\\1");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\"\"", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getElementListName("\"\\\"_tsetPython2\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"\\\"\"" + "'", str9, "\"\\\"\\\"\"");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.lang.String str8 = python2Target1.getImplicitRuleLabel("hi!");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getRuleFunctionContextStructName(ruleFunction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_hi!" + "'", str8, "_hi!");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        int int4 = python2Target1.getInlineTestSetWordSize();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Rule rule6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getRuleFunctionContextStructName(rule6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Rule rule3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python2Target1.getRuleFunctionContextStructName(rule3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        java.lang.String str12 = python2Target1.getImplicitRuleLabel("4.5.2.1");
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST13);
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
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementListName("\"\\\\n\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.tool.Grammar grammar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getTokenTypeAsTargetLabel(grammar7, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset4.5.2.1" + "'", str6, "_tset4.5.2.1");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        int int4 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        boolean boolean6 = python2Target1.templatesExist();
        java.lang.Class<?> wildcardClass7 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getImplicitSetLabel("4.5.2.1");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getRuleFunctionContextStructName(ruleFunction8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset4.5.2.1" + "'", str6, "_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        java.lang.String str12 = python2Target1.getImplicitSetLabel("d");
        java.lang.String str13 = python2Target1.getVersion();
        java.lang.String str14 = python2Target1.getVersion();
        java.lang.String str15 = python2Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python2Target1.getTokenTypeAsTargetLabel(grammar16, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsetd" + "'", str12, "_tsetd");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4.5.2.1" + "'", str15, "4.5.2.1");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.templatesExist();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset_tset4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\"_tsethi!\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python2Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getElementName("\"\\\\1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_tset_tset4.5.2.1\"" + "'", str7, "\"_tset_tset4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"_tsethi!\"" + "'", str11, "\"_tsethi!\"");
        org.junit.Assert.assertNull(codeGenerator12);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        java.lang.String str8 = python2Target1.getLanguage();
        java.lang.String str9 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        int int11 = python2Target1.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getElementListName("\"_tsethi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseListener();
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar6 = null;
        int[] intArray13 = new int[] { 64, 2147483647, (byte) 1, '#', ' ', 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray14 = python2Target1.getTokenTypesAsTargetLabels(grammar6, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[64, 2147483647, 1, 35, 32, 1]");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str6 = python2Target1.getVersion();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getRuleFunctionContextStructName(ruleFunction7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getTokenTypeAsTargetLabel(grammar5, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.String str5 = python2Target1.getImplicitSetLabel("hi!");
        boolean boolean6 = python2Target1.templatesExist();
        boolean boolean7 = python2Target1.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getImplicitTokenLabel("_tsetd");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tsethi!" + "'", str5, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tsethi!");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tsethi!\"" + "'", str6, "\"_tsethi!\"");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        int int4 = python2Target1.getInlineTestSetWordSize();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getLoopLabel(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("\\n");
        org.antlr.v4.tool.Grammar grammar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getTokenTypeAsTargetLabel(grammar8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_\\n" + "'", str7, "_\\n");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("\"\\\\n\"");
        org.antlr.v4.tool.Grammar grammar11 = null;
        int[] intArray17 = new int[] { (short) 1, (short) -1, (byte) 10, 100, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray18 = python2Target1.getTokenTypesAsTargetLabels(grammar11, intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\\n\"Context" + "'", str10, "\"\\\\n\"Context");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, -1, 10, 100, 97]");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("Python2");
        java.util.Set<java.lang.String> strSet9 = python2Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsetPython2" + "'", str8, "_tsetPython2");
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("\"\\\\n\"");
        org.antlr.v4.tool.Grammar grammar11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getTokenTypeAsTargetLabel(grammar11, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\\n\"Context" + "'", str10, "\"\\\\n\"Context");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("_tsethi!");
        java.lang.String str6 = python2Target1.getAltLabelContextStructName("\"\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tsethi!" + "'", str4, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\"\\\"\"Context" + "'", str6, "\"\\\"\\\"\"Context");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        java.lang.String str11 = python2Target1.getAltLabelContextStructName("hi!");
        boolean boolean12 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getLoopLabel(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!Context" + "'", str11, "Hi!Context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("hi!");
        java.lang.String str4 = python2Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getImplicitTokenLabel("d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"hi!\"" + "'", str3, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getImplicitTokenLabel("\"d\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        java.lang.String str12 = python2Target1.getImplicitSetLabel("d");
        java.lang.String str13 = python2Target1.getVersion();
        java.lang.String str14 = python2Target1.getVersion();
        java.lang.String str15 = python2Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python2Target1.getTokenTypeAsTargetLabel(grammar16, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsetd" + "'", str12, "_tsetd");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4.5.2.1" + "'", str15, "4.5.2.1");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        java.lang.String str12 = python2Target1.getImplicitSetLabel("d");
        java.lang.String str13 = python2Target1.getVersion();
        java.lang.String str14 = python2Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getTokenTypeAsTargetLabel(grammar15, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsetd" + "'", str12, "_tsetd");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        int int8 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getLoopCounter(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        org.antlr.v4.tool.Grammar grammar5 = null;
        int[] intArray8 = new int[] { 64, 2147483647 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = python2Target1.getTokenTypesAsTargetLabels(grammar5, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[64, 2147483647]");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("\\1");
        org.antlr.v4.tool.Grammar grammar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getTokenTypeAsTargetLabel(grammar6, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\\\\1\"" + "'", str5, "\"\\\\1\"");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\"");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        java.lang.String str9 = python2Target1.getImplicitSetLabel("d");
        java.lang.Class<?> wildcardClass10 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"Context" + "'", str5, "\"\"Context");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tsetd" + "'", str9, "_tsetd");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        java.lang.String str7 = python2Target1.getLanguage();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("_tset_tset4.5.2.1", true);
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getElementName("\"\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\1" + "'", str6, "\\1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python2" + "'", str7, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tset_tset4.5.2.1\"" + "'", str10, "\"_tset_tset4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST13);
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
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("\\n");
        org.antlr.v4.tool.Grammar grammar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getTokenTypeAsTargetLabel(grammar8, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_\\n" + "'", str7, "_\\n");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("Python2");
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getLoopLabel(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsetPython2" + "'", str8, "_tsetPython2");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("");
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("_tsethi!");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_" + "'", str6, "_");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"_tsethi!\"" + "'", str9, "\"_tsethi!\"");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        boolean boolean7 = python2Target1.templatesExist();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\"");
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.Class<?> wildcardClass7 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"Context" + "'", str5, "\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.String str5 = python2Target1.getImplicitSetLabel("hi!");
        boolean boolean6 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tsethi!" + "'", str5, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(codeGenerator7);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 10);
        java.lang.Class<?> wildcardClass7 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\n" + "'", str6, "\\n");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        boolean boolean7 = python2Target1.templatesExist();
        boolean boolean8 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getRuleFunctionContextStructName(ruleFunction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        java.lang.String str8 = python2Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getImplicitTokenLabel("\"d\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("4.5.2.1");
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getLoopCounter(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("4.5.2.1");
        org.antlr.v4.tool.Rule rule5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getRuleFunctionContextStructName(rule5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        java.lang.String str5 = python2Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str6 = python2Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getLoopCounter(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("");
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_" + "'", str6, "_");
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str6 = python2Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementListName("\"_tsetPython2\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.templatesExist();
        boolean boolean6 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        java.lang.String str8 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getElementListName("_tset_tsethi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\0" + "'", str11, "\\0");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        java.lang.String str7 = python2Target1.getLanguage();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("_tset_tset4.5.2.1", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getLoopLabel(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\1" + "'", str6, "\\1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python2" + "'", str7, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tset_tset4.5.2.1\"" + "'", str10, "\"_tset_tset4.5.2.1\"");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
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
        org.antlr.v4.tool.Grammar grammar15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getTokenTypeAsTargetLabel(grammar15, 100);
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
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        java.lang.String str4 = python2Target1.getLanguage();
        int int5 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Rule rule6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getRuleFunctionContextStructName(rule6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        java.lang.String str12 = python2Target1.getImplicitSetLabel("d");
        java.lang.Class<?> wildcardClass13 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsetd" + "'", str12, "_tsetd");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("\\n");
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getLoopLabel(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\\n\"" + "'", str8, "\"\\\\n\"");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "_hi!", false);
        int int16 = python2Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python2Target1.getElementName("\"\\\"ython\\\"\"");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi" + "'", str15, "hi");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        java.lang.String str4 = python2Target1.getLanguage();
        int int5 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getRuleFunctionContextStructName(ruleFunction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("Python2");
        java.util.Set<java.lang.String> strSet9 = python2Target1.getBadWords();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getRuleFunctionContextStructName(ruleFunction10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsetPython2" + "'", str8, "_tsetPython2");
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getImplicitSetLabel("4.5.2.1");
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getElementListName("\"_\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset4.5.2.1" + "'", str6, "_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        java.lang.String str8 = python2Target1.getLanguage();
        java.lang.String str9 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        int int11 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.Class<?> wildcardClass12 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.lang.String str4 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getRuleFunctionContextStructName(ruleFunction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset" + "'", str4, "_tset");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.String str5 = python2Target1.getImplicitSetLabel("hi!");
        boolean boolean6 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getTokenTypeAsTargetLabel(grammar8, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tsethi!" + "'", str5, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(codeGenerator7);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        int int4 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar6 = null;
        int[] intArray10 = new int[] { (short) 100, (short) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray11 = python2Target1.getTokenTypesAsTargetLabels(grammar6, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 1, 10]");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\"");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("_tsetPython2");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getElementListName("_tset\"\\\"_tsetPython2\\\"\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"Context" + "'", str5, "\"\"Context");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"_tsetPython2\"" + "'", str9, "\"_tsetPython2\"");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.String str5 = python2Target1.getImplicitSetLabel("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getElementListName("\"\\\"\\\"\\\"Contex\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tsethi!" + "'", str5, "_tsethi!");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        int int8 = python2Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getElementName("_4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getImplicitTokenLabel("4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str7 = python2Target1.getVersion();
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
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        int int5 = python2Target1.getSerializedATNSegmentLimit();
        int int6 = python2Target1.getInlineTestSetWordSize();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        java.lang.String str12 = python2Target1.getImplicitSetLabel("d");
        java.lang.String str13 = python2Target1.getVersion();
        java.lang.String str14 = python2Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target1.getImplicitTokenLabel("_tsetd");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsetd" + "'", str12, "_tsetd");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\"\"", true);
        org.antlr.v4.tool.Grammar grammar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getTokenTypeAsTargetLabel(grammar10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"\\\"\"" + "'", str9, "\"\\\"\\\"\"");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertNotNull(sTGroup4);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        java.util.Set<java.lang.String> strSet9 = python2Target1.getBadWords();
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromString("_");
        java.lang.Class<?> wildcardClass12 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"_\"" + "'", str11, "\"_\"");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        int int4 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementName("#");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getImplicitTokenLabel("\"d\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_" + "'", str6, "_");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        boolean boolean7 = python2Target1.templatesExist();
        boolean boolean8 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str7 = python2Target1.getListLabel("_tset_tset4.5.2.1");
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getLoopCounter(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset_tset4.5.2.1" + "'", str7, "_tset_tset4.5.2.1");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        java.lang.String str9 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getLoopCounter(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertNull(codeGenerator11);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\"_tsetPython2\"");
        java.lang.String str11 = python2Target1.getListLabel("\"\\\"\\\"\"");
        java.lang.String str13 = python2Target1.getAltLabelContextStructName("\"ython\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getImplicitTokenLabel("_\"_tsetPython2\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"_tsetPython2\\\"\"" + "'", str9, "\"\\\"_tsetPython2\\\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"\\\"\"" + "'", str11, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"ython\"Context" + "'", str13, "\"ython\"Context");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\\\"_tsetPython2\\\"\"");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.antlr.v4.tool.Rule rule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getRuleFunctionContextStructName(rule7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\\\"_tsetPython2\\\"\"Context" + "'", str5, "\"\\\"_tsetPython2\\\"\"Context");
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\\1", true);
        org.antlr.v4.tool.Grammar grammar8 = null;
        int[] intArray15 = new int[] { 2147483647, (short) 10, (short) 0, 64, 100, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray16 = python2Target1.getTokenTypesAsTargetLabels(grammar8, intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\\1\"" + "'", str7, "\"\\\\1\"");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[2147483647, 10, 0, 64, 100, 32]");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        java.lang.String str11 = python2Target1.getAltLabelContextStructName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getImplicitTokenLabel("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!Context" + "'", str11, "Hi!Context");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\1" + "'", str6, "\\1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        java.lang.String str7 = python2Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getElementListName("\"\\\"Python2\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\1" + "'", str6, "\\1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python2" + "'", str7, "Python2");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        java.lang.String str7 = python2Target1.getLanguage();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("_tset_tset4.5.2.1", true);
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getTokenTypeAsTargetLabel(grammar12, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\1" + "'", str6, "\\1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python2" + "'", str7, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tset_tset4.5.2.1\"" + "'", str10, "\"_tset_tset4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\\\"_tsetPython2\\\"\"");
        java.lang.String str7 = python2Target1.getListLabel("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\\\"_tsetPython2\\\"\"Context" + "'", str5, "\"\\\"_tsetPython2\\\"\"Context");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        java.lang.String str4 = python2Target1.getLanguage();
        boolean boolean5 = python2Target1.wantsBaseListener();
        boolean boolean6 = python2Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar7 = null;
        int[] intArray13 = new int[] { (short) 1, 1, '#', 10, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray14 = python2Target1.getTokenTypesAsTargetLabels(grammar7, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1, 35, 10, 32]");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Rule rule5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getRuleFunctionContextStructName(rule5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"_tsethi!\\\"\"" + "'", str10, "\"\\\"_tsethi!\\\"\"");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(codeGenerator12);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getLoopLabel(grammarAST12);
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
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.templatesExist();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset_tset4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\"_tsethi!\"", true);
        org.antlr.v4.tool.Grammar grammar12 = null;
        int[] intArray18 = new int[] { 64, 64, (byte) 0, 10, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray19 = python2Target1.getTokenTypesAsTargetLabels(grammar12, intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_tset_tset4.5.2.1\"" + "'", str7, "\"_tset_tset4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"_tsethi!\"" + "'", str11, "\"_tsethi!\"");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[64, 64, 0, 10, 52]");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        java.lang.String str9 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getImplicitTokenLabel("_hi");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNull(codeGenerator10);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
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
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator7);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("_tset_tset4.5.2.1");
        int int7 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tset_tset4.5.2.1" + "'", str6, "__tset_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        int int4 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getLoopLabel(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\"");
        int int6 = python2Target1.getSerializedATNSegmentLimit();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"Context" + "'", str5, "\"\"Context");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.templatesExist();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("Hi!Context", false);
        org.antlr.v4.tool.Grammar grammar9 = null;
        int[] intArray16 = new int[] { (short) -1, (short) 10, 1, (short) 1, (short) 0, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray17 = python2Target1.getTokenTypesAsTargetLabels(grammar9, intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!Context" + "'", str8, "Hi!Context");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 10, 1, 1, 0, 100]");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str5 = python2Target1.getVersion();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getTokenTypeAsTargetLabel(grammar8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tsethi!");
        org.antlr.v4.tool.Rule rule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getRuleFunctionContextStructName(rule7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tsethi!\"" + "'", str6, "\"_tsethi!\"");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("\\1");
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_\\1" + "'", str6, "_\\1");
        org.junit.Assert.assertNotNull(sTGroup7);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("\"\\\\n\"");
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        java.lang.String str12 = python2Target1.getVersion();
        java.lang.String str14 = python2Target1.getImplicitSetLabel("");
        org.antlr.v4.tool.Grammar grammar15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getTokenTypeAsTargetLabel(grammar15, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\\n\"Context" + "'", str10, "\"\\\\n\"Context");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset" + "'", str14, "_tset");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\"_tsetPython2\"");
        java.lang.String str11 = python2Target1.getListLabel("\"\\\"\\\"\"");
        java.lang.String str13 = python2Target1.getAltLabelContextStructName("\"ython\"");
        java.lang.String str14 = python2Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"_tsetPython2\\\"\"" + "'", str9, "\"\\\"_tsetPython2\\\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"\\\"\"" + "'", str11, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"ython\"Context" + "'", str13, "\"ython\"Context");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.Class<?> wildcardClass2 = python2Target1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
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
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"_tsethi!\\\"\"" + "'", str10, "\"\\\"_tsethi!\\\"\"");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str7 = python2Target1.getListLabel("_tset_tset4.5.2.1");
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset_tset4.5.2.1" + "'", str7, "_tset_tset4.5.2.1");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape(10);
        java.lang.Class<?> wildcardClass10 = python2Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\n" + "'", str9, "\\n");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        org.antlr.v4.tool.Rule rule6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getRuleFunctionContextStructName(rule6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("\"\\\\n\"");
        int int11 = python2Target1.getSerializedATNSegmentLimit();
        boolean boolean12 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet13 = python2Target1.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getElementListName("_#");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\\n\"Context" + "'", str10, "\"\\\\n\"Context");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.templatesExist();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset_tset4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\"_tsethi!\"", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getImplicitTokenLabel("_\"\\\"ython\\\"\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_tset_tset4.5.2.1\"" + "'", str7, "\"_tset_tset4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"_tsethi!\"" + "'", str11, "\"_tsethi!\"");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        int int8 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python2Target1.getListLabel("hi!");
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getLoopLabel(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        java.lang.String str9 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"ython\"");
        java.lang.String str14 = python2Target1.encodeIntAsCharEscape((int) '#');
        org.antlr.v4.tool.Grammar grammar15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getTokenTypeAsTargetLabel(grammar15, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"ython\\\"\"" + "'", str12, "\"\\\"ython\\\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "#" + "'", str14, "#");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        boolean boolean5 = python2Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getLoopCounter(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
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
        org.antlr.v4.tool.Grammar grammar16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python2Target1.getTokenTypeAsTargetLabel(grammar16, (int) '#');
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
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
        int int16 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python2Target1.getTokenTypeAsTargetLabel(grammar17, (int) 'a');
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        java.lang.String str9 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"ython\"");
        int int13 = python2Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getElementName("_\"\\\\n\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"ython\\\"\"" + "'", str12, "\"\\\"ython\\\"\"");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("\\1");
        java.lang.Class<?> wildcardClass7 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_\\1" + "'", str6, "_\\1");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.templatesExist();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("\\n", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\\n\"" + "'", str8, "\"\\\\n\"");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\"");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        int int7 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar8 = null;
        int[] intArray9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray10 = python2Target1.getTokenTypesAsTargetLabels(grammar8, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"Context" + "'", str5, "\"\"Context");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\"");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        int int7 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getTokenTypeAsTargetLabel(grammar8, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"Context" + "'", str5, "\"\"Context");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.lang.String str4 = python2Target1.getImplicitSetLabel("");
        java.lang.String str6 = python2Target1.getAltLabelContextStructName("\"\\\"_tsethi!\\\"\"");
        org.antlr.v4.tool.Grammar grammar7 = null;
        int[] intArray13 = new int[] { (byte) 1, 1, (short) 100, (byte) 0, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray14 = python2Target1.getTokenTypesAsTargetLabels(grammar7, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset" + "'", str4, "_tset");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\"_tsethi!\\\"\"Context" + "'", str6, "\"\\\"_tsethi!\\\"\"Context");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 1, 100, 0, 1]");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        int int4 = python2Target1.getInlineTestSetWordSize();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getRuleFunctionContextStructName(ruleFunction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.getTemplates();
        org.antlr.v4.tool.Grammar grammar13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getTokenTypeAsTargetLabel(grammar13, (-1));
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
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseListener();
        int int5 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str7 = python2Target1.getAltLabelContextStructName("\"d\"");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"d\"Context" + "'", str7, "\"d\"Context");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("__tset", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\1" + "'", str6, "\\1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "__tset" + "'", str10, "__tset");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        java.lang.String str4 = python2Target1.getLanguage();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("_tset4.5.2.1");
        int int7 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tset4.5.2.1" + "'", str6, "__tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseListener();
        int int5 = python2Target1.getSerializedATNSegmentLimit();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
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
        int int16 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar17 = null;
        int[] intArray21 = new int[] { (-1), (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray22 = python2Target1.getTokenTypesAsTargetLabels(grammar17, intArray21);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, 10, 10]");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        java.lang.String str9 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet11 = python2Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getTokenTypeAsTargetLabel(grammar12, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.templatesExist();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset_tset4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\"_tsethi!\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "_\\1", true);
        boolean boolean16 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_tset_tset4.5.2.1\"" + "'", str7, "\"_tset_tset4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"_tsethi!\"" + "'", str11, "\"_tsethi!\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"1\"" + "'", str15, "\"1\"");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tsethi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementName("_tsetd");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tsethi!\"" + "'", str6, "\"_tsethi!\"");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.templatesExist();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset_tset4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\"_tsethi!\"", true);
        boolean boolean12 = python2Target1.supportsOverloadedMethods();
        java.lang.String str14 = python2Target1.getImplicitSetLabel("_tset4.5.2.1");
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_tset_tset4.5.2.1\"" + "'", str7, "\"_tset_tset4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"_tsethi!\"" + "'", str11, "\"_tsethi!\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset_tset4.5.2.1" + "'", str14, "_tset_tset4.5.2.1");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        int int4 = python2Target1.getInlineTestSetWordSize();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("_tset\"\\\"\\\"\"Context", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"_tset\\\"\\\\\\\"\\\\\\\"\\\"Context\"" + "'", str9, "\"_tset\\\"\\\\\\\"\\\\\\\"\\\"Context\"");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        java.lang.String str9 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"ython\"");
        java.lang.Class<?> wildcardClass13 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"ython\\\"\"" + "'", str12, "\"\\\"ython\\\"\"");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        int int4 = python2Target1.getInlineTestSetWordSize();
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getImplicitTokenLabel("\"_tsetd\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getImplicitTokenLabel("\\1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("");
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("_tsethi!");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_" + "'", str6, "_");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"_tsethi!\"" + "'", str9, "\"_tsethi!\"");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        int int4 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getRuleFunctionContextStructName(ruleFunction7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("\"\\\\n\"");
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getLoopLabel(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\\n\"Context" + "'", str10, "\"\\\\n\"Context");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.String str5 = python2Target1.getImplicitSetLabel("hi!");
        boolean boolean6 = python2Target1.templatesExist();
        int int7 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.getImplicitRuleLabel("_tset_tset4.5.2.1");
        org.antlr.v4.tool.Grammar grammar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getTokenTypeAsTargetLabel(grammar10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tsethi!" + "'", str5, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "__tset_tset4.5.2.1" + "'", str9, "__tset_tset4.5.2.1");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.templatesExist();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset_tset4.5.2.1");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getElementName("_tsethi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_tset_tset4.5.2.1\"" + "'", str7, "\"_tset_tset4.5.2.1\"");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) '#');
        boolean boolean7 = python2Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#" + "'", str6, "#");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        boolean boolean6 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getLoopLabel(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        java.lang.String str12 = python2Target1.getImplicitSetLabel("d");
        java.lang.String str13 = python2Target1.getVersion();
        java.lang.String str14 = python2Target1.getVersion();
        int int15 = python2Target1.getInlineTestSetWordSize();
        java.lang.Class<?> wildcardClass16 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsetd" + "'", str12, "_tsetd");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("");
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("_tsetPython2");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getElementListName("_tset_tset4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_" + "'", str6, "_");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsetPython2Context" + "'", str8, "_tsetPython2Context");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) '#');
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#" + "'", str6, "#");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("\"\\\\n\"");
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        java.lang.String str12 = python2Target1.getVersion();
        java.lang.String str14 = python2Target1.getImplicitSetLabel("");
        boolean boolean15 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Rule rule17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python2Target1.getRuleFunctionContextStructName(rule17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\\n\"Context" + "'", str10, "\"\\\\n\"Context");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset" + "'", str14, "_tset");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(codeGenerator16);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("\"\\\\n\"");
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        java.lang.String str12 = python2Target1.getVersion();
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromString("__tset4.5.2.1");
        org.antlr.v4.tool.Grammar grammar15 = null;
        int[] intArray19 = new int[] { (byte) 0, 'a', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray20 = python2Target1.getTokenTypesAsTargetLabels(grammar15, intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\\n\"Context" + "'", str10, "\"\\\\n\"Context");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"__tset4.5.2.1\"" + "'", str14, "\"__tset4.5.2.1\"");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 97, -1]");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        java.lang.String str5 = python2Target1.getLanguage();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.String str8 = python2Target1.getImplicitSetLabel("_tsethi!");
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Rule rule10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getRuleFunctionContextStructName(rule10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset_tsethi!" + "'", str8, "_tset_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\"");
        boolean boolean6 = python2Target1.wantsBaseVisitor();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"Context" + "'", str5, "\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        java.lang.String str4 = python2Target1.getLanguage();
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python2Target1.encodeIntAsCharEscape((int) (short) 100);
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d" + "'", str7, "d");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("");
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_" + "'", str6, "_");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.encodeIntAsCharEscape(10);
        java.lang.String str11 = python2Target1.getImplicitSetLabel("\"\\\\1\"");
        java.lang.Class<?> wildcardClass12 = python2Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\n" + "'", str9, "\\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset\"\\\\1\"" + "'", str11, "_tset\"\\\\1\"");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        java.lang.String str11 = python2Target1.getAltLabelContextStructName("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getElementListName("DContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!Context" + "'", str11, "Hi!Context");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("__tset", false);
        org.antlr.v4.tool.Grammar grammar11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getTokenTypeAsTargetLabel(grammar11, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\1" + "'", str6, "\\1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "__tset" + "'", str10, "__tset");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        int int4 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "_tset_tset", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getLoopLabel(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"tset_tse\"" + "'", str8, "\"tset_tse\"");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.templatesExist();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset_tset4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\"_tsethi!\"", true);
        boolean boolean12 = python2Target1.supportsOverloadedMethods();
        java.lang.String str14 = python2Target1.getImplicitSetLabel("_tset4.5.2.1");
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target1.getLoopCounter(grammarAST15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_tset_tset4.5.2.1\"" + "'", str7, "\"_tset_tset4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"_tsethi!\"" + "'", str11, "\"_tsethi!\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset_tset4.5.2.1" + "'", str14, "_tset_tset4.5.2.1");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.templatesExist();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset_tset4.5.2.1");
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_tset_tset4.5.2.1\"" + "'", str7, "\"_tset_tset4.5.2.1\"");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        java.lang.String str12 = python2Target1.getImplicitSetLabel("d");
        java.lang.String str13 = python2Target1.getVersion();
        boolean boolean14 = python2Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsetd" + "'", str12, "_tsetd");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("\"\\\\n\"");
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getImplicitTokenLabel("\"_tsetd\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\\n\"Context" + "'", str10, "\"\\\\n\"Context");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 10);
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\"__tset4.5.2.1\"", true);
        org.antlr.v4.tool.Rule rule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getRuleFunctionContextStructName(rule11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\n" + "'", str6, "\\n");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"__tset4.5.2.1\\\"\"" + "'", str10, "\"\\\"__tset4.5.2.1\\\"\"");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getElementName("_\\\"Contex");
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
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("__tset_tset4.5.2.1");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getElementName("_\"\\\\n\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"__tset_tset4.5.2.1\"" + "'", str5, "\"__tset_tset4.5.2.1\"");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        int int8 = python2Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getElementListName("\"\\\"_tsetPython2\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.templatesExist();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("\\n", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getImplicitTokenLabel("\"__tset_tset4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\\n\"" + "'", str8, "\"\\\\n\"");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\"_tsetPython2\"");
        java.lang.String str11 = python2Target1.getListLabel("\"\\\"\\\"\"");
        java.lang.String str13 = python2Target1.getAltLabelContextStructName("\"ython\"");
        java.lang.String str15 = python2Target1.getAltLabelContextStructName("d");
        java.lang.String str17 = python2Target1.encodeIntAsCharEscape(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"_tsetPython2\\\"\"" + "'", str9, "\"\\\"_tsetPython2\\\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"\\\"\"" + "'", str11, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"ython\"Context" + "'", str13, "\"ython\"Context");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DContext" + "'", str15, "DContext");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\n" + "'", str17, "\\n");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 10);
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getElementListName("_tsetPython2Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\n" + "'", str8, "\\n");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("Python2");
        java.util.Set<java.lang.String> strSet9 = python2Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getLoopCounter(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsetPython2" + "'", str8, "_tsetPython2");
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("_tset");
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getRuleFunctionContextStructName(ruleFunction8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tset" + "'", str6, "__tset");
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        int int5 = python2Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getImplicitTokenLabel("\"\\\"_tsetPython2\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "_hi!", false);
        java.lang.String str17 = python2Target1.getTargetStringLiteralFromString("\"Python2\"");
        org.antlr.v4.tool.Rule rule18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python2Target1.getRuleFunctionContextStructName(rule18);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi" + "'", str15, "hi");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\\\"Python2\\\"\"" + "'", str17, "\"\\\"Python2\\\"\"");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\\\"_tsetPython2\\\"\"");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\\\"_tsetPython2\\\"\"Context" + "'", str5, "\"\\\"_tsetPython2\\\"\"Context");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("hi!");
        java.lang.String str4 = python2Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "ython", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getImplicitTokenLabel("_tsetd");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"hi!\"" + "'", str3, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "tho" + "'", str8, "tho");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        java.util.Set<java.lang.String> strSet9 = python2Target1.getBadWords();
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromString("_");
        java.lang.String str13 = python2Target1.getImplicitSetLabel("_\"\\\\n\"Context");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"_\"" + "'", str11, "\"_\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_tset_\"\\\\n\"Context" + "'", str13, "_tset_\"\\\\n\"Context");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("\\n");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getElementListName("\"ython\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_\\n" + "'", str7, "_\\n");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str7 = python2Target1.getListLabel("_tset_tset4.5.2.1");
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target1.getTemplates();
        java.util.Set<java.lang.String> strSet9 = python2Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset_tset4.5.2.1" + "'", str7, "_tset_tset4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        int int8 = python2Target1.getInlineTestSetWordSize();
        boolean boolean9 = python2Target1.templatesExist();
        java.lang.Class<?> wildcardClass10 = python2Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        boolean boolean7 = python2Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\\64", false);
        java.lang.Class<?> wildcardClass12 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\1" + "'", str6, "\\1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "6" + "'", str11, "6");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("_tsethi!");
        boolean boolean5 = python2Target1.wantsBaseListener();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("\"_tsetPython2\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tsethi!" + "'", str4, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_\"_tsetPython2\"" + "'", str7, "_\"_tsetPython2\"");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        java.lang.String str6 = python2Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        java.lang.String str8 = python2Target1.getImplicitSetLabel("_tset4.5.2.1");
        java.lang.String str9 = python2Target1.getLanguage();
        java.lang.Class<?> wildcardClass10 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset_tset4.5.2.1" + "'", str8, "_tset_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        int int5 = python2Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getElementListName("\"\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str5 = python2Target1.getVersion();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getImplicitTokenLabel("\"\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        boolean boolean7 = python2Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target1.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        org.antlr.v4.tool.Rule rule10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getRuleFunctionContextStructName(rule10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertNotNull(sTGroup9);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getVersion();
        boolean boolean5 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getTokenTypeAsTargetLabel(grammar6, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        java.lang.Class<?> wildcardClass8 = sTGroup7.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        java.lang.Class<?> wildcardClass5 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\"");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        java.lang.String str9 = python2Target1.getImplicitSetLabel("d");
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "@", false);
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"Context" + "'", str5, "\"\"Context");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tsetd" + "'", str9, "_tsetd");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\"");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        boolean boolean8 = python2Target1.wantsBaseListener();
        boolean boolean9 = python2Target1.wantsBaseListener();
        int int10 = python2Target1.getInlineTestSetWordSize();
        boolean boolean11 = python2Target1.wantsBaseVisitor();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"Context" + "'", str5, "\"\"Context");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("\"\\\\1\"", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"\\\\\\\\1\\\"\"" + "'", str8, "\"\\\"\\\\\\\\1\\\"\"");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
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
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape(1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getImplicitTokenLabel("_\"\\\"\\\"\\\"Contex\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\1" + "'", str6, "\\1");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        java.lang.String str8 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("@", false);
        boolean boolean13 = python2Target1.templatesExist();
        int int14 = python2Target1.getSerializedATNSegmentLimit();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "@" + "'", str12, "@");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        java.lang.String str9 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        java.lang.Class<?> wildcardClass11 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset4.5.2.1", true);
        int int8 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = codeGenerator9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_tset4.5.2.1\"" + "'", str7, "\"_tset4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertNull(codeGenerator9);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.encodeIntAsCharEscape((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\1" + "'", str11, "\\1");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet4 = python2Target1.getBadWords();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.Class<?> wildcardClass7 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseListener();
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
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        int int8 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.getLanguage();
        java.lang.Class<?> wildcardClass10 = python2Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("4.5.2.1");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getElementListName("\\1Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        int int4 = python2Target1.getInlineTestSetWordSize();
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getElementName("\"\\\"ython\\\"\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        java.lang.String str8 = python2Target1.getLanguage();
        java.lang.String str9 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        boolean boolean11 = python2Target1.wantsBaseListener();
        boolean boolean12 = python2Target1.wantsBaseVisitor();
        boolean boolean13 = python2Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str4 = python2Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getImplicitTokenLabel("_tsetPython2\\\"Contex");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup5);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.templatesExist();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        int int7 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\"\"", true);
        java.lang.String str11 = python2Target1.getListLabel("_tsetPython2");
        java.lang.String str13 = python2Target1.getImplicitRuleLabel("\\\"Contex");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getRuleFunctionContextStructName(ruleFunction14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"\\\"\"" + "'", str9, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tsetPython2" + "'", str11, "_tsetPython2");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_\\\"Contex" + "'", str13, "_\\\"Contex");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        int int8 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str9 = python2Target1.getVersion();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\"");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        int int7 = python2Target1.getInlineTestSetWordSize();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"Context" + "'", str5, "\"\"Context");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.String str5 = python2Target1.getImplicitSetLabel("hi!");
        boolean boolean6 = python2Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tsethi!" + "'", str5, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        int int7 = python2Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        int int5 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Rule rule6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getRuleFunctionContextStructName(rule6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseListener();
        int int5 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str7 = python2Target1.getAltLabelContextStructName("\"d\"");
        boolean boolean8 = python2Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getElementListName("_\"\\\"\\\"\\\"Contex\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"d\"Context" + "'", str7, "\"d\"Context");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
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
        java.lang.String str17 = python2Target1.getImplicitSetLabel("\\0");
        org.antlr.v4.tool.ast.GrammarAST grammarAST18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python2Target1.getLoopCounter(grammarAST18);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_tset\\0" + "'", str17, "_tset\\0");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\"\"", true);
        java.lang.String str11 = python2Target1.getAltLabelContextStructName("\"_tsetPython2\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getLoopCounter(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"\\\"\"" + "'", str9, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"_tsetPython2\"Context" + "'", str11, "\"_tsetPython2\"Context");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        java.lang.String str9 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet11 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python2Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getElementName("\"_tset_\\\"\\\\\\\\n\\\"Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(codeGenerator12);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseListener();
        int int5 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str7 = python2Target1.getAltLabelContextStructName("\"d\"");
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"d\"Context" + "'", str7, "\"d\"Context");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("");
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\"ython\"", false);
        boolean boolean12 = python2Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getElementName("thonContex");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_" + "'", str6, "_");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ython" + "'", str11, "ython");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
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
        boolean boolean14 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getTokenTypeAsTargetLabel(grammar15, (int) '#');
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
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
        java.lang.String str12 = python2Target1.getListLabel("_");
        java.util.Set<java.lang.String> strSet13 = python2Target1.getBadWords();
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
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"_tsethi!\\\"\"" + "'", str10, "\"\\\"_tsethi!\\\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_" + "'", str12, "_");
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("\"\\\"\\\"\"Context");
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getLoopCounter(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset\"\\\"\\\"\"Context" + "'", str3, "_tset\"\\\"\\\"\"Context");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getAltLabelContextStructName("__tsetContext");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "__tsetContextContext" + "'", str3, "__tsetContextContext");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\"\"", true);
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("_tset_tset\"\\\"_tsetPython2\\\"\"ContextContext", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getLoopCounter(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"\\\"\"" + "'", str9, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_tset_tset\\\"\\\\\\\"_tsetPython2\\\\\\\"\\\"ContextContext\"" + "'", str12, "\"_tset_tset\\\"\\\\\\\"_tsetPython2\\\\\\\"\\\"ContextContext\"");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("\"\\\\n\"");
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        java.lang.String str12 = python2Target1.getVersion();
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromString("__tset4.5.2.1");
        java.util.Set<java.lang.String> strSet15 = python2Target1.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python2Target1.getElementName("_tset ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\\n\"Context" + "'", str10, "\"\\\\n\"Context");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"__tset4.5.2.1\"" + "'", str14, "\"__tset4.5.2.1\"");
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"_tsetPython2\"Context", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsetd" + "'", str12, "_tsetd");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_tsetPython2\\\"Contex" + "'", str17, "_tsetPython2\\\"Contex");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        boolean boolean5 = python2Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseListener();
        int int5 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str7 = python2Target1.getAltLabelContextStructName("\"d\"");
        boolean boolean8 = python2Target1.wantsBaseVisitor();
        java.lang.Class<?> wildcardClass9 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"d\"Context" + "'", str7, "\"d\"Context");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        int int4 = python2Target1.getInlineTestSetWordSize();
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        java.lang.String str4 = python2Target1.getLanguage();
        int int5 = python2Target1.getSerializedATNSegmentLimit();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        java.lang.String str7 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getElementName("_\"\\\"ython\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\1" + "'", str6, "\\1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python2" + "'", str7, "Python2");
        org.junit.Assert.assertNull(codeGenerator8);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.templatesExist();
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getTokenTypeAsTargetLabel(grammar6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str7 = python2Target1.getListLabel("_tset_tset4.5.2.1");
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target1.getTemplates();
        int int9 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getLoopCounter(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset_tset4.5.2.1" + "'", str7, "_tset_tset4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("");
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\"ython\"", false);
        java.util.Set<java.lang.String> strSet12 = python2Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getTokenTypeAsTargetLabel(grammar13, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_" + "'", str6, "_");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ython" + "'", str11, "ython");
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        int int4 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        boolean boolean6 = python2Target1.templatesExist();
        boolean boolean7 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("\\n");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("hi");
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getElementName("_");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_\\n" + "'", str7, "_\\n");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"hi\"" + "'", str10, "\"hi\"");
        org.junit.Assert.assertNull(codeGenerator11);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python2Target1.getLoopLabel(grammarAST3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getListLabel("\"d\"Context");
        java.lang.String str8 = python2Target1.getImplicitRuleLabel("thonContex");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"d\"Context" + "'", str6, "\"d\"Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_thonContex" + "'", str8, "_thonContex");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str5 = python2Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\"\\\"\\\"\"", true);
        java.lang.Class<?> wildcardClass10 = python2Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"\\\"\"" + "'", str9, "\"\\\"\\\"\"");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getRuleFunctionContextStructName(ruleFunction7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        java.lang.String str19 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator16, "__tset_tset4.5.2.1", true);
        java.lang.Class<?> wildcardClass20 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"_tset_tset4.5.2.\"" + "'", str19, "\"_tset_tset4.5.2.\"");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("Python2");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getImplicitTokenLabel("_\\1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsetPython2" + "'", str8, "_tsetPython2");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("hi!");
        org.stringtemplate.v4.STGroup sTGroup13 = python2Target1.getTemplates();
        org.antlr.v4.tool.Rule rule14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getRuleFunctionContextStructName(rule14);
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
        org.junit.Assert.assertNotNull(sTGroup13);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        int int4 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.getVersion();
        java.lang.Class<?> wildcardClass6 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("\"\\\\n\"");
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        java.lang.String str12 = python2Target1.getVersion();
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromString("__tset4.5.2.1");
        java.util.Set<java.lang.String> strSet15 = python2Target1.getBadWords();
        boolean boolean16 = python2Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar17 = null;
        int[] intArray18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray19 = python2Target1.getTokenTypesAsTargetLabels(grammar17, intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\\n\"Context" + "'", str10, "\"\\\\n\"Context");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"__tset4.5.2.1\"" + "'", str14, "\"__tset4.5.2.1\"");
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        int int4 = python2Target1.getInlineTestSetWordSize();
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getLoopCounter(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
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
        org.antlr.v4.codegen.model.RuleFunction ruleFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getRuleFunctionContextStructName(ruleFunction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"_tsethi!\\\"\"" + "'", str10, "\"\\\"_tsethi!\\\"\"");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getListLabel("\"d\"Context");
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\"_tset_tset4.5.2.1\"", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"d\"Context" + "'", str6, "\"d\"Context");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"_tset_tset4.5.2.1\\\"\"" + "'", str9, "\"\\\"_tset_tset4.5.2.1\\\"\"");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        java.lang.String str9 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"ython\"");
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target15 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator14);
        boolean boolean16 = python2Target15.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar17 = null;
        int[] intArray18 = new int[] {};
        java.lang.String[] strArray19 = python2Target15.getTokenTypesAsTargetLabels(grammar17, intArray18);
        java.lang.String[] strArray20 = python2Target1.getTokenTypesAsTargetLabels(grammar13, intArray18);
        int int21 = python2Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = python2Target1.getElementName("__tset");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"ython\\\"\"" + "'", str12, "\"\\\"ython\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[]");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\\1", true);
        boolean boolean8 = python2Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\\1\"" + "'", str7, "\"\\\\1\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str7 = python2Target1.getVersion();
        java.lang.String str9 = python2Target1.getImplicitSetLabel("\"\\\"_tsetPython2\\\"\"Context");
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup11 = python2Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getImplicitTokenLabel("\"_tsethi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset\"\\\"_tsetPython2\\\"\"Context" + "'", str9, "_tset\"\\\"_tsetPython2\\\"\"Context");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(sTGroup11);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        java.lang.String str4 = python2Target1.getLanguage();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("_tset4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        java.lang.String str9 = python2Target1.getListLabel(" ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tset4.5.2.1" + "'", str6, "__tset4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\"");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        java.lang.String str9 = python2Target1.getListLabel("__tsetContext");
        org.stringtemplate.v4.STGroup sTGroup10 = python2Target1.getTemplates();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"Context" + "'", str5, "\"\"Context");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "__tsetContext" + "'", str9, "__tsetContext");
        org.junit.Assert.assertNotNull(sTGroup10);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "_hi!", false);
        java.lang.String str17 = python2Target1.getTargetStringLiteralFromString("\"Python2\"");
        java.lang.Class<?> wildcardClass18 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\1" + "'", str11, "\\1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi" + "'", str15, "hi");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\\\"Python2\\\"\"" + "'", str17, "\"\\\"Python2\\\"\"");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        int int4 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        boolean boolean7 = python2Target1.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("\\n");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("hi");
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python2Target1.getCodeGenerator();
        java.lang.Class<?> wildcardClass12 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_\\n" + "'", str7, "_\\n");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"hi\"" + "'", str10, "\"hi\"");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        int int4 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python2Target1.getListLabel("_tsetd");
        org.antlr.v4.tool.Rule rule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getRuleFunctionContextStructName(rule7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tsetd" + "'", str6, "_tsetd");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "_\"\\\\n\"Context", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getElementListName("\"_tset_tset\\\"\\\\\\\"_tsetPython2\\\\\\\"\\\"ContextContext\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\1" + "'", str6, "\\1");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\\"\\\\n\\\"Contex" + "'", str11, "\\\"\\\\n\\\"Contex");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
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
        java.lang.String str17 = python2Target1.getImplicitSetLabel("\\0");
        java.lang.String str19 = python2Target1.getListLabel("hi");
        org.antlr.v4.tool.ast.GrammarAST grammarAST20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST20);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_tset\\0" + "'", str17, "_tset\\0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi" + "'", str19, "hi");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        java.lang.String str9 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("\"ython\"");
        int int13 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getLoopCounter(grammarAST14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"ython\\\"\"" + "'", str12, "\"\\\"ython\\\"\"");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        java.lang.String str9 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet11 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python2Target1.getCodeGenerator();
        java.lang.String str13 = python2Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        boolean boolean17 = python2Target16.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar18 = null;
        int[] intArray19 = new int[] {};
        java.lang.String[] strArray20 = python2Target16.getTokenTypesAsTargetLabels(grammar18, intArray19);
        java.lang.String[] strArray21 = python2Target1.getTokenTypesAsTargetLabels(grammar14, intArray19);
        boolean boolean22 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("_tsethi!");
        boolean boolean5 = python2Target1.wantsBaseListener();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("_tsetPython2Context");
        int int8 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getLoopLabel(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tsethi!" + "'", str4, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "__tsetPython2Context" + "'", str7, "__tsetPython2Context");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        java.lang.String str8 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("@", false);
        boolean boolean13 = python2Target1.templatesExist();
        java.lang.String str15 = python2Target1.getAltLabelContextStructName("\"\\\"\\\"Context\"");
        java.lang.String str18 = python2Target1.getTargetStringLiteralFromString("\"_tsetd\"Context", false);
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "@" + "'", str12, "@");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"\\\"Context\"Context" + "'", str15, "\"\\\"\\\"Context\"Context");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\\\"_tsetd\\\"Context" + "'", str18, "\\\"_tsetd\\\"Context");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\"");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass7 = strSet6.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"Context" + "'", str5, "\"\"Context");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        int int4 = python2Target1.getInlineTestSetWordSize();
        boolean boolean5 = python2Target1.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getImplicitTokenLabel("_tset\"\\\"\\\"\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("\"\\\\n\"");
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\\n\"Context" + "'", str8, "\"\\\\n\"Context");
        org.junit.Assert.assertNotNull(sTGroup9);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        java.lang.String str9 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet11 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python2Target1.getCodeGenerator();
        java.lang.String str13 = python2Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target16 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator15);
        boolean boolean17 = python2Target16.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar18 = null;
        int[] intArray19 = new int[] {};
        java.lang.String[] strArray20 = python2Target16.getTokenTypesAsTargetLabels(grammar18, intArray19);
        java.lang.String[] strArray21 = python2Target1.getTokenTypesAsTargetLabels(grammar14, intArray19);
        org.antlr.v4.tool.ast.GrammarAST grammarAST22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = python2Target1.getLoopLabel(grammarAST22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
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
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        java.lang.String str12 = python2Target1.getImplicitSetLabel("d");
        boolean boolean13 = python2Target1.wantsBaseVisitor();
        java.lang.String str14 = python2Target1.getVersion();
        org.antlr.v4.tool.Rule rule15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target1.getRuleFunctionContextStructName(rule15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsetd" + "'", str12, "_tsetd");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        java.lang.String str8 = python2Target1.getLanguage();
        java.lang.String str9 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        int int11 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str14 = python2Target1.getTargetStringLiteralFromString("\"hi!\"", false);
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\\"hi!\\\"" + "'", str14, "\\\"hi!\\\"");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("_tsethi!");
        boolean boolean5 = python2Target1.wantsBaseListener();
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.String str7 = python2Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getLoopCounter(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tsethi!" + "'", str4, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("\\1", true);
        int int8 = python2Target1.getInlineTestSetWordSize();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\\1\"" + "'", str7, "\"\\\\1\"");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.templatesExist();
        java.lang.String str5 = python2Target1.getLanguage();
        boolean boolean6 = python2Target1.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getImplicitTokenLabel("d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseListener();
        int int5 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str7 = python2Target1.getAltLabelContextStructName("\"d\"");
        boolean boolean8 = python2Target1.wantsBaseVisitor();
        boolean boolean9 = python2Target1.wantsBaseListener();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"d\"Context" + "'", str7, "\"d\"Context");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str5 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python2" + "'", str6, "Python2");
        org.junit.Assert.assertNotNull(sTGroup7);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.String str5 = python2Target1.getImplicitSetLabel("hi!");
        boolean boolean6 = python2Target1.templatesExist();
        boolean boolean7 = python2Target1.templatesExist();
        int int8 = python2Target1.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getImplicitTokenLabel("_tset_\"\\\\n\"ContextContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tsethi!" + "'", str5, "_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("__tset", false);
        java.lang.String str11 = python2Target1.getLanguage();
        java.lang.String str13 = python2Target1.getImplicitSetLabel("_\"\\\"ython\\\"\"");
        org.stringtemplate.v4.STGroup sTGroup14 = python2Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\1" + "'", str6, "\\1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "__tset" + "'", str10, "__tset");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python2" + "'", str11, "Python2");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_tset_\"\\\"ython\\\"\"" + "'", str13, "_tset_\"\\\"ython\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup14);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        java.lang.String str4 = python2Target1.getLanguage();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("_tset4.5.2.1");
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) '#');
        java.util.Set<java.lang.String> strSet9 = python2Target1.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getElementName("_\\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tset4.5.2.1" + "'", str6, "__tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#" + "'", str8, "#");
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        java.lang.String str5 = python2Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getElementName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Rule rule6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getRuleFunctionContextStructName(rule6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        boolean boolean8 = python2Target1.wantsBaseVisitor();
        java.lang.String str10 = python2Target1.encodeIntAsCharEscape((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\1" + "'", str6, "\\1");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python2Target1.getCodeGenerator();
        java.lang.String str17 = python2Target1.getImplicitRuleLabel("\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_\"hi!\"" + "'", str17, "_\"hi!\"");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\"");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        boolean boolean8 = python2Target1.wantsBaseListener();
        boolean boolean9 = python2Target1.wantsBaseListener();
        int int10 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getLoopCounter(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"Context" + "'", str5, "\"\"Context");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("\\1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getTokenTypeAsTargetLabel(grammar7, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\\\\1\"" + "'", str5, "\"\\\\1\"");
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        java.lang.String str8 = python2Target1.getLanguage();
        java.lang.String str9 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        int int11 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        int int4 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.getAltLabelContextStructName("\\1");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getElementListName("\"\\\\1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\1Context" + "'", str9, "\\1Context");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        int int4 = python2Target1.getInlineTestSetWordSize();
        boolean boolean5 = python2Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getTokenTypeAsTargetLabel(grammar6, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("\\1");
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        java.lang.Class<?> wildcardClass8 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_\\1" + "'", str6, "_\\1");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        java.util.Set<java.lang.String> strSet9 = python2Target1.getBadWords();
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromString("_");
        java.lang.String str13 = python2Target1.getAltLabelContextStructName("_hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"_\"" + "'", str11, "\"_\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_hi!Context" + "'", str13, "_hi!Context");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        boolean boolean7 = python2Target1.supportsOverloadedMethods();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("__tset", false);
        java.lang.String str12 = python2Target1.encodeIntAsCharEscape((int) 'a');
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\1" + "'", str6, "\\1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "__tset" + "'", str10, "__tset");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a" + "'", str12, "a");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        boolean boolean7 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromString("_\"\\\\n\"Context");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"_\\\"\\\\\\\\n\\\"Context\"" + "'", str11, "\"_\\\"\\\\\\\\n\\\"Context\"");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python2Target1.getImplicitRuleLabel("\\n");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python2Target1.getCodeGenerator();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("hi");
        boolean boolean11 = python2Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getLoopLabel(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_\\n" + "'", str7, "_\\n");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"hi\"" + "'", str10, "\"hi\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementListName("\"\\\\1Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_" + "'", str6, "_");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        java.lang.String str8 = python2Target1.getAltLabelContextStructName("_\"\\\\n\"Context");
        boolean boolean9 = python2Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass10 = python2Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_\"\\\\n\"ContextContext" + "'", str8, "_\"\\\\n\"ContextContext");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("");
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\"ython\"", false);
        boolean boolean12 = python2Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet13 = python2Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_" + "'", str6, "_");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ython" + "'", str11, "ython");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"_tsetPython2\"Context", false);
        java.util.Set<java.lang.String> strSet18 = python2Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsetd" + "'", str12, "_tsetd");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_tsetPython2\\\"Contex" + "'", str17, "_tsetPython2\\\"Contex");
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        int int4 = python2Target1.getInlineTestSetWordSize();
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "", false);
        org.antlr.v4.tool.Rule rule10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getRuleFunctionContextStructName(rule10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str7 = python2Target1.getVersion();
        java.lang.String str9 = python2Target1.getImplicitSetLabel("\"\\\"_tsetPython2\\\"\"Context");
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getTokenTypeAsTargetLabel(grammar11, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset\"\\\"_tsetPython2\\\"\"Context" + "'", str9, "_tset\"\\\"_tsetPython2\\\"\"Context");
        org.junit.Assert.assertNull(codeGenerator10);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        boolean boolean5 = python2Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        java.lang.String str4 = python2Target1.getLanguage();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("_tset4.5.2.1");
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) '#');
        java.util.Set<java.lang.String> strSet9 = python2Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getLoopCounter(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tset4.5.2.1" + "'", str6, "__tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#" + "'", str8, "#");
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("\\1");
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_\\1" + "'", str6, "_\\1");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python2" + "'", str11, "Python2");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        java.lang.String str8 = python2Target1.getLanguage();
        java.lang.String str9 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet10 = python2Target1.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getImplicitTokenLabel("_4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("_tset");
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        int int8 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tset" + "'", str6, "__tset");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_tsethi!Context" + "'", str10, "_tsethi!Context");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        int int4 = python2Target1.getInlineTestSetWordSize();
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        java.lang.String str9 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet11 = python2Target1.getBadWords();
        java.lang.Class<?> wildcardClass12 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getTokenTypeAsTargetLabel(grammar4, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("\\1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getLoopCounter(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\\\\1\"" + "'", str5, "\"\\\\1\"");
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("_tset_tset4.5.2.1");
        int int7 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getLoopCounter(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "__tset_tset4.5.2.1" + "'", str6, "__tset_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getRuleFunctionContextStructName(ruleFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("\"\\\\n\"");
        int int11 = python2Target1.getSerializedATNSegmentLimit();
        boolean boolean12 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet13 = python2Target1.getBadWords();
        int int14 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target1.getRuleFunctionContextStructName(ruleFunction15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\\n\"Context" + "'", str10, "\"\\\\n\"Context");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        java.lang.String str7 = python2Target1.getLanguage();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("_tset_tset4.5.2.1", true);
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getElementListName("\"_hi\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\1" + "'", str6, "\\1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python2" + "'", str7, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tset_tset4.5.2.1\"" + "'", str10, "\"_tset_tset4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.lang.String str4 = python2Target1.getImplicitSetLabel("");
        java.lang.String str6 = python2Target1.getAltLabelContextStructName("\"__tset_tset4.5.2.1\"");
        org.antlr.v4.tool.Rule rule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getRuleFunctionContextStructName(rule7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset" + "'", str4, "_tset");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"__tset_tset4.5.2.1\"Context" + "'", str6, "\"__tset_tset4.5.2.1\"Context");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 10);
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getTokenTypeAsTargetLabel(grammar10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\n" + "'", str8, "\\n");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("\"\\\"d\\\"Context\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getImplicitTokenLabel("_tset\"\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_\"\\\"d\\\"Context\"" + "'", str6, "_\"\\\"d\\\"Context\"");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 10);
        boolean boolean7 = python2Target1.wantsBaseListener();
        boolean boolean8 = python2Target1.wantsBaseVisitor();
        boolean boolean9 = python2Target1.templatesExist();
        java.lang.String str11 = python2Target1.getListLabel("\\\"hi!\\\"");
        boolean boolean12 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\n" + "'", str6, "\\n");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\\"hi!\\\"" + "'", str11, "\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str7 = python2Target1.getListLabel("_tset_tset4.5.2.1");
        java.util.Set<java.lang.String> strSet8 = python2Target1.getBadWords();
        java.lang.String str10 = python2Target1.getListLabel("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset_tset4.5.2.1" + "'", str7, "_tset_tset4.5.2.1");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        java.lang.String str5 = python2Target1.getListLabel("_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tsethi!" + "'", str5, "_tsethi!");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        int int4 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python2Target1.getListLabel("_tsetd");
        int int7 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getTokenTypeAsTargetLabel(grammar8, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tsetd" + "'", str6, "_tsetd");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\"");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        java.lang.String str9 = python2Target1.getImplicitSetLabel("d");
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "@", false);
        java.lang.String str14 = python2Target1.getLanguage();
        java.lang.String str16 = python2Target1.getListLabel("a");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"Context" + "'", str5, "\"\"Context");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tsetd" + "'", str9, "_tsetd");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "a" + "'", str16, "a");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        int int9 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getRuleFunctionContextStructName(ruleFunction10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        int int8 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("_\\\"Contex");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_\\\\\\\"Contex\"" + "'", str10, "\"_\\\\\\\"Contex\"");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
        java.lang.String str12 = python2Target1.getListLabel("_");
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getLoopLabel(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"_tsethi!\\\"\"" + "'", str10, "\"\\\"_tsethi!\\\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_" + "'", str12, "_");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str7 = python2Target1.getListLabel("_tset_tset4.5.2.1");
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target1.getTemplates();
        int int9 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset_tset4.5.2.1" + "'", str7, "_tset_tset4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\1" + "'", str11, "\\1");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str7 = python2Target1.getListLabel("_tset_tset4.5.2.1");
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getImplicitTokenLabel("_tset_tset4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset_tset4.5.2.1" + "'", str7, "_tset_tset4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup8);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) (short) 1);
        java.lang.String str7 = python2Target1.getLanguage();
        java.lang.String str8 = python2Target1.getLanguage();
        org.antlr.v4.tool.Rule rule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getRuleFunctionContextStructName(rule9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\1" + "'", str6, "\\1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python2" + "'", str7, "Python2");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.String str8 = python2Target1.getImplicitSetLabel("_tsethi!");
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset_tsethi!" + "'", str8, "_tset_tsethi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        java.lang.String str12 = python2Target1.getAltLabelContextStructName("hi!");
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Hi!Context" + "'", str12, "Hi!Context");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        java.lang.String str5 = python2Target1.getImplicitSetLabel("hi!");
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("\"\\\\n\"Context", false);
        org.antlr.v4.tool.Rule rule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getRuleFunctionContextStructName(rule9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tsethi!" + "'", str5, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\\"\\\\\\\\n\\\"Context" + "'", str8, "\\\"\\\\\\\\n\\\"Context");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseListener();
        int int5 = python2Target1.getSerializedATNSegmentLimit();
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getLoopCounter(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        java.lang.String str9 = python2Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getElementListName("thonContex");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
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
        boolean boolean14 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST16);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(codeGenerator15);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
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
        java.lang.String str12 = python2Target1.getListLabel("_");
        java.util.Set<java.lang.String> strSet13 = python2Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"_tsethi!\\\"\"" + "'", str10, "\"\\\"_tsethi!\\\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_" + "'", str12, "_");
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("");
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\"ython\"", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getElementListName("__tset\"\\\"\\\"\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_" + "'", str6, "_");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ython" + "'", str11, "ython");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        boolean boolean7 = python2Target1.templatesExist();
        boolean boolean8 = python2Target1.wantsBaseVisitor();
        java.lang.String str10 = python2Target1.encodeIntAsCharEscape((int) (byte) 10);
        boolean boolean11 = python2Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\n" + "'", str10, "\\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.getTemplates();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\1" + "'", str11, "\\1");
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.templatesExist();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset_tset4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\"_tsethi!\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "_\\1", true);
        java.lang.String str17 = python2Target1.getImplicitRuleLabel("\"\\\\n\"Context");
        java.lang.String str18 = python2Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python2Target1.getElementName("\"_tsethi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_tset_tset4.5.2.1\"" + "'", str7, "\"_tset_tset4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"_tsethi!\"" + "'", str11, "\"_tsethi!\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"1\"" + "'", str15, "\"1\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_\"\\\\n\"Context" + "'", str17, "_\"\\\\n\"Context");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("_tsethi!");
        java.lang.Class<?> wildcardClass7 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"_tsethi!\"" + "'", str6, "\"_tsethi!\"");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar16 = null;
        int[] intArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray18 = python2Target1.getTokenTypesAsTargetLabels(grammar16, intArray17);
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
        org.junit.Assert.assertNull(codeGenerator15);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        int int5 = python2Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.lang.String str7 = python2Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getElementListName("_\\\"ython\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        java.lang.String str8 = python2Target1.getLanguage();
        java.lang.String str9 = python2Target1.getLanguage();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python2" + "'", str9, "Python2");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "\"\"Context", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getElementName("\\\"\\\\\\\\n\\\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\\"Contex" + "'", str8, "\\\"Contex");
        org.junit.Assert.assertNull(codeGenerator9);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getImplicitSetLabel("Python2");
        org.antlr.v4.tool.Grammar grammar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python2Target1.getTokenTypeAsTargetLabel(grammar9, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsetPython2" + "'", str8, "_tsetPython2");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python2Target1.getElementName("_\\\"ython\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        java.lang.String str5 = python2Target1.getTargetStringLiteralFromString("\\1");
        org.antlr.v4.tool.Grammar grammar6 = null;
        int[] intArray7 = new int[] {};
        java.lang.String[] strArray8 = python2Target1.getTokenTypesAsTargetLabels(grammar6, intArray7);
        boolean boolean9 = python2Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\\\\1\"" + "'", str5, "\"\\\\1\"");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("_tsethi!");
        java.lang.String str6 = python2Target1.encodeIntAsCharEscape((int) 'a');
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getLoopCounter(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tsethi!" + "'", str4, "_tsethi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a" + "'", str6, "a");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str7 = python2Target1.getVersion();
        java.lang.String str9 = python2Target1.getImplicitSetLabel("\"\\\"_tsetPython2\\\"\"Context");
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getTokenTypeAsTargetLabel(grammar11, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset\"\\\"_tsetPython2\\\"\"Context" + "'", str9, "_tset\"\\\"_tsetPython2\\\"\"Context");
        org.junit.Assert.assertNull(codeGenerator10);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("Python2");
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"Python2\"" + "'", str6, "\"Python2\"");
        org.junit.Assert.assertNotNull(sTGroup7);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("\"\\\\n\"");
        int int11 = python2Target1.getSerializedATNSegmentLimit();
        boolean boolean12 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet13 = python2Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\\n\"Context" + "'", str10, "\"\\\\n\"Context");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.getListLabel("\"d\"Context");
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getLoopLabel(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"d\"Context" + "'", str6, "\"d\"Context");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        org.stringtemplate.v4.STGroup sTGroup12 = python2Target1.getTemplates();
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target15 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator14);
        boolean boolean16 = python2Target15.wantsBaseListener();
        boolean boolean17 = python2Target15.wantsBaseVisitor();
        java.lang.String str18 = python2Target15.getVersion();
        org.stringtemplate.v4.STGroup sTGroup19 = python2Target15.getTemplates();
        org.antlr.v4.tool.Grammar grammar20 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target22 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator21);
        boolean boolean23 = python2Target22.wantsBaseListener();
        java.lang.String str25 = python2Target22.getListLabel("");
        java.lang.String str27 = python2Target22.getTargetStringLiteralFromString("");
        java.lang.String str29 = python2Target22.getListLabel("_tset4.5.2.1");
        java.lang.String str30 = python2Target22.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = python2Target22.getCodeGenerator();
        java.lang.String str33 = python2Target22.getTargetStringLiteralFromString("\"ython\"");
        org.antlr.v4.tool.Grammar grammar34 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target36 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator35);
        boolean boolean37 = python2Target36.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar38 = null;
        int[] intArray39 = new int[] {};
        java.lang.String[] strArray40 = python2Target36.getTokenTypesAsTargetLabels(grammar38, intArray39);
        java.lang.String[] strArray41 = python2Target22.getTokenTypesAsTargetLabels(grammar34, intArray39);
        java.lang.String[] strArray42 = python2Target15.getTokenTypesAsTargetLabels(grammar20, intArray39);
        java.lang.String[] strArray43 = python2Target1.getTokenTypesAsTargetLabels(grammar13, intArray39);
        org.antlr.v4.tool.ast.GrammarAST grammarAST44 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str45 = python2Target1.getLoopLabel(grammarAST44);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"\"" + "'", str27, "\"\"");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "_tset4.5.2.1" + "'", str29, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Python2" + "'", str30, "Python2");
        org.junit.Assert.assertNull(codeGenerator31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"\\\"ython\\\"\"" + "'", str33, "\"\\\"ython\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[]");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strArray43);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python2Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = python2Target1.getTemplates();
        boolean boolean5 = python2Target1.templatesExist();
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromString("_tset_tset4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "\"_tsethi!\"", true);
        boolean boolean12 = python2Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getImplicitTokenLabel("\"1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_tset_tset4.5.2.1\"" + "'", str7, "\"_tset_tset4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"_tsethi!\"" + "'", str11, "\"_tsethi!\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
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
        java.lang.String str17 = python2Target1.getImplicitSetLabel("\\0");
        java.lang.String str19 = python2Target1.getListLabel("hi");
        java.util.Set<java.lang.String> strSet20 = python2Target1.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = python2Target1.getElementName("_tset_tset4.5.2.1");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_tset\\0" + "'", str17, "_tset\\0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi" + "'", str19, "hi");
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseListener();
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getElementName("___tsetContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.templatesExist();
        java.lang.String str5 = python2Target1.getLanguage();
        boolean boolean6 = python2Target1.wantsBaseListener();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target7 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator6);
        boolean boolean8 = python2Target7.supportsOverloadedMethods();
        boolean boolean9 = python2Target7.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python2Target7.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "", true);
        java.lang.String str14 = python2Target7.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python2Target7.getCodeGenerator();
        java.lang.String str18 = python2Target7.getTargetStringLiteralFromString("@", false);
        boolean boolean19 = python2Target7.templatesExist();
        java.lang.String str21 = python2Target7.getAltLabelContextStructName("\"\\\"\\\"Context\"");
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target24 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator23);
        boolean boolean25 = python2Target24.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar26 = null;
        int[] intArray27 = new int[] {};
        java.lang.String[] strArray28 = python2Target24.getTokenTypesAsTargetLabels(grammar26, intArray27);
        java.lang.String[] strArray29 = python2Target7.getTokenTypesAsTargetLabels(grammar22, intArray27);
        java.lang.String[] strArray30 = python2Target1.getTokenTypesAsTargetLabels(grammar5, intArray27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = python2Target1.getElementListName("\"ython\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\"" + "'", str13, "\"\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python2" + "'", str14, "Python2");
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "@" + "'", str18, "@");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"\\\"\\\"Context\"Context" + "'", str21, "\"\\\"\\\"Context\"Context");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray30);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        boolean boolean5 = python2Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python2Target1.getCodeGenerator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.getImplicitSetLabel("_tset");
        java.lang.String str11 = python2Target1.getImplicitRuleLabel("___tsetContext");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python2" + "'", str4, "Python2");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset_tset" + "'", str9, "_tset_tset");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "____tsetContext" + "'", str11, "____tsetContext");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python2Target1.getBadWords();
        int int4 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python2Target1.getCodeGenerator();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        boolean boolean7 = python2Target1.wantsBaseListener();
        java.lang.String str8 = python2Target1.getLanguage();
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("_\"\\\\n\"Context");
        org.antlr.v4.tool.Grammar grammar11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getTokenTypeAsTargetLabel(grammar11, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_\\\"\\\\\\\\n\\\"Context\"" + "'", str10, "\"_\\\"\\\\\\\\n\\\"Context\"");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str6 = python2Target1.getVersion();
        java.lang.String str7 = python2Target1.getVersion();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.templatesExist();
        boolean boolean5 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "YthonContext", false);
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "thonContex" + "'", str9, "thonContex");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("\"\\\"\\\"\"Context");
        boolean boolean4 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python2Target1.getLoopLabel(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset\"\\\"\\\"\"Context" + "'", str3, "_tset\"\\\"\\\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        boolean boolean4 = python2Target1.wantsBaseListener();
        java.lang.String str6 = python2Target1.getImplicitRuleLabel("\\1");
        org.stringtemplate.v4.STGroup sTGroup7 = python2Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getElementListName("__4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_\\1" + "'", str6, "_\\1");
        org.junit.Assert.assertNotNull(sTGroup7);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.templatesExist();
        java.lang.String str5 = python2Target1.getLanguage();
        int int6 = python2Target1.getInlineTestSetWordSize();
        int int7 = python2Target1.getSerializedATNSegmentLimit();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python2" + "'", str5, "Python2");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
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
        java.lang.String str15 = python2Target1.getImplicitRuleLabel("_tsetPython2Context");
        org.antlr.v4.tool.Grammar grammar16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python2Target1.getTokenTypeAsTargetLabel(grammar16, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsetd" + "'", str12, "_tsetd");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "__tsetPython2Context" + "'", str15, "__tsetPython2Context");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target1.getListLabel("\"\\\"Python2\\\"\"");
        java.lang.String str10 = python2Target1.encodeIntAsCharEscape((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"Python2\\\"\"" + "'", str8, "\"\\\"Python2\\\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\0" + "'", str10, "\\0");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        int int3 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python2Target1.encodeIntAsCharEscape((int) (byte) 100);
        boolean boolean6 = python2Target1.wantsBaseListener();
        boolean boolean7 = python2Target1.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python2Target1.getImplicitTokenLabel("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "d" + "'", str5, "d");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getVersion();
        java.lang.String str6 = python2Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = python2Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset4.5.2.1" + "'", str6, "_tset4.5.2.1");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        boolean boolean7 = python2Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup8 = python2Target1.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup9 = python2Target1.getTemplates();
        java.lang.String str11 = python2Target1.getImplicitSetLabel("___4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset___4.5.2.1" + "'", str11, "_tset___4.5.2.1");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str5 = python2Target1.getAltLabelContextStructName("\"\"");
        java.util.Set<java.lang.String> strSet6 = python2Target1.getBadWords();
        java.util.Set<java.lang.String> strSet7 = python2Target1.getBadWords();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("_tsetPython2");
        java.lang.String str11 = python2Target1.getImplicitRuleLabel("\"\\\"ython\\\"\"Context");
        java.lang.String str13 = python2Target1.getImplicitSetLabel(" ");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"Context" + "'", str5, "\"\"Context");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"_tsetPython2\"" + "'", str9, "\"_tsetPython2\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_\"\\\"ython\\\"\"Context" + "'", str11, "_\"\\\"ython\\\"\"Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_tset " + "'", str13, "_tset ");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 10);
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromString("\"\"Context");
        int int11 = python2Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target14 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator13);
        boolean boolean15 = python2Target14.wantsBaseListener();
        java.lang.String str17 = python2Target14.getListLabel("");
        java.lang.String str19 = python2Target14.getTargetStringLiteralFromString("");
        java.lang.String str21 = python2Target14.getListLabel("_tset4.5.2.1");
        java.lang.String str22 = python2Target14.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = python2Target14.getCodeGenerator();
        java.lang.String str25 = python2Target14.getTargetStringLiteralFromString("\"ython\"");
        org.antlr.v4.tool.Grammar grammar26 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target28 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator27);
        boolean boolean29 = python2Target28.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar30 = null;
        int[] intArray31 = new int[] {};
        java.lang.String[] strArray32 = python2Target28.getTokenTypesAsTargetLabels(grammar30, intArray31);
        java.lang.String[] strArray33 = python2Target14.getTokenTypesAsTargetLabels(grammar26, intArray31);
        java.lang.String[] strArray34 = python2Target1.getTokenTypesAsTargetLabels(grammar12, intArray31);
        java.lang.String str36 = python2Target1.getAltLabelContextStructName("_tsetd");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\n" + "'", str8, "\\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"\\\"Context\"" + "'", str10, "\"\\\"\\\"Context\"");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\"" + "'", str19, "\"\"");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "_tset4.5.2.1" + "'", str21, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Python2" + "'", str22, "Python2");
        org.junit.Assert.assertNull(codeGenerator23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"\\\"ython\\\"\"" + "'", str25, "\"\\\"ython\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[]");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "_tsetdContext" + "'", str36, "_tsetdContext");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getImplicitSetLabel("\"\\\"\\\"\"Context");
        boolean boolean4 = python2Target1.templatesExist();
        int int5 = python2Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python2Target1.getElementListName("____tsetContextContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset\"\\\"\\\"\"Context" + "'", str3, "_tset\"\\\"\\\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getLoopCounter(grammarAST14);
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
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", true);
        java.lang.String str8 = python2Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python2Target1.getCodeGenerator();
        java.lang.String str12 = python2Target1.getTargetStringLiteralFromString("@", false);
        boolean boolean13 = python2Target1.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python2Target1.getElementName("_4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python2" + "'", str8, "Python2");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "@" + "'", str12, "@");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 10);
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        java.lang.String str11 = python2Target1.getTargetStringLiteralFromString("\"tset_tse\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "\"_tset4.5.2.1\"", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\n" + "'", str8, "\\n");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"tset_tse\\\"\"" + "'", str11, "\"\\\"tset_tse\\\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"_tset4.5.2.1\"" + "'", str15, "\"_tset4.5.2.1\"");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str4 = python2Target1.getLanguage();
        java.util.Set<java.lang.String> strSet5 = python2Target1.getBadWords();
        boolean boolean6 = python2Target1.wantsBaseVisitor();
        int int7 = python2Target1.getInlineTestSetWordSize();
        java.lang.String str9 = python2Target1.getImplicitSetLabel("_tset");
        java.lang.String str11 = python2Target1.getImplicitRuleLabel("\"\\\"ython\\\"\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python2Target1.getElementName("__tsetPython2Context");
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
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        java.lang.String str4 = python2Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\"_\\\"\\\\\\\\n\\\"ContextContext\"", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\\\"\\\\\\\\n\\\"ContextContext" + "'", str9, "_\\\"\\\\\\\\n\\\"ContextContext");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"_tsetPython2\"Context", false);
        java.lang.String str18 = python2Target1.getVersion();
        java.lang.String str19 = python2Target1.getVersion();
        java.lang.Class<?> wildcardClass20 = python2Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tsetd" + "'", str12, "_tsetd");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_tsetPython2\\\"Contex" + "'", str17, "_tsetPython2\\\"Contex");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "4.5.2.1" + "'", str19, "4.5.2.1");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        java.lang.String str10 = python2Target1.getAltLabelContextStructName("\"\\\\n\"");
        boolean boolean11 = python2Target1.supportsOverloadedMethods();
        java.lang.String str12 = python2Target1.getVersion();
        java.lang.String str14 = python2Target1.getImplicitSetLabel("");
        boolean boolean15 = python2Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = python2Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python2Target1.getImplicitTokenLabel("\"\\\\1Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\\n\"Context" + "'", str10, "\"\\\\n\"Context");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset" + "'", str14, "_tset");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(codeGenerator16);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python2Target1.getCodeGenerator();
        java.lang.String str9 = python2Target1.getTargetStringLiteralFromString("\"_tsetPython2\"");
        java.lang.String str11 = python2Target1.getListLabel("\"\\\"\\\"\"");
        java.lang.String str13 = python2Target1.getAltLabelContextStructName("\"ython\"");
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
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"_tsetPython2\\\"\"" + "'", str9, "\"\\\"_tsetPython2\\\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"\\\"\"" + "'", str11, "\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"ython\"Context" + "'", str13, "\"ython\"Context");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        int int9 = python2Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python2Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python2Target1.getElementName("_tset\"_tset4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset4.5.2.1" + "'", str8, "_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNull(codeGenerator10);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        java.lang.String str6 = python2Target1.getTargetStringLiteralFromString("");
        java.lang.String str8 = python2Target1.getListLabel("_tset4.5.2.1");
        boolean boolean9 = python2Target1.wantsBaseVisitor();
        java.lang.String str11 = python2Target1.encodeIntAsCharEscape((int) (byte) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "_hi!", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = python2Target1.getCodeGenerator();
        java.lang.String str17 = python2Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python2Target1.getElementListName("_tset\"\\\"\\\"\"Context");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi" + "'", str15, "hi");
        org.junit.Assert.assertNull(codeGenerator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Python2" + "'", str17, "Python2");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        java.lang.String str12 = python2Target1.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python2Target1.getLoopLabel(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\n" + "'", str12, "\\n");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        java.lang.String str4 = python2Target1.getListLabel("");
        int int5 = python2Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup6 = python2Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python2Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        java.lang.String str12 = python2Target1.encodeIntAsCharEscape((int) (short) 10);
        java.lang.String str14 = python2Target1.getImplicitRuleLabel("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python2Target1.getElementListName("\\\"hi!\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\n" + "'", str12, "\\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_hi!" + "'", str14, "_hi!");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.supportsOverloadedMethods();
        boolean boolean3 = python2Target1.supportsOverloadedMethods();
        boolean boolean4 = python2Target1.supportsOverloadedMethods();
        int int5 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target1.getTargetStringLiteralFromString("_tset\"\\\"_tsetPython2\\\"\"ContextContext", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset\\\"\\\\\\\"_tsetPython2\\\\\\\"\\\"ContextContext" + "'", str8, "_tset\\\"\\\\\\\"_tsetPython2\\\\\\\"\\\"ContextContext");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str2 = python2Target1.getLanguage();
        java.lang.String str4 = python2Target1.getAltLabelContextStructName("6");
        org.stringtemplate.v4.STGroup sTGroup5 = python2Target1.getTemplates();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Python2" + "'", str2, "Python2");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "6Context" + "'", str4, "6Context");
        org.junit.Assert.assertNotNull(sTGroup5);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        boolean boolean2 = python2Target1.wantsBaseListener();
        boolean boolean3 = python2Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        boolean boolean5 = python2Target1.templatesExist();
        int int6 = python2Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python2Target1.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python2Target1.getLoopLabel(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\n" + "'", str8, "\\n");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python2Target python2Target1 = new org.antlr.v4.codegen.target.Python2Target(codeGenerator0);
        java.lang.String str3 = python2Target1.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python2Target1.getCodeGenerator();
        java.lang.String str6 = python2Target1.getListLabel("\"d\"Context");
        org.antlr.v4.tool.Rule rule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python2Target1.getRuleFunctionContextStructName(rule7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"d\"Context" + "'", str6, "\"d\"Context");
    }
}

