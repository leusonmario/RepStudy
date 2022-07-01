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
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        org.antlr.v4.tool.Grammar grammar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getTokenTypeAsTargetLabel(grammar5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python3Target1.getImplicitTokenLabel("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        org.antlr.v4.tool.Rule rule4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python3Target1.getRuleFunctionContextStructName(rule4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getElementListName("_Python3");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"" + "'", str6, "\"hi!\"");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("Python3");
        org.antlr.v4.tool.Grammar grammar10 = null;
        int[] intArray15 = new int[] { 10, (-1), '4', 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray16 = python3Target1.getTokenTypesAsTargetLabels(grammar10, intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_Python3" + "'", str9, "_Python3");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, -1, 52, 97]");
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getElementName("_Python3");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(sTGroup5);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("Python3");
        org.antlr.v4.tool.Rule rule10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getRuleFunctionContextStructName(rule10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_Python3" + "'", str9, "_Python3");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target1.getLoopLabel(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.getTemplates();
        org.antlr.v4.tool.Rule rule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getRuleFunctionContextStructName(rule7);
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
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getElementName("tset\\\"hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        org.antlr.v4.tool.Grammar grammar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getTokenTypeAsTargetLabel(grammar5, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getRuleFunctionContextStructName(ruleFunction8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.Class<?> wildcardClass4 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        java.lang.Class<?> wildcardClass6 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.Grammar grammar7 = null;
        int[] intArray12 = new int[] { 1, '#', (short) 0, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray13 = python3Target1.getTokenTypesAsTargetLabels(grammar7, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 35, 0, 97]");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.getTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST7);
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
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.Class<?> wildcardClass7 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getElementListName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNull(codeGenerator5);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target1.getElementName("\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getElementName("");
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
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        boolean boolean7 = python3Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getLoopCounter(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.getTemplates();
        org.antlr.v4.tool.Grammar grammar7 = null;
        int[] intArray13 = new int[] { ' ', (short) 10, (byte) -1, (-1), (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray14 = python3Target1.getTokenTypesAsTargetLabels(grammar7, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 10, -1, -1, 0]");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        boolean boolean4 = python3Target1.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target1.getLoopCounter(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.encodeIntAsCharEscape((-1));
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
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str6 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getListLabel("tset\\\"hi!");
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
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "tset\\\"hi!" + "'", str8, "tset\\\"hi!");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("", false);
        org.antlr.v4.tool.Grammar grammar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getTokenTypeAsTargetLabel(grammar6, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getTargetStringLiteralFromString("_Python3");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target1.getElementName("_tset\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet10 = python3Target1.getBadWords();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getRuleFunctionContextStructName(ruleFunction11);
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
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.tool.Grammar grammar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getTokenTypeAsTargetLabel(grammar5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.tool.Rule rule5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target1.getRuleFunctionContextStructName(rule5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"Python3\"");
        org.antlr.v4.tool.Grammar grammar12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getTokenTypeAsTargetLabel(grammar12, 1);
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
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\"hi!\"Context");
        org.antlr.v4.tool.Grammar grammar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getTokenTypeAsTargetLabel(grammar10, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"hi!\"Context" + "'", str9, "_\"hi!\"Context");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getImplicitTokenLabel("\"_Python3\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"hi!\"" + "'", str9, "\"hi!\"");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getElementListName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("", false);
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        org.antlr.v4.tool.Rule rule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getRuleFunctionContextStructName(rule7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getListLabel("\"_Python3\"");
        java.lang.String str5 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python3" + "'", str8, "Python3");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getListLabel("\"_Python3\"");
        java.lang.String str5 = python3Target1.getLanguage();
        java.lang.Class<?> wildcardClass6 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target1.getLoopCounter(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getTargetStringLiteralFromString("_Python3");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target1.getElementName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet10 = python3Target1.getBadWords();
        org.antlr.v4.tool.Rule rule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getRuleFunctionContextStructName(rule11);
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
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet10 = python3Target1.getBadWords();
        java.lang.Class<?> wildcardClass11 = strSet10.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\"hi!\"");
        boolean boolean7 = python3Target1.templatesExist();
        int int8 = python3Target1.getSerializedATNSegmentLimit();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"Context" + "'", str6, "\"hi!\"Context");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\"hi!\"Context");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getElementName("\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"hi!\"Context" + "'", str9, "_\"hi!\"Context");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python3Target1.getLoopLabel(grammarAST3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getLoopLabel(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getElementListName("_\"Python3\"");
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
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getImplicitSetLabel("tset\\\"hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getElementName("Python3");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tsettset\\\"hi!" + "'", str7, "_tsettset\\\"hi!");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\"hi!\"");
        boolean boolean7 = python3Target1.templatesExist();
        int int8 = python3Target1.getSerializedATNSegmentLimit();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"Context" + "'", str6, "\"hi!\"Context");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_Python3");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getRuleFunctionContextStructName(ruleFunction8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_Python3\"" + "'", str7, "\"_Python3\"");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("\"\\\"hi!\\\"\"Context", false);
        org.antlr.v4.tool.Grammar grammar12 = null;
        int[] intArray19 = new int[] { (short) 100, (short) 10, (short) 100, 29, (short) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray20 = python3Target1.getTokenTypesAsTargetLabels(grammar12, intArray19);
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
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 10, 100, 29, 100, 100]");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getVersion();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "4.5.2.1", true);
        java.lang.String str6 = python3Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getLoopCounter(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\".5.2.\"" + "'", str5, "\".5.2.\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.getTemplates();
        boolean boolean7 = python3Target1.wantsBaseListener();
        boolean boolean8 = python3Target1.wantsBaseListener();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        boolean boolean4 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "\"hi!\"", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getImplicitTokenLabel("\"\\\"Python3\\\"Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"hi!\"" + "'", str8, "\"hi!\"");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getImplicitSetLabel("\"_Python3\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getElementListName("\"\\\"hi!\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\"_Python3\"" + "'", str7, "_tset\"_Python3\"");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target1.getLoopCounter(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(codeGenerator4);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getImplicitTokenLabel("4.5.2.1");
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
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "tset_\\\"hi!\\\"Contex" + "'", str13, "tset_\\\"hi!\\\"Contex");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        boolean boolean10 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getRuleFunctionContextStructName(ruleFunction11);
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
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getElementName("_\"Python3\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(sTGroup5);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getVersion();
        int int12 = python3Target1.getSerializedATNSegmentLimit();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 29 + "'", int12 == 29);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.getTemplates();
        boolean boolean7 = python3Target1.wantsBaseListener();
        boolean boolean8 = python3Target1.wantsBaseListener();
        java.lang.String str10 = python3Target1.getImplicitSetLabel("_\"Python3\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getElementName("");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_tset_\"Python3\"" + "'", str10, "_tset_\"Python3\"");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        boolean boolean5 = python3Target1.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getImplicitTokenLabel("_tset_\"Python3\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python3Target1.getElementName("_tset_\"Python3\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python3Target1.getTokenTypeAsTargetLabel(grammar2, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.encodeIntAsCharEscape(100);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\\0Context", true);
        int int13 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"0Contex\"" + "'", str12, "\"0Contex\"");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getRuleFunctionContextStructName(ruleFunction11);
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
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.encodeIntAsCharEscape(100);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\\0Context", true);
        org.antlr.v4.tool.Rule rule13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getRuleFunctionContextStructName(rule13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"0Contex\"" + "'", str12, "\"0Contex\"");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_Python3");
        java.lang.String str8 = python3Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getElementListName("_tset_\\\"hi!\\\"Contex");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_Python3\"" + "'", str7, "\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python3" + "'", str8, "Python3");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\"hi!\"");
        boolean boolean7 = python3Target1.templatesExist();
        int int8 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getLoopLabel(grammarAST10);
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.getTemplates();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("\"\\\"hi!\\\"\"Context", false);
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\\"\\\\\\\"hi!\\\\\\\"\\\"Context" + "'", str11, "\\\"\\\\\\\"hi!\\\\\\\"\\\"Context");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getElementListName("_tset_\"Python3\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"hi!\"" + "'", str9, "\"hi!\"");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getTargetStringLiteralFromString("_Python3");
        java.lang.String str5 = python3Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getImplicitTokenLabel("\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str6 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getListLabel("tset\\\"hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getElementName("_tset_\"hi!\"Context");
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
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target1.getElementListName("\"tset\\\"_Python3\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("\"\\\"hi!\\\"\"Context", false);
        java.lang.Class<?> wildcardClass12 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\\"\\\\\\\"hi!\\\\\\\"\\\"Context" + "'", str11, "\\\"\\\\\\\"hi!\\\\\\\"\\\"Context");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
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
        boolean boolean14 = python3Target1.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getImplicitTokenLabel("\"hi!\"Context");
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
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.getTemplates();
        boolean boolean7 = python3Target1.wantsBaseListener();
        org.antlr.v4.tool.Rule rule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getRuleFunctionContextStructName(rule8);
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
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.encodeIntAsCharEscape(100);
        org.antlr.v4.tool.Grammar grammar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getTokenTypeAsTargetLabel(grammar9, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.Rule rule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getRuleFunctionContextStructName(rule7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.Class<?> wildcardClass3 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\"hi!\"Context");
        java.lang.String str10 = python3Target1.getLanguage();
        java.util.Set<java.lang.String> strSet11 = python3Target1.getBadWords();
        java.lang.Class<?> wildcardClass12 = strSet11.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"hi!\"Context" + "'", str9, "_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python3" + "'", str10, "Python3");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("hi!");
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromString("_\"Python3\"", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getElementListName("__\"hi!\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"hi!\"" + "'", str9, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_\\\"Python3\\\"\"" + "'", str12, "\"_\\\"Python3\\\"\"");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("", false);
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getLoopCounter(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "4.5.2.1", true);
        java.lang.String str6 = python3Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getElementListName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\".5.2.\"" + "'", str5, "\".5.2.\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        boolean boolean10 = python3Target1.wantsBaseListener();
        org.antlr.v4.tool.Rule rule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getRuleFunctionContextStructName(rule11);
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
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getListLabel("\"_Python3\"");
        org.antlr.v4.tool.Rule rule5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target1.getRuleFunctionContextStructName(rule5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet10 = python3Target1.getBadWords();
        java.lang.Class<?> wildcardClass11 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getLoopCounter(grammarAST12);
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
        org.junit.Assert.assertNotNull(sTGroup11);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("Python3");
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromString("\"hi!\"", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getElementListName("");
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
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getElementListName("\"\\\"_Python3\\\"\"");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_\"Python3\"" + "'", str13, "_\"Python3\"");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.templatesExist();
        java.util.Set<java.lang.String> strSet10 = python3Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar11 = null;
        int[] intArray13 = new int[] { '#' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray14 = python3Target1.getTokenTypesAsTargetLabels(grammar11, intArray13);
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
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[35]");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
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
        boolean boolean14 = python3Target1.wantsBaseListener();
        org.antlr.v4.tool.Rule rule15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getRuleFunctionContextStructName(rule15);
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
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getVersion();
        int int12 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar13 = null;
        int[] intArray17 = new int[] { (short) 1, ' ', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray18 = python3Target1.getTokenTypesAsTargetLabels(grammar13, intArray17);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 29 + "'", int12 == 29);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 32, 1]");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getImplicitTokenLabel("\\35");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str6 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getListLabel("tset\\\"hi!");
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "tset\\\"hi!" + "'", str8, "tset\\\"hi!");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        boolean boolean7 = python3Target1.templatesExist();
        java.lang.String str8 = python3Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar9 = null;
        int[] intArray11 = new int[] { 64 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray12 = python3Target1.getTokenTypesAsTargetLabels(grammar9, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[64]");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getListLabel("\"_Python3\"");
        java.lang.String str5 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getElementName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python3" + "'", str8, "Python3");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromString("_Python3", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getElementListName("_tset_\"Python3\"");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_Python3\"" + "'", str12, "\"_Python3\"");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "4.5.2.1", true);
        boolean boolean6 = python3Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\".5.2.\"" + "'", str5, "\".5.2.\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.getTemplates();
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar8 = null;
        int[] intArray10 = new int[] { (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray11 = python3Target1.getTokenTypesAsTargetLabels(grammar8, intArray10);
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
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1]");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getImplicitTokenLabel("\"hi!\"");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset" + "'", str12, "_tset");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getTargetStringLiteralFromString("_Python3");
        java.lang.String str5 = python3Target1.getLanguage();
        org.antlr.v4.tool.Rule rule6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getRuleFunctionContextStructName(rule6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python3Target1.getRuleFunctionContextStructName(ruleFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST16);
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
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getImplicitTokenLabel("Python3");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"hi!\"" + "'", str9, "\"hi!\"");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("", false);
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = codeGenerator7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(codeGenerator7);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST13);
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target1.getCodeGenerator();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(codeGenerator10);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "", false);
        java.lang.String str11 = python3Target1.encodeIntAsCharEscape((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getImplicitTokenLabel("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\n" + "'", str11, "\\n");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("Python3");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_Python3" + "'", str9, "_Python3");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\".5.2.\"", false);
        java.lang.String str14 = python3Target1.getListLabel("_tset\"_Python3\"");
        org.antlr.v4.tool.Rule rule15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getRuleFunctionContextStructName(rule15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".5.2." + "'", str12, ".5.2.");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset\"_Python3\"" + "'", str14, "_tset\"_Python3\"");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\"hi!\"Context");
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("_Python3");
        int int12 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getTokenTypeAsTargetLabel(grammar13, (int) (short) 10);
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
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\"hi!\"Context");
        java.lang.String str10 = python3Target1.getLanguage();
        java.lang.String str12 = python3Target1.getListLabel("_tset_\"hi!\"Context");
        int int13 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python3Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getElementListName("\"\"");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNull(codeGenerator14);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getLoopCounter(grammarAST15);
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
        org.junit.Assert.assertNotNull(sTGroup14);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python3Target1.getElementListName("\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getTargetStringLiteralFromString("_Python3");
        java.lang.String str5 = python3Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getImplicitTokenLabel("__tset_\"Python3\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\"hi!\"Context");
        java.lang.String str10 = python3Target1.getLanguage();
        java.lang.String str12 = python3Target1.getListLabel("_tset_\"hi!\"Context");
        org.antlr.v4.tool.Grammar grammar13 = null;
        int[] intArray17 = new int[] { 1, 64, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray18 = python3Target1.getTokenTypesAsTargetLabels(grammar13, intArray17);
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 64, 100]");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        boolean boolean6 = python3Target1.templatesExist();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getRuleFunctionContextStructName(ruleFunction7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getListLabel("\"_Python3\"");
        java.lang.String str5 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        int int9 = python3Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getElementName("_tset\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python3" + "'", str8, "Python3");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("hi!");
        boolean boolean10 = python3Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST11);
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
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"Python3\"");
        org.antlr.v4.tool.Grammar grammar12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getTokenTypeAsTargetLabel(grammar12, 10);
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
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        int int7 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Rule rule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getRuleFunctionContextStructName(rule8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_Python3");
        boolean boolean8 = python3Target1.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar9 = null;
        int[] intArray15 = new int[] { (short) 0, (short) 100, ' ', 64, 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray16 = python3Target1.getTokenTypesAsTargetLabels(grammar9, intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_Python3\"" + "'", str7, "\"_Python3\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 100, 32, 64, 1]");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.Class<?> wildcardClass2 = python3Target1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\"hi!\"Context");
        java.lang.String str10 = python3Target1.getLanguage();
        java.lang.String str12 = python3Target1.getListLabel("_tset_\"hi!\"Context");
        java.lang.String str14 = python3Target1.getListLabel("\\0Context");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"hi!\"Context" + "'", str9, "_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python3" + "'", str10, "Python3");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_\"hi!\"Context" + "'", str12, "_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\0Context" + "'", str14, "\\0Context");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("\"\\\"hi!\\\"\"Context", false);
        java.lang.String str13 = python3Target1.getListLabel("_\"Python3\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getElementName("\"_\\\"hi!\\\"Contex\"");
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
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
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
        boolean boolean13 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar14 = null;
        int[] intArray21 = new int[] { 100, (short) -1, (byte) 0, (short) 100, (short) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray22 = python3Target1.getTokenTypesAsTargetLabels(grammar14, intArray21);
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[100, -1, 0, 100, 1, 10]");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
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
        java.lang.String str14 = python3Target1.encodeIntAsCharEscape(29);
        java.lang.Class<?> wildcardClass15 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "__\"hi!\"Context" + "'", str12, "__\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\35" + "'", str14, "\\35");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "\"hi!\"", true);
        java.lang.String str9 = python3Target1.getListLabel("_tset\\\"hi!\\\"");
        java.lang.Class<?> wildcardClass10 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"hi!\"" + "'", str7, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset\\\"hi!\\\"" + "'", str9, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        boolean boolean6 = python3Target1.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getElementName("_Python3Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        boolean boolean7 = python3Target1.templatesExist();
        java.lang.String str8 = python3Target1.getVersion();
        java.lang.String str10 = python3Target1.getAltLabelContextStructName("tset\\\"hi!");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getRuleFunctionContextStructName(ruleFunction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tset\\\"hi!Context" + "'", str10, "Tset\\\"hi!Context");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("", false);
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.getCodeGenerator();
        java.lang.String str9 = python3Target1.getAltLabelContextStructName("_tset_\"hi!\"Context");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset_\"hi!\"ContextContext" + "'", str9, "_tset_\"hi!\"ContextContext");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        int int8 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\"\"", true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getLoopCounter(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getSerializedATNSegmentLimit();
        int int3 = python3Target1.getInlineTestSetWordSize();
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getImplicitTokenLabel("\"\\\"\\\\\\\"Python3\\\\\\\"Context\\\"\"");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset" + "'", str12, "_tset");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target1.getCodeGenerator();
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\"\\\"_\\\"hi!\\\"Contex\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\"_\\\"hi!\\\"Contex\"Context" + "'", str6, "\"\\\"_\\\"hi!\\\"Contex\"Context");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        boolean boolean4 = python3Target1.wantsBaseListener();
        int int5 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Rule rule6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getRuleFunctionContextStructName(rule6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 29 + "'", int5 == 29);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "", false);
        org.antlr.v4.tool.Rule rule10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getRuleFunctionContextStructName(rule10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python3Target1.getTokenTypeAsTargetLabel(grammar3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.getElementName("\"tset\\\"_Python3\"");
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
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getLoopLabel(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.templatesExist();
        java.lang.String str11 = python3Target1.getListLabel("\"hi!\"Context");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getElementName("\"_\\\"Python3\\\"\"");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"hi!\"Context" + "'", str11, "\"hi!\"Context");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("Python3", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getLoopCounter(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Python3\"" + "'", str10, "\"Python3\"");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
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
        boolean boolean13 = python3Target1.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getLoopLabel(grammarAST14);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getVersion();
        java.lang.Class<?> wildcardClass12 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getLoopCounter(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNull(codeGenerator5);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
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
        org.antlr.v4.codegen.model.RuleFunction ruleFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getRuleFunctionContextStructName(ruleFunction10);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(codeGenerator9);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getElementListName("_\"_\\\"hi!\\\"Contex\"");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(sTGroup10);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getLoopLabel(grammarAST14);
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
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\"hi!\"Context");
        java.lang.String str10 = python3Target1.getLanguage();
        java.lang.String str12 = python3Target1.getListLabel("_tset_\"hi!\"Context");
        int int13 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getTokenTypeAsTargetLabel(grammar14, (int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        int int7 = python3Target1.getInlineTestSetWordSize();
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "\"hi!\"", true);
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"hi!\"" + "'", str7, "\"hi!\"");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        boolean boolean7 = python3Target1.templatesExist();
        java.lang.String str8 = python3Target1.getVersion();
        java.lang.String str10 = python3Target1.getAltLabelContextStructName("tset\\\"hi!");
        org.antlr.v4.tool.Grammar grammar11 = null;
        int[] intArray15 = new int[] { 1, 'a', '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray16 = python3Target1.getTokenTypesAsTargetLabels(grammar11, intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tset\\\"hi!Context" + "'", str10, "Tset\\\"hi!Context");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 97, 52]");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("Python3");
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromString("\"hi!\"", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getLoopLabel(grammarAST13);
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
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
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
        java.lang.String str15 = python3Target1.getImplicitRuleLabel("\"\\\"hi!\\\"\"Context");
        boolean boolean16 = python3Target1.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup17 = python3Target1.getTemplates();
        java.lang.Class<?> wildcardClass18 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"hi!\"Context" + "'", str11, "\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python3" + "'", str13, "Python3");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_\"\\\"hi!\\\"\"Context" + "'", str15, "_\"\\\"hi!\\\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getSerializedATNSegmentLimit();
        int int3 = python3Target1.getInlineTestSetWordSize();
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        boolean boolean6 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
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
        org.antlr.v4.tool.Rule rule17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python3Target1.getRuleFunctionContextStructName(rule17);
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
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("\"\\\"Python3\\\"Context\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python3Target1.getLoopLabel(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\\\"\\\\\\\"Python3\\\\\\\"Context\\\"\"" + "'", str3, "\"\\\"\\\\\\\"Python3\\\\\\\"Context\\\"\"");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getElementName("_tset\"hi!\"");
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
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target1.getCodeGenerator();
        java.lang.String str6 = python3Target1.getListLabel("_tset\"hi!\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getElementListName("\"Python3\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset\"hi!\"" + "'", str6, "_tset\"hi!\"");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getListLabel("\"_Python3\"");
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\\0");
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("_Python3");
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
        java.lang.Class<?> wildcardClass10 = sTGroup9.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0Context" + "'", str6, "\\0Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_Python3Context" + "'", str8, "_Python3Context");
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
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
        boolean boolean13 = python3Target1.wantsBaseVisitor();
        java.lang.Class<?> wildcardClass14 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"Context" + "'", str6, "\"hi!\"Context");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\"hi!\"Context");
        java.lang.String str10 = python3Target1.getLanguage();
        java.lang.String str12 = python3Target1.getListLabel("_tset_\"hi!\"Context");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getElementListName("\"\\\"Python3\\\"Context\"");
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
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getElementName("");
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
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getListLabel("\"_Python3\"");
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\\0");
        boolean boolean7 = python3Target1.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getElementListName("\"0Contex\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0Context" + "'", str6, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "4.5.2.1", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getElementListName("\"_\\\"hi!\\\"Contex\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\".5.2.\"" + "'", str5, "\".5.2.\"");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\"hi!\"");
        java.lang.String str7 = python3Target1.getVersion();
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        java.lang.String str9 = python3Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getTokenTypeAsTargetLabel(grammar10, (int) (byte) 100);
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getListLabel("\"_Python3\"");
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\\0");
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("_Python3");
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
        java.lang.String str10 = python3Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getImplicitTokenLabel("\"0Contex\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0Context" + "'", str6, "\\0Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_Python3Context" + "'", str8, "_Python3Context");
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python3" + "'", str10, "Python3");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target1.getLoopCounter(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str6 = python3Target1.getImplicitSetLabel("_tset_\"hi!\"Context");
        java.lang.String str8 = python3Target1.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getLoopCounter(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset_tset_\"hi!\"Context" + "'", str6, "_tset_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\n" + "'", str8, "\\n");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
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
        org.antlr.v4.tool.Grammar grammar13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getTokenTypeAsTargetLabel(grammar13, (int) (byte) 0);
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
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\"hi!\"");
        java.lang.Class<?> wildcardClass7 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"Context" + "'", str6, "\"hi!\"Context");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getElementName("_");
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
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("Python3");
        java.lang.String str8 = python3Target1.getImplicitSetLabel("_tset_\"Python3\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getImplicitTokenLabel("\"tset\\\"_Python3\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"Python3\"" + "'", str6, "\"Python3\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset_tset_\"Python3\"" + "'", str8, "_tset_tset_\"Python3\"");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\"hi!\"Context");
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("_Python3");
        org.antlr.v4.tool.Rule rule12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getRuleFunctionContextStructName(rule12);
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
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target1.getCodeGenerator();
        java.lang.String str6 = python3Target1.getListLabel("_tset\"hi!\"");
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
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset\"hi!\"" + "'", str6, "_tset\"hi!\"");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getLanguage();
        org.antlr.v4.tool.Rule rule6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getRuleFunctionContextStructName(rule6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        int int8 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target1.getCodeGenerator();
        java.lang.String str6 = python3Target1.getListLabel("_tset\"hi!\"");
        java.util.Set<java.lang.String> strSet7 = python3Target1.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getImplicitTokenLabel("_\"\\\"hi!\\\"\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset\"hi!\"" + "'", str6, "_tset\"hi!\"");
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
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
        boolean boolean13 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Rule rule14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getRuleFunctionContextStructName(rule14);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset" + "'", str12, "_tset");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\"hi!\"Context");
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"hi!\"Context" + "'", str9, "_\"hi!\"Context");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getSerializedATNSegmentLimit();
        int int3 = python3Target1.getInlineTestSetWordSize();
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getElementName("\"\\\"hi!\\\"\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertNull(codeGenerator5);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python3Target1.getElementListName("_tset\"hi!\"");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "__tset_\"Python3\"" + "'", str18, "__tset_\"Python3\"");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target1.getLoopLabel(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getLoopLabel(grammarAST15);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
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
        org.antlr.v4.tool.Grammar grammar14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getTokenTypeAsTargetLabel(grammar14, 1);
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
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getSerializedATNSegmentLimit();
        int int3 = python3Target1.getInlineTestSetWordSize();
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getElementListName("@");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertNull(codeGenerator5);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getImplicitSetLabel("_\"hi!\"Context");
        java.lang.String str9 = python3Target1.getImplicitSetLabel("_tset");
        org.antlr.v4.tool.Grammar grammar10 = null;
        int[] intArray17 = new int[] { (byte) 100, (byte) 10, 29, (short) 0, (byte) 1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray18 = python3Target1.getTokenTypesAsTargetLabels(grammar10, intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset_\"hi!\"Context" + "'", str7, "_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset_tset" + "'", str9, "_tset_tset");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 10, 29, 0, 1, 32]");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("\"\\\"Python3\\\"Context\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\\\"\\\\\\\"Python3\\\\\\\"Context\\\"\"" + "'", str3, "\"\\\"\\\\\\\"Python3\\\\\\\"Context\\\"\"");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getElementName("_tset_\"Python3\"");
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
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
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
        java.lang.String str14 = python3Target1.encodeIntAsCharEscape(29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getElementListName("");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\35" + "'", str14, "\\35");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        boolean boolean11 = python3Target1.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getElementListName("d");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        int int8 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python3Target1.getImplicitRuleLabel("_tset_\"hi!\"ContextContext");
        org.antlr.v4.tool.Rule rule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getRuleFunctionContextStructName(rule11);
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
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        boolean boolean7 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.encodeIntAsCharEscape((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(sTGroup8);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        boolean boolean7 = python3Target1.templatesExist();
        java.lang.String str8 = python3Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.util.Set<java.lang.String> strSet4 = python3Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getTokenTypeAsTargetLabel(grammar5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\"hi!\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getImplicitTokenLabel("\"4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"Context" + "'", str6, "\"hi!\"Context");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getListLabel("\"_Python3\"");
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\\0");
        boolean boolean7 = python3Target1.templatesExist();
        java.util.Set<java.lang.String> strSet8 = python3Target1.getBadWords();
        java.lang.Class<?> wildcardClass9 = strSet8.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0Context" + "'", str6, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"Python3\"");
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("tset_\\\"hi!\\\"Contex", true);
        boolean boolean15 = python3Target1.templatesExist();
        java.lang.String str17 = python3Target1.getImplicitRuleLabel(" ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"Python3\"Context" + "'", str11, "\"Python3\"Context");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"tset_\\\\\\\"hi!\\\\\\\"Contex\"" + "'", str14, "\"tset_\\\\\\\"hi!\\\\\\\"Contex\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_ " + "'", str17, "_ ");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("", false);
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getTokenTypeAsTargetLabel(grammar7, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
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
        org.antlr.v4.codegen.model.RuleFunction ruleFunction16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.getRuleFunctionContextStructName(ruleFunction16);
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
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\".5.2.\"", false);
        org.antlr.v4.tool.Rule rule13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getRuleFunctionContextStructName(rule13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".5.2." + "'", str12, ".5.2.");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\"hi!\"");
        boolean boolean7 = python3Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar8 = null;
        int[] intArray15 = new int[] { ' ', (byte) 10, (byte) 100, (byte) 100, (short) 0, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray16 = python3Target1.getTokenTypesAsTargetLabels(grammar8, intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"Context" + "'", str6, "\"hi!\"Context");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 10, 100, 100, 0, -1]");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str6 = python3Target1.getImplicitSetLabel("_tset_\"hi!\"Context");
        java.lang.String str8 = python3Target1.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getLoopLabel(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset_tset_\"hi!\"Context" + "'", str6, "_tset_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\n" + "'", str8, "\\n");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        boolean boolean4 = python3Target1.wantsBaseListener();
        java.lang.String str5 = python3Target1.getVersion();
        boolean boolean6 = python3Target1.templatesExist();
        java.lang.Class<?> wildcardClass7 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\"hi!\"Context");
        java.lang.String str10 = python3Target1.getLanguage();
        java.lang.String str12 = python3Target1.getListLabel("_tset_\"hi!\"Context");
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "_tset\"\\\"Python3\\\"Context\"", false);
        java.lang.String str19 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1", true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"hi!\"Context" + "'", str9, "_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python3" + "'", str10, "Python3");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_\"hi!\"Context" + "'", str12, "_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "tset\\\"\\\"Python3\\\"Context" + "'", str16, "tset\\\"\\\"Python3\\\"Context");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"_tset4.5.2.1\"" + "'", str19, "\"_tset4.5.2.1\"");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.encodeIntAsCharEscape(100);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\\0Context", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getLoopCounter(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"0Contex\"" + "'", str12, "\"0Contex\"");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("\"\\\"hi!\\\"\"Context", false);
        java.lang.String str13 = python3Target1.getListLabel("_\"Python3\"");
        boolean boolean14 = python3Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getElementName("__\"\\\"_\\\"hi!\\\"Contex\"Context");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
        org.antlr.v4.tool.Grammar grammar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getTokenTypeAsTargetLabel(grammar10, (int) '4');
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(codeGenerator9);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST19);
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
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\".5.2.\"", false);
        java.lang.String str13 = python3Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getAltLabelContextStructName("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".5.2." + "'", str12, ".5.2.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python3" + "'", str13, "Python3");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
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
        boolean boolean13 = python3Target1.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getElementName("\"\\\"tset\\\\\\\"_Python3\\\"\"");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
        java.lang.String str13 = python3Target1.encodeIntAsCharEscape(64);
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "_\"_\\\"hi!\\\"Contex\"", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target1.getLoopLabel(grammarAST18);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "@" + "'", str13, "@");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\\\"_\\\"hi!\\\"Contex\"" + "'", str17, "\"\\\"_\\\"hi!\\\"Contex\"");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
        java.lang.String str15 = python3Target1.getImplicitSetLabel("4.5.2.1");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.getElementListName("tset\\\"\\\"Python3\\\"Context");
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
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "tset_\\\"hi!\\\"Contex" + "'", str13, "tset_\\\"hi!\\\"Contex");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset4.5.2.1" + "'", str15, "_tset4.5.2.1");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
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
        java.lang.String str15 = python3Target1.getImplicitRuleLabel("\"\\\"hi!\\\"\"Context");
        boolean boolean16 = python3Target1.supportsOverloadedMethods();
        java.lang.String str18 = python3Target1.getListLabel("_tset4.5.2.1");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python3Target1.getImplicitTokenLabel("__tset_\"Python3\"");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"hi!\"Context" + "'", str11, "\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python3" + "'", str13, "Python3");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_\"\\\"hi!\\\"\"Context" + "'", str15, "_\"\\\"hi!\\\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset4.5.2.1" + "'", str18, "_tset4.5.2.1");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("hi!");
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"\\\"hi!\\\"\"Context");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"hi!\\\"\"ContextContext" + "'", str11, "\"\\\"hi!\\\"\"ContextContext");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "", false);
        java.lang.String str11 = python3Target1.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getLoopLabel(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\n" + "'", str11, "\\n");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        boolean boolean4 = python3Target1.wantsBaseListener();
        int int5 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString(" ");
        org.antlr.v4.tool.Rule rule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getRuleFunctionContextStructName(rule8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 29 + "'", int5 == 29);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\" \"" + "'", str7, "\" \"");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        boolean boolean4 = python3Target1.wantsBaseListener();
        java.lang.String str5 = python3Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getLoopLabel(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST10);
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
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python3Target1.getElementName("");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "__tset_\"Python3\"" + "'", str18, "__tset_\"Python3\"");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\"hi!\"");
        java.lang.String str7 = python3Target1.getVersion();
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet9 = python3Target1.getBadWords();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getSerializedATNSegmentLimit();
        int int3 = python3Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python3Target1.getImplicitTokenLabel("\"hi!\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        boolean boolean11 = python3Target1.wantsBaseListener();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("Python3", true);
        java.lang.Class<?> wildcardClass11 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Python3\"" + "'", str10, "\"Python3\"");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\"hi!\"Context");
        java.lang.String str10 = python3Target1.getLanguage();
        java.lang.String str12 = python3Target1.getListLabel("_tset_\"hi!\"Context");
        int int13 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python3Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = codeGenerator14.getClass();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNull(codeGenerator14);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str6 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("_tset_\"Python3\"");
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset_\"Python3\"Context" + "'", str8, "_tset_\"Python3\"Context");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("\"\\\"hi!\\\"\"Context", false);
        java.lang.String str13 = python3Target1.getListLabel("_\"Python3\"");
        boolean boolean14 = python3Target1.wantsBaseVisitor();
        java.lang.String str16 = python3Target1.getImplicitRuleLabel("_\\\"\\\\\\\"hi!\\\\\\\"\\\"Context");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\\"\\\\\\\"hi!\\\\\\\"\\\"Context" + "'", str11, "\\\"\\\\\\\"hi!\\\\\\\"\\\"Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_\"Python3\"" + "'", str13, "_\"Python3\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "__\\\"\\\\\\\"hi!\\\\\\\"\\\"Context" + "'", str16, "__\\\"\\\\\\\"hi!\\\\\\\"\\\"Context");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getImplicitRuleLabel("_\"hi!\"Context");
        org.antlr.v4.tool.Grammar grammar4 = null;
        int[] intArray7 = new int[] { 'a', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = python3Target1.getTokenTypesAsTargetLabels(grammar4, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "__\"hi!\"Context" + "'", str3, "__\"hi!\"Context");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[97, 1]");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "4.5.2.1", true);
        java.lang.String str6 = python3Target1.getVersion();
        int int7 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Rule rule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getRuleFunctionContextStructName(rule8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\".5.2.\"" + "'", str5, "\".5.2.\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
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
        java.lang.Class<?> wildcardClass13 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"hi!\"Context" + "'", str11, "\"hi!\"Context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
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
        org.antlr.v4.tool.Grammar grammar15 = null;
        int[] intArray19 = new int[] { (byte) 10, (-1), (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray20 = python3Target1.getTokenTypesAsTargetLabels(grammar15, intArray19);
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
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, -1, 10]");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        boolean boolean5 = python3Target1.wantsBaseListener();
        int int6 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getLoopCounter(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.getImplicitTokenLabel("_tset\"tset\\\"_Python3\"");
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
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
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
        java.lang.String str15 = python3Target1.getImplicitRuleLabel("\"\\\"hi!\\\"\"Context");
        java.lang.Class<?> wildcardClass16 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"hi!\"Context" + "'", str11, "\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python3" + "'", str13, "Python3");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_\"\\\"hi!\\\"\"Context" + "'", str15, "_\"\\\"hi!\\\"\"Context");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.encodeIntAsCharEscape(100);
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getImplicitTokenLabel("a");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        int int8 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python3Target1.getImplicitRuleLabel("_tset_\"hi!\"ContextContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target1.getCodeGenerator();
        java.lang.Class<?> wildcardClass12 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "__tset_\"hi!\"ContextContext" + "'", str10, "__tset_\"hi!\"ContextContext");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
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
        org.antlr.v4.tool.Grammar grammar14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getTokenTypeAsTargetLabel(grammar14, (int) (short) -1);
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
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getVersion();
        int int12 = python3Target1.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getElementName("__\\\"\\\\\\\"hi!\\\\\\\"\\\"Context");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 29 + "'", int12 == 29);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
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
        java.lang.String str16 = python3Target1.getListLabel("\"\\\"tset\\\\\\\"_Python3\\\"\"");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_Python3" + "'", str9, "_Python3");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str12, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29 + "'", int13 == 29);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python3" + "'", str14, "Python3");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\\"tset\\\\\\\"_Python3\\\"\"" + "'", str16, "\"\\\"tset\\\\\\\"_Python3\\\"\"");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getLanguage();
        boolean boolean6 = python3Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getListLabel("\"_Python3\"");
        java.lang.String str5 = python3Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        int int7 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getTokenTypeAsTargetLabel(grammar8, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\"hi!\"");
        boolean boolean7 = python3Target1.templatesExist();
        int int8 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"\\\"hi!\\\"\"");
        java.lang.String str13 = python3Target1.getImplicitRuleLabel("tset_\\\"hi!\\\"Contex");
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "_\"\\\"_Python3\\\"\"", true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"Context" + "'", str6, "\"hi!\"Context");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"hi!\\\"\"Context" + "'", str11, "\"\\\"hi!\\\"\"Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_tset_\\\"hi!\\\"Contex" + "'", str13, "_tset_\\\"hi!\\\"Contex");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\\\"\\\"_Python3\\\"\"" + "'", str17, "\"\\\"\\\"_Python3\\\"\"");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\".5.2.\"", false);
        java.lang.String str13 = python3Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".5.2." + "'", str12, ".5.2.");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python3" + "'", str13, "Python3");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
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
        java.lang.String str15 = python3Target1.getAltLabelContextStructName("_\\\"\\\\\\\"hi!\\\\\\\"\\\"Context");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.getElementName("\"_\\\"hi!\\\"Contex\"");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_\\\"\\\\\\\"hi!\\\\\\\"\\\"ContextContext" + "'", str15, "_\\\"\\\\\\\"hi!\\\\\\\"\\\"ContextContext");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        boolean boolean5 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getLoopLabel(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getListLabel("\"_Python3\"");
        java.lang.String str5 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        int int9 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str11 = python3Target1.encodeIntAsCharEscape((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getElementName("\"hi!\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python3" + "'", str8, "Python3");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "a" + "'", str11, "a");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
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
        java.lang.String str13 = python3Target1.encodeIntAsCharEscape(64);
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "_\"_\\\"hi!\\\"Contex\"", true);
        java.lang.String str19 = python3Target1.getImplicitSetLabel("_tset_\"Python3\"");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "@" + "'", str13, "@");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\\\"_\\\"hi!\\\"Contex\"" + "'", str17, "\"\\\"_\\\"hi!\\\"Contex\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_tset_tset_\"Python3\"" + "'", str19, "_tset_tset_\"Python3\"");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
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
        int int13 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar15 = null;
        int[] intArray21 = new int[] { (short) 0, (short) 0, '#', 1, '4' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray22 = python3Target1.getTokenTypesAsTargetLabels(grammar15, intArray21);
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_tset_tset_\\\"hi!\\\"Context\"" + "'", str12, "\"_tset_tset_\\\"hi!\\\"Context\"");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29 + "'", int13 == 29);
        org.junit.Assert.assertNull(codeGenerator14);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, 0, 35, 1, 52]");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.getTemplates();
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
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
        org.junit.Assert.assertNull(codeGenerator8);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
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
        int int13 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getTokenTypeAsTargetLabel(grammar14, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29 + "'", int13 == 29);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        boolean boolean6 = python3Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getTokenTypeAsTargetLabel(grammar7, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getListLabel("\"_Python3\"");
        java.lang.String str5 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        int int9 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str11 = python3Target1.encodeIntAsCharEscape((int) 'a');
        java.lang.Class<?> wildcardClass12 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python3" + "'", str8, "Python3");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "a" + "'", str11, "a");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        boolean boolean8 = python3Target1.templatesExist();
        org.antlr.v4.tool.Rule rule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getRuleFunctionContextStructName(rule9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getElementListName("\"\\\\35\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getListLabel("\"_Python3\"");
        java.lang.String str5 = python3Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("_Python3Context");
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("\"hi!\"Context", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getElementName(" ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "__Python3Context" + "'", str8, "__Python3Context");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"hi!\\\"Context\"" + "'", str11, "\"\\\"hi!\\\"Context\"");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getSerializedATNSegmentLimit();
        int int3 = python3Target1.getInlineTestSetWordSize();
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target1.getElementName("\"_tset\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("hi!");
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"\\\"hi!\\\"\"Context");
        boolean boolean12 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getLoopCounter(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"hi!\"" + "'", str9, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"hi!\\\"\"ContextContext" + "'", str11, "\"\\\"hi!\\\"\"ContextContext");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        boolean boolean8 = python3Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getLoopLabel(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\"hi!\"Context");
        java.lang.String str10 = python3Target1.getLanguage();
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"hi!\"Context" + "'", str9, "_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python3" + "'", str10, "Python3");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass4 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
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
        java.lang.String str13 = python3Target1.encodeIntAsCharEscape(64);
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "_\"_\\\"hi!\\\"Contex\"", true);
        java.lang.String str19 = python3Target1.getImplicitSetLabel("_tset_\"Python3\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python3Target1.getLoopLabel(grammarAST20);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "@" + "'", str13, "@");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\\\"_\\\"hi!\\\"Contex\"" + "'", str17, "\"\\\"_\\\"hi!\\\"Contex\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_tset_tset_\"Python3\"" + "'", str19, "_tset_tset_\"Python3\"");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        int int6 = python3Target1.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getElementName("\\0ContextContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 29 + "'", int6 == 29);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.templatesExist();
        java.lang.String str11 = python3Target1.getListLabel("\"hi!\"Context");
        java.lang.String str13 = python3Target1.getListLabel("_tset");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getElementListName("_tset__\"\\\"_\\\"hi!\\\"Contex\"Context");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"hi!\"Context" + "'", str11, "\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_tset" + "'", str13, "_tset");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        int int8 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python3Target1.getImplicitRuleLabel("_tset_\"hi!\"ContextContext");
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getImplicitTokenLabel("@");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        boolean boolean3 = python3Target1.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python3Target1.getLoopCounter(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getListLabel("\"_Python3\"");
        java.lang.String str5 = python3Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("_Python3Context");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getElementListName("\"\\\\35\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "__Python3Context" + "'", str8, "__Python3Context");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        boolean boolean6 = python3Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar8 = null;
        int[] intArray10 = new int[] { (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray11 = python3Target1.getTokenTypesAsTargetLabels(grammar8, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\"hi!\"");
        boolean boolean7 = python3Target1.templatesExist();
        int int8 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"\\\"hi!\\\"\"");
        java.lang.String str13 = python3Target1.getImplicitRuleLabel("tset_\\\"hi!\\\"Contex");
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromString("\"\\\"_Python3\\\"\"ContextContext", true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"Context" + "'", str6, "\"hi!\"Context");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"hi!\\\"\"Context" + "'", str11, "\"\\\"hi!\\\"\"Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_tset_\\\"hi!\\\"Contex" + "'", str13, "_tset_\\\"hi!\\\"Contex");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\\"\\\\\\\"_Python3\\\\\\\"\\\"ContextContext\"" + "'", str16, "\"\\\"\\\\\\\"_Python3\\\\\\\"\\\"ContextContext\"");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getListLabel("\"_Python3\"");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target1.getRuleFunctionContextStructName(ruleFunction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "4.5.2.1", true);
        java.lang.String str6 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("\"\\\"_\\\"hi!\\\"Contex\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getImplicitTokenLabel("__Python3Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\".5.2.\"" + "'", str5, "\".5.2.\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_\"\\\"_\\\"hi!\\\"Contex\"" + "'", str8, "_\"\\\"_\\\"hi!\\\"Contex\"");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getLanguage();
        org.antlr.v4.tool.Rule rule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getRuleFunctionContextStructName(rule8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"Python3\"");
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("tset_\\\"hi!\\\"Contex", true);
        boolean boolean15 = python3Target1.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.getElementName("_tset_\"Python3\"Context");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"tset_\\\\\\\"hi!\\\\\\\"Contex\"" + "'", str14, "\"tset_\\\\\\\"hi!\\\\\\\"Contex\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "\"hi!\"", true);
        java.lang.String str9 = python3Target1.getListLabel("_tset\\\"hi!\\\"");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"hi!\"" + "'", str7, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset\\\"hi!\\\"" + "'", str9, "_tset\\\"hi!\\\"");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
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
        boolean boolean13 = python3Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getElementListName("_");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset" + "'", str12, "_tset");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet10 = python3Target1.getBadWords();
        java.lang.String str12 = python3Target1.encodeIntAsCharEscape((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getImplicitTokenLabel("\"\\\"\\\\\\\"Python3\\\\\\\"Context\\\"\"");
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
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\n" + "'", str12, "\\n");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getElementListName("\"hi!\"Context");
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
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        int int7 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet8 = python3Target1.getBadWords();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        boolean boolean7 = python3Target1.templatesExist();
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("_\"\\\"hi!\\\"\"Context", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getElementListName("\"\\\"hi!\\\"\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_\\\"\\\\\\\"hi!\\\\\\\"\\\"Context" + "'", str10, "_\\\"\\\\\\\"hi!\\\\\\\"\\\"Context");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getLoopLabel(grammarAST14);
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
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        int int7 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet8 = python3Target1.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getElementName("\\\"\\\\\\\"hi!\\\\\\\"\\\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getImplicitSetLabel("_\"hi!\"Context");
        java.lang.String str9 = python3Target1.getImplicitSetLabel("_tset");
        java.lang.String str11 = python3Target1.getImplicitSetLabel("\"\\\"Python3\\\"Context\"");
        int int12 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar13 = null;
        int[] intArray20 = new int[] { (short) 1, (byte) 1, (short) 1, 100, (byte) 0, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray21 = python3Target1.getTokenTypesAsTargetLabels(grammar13, intArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset_\"hi!\"Context" + "'", str7, "_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset_tset" + "'", str9, "_tset_tset");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset\"\\\"Python3\\\"Context\"" + "'", str11, "_tset\"\\\"Python3\\\"Context\"");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 29 + "'", int12 == 29);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 1, 1, 100, 0, -1]");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
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
        org.antlr.v4.tool.Rule rule16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.getRuleFunctionContextStructName(rule16);
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
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.getTemplates();
        boolean boolean11 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("hi!");
        boolean boolean10 = python3Target1.templatesExist();
        java.lang.String str12 = python3Target1.getImplicitRuleLabel("tset_\\\"hi!\\\"Contex");
        java.lang.Class<?> wildcardClass13 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"hi!\"" + "'", str9, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_\\\"hi!\\\"Contex" + "'", str12, "_tset_\\\"hi!\\\"Contex");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromString("_Python3", true);
        org.antlr.v4.tool.Grammar grammar13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getTokenTypeAsTargetLabel(grammar13, (int) (short) 10);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_Python3\"" + "'", str12, "\"_Python3\"");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        boolean boolean5 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getLanguage();
        int int8 = python3Target1.getInlineTestSetWordSize();
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("\"\\\"hi!\\\"\"Context", false);
        java.lang.String str13 = python3Target1.getListLabel("_\"Python3\"");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getRuleFunctionContextStructName(ruleFunction14);
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
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("", false);
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        java.lang.String str8 = python3Target1.getListLabel("\\0");
        java.lang.String str10 = python3Target1.getAltLabelContextStructName("_\"Python3\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getLoopLabel(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\0" + "'", str8, "\\0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_\"Python3\"Context" + "'", str10, "_\"Python3\"Context");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        boolean boolean4 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "\"hi!\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "_\\0", false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"hi!\"" + "'", str8, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str6 = python3Target1.getImplicitSetLabel("_tset_\"hi!\"Context");
        java.lang.String str8 = python3Target1.encodeIntAsCharEscape((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getImplicitTokenLabel("\"_\\\"hi!\\\"Contex\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset_tset_\"hi!\"Context" + "'", str6, "_tset_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\n" + "'", str8, "\\n");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("", false);
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        java.util.Set<java.lang.String> strSet7 = python3Target1.getBadWords();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\"@\"");
        java.lang.Class<?> wildcardClass10 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"@\"" + "'", str9, "_\"@\"");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("\"\\\"Python3\\\"Context\"");
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target1.getElementListName("_tset\"\\\"_\\\"hi!\\\"Contex\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\\\"\\\\\\\"Python3\\\\\\\"Context\\\"\"" + "'", str3, "\"\\\"\\\\\\\"Python3\\\\\\\"Context\\\"\"");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "4.5.2.1", true);
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("\"tset\\\"_Python3\"");
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getImplicitTokenLabel("\"\\\"\\\\\\\"_Python3\\\\\\\"\\\"ContextContext\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\".5.2.\"" + "'", str5, "\".5.2.\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"tset\\\\\\\"_Python3\\\"\"" + "'", str7, "\"\\\"tset\\\\\\\"_Python3\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup8);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("\"\\\"Python3\\\"Context\"");
        boolean boolean4 = python3Target1.templatesExist();
        boolean boolean5 = python3Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getLoopCounter(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\\\"\\\\\\\"Python3\\\\\\\"Context\\\"\"" + "'", str3, "\"\\\"\\\\\\\"Python3\\\\\\\"Context\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "4.5.2.1", true);
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("\"tset\\\"_Python3\"");
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\".5.2.\"" + "'", str5, "\".5.2.\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"tset\\\\\\\"_Python3\\\"\"" + "'", str7, "\"\\\"tset\\\\\\\"_Python3\\\"\"");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
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
        boolean boolean17 = python3Target1.templatesExist();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("hi!");
        boolean boolean10 = python3Target1.templatesExist();
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass12 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"hi!\"" + "'", str9, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str6 = python3Target1.getImplicitSetLabel("_tset_\"hi!\"Context");
        java.lang.String str8 = python3Target1.getListLabel("_tsettset\\\"hi!");
        java.lang.String str10 = python3Target1.getAltLabelContextStructName("\"\\\"_Python3\\\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getTokenTypeAsTargetLabel(grammar12, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset_tset_\"hi!\"Context" + "'", str6, "_tset_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsettset\\\"hi!" + "'", str8, "_tsettset\\\"hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"_Python3\\\"\"Context" + "'", str10, "\"\\\"_Python3\\\"\"Context");
        org.junit.Assert.assertNull(codeGenerator11);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getListLabel("\"_Python3\"");
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\\0");
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("_Python3");
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0Context" + "'", str6, "\\0Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_Python3Context" + "'", str8, "_Python3Context");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
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
        org.antlr.v4.codegen.model.RuleFunction ruleFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getRuleFunctionContextStructName(ruleFunction14);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
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
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("d", false);
        org.stringtemplate.v4.STGroup sTGroup16 = python3Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "d" + "'", str15, "d");
        org.junit.Assert.assertNotNull(sTGroup16);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\\"\\\\\\\"hi!\\\\\\\"\\\"Context\"" + "'", str16, "\"\\\"\\\\\\\"hi!\\\\\\\"\\\"Context\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str3 = python3Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python3" + "'", str3, "Python3");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
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
        org.antlr.v4.tool.Grammar grammar12 = null;
        int[] intArray15 = new int[] { 10, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray16 = python3Target1.getTokenTypesAsTargetLabels(grammar12, intArray15);
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
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 1]");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
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
        org.antlr.v4.tool.Grammar grammar14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getTokenTypeAsTargetLabel(grammar14, (int) (byte) 10);
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
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
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
        int int15 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean16 = python3Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"0Contex\"" + "'", str12, "\"0Contex\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_Python3");
        java.lang.String str8 = python3Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.getTemplates();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_Python3\"" + "'", str7, "\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python3" + "'", str8, "Python3");
        org.junit.Assert.assertNotNull(sTGroup9);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.getTemplates();
        java.lang.Class<?> wildcardClass7 = sTGroup6.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        int int7 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python3Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.encodeIntAsCharEscape((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("Python3", true);
        java.lang.String str12 = python3Target1.getImplicitRuleLabel("\"Python3\"");
        java.lang.String str13 = python3Target1.getLanguage();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getRuleFunctionContextStructName(ruleFunction14);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python3" + "'", str13, "Python3");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        boolean boolean6 = python3Target1.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.getCodeGenerator();
        int int8 = python3Target1.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getElementListName("d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.encodeIntAsCharEscape((-1));
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.getTemplates();
        boolean boolean7 = python3Target1.wantsBaseListener();
        boolean boolean8 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        java.lang.Class<?> wildcardClass10 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str6 = python3Target1.getImplicitSetLabel("_tset_\"hi!\"Context");
        java.lang.String str8 = python3Target1.getListLabel("_tsettset\\\"hi!");
        java.lang.String str10 = python3Target1.getAltLabelContextStructName("\"\\\"_Python3\\\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target1.getCodeGenerator();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset_tset_\"hi!\"Context" + "'", str6, "_tset_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tsettset\\\"hi!" + "'", str8, "_tsettset\\\"hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"_Python3\\\"\"Context" + "'", str10, "\"\\\"_Python3\\\"\"Context");
        org.junit.Assert.assertNull(codeGenerator11);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
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
        org.antlr.v4.tool.Rule rule18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target1.getRuleFunctionContextStructName(rule18);
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
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getTargetStringLiteralFromString("_Python3");
        boolean boolean5 = python3Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getElementName("_\\\"\\\\\\\"hi!\\\\\\\"\\\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        int int8 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python3Target1.getImplicitRuleLabel("_tset_\"hi!\"ContextContext");
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getElementListName("tset\\\"\\\"Python3\\\"Context");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST13);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"hi!\"Context" + "'", str11, "\"hi!\"Context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getElementName(".5.2.");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
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
        java.lang.String str13 = python3Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getElementName("\"\\\"hi!\\\"\"Context");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("Python3");
        boolean boolean7 = python3Target1.templatesExist();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getRuleFunctionContextStructName(ruleFunction8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"Python3\"" + "'", str6, "\"Python3\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.getTemplates();
        java.lang.String str8 = python3Target1.getImplicitSetLabel("");
        boolean boolean9 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getRuleFunctionContextStructName(ruleFunction10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
        java.lang.String str13 = python3Target1.encodeIntAsCharEscape(64);
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "_\"_\\\"hi!\\\"Contex\"", true);
        java.lang.Class<?> wildcardClass18 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "set\\\"hi" + "'", str11, "set\\\"hi");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "@" + "'", str13, "@");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\\\"_\\\"hi!\\\"Contex\"" + "'", str17, "\"\\\"_\\\"hi!\\\"Contex\"");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python3Target1.getLoopLabel(grammarAST19);
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
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        int int8 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python3Target1.getImplicitRuleLabel("_tset_\"hi!\"ContextContext");
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target1.getTemplates();
        java.lang.String str12 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target1.getCodeGenerator();
        java.util.Set<java.lang.String> strSet14 = python3Target1.getBadWords();
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target1.getTemplates();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "__tset_\"hi!\"ContextContext" + "'", str10, "__tset_\"hi!\"ContextContext");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(sTGroup15);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python3Target1.getImplicitTokenLabel("\\\\\\\"tset\\\\\\\\\\\\\\\"_Python3\\\\\\\"");
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
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getListLabel("\"_Python3\"");
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\\0");
        java.lang.String str7 = python3Target1.getLanguage();
        org.antlr.v4.tool.Grammar grammar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getTokenTypeAsTargetLabel(grammar8, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0Context" + "'", str6, "\\0Context");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
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
        boolean boolean12 = python3Target1.wantsBaseListener();
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\" \"");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getRuleFunctionContextStructName(ruleFunction15);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\" \\\"\"" + "'", str14, "\"\\\" \\\"\"");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
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
        org.antlr.v4.tool.Grammar grammar19 = null;
        int[] intArray24 = new int[] { (short) 1, 0, 29, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray25 = python3Target1.getTokenTypesAsTargetLabels(grammar19, intArray24);
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
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 0, 29, 10]");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("hi!");
        boolean boolean10 = python3Target1.templatesExist();
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getTokenTypeAsTargetLabel(grammar12, 10);
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
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target1.getElementListName("\"\\\"_\\\"hi!\\\"Contex\"Context");
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
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
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
        boolean boolean18 = python3Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python3Target1.getLoopCounter(grammarAST19);
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
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"_\\\"\\\\\\\"_\\\\\\\"hi!\\\\\\\"Contex\\\"Context\"" + "'", str17, "\"_\\\"\\\\\\\"_\\\\\\\"hi!\\\\\\\"Contex\\\"Context\"");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "4.5.2.1", true);
        java.lang.String str6 = python3Target1.getLanguage();
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\".5.2.\"" + "'", str5, "\".5.2.\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        java.lang.String str9 = python3Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str11 = python3Target1.getImplicitRuleLabel("\"\\\"_\\\"hi!\\\"Contex\"Context");
        java.lang.String str13 = python3Target1.getImplicitRuleLabel("_\"\\\"_\\\"hi!\\\"Contex\"Context");
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getLoopCounter(grammarAST14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_\"\\\"_\\\"hi!\\\"Contex\"Context" + "'", str11, "_\"\\\"_\\\"hi!\\\"Contex\"Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "__\"\\\"_\\\"hi!\\\"Contex\"Context" + "'", str13, "__\"\\\"_\\\"hi!\\\"Contex\"Context");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getListLabel("\"_Python3\"");
        java.lang.String str5 = python3Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        boolean boolean7 = python3Target1.wantsBaseVisitor();
        boolean boolean8 = python3Target1.wantsBaseListener();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str4 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.util.Set<java.lang.String> strSet5 = python3Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getLoopCounter(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "_tset\"hi!\"", false);
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "tset\\\"hi!" + "'", str9, "tset\\\"hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\"hi!\"");
        boolean boolean7 = python3Target1.templatesExist();
        int int8 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"\\\"hi!\\\"\"");
        java.lang.String str13 = python3Target1.getImplicitRuleLabel("tset_\\\"hi!\\\"Contex");
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target16 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator15);
        int int17 = python3Target16.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet18 = python3Target16.getBadWords();
        int int19 = python3Target16.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python3Target16.getCodeGenerator();
        java.lang.String str22 = python3Target16.getImplicitSetLabel("_\"hi!\"Context");
        java.lang.String str24 = python3Target16.getImplicitSetLabel("_tset");
        java.lang.String str26 = python3Target16.getImplicitSetLabel("\"\\\"Python3\\\"Context\"");
        int int27 = python3Target16.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar28 = null;
        int[] intArray29 = new int[] {};
        java.lang.String[] strArray30 = python3Target16.getTokenTypesAsTargetLabels(grammar28, intArray29);
        java.lang.String[] strArray31 = python3Target1.getTokenTypesAsTargetLabels(grammar14, intArray29);
        java.lang.Class<?> wildcardClass32 = strArray31.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"Context" + "'", str6, "\"hi!\"Context");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"hi!\\\"\"Context" + "'", str11, "\"\\\"hi!\\\"\"Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_tset_\\\"hi!\\\"Contex" + "'", str13, "_tset_\\\"hi!\\\"Contex");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 64 + "'", int19 == 64);
        org.junit.Assert.assertNull(codeGenerator20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "_tset_\"hi!\"Context" + "'", str22, "_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "_tset_tset" + "'", str24, "_tset_tset");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "_tset\"\\\"Python3\\\"Context\"" + "'", str26, "_tset\"\\\"Python3\\\"Context\"");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 29 + "'", int27 == 29);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[]");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_Python3");
        int int8 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str10 = python3Target1.getAltLabelContextStructName("\"\\\"hi!\\\"\"Context");
        org.antlr.v4.tool.Grammar grammar11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getTokenTypeAsTargetLabel(grammar11, (int) 'a');
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"hi!\\\"\"ContextContext" + "'", str10, "\"\\\"hi!\\\"\"ContextContext");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_\"\\\"_Python3\\\"\"", false);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getRuleFunctionContextStructName(ruleFunction8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_\\\"\\\\\\\"_Python3\\\\\\\"\\\"" + "'", str7, "_\\\"\\\\\\\"_Python3\\\\\\\"\\\"");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("hi!", true);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("\\\\\\\"tset\\\\\\\\\\\\\\\"_Python3\\\\\\\"");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"" + "'", str6, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\\\\\\\\\\\\\"tset\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"_Python3\\\\\\\\\\\\\\\"\"" + "'", str8, "\"\\\\\\\\\\\\\\\"tset\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"_Python3\\\\\\\\\\\\\\\"\"");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str8 = python3Target1.encodeIntAsCharEscape(100);
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getImplicitTokenLabel("\"Python3\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
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
        java.lang.String str18 = python3Target1.getImplicitRuleLabel("Python3");
        java.lang.Class<?> wildcardClass19 = python3Target1.getClass();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_Python3" + "'", str18, "_Python3");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
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
        boolean boolean12 = python3Target1.wantsBaseListener();
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\" \"");
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromString("\\0", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target1.getLoopCounter(grammarAST18);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\" \\\"\"" + "'", str14, "\"\\\" \\\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\\\0" + "'", str17, "\\\\0");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getLanguage();
        boolean boolean6 = python3Target1.templatesExist();
        java.lang.String str8 = python3Target1.getImplicitSetLabel("\\\"hi!\\\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getElementName("\\64");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset\\\"hi!\\\"" + "'", str8, "_tset\\\"hi!\\\"");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\"hi!\"");
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        java.util.Set<java.lang.String> strSet8 = python3Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getTokenTypeAsTargetLabel(grammar9, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"Context" + "'", str6, "\"hi!\"Context");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_Python3");
        int int8 = python3Target1.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getImplicitTokenLabel("0ContextContex");
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
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"Python3\"Context" + "'", str11, "\"Python3\"Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_" + "'", str13, "_");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset_\"hi!\"ContextContext" + "'", str15, "_tset_\"hi!\"ContextContext");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "set\\\"hi" + "'", str11, "set\\\"hi");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_tset_\\\"hi!\\\"Contex" + "'", str13, "_tset_\\\"hi!\\\"Contex");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
        java.lang.Class<?> wildcardClass14 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"hi!\"" + "'", str9, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_\\\"hi!\\\"Contex" + "'", str12, "_tset_\\\"hi!\\\"Contex");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getListLabel("\"_Python3\"");
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\\0");
        boolean boolean7 = python3Target1.templatesExist();
        java.util.Set<java.lang.String> strSet8 = python3Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getLoopLabel(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0Context" + "'", str6, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getElementName("a");
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
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "tset_\\\"hi!\\\"Contex" + "'", str13, "tset_\\\"hi!\\\"Contex");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.Class<?> wildcardClass10 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\"hi!\"Context");
        java.lang.String str10 = python3Target1.getLanguage();
        java.lang.String str12 = python3Target1.getListLabel("_tset_\"hi!\"Context");
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "_tset\"\\\"Python3\\\"Context\"", false);
        org.antlr.v4.tool.Grammar grammar17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target1.getTokenTypeAsTargetLabel(grammar17, (int) (short) 100);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "tset\\\"\\\"Python3\\\"Context" + "'", str16, "tset\\\"\\\"Python3\\\"Context");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\"hi!\"");
        java.lang.String str7 = python3Target1.getVersion();
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"Context" + "'", str6, "\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"Python3\"Context" + "'", str11, "\"Python3\"Context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"tset_\\\\\\\"hi!\\\\\\\"Contex\"" + "'", str16, "\"tset_\\\\\\\"hi!\\\\\\\"Contex\"");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST22);
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
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
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
        java.lang.String str14 = python3Target1.getVersion();
        java.lang.String str16 = python3Target1.getImplicitRuleLabel("\"\\\"tset\\\\\\\"_Python3\\\"\"");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"hi!\"Context" + "'", str9, "_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python3" + "'", str10, "Python3");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset_\"hi!\"Context" + "'", str12, "_tset_\"hi!\"Context");
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_\"\\\"tset\\\\\\\"_Python3\\\"\"" + "'", str16, "_\"\\\"tset\\\\\\\"_Python3\\\"\"");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("hi!");
        boolean boolean10 = python3Target1.templatesExist();
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getLoopCounter(grammarAST12);
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
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        boolean boolean8 = python3Target1.templatesExist();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        int int6 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "\"_tset4.5.2.1\"", true);
        boolean boolean11 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tset4.5.2.1\"" + "'", str10, "\"_tset4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getLoopCounter(grammarAST14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "tset\\\"hi!" + "'", str9, "tset\\\"hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("\"Python3\"");
        int int12 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"Python3\"Context" + "'", str11, "\"Python3\"Context");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "4.5.2.1", true);
        org.antlr.v4.tool.Grammar grammar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getTokenTypeAsTargetLabel(grammar6, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\".5.2.\"" + "'", str5, "\".5.2.\"");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("\"\\\"Python3\\\"Context\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python3Target1.getImplicitTokenLabel("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\\\"\\\\\\\"Python3\\\\\\\"Context\\\"\"" + "'", str3, "\"\\\"\\\\\\\"Python3\\\\\\\"Context\\\"\"");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getLanguage();
        boolean boolean6 = python3Target1.templatesExist();
        org.antlr.v4.tool.Rule rule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getRuleFunctionContextStructName(rule7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        boolean boolean8 = python3Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
        java.lang.String str15 = python3Target1.getImplicitSetLabel("\"\\\"hi!\\\"\"ContextContext");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"Context" + "'", str6, "\"hi!\"Context");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"tset\\\"_Python3\"" + "'", str12, "\"tset\\\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset\"\\\"hi!\\\"\"ContextContext" + "'", str15, "_tset\"\\\"hi!\\\"\"ContextContext");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\"hi!\"Context");
        java.lang.String str10 = python3Target1.getLanguage();
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Rule rule12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getRuleFunctionContextStructName(rule12);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
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
        boolean boolean17 = python3Target1.templatesExist();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        boolean boolean4 = python3Target1.wantsBaseListener();
        int int5 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean6 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator8);
        int int10 = python3Target9.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet11 = python3Target9.getBadWords();
        int int12 = python3Target9.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target9.getCodeGenerator();
        java.lang.String str15 = python3Target9.getImplicitSetLabel("_\"hi!\"Context");
        java.lang.String str17 = python3Target9.getImplicitSetLabel("_tset");
        java.lang.String str19 = python3Target9.getImplicitSetLabel("\"\\\"Python3\\\"Context\"");
        int int20 = python3Target9.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar21 = null;
        int[] intArray22 = new int[] {};
        java.lang.String[] strArray23 = python3Target9.getTokenTypesAsTargetLabels(grammar21, intArray22);
        java.lang.String[] strArray24 = python3Target1.getTokenTypesAsTargetLabels(grammar7, intArray22);
        java.lang.Class<?> wildcardClass25 = intArray22.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 29 + "'", int5 == 29);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset_\"hi!\"Context" + "'", str15, "_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_tset_tset" + "'", str17, "_tset_tset");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_tset\"\\\"Python3\\\"Context\"" + "'", str19, "_tset\"\\\"Python3\\\"Context\"");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 29 + "'", int20 == 29);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[]");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
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
        java.lang.String str20 = python3Target1.getImplicitSetLabel("\"\\\"_\\\"hi!\\\"Contex\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.Rule rule22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = python3Target1.getRuleFunctionContextStructName(rule22);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "_tset\"\\\"_\\\"hi!\\\"Contex\"" + "'", str20, "_tset\"\\\"_\\\"hi!\\\"Contex\"");
        org.junit.Assert.assertNull(codeGenerator21);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getListLabel("\"_Python3\"");
        java.lang.String str5 = python3Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("_Python3Context");
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "__Python3Context" + "'", str8, "__Python3Context");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        boolean boolean5 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getElementName("__Python3");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        java.lang.String str10 = python3Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Python3" + "'", str10, "Python3");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "4.5.2.1", true);
        java.lang.String str6 = python3Target1.getVersion();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1");
        boolean boolean9 = python3Target1.templatesExist();
        boolean boolean10 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\".5.2.\"" + "'", str5, "\".5.2.\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_tset4.5.2.1\"" + "'", str8, "\"_tset4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "4.5.2.1", true);
        java.lang.String str6 = python3Target1.getVersion();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("\"tset_\\\"Python3\\\"Contex\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\".5.2.\"" + "'", str5, "\".5.2.\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"tset_\\\\\\\"Python3\\\\\\\"Contex\\\"\"" + "'", str8, "\"\\\"tset_\\\\\\\"Python3\\\\\\\"Contex\\\"\"");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        java.lang.String str10 = python3Target1.getListLabel("\"Python3\"");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Python3\"" + "'", str10, "\"Python3\"");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        boolean boolean7 = python3Target1.templatesExist();
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("_tsettset\\\"hi!", true);
        boolean boolean11 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getLoopCounter(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tsettset\\\\\\\"hi!\"" + "'", str10, "\"_tsettset\\\\\\\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
        boolean boolean13 = python3Target1.wantsBaseVisitor();
        boolean boolean14 = python3Target1.templatesExist();
        org.antlr.v4.tool.Rule rule15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getRuleFunctionContextStructName(rule15);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset" + "'", str12, "_tset");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("Python3");
        java.lang.String str8 = python3Target1.getImplicitSetLabel("_tset_\"Python3\"");
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"Python3\"" + "'", str6, "\"Python3\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset_tset_\"Python3\"" + "'", str8, "_tset_tset_\"Python3\"");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_Python3");
        int int8 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str10 = python3Target1.getAltLabelContextStructName("\"\\\"hi!\\\"\"Context");
        boolean boolean11 = python3Target1.wantsBaseVisitor();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_Python3\"" + "'", str7, "\"_Python3\"");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"hi!\\\"\"ContextContext" + "'", str10, "\"\\\"hi!\\\"\"ContextContext");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getListLabel("\"_Python3\"");
        java.lang.String str5 = python3Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("_Python3Context");
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("\"hi!\"Context", true);
        org.antlr.v4.tool.Grammar grammar12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getTokenTypeAsTargetLabel(grammar12, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "__Python3Context" + "'", str8, "__Python3Context");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"hi!\\\"Context\"" + "'", str11, "\"\\\"hi!\\\"Context\"");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.getTemplates();
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getRuleFunctionContextStructName(ruleFunction8);
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
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        org.antlr.v4.tool.Rule rule4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python3Target1.getRuleFunctionContextStructName(rule4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        boolean boolean7 = python3Target1.templatesExist();
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("_tsettset\\\"hi!", true);
        org.antlr.v4.tool.Grammar grammar11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getTokenTypeAsTargetLabel(grammar11, 29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tsettset\\\\\\\"hi!\"" + "'", str10, "\"_tsettset\\\\\\\"hi!\"");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST14);
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
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
        java.lang.String str15 = python3Target1.getImplicitSetLabel("\"\\\"\\\"_Python3\\\"\"");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"Context" + "'", str6, "\"hi!\"Context");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"tset\\\"_Python3\"" + "'", str12, "\"tset\\\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset\"\\\"\\\"_Python3\\\"\"" + "'", str15, "_tset\"\\\"\\\"_Python3\\\"\"");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str4 = python3Target1.getTargetStringLiteralFromString("Python3", false);
        java.util.Set<java.lang.String> strSet5 = python3Target1.getBadWords();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("__tset", false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "__tset" + "'", str8, "__tset");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("\"\\\"hi!\\\"\"Context", false);
        java.lang.String str13 = python3Target1.getListLabel("_\"Python3\"");
        java.lang.String str14 = python3Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\\"\\\\\\\"hi!\\\\\\\"\\\"Context" + "'", str11, "\\\"\\\\\\\"hi!\\\\\\\"\\\"Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_\"Python3\"" + "'", str13, "_\"Python3\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python3" + "'", str14, "Python3");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
        org.antlr.v4.tool.Grammar grammar16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python3Target1.getTokenTypeAsTargetLabel(grammar16, (int) (byte) -1);
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
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python3Target1.getLoopLabel(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        java.lang.String str6 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getImplicitSetLabel("__\"\\\"_\\\"hi!\\\"Contex\"Context");
        java.lang.String str9 = python3Target1.getLanguage();
        java.lang.Class<?> wildcardClass10 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset__\"\\\"_\\\"hi!\\\"Contex\"Context" + "'", str8, "_tset__\"\\\"_\\\"hi!\\\"Contex\"Context");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python3" + "'", str9, "Python3");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        int int8 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python3Target1.getImplicitRuleLabel("_tset_\"hi!\"ContextContext");
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getLoopCounter(grammarAST12);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getTokenTypeAsTargetLabel(grammar14, (-1));
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getTargetStringLiteralFromString("_Python3");
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("\"Python3\"Context", true);
        boolean boolean8 = python3Target1.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getElementName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"Python3\\\"Context\"" + "'", str7, "\"\\\"Python3\\\"Context\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\\"\\\\\\\"hi!\\\\\\\"\\\"Context" + "'", str11, "\\\"\\\\\\\"hi!\\\\\\\"\\\"Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_\"Python3\"" + "'", str13, "_\"Python3\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\"" + "'", str15, "\"\"");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("\"\\\"hi!\\\"\"Context", false);
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\"_\\\"\\\\\\\"_\\\\\\\"hi!\\\\\\\"Contex\\\"Context\"", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getImplicitTokenLabel("set\\\"\\\"Python3\\\"Contex");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"_\\\\\\\"\\\\\\\\\\\\\\\"_\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"Contex\\\\\\\"Context\\\"\"" + "'", str14, "\"\\\"_\\\\\\\"\\\\\\\\\\\\\\\"_\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"Contex\\\\\\\"Context\\\"\"");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.encodeIntAsCharEscape((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
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
        boolean boolean14 = python3Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getImplicitTokenLabel("\"\\\"\\\\\\\"Python3\\\\\\\"Context\\\"\"");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "\"hi!\"", true);
        java.lang.String str9 = python3Target1.getListLabel("_tset\\\"hi!\\\"");
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getElementListName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"hi!\"" + "'", str7, "\"hi!\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset\\\"hi!\\\"" + "'", str9, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str6 = python3Target1.getImplicitSetLabel("_tset_\"hi!\"Context");
        java.lang.String str8 = python3Target1.encodeIntAsCharEscape((int) (short) 10);
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset_tset_\"hi!\"Context" + "'", str6, "_tset_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\n" + "'", str8, "\\n");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        boolean boolean7 = python3Target1.templatesExist();
        java.lang.String str8 = python3Target1.getVersion();
        java.lang.String str10 = python3Target1.getAltLabelContextStructName("tset\\\"hi!");
        org.antlr.v4.tool.Rule rule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getRuleFunctionContextStructName(rule11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Tset\\\"hi!Context" + "'", str10, "Tset\\\"hi!Context");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getListLabel("\"_Python3\"");
        java.lang.String str5 = python3Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("_Python3Context");
        org.antlr.v4.tool.Grammar grammar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getTokenTypeAsTargetLabel(grammar9, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "__Python3Context" + "'", str8, "__Python3Context");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
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
        boolean boolean13 = python3Target1.wantsBaseVisitor();
        boolean boolean14 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.getElementListName("_tset__\"\\\"_\\\"hi!\\\"Contex\"Context");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset" + "'", str12, "_tset");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(sTGroup15);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("", false);
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        java.lang.String str8 = python3Target1.getListLabel("\\0");
        int int9 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str11 = python3Target1.getImplicitRuleLabel("_tset\\\"hi!\\\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getElementName("4.5.2.1Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\0" + "'", str8, "\\0");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "__tset\\\"hi!\\\"" + "'", str11, "__tset\\\"hi!\\\"");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
        java.lang.String str13 = python3Target1.encodeIntAsCharEscape(64);
        java.lang.String str14 = python3Target1.getVersion();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "set\\\"hi" + "'", str11, "set\\\"hi");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "@" + "'", str13, "@");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.getTemplates();
        boolean boolean7 = python3Target1.wantsBaseListener();
        boolean boolean8 = python3Target1.wantsBaseListener();
        java.lang.String str10 = python3Target1.getImplicitRuleLabel("_Python3");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getRuleFunctionContextStructName(ruleFunction11);
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "__Python3" + "'", str10, "__Python3");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\".5.2.\"", false);
        boolean boolean13 = python3Target1.templatesExist();
        boolean boolean14 = python3Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".5.2." + "'", str12, ".5.2.");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, " ", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getImplicitTokenLabel("set_\\\\\\\"hi!\\\\\\\"Conte");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.templatesExist();
        java.util.Set<java.lang.String> strSet10 = python3Target1.getBadWords();
        java.lang.Class<?> wildcardClass11 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str6 = python3Target1.getImplicitSetLabel("_tset_\"hi!\"Context");
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("\\0Context");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getElementName("\"hi!\"ContextContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset_tset_\"hi!\"Context" + "'", str6, "_tset_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\0ContextContext" + "'", str8, "\\0ContextContext");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("hi!");
        boolean boolean10 = python3Target1.templatesExist();
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        java.lang.String str13 = python3Target1.getListLabel("\"set\\\\\\\"hi\"");
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("_tset_tset_\"hi!\"Context");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"hi!\"" + "'", str9, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"set\\\\\\\"hi\"" + "'", str13, "\"set\\\\\\\"hi\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"_tset_tset_\\\"hi!\\\"Context\"" + "'", str15, "\"_tset_tset_\\\"hi!\\\"Context\"");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
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
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target15 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator14);
        int int16 = python3Target15.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet17 = python3Target15.getBadWords();
        int int18 = python3Target15.getInlineTestSetWordSize();
        java.lang.String str21 = python3Target15.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = python3Target15.getCodeGenerator();
        boolean boolean23 = python3Target15.supportsOverloadedMethods();
        java.lang.String str25 = python3Target15.getAltLabelContextStructName("\"Python3\"");
        boolean boolean26 = python3Target15.wantsBaseListener();
        int int27 = python3Target15.getInlineTestSetWordSize();
        boolean boolean28 = python3Target15.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar29 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator30 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target31 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator30);
        int int32 = python3Target31.getInlineTestSetWordSize();
        java.lang.String str34 = python3Target31.getImplicitSetLabel("\"hi!\"");
        java.lang.String str36 = python3Target31.encodeIntAsCharEscape(0);
        java.lang.String str37 = python3Target31.getVersion();
        java.lang.String str39 = python3Target31.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.tool.Grammar grammar40 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator41 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target42 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator41);
        boolean boolean43 = python3Target42.supportsOverloadedMethods();
        java.lang.String str45 = python3Target42.getTargetStringLiteralFromString("_Python3");
        org.antlr.v4.tool.Grammar grammar46 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator47 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target48 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator47);
        int int49 = python3Target48.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet50 = python3Target48.getBadWords();
        int int51 = python3Target48.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator52 = python3Target48.getCodeGenerator();
        java.lang.String str54 = python3Target48.getImplicitSetLabel("_\"hi!\"Context");
        java.lang.String str56 = python3Target48.getImplicitSetLabel("_tset");
        java.lang.String str58 = python3Target48.getImplicitSetLabel("\"\\\"Python3\\\"Context\"");
        int int59 = python3Target48.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar60 = null;
        int[] intArray61 = new int[] {};
        java.lang.String[] strArray62 = python3Target48.getTokenTypesAsTargetLabels(grammar60, intArray61);
        java.lang.String[] strArray63 = python3Target42.getTokenTypesAsTargetLabels(grammar46, intArray61);
        java.lang.String[] strArray64 = python3Target31.getTokenTypesAsTargetLabels(grammar40, intArray61);
        java.lang.String[] strArray65 = python3Target15.getTokenTypesAsTargetLabels(grammar29, intArray61);
        java.lang.String[] strArray66 = python3Target1.getTokenTypesAsTargetLabels(grammar13, intArray61);
        java.lang.Class<?> wildcardClass67 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"Context" + "'", str6, "\"hi!\"Context");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"tset\\\"_Python3\"" + "'", str12, "\"tset\\\"_Python3\"");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "_tset\\\"hi!\\\"" + "'", str21, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"Python3\"Context" + "'", str25, "\"Python3\"Context");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 64 + "'", int27 == 64);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 64 + "'", int32 == 64);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "_tset\"hi!\"" + "'", str34, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\\0" + "'", str36, "\\0");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "4.5.2.1" + "'", str37, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\"hi!\"" + "'", str39, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\"_Python3\"" + "'", str45, "\"_Python3\"");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 64 + "'", int49 == 64);
        org.junit.Assert.assertNotNull(strSet50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 64 + "'", int51 == 64);
        org.junit.Assert.assertNull(codeGenerator52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "_tset_\"hi!\"Context" + "'", str54, "_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "_tset_tset" + "'", str56, "_tset_tset");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "_tset\"\\\"Python3\\\"Context\"" + "'", str58, "_tset\"\\\"Python3\\\"Context\"");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 29 + "'", int59 == 29);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[]");
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.getTemplates();
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getElementListName("\\\"\\\\\\\"hi!\\\\\\\"Context\\\"");
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
        org.junit.Assert.assertNull(codeGenerator8);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        boolean boolean7 = python3Target1.templatesExist();
        java.lang.String str8 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getElementListName("_\"hi!\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python3" + "'", str9, "Python3");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getListLabel("\"_Python3\"");
        java.lang.String str5 = python3Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("_Python3Context");
        java.lang.String str10 = python3Target1.getImplicitRuleLabel("_tset_\"Python3\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "__Python3Context" + "'", str8, "__Python3Context");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "__tset_\"Python3\"" + "'", str10, "__tset_\"Python3\"");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        boolean boolean8 = python3Target1.wantsBaseListener();
        java.lang.String str10 = python3Target1.getListLabel(".5.2.");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getRuleFunctionContextStructName(ruleFunction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".5.2." + "'", str10, ".5.2.");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
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
        boolean boolean12 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29 + "'", int11 == 29);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.getLoopLabel(grammarAST16);
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
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        boolean boolean4 = python3Target1.supportsOverloadedMethods();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        java.lang.String str6 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getImplicitSetLabel("__\"\\\"_\\\"hi!\\\"Contex\"Context");
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getLoopCounter(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset__\"\\\"_\\\"hi!\\\"Contex\"Context" + "'", str8, "_tset__\"\\\"_\\\"hi!\\\"Contex\"Context");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
        java.lang.String str15 = python3Target1.getImplicitRuleLabel("\"\\\"hi!\\\"\"Context");
        boolean boolean16 = python3Target1.supportsOverloadedMethods();
        java.lang.String str17 = python3Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target1.getLoopCounter(grammarAST18);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"hi!\"Context" + "'", str11, "\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python3" + "'", str13, "Python3");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_\"\\\"hi!\\\"\"Context" + "'", str15, "_\"\\\"hi!\\\"\"Context");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getListLabel("\"_Python3\"");
        java.lang.String str5 = python3Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        int int7 = python3Target1.getInlineTestSetWordSize();
        boolean boolean8 = python3Target1.templatesExist();
        boolean boolean9 = python3Target1.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getElementName("_tset\".5.2.\"");
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
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("", false);
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        java.lang.String str8 = python3Target1.getListLabel("\\0");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\0" + "'", str8, "\\0");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.templatesExist();
        java.lang.String str11 = python3Target1.getImplicitSetLabel("\"\\\"Python3\\\"Context\"");
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset\"\\\"Python3\\\"Context\"" + "'", str11, "_tset\"\\\"Python3\\\"Context\"");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("", false);
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        java.lang.Class<?> wildcardClass7 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("", false);
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        java.lang.String str8 = python3Target1.getListLabel("\\0");
        boolean boolean9 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\0" + "'", str8, "\\0");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
        java.lang.Class<?> wildcardClass35 = python3Target1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.templatesExist();
        java.util.Set<java.lang.String> strSet10 = python3Target1.getBadWords();
        java.lang.String str12 = python3Target1.getImplicitSetLabel("\"\\\\35\"");
        boolean boolean13 = python3Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getImplicitTokenLabel("_tset\".5.2.\"");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset\"\\\\35\"" + "'", str12, "_tset\"\\\\35\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
        int int14 = python3Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getImplicitTokenLabel("_tset4.5.2.1Context");
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
        java.lang.String str14 = python3Target1.getImplicitRuleLabel("");
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getLoopCounter(grammarAST15);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_" + "'", str14, "_");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\".5.2.\"", false);
        boolean boolean13 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getRuleFunctionContextStructName(ruleFunction14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ".5.2." + "'", str12, ".5.2.");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        boolean boolean4 = python3Target1.wantsBaseListener();
        int int5 = python3Target1.getSerializedATNSegmentLimit();
        int int6 = python3Target1.getSerializedATNSegmentLimit();
        java.util.Set<java.lang.String> strSet7 = python3Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getTokenTypeAsTargetLabel(grammar8, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 29 + "'", int5 == 29);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 29 + "'", int6 == 29);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        java.lang.String str10 = python3Target1.getListLabel("\"Python3\"");
        java.lang.String str11 = python3Target1.getVersion();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Python3\"" + "'", str10, "\"Python3\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getElementListName("set_\\\"hi!\\\"Conte");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "tset\\\"hi!" + "'", str9, "tset\\\"hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
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
        java.lang.String str16 = python3Target1.getVersion();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "4.5.2.1" + "'", str16, "4.5.2.1");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "\"hi!\"", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"hi!\"" + "'", str7, "\"hi!\"");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "\"hi!\"", true);
        int int8 = python3Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getImplicitTokenLabel("set\\\"hi");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"hi!\"" + "'", str7, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
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
        java.lang.String str15 = python3Target1.getAltLabelContextStructName("_tset\"\\\"Python3\\\"Context\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST16);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"hi!\"Context" + "'", str11, "\"hi!\"Context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset\"\\\"Python3\\\"Context\"Context" + "'", str15, "_tset\"\\\"Python3\\\"Context\"Context");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getImplicitTokenLabel("_\"\\\"hi!\\\"\"Context");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"hi!\"Context" + "'", str11, "\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Python3" + "'", str13, "Python3");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
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
        java.lang.String str12 = python3Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getElementName("_tset4.5.2.1");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        boolean boolean4 = python3Target1.wantsBaseListener();
        java.util.Set<java.lang.String> strSet5 = python3Target1.getBadWords();
        java.lang.String str7 = python3Target1.encodeIntAsCharEscape((int) (byte) 100);
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
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d" + "'", str7, "d");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\"hi!\"");
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str8 = python3Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getTokenTypeAsTargetLabel(grammar9, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"Context" + "'", str6, "\"hi!\"Context");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.getTemplates();
        boolean boolean7 = python3Target1.wantsBaseListener();
        boolean boolean8 = python3Target1.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getImplicitTokenLabel("_\"_\\\"hi!\\\"Contex\"");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        int int8 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getTokenTypeAsTargetLabel(grammar9, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python3Target1.getCodeGenerator();
        boolean boolean15 = python3Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "tset\\\"hi!" + "'", str8, "tset\\\"hi!");
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "tset_\\\"hi!\\\"Contex" + "'", str13, "tset_\\\"hi!\\\"Contex");
        org.junit.Assert.assertNull(codeGenerator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        boolean boolean10 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getVersion();
        int int12 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean13 = python3Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 29 + "'", int12 == 29);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str5 = python3Target1.getVersion();
        org.antlr.v4.tool.Rule rule6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getRuleFunctionContextStructName(rule6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "\"hi!\"", true);
        org.antlr.v4.tool.Grammar grammar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getTokenTypeAsTargetLabel(grammar8, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"hi!\"" + "'", str7, "\"hi!\"");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"Python3\"" + "'", str6, "\"Python3\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target1.getVersion();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("hi!");
        boolean boolean10 = python3Target1.templatesExist();
        java.lang.String str12 = python3Target1.getImplicitRuleLabel("tset_\\\"hi!\\\"Contex");
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getLoopCounter(grammarAST13);
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
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("\"hi!\"");
        java.lang.String str6 = python3Target1.encodeIntAsCharEscape(0);
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        int int8 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python3Target1.getImplicitRuleLabel("_tset_\"hi!\"ContextContext");
        boolean boolean11 = python3Target1.supportsOverloadedMethods();
        java.lang.String str13 = python3Target1.getAltLabelContextStructName("et\\\"h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\"hi!\"" + "'", str4, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "__tset_\"hi!\"ContextContext" + "'", str10, "__tset_\"hi!\"ContextContext");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Et\\\"hContext" + "'", str13, "Et\\\"hContext");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("_tset\"_Python3\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.getElementListName("_\"\\\"_Python3\\\"\"");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"_tset\\\"_Python3\\\"\"" + "'", str15, "\"_tset\\\"_Python3\\\"\"");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getSerializedATNSegmentLimit();
        int int3 = python3Target1.getInlineTestSetWordSize();
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "_tset_\\\"hi!\\\"Contex", false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "tset_\\\"hi!\\\"Conte" + "'", str9, "tset_\\\"hi!\\\"Conte");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getLanguage();
        boolean boolean6 = python3Target1.templatesExist();
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        java.lang.String str9 = python3Target1.getAltLabelContextStructName("\"Tset\\\\\\\"hi!Context\"");
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromString("#", true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"Tset\\\\\\\"hi!Context\"Context" + "'", str9, "\"Tset\\\\\\\"hi!Context\"Context");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"#\"" + "'", str12, "\"#\"");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_Python3");
        int int8 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean9 = python3Target1.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator11);
        int int13 = python3Target12.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet14 = python3Target12.getBadWords();
        int int15 = python3Target12.getInlineTestSetWordSize();
        java.lang.String str18 = python3Target12.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = python3Target12.getCodeGenerator();
        boolean boolean20 = python3Target12.supportsOverloadedMethods();
        boolean boolean21 = python3Target12.wantsBaseListener();
        java.lang.String str23 = python3Target12.getImplicitSetLabel("");
        boolean boolean24 = python3Target12.wantsBaseVisitor();
        boolean boolean25 = python3Target12.templatesExist();
        boolean boolean26 = python3Target12.templatesExist();
        boolean boolean27 = python3Target12.templatesExist();
        org.antlr.v4.tool.Grammar grammar28 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator29 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target30 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator29);
        boolean boolean31 = python3Target30.supportsOverloadedMethods();
        java.lang.String str33 = python3Target30.getTargetStringLiteralFromString("_Python3");
        org.antlr.v4.tool.Grammar grammar34 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target36 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator35);
        int int37 = python3Target36.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet38 = python3Target36.getBadWords();
        int int39 = python3Target36.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator40 = python3Target36.getCodeGenerator();
        java.lang.String str42 = python3Target36.getImplicitSetLabel("_\"hi!\"Context");
        java.lang.String str44 = python3Target36.getImplicitSetLabel("_tset");
        java.lang.String str46 = python3Target36.getImplicitSetLabel("\"\\\"Python3\\\"Context\"");
        int int47 = python3Target36.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar48 = null;
        int[] intArray49 = new int[] {};
        java.lang.String[] strArray50 = python3Target36.getTokenTypesAsTargetLabels(grammar48, intArray49);
        java.lang.String[] strArray51 = python3Target30.getTokenTypesAsTargetLabels(grammar34, intArray49);
        java.lang.String[] strArray52 = python3Target12.getTokenTypesAsTargetLabels(grammar28, intArray49);
        java.lang.String[] strArray53 = python3Target1.getTokenTypesAsTargetLabels(grammar10, intArray49);
        boolean boolean54 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST55 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean56 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST55);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset\\\"hi!\\\"" + "'", str18, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "_tset" + "'", str23, "_tset");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"_Python3\"" + "'", str33, "\"_Python3\"");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 64 + "'", int37 == 64);
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 64 + "'", int39 == 64);
        org.junit.Assert.assertNull(codeGenerator40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "_tset_\"hi!\"Context" + "'", str42, "_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "_tset_tset" + "'", str44, "_tset_tset");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "_tset\"\\\"Python3\\\"Context\"" + "'", str46, "_tset\"\\\"Python3\\\"Context\"");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 29 + "'", int47 == 29);
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[]");
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
        java.lang.String str20 = python3Target1.getAltLabelContextStructName("_tsettset\\\"hi!");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "_tsettset\\\"hi!Context" + "'", str20, "_tsettset\\\"hi!Context");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("\"\\\"hi!\\\"\"Context", false);
        java.lang.String str13 = python3Target1.getListLabel("_\"Python3\"");
        int int14 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\\"\\\\\\\"hi!\\\\\\\"\\\"Context" + "'", str11, "\\\"\\\\\\\"hi!\\\\\\\"\\\"Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_\"Python3\"" + "'", str13, "_\"Python3\"");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
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
        boolean boolean23 = python3Target1.wantsBaseVisitor();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("\"\\\"hi!\\\"\"Context", false);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getRuleFunctionContextStructName(ruleFunction12);
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
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST15);
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
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        java.lang.String str19 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator16, "_\"\\\"_\\\"hi!\\\"Contex\"", false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\\"\\\\\\\"hi!\\\\\\\"\\\"Context" + "'", str11, "\\\"\\\\\\\"hi!\\\\\\\"\\\"Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_\"Python3\"" + "'", str13, "_\"Python3\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\"" + "'", str15, "\"\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\\\"\\\"_\\\"hi!\\\"Contex" + "'", str19, "\\\"\\\"_\\\"hi!\\\"Contex");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python3Target1.getElementName("\"\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.templatesExist();
        java.lang.String str11 = python3Target1.getListLabel("\"hi!\"Context");
        java.lang.String str13 = python3Target1.getListLabel("_tset");
        boolean boolean14 = python3Target1.wantsBaseListener();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"hi!\"Context" + "'", str11, "\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_tset" + "'", str13, "_tset");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target15 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator14);
        int int16 = python3Target15.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet17 = python3Target15.getBadWords();
        int int18 = python3Target15.getInlineTestSetWordSize();
        java.lang.String str21 = python3Target15.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = python3Target15.getCodeGenerator();
        boolean boolean23 = python3Target15.supportsOverloadedMethods();
        java.lang.String str25 = python3Target15.getAltLabelContextStructName("\"Python3\"");
        boolean boolean26 = python3Target15.wantsBaseListener();
        int int27 = python3Target15.getInlineTestSetWordSize();
        boolean boolean28 = python3Target15.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar29 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator30 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target31 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator30);
        int int32 = python3Target31.getInlineTestSetWordSize();
        java.lang.String str34 = python3Target31.getImplicitSetLabel("\"hi!\"");
        java.lang.String str36 = python3Target31.encodeIntAsCharEscape(0);
        java.lang.String str37 = python3Target31.getVersion();
        java.lang.String str39 = python3Target31.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.tool.Grammar grammar40 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator41 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target42 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator41);
        boolean boolean43 = python3Target42.supportsOverloadedMethods();
        java.lang.String str45 = python3Target42.getTargetStringLiteralFromString("_Python3");
        org.antlr.v4.tool.Grammar grammar46 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator47 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target48 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator47);
        int int49 = python3Target48.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet50 = python3Target48.getBadWords();
        int int51 = python3Target48.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator52 = python3Target48.getCodeGenerator();
        java.lang.String str54 = python3Target48.getImplicitSetLabel("_\"hi!\"Context");
        java.lang.String str56 = python3Target48.getImplicitSetLabel("_tset");
        java.lang.String str58 = python3Target48.getImplicitSetLabel("\"\\\"Python3\\\"Context\"");
        int int59 = python3Target48.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar60 = null;
        int[] intArray61 = new int[] {};
        java.lang.String[] strArray62 = python3Target48.getTokenTypesAsTargetLabels(grammar60, intArray61);
        java.lang.String[] strArray63 = python3Target42.getTokenTypesAsTargetLabels(grammar46, intArray61);
        java.lang.String[] strArray64 = python3Target31.getTokenTypesAsTargetLabels(grammar40, intArray61);
        java.lang.String[] strArray65 = python3Target15.getTokenTypesAsTargetLabels(grammar29, intArray61);
        java.lang.String[] strArray66 = python3Target1.getTokenTypesAsTargetLabels(grammar13, intArray61);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str68 = python3Target1.getElementListName("\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"Python3\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"\"");
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "_tset\\\"hi!\\\"" + "'", str21, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"Python3\"Context" + "'", str25, "\"Python3\"Context");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 64 + "'", int27 == 64);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 64 + "'", int32 == 64);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "_tset\"hi!\"" + "'", str34, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\\0" + "'", str36, "\\0");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "4.5.2.1" + "'", str37, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\"hi!\"" + "'", str39, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\"_Python3\"" + "'", str45, "\"_Python3\"");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 64 + "'", int49 == 64);
        org.junit.Assert.assertNotNull(strSet50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 64 + "'", int51 == 64);
        org.junit.Assert.assertNull(codeGenerator52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "_tset_\"hi!\"Context" + "'", str54, "_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "_tset_tset" + "'", str56, "_tset_tset");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "_tset\"\\\"Python3\\\"Context\"" + "'", str58, "_tset\"\\\"Python3\\\"Context\"");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 29 + "'", int59 == 29);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[]");
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(strArray66);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getListLabel("\"_Python3\"");
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("\\0");
        boolean boolean7 = python3Target1.templatesExist();
        java.util.Set<java.lang.String> strSet8 = python3Target1.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getElementListName("\\0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0Context" + "'", str6, "\\0Context");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getImplicitSetLabel("\"\\\"_\\\"hi!\\\"Contex\"Context");
        int int9 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python3Target1.getVersion();
        java.lang.String str12 = python3Target1.getListLabel("\"\\\"_\\\"hi!\\\"Contex\"Context");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset\"\\\"_\\\"hi!\\\"Contex\"Context" + "'", str8, "_tset\"\\\"_\\\"hi!\\\"Contex\"Context");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"_\\\"hi!\\\"Contex\"Context" + "'", str12, "\"\\\"_\\\"hi!\\\"Contex\"Context");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        boolean boolean4 = python3Target1.wantsBaseListener();
        int int5 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean6 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "\"_\\\"hi!\\\"Contex\"", false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 29 + "'", int5 == 29);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_\\\"hi!\\\"Contex" + "'", str10, "_\\\"hi!\\\"Contex");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.templatesExist();
        java.lang.String str11 = python3Target1.getListLabel("\"hi!\"Context");
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "tset_\\\"hi!\\\"Contex", false);
        org.antlr.v4.tool.Grammar grammar16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python3Target1.getTokenTypeAsTargetLabel(grammar16, 100);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"hi!\"Context" + "'", str11, "\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "set_\\\"hi!\\\"Conte" + "'", str15, "set_\\\"hi!\\\"Conte");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
        java.lang.String str13 = python3Target1.encodeIntAsCharEscape(64);
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "_\"_\\\"hi!\\\"Contex\"", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target1.getLoopCounter(grammarAST18);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "@" + "'", str13, "@");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\\\"_\\\"hi!\\\"Contex\"" + "'", str17, "\"\\\"_\\\"hi!\\\"Contex\"");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        boolean boolean5 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getLanguage();
        int int8 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python3Target1.getImplicitSetLabel("tset\\\"hi!");
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getLoopCounter(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_tsettset\\\"hi!" + "'", str10, "_tsettset\\\"hi!");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("", false);
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        java.lang.String str8 = python3Target1.getListLabel("\\0");
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator10);
        int int12 = python3Target11.getInlineTestSetWordSize();
        java.lang.String str14 = python3Target11.getImplicitSetLabel("\"hi!\"");
        java.lang.String str16 = python3Target11.encodeIntAsCharEscape(0);
        java.lang.String str17 = python3Target11.getVersion();
        java.lang.String str19 = python3Target11.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.tool.Grammar grammar20 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target22 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator21);
        boolean boolean23 = python3Target22.supportsOverloadedMethods();
        java.lang.String str25 = python3Target22.getTargetStringLiteralFromString("_Python3");
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
        java.lang.String[] strArray43 = python3Target22.getTokenTypesAsTargetLabels(grammar26, intArray41);
        java.lang.String[] strArray44 = python3Target11.getTokenTypesAsTargetLabels(grammar20, intArray41);
        java.lang.String[] strArray45 = python3Target1.getTokenTypesAsTargetLabels(grammar9, intArray41);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\0" + "'", str8, "\\0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset\"hi!\"" + "'", str14, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\\0" + "'", str16, "\\0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"hi!\"" + "'", str19, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"_Python3\"" + "'", str25, "\"_Python3\"");
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
        org.junit.Assert.assertNotNull(strArray45);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
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
        org.antlr.v4.tool.Grammar grammar14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getTokenTypeAsTargetLabel(grammar14, 1);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_\"Python3\"" + "'", str13, "_\"Python3\"");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
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
        org.stringtemplate.v4.STGroup sTGroup17 = python3Target1.getTemplates();
        org.antlr.v4.tool.Rule rule18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target1.getRuleFunctionContextStructName(rule18);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\\"_Python3\\\"\"ContextContext" + "'", str16, "\"\\\"_Python3\\\"\"ContextContext");
        org.junit.Assert.assertNotNull(sTGroup17);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
        int int14 = python3Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getElementName("tset\\\"\\\"Python3\\\"Context");
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
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getListLabel("\"_Python3\"");
        java.lang.String str5 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString(" ", true);
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\" \"" + "'", str8, "\" \"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
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
        int int15 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target18 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator17);
        int int19 = python3Target18.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet20 = python3Target18.getBadWords();
        int int21 = python3Target18.getInlineTestSetWordSize();
        java.lang.String str24 = python3Target18.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = python3Target18.getCodeGenerator();
        boolean boolean26 = python3Target18.templatesExist();
        java.lang.String str28 = python3Target18.getListLabel("\"hi!\"Context");
        boolean boolean29 = python3Target18.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup30 = python3Target18.getTemplates();
        java.lang.String str32 = python3Target18.getAltLabelContextStructName("_tset\"\\\"Python3\\\"Context\"");
        java.lang.String str33 = python3Target18.getLanguage();
        java.lang.String str34 = python3Target18.getVersion();
        org.antlr.v4.tool.Grammar grammar35 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator36 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target37 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator36);
        int int38 = python3Target37.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet39 = python3Target37.getBadWords();
        int int40 = python3Target37.getInlineTestSetWordSize();
        java.lang.String str43 = python3Target37.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator44 = python3Target37.getCodeGenerator();
        boolean boolean45 = python3Target37.supportsOverloadedMethods();
        java.lang.String str47 = python3Target37.getAltLabelContextStructName("\"Python3\"");
        boolean boolean48 = python3Target37.wantsBaseListener();
        int int49 = python3Target37.getInlineTestSetWordSize();
        boolean boolean50 = python3Target37.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar51 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator52 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target53 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator52);
        int int54 = python3Target53.getInlineTestSetWordSize();
        java.lang.String str56 = python3Target53.getImplicitSetLabel("\"hi!\"");
        java.lang.String str58 = python3Target53.encodeIntAsCharEscape(0);
        java.lang.String str59 = python3Target53.getVersion();
        java.lang.String str61 = python3Target53.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.tool.Grammar grammar62 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator63 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target64 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator63);
        boolean boolean65 = python3Target64.supportsOverloadedMethods();
        java.lang.String str67 = python3Target64.getTargetStringLiteralFromString("_Python3");
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
        java.lang.String[] strArray85 = python3Target64.getTokenTypesAsTargetLabels(grammar68, intArray83);
        java.lang.String[] strArray86 = python3Target53.getTokenTypesAsTargetLabels(grammar62, intArray83);
        java.lang.String[] strArray87 = python3Target37.getTokenTypesAsTargetLabels(grammar51, intArray83);
        java.lang.String[] strArray88 = python3Target18.getTokenTypesAsTargetLabels(grammar35, intArray83);
        java.lang.String[] strArray89 = python3Target1.getTokenTypesAsTargetLabels(grammar16, intArray83);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 64 + "'", int19 == 64);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "_tset\\\"hi!\\\"" + "'", str24, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"hi!\"Context" + "'", str28, "\"hi!\"Context");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(sTGroup30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "_tset\"\\\"Python3\\\"Context\"Context" + "'", str32, "_tset\"\\\"Python3\\\"Context\"Context");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Python3" + "'", str33, "Python3");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "4.5.2.1" + "'", str34, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 64 + "'", int38 == 64);
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 64 + "'", int40 == 64);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "_tset\\\"hi!\\\"" + "'", str43, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\"Python3\"Context" + "'", str47, "\"Python3\"Context");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 64 + "'", int49 == 64);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 64 + "'", int54 == 64);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "_tset\"hi!\"" + "'", str56, "_tset\"hi!\"");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "\\0" + "'", str58, "\\0");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "4.5.2.1" + "'", str59, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "\"hi!\"" + "'", str61, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "\"_Python3\"" + "'", str67, "\"_Python3\"");
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
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator11);
        int int13 = python3Target12.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet14 = python3Target12.getBadWords();
        int int15 = python3Target12.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = python3Target12.getCodeGenerator();
        java.lang.String str18 = python3Target12.getImplicitSetLabel("_\"hi!\"Context");
        java.lang.String str20 = python3Target12.getImplicitSetLabel("_tset");
        java.lang.String str22 = python3Target12.getImplicitSetLabel("\"\\\"Python3\\\"Context\"");
        int int23 = python3Target12.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar24 = null;
        int[] intArray25 = new int[] {};
        java.lang.String[] strArray26 = python3Target12.getTokenTypesAsTargetLabels(grammar24, intArray25);
        java.lang.String[] strArray27 = python3Target1.getTokenTypesAsTargetLabels(grammar10, intArray25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = python3Target1.getImplicitTokenLabel("_Python3Contex");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertNull(codeGenerator16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset_\"hi!\"Context" + "'", str18, "_tset_\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "_tset_tset" + "'", str20, "_tset_tset");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "_tset\"\\\"Python3\\\"Context\"" + "'", str22, "_tset\"\\\"Python3\\\"Context\"");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 29 + "'", int23 == 29);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "4.5.2.1", true);
        java.lang.String str6 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("\"\\\"_\\\"hi!\\\"Contex\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\".5.2.\"" + "'", str5, "\".5.2.\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_\"\\\"_\\\"hi!\\\"Contex\"" + "'", str8, "_\"\\\"_\\\"hi!\\\"Contex\"");
        org.junit.Assert.assertNull(codeGenerator9);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "", false);
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("\\35");
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getLoopLabel(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\\35\"" + "'", str11, "\"\\\\35\"");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        java.lang.String str15 = python3Target1.getImplicitSetLabel("_\"\\\"_\\\"hi!\\\"Contex\"Context");
        int int16 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"_Python3\\\"\"" + "'", str13, "\"\\\"_Python3\\\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset_\"\\\"_\\\"hi!\\\"Contex\"Context" + "'", str15, "_tset_\"\\\"_\\\"hi!\\\"Contex\"Context");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 29 + "'", int16 == 29);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        boolean boolean5 = python3Target1.wantsBaseListener();
        java.lang.String str6 = python3Target1.getLanguage();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str4 = python3Target1.getListLabel("\"_Python3\"");
        java.lang.String str5 = python3Target1.getLanguage();
        java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("_Python3Context");
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("\"hi!\"Context", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getImplicitTokenLabel("\"tset_\\\\\\\"hi!\\\\\\\"Contex\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"_Python3\"" + "'", str4, "\"_Python3\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "__Python3Context" + "'", str8, "__Python3Context");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\"hi!\\\"Context\"" + "'", str11, "\"\\\"hi!\\\"Context\"");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        boolean boolean9 = python3Target1.templatesExist();
        java.lang.String str11 = python3Target1.getListLabel("\"hi!\"Context");
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "tset_\\\"hi!\\\"Contex", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST16);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"hi!\"Context" + "'", str11, "\"hi!\"Context");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "set_\\\"hi!\\\"Conte" + "'", str15, "set_\\\"hi!\\\"Conte");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        java.lang.String str9 = python3Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str11 = python3Target1.getImplicitRuleLabel("\"\\\"_\\\"hi!\\\"Contex\"Context");
        java.lang.String str13 = python3Target1.getImplicitRuleLabel("_\"\\\"_\\\"hi!\\\"Contex\"Context");
        java.util.Set<java.lang.String> strSet14 = python3Target1.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getElementListName("\\nContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_\"\\\"_\\\"hi!\\\"Contex\"Context" + "'", str11, "_\"\\\"_\\\"hi!\\\"Contex\"Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "__\"\\\"_\\\"hi!\\\"Contex\"Context" + "'", str13, "__\"\\\"_\\\"hi!\\\"Contex\"Context");
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "4.5.2.1", true);
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("\"tset\\\"_Python3\"");
        boolean boolean8 = python3Target1.templatesExist();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\".5.2.\"" + "'", str5, "\".5.2.\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"tset\\\\\\\"_Python3\\\"\"" + "'", str7, "\"\\\"tset\\\\\\\"_Python3\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
        org.antlr.v4.tool.Rule rule15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getRuleFunctionContextStructName(rule15);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "_tset\"hi!\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "", false);
        java.util.Set<java.lang.String> strSet14 = python3Target1.getBadWords();
        org.antlr.v4.tool.Grammar grammar15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.getTokenTypeAsTargetLabel(grammar15, 29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "tset\\\"hi!" + "'", str9, "tset\\\"hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
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
        java.lang.String str13 = python3Target1.encodeIntAsCharEscape(64);
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "_\"_\\\"hi!\\\"Contex\"", true);
        java.lang.String str19 = python3Target1.getImplicitSetLabel("_tset_\"Python3\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python3Target1.getElementListName("\\\"\\\\\\\"\\\\\\\\\\\\\\\"Python3\\\\\\\\\\\\\\\"Context\\\\\\\"\\\"");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "@" + "'", str13, "@");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\\\"_\\\"hi!\\\"Contex\"" + "'", str17, "\"\\\"_\\\"hi!\\\"Contex\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_tset_tset_\"Python3\"" + "'", str19, "_tset_tset_\"Python3\"");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        int int4 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_tset\"hi!\"", false);
        java.lang.String str9 = python3Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str11 = python3Target1.getImplicitRuleLabel("\"\\\"_\\\"hi!\\\"Contex\"Context");
        java.lang.String str13 = python3Target1.getImplicitRuleLabel("_tset_\"Python3\"");
        java.lang.String str15 = python3Target1.getImplicitRuleLabel("_\"\\\"hi!\\\"\"");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset\\\"hi!\\\"" + "'", str7, "_tset\\\"hi!\\\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_\"\\\"_\\\"hi!\\\"Contex\"Context" + "'", str11, "_\"\\\"_\\\"hi!\\\"Contex\"Context");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "__tset_\"Python3\"" + "'", str13, "__tset_\"Python3\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "__\"\\\"hi!\\\"\"" + "'", str15, "__\"\\\"hi!\\\"\"");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet3 = python3Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strSet3);
    }
}

