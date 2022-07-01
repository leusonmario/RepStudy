import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar2, sT3, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = pythonStringRenderer0.toString((java.lang.Object) 100, "", locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.tool.Rule rule2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = python3Target0.getRuleFunctionContextStructName(rule2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.tool.Grammar grammar3 = null;
        int[] intArray8 = new int[] { (short) 10, (short) 10, (byte) -1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = python3Target0.getTokenTypesAsTargetLabels(grammar3, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 10, -1, 100]");
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.tool.ast.GrammarAST grammarAST3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target0.getLoopLabel(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = python3Target0.getAltLabelContextStructName("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar6, sT7, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target0.getLoopCounter(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        org.antlr.v4.tool.ast.GrammarAST grammarAST3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python3Target0.getLoopCounter(grammarAST3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("d");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "d" + "'", str1, "d");
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.encodeIntAsCharEscape(100);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python3Target0.getRuleFunctionContextStructName(ruleFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = python3Target0.getLoopCounter(grammarAST2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target();
        int int2 = python3Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target1.templates;
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = pythonStringRenderer0.toString((java.lang.Object) python3Target1, "\"\"", locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python3Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNull(sTGroup3);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        java.lang.String str8 = python3Target0.encodeIntAsCharEscape((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target0.getListLabel("\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar3, sT4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.tool.Rule rule5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target0.getRuleFunctionContextStructName(rule5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar6, sT7, "4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\0" + "'", str5, "\\0");
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray4;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray4;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.encodeIntAsCharEscape(100);
        org.antlr.v4.tool.ast.GrammarAST grammarAST3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python3Target0.getLoopCounter(grammarAST3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python3Target0.getImplicitRuleLabel("4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.stringtemplate.v4.ST sT6 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar5, sT6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        java.lang.String str8 = python3Target0.encodeIntAsCharEscape((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target0.getImplicitSetLabel("4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        python3Target0.badWords = strSet3;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target0.getLoopCounter(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        python3Target0.badWords = strSet3;
        org.antlr.v4.tool.Grammar grammar6 = null;
        int[] intArray11 = new int[] { 64, 10, 10, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray12 = python3Target0.getTokenTypesAsTargetLabels(grammar6, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[64, 10, 10, 97]");
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target0.getRuleFunctionContextStructName(ruleFunction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        java.lang.String str8 = python3Target0.encodeIntAsCharEscape((int) (short) 100);
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar9, sT10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.antlr.v4.tool.ast.GrammarAST grammarAST1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = python3Target0.getLoopLabel(grammarAST1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target0.genRecognizerHeaderFile(grammar4, sT5, "\"\"\"\"");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target0.getRuleFunctionContextStructName(ruleFunction8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target0.genRecognizerHeaderFile(grammar4, sT5, "\"\"\"\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        int int4 = python3Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "" };
        python3Target3.targetCharValueEscape = strArray7;
        python3Target0.targetCharValueEscape = strArray7;
        org.antlr.v4.tool.Grammar grammar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getTokenTypeAsTargetLabel(grammar10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"i\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"i\"" + "'", str1, "\"i\"");
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        python3Target0.addBadWords();
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar11, sT12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getElementListName("\"\"i\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar7, sT8, "\"i\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        org.stringtemplate.v4.STGroup sTGroup4 = null;
        python3Target0.templates = sTGroup4;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target0.getAltLabelContextStructName("4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        org.antlr.v4.tool.Grammar grammar11 = null;
        int[] intArray12 = new int[] {};
        java.lang.String[] strArray13 = python3Target8.getTokenTypesAsTargetLabels(grammar11, intArray12);
        java.lang.String[] strArray14 = python3Target0.getTokenTypesAsTargetLabels(grammar7, intArray12);
        java.lang.String str15 = python3Target0.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup16 = python3Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(sTGroup10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.util.Set<java.lang.String> strSet5 = python3Target0.badWords;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target0.getRuleFunctionContextStructName(ruleFunction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(sTGroup3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.encodeIntAsCharEscape(100);
        org.antlr.v4.tool.ast.GrammarAST grammarAST3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "\"\"\"\"");
        java.lang.Class<?> wildcardClass11 = python3Target0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        int int3 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.tool.Rule rule4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python3Target0.getRuleFunctionContextStructName(rule4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str4 = python3Target0.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target0.getLoopCounter(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\12" + "'", str4, "\\12");
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.tool.Rule rule3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python3Target0.getRuleFunctionContextStructName(rule3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup10 = python3Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target0.getListLabel("4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"4.5.2.1\"" + "'", str1, "\"4.5.2.1\"");
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        python3Target0.addBadWords();
        python3Target0.language = "\\0";
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar10, sT11, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar11, sT12, "d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.tool.Rule rule5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target0.getRuleFunctionContextStructName(rule5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target0.getLoopLabel(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        org.antlr.v4.tool.Rule rule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target0.getRuleFunctionContextStructName(rule7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target0.genRecognizerHeaderFile(grammar4, sT5, "\"\"\"\"");
        boolean boolean8 = python3Target0.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target0.getLoopCounter(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        python3Target0.badWords = strSet3;
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.templates;
        org.antlr.v4.tool.Rule rule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target0.getRuleFunctionContextStructName(rule7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(sTGroup6);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        java.lang.String str5 = python3Target0.language;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\0", false);
        org.antlr.v4.tool.Grammar grammar9 = null;
        int[] intArray15 = new int[] { (byte) -1, (short) -1, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray16 = python3Target0.getTokenTypesAsTargetLabels(grammar9, intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\0" + "'", str8, "\\0");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, -1, 100, -1, 100]");
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str6 = python3Target0.getVersion();
        java.util.Set<java.lang.String> strSet7 = python3Target0.badWords;
        java.lang.Class<?> wildcardClass8 = python3Target0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target();
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str3 = python3Target1.language;
        java.lang.String str4 = python3Target1.getLanguage();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("");
        java.lang.String str7 = python3Target1.getVersion();
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = pythonStringRenderer0.toString((java.lang.Object) python3Target1, "4.5.2.1", locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python3Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        java.lang.String str5 = python3Target0.language;
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target0.getLoopLabel(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target0.getTokenTypeAsTargetLabel(grammar6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\"i\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\"i\"\"" + "'", str1, "\"\"i\"\"");
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        org.antlr.v4.tool.Grammar grammar11 = null;
        int[] intArray12 = new int[] {};
        java.lang.String[] strArray13 = python3Target8.getTokenTypesAsTargetLabels(grammar11, intArray12);
        java.lang.String[] strArray14 = python3Target0.getTokenTypesAsTargetLabels(grammar7, intArray12);
        java.lang.String str15 = python3Target0.getLanguage();
        java.lang.String str16 = python3Target0.getLanguage();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python3Target0.getRuleFunctionContextStructName(ruleFunction17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(sTGroup10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        int int2 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar3, sT4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "\"\"\"\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getAltLabelContextStructName("\"i\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "");
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getLoopLabel(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        java.util.Set<java.lang.String> strSet4 = python3Target0.getBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        python3Target5.badWords = strSet8;
        python3Target0.badWords = strSet8;
        java.lang.Class<?> wildcardClass12 = python3Target0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target0.genRecognizerHeaderFile(grammar4, sT5, "\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target0.getTokenTypeAsTargetLabel(grammar8, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        int[] intArray4 = new int[] {};
        java.lang.String[] strArray5 = python3Target0.getTokenTypesAsTargetLabels(grammar3, intArray4);
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        python3Target0.addBadWords();
        python3Target0.language = "\\0";
        boolean boolean10 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.tool.Rule rule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getRuleFunctionContextStructName(rule11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        org.antlr.v4.tool.Rule rule5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target0.getRuleFunctionContextStructName(rule5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(sTGroup3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        org.antlr.v4.tool.Grammar grammar11 = null;
        int[] intArray12 = new int[] {};
        java.lang.String[] strArray13 = python3Target8.getTokenTypesAsTargetLabels(grammar11, intArray12);
        java.lang.String[] strArray14 = python3Target0.getTokenTypesAsTargetLabels(grammar7, intArray12);
        java.lang.String str15 = python3Target0.getLanguage();
        java.lang.String str16 = python3Target0.getLanguage();
        java.lang.String str18 = python3Target0.getTargetStringLiteralFromString("\"i\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python3Target0.getLoopLabel(grammarAST19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(sTGroup10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\"i\"\"" + "'", str18, "\"\"i\"\"");
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        int int2 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str3 = python3Target0.getLanguage();
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar4, sT5, "\"\"i\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar4, sT5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNull(codeGenerator3);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        python3Target0.addBadWords();
        python3Target0.language = "\\0";
        boolean boolean10 = python3Target0.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getAltLabelContextStructName("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        python3Target0.badWords = strSet3;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.getCodeGenerator();
        java.lang.Class<?> wildcardClass7 = python3Target0.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "");
        java.lang.Class<?> wildcardClass11 = python3Target0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNull(codeGenerator3);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        boolean boolean7 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target0.getLoopCounter(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target0.genRecognizerHeaderFile(grammar4, sT5, "\"\"\"\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target0.getImplicitRuleLabel("\\0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        java.lang.String[] strArray0 = null;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        python3Target0.badWords = strSet3;
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.templates;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = sTGroup6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(sTGroup6);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.tool.Grammar grammar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target0.getTokenTypeAsTargetLabel(grammar6, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("hi!", false);
        org.antlr.v4.tool.Rule rule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target0.getRuleFunctionContextStructName(rule9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        int int4 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "hi!", true);
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        boolean boolean11 = python3Target0.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.addBadWords();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"i\"" + "'", str9, "\"i\"");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        org.antlr.v4.tool.Grammar grammar11 = null;
        int[] intArray12 = new int[] {};
        java.lang.String[] strArray13 = python3Target8.getTokenTypesAsTargetLabels(grammar11, intArray12);
        java.lang.String[] strArray14 = python3Target0.getTokenTypesAsTargetLabels(grammar7, intArray12);
        java.lang.String str16 = python3Target0.encodeIntAsCharEscape((int) (byte) 100);
        java.util.Set<java.lang.String> strSet17 = python3Target0.badWords;
        org.antlr.v4.tool.ast.GrammarAST grammarAST18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(sTGroup10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "d" + "'", str16, "d");
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "\"\"\"\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getElementListName("d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        python3Target0.language = "\\0";
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target0.getLoopLabel(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target0.getLoopCounter(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(sTGroup3);
        org.junit.Assert.assertNull(codeGenerator4);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str6 = python3Target0.getVersion();
        java.util.Set<java.lang.String> strSet7 = python3Target0.badWords;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        int int12 = python3Target11.getInlineTestSetWordSize();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        python3Target11.targetCharValueEscape = strArray15;
        python3Target8.targetCharValueEscape = strArray15;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray15;
        python3Target0.targetCharValueEscape = strArray15;
        org.antlr.v4.tool.ast.GrammarAST grammarAST20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python3Target0.getLoopCounter(grammarAST20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(sTGroup10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        python3Target0.addBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = pythonStringRenderer0.toString((java.lang.Object) 10L, "\"4.5.2.1\"", locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.stringtemplate.v4.ST sT6 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar5, sT6, "\"\"i\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(sTGroup3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.encodeIntAsCharEscape(100);
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target4 = new org.antlr.v4.codegen.target.Python3Target();
        int int5 = python3Target4.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target4.language;
        java.lang.String str7 = python3Target4.getVersion();
        int int8 = python3Target4.getInlineTestSetWordSize();
        java.lang.String str9 = python3Target4.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target4.gen;
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target();
        int int13 = python3Target12.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup14 = python3Target12.templates;
        org.antlr.v4.tool.Grammar grammar15 = null;
        int[] intArray16 = new int[] {};
        java.lang.String[] strArray17 = python3Target12.getTokenTypesAsTargetLabels(grammar15, intArray16);
        java.lang.String[] strArray18 = python3Target4.getTokenTypesAsTargetLabels(grammar11, intArray16);
        java.lang.String[] strArray19 = python3Target0.getTokenTypesAsTargetLabels(grammar3, intArray16);
        int int20 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Rule rule21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = python3Target0.getRuleFunctionContextStructName(rule21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNull(sTGroup14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 29 + "'", int20 == 29);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        java.lang.String str5 = python3Target0.language;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\0", false);
        int int9 = python3Target0.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup10 = null;
        python3Target0.templates = sTGroup10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target0.getListLabel("\"\\1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\0" + "'", str8, "\\0");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "hi!", true);
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        boolean boolean11 = python3Target0.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target0.getImplicitRuleLabel("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"i\"" + "'", str9, "\"i\"");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        org.antlr.v4.codegen.target.Python3Target python3Target2 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup3 = null;
        python3Target2.templates = sTGroup3;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python3Target2.badWords = strSet9;
        python3Target0.badWords = strSet9;
        python3Target0.language = "\"\"i\"\"";
        java.lang.String str15 = python3Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.stringtemplate.v4.ST sT17 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar16, sT17, "4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4.5.2.1" + "'", str15, "4.5.2.1");
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        boolean boolean6 = python3Target0.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target0.getLoopLabel(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "d", locale3);
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target();
        int int6 = python3Target5.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target5.language;
        java.lang.String str8 = python3Target5.getLanguage();
        java.lang.String str10 = python3Target5.getTargetStringLiteralFromString("");
        java.lang.String str11 = python3Target5.getVersion();
        java.util.Set<java.lang.String> strSet12 = python3Target5.badWords;
        org.antlr.v4.codegen.target.Python3Target python3Target13 = new org.antlr.v4.codegen.target.Python3Target();
        int int14 = python3Target13.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target13.templates;
        org.antlr.v4.codegen.target.Python3Target python3Target16 = new org.antlr.v4.codegen.target.Python3Target();
        int int17 = python3Target16.getInlineTestSetWordSize();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "" };
        python3Target16.targetCharValueEscape = strArray20;
        python3Target13.targetCharValueEscape = strArray20;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray20;
        python3Target5.targetCharValueEscape = strArray20;
        java.util.Locale locale26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = pythonStringRenderer0.toString((java.lang.Object) strArray20, "\"\"\"i\"\"\"", locale26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.lang.String; cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "d" + "'", str4, "d");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertNull(sTGroup15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\\12");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\12" + "'", str1, "\\12");
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"i\"");
        python3Target0.addBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target0.getLoopCounter(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"i\"\"" + "'", str6, "\"\"i\"\"");
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "d", locale3);
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target();
        int int6 = python3Target5.getInlineTestSetWordSize();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "" };
        python3Target5.targetCharValueEscape = strArray9;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray9;
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = pythonStringRenderer0.toString((java.lang.Object) strArray9, "\\0", locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.lang.String; cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "d" + "'", str4, "d");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        org.antlr.v4.tool.Rule rule4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python3Target0.getRuleFunctionContextStructName(rule4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNull(codeGenerator3);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "");
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python3Target0.genRecognizerHeaderFile(grammar11, sT12, "\"i\"");
        boolean boolean15 = python3Target0.wantsBaseListener();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target0.getRuleFunctionContextStructName(ruleFunction16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "");
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python3Target0.genRecognizerHeaderFile(grammar11, sT12, "\"i\"");
        boolean boolean15 = python3Target0.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = python3Target0.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar17 = null;
        org.stringtemplate.v4.ST sT18 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar17, sT18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(codeGenerator16);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str6 = python3Target0.getVersion();
        java.util.Set<java.lang.String> strSet7 = python3Target0.badWords;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        int int12 = python3Target11.getInlineTestSetWordSize();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        python3Target11.targetCharValueEscape = strArray15;
        python3Target8.targetCharValueEscape = strArray15;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray15;
        python3Target0.targetCharValueEscape = strArray15;
        org.antlr.v4.tool.ast.GrammarAST grammarAST20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(sTGroup10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        org.antlr.v4.tool.Grammar grammar11 = null;
        int[] intArray12 = new int[] {};
        java.lang.String[] strArray13 = python3Target8.getTokenTypesAsTargetLabels(grammar11, intArray12);
        java.lang.String[] strArray14 = python3Target0.getTokenTypesAsTargetLabels(grammar7, intArray12);
        java.lang.String str15 = python3Target0.getLanguage();
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.stringtemplate.v4.ST sT17 = null;
        python3Target0.genRecognizerHeaderFile(grammar16, sT17, "\"\"\"i\"\"\"");
        org.antlr.v4.tool.Grammar grammar20 = null;
        org.stringtemplate.v4.ST sT21 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar20, sT21, "4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(sTGroup10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "d", locale3);
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str7 = python3Target5.encodeIntAsCharEscape(100);
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target();
        int int10 = python3Target9.getInlineTestSetWordSize();
        java.lang.String str11 = python3Target9.language;
        java.lang.String str12 = python3Target9.getVersion();
        int int13 = python3Target9.getInlineTestSetWordSize();
        java.lang.String str14 = python3Target9.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python3Target9.gen;
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target17 = new org.antlr.v4.codegen.target.Python3Target();
        int int18 = python3Target17.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup19 = python3Target17.templates;
        org.antlr.v4.tool.Grammar grammar20 = null;
        int[] intArray21 = new int[] {};
        java.lang.String[] strArray22 = python3Target17.getTokenTypesAsTargetLabels(grammar20, intArray21);
        java.lang.String[] strArray23 = python3Target9.getTokenTypesAsTargetLabels(grammar16, intArray21);
        java.lang.String[] strArray24 = python3Target5.getTokenTypesAsTargetLabels(grammar8, intArray21);
        int int25 = python3Target5.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = python3Target5.getCodeGenerator();
        java.util.Locale locale28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = pythonStringRenderer0.toString((java.lang.Object) python3Target5, "\"\"\"\"", locale28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python3Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "d" + "'", str4, "d");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d" + "'", str7, "d");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
        org.junit.Assert.assertNull(sTGroup19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 29 + "'", int25 == 29);
        org.junit.Assert.assertNull(codeGenerator26);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup6 = null;
        python3Target0.templates = sTGroup6;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target0.getImplicitSetLabel("\"\"i\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.util.Set<java.lang.String> strSet3 = null;
        python3Target0.badWords = strSet3;
        boolean boolean5 = python3Target0.wantsBaseListener();
        java.lang.String str6 = python3Target0.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("hi!", false);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target0.getRuleFunctionContextStructName(ruleFunction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "hi!", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target0.getListLabel("\"\"hi!\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"i\"" + "'", str9, "\"i\"");
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "hi!", true);
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getElementListName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"i\"" + "'", str9, "\"i\"");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.Rule rule6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target0.getRuleFunctionContextStructName(rule6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\0" + "'", str5, "\\0");
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str6 = python3Target0.getLanguage();
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar7, sT8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        python3Target0.addBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        java.lang.String str10 = python3Target8.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target8.getCodeGenerator();
        java.util.Set<java.lang.String> strSet12 = python3Target8.getBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target13 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        python3Target13.badWords = strSet16;
        python3Target8.badWords = strSet16;
        python3Target0.badWords = strSet16;
        org.antlr.v4.tool.ast.GrammarAST grammarAST21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = python3Target0.getLoopLabel(grammarAST21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        org.antlr.v4.codegen.target.Python3Target python3Target2 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup3 = null;
        python3Target2.templates = sTGroup3;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python3Target2.badWords = strSet9;
        python3Target0.badWords = strSet9;
        python3Target0.language = "\"\"i\"\"";
        java.lang.String str15 = python3Target0.getVersion();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target0.getRuleFunctionContextStructName(ruleFunction16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4.5.2.1" + "'", str15, "4.5.2.1");
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        java.lang.String str5 = python3Target0.language;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\0", false);
        int int9 = python3Target0.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup10 = null;
        python3Target0.templates = sTGroup10;
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target0.getLoopLabel(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\0" + "'", str8, "\\0");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.encodeIntAsCharEscape(100);
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target4 = new org.antlr.v4.codegen.target.Python3Target();
        int int5 = python3Target4.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target4.language;
        java.lang.String str7 = python3Target4.getVersion();
        int int8 = python3Target4.getInlineTestSetWordSize();
        java.lang.String str9 = python3Target4.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target4.gen;
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target();
        int int13 = python3Target12.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup14 = python3Target12.templates;
        org.antlr.v4.tool.Grammar grammar15 = null;
        int[] intArray16 = new int[] {};
        java.lang.String[] strArray17 = python3Target12.getTokenTypesAsTargetLabels(grammar15, intArray16);
        java.lang.String[] strArray18 = python3Target4.getTokenTypesAsTargetLabels(grammar11, intArray16);
        java.lang.String[] strArray19 = python3Target0.getTokenTypesAsTargetLabels(grammar3, intArray16);
        int int20 = python3Target0.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup21 = python3Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNull(sTGroup14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 29 + "'", int20 == 29);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        python3Target0.language = "\\0";
        python3Target0.addBadWords();
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.stringtemplate.v4.ST sT14 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar13, sT14, "\"\"\"i\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        org.antlr.v4.codegen.target.Python3Target python3Target2 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup3 = null;
        python3Target2.templates = sTGroup3;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python3Target2.badWords = strSet9;
        python3Target0.badWords = strSet9;
        python3Target0.language = "\"\"i\"\"";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target0.getImplicitSetLabel("\"\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        org.antlr.v4.codegen.target.Python3Target python3Target2 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup3 = null;
        python3Target2.templates = sTGroup3;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python3Target2.badWords = strSet9;
        python3Target0.badWords = strSet9;
        python3Target0.language = "\"\"i\"\"";
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.stringtemplate.v4.ST sT16 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar15, sT16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target();
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str3 = python3Target1.language;
        java.lang.String str4 = python3Target1.getVersion();
        int int5 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.gen;
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target();
        int int10 = python3Target9.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target9.templates;
        org.antlr.v4.tool.Grammar grammar12 = null;
        int[] intArray13 = new int[] {};
        java.lang.String[] strArray14 = python3Target9.getTokenTypesAsTargetLabels(grammar12, intArray13);
        java.lang.String[] strArray15 = python3Target1.getTokenTypesAsTargetLabels(grammar8, intArray13);
        java.lang.String str17 = python3Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.util.Set<java.lang.String> strSet18 = python3Target1.badWords;
        java.util.Locale locale20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = pythonStringRenderer0.toString((java.lang.Object) strSet18, "d", locale20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.HashSet cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNull(sTGroup11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "d" + "'", str17, "d");
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        python3Target0.badWords = strSet3;
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        org.stringtemplate.v4.STGroup sTGroup4 = null;
        python3Target0.templates = sTGroup4;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target0.getElementName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python3Target0.getLoopCounter(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "");
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python3Target0.genRecognizerHeaderFile(grammar11, sT12, "\"i\"");
        boolean boolean15 = python3Target0.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target0.getImplicitTokenLabel("\"\"\"i\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        org.antlr.v4.codegen.target.Python3Target python3Target2 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup3 = null;
        python3Target2.templates = sTGroup3;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python3Target2.badWords = strSet9;
        python3Target0.badWords = strSet9;
        python3Target0.language = "\"\"i\"\"";
        org.antlr.v4.tool.Rule rule15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target0.getRuleFunctionContextStructName(rule15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        org.antlr.v4.tool.Grammar grammar11 = null;
        int[] intArray12 = new int[] {};
        java.lang.String[] strArray13 = python3Target8.getTokenTypesAsTargetLabels(grammar11, intArray12);
        java.lang.String[] strArray14 = python3Target0.getTokenTypesAsTargetLabels(grammar7, intArray12);
        java.lang.String str16 = python3Target0.encodeIntAsCharEscape((int) (byte) 100);
        java.util.Set<java.lang.String> strSet17 = python3Target0.badWords;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target0.getImplicitTokenLabel("\"\"4.5.2.1\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(sTGroup10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "d" + "'", str16, "d");
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        org.antlr.v4.tool.Grammar grammar11 = null;
        int[] intArray12 = new int[] {};
        java.lang.String[] strArray13 = python3Target8.getTokenTypesAsTargetLabels(grammar11, intArray12);
        java.lang.String[] strArray14 = python3Target0.getTokenTypesAsTargetLabels(grammar7, intArray12);
        java.lang.String str15 = python3Target0.getLanguage();
        java.lang.String str16 = python3Target0.getLanguage();
        java.lang.String str18 = python3Target0.getTargetStringLiteralFromString("\"i\"");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python3Target0.getRuleFunctionContextStructName(ruleFunction19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(sTGroup10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\"i\"\"" + "'", str18, "\"\"i\"\"");
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        org.antlr.v4.tool.Grammar grammar11 = null;
        int[] intArray12 = new int[] {};
        java.lang.String[] strArray13 = python3Target8.getTokenTypesAsTargetLabels(grammar11, intArray12);
        java.lang.String[] strArray14 = python3Target0.getTokenTypesAsTargetLabels(grammar7, intArray12);
        java.lang.String str16 = python3Target0.encodeIntAsCharEscape((int) (byte) 100);
        java.util.Set<java.lang.String> strSet17 = python3Target0.badWords;
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup18 = python3Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(sTGroup10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "d" + "'", str16, "d");
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target0.getRuleFunctionContextStructName(ruleFunction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet10 = python3Target0.badWords;
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python3Target0.genRecognizerHeaderFile(grammar11, sT12, "\"4.5.2.1\"");
        java.util.Set<java.lang.String> strSet15 = python3Target0.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target0.getImplicitTokenLabel("d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8, "\"4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python3Target0.getLoopLabel(grammarAST3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        java.lang.String[] strArray2 = python3Target0.targetCharValueEscape;
        java.lang.Class<?> wildcardClass3 = python3Target0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        python3Target0.language = "d";
        java.lang.Class<?> wildcardClass7 = python3Target0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        python3Target0.language = "\\0";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target0.getImplicitRuleLabel("\\0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"hi!\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"hi!\"" + "'", str1, "\"hi!\"");
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        org.stringtemplate.v4.STGroup sTGroup4 = null;
        python3Target0.templates = sTGroup4;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "d", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target0.getImplicitRuleLabel("\"\"i\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target0.genRecognizerHeaderFile(grammar4, sT5, "\"\"\"\"");
        boolean boolean8 = python3Target0.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar9, sT10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python3Target0.getLoopCounter(grammarAST3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\"4.5.2.1\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\"4.5.2.1\"\"" + "'", str1, "\"\"4.5.2.1\"\"");
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target0.getAltLabelContextStructName("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        int int8 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\\12", false);
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.stringtemplate.v4.ST sT14 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar13, sT14, "\"\"4.5.2.1\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\0" + "'", str5, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python3Target0.getRuleFunctionContextStructName(ruleFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(codeGenerator3);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar7, sT8, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        org.antlr.v4.codegen.target.Python3Target python3Target2 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup3 = null;
        python3Target2.templates = sTGroup3;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python3Target2.badWords = strSet9;
        python3Target0.badWords = strSet9;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target0.templates;
        org.antlr.v4.codegen.target.Python3Target python3Target14 = new org.antlr.v4.codegen.target.Python3Target();
        int int15 = python3Target14.getInlineTestSetWordSize();
        boolean boolean16 = python3Target14.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python3Target14.gen;
        boolean boolean18 = python3Target14.supportsOverloadedMethods();
        java.lang.String[] strArray19 = python3Target14.targetCharValueEscape;
        python3Target0.targetCharValueEscape = strArray19;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = python3Target0.getImplicitRuleLabel("1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(sTGroup13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(codeGenerator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        org.antlr.v4.codegen.target.Python3Target python3Target2 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup3 = null;
        python3Target2.templates = sTGroup3;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python3Target2.badWords = strSet9;
        python3Target0.badWords = strSet9;
        python3Target0.language = "\"\"i\"\"";
        java.lang.String str15 = python3Target0.language;
        org.antlr.v4.tool.Rule rule16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target0.getRuleFunctionContextStructName(rule16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\"i\"\"" + "'", str15, "\"\"i\"\"");
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        org.antlr.v4.codegen.target.Python3Target python3Target2 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup3 = null;
        python3Target2.templates = sTGroup3;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python3Target2.badWords = strSet9;
        python3Target0.badWords = strSet9;
        python3Target0.language = "\"\"i\"\"";
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup15 = python3Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("\"hi!\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target0.getLoopCounter(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(sTGroup3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"hi!\"\"" + "'", str5, "\"\"hi!\"\"");
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target0.getAltLabelContextStructName("\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        java.lang.String str4 = python3Target0.getVersion();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target0.genRecognizerHeaderFile(grammar6, sT7, "");
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str6 = python3Target0.getVersion();
        java.lang.Class<?> wildcardClass7 = python3Target0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\"\"", false);
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getImplicitSetLabel("\"\"\"\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        org.antlr.v4.tool.Grammar grammar11 = null;
        int[] intArray12 = new int[] {};
        java.lang.String[] strArray13 = python3Target8.getTokenTypesAsTargetLabels(grammar11, intArray12);
        java.lang.String[] strArray14 = python3Target0.getTokenTypesAsTargetLabels(grammar7, intArray12);
        java.lang.String str17 = python3Target0.getTargetStringLiteralFromString("", false);
        java.lang.Class<?> wildcardClass18 = python3Target0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(sTGroup10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.util.Set<java.lang.String> strSet3 = null;
        python3Target0.badWords = strSet3;
        boolean boolean5 = python3Target0.wantsBaseListener();
        java.lang.String str6 = python3Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar7, sT8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\"\"", false);
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getImplicitRuleLabel("\"4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        python3Target0.addBadWords();
        python3Target0.language = "\\0";
        boolean boolean10 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        int int12 = python3Target11.getInlineTestSetWordSize();
        java.lang.String str13 = python3Target11.language;
        java.lang.String str14 = python3Target11.getVersion();
        int int15 = python3Target11.getInlineTestSetWordSize();
        java.lang.String str16 = python3Target11.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python3Target11.gen;
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target19 = new org.antlr.v4.codegen.target.Python3Target();
        int int20 = python3Target19.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup21 = python3Target19.templates;
        org.antlr.v4.tool.Grammar grammar22 = null;
        int[] intArray23 = new int[] {};
        java.lang.String[] strArray24 = python3Target19.getTokenTypesAsTargetLabels(grammar22, intArray23);
        java.lang.String[] strArray25 = python3Target11.getTokenTypesAsTargetLabels(grammar18, intArray23);
        java.lang.String str26 = python3Target11.getLanguage();
        java.lang.String str27 = python3Target11.getLanguage();
        java.lang.String str29 = python3Target11.getTargetStringLiteralFromString("\"i\"");
        java.util.Set<java.lang.String> strSet30 = python3Target11.badWords;
        python3Target0.badWords = strSet30;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = python3Target0.getImplicitTokenLabel("@");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(codeGenerator17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 64 + "'", int20 == 64);
        org.junit.Assert.assertNull(sTGroup21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\"i\"\"" + "'", str29, "\"\"i\"\"");
        org.junit.Assert.assertNotNull(strSet30);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        python3Target0.badWords = strSet3;
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.templates;
        boolean boolean7 = python3Target0.templatesExist();
        org.antlr.v4.tool.Rule rule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target0.getRuleFunctionContextStructName(rule8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(sTGroup6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        boolean boolean2 = python3Target0.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python3Target0.getLoopCounter(grammarAST3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "d", locale3);
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str7 = python3Target5.getTargetStringLiteralFromString("\"\"");
        int int8 = python3Target5.getInlineTestSetWordSize();
        boolean boolean9 = python3Target5.supportsOverloadedMethods();
        java.lang.String str11 = python3Target5.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.stringtemplate.v4.ST sT13 = null;
        python3Target5.genRecognizerHeaderFile(grammar12, sT13, "\"\"");
        java.util.Locale locale17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = pythonStringRenderer0.toString((java.lang.Object) python3Target5, "\"\"\"4.5.2.1\"\"\"", locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python3Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "d" + "'", str4, "d");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"\"\"" + "'", str7, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\12" + "'", str11, "\\12");
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        python3Target0.gen = codeGenerator2;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python3Target0.getImplicitRuleLabel("4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        org.antlr.v4.codegen.target.Python3Target python3Target2 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup3 = null;
        python3Target2.templates = sTGroup3;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python3Target2.badWords = strSet9;
        python3Target0.badWords = strSet9;
        python3Target0.language = "\"\"i\"\"";
        java.lang.String str15 = python3Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.stringtemplate.v4.ST sT17 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar16, sT17, "\\0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4.5.2.1" + "'", str15, "4.5.2.1");
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target0.getRuleFunctionContextStructName(ruleFunction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        org.antlr.v4.tool.Grammar grammar11 = null;
        int[] intArray12 = new int[] {};
        java.lang.String[] strArray13 = python3Target8.getTokenTypesAsTargetLabels(grammar11, intArray12);
        java.lang.String[] strArray14 = python3Target0.getTokenTypesAsTargetLabels(grammar7, intArray12);
        java.lang.String str15 = python3Target0.getLanguage();
        java.lang.String str16 = python3Target0.getLanguage();
        java.lang.String str18 = python3Target0.getTargetStringLiteralFromString("\"i\"");
        java.util.Set<java.lang.String> strSet19 = python3Target0.badWords;
        boolean boolean20 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = python3Target0.getRuleFunctionContextStructName(ruleFunction21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(sTGroup10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\"i\"\"" + "'", str18, "\"\"i\"\"");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "hi!", true);
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str13 = python3Target12.language;
        org.antlr.v4.codegen.target.Python3Target python3Target14 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup15 = null;
        python3Target14.templates = sTGroup15;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        python3Target14.badWords = strSet21;
        python3Target12.badWords = strSet21;
        org.antlr.v4.tool.Grammar grammar25 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target26 = new org.antlr.v4.codegen.target.Python3Target();
        int int27 = python3Target26.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup28 = python3Target26.templates;
        org.antlr.v4.tool.Grammar grammar29 = null;
        int[] intArray30 = new int[] {};
        java.lang.String[] strArray31 = python3Target26.getTokenTypesAsTargetLabels(grammar29, intArray30);
        java.lang.String[] strArray32 = python3Target12.getTokenTypesAsTargetLabels(grammar25, intArray30);
        java.lang.String[] strArray33 = python3Target0.getTokenTypesAsTargetLabels(grammar11, intArray30);
        java.lang.Class<?> wildcardClass34 = python3Target0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"i\"" + "'", str9, "\"i\"");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 64 + "'", int27 == 64);
        org.junit.Assert.assertNull(sTGroup28);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[]");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        java.lang.String str4 = python3Target0.getVersion();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target0.getLoopCounter(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str4 = python3Target0.encodeIntAsCharEscape((int) (byte) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "\"\"i\"\"", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target0.getElementListName("\"\"\"\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\1" + "'", str4, "\\1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"i\\\"\"" + "'", str8, "\"\\\"i\\\"\"");
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = python3Target0.getRuleFunctionContextStructName(ruleFunction1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        python3Target0.addBadWords();
        python3Target0.language = "\\0";
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar10, sT11, "\"\\12\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        org.stringtemplate.v4.STGroup sTGroup4 = null;
        python3Target0.templates = sTGroup4;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\"hi!\"", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target0.getImplicitRuleLabel("\"\\1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"hi!\"" + "'", str9, "\"hi!\"");
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\"\"", false);
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getListLabel("\"\\12\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.util.Set<java.lang.String> strSet3 = null;
        python3Target0.badWords = strSet3;
        boolean boolean5 = python3Target0.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target0.getImplicitRuleLabel("\"\"\"i\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "\"\"");
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar11, sT12, "\"\\\"i\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\12" + "'", str6, "\\12");
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python3Target0.getLoopLabel(grammarAST3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        python3Target0.language = "\\0";
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target();
        int int13 = python3Target12.getInlineTestSetWordSize();
        java.lang.String str14 = python3Target12.language;
        java.lang.String str15 = python3Target12.getVersion();
        org.stringtemplate.v4.STGroup sTGroup16 = null;
        python3Target12.templates = sTGroup16;
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        java.lang.String str21 = python3Target12.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator18, "d", false);
        java.util.Set<java.lang.String> strSet22 = python3Target12.getBadWords();
        python3Target0.badWords = strSet22;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = python3Target0.getElementName("\"\\\"i\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4.5.2.1" + "'", str15, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        java.util.Set<java.lang.String> strSet10 = python3Target0.badWords;
        java.lang.String str11 = python3Target0.language;
        org.antlr.v4.tool.Rule rule12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target0.getRuleFunctionContextStructName(rule12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getTargetStringLiteralFromString("\"\"4.5.2.1\"\"");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python3Target0.getRuleFunctionContextStructName(ruleFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"\"4.5.2.1\"\"\"" + "'", str3, "\"\"\"4.5.2.1\"\"\"");
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\\0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\0" + "'", str1, "\\0");
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target0.genRecognizerHeaderFile(grammar4, sT5, "\"\"\"\"");
        boolean boolean8 = python3Target0.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "");
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python3Target0.genRecognizerHeaderFile(grammar11, sT12, "\"i\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python3Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        python3Target0.gen = codeGenerator16;
        java.lang.String str18 = python3Target0.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python3Target0.getElementListName("@");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target0.gen;
        java.lang.String str8 = python3Target0.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        python3Target0.addBadWords();
        python3Target0.language = "\\0";
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target0.getLoopCounter(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        python3Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar9, sT10, "\"4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(codeGenerator8);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\\\"i\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"i\\\"\"" + "'", str1, "\"\\\"i\\\"\"");
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "d", locale3);
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target();
        int int6 = python3Target5.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target5.language;
        java.lang.String str8 = python3Target5.getVersion();
        int int9 = python3Target5.getInlineTestSetWordSize();
        java.lang.String str10 = python3Target5.getLanguage();
        java.lang.String str13 = python3Target5.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean14 = python3Target5.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet15 = python3Target5.badWords;
        org.antlr.v4.codegen.target.Python3Target python3Target16 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str17 = python3Target16.language;
        java.lang.String[] strArray18 = python3Target16.targetCharValueEscape;
        python3Target5.targetCharValueEscape = strArray18;
        java.util.Locale locale21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = pythonStringRenderer0.toString((java.lang.Object) strArray18, "\".5.2.\"", locale21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.lang.String; cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "d" + "'", str4, "d");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"4.5.2.1\"" + "'", str13, "\"4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strArray18);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str6 = python3Target0.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target0.getAltLabelContextStructName("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("@", false);
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar8, sT9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "@" + "'", str7, "@");
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        python3Target0.language = "\\0";
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target();
        int int13 = python3Target12.getInlineTestSetWordSize();
        java.lang.String str14 = python3Target12.language;
        java.lang.String str15 = python3Target12.getVersion();
        org.stringtemplate.v4.STGroup sTGroup16 = null;
        python3Target12.templates = sTGroup16;
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        java.lang.String str21 = python3Target12.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator18, "d", false);
        java.util.Set<java.lang.String> strSet22 = python3Target12.getBadWords();
        python3Target0.badWords = strSet22;
        org.antlr.v4.tool.Grammar grammar24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = python3Target0.getTokenTypeAsTargetLabel(grammar24, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4.5.2.1" + "'", str15, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python3Target0.getTokenTypeAsTargetLabel(grammar3, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str8 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python3Target0.gen = codeGenerator10;
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup12 = python3Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\0" + "'", str5, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator9);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "hi!", true);
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getLoopCounter(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"i\"" + "'", str9, "\"i\"");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "hi!", true);
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str13 = python3Target12.language;
        org.antlr.v4.codegen.target.Python3Target python3Target14 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup15 = null;
        python3Target14.templates = sTGroup15;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        python3Target14.badWords = strSet21;
        python3Target12.badWords = strSet21;
        org.antlr.v4.tool.Grammar grammar25 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target26 = new org.antlr.v4.codegen.target.Python3Target();
        int int27 = python3Target26.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup28 = python3Target26.templates;
        org.antlr.v4.tool.Grammar grammar29 = null;
        int[] intArray30 = new int[] {};
        java.lang.String[] strArray31 = python3Target26.getTokenTypesAsTargetLabels(grammar29, intArray30);
        java.lang.String[] strArray32 = python3Target12.getTokenTypesAsTargetLabels(grammar25, intArray30);
        java.lang.String[] strArray33 = python3Target0.getTokenTypesAsTargetLabels(grammar11, intArray30);
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = python3Target0.gen;
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup35 = python3Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"i\"" + "'", str9, "\"i\"");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 64 + "'", int27 == 64);
        org.junit.Assert.assertNull(sTGroup28);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[]");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNull(codeGenerator34);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target0.supportsOverloadedMethods();
        java.lang.String[] strArray10 = python3Target0.targetCharValueEscape;
        java.lang.Class<?> wildcardClass11 = python3Target0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8, "\"4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "hi!", true);
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "4.5.2.1", true);
        org.antlr.v4.tool.Rule rule15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target0.getRuleFunctionContextStructName(rule15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"i\"" + "'", str9, "\"i\"");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\".5.2.\"" + "'", str14, "\".5.2.\"");
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        org.antlr.v4.codegen.target.Python3Target python3Target2 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup3 = null;
        python3Target2.templates = sTGroup3;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python3Target2.badWords = strSet9;
        python3Target0.badWords = strSet9;
        python3Target0.language = "\"\"i\"\"";
        java.lang.String str15 = python3Target0.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target0.getLoopLabel(grammarAST16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4.5.2.1" + "'", str15, "4.5.2.1");
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.templates;
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target0.getRuleFunctionContextStructName(ruleFunction8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"\"\"\"\"" + "'", str7, "\"\"\"\"\"\"");
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "hi!", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target0.getLoopCounter(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"i\"" + "'", str9, "\"i\"");
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str6 = python3Target0.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target0.getLoopCounter(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        python3Target0.addBadWords();
        python3Target0.language = "\\0";
        boolean boolean10 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        int int12 = python3Target11.getInlineTestSetWordSize();
        java.lang.String str13 = python3Target11.language;
        java.lang.String str14 = python3Target11.getVersion();
        int int15 = python3Target11.getInlineTestSetWordSize();
        java.lang.String str16 = python3Target11.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python3Target11.gen;
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target19 = new org.antlr.v4.codegen.target.Python3Target();
        int int20 = python3Target19.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup21 = python3Target19.templates;
        org.antlr.v4.tool.Grammar grammar22 = null;
        int[] intArray23 = new int[] {};
        java.lang.String[] strArray24 = python3Target19.getTokenTypesAsTargetLabels(grammar22, intArray23);
        java.lang.String[] strArray25 = python3Target11.getTokenTypesAsTargetLabels(grammar18, intArray23);
        java.lang.String str26 = python3Target11.getLanguage();
        java.lang.String str27 = python3Target11.getLanguage();
        java.lang.String str29 = python3Target11.getTargetStringLiteralFromString("\"i\"");
        java.util.Set<java.lang.String> strSet30 = python3Target11.badWords;
        python3Target0.badWords = strSet30;
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = null;
        python3Target0.gen = codeGenerator32;
        org.antlr.v4.tool.ast.GrammarAST grammarAST34 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(codeGenerator17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 64 + "'", int20 == 64);
        org.junit.Assert.assertNull(sTGroup21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\"i\"\"" + "'", str29, "\"\"i\"\"");
        org.junit.Assert.assertNotNull(strSet30);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        java.lang.String str10 = python3Target0.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getListLabel("d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\"hi!\"\"" + "'", str1, "\"\"hi!\"\"");
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "");
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python3Target0.genRecognizerHeaderFile(grammar11, sT12, "\"i\"");
        int int15 = python3Target0.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target0.getAltLabelContextStructName("\"\\1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        java.lang.String str8 = python3Target0.encodeIntAsCharEscape((int) (short) 100);
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.templates;
        java.lang.String str11 = python3Target0.encodeIntAsCharEscape(29);
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target0.getLoopCounter(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertNull(sTGroup9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\35" + "'", str11, "\\35");
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target0.getLoopCounter(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "d", locale3);
        java.util.Locale locale7 = null;
        java.lang.String str8 = pythonStringRenderer0.toString((java.lang.Object) "\"\"i\"\"", "\\12", locale7);
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target();
        int int10 = python3Target9.getInlineTestSetWordSize();
        java.lang.String str11 = python3Target9.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python3Target9.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "", true);
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.stringtemplate.v4.ST sT17 = null;
        python3Target9.genRecognizerHeaderFile(grammar16, sT17, "");
        org.antlr.v4.tool.Grammar grammar20 = null;
        org.stringtemplate.v4.ST sT21 = null;
        python3Target9.genRecognizerHeaderFile(grammar20, sT21, "\"i\"");
        boolean boolean24 = python3Target9.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        python3Target9.gen = codeGenerator25;
        boolean boolean27 = python3Target9.wantsBaseVisitor();
        java.util.Locale locale29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = pythonStringRenderer0.toString((java.lang.Object) boolean27, "\"\"\"4.5.2.1\"\"\"", locale29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "d" + "'", str4, "d");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\12" + "'", str8, "\\12");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\"" + "'", str15, "\"\"");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        int int4 = python3Target3.getInlineTestSetWordSize();
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "" };
        python3Target3.targetCharValueEscape = strArray7;
        python3Target0.targetCharValueEscape = strArray7;
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar10, sT11, "\"\"i\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        int int8 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\\12", false);
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup13 = python3Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\0" + "'", str5, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        org.antlr.v4.tool.Grammar grammar11 = null;
        int[] intArray12 = new int[] {};
        java.lang.String[] strArray13 = python3Target8.getTokenTypesAsTargetLabels(grammar11, intArray12);
        java.lang.String[] strArray14 = python3Target0.getTokenTypesAsTargetLabels(grammar7, intArray12);
        java.lang.String str15 = python3Target0.getLanguage();
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.stringtemplate.v4.ST sT17 = null;
        python3Target0.genRecognizerHeaderFile(grammar16, sT17, "\"\"\"i\"\"\"");
        org.antlr.v4.tool.Grammar grammar20 = null;
        org.stringtemplate.v4.ST sT21 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar20, sT21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(sTGroup10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target0.getLoopLabel(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        python3Target0.addBadWords();
        python3Target0.language = "\\0";
        boolean boolean10 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        int int12 = python3Target11.getInlineTestSetWordSize();
        java.lang.String str13 = python3Target11.language;
        java.lang.String str14 = python3Target11.getVersion();
        int int15 = python3Target11.getInlineTestSetWordSize();
        java.lang.String str16 = python3Target11.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python3Target11.gen;
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target19 = new org.antlr.v4.codegen.target.Python3Target();
        int int20 = python3Target19.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup21 = python3Target19.templates;
        org.antlr.v4.tool.Grammar grammar22 = null;
        int[] intArray23 = new int[] {};
        java.lang.String[] strArray24 = python3Target19.getTokenTypesAsTargetLabels(grammar22, intArray23);
        java.lang.String[] strArray25 = python3Target11.getTokenTypesAsTargetLabels(grammar18, intArray23);
        java.lang.String str26 = python3Target11.getLanguage();
        java.lang.String str27 = python3Target11.getLanguage();
        java.lang.String str29 = python3Target11.getTargetStringLiteralFromString("\"i\"");
        java.util.Set<java.lang.String> strSet30 = python3Target11.badWords;
        python3Target0.badWords = strSet30;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = python3Target0.getRuleFunctionContextStructName(ruleFunction32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(codeGenerator17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 64 + "'", int20 == 64);
        org.junit.Assert.assertNull(sTGroup21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\"i\"\"" + "'", str29, "\"\"i\"\"");
        org.junit.Assert.assertNotNull(strSet30);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\"" + "'", str1, "\"\"");
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.antlr.v4.tool.Grammar grammar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = python3Target0.getTokenTypeAsTargetLabel(grammar1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        java.util.Set<java.lang.String> strSet7 = python3Target0.getBadWords();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target0.getRuleFunctionContextStructName(ruleFunction8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.util.Set<java.lang.String> strSet3 = null;
        python3Target0.badWords = strSet3;
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        int int6 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray7 = python3Target0.targetCharValueEscape;
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"i\"\"", true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"\"i\"\"\"" + "'", str10, "\"\"\"i\"\"\"");
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.util.Set<java.lang.String> strSet3 = null;
        python3Target0.badWords = strSet3;
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        int int6 = python3Target0.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target0.getAltLabelContextStructName("i");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        java.util.Set<java.lang.String> strSet9 = python3Target0.badWords;
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar11, sT12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8, "\"4.5.2.1\"");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target0.getLoopLabel(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        org.stringtemplate.v4.STGroup sTGroup4 = null;
        python3Target0.templates = sTGroup4;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\"hi!\"", true);
        java.lang.Class<?> wildcardClass10 = python3Target0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"hi!\"" + "'", str9, "\"hi!\"");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target0.genRecognizerHeaderFile(grammar4, sT5, "\"\"\"\"");
        boolean boolean8 = python3Target0.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target0.getImplicitSetLabel("\"\"4.5.2.1\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\0", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target0.getLoopLabel(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\0" + "'", str8, "\\0");
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\"\"", false);
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str11 = python3Target10.language;
        java.lang.String[] strArray12 = python3Target10.targetCharValueEscape;
        python3Target0.targetCharValueEscape = strArray12;
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.stringtemplate.v4.ST sT15 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar14, sT15, "\"i\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        int int8 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\\12", false);
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.stringtemplate.v4.ST sT14 = null;
        python3Target0.genRecognizerHeaderFile(grammar13, sT14, "d");
        python3Target0.addBadWords();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup18 = python3Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\0" + "'", str5, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "hi!", true);
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str11 = python3Target0.getLanguage();
        org.antlr.v4.tool.Rule rule12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target0.getRuleFunctionContextStructName(rule12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"i\"" + "'", str9, "\"i\"");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str6 = python3Target0.getVersion();
        org.stringtemplate.v4.STGroup sTGroup7 = null;
        python3Target0.templates = sTGroup7;
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        python3Target0.addBadWords();
        python3Target0.language = "\\0";
        boolean boolean10 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        int int12 = python3Target11.getInlineTestSetWordSize();
        java.lang.String str13 = python3Target11.language;
        java.lang.String str14 = python3Target11.getVersion();
        int int15 = python3Target11.getInlineTestSetWordSize();
        java.lang.String str16 = python3Target11.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python3Target11.gen;
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target19 = new org.antlr.v4.codegen.target.Python3Target();
        int int20 = python3Target19.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup21 = python3Target19.templates;
        org.antlr.v4.tool.Grammar grammar22 = null;
        int[] intArray23 = new int[] {};
        java.lang.String[] strArray24 = python3Target19.getTokenTypesAsTargetLabels(grammar22, intArray23);
        java.lang.String[] strArray25 = python3Target11.getTokenTypesAsTargetLabels(grammar18, intArray23);
        java.lang.String str26 = python3Target11.getLanguage();
        java.lang.String str27 = python3Target11.getLanguage();
        java.lang.String str29 = python3Target11.getTargetStringLiteralFromString("\"i\"");
        java.util.Set<java.lang.String> strSet30 = python3Target11.badWords;
        python3Target0.badWords = strSet30;
        org.antlr.v4.tool.ast.GrammarAST grammarAST32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = python3Target0.getLoopCounter(grammarAST32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(codeGenerator17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 64 + "'", int20 == 64);
        org.junit.Assert.assertNull(sTGroup21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\"i\"\"" + "'", str29, "\"\"i\"\"");
        org.junit.Assert.assertNotNull(strSet30);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        int int8 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\\12", false);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target0.getRuleFunctionContextStructName(ruleFunction13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\0" + "'", str5, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.util.Set<java.lang.String> strSet3 = null;
        python3Target0.badWords = strSet3;
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target0.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target0.getTokenTypeAsTargetLabel(grammar8, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator7);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        java.lang.String str12 = python3Target0.getTargetStringLiteralFromString("hi!", true);
        int int13 = python3Target0.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target0.getElementListName("i");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        int int2 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python3Target0.getRuleFunctionContextStructName(ruleFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("@");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "@" + "'", str1, "@");
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target();
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        python3Target1.targetCharValueEscape = strArray5;
        java.lang.String[] strArray7 = python3Target1.targetCharValueEscape;
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = pythonStringRenderer0.toString((java.lang.Object) strArray7, "\\12", locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.lang.String; cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str4 = python3Target0.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target0.getRuleFunctionContextStructName(ruleFunction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\12" + "'", str4, "\\12");
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        int int2 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str3 = python3Target0.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("4.5.2.1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4.5.2.1" + "'", str1, "4.5.2.1");
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.encodeIntAsCharEscape(100);
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target4 = new org.antlr.v4.codegen.target.Python3Target();
        int int5 = python3Target4.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target4.language;
        java.lang.String str7 = python3Target4.getVersion();
        int int8 = python3Target4.getInlineTestSetWordSize();
        java.lang.String str9 = python3Target4.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target4.gen;
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target();
        int int13 = python3Target12.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup14 = python3Target12.templates;
        org.antlr.v4.tool.Grammar grammar15 = null;
        int[] intArray16 = new int[] {};
        java.lang.String[] strArray17 = python3Target12.getTokenTypesAsTargetLabels(grammar15, intArray16);
        java.lang.String[] strArray18 = python3Target4.getTokenTypesAsTargetLabels(grammar11, intArray16);
        java.lang.String[] strArray19 = python3Target0.getTokenTypesAsTargetLabels(grammar3, intArray16);
        int int20 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = python3Target0.getCodeGenerator();
        boolean boolean22 = python3Target0.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNull(sTGroup14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 29 + "'", int20 == 29);
        org.junit.Assert.assertNull(codeGenerator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "d", locale3);
        java.util.Locale locale7 = null;
        java.lang.String str8 = pythonStringRenderer0.toString((java.lang.Object) "\"\"\"i\"\"\"", "4.5.2.1", locale7);
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str11 = python3Target9.getTargetStringLiteralFromString("\"\"");
        int int12 = python3Target9.getInlineTestSetWordSize();
        java.lang.String str14 = python3Target9.encodeIntAsCharEscape(0);
        java.lang.String str16 = python3Target9.getTargetStringLiteralFromString("");
        int int17 = python3Target9.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        java.lang.String str21 = python3Target9.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator18, "\\12", false);
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.stringtemplate.v4.ST sT23 = null;
        python3Target9.genRecognizerHeaderFile(grammar22, sT23, "d");
        python3Target9.addBadWords();
        java.util.Locale locale28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = pythonStringRenderer0.toString((java.lang.Object) python3Target9, "\"\"\"\"\"4.5.2.1\"\"\"\"\"", locale28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python3Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "d" + "'", str4, "d");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\"\"\"" + "'", str11, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\0" + "'", str14, "\\0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"" + "'", str16, "\"\"");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1" + "'", str21, "1");
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\"\"", false);
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target0.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup13 = python3Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertNull(codeGenerator12);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "\"4.5.2.1\"");
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup11 = python3Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(sTGroup5);
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("hi!", false);
        python3Target0.language = "\"\"i\"\"";
        org.antlr.v4.codegen.model.RuleFunction ruleFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getRuleFunctionContextStructName(ruleFunction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        org.stringtemplate.v4.STGroup sTGroup4 = null;
        python3Target0.templates = sTGroup4;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "d", false);
        java.lang.String str10 = python3Target0.getVersion();
        int int11 = python3Target0.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target0.getAltLabelContextStructName("\"\\1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        python3Target0.language = "1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target0.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(codeGenerator12);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "d", locale3);
        java.util.Locale locale7 = null;
        java.lang.String str8 = pythonStringRenderer0.toString((java.lang.Object) "\"\"\"i\"\"\"", "4.5.2.1", locale7);
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target();
        int int10 = python3Target9.getInlineTestSetWordSize();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "" };
        python3Target9.targetCharValueEscape = strArray13;
        java.util.Set<java.lang.String> strSet15 = python3Target9.badWords;
        java.util.Locale locale17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = pythonStringRenderer0.toString((java.lang.Object) python3Target9, "\\1", locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python3Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "d" + "'", str4, "d");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target0.genRecognizerHeaderFile(grammar4, sT5, "\"\"\"\"");
        boolean boolean8 = python3Target0.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar10, sT11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(codeGenerator9);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        python3Target0.addBadWords();
        boolean boolean11 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.stringtemplate.v4.ST sT13 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar12, sT13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        int int4 = python3Target0.getInlineTestSetWordSize();
        python3Target0.addBadWords();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target7 = new org.antlr.v4.codegen.target.Python3Target();
        int int8 = python3Target7.getInlineTestSetWordSize();
        java.lang.String str9 = python3Target7.language;
        java.lang.String str10 = python3Target7.getLanguage();
        java.lang.String str12 = python3Target7.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python3Target7.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "hi!", true);
        int int17 = python3Target7.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target19 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str20 = python3Target19.language;
        org.antlr.v4.codegen.target.Python3Target python3Target21 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup22 = null;
        python3Target21.templates = sTGroup22;
        java.lang.String[] strArray27 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        python3Target21.badWords = strSet28;
        python3Target19.badWords = strSet28;
        org.antlr.v4.tool.Grammar grammar32 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target33 = new org.antlr.v4.codegen.target.Python3Target();
        int int34 = python3Target33.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup35 = python3Target33.templates;
        org.antlr.v4.tool.Grammar grammar36 = null;
        int[] intArray37 = new int[] {};
        java.lang.String[] strArray38 = python3Target33.getTokenTypesAsTargetLabels(grammar36, intArray37);
        java.lang.String[] strArray39 = python3Target19.getTokenTypesAsTargetLabels(grammar32, intArray37);
        java.lang.String[] strArray40 = python3Target7.getTokenTypesAsTargetLabels(grammar18, intArray37);
        java.lang.String[] strArray41 = python3Target0.getTokenTypesAsTargetLabels(grammar6, intArray37);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str43 = python3Target0.getElementName("@");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"i\"" + "'", str16, "\"i\"");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 29 + "'", int17 == 29);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 64 + "'", int34 == 64);
        org.junit.Assert.assertNull(sTGroup35);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[]");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(strArray41);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        org.antlr.v4.codegen.target.Python3Target python3Target2 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup3 = null;
        python3Target2.templates = sTGroup3;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python3Target2.badWords = strSet9;
        python3Target0.badWords = strSet9;
        python3Target0.language = "\"\"i\"\"";
        java.lang.String str15 = python3Target0.getVersion();
        int int16 = python3Target0.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python3Target0.getImplicitSetLabel("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4.5.2.1" + "'", str15, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 29 + "'", int16 == 29);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target();
        int int6 = python3Target5.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target5.language;
        java.lang.String str8 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python3Target5.templates = sTGroup9;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python3Target5.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "d", false);
        java.util.Set<java.lang.String> strSet15 = python3Target5.getBadWords();
        python3Target0.badWords = strSet15;
        python3Target0.language = "\".5.2.\"";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python3Target0.getAltLabelContextStructName("\\12");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "d", locale3);
        java.util.Locale locale7 = null;
        java.lang.String str8 = pythonStringRenderer0.toString((java.lang.Object) "\".5.2.\"", "@", locale7);
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target();
        int int10 = python3Target9.getInlineTestSetWordSize();
        boolean boolean11 = python3Target9.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target9.gen;
        boolean boolean13 = python3Target9.supportsOverloadedMethods();
        java.lang.String[] strArray14 = python3Target9.targetCharValueEscape;
        java.util.Locale locale16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = pythonStringRenderer0.toString((java.lang.Object) python3Target9, "\".5.2.\"", locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python3Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "d" + "'", str4, "d");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "@" + "'", str8, "@");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\\35");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\35" + "'", str1, "\\35");
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        int int4 = python3Target0.getInlineTestSetWordSize();
        python3Target0.addBadWords();
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\"\"hi!\"\"");
        org.antlr.v4.tool.Grammar grammar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target0.getTokenTypeAsTargetLabel(grammar8, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"\"hi!\"\"\"" + "'", str7, "\"\"\"hi!\"\"\"");
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        boolean boolean7 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target0.getTokenTypeAsTargetLabel(grammar8, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.templates;
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar8, sT9, "\"\"i\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"\"\"\"\"" + "'", str7, "\"\"\"\"\"\"");
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target0.genRecognizerHeaderFile(grammar6, sT7, "\"\"\"\"\"\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target0.getImplicitTokenLabel("\".5.2.\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet10 = python3Target0.badWords;
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python3Target0.genRecognizerHeaderFile(grammar11, sT12, "\"4.5.2.1\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        java.lang.String str18 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator15, "i", true);
        org.antlr.v4.tool.Rule rule19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python3Target0.getRuleFunctionContextStructName(rule19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8, "\"4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\"" + "'", str18, "\"\"");
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target0.gen;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target0.getRuleFunctionContextStructName(ruleFunction8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNull(codeGenerator7);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        java.lang.String str5 = python3Target0.language;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\0", false);
        int int9 = python3Target0.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet10 = python3Target0.getBadWords();
        python3Target0.addBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target0.getLoopLabel(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\0" + "'", str8, "\\0");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target0.getElementListName("\"i\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "d", locale3);
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str7 = python3Target5.getTargetStringLiteralFromString("\"\"");
        int int8 = python3Target5.getInlineTestSetWordSize();
        boolean boolean9 = python3Target5.supportsOverloadedMethods();
        java.lang.String str11 = python3Target5.getTargetStringLiteralFromString("\"i\"");
        python3Target5.addBadWords();
        java.util.Set<java.lang.String> strSet13 = python3Target5.badWords;
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = pythonStringRenderer0.toString((java.lang.Object) strSet13, "\\1", locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.HashSet cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "d" + "'", str4, "d");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"\"\"" + "'", str7, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\"i\"\"" + "'", str11, "\"\"i\"\"");
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        python3Target0.genRecognizerHeaderFile(grammar10, sT11, "\\1");
        java.lang.String str14 = python3Target0.getLanguage();
        org.antlr.v4.tool.Grammar grammar15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target0.getTokenTypeAsTargetLabel(grammar15, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8, "\"4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target0.gen;
        java.lang.String str8 = python3Target0.language;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target0.getAltLabelContextStructName("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.util.Set<java.lang.String> strSet3 = null;
        python3Target0.badWords = strSet3;
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\12", true);
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\12\"" + "'", str8, "\"\\12\"");
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String[] strArray3 = python3Target0.targetCharValueEscape;
        java.lang.Class<?> wildcardClass4 = python3Target0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.encodeIntAsCharEscape(100);
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target4 = new org.antlr.v4.codegen.target.Python3Target();
        int int5 = python3Target4.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target4.language;
        java.lang.String str7 = python3Target4.getVersion();
        int int8 = python3Target4.getInlineTestSetWordSize();
        java.lang.String str9 = python3Target4.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target4.gen;
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target();
        int int13 = python3Target12.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup14 = python3Target12.templates;
        org.antlr.v4.tool.Grammar grammar15 = null;
        int[] intArray16 = new int[] {};
        java.lang.String[] strArray17 = python3Target12.getTokenTypesAsTargetLabels(grammar15, intArray16);
        java.lang.String[] strArray18 = python3Target4.getTokenTypesAsTargetLabels(grammar11, intArray16);
        java.lang.String[] strArray19 = python3Target0.getTokenTypesAsTargetLabels(grammar3, intArray16);
        org.antlr.v4.tool.ast.GrammarAST grammarAST20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python3Target0.getLoopLabel(grammarAST20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNull(sTGroup14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        java.lang.String str5 = python3Target0.language;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\0", false);
        int int9 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target0.getLoopLabel(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\0" + "'", str8, "\\0");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        org.stringtemplate.v4.STGroup sTGroup4 = null;
        python3Target0.templates = sTGroup4;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "d", false);
        java.util.Set<java.lang.String> strSet10 = python3Target0.getBadWords();
        boolean boolean11 = python3Target0.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target0.getImplicitRuleLabel("\"\".5.2.\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"i\"");
        python3Target0.addBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str9 = python3Target8.language;
        java.lang.String[] strArray10 = python3Target8.targetCharValueEscape;
        python3Target0.targetCharValueEscape = strArray10;
        org.stringtemplate.v4.STGroup sTGroup12 = null;
        python3Target0.templates = sTGroup12;
        org.antlr.v4.codegen.target.Python3Target python3Target14 = new org.antlr.v4.codegen.target.Python3Target();
        int int15 = python3Target14.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup16 = python3Target14.templates;
        org.antlr.v4.codegen.target.Python3Target python3Target17 = new org.antlr.v4.codegen.target.Python3Target();
        int int18 = python3Target17.getInlineTestSetWordSize();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "" };
        python3Target17.targetCharValueEscape = strArray21;
        python3Target14.targetCharValueEscape = strArray21;
        python3Target0.targetCharValueEscape = strArray21;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = python3Target0.getAltLabelContextStructName("\"\\12\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"i\"\"" + "'", str6, "\"\"i\"\"");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertNull(sTGroup16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 64 + "'", int18 == 64);
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python3Target0.getLoopLabel(grammarAST3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        org.antlr.v4.tool.Grammar grammar11 = null;
        int[] intArray12 = new int[] {};
        java.lang.String[] strArray13 = python3Target8.getTokenTypesAsTargetLabels(grammar11, intArray12);
        java.lang.String[] strArray14 = python3Target0.getTokenTypesAsTargetLabels(grammar7, intArray12);
        java.lang.String str15 = python3Target0.getLanguage();
        java.lang.String str16 = python3Target0.getLanguage();
        java.lang.String str18 = python3Target0.getTargetStringLiteralFromString("\"i\"");
        java.util.Set<java.lang.String> strSet19 = python3Target0.badWords;
        boolean boolean20 = python3Target0.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup21 = python3Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(sTGroup10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\"i\"\"" + "'", str18, "\"\"i\"\"");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target0.getAltLabelContextStructName("\"4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        java.util.Set<java.lang.String> strSet4 = python3Target0.getBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        python3Target5.badWords = strSet8;
        python3Target0.badWords = strSet8;
        java.lang.String str12 = python3Target0.getVersion();
        java.lang.Class<?> wildcardClass13 = python3Target0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        java.lang.String str4 = python3Target0.getVersion();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target0.genRecognizerHeaderFile(grammar6, sT7, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target0.getImplicitTokenLabel("\"\\1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "");
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python3Target0.genRecognizerHeaderFile(grammar11, sT12, "\"i\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python3Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        python3Target0.gen = codeGenerator16;
        org.stringtemplate.v4.STGroup sTGroup18 = null;
        python3Target0.templates = sTGroup18;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        python3Target0.gen = codeGenerator21;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = python3Target0.getAltLabelContextStructName("\"4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertNull(codeGenerator20);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target0.genRecognizerHeaderFile(grammar6, sT7, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target0.getListLabel("\\0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        python3Target0.addBadWords();
        python3Target0.language = "\\0";
        boolean boolean10 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target0.getCodeGenerator();
        java.util.Set<java.lang.String> strSet12 = python3Target0.badWords;
        java.lang.String str13 = python3Target0.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.getCodeGenerator();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\12");
        java.lang.Class<?> wildcardClass9 = python3Target0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(sTGroup5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\12\"" + "'", str8, "\"\\12\"");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "");
        org.antlr.v4.tool.Grammar grammar11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target0.getTokenTypeAsTargetLabel(grammar11, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\"\"4.5.2.1\"\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\"\"4.5.2.1\"\"\"" + "'", str1, "\"\"\"4.5.2.1\"\"\"");
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target0.genRecognizerHeaderFile(grammar4, sT5, "\"\"\"\"");
        boolean boolean8 = python3Target0.wantsBaseListener();
        python3Target0.language = "hi!";
        org.antlr.v4.tool.Rule rule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getRuleFunctionContextStructName(rule11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "hi!", true);
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        boolean boolean11 = python3Target0.templatesExist();
        java.lang.String str12 = python3Target0.getLanguage();
        java.lang.String str14 = python3Target0.getTargetStringLiteralFromString("\"\"\"4.5.2.1\"\"\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target0.getImplicitSetLabel("\"i\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"i\"" + "'", str9, "\"i\"");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"\"\"4.5.2.1\"\"\"\"" + "'", str14, "\"\"\"\"4.5.2.1\"\"\"\"");
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("\"hi!\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(sTGroup3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"hi!\"\"" + "'", str5, "\"\"hi!\"\"");
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        org.antlr.v4.codegen.target.Python3Target python3Target2 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup3 = null;
        python3Target2.templates = sTGroup3;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python3Target2.badWords = strSet9;
        python3Target0.badWords = strSet9;
        python3Target0.language = "\"\"i\"\"";
        org.antlr.v4.codegen.model.RuleFunction ruleFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target0.getRuleFunctionContextStructName(ruleFunction15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str6 = python3Target0.getVersion();
        org.antlr.v4.codegen.target.Python3Target python3Target7 = new org.antlr.v4.codegen.target.Python3Target();
        int int8 = python3Target7.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target7.templates;
        org.antlr.v4.tool.Grammar grammar10 = null;
        int[] intArray11 = new int[] {};
        java.lang.String[] strArray12 = python3Target7.getTokenTypesAsTargetLabels(grammar10, intArray11);
        python3Target0.targetCharValueEscape = strArray12;
        org.antlr.v4.codegen.target.Python3Target python3Target14 = new org.antlr.v4.codegen.target.Python3Target();
        int int15 = python3Target14.getInlineTestSetWordSize();
        java.lang.String str16 = python3Target14.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python3Target14.getCodeGenerator();
        java.util.Set<java.lang.String> strSet18 = python3Target14.getBadWords();
        java.lang.String[] strArray19 = python3Target14.targetCharValueEscape;
        python3Target0.targetCharValueEscape = strArray19;
        int int21 = python3Target0.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = python3Target0.getListLabel("\"\\1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertNull(sTGroup9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(codeGenerator17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.encodeIntAsCharEscape(100);
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target4 = new org.antlr.v4.codegen.target.Python3Target();
        int int5 = python3Target4.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target4.language;
        java.lang.String str7 = python3Target4.getVersion();
        int int8 = python3Target4.getInlineTestSetWordSize();
        java.lang.String str9 = python3Target4.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target4.gen;
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target();
        int int13 = python3Target12.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup14 = python3Target12.templates;
        org.antlr.v4.tool.Grammar grammar15 = null;
        int[] intArray16 = new int[] {};
        java.lang.String[] strArray17 = python3Target12.getTokenTypesAsTargetLabels(grammar15, intArray16);
        java.lang.String[] strArray18 = python3Target4.getTokenTypesAsTargetLabels(grammar11, intArray16);
        java.lang.String[] strArray19 = python3Target0.getTokenTypesAsTargetLabels(grammar3, intArray16);
        int int20 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = python3Target0.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = python3Target0.getLoopLabel(grammarAST22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNull(sTGroup14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 29 + "'", int20 == 29);
        org.junit.Assert.assertNull(codeGenerator21);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        boolean boolean5 = python3Target0.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target0.genRecognizerHeaderFile(grammar6, sT7, "\"4.5.2.1\"");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target0.getRuleFunctionContextStructName(ruleFunction10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(sTGroup3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        java.lang.String[] strArray10 = python3Target0.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar11, sT12, "\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str6 = python3Target0.getVersion();
        java.util.Set<java.lang.String> strSet7 = python3Target0.badWords;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        int int12 = python3Target11.getInlineTestSetWordSize();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        python3Target11.targetCharValueEscape = strArray15;
        python3Target8.targetCharValueEscape = strArray15;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray15;
        python3Target0.targetCharValueEscape = strArray15;
        java.lang.String[] strArray20 = python3Target0.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray20;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(sTGroup10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String[] strArray3 = python3Target0.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar4, sT5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target0.genRecognizerHeaderFile(grammar4, sT5, "\"\"\"\"");
        boolean boolean8 = python3Target0.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target0.gen;
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target0.getLoopCounter(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(codeGenerator9);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        python3Target0.language = "\\0";
        python3Target0.addBadWords();
        python3Target0.addBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target0.getElementListName(" ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        int[] intArray4 = new int[] {};
        java.lang.String[] strArray5 = python3Target0.getTokenTypesAsTargetLabels(grammar3, intArray4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar6, sT7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "hi!", true);
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        boolean boolean11 = python3Target0.templatesExist();
        java.lang.String str12 = python3Target0.getLanguage();
        java.lang.String str14 = python3Target0.getTargetStringLiteralFromString("\"\"\"4.5.2.1\"\"\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target0.getImplicitTokenLabel("\"\"4.5.2.1\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"i\"" + "'", str9, "\"i\"");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"\"\"4.5.2.1\"\"\"\"" + "'", str14, "\"\"\"\"4.5.2.1\"\"\"\"");
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "d", locale3);
        java.util.Locale locale7 = null;
        java.lang.String str8 = pythonStringRenderer0.toString((java.lang.Object) "\".5.2.\"", "@", locale7);
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target();
        int int10 = python3Target9.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target9.templates;
        java.util.Locale locale13 = null;
        java.lang.String str14 = pythonStringRenderer0.toString((java.lang.Object) sTGroup11, "\"\"\"hi!\"\"\"", locale13);
        org.antlr.v4.codegen.target.Python3Target python3Target15 = new org.antlr.v4.codegen.target.Python3Target();
        int int16 = python3Target15.getInlineTestSetWordSize();
        java.lang.String str17 = python3Target15.language;
        java.lang.String str18 = python3Target15.getVersion();
        int int19 = python3Target15.getInlineTestSetWordSize();
        java.lang.String str20 = python3Target15.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = python3Target15.gen;
        python3Target15.addBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target23 = new org.antlr.v4.codegen.target.Python3Target();
        int int24 = python3Target23.getInlineTestSetWordSize();
        java.lang.String str25 = python3Target23.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = python3Target23.getCodeGenerator();
        java.util.Set<java.lang.String> strSet27 = python3Target23.getBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target28 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray30 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        python3Target28.badWords = strSet31;
        python3Target23.badWords = strSet31;
        python3Target15.badWords = strSet31;
        java.lang.String str38 = python3Target15.getTargetStringLiteralFromString("\".5.2.\"", true);
        java.util.Locale locale40 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = pythonStringRenderer0.toString((java.lang.Object) python3Target15, "\"\\\"\\\"\"", locale40);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python3Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "d" + "'", str4, "d");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "@" + "'", str8, "@");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNull(sTGroup11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"\"hi!\"\"\"" + "'", str14, "\"\"\"hi!\"\"\"");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 64 + "'", int19 == 64);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(codeGenerator21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 64 + "'", int24 == 64);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(codeGenerator26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\"\".5.2.\"\"" + "'", str38, "\"\".5.2.\"\"");
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "d", locale3);
        java.util.Locale locale7 = null;
        java.lang.String str8 = pythonStringRenderer0.toString((java.lang.Object) "\"\"\"i\"\"\"", "4.5.2.1", locale7);
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = pythonStringRenderer0.toString((java.lang.Object) 10.0d, "", locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Double cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "d" + "'", str4, "d");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("\"hi!\"");
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar7, sT8, "\"\"\"\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(sTGroup3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"hi!\"\"" + "'", str5, "\"\"hi!\"\"");
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.getCodeGenerator();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\12");
        org.antlr.v4.tool.Grammar grammar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target0.getTokenTypeAsTargetLabel(grammar9, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(sTGroup5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\12\"" + "'", str8, "\"\\12\"");
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\".5.2.\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\".5.2.\"" + "'", str1, "\".5.2.\"");
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = null;
        python3Target0.gen = codeGenerator1;
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        int int4 = python3Target3.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target3.language;
        java.lang.String str6 = python3Target3.getVersion();
        int int7 = python3Target3.getInlineTestSetWordSize();
        java.lang.String str8 = python3Target3.getLanguage();
        java.lang.String str11 = python3Target3.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean12 = python3Target3.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet13 = python3Target3.getBadWords();
        python3Target0.badWords = strSet13;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target0.getRuleFunctionContextStructName(ruleFunction15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"4.5.2.1\"" + "'", str11, "\"4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        int int8 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\\12", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\0" + "'", str5, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "d", locale3);
        java.util.Locale locale7 = null;
        java.lang.String str8 = pythonStringRenderer0.toString((java.lang.Object) "\"\"i\"\"", "\\12", locale7);
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target();
        int int10 = python3Target9.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target9.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target9.gen;
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = pythonStringRenderer0.toString((java.lang.Object) python3Target9, "\\12", locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python3Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "d" + "'", str4, "d");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\12" + "'", str8, "\\12");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNull(sTGroup11);
        org.junit.Assert.assertNull(codeGenerator12);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python3Target0.getTokenTypeAsTargetLabel(grammar3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.util.Set<java.lang.String> strSet3 = null;
        python3Target0.badWords = strSet3;
        boolean boolean5 = python3Target0.wantsBaseListener();
        java.lang.String str6 = python3Target0.getVersion();
        boolean boolean7 = python3Target0.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target0.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\"\"", false);
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target0.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target0.getLoopCounter(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertNull(codeGenerator12);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target();
        int int10 = python3Target9.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target9.templates;
        org.antlr.v4.tool.Grammar grammar12 = null;
        int[] intArray13 = new int[] {};
        java.lang.String[] strArray14 = python3Target9.getTokenTypesAsTargetLabels(grammar12, intArray13);
        java.lang.String[] strArray15 = python3Target0.getTokenTypesAsTargetLabels(grammar8, intArray13);
        java.lang.String str16 = python3Target0.language;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python3Target0.getImplicitSetLabel("i");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNull(sTGroup11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        boolean boolean7 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target0.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        int int4 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target0.getLoopLabel(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\".5.2.\"\"", false);
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"4.5.2.1\"\"\"\"\"", true);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target0.getRuleFunctionContextStructName(ruleFunction10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\".5.2.\"\"" + "'", str6, "\"\".5.2.\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"\"\"\"\"4.5.2.1\"\"\"\"\"\"" + "'", str9, "\"\"\"\"\"\"4.5.2.1\"\"\"\"\"\"");
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        python3Target0.badWords = strSet3;
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.templates;
        int int7 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target0.getTokenTypeAsTargetLabel(grammar8, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(sTGroup6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        int int4 = python3Target0.getInlineTestSetWordSize();
        python3Target0.language = "\"hi!\"";
        org.antlr.v4.codegen.target.Python3Target python3Target7 = new org.antlr.v4.codegen.target.Python3Target();
        int int8 = python3Target7.getInlineTestSetWordSize();
        boolean boolean9 = python3Target7.wantsBaseVisitor();
        java.lang.String str10 = python3Target7.getLanguage();
        int int11 = python3Target7.getInlineTestSetWordSize();
        java.lang.String[] strArray12 = python3Target7.targetCharValueEscape;
        python3Target0.targetCharValueEscape = strArray12;
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.stringtemplate.v4.ST sT15 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar14, sT15, "\"\".5.2.\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "");
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python3Target0.genRecognizerHeaderFile(grammar11, sT12, "\"i\"");
        int int15 = python3Target0.getSerializedATNSegmentLimit();
        python3Target0.language = "";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target0.getElementListName("\"\"i\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        int int4 = python3Target0.getInlineTestSetWordSize();
        python3Target0.language = "\"hi!\"";
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar7, sT8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target();
        int int10 = python3Target9.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target9.templates;
        org.antlr.v4.tool.Grammar grammar12 = null;
        int[] intArray13 = new int[] {};
        java.lang.String[] strArray14 = python3Target9.getTokenTypesAsTargetLabels(grammar12, intArray13);
        java.lang.String[] strArray15 = python3Target0.getTokenTypesAsTargetLabels(grammar8, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target0.getAltLabelContextStructName("\"\"\"\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNull(sTGroup11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target0.getLoopCounter(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Rule rule2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = python3Target1.getRuleFunctionContextStructName(rule2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        org.antlr.v4.codegen.target.Python3Target python3Target2 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup3 = null;
        python3Target2.templates = sTGroup3;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python3Target2.badWords = strSet9;
        python3Target0.badWords = strSet9;
        python3Target0.language = "\"\"i\"\"";
        java.lang.String str15 = python3Target0.language;
        java.lang.String str17 = python3Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.tool.Grammar grammar18 = null;
        int[] intArray19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray20 = python3Target0.getTokenTypesAsTargetLabels(grammar18, intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\"i\"\"" + "'", str15, "\"\"i\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        python3Target0.addBadWords();
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python3Target0.genRecognizerHeaderFile(grammar11, sT12, "\"4.5.2.1\"");
        org.antlr.v4.tool.Grammar grammar15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target0.getTokenTypeAsTargetLabel(grammar15, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "d", locale3);
        java.util.Locale locale7 = null;
        java.lang.String str8 = pythonStringRenderer0.toString((java.lang.Object) "\".5.2.\"", "@", locale7);
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target();
        int int10 = python3Target9.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target9.templates;
        java.util.Locale locale13 = null;
        java.lang.String str14 = pythonStringRenderer0.toString((java.lang.Object) sTGroup11, "\"\"\"hi!\"\"\"", locale13);
        org.antlr.v4.codegen.target.Python3Target python3Target15 = new org.antlr.v4.codegen.target.Python3Target();
        int int16 = python3Target15.getInlineTestSetWordSize();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "" };
        python3Target15.targetCharValueEscape = strArray19;
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        java.lang.String str24 = python3Target15.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator21, "\"\"", false);
        int int25 = python3Target15.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = python3Target15.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = python3Target15.getCodeGenerator();
        java.util.Locale locale29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = pythonStringRenderer0.toString((java.lang.Object) python3Target15, "\"\"\"4.5.2.1\"\"\"", locale29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python3Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "d" + "'", str4, "d");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "@" + "'", str8, "@");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNull(sTGroup11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"\"hi!\"\"\"" + "'", str14, "\"\"\"hi!\"\"\"");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 29 + "'", int25 == 29);
        org.junit.Assert.assertNull(codeGenerator26);
        org.junit.Assert.assertNull(codeGenerator27);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\\1");
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar8, sT9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\1\"" + "'", str7, "\"\\1\"");
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        boolean boolean5 = python3Target0.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target0.genRecognizerHeaderFile(grammar6, sT7, "\"4.5.2.1\"");
        boolean boolean10 = python3Target0.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target0.templates;
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(sTGroup3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(sTGroup11);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target0.supportsOverloadedMethods();
        java.lang.String[] strArray10 = python3Target0.targetCharValueEscape;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getRuleFunctionContextStructName(ruleFunction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8, "\"4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        org.antlr.v4.tool.Grammar grammar11 = null;
        int[] intArray12 = new int[] {};
        java.lang.String[] strArray13 = python3Target8.getTokenTypesAsTargetLabels(grammar11, intArray12);
        java.lang.String[] strArray14 = python3Target0.getTokenTypesAsTargetLabels(grammar7, intArray12);
        java.lang.String str16 = python3Target0.encodeIntAsCharEscape((int) (byte) 100);
        java.util.Set<java.lang.String> strSet17 = python3Target0.badWords;
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target19 = new org.antlr.v4.codegen.target.Python3Target();
        int int20 = python3Target19.getInlineTestSetWordSize();
        java.lang.String str21 = python3Target19.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        java.lang.String str25 = python3Target19.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator22, "", true);
        org.antlr.v4.tool.Grammar grammar26 = null;
        org.stringtemplate.v4.ST sT27 = null;
        python3Target19.genRecognizerHeaderFile(grammar26, sT27, "");
        org.antlr.v4.tool.Grammar grammar30 = null;
        org.stringtemplate.v4.ST sT31 = null;
        python3Target19.genRecognizerHeaderFile(grammar30, sT31, "\"i\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = python3Target19.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        python3Target19.gen = codeGenerator35;
        java.lang.String str38 = python3Target19.encodeIntAsCharEscape(1);
        org.antlr.v4.tool.Grammar grammar39 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target40 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str42 = python3Target40.encodeIntAsCharEscape(100);
        org.antlr.v4.tool.Grammar grammar43 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target44 = new org.antlr.v4.codegen.target.Python3Target();
        int int45 = python3Target44.getInlineTestSetWordSize();
        java.lang.String str46 = python3Target44.language;
        java.lang.String str47 = python3Target44.getVersion();
        int int48 = python3Target44.getInlineTestSetWordSize();
        java.lang.String str49 = python3Target44.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator50 = python3Target44.gen;
        org.antlr.v4.tool.Grammar grammar51 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target52 = new org.antlr.v4.codegen.target.Python3Target();
        int int53 = python3Target52.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup54 = python3Target52.templates;
        org.antlr.v4.tool.Grammar grammar55 = null;
        int[] intArray56 = new int[] {};
        java.lang.String[] strArray57 = python3Target52.getTokenTypesAsTargetLabels(grammar55, intArray56);
        java.lang.String[] strArray58 = python3Target44.getTokenTypesAsTargetLabels(grammar51, intArray56);
        java.lang.String[] strArray59 = python3Target40.getTokenTypesAsTargetLabels(grammar43, intArray56);
        java.lang.String[] strArray60 = python3Target19.getTokenTypesAsTargetLabels(grammar39, intArray56);
        java.lang.String[] strArray61 = python3Target0.getTokenTypesAsTargetLabels(grammar18, intArray56);
        org.antlr.v4.tool.ast.GrammarAST grammarAST62 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str63 = python3Target0.getLoopLabel(grammarAST62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(sTGroup10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "d" + "'", str16, "d");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 64 + "'", int20 == 64);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"\"" + "'", str25, "\"\"");
        org.junit.Assert.assertNull(codeGenerator34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\\1" + "'", str38, "\\1");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "d" + "'", str42, "d");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 64 + "'", int45 == 64);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "4.5.2.1" + "'", str47, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 64 + "'", int48 == 64);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(codeGenerator50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 64 + "'", int53 == 64);
        org.junit.Assert.assertNull(sTGroup54);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[]");
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertNotNull(strArray61);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar2, sT3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "d", locale3);
        java.util.Locale locale7 = null;
        java.lang.String str8 = pythonStringRenderer0.toString((java.lang.Object) "\".5.2.\"", "@", locale7);
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target();
        int int10 = python3Target9.getInlineTestSetWordSize();
        java.lang.String str11 = python3Target9.language;
        java.lang.String str12 = python3Target9.getVersion();
        int int13 = python3Target9.getInlineTestSetWordSize();
        java.lang.String str14 = python3Target9.getLanguage();
        java.lang.String str17 = python3Target9.getTargetStringLiteralFromString("4.5.2.1", true);
        java.util.Set<java.lang.String> strSet18 = python3Target9.badWords;
        int int19 = python3Target9.getSerializedATNSegmentLimit();
        java.lang.String str20 = python3Target9.getVersion();
        java.lang.String[] strArray21 = new java.lang.String[] {};
        python3Target9.targetCharValueEscape = strArray21;
        java.util.Locale locale24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = pythonStringRenderer0.toString((java.lang.Object) python3Target9, "\"i\"", locale24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python3Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "d" + "'", str4, "d");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "@" + "'", str8, "@");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"4.5.2.1\"" + "'", str17, "\"4.5.2.1\"");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 29 + "'", int19 == 29);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4.5.2.1" + "'", str20, "4.5.2.1");
        org.junit.Assert.assertNotNull(strArray21);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet10 = python3Target0.getBadWords();
        boolean boolean11 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.stringtemplate.v4.ST sT13 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar12, sT13, "4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8, "\"4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\"\"\"\"\"4.5.2.1\"\"\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\"\"\"\"\"4.5.2.1\"\"\"\"\"\"" + "'", str1, "\"\"\"\"\"\"4.5.2.1\"\"\"\"\"\"");
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target0.getLoopLabel(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        int int4 = python3Target0.getInlineTestSetWordSize();
        python3Target0.addBadWords();
        org.antlr.v4.tool.Grammar grammar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target0.getTokenTypeAsTargetLabel(grammar6, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        org.antlr.v4.tool.Grammar grammar11 = null;
        int[] intArray12 = new int[] {};
        java.lang.String[] strArray13 = python3Target8.getTokenTypesAsTargetLabels(grammar11, intArray12);
        java.lang.String[] strArray14 = python3Target0.getTokenTypesAsTargetLabels(grammar7, intArray12);
        java.lang.String str16 = python3Target0.encodeIntAsCharEscape((int) (byte) 100);
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python3Target0.gen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target0.getImplicitRuleLabel("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(sTGroup10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "d" + "'", str16, "d");
        org.junit.Assert.assertNull(codeGenerator17);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target();
        int int6 = python3Target5.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target5.language;
        java.lang.String str8 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python3Target5.templates = sTGroup9;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python3Target5.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "d", false);
        java.util.Set<java.lang.String> strSet15 = python3Target5.getBadWords();
        python3Target0.badWords = strSet15;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python3Target0.getElementListName("\".5.2.\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        java.util.Set<java.lang.String> strSet9 = python3Target0.badWords;
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target0.templates;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8, "\"4.5.2.1\"");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertNull(sTGroup11);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar4, sT5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "\"4.5.2.1\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getImplicitTokenLabel("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(sTGroup5);
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        python3Target0.addBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        java.lang.String str10 = python3Target8.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target8.getCodeGenerator();
        java.util.Set<java.lang.String> strSet12 = python3Target8.getBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target13 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray15 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        python3Target13.badWords = strSet16;
        python3Target8.badWords = strSet16;
        python3Target0.badWords = strSet16;
        org.antlr.v4.tool.ast.GrammarAST grammarAST21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "");
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python3Target0.genRecognizerHeaderFile(grammar11, sT12, "\"i\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python3Target0.gen;
        java.lang.String str17 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"4.5.2.1\"\"\"\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target0.getLoopLabel(grammarAST18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"\"\"\"4.5.2.1\"\"\"\"\"" + "'", str17, "\"\"\"\"\"4.5.2.1\"\"\"\"\"");
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("\"hi!\"");
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        java.lang.String str10 = python3Target8.language;
        java.lang.String str11 = python3Target8.getLanguage();
        java.lang.String str13 = python3Target8.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target8.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "hi!", true);
        int int18 = python3Target8.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target20 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str21 = python3Target20.language;
        org.antlr.v4.codegen.target.Python3Target python3Target22 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup23 = null;
        python3Target22.templates = sTGroup23;
        java.lang.String[] strArray28 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        python3Target22.badWords = strSet29;
        python3Target20.badWords = strSet29;
        org.antlr.v4.tool.Grammar grammar33 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target34 = new org.antlr.v4.codegen.target.Python3Target();
        int int35 = python3Target34.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup36 = python3Target34.templates;
        org.antlr.v4.tool.Grammar grammar37 = null;
        int[] intArray38 = new int[] {};
        java.lang.String[] strArray39 = python3Target34.getTokenTypesAsTargetLabels(grammar37, intArray38);
        java.lang.String[] strArray40 = python3Target20.getTokenTypesAsTargetLabels(grammar33, intArray38);
        java.lang.String[] strArray41 = python3Target8.getTokenTypesAsTargetLabels(grammar19, intArray38);
        java.util.Set<java.lang.String> strSet42 = python3Target8.badWords;
        python3Target0.badWords = strSet42;
        org.antlr.v4.tool.Grammar grammar44 = null;
        org.stringtemplate.v4.ST sT45 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar44, sT45, "\"\".5.2.\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(sTGroup3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"hi!\"\"" + "'", str5, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\"" + "'", str13, "\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"i\"" + "'", str17, "\"i\"");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 29 + "'", int18 == 29);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 64 + "'", int35 == 64);
        org.junit.Assert.assertNull(sTGroup36);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[]");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strSet42);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.encodeIntAsCharEscape(100);
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target4 = new org.antlr.v4.codegen.target.Python3Target();
        int int5 = python3Target4.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target4.language;
        java.lang.String str7 = python3Target4.getVersion();
        int int8 = python3Target4.getInlineTestSetWordSize();
        java.lang.String str9 = python3Target4.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target4.gen;
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target();
        int int13 = python3Target12.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup14 = python3Target12.templates;
        org.antlr.v4.tool.Grammar grammar15 = null;
        int[] intArray16 = new int[] {};
        java.lang.String[] strArray17 = python3Target12.getTokenTypesAsTargetLabels(grammar15, intArray16);
        java.lang.String[] strArray18 = python3Target4.getTokenTypesAsTargetLabels(grammar11, intArray16);
        java.lang.String[] strArray19 = python3Target0.getTokenTypesAsTargetLabels(grammar3, intArray16);
        int int20 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = python3Target0.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = python3Target0.getLoopCounter(grammarAST22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNull(sTGroup14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 29 + "'", int20 == 29);
        org.junit.Assert.assertNull(codeGenerator21);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "d", locale3);
        java.util.Locale locale7 = null;
        java.lang.String str8 = pythonStringRenderer0.toString((java.lang.Object) "\".5.2.\"", "@", locale7);
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup10 = null;
        python3Target9.templates = sTGroup10;
        java.util.Set<java.lang.String> strSet12 = null;
        python3Target9.badWords = strSet12;
        boolean boolean14 = python3Target9.supportsOverloadedMethods();
        java.lang.String str15 = python3Target9.getVersion();
        boolean boolean16 = python3Target9.supportsOverloadedMethods();
        java.util.Locale locale18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = pythonStringRenderer0.toString((java.lang.Object) python3Target9, "\"\"\"\"\"4.5.2.1\"\"\"\"\"", locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python3Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "d" + "'", str4, "d");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "@" + "'", str8, "@");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4.5.2.1" + "'", str15, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        org.antlr.v4.codegen.target.Python3Target python3Target2 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup3 = null;
        python3Target2.templates = sTGroup3;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python3Target2.badWords = strSet9;
        python3Target0.badWords = strSet9;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target0.templates;
        org.antlr.v4.codegen.target.Python3Target python3Target14 = new org.antlr.v4.codegen.target.Python3Target();
        int int15 = python3Target14.getInlineTestSetWordSize();
        boolean boolean16 = python3Target14.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python3Target14.gen;
        boolean boolean18 = python3Target14.supportsOverloadedMethods();
        java.lang.String[] strArray19 = python3Target14.targetCharValueEscape;
        python3Target0.targetCharValueEscape = strArray19;
        org.stringtemplate.v4.STGroup sTGroup21 = python3Target0.templates;
        org.antlr.v4.tool.ast.GrammarAST grammarAST22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = python3Target0.getLoopLabel(grammarAST22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(sTGroup13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(codeGenerator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNull(sTGroup21);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.encodeIntAsCharEscape(100);
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target4 = new org.antlr.v4.codegen.target.Python3Target();
        int int5 = python3Target4.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target4.language;
        java.lang.String str7 = python3Target4.getVersion();
        int int8 = python3Target4.getInlineTestSetWordSize();
        java.lang.String str9 = python3Target4.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target4.gen;
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target();
        int int13 = python3Target12.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup14 = python3Target12.templates;
        org.antlr.v4.tool.Grammar grammar15 = null;
        int[] intArray16 = new int[] {};
        java.lang.String[] strArray17 = python3Target12.getTokenTypesAsTargetLabels(grammar15, intArray16);
        java.lang.String[] strArray18 = python3Target4.getTokenTypesAsTargetLabels(grammar11, intArray16);
        java.lang.String[] strArray19 = python3Target0.getTokenTypesAsTargetLabels(grammar3, intArray16);
        int int20 = python3Target0.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup21 = python3Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNull(sTGroup14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 29 + "'", int20 == 29);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        java.util.Set<java.lang.String> strSet4 = python3Target0.getBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        python3Target5.badWords = strSet8;
        python3Target0.badWords = strSet8;
        java.lang.Class<?> wildcardClass12 = strSet8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "hi!", true);
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str13 = python3Target12.language;
        org.antlr.v4.codegen.target.Python3Target python3Target14 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup15 = null;
        python3Target14.templates = sTGroup15;
        java.lang.String[] strArray20 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        python3Target14.badWords = strSet21;
        python3Target12.badWords = strSet21;
        org.antlr.v4.tool.Grammar grammar25 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target26 = new org.antlr.v4.codegen.target.Python3Target();
        int int27 = python3Target26.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup28 = python3Target26.templates;
        org.antlr.v4.tool.Grammar grammar29 = null;
        int[] intArray30 = new int[] {};
        java.lang.String[] strArray31 = python3Target26.getTokenTypesAsTargetLabels(grammar29, intArray30);
        java.lang.String[] strArray32 = python3Target12.getTokenTypesAsTargetLabels(grammar25, intArray30);
        java.lang.String[] strArray33 = python3Target0.getTokenTypesAsTargetLabels(grammar11, intArray30);
        java.util.Set<java.lang.String> strSet34 = python3Target0.badWords;
        org.antlr.v4.tool.Grammar grammar35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = python3Target0.getTokenTypeAsTargetLabel(grammar35, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"i\"" + "'", str9, "\"i\"");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 64 + "'", int27 == 64);
        org.junit.Assert.assertNull(sTGroup28);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[]");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strSet34);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        int int8 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\0" + "'", str5, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\\1");
        boolean boolean8 = python3Target0.wantsBaseVisitor();
        boolean boolean9 = python3Target0.templatesExist();
        java.lang.Class<?> wildcardClass10 = python3Target0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\1\"" + "'", str7, "\"\\1\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.templates;
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        python3Target0.gen = codeGenerator8;
        java.lang.String[] strArray10 = new java.lang.String[] {};
        python3Target0.targetCharValueEscape = strArray10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target0.getListLabel("d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"\"\"\"\"" + "'", str7, "\"\"\"\"\"\"");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        boolean boolean9 = python3Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet10 = python3Target0.badWords;
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str12 = python3Target11.language;
        java.lang.String[] strArray13 = python3Target11.targetCharValueEscape;
        python3Target0.targetCharValueEscape = strArray13;
        org.antlr.v4.tool.Grammar grammar15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target0.getTokenTypeAsTargetLabel(grammar15, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8, "\"4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\"\"", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target0.getLoopLabel(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "");
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python3Target0.genRecognizerHeaderFile(grammar11, sT12, "\"i\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python3Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        python3Target0.gen = codeGenerator16;
        java.lang.String str18 = python3Target0.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python3Target0.getAltLabelContextStructName("\\35");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        int int4 = python3Target0.getInlineTestSetWordSize();
        python3Target0.addBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target();
        int int7 = python3Target6.getInlineTestSetWordSize();
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "" };
        python3Target6.targetCharValueEscape = strArray10;
        java.lang.String[] strArray12 = python3Target6.targetCharValueEscape;
        python3Target6.addBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target14 = new org.antlr.v4.codegen.target.Python3Target();
        int int15 = python3Target14.getInlineTestSetWordSize();
        java.lang.String str16 = python3Target14.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        java.lang.String str20 = python3Target14.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator17, "", true);
        org.antlr.v4.tool.Grammar grammar21 = null;
        org.stringtemplate.v4.ST sT22 = null;
        python3Target14.genRecognizerHeaderFile(grammar21, sT22, "");
        org.antlr.v4.tool.Grammar grammar25 = null;
        org.stringtemplate.v4.ST sT26 = null;
        python3Target14.genRecognizerHeaderFile(grammar25, sT26, "\"i\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator29 = python3Target14.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator30 = null;
        python3Target14.gen = codeGenerator30;
        java.lang.String str33 = python3Target14.encodeIntAsCharEscape(1);
        org.antlr.v4.tool.Grammar grammar34 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target35 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str37 = python3Target35.encodeIntAsCharEscape(100);
        org.antlr.v4.tool.Grammar grammar38 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target39 = new org.antlr.v4.codegen.target.Python3Target();
        int int40 = python3Target39.getInlineTestSetWordSize();
        java.lang.String str41 = python3Target39.language;
        java.lang.String str42 = python3Target39.getVersion();
        int int43 = python3Target39.getInlineTestSetWordSize();
        java.lang.String str44 = python3Target39.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator45 = python3Target39.gen;
        org.antlr.v4.tool.Grammar grammar46 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target47 = new org.antlr.v4.codegen.target.Python3Target();
        int int48 = python3Target47.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup49 = python3Target47.templates;
        org.antlr.v4.tool.Grammar grammar50 = null;
        int[] intArray51 = new int[] {};
        java.lang.String[] strArray52 = python3Target47.getTokenTypesAsTargetLabels(grammar50, intArray51);
        java.lang.String[] strArray53 = python3Target39.getTokenTypesAsTargetLabels(grammar46, intArray51);
        java.lang.String[] strArray54 = python3Target35.getTokenTypesAsTargetLabels(grammar38, intArray51);
        java.lang.String[] strArray55 = python3Target14.getTokenTypesAsTargetLabels(grammar34, intArray51);
        python3Target6.targetCharValueEscape = strArray55;
        python3Target0.targetCharValueEscape = strArray55;
        org.antlr.v4.tool.Grammar grammar58 = null;
        org.stringtemplate.v4.ST sT59 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar58, sT59, "\"\"\"\"\"4.5.2.1\"\"\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\"" + "'", str20, "\"\"");
        org.junit.Assert.assertNull(codeGenerator29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\\1" + "'", str33, "\\1");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "d" + "'", str37, "d");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 64 + "'", int40 == 64);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "4.5.2.1" + "'", str42, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 64 + "'", int43 == 64);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(codeGenerator45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 64 + "'", int48 == 64);
        org.junit.Assert.assertNull(sTGroup49);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[]");
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(strArray55);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        org.stringtemplate.v4.STGroup sTGroup4 = null;
        python3Target0.templates = sTGroup4;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "d", false);
        java.lang.String str10 = python3Target0.getVersion();
        org.antlr.v4.tool.Rule rule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getRuleFunctionContextStructName(rule11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "hi!", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"i\"" + "'", str9, "\"i\"");
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.encodeIntAsCharEscape(100);
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target4 = new org.antlr.v4.codegen.target.Python3Target();
        int int5 = python3Target4.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target4.language;
        java.lang.String str7 = python3Target4.getVersion();
        int int8 = python3Target4.getInlineTestSetWordSize();
        java.lang.String str9 = python3Target4.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target4.gen;
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target();
        int int13 = python3Target12.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup14 = python3Target12.templates;
        org.antlr.v4.tool.Grammar grammar15 = null;
        int[] intArray16 = new int[] {};
        java.lang.String[] strArray17 = python3Target12.getTokenTypesAsTargetLabels(grammar15, intArray16);
        java.lang.String[] strArray18 = python3Target4.getTokenTypesAsTargetLabels(grammar11, intArray16);
        java.lang.String[] strArray19 = python3Target0.getTokenTypesAsTargetLabels(grammar3, intArray16);
        int int20 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = python3Target0.getCodeGenerator();
        int int22 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        java.lang.String str26 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator23, "\"\"4.5.2.1\"\"", false);
        org.antlr.v4.tool.Rule rule27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = python3Target0.getRuleFunctionContextStructName(rule27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNull(sTGroup14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 29 + "'", int20 == 29);
        org.junit.Assert.assertNull(codeGenerator21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 64 + "'", int22 == 64);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\\\"4.5.2.1\\\"" + "'", str26, "\\\"4.5.2.1\\\"");
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        int int8 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\\12", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target0.getAltLabelContextStructName("\"\"\"\"4.5.2.1\"\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\0" + "'", str5, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        python3Target0.gen = codeGenerator2;
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("\"\"i\"\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"\"i\"\"\"" + "'", str5, "\"\"\"i\"\"\"");
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        python3Target0.language = "@";
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target7 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str9 = python3Target7.encodeIntAsCharEscape(100);
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        int int12 = python3Target11.getInlineTestSetWordSize();
        java.lang.String str13 = python3Target11.language;
        java.lang.String str14 = python3Target11.getVersion();
        int int15 = python3Target11.getInlineTestSetWordSize();
        java.lang.String str16 = python3Target11.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python3Target11.gen;
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target19 = new org.antlr.v4.codegen.target.Python3Target();
        int int20 = python3Target19.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup21 = python3Target19.templates;
        org.antlr.v4.tool.Grammar grammar22 = null;
        int[] intArray23 = new int[] {};
        java.lang.String[] strArray24 = python3Target19.getTokenTypesAsTargetLabels(grammar22, intArray23);
        java.lang.String[] strArray25 = python3Target11.getTokenTypesAsTargetLabels(grammar18, intArray23);
        java.lang.String[] strArray26 = python3Target7.getTokenTypesAsTargetLabels(grammar10, intArray23);
        java.lang.String[] strArray27 = python3Target0.getTokenTypesAsTargetLabels(grammar6, intArray23);
        org.antlr.v4.tool.ast.GrammarAST grammarAST28 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(codeGenerator17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 64 + "'", int20 == 64);
        org.junit.Assert.assertNull(sTGroup21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String str3 = python3Target0.language;
        java.lang.String str4 = python3Target0.getVersion();
        org.antlr.v4.tool.Rule rule5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target0.getRuleFunctionContextStructName(rule5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = null;
        python3Target0.gen = codeGenerator1;
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        int int4 = python3Target3.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target3.language;
        java.lang.String str6 = python3Target3.getLanguage();
        java.lang.String str8 = python3Target3.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target3.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "hi!", true);
        int int13 = python3Target3.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target15 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str16 = python3Target15.language;
        org.antlr.v4.codegen.target.Python3Target python3Target17 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup18 = null;
        python3Target17.templates = sTGroup18;
        java.lang.String[] strArray23 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        python3Target17.badWords = strSet24;
        python3Target15.badWords = strSet24;
        org.antlr.v4.tool.Grammar grammar28 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target29 = new org.antlr.v4.codegen.target.Python3Target();
        int int30 = python3Target29.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup31 = python3Target29.templates;
        org.antlr.v4.tool.Grammar grammar32 = null;
        int[] intArray33 = new int[] {};
        java.lang.String[] strArray34 = python3Target29.getTokenTypesAsTargetLabels(grammar32, intArray33);
        java.lang.String[] strArray35 = python3Target15.getTokenTypesAsTargetLabels(grammar28, intArray33);
        java.lang.String[] strArray36 = python3Target3.getTokenTypesAsTargetLabels(grammar14, intArray33);
        python3Target0.targetCharValueEscape = strArray36;
        org.antlr.v4.tool.Grammar grammar38 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = python3Target0.getTokenTypeAsTargetLabel(grammar38, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"" + "'", str8, "\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"i\"" + "'", str12, "\"i\"");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29 + "'", int13 == 29);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 64 + "'", int30 == 64);
        org.junit.Assert.assertNull(sTGroup31);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[]");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "\"\"\"\"");
        python3Target0.language = "\"\"\"4.5.2.1\"\"\"";
        java.lang.Class<?> wildcardClass13 = python3Target0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String str3 = python3Target0.language;
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar4, sT5, "\"i\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\"\"", false);
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str11 = python3Target10.language;
        java.lang.String[] strArray12 = python3Target10.targetCharValueEscape;
        python3Target0.targetCharValueEscape = strArray12;
        boolean boolean14 = python3Target0.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target0.getImplicitSetLabel("\".5.2.\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target0.gen;
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target0.getLoopLabel(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\0" + "'", str5, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertNull(codeGenerator8);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "hi!", true);
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str13 = python3Target0.getTargetStringLiteralFromString("\"i\"", true);
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.stringtemplate.v4.ST sT15 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar14, sT15, "\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"i\"" + "'", str9, "\"i\"");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\"i\"\"" + "'", str13, "\"\"i\"\"");
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        python3Target0.language = "@";
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\0" + "'", str5, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.util.Set<java.lang.String> strSet3 = null;
        python3Target0.badWords = strSet3;
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.getVersion();
        boolean boolean7 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "");
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python3Target0.genRecognizerHeaderFile(grammar11, sT12, "\"i\"");
        boolean boolean15 = python3Target0.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        python3Target0.gen = codeGenerator16;
        boolean boolean18 = python3Target0.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup19 = null;
        python3Target0.templates = sTGroup19;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = python3Target0.getListLabel("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        boolean boolean5 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target0.getTokenTypeAsTargetLabel(grammar6, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "\"\"\"\"");
        java.lang.String str11 = python3Target0.getLanguage();
        org.antlr.v4.tool.Rule rule12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target0.getRuleFunctionContextStructName(rule12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "\"\"\"\"");
        org.stringtemplate.v4.STGroup sTGroup11 = null;
        python3Target0.templates = sTGroup11;
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target0.getLoopLabel(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.util.Set<java.lang.String> strSet3 = null;
        python3Target0.badWords = strSet3;
        boolean boolean5 = python3Target0.wantsBaseListener();
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\\\"hi!\\\"\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target0.getAltLabelContextStructName("\"\"\\0\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\\\"hi!\\\"\"\"" + "'", str8, "\"\"\\\"hi!\\\"\"\"");
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "");
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getLoopCounter(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target0.getElementListName("\"\"4.5.2.1\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"i\"");
        python3Target0.addBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str9 = python3Target8.language;
        java.lang.String[] strArray10 = python3Target8.targetCharValueEscape;
        python3Target0.targetCharValueEscape = strArray10;
        int int12 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str14 = python3Target0.encodeIntAsCharEscape(0);
        boolean boolean15 = python3Target0.wantsBaseVisitor();
        boolean boolean16 = python3Target0.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"i\"\"" + "'", str6, "\"\"i\"\"");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\0" + "'", str14, "\\0");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        org.antlr.v4.codegen.target.Python3Target python3Target2 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup3 = null;
        python3Target2.templates = sTGroup3;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python3Target2.badWords = strSet9;
        python3Target0.badWords = strSet9;
        python3Target0.language = "\"\"i\"\"";
        java.lang.String str15 = python3Target0.getVersion();
        int int16 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target0.getTokenTypeAsTargetLabel(grammar17, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4.5.2.1" + "'", str15, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 29 + "'", int16 == 29);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "");
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python3Target0.genRecognizerHeaderFile(grammar11, sT12, "\"i\"");
        boolean boolean15 = python3Target0.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target0.getLoopLabel(grammarAST16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target0.gen;
        java.lang.String str8 = python3Target0.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target0.getImplicitSetLabel("\\35");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "\"\"");
        org.antlr.v4.tool.Grammar grammar11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target0.getTokenTypeAsTargetLabel(grammar11, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\12" + "'", str6, "\\12");
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str6 = python3Target0.getVersion();
        java.util.Set<java.lang.String> strSet7 = python3Target0.badWords;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        int int12 = python3Target11.getInlineTestSetWordSize();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        python3Target11.targetCharValueEscape = strArray15;
        python3Target8.targetCharValueEscape = strArray15;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray15;
        python3Target0.targetCharValueEscape = strArray15;
        org.antlr.v4.tool.Grammar grammar20 = null;
        org.stringtemplate.v4.ST sT21 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar20, sT21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(sTGroup10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\"\"", false);
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target0.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target0.getLoopLabel(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertNull(codeGenerator11);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\"\".5.2.\"\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\"\".5.2.\"\"\"" + "'", str1, "\"\"\".5.2.\"\"\"");
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(sTGroup3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        java.util.Set<java.lang.String> strSet7 = python3Target0.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup8 = python3Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        java.lang.String str12 = python3Target0.getTargetStringLiteralFromString("hi!", true);
        int int13 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str14 = python3Target0.language;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target0.getElementListName("\\12");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.util.Set<java.lang.String> strSet3 = null;
        python3Target0.badWords = strSet3;
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target0.getRuleFunctionContextStructName(ruleFunction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        boolean boolean5 = python3Target0.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target0.genRecognizerHeaderFile(grammar6, sT7, "\"4.5.2.1\"");
        boolean boolean10 = python3Target0.templatesExist();
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar11, sT12, "\"\"\"\"4.5.2.1\"\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(sTGroup3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str6 = python3Target0.getVersion();
        org.antlr.v4.codegen.target.Python3Target python3Target7 = new org.antlr.v4.codegen.target.Python3Target();
        int int8 = python3Target7.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target7.templates;
        org.antlr.v4.tool.Grammar grammar10 = null;
        int[] intArray11 = new int[] {};
        java.lang.String[] strArray12 = python3Target7.getTokenTypesAsTargetLabels(grammar10, intArray11);
        python3Target0.targetCharValueEscape = strArray12;
        org.antlr.v4.codegen.target.Python3Target python3Target14 = new org.antlr.v4.codegen.target.Python3Target();
        int int15 = python3Target14.getInlineTestSetWordSize();
        java.lang.String str16 = python3Target14.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python3Target14.getCodeGenerator();
        java.util.Set<java.lang.String> strSet18 = python3Target14.getBadWords();
        java.lang.String[] strArray19 = python3Target14.targetCharValueEscape;
        python3Target0.targetCharValueEscape = strArray19;
        java.lang.String str21 = python3Target0.getVersion();
        org.antlr.v4.codegen.target.Python3Target python3Target22 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup23 = null;
        python3Target22.templates = sTGroup23;
        java.lang.String[] strArray28 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        python3Target22.badWords = strSet29;
        java.lang.String str34 = python3Target22.getTargetStringLiteralFromString("hi!", true);
        java.util.Set<java.lang.String> strSet35 = python3Target22.badWords;
        python3Target0.badWords = strSet35;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = python3Target0.getImplicitRuleLabel(" ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertNull(sTGroup9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(codeGenerator17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4.5.2.1" + "'", str21, "4.5.2.1");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\"hi!\"" + "'", str34, "\"hi!\"");
        org.junit.Assert.assertNotNull(strSet35);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("\"hi!\"");
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar7, sT8, "\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(sTGroup3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"hi!\"\"" + "'", str5, "\"\"hi!\"\"");
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        boolean boolean6 = python3Target0.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target0.getTokenTypeAsTargetLabel(grammar7, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "d", locale3);
        java.util.Locale locale7 = null;
        java.lang.String str8 = pythonStringRenderer0.toString((java.lang.Object) "\"\"i\"\"", "\\12", locale7);
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target();
        int int10 = python3Target9.getInlineTestSetWordSize();
        java.lang.String str11 = python3Target9.language;
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target9.templates;
        boolean boolean13 = python3Target9.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python3Target9.getCodeGenerator();
        java.util.Locale locale16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = pythonStringRenderer0.toString((java.lang.Object) python3Target9, "\\1", locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python3Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "d" + "'", str4, "d");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\12" + "'", str8, "\\12");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(sTGroup12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(codeGenerator14);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        python3Target0.addBadWords();
        python3Target0.language = "\\0";
        boolean boolean10 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        int int12 = python3Target11.getInlineTestSetWordSize();
        java.lang.String str13 = python3Target11.language;
        java.lang.String str14 = python3Target11.getVersion();
        int int15 = python3Target11.getInlineTestSetWordSize();
        java.lang.String str16 = python3Target11.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python3Target11.gen;
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target19 = new org.antlr.v4.codegen.target.Python3Target();
        int int20 = python3Target19.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup21 = python3Target19.templates;
        org.antlr.v4.tool.Grammar grammar22 = null;
        int[] intArray23 = new int[] {};
        java.lang.String[] strArray24 = python3Target19.getTokenTypesAsTargetLabels(grammar22, intArray23);
        java.lang.String[] strArray25 = python3Target11.getTokenTypesAsTargetLabels(grammar18, intArray23);
        java.lang.String str26 = python3Target11.getLanguage();
        java.lang.String str27 = python3Target11.getLanguage();
        java.lang.String str29 = python3Target11.getTargetStringLiteralFromString("\"i\"");
        java.util.Set<java.lang.String> strSet30 = python3Target11.badWords;
        python3Target0.badWords = strSet30;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = python3Target0.encodeIntAsCharEscape((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(codeGenerator17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 64 + "'", int20 == 64);
        org.junit.Assert.assertNull(sTGroup21);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[]");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\"i\"\"" + "'", str29, "\"\"i\"\"");
        org.junit.Assert.assertNotNull(strSet30);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar9, sT10, "\"\"\\0\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\0" + "'", str5, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertNull(codeGenerator8);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str4 = python3Target0.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "i", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target0.getImplicitSetLabel("\"\\\"hi!\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\12" + "'", str4, "\\12");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "\"4.5.2.1\"");
        org.antlr.v4.tool.Rule rule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getRuleFunctionContextStructName(rule11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(sTGroup5);
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "\"\"");
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        int int12 = python3Target11.getInlineTestSetWordSize();
        boolean boolean13 = python3Target11.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python3Target11.gen;
        boolean boolean15 = python3Target11.wantsBaseVisitor();
        java.lang.String str16 = python3Target11.language;
        java.lang.String str19 = python3Target11.getTargetStringLiteralFromString("\\0", false);
        int int20 = python3Target11.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet21 = python3Target11.getBadWords();
        python3Target0.badWords = strSet21;
        org.antlr.v4.tool.Rule rule23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = python3Target0.getRuleFunctionContextStructName(rule23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\12" + "'", str6, "\\12");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(codeGenerator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\\0" + "'", str19, "\\0");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 64 + "'", int20 == 64);
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        org.antlr.v4.tool.Grammar grammar11 = null;
        int[] intArray12 = new int[] {};
        java.lang.String[] strArray13 = python3Target8.getTokenTypesAsTargetLabels(grammar11, intArray12);
        java.lang.String[] strArray14 = python3Target0.getTokenTypesAsTargetLabels(grammar7, intArray12);
        java.lang.String str15 = python3Target0.getLanguage();
        java.lang.String str16 = python3Target0.getLanguage();
        java.lang.String str18 = python3Target0.getTargetStringLiteralFromString("\"i\"");
        java.util.Set<java.lang.String> strSet19 = python3Target0.badWords;
        boolean boolean20 = python3Target0.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup21 = python3Target0.templates;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = python3Target0.getElementListName("\"\"\"\"\"\"4.5.2.1\"\"\"\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(sTGroup10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\"i\"\"" + "'", str18, "\"\"i\"\"");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(sTGroup21);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str6 = python3Target0.getVersion();
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\"hi!\"", false);
        java.lang.String[] strArray10 = python3Target0.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target0.getTokenTypeAsTargetLabel(grammar11, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"hi!\"" + "'", str9, "\"hi!\"");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        org.antlr.v4.tool.Grammar grammar11 = null;
        int[] intArray12 = new int[] {};
        java.lang.String[] strArray13 = python3Target8.getTokenTypesAsTargetLabels(grammar11, intArray12);
        java.lang.String[] strArray14 = python3Target0.getTokenTypesAsTargetLabels(grammar7, intArray12);
        java.lang.String str16 = python3Target0.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str17 = python3Target0.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(sTGroup10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "d" + "'", str16, "d");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\\1\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\1\"" + "'", str1, "\"\\1\"");
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        python3Target0.gen = codeGenerator9;
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        int int12 = python3Target11.getInlineTestSetWordSize();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        python3Target11.targetCharValueEscape = strArray15;
        java.lang.String[] strArray17 = python3Target11.targetCharValueEscape;
        python3Target11.addBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target19 = new org.antlr.v4.codegen.target.Python3Target();
        int int20 = python3Target19.getInlineTestSetWordSize();
        java.lang.String str21 = python3Target19.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        java.lang.String str25 = python3Target19.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator22, "", true);
        org.antlr.v4.tool.Grammar grammar26 = null;
        org.stringtemplate.v4.ST sT27 = null;
        python3Target19.genRecognizerHeaderFile(grammar26, sT27, "");
        org.antlr.v4.tool.Grammar grammar30 = null;
        org.stringtemplate.v4.ST sT31 = null;
        python3Target19.genRecognizerHeaderFile(grammar30, sT31, "\"i\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = python3Target19.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        python3Target19.gen = codeGenerator35;
        java.lang.String str38 = python3Target19.encodeIntAsCharEscape(1);
        org.antlr.v4.tool.Grammar grammar39 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target40 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str42 = python3Target40.encodeIntAsCharEscape(100);
        org.antlr.v4.tool.Grammar grammar43 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target44 = new org.antlr.v4.codegen.target.Python3Target();
        int int45 = python3Target44.getInlineTestSetWordSize();
        java.lang.String str46 = python3Target44.language;
        java.lang.String str47 = python3Target44.getVersion();
        int int48 = python3Target44.getInlineTestSetWordSize();
        java.lang.String str49 = python3Target44.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator50 = python3Target44.gen;
        org.antlr.v4.tool.Grammar grammar51 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target52 = new org.antlr.v4.codegen.target.Python3Target();
        int int53 = python3Target52.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup54 = python3Target52.templates;
        org.antlr.v4.tool.Grammar grammar55 = null;
        int[] intArray56 = new int[] {};
        java.lang.String[] strArray57 = python3Target52.getTokenTypesAsTargetLabels(grammar55, intArray56);
        java.lang.String[] strArray58 = python3Target44.getTokenTypesAsTargetLabels(grammar51, intArray56);
        java.lang.String[] strArray59 = python3Target40.getTokenTypesAsTargetLabels(grammar43, intArray56);
        java.lang.String[] strArray60 = python3Target19.getTokenTypesAsTargetLabels(grammar39, intArray56);
        python3Target11.targetCharValueEscape = strArray60;
        python3Target0.targetCharValueEscape = strArray60;
        org.stringtemplate.v4.STGroup sTGroup63 = null;
        python3Target0.templates = sTGroup63;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str66 = python3Target0.getAltLabelContextStructName("\\\"4.5.2.1\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8, "\"4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 64 + "'", int20 == 64);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"\"" + "'", str25, "\"\"");
        org.junit.Assert.assertNull(codeGenerator34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\\1" + "'", str38, "\\1");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "d" + "'", str42, "d");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 64 + "'", int45 == 64);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "4.5.2.1" + "'", str47, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 64 + "'", int48 == 64);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(codeGenerator50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 64 + "'", int53 == 64);
        org.junit.Assert.assertNull(sTGroup54);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[]");
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(strArray60);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        int int8 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\\12", false);
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.stringtemplate.v4.ST sT14 = null;
        python3Target0.genRecognizerHeaderFile(grammar13, sT14, "d");
        python3Target0.addBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target0.getLoopLabel(grammarAST18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\0" + "'", str5, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str6 = python3Target0.getVersion();
        org.antlr.v4.codegen.target.Python3Target python3Target7 = new org.antlr.v4.codegen.target.Python3Target();
        int int8 = python3Target7.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target7.templates;
        org.antlr.v4.tool.Grammar grammar10 = null;
        int[] intArray11 = new int[] {};
        java.lang.String[] strArray12 = python3Target7.getTokenTypesAsTargetLabels(grammar10, intArray11);
        python3Target0.targetCharValueEscape = strArray12;
        org.antlr.v4.codegen.target.Python3Target python3Target14 = new org.antlr.v4.codegen.target.Python3Target();
        int int15 = python3Target14.getInlineTestSetWordSize();
        java.lang.String str16 = python3Target14.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python3Target14.getCodeGenerator();
        java.util.Set<java.lang.String> strSet18 = python3Target14.getBadWords();
        java.lang.String[] strArray19 = python3Target14.targetCharValueEscape;
        python3Target0.targetCharValueEscape = strArray19;
        java.lang.String str21 = python3Target0.getVersion();
        org.antlr.v4.codegen.target.Python3Target python3Target22 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup23 = null;
        python3Target22.templates = sTGroup23;
        java.lang.String[] strArray28 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        python3Target22.badWords = strSet29;
        java.lang.String str34 = python3Target22.getTargetStringLiteralFromString("hi!", true);
        java.util.Set<java.lang.String> strSet35 = python3Target22.badWords;
        python3Target0.badWords = strSet35;
        org.antlr.v4.tool.Grammar grammar37 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = python3Target0.getTokenTypeAsTargetLabel(grammar37, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertNull(sTGroup9);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[]");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(codeGenerator17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4.5.2.1" + "'", str21, "4.5.2.1");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\"hi!\"" + "'", str34, "\"hi!\"");
        org.junit.Assert.assertNotNull(strSet35);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        java.lang.String str6 = python3Target0.language;
        java.lang.String str7 = python3Target0.getVersion();
        org.antlr.v4.tool.Rule rule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target0.getRuleFunctionContextStructName(rule8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(sTGroup3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        java.util.Set<java.lang.String> strSet9 = python3Target0.badWords;
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar10, sT11, "\"\"hi!\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8, "\"4.5.2.1\"");
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        java.lang.String str4 = python3Target0.getVersion();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        boolean boolean6 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.tool.Rule rule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target0.getRuleFunctionContextStructName(rule7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target0.templates;
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        python3Target0.gen = codeGenerator8;
        java.lang.String[] strArray10 = new java.lang.String[] {};
        python3Target0.targetCharValueEscape = strArray10;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray10;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"\"\"\"\"" + "'", str7, "\"\"\"\"\"\"");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        boolean boolean7 = python3Target0.supportsOverloadedMethods();
        java.lang.String[] strArray8 = new java.lang.String[] {};
        python3Target0.targetCharValueEscape = strArray8;
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup11 = null;
        python3Target10.templates = sTGroup11;
        java.lang.String[] strArray16 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        python3Target10.badWords = strSet17;
        python3Target0.badWords = strSet17;
        org.antlr.v4.tool.Grammar grammar21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = python3Target0.getTokenTypeAsTargetLabel(grammar21, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target();
        int int2 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str3 = python3Target1.language;
        java.lang.String str4 = python3Target1.getVersion();
        int int5 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target1.getLanguage();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("4.5.2.1", true);
        java.util.Set<java.lang.String> strSet10 = python3Target1.badWords;
        int int11 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str12 = python3Target1.language;
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = pythonStringRenderer0.toString((java.lang.Object) python3Target1, "\\35", locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python3Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"4.5.2.1\"" + "'", str9, "\"4.5.2.1\"");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29 + "'", int11 == 29);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str8 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python3Target0.gen = codeGenerator10;
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target0.getLoopCounter(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\0" + "'", str5, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator9);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target0.genRecognizerHeaderFile(grammar6, sT7, "\"\"\"\"\"\"");
        boolean boolean10 = python3Target0.templatesExist();
        boolean boolean11 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target0.getRuleFunctionContextStructName(ruleFunction12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\"\"", false);
        org.antlr.v4.tool.Grammar grammar10 = null;
        int[] intArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray12 = python3Target0.getTokenTypesAsTargetLabels(grammar10, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        java.lang.String[] strArray10 = python3Target0.targetCharValueEscape;
        org.antlr.v4.tool.Rule rule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getRuleFunctionContextStructName(rule11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        java.lang.String str8 = python3Target0.encodeIntAsCharEscape((int) (short) 100);
        java.util.Set<java.lang.String> strSet9 = python3Target0.badWords;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target0.getAltLabelContextStructName("\"\"\"\"4.5.2.1\"\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        java.lang.String str8 = python3Target0.encodeIntAsCharEscape((int) (short) 100);
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.templates;
        java.lang.String str11 = python3Target0.encodeIntAsCharEscape(29);
        org.antlr.v4.tool.Grammar grammar12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target0.getTokenTypeAsTargetLabel(grammar12, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertNull(sTGroup9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\35" + "'", str11, "\\35");
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        boolean boolean5 = python3Target0.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target7 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str8 = python3Target7.language;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup10 = null;
        python3Target9.templates = sTGroup10;
        java.lang.String[] strArray15 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        python3Target9.badWords = strSet16;
        python3Target7.badWords = strSet16;
        org.antlr.v4.tool.Grammar grammar20 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target21 = new org.antlr.v4.codegen.target.Python3Target();
        int int22 = python3Target21.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup23 = python3Target21.templates;
        org.antlr.v4.tool.Grammar grammar24 = null;
        int[] intArray25 = new int[] {};
        java.lang.String[] strArray26 = python3Target21.getTokenTypesAsTargetLabels(grammar24, intArray25);
        java.lang.String[] strArray27 = python3Target7.getTokenTypesAsTargetLabels(grammar20, intArray25);
        java.lang.String[] strArray28 = python3Target0.getTokenTypesAsTargetLabels(grammar6, intArray25);
        org.antlr.v4.codegen.CodeGenerator codeGenerator29 = null;
        java.lang.String str32 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator29, "\"\"hi!\"\"", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST33 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(sTGroup3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 64 + "'", int22 == 64);
        org.junit.Assert.assertNull(sTGroup23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str32, "\"\\\"hi!\\\"\"");
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str6 = python3Target0.getLanguage();
        java.lang.String[] strArray7 = python3Target0.targetCharValueEscape;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target0.getRuleFunctionContextStructName(ruleFunction8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        java.util.Set<java.lang.String> strSet9 = python3Target0.badWords;
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str11 = python3Target0.language;
        java.lang.String str12 = python3Target0.getVersion();
        org.antlr.v4.tool.Rule rule13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target0.getRuleFunctionContextStructName(rule13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8, "\"4.5.2.1\"");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        int int2 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str3 = python3Target0.getLanguage();
        org.antlr.v4.tool.Grammar grammar4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target0.getTokenTypeAsTargetLabel(grammar4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        python3Target0.gen = codeGenerator2;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.util.Set<java.lang.String> strSet5 = python3Target0.badWords;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target0.getImplicitTokenLabel("\"\"\"4.5.2.1\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        int int8 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\\12", false);
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.stringtemplate.v4.ST sT14 = null;
        python3Target0.genRecognizerHeaderFile(grammar13, sT14, "d");
        java.lang.Class<?> wildcardClass17 = python3Target0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\0" + "'", str5, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target();
        int int10 = python3Target9.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target9.templates;
        org.antlr.v4.tool.Grammar grammar12 = null;
        int[] intArray13 = new int[] {};
        java.lang.String[] strArray14 = python3Target9.getTokenTypesAsTargetLabels(grammar12, intArray13);
        java.lang.String[] strArray15 = python3Target0.getTokenTypesAsTargetLabels(grammar8, intArray13);
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNull(sTGroup11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str6 = python3Target0.getVersion();
        java.util.Set<java.lang.String> strSet7 = python3Target0.badWords;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        int int12 = python3Target11.getInlineTestSetWordSize();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        python3Target11.targetCharValueEscape = strArray15;
        python3Target8.targetCharValueEscape = strArray15;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray15;
        python3Target0.targetCharValueEscape = strArray15;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python3Target0.getRuleFunctionContextStructName(ruleFunction20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(sTGroup10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        java.lang.String str4 = python3Target0.getVersion();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        boolean boolean6 = python3Target0.supportsOverloadedMethods();
        int int7 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str8 = python3Target0.getLanguage();
        java.lang.String str9 = python3Target0.getVersion();
        org.antlr.v4.tool.Rule rule10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target0.getRuleFunctionContextStructName(rule10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        python3Target0.language = "\\0";
        python3Target0.addBadWords();
        python3Target0.addBadWords();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target0.getRuleFunctionContextStructName(ruleFunction14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "\"\"");
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        int int12 = python3Target11.getInlineTestSetWordSize();
        boolean boolean13 = python3Target11.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python3Target11.gen;
        boolean boolean15 = python3Target11.wantsBaseVisitor();
        java.lang.String str16 = python3Target11.language;
        java.lang.String str19 = python3Target11.getTargetStringLiteralFromString("\\0", false);
        int int20 = python3Target11.getInlineTestSetWordSize();
        java.util.Set<java.lang.String> strSet21 = python3Target11.getBadWords();
        python3Target0.badWords = strSet21;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        python3Target0.gen = codeGenerator23;
        org.antlr.v4.tool.Grammar grammar25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = python3Target0.getTokenTypeAsTargetLabel(grammar25, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\12" + "'", str6, "\\12");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(codeGenerator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\\0" + "'", str19, "\\0");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 64 + "'", int20 == 64);
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar4 = null;
        int[] intArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray6 = python3Target0.getTokenTypesAsTargetLabels(grammar4, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(codeGenerator3);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        python3Target0.language = "1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target0.getCodeGenerator();
        java.lang.String str13 = python3Target0.language;
        boolean boolean14 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target0.getLoopCounter(grammarAST15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        org.antlr.v4.tool.Grammar grammar11 = null;
        int[] intArray12 = new int[] {};
        java.lang.String[] strArray13 = python3Target8.getTokenTypesAsTargetLabels(grammar11, intArray12);
        java.lang.String[] strArray14 = python3Target0.getTokenTypesAsTargetLabels(grammar7, intArray12);
        java.lang.String str15 = python3Target0.getLanguage();
        java.lang.String str16 = python3Target0.getLanguage();
        java.lang.String str18 = python3Target0.getTargetStringLiteralFromString("\"i\"");
        java.lang.String str20 = python3Target0.getTargetStringLiteralFromString("\"4.5.2.1\"");
        int int21 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.target.Python3Target python3Target22 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str24 = python3Target22.getTargetStringLiteralFromString("\"\"");
        int int25 = python3Target22.getInlineTestSetWordSize();
        boolean boolean26 = python3Target22.supportsOverloadedMethods();
        java.lang.String str28 = python3Target22.getTargetStringLiteralFromString("\"i\"");
        python3Target22.addBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target30 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str31 = python3Target30.language;
        java.lang.String[] strArray32 = python3Target30.targetCharValueEscape;
        python3Target22.targetCharValueEscape = strArray32;
        org.stringtemplate.v4.STGroup sTGroup34 = null;
        python3Target22.templates = sTGroup34;
        org.antlr.v4.codegen.target.Python3Target python3Target36 = new org.antlr.v4.codegen.target.Python3Target();
        int int37 = python3Target36.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup38 = python3Target36.templates;
        org.antlr.v4.codegen.target.Python3Target python3Target39 = new org.antlr.v4.codegen.target.Python3Target();
        int int40 = python3Target39.getInlineTestSetWordSize();
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "" };
        python3Target39.targetCharValueEscape = strArray43;
        python3Target36.targetCharValueEscape = strArray43;
        python3Target22.targetCharValueEscape = strArray43;
        python3Target0.targetCharValueEscape = strArray43;
        org.antlr.v4.tool.ast.GrammarAST grammarAST48 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(sTGroup10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\"i\"\"" + "'", str18, "\"\"i\"\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\"4.5.2.1\"\"" + "'", str20, "\"\"4.5.2.1\"\"");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 29 + "'", int21 == 29);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"\"\"\"" + "'", str24, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 64 + "'", int25 == 64);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"\"i\"\"" + "'", str28, "\"\"i\"\"");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 64 + "'", int37 == 64);
        org.junit.Assert.assertNull(sTGroup38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 64 + "'", int40 == 64);
        org.junit.Assert.assertNotNull(strArray43);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.util.Set<java.lang.String> strSet3 = null;
        python3Target0.badWords = strSet3;
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\\12", true);
        int int9 = python3Target0.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target0.getElementName("\"\"i\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\12\"" + "'", str8, "\"\\12\"");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        int int4 = python3Target0.getInlineTestSetWordSize();
        python3Target0.addBadWords();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target7 = new org.antlr.v4.codegen.target.Python3Target();
        int int8 = python3Target7.getInlineTestSetWordSize();
        java.lang.String str9 = python3Target7.language;
        java.lang.String str10 = python3Target7.getLanguage();
        java.lang.String str12 = python3Target7.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python3Target7.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "hi!", true);
        int int17 = python3Target7.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target19 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str20 = python3Target19.language;
        org.antlr.v4.codegen.target.Python3Target python3Target21 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup22 = null;
        python3Target21.templates = sTGroup22;
        java.lang.String[] strArray27 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        python3Target21.badWords = strSet28;
        python3Target19.badWords = strSet28;
        org.antlr.v4.tool.Grammar grammar32 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target33 = new org.antlr.v4.codegen.target.Python3Target();
        int int34 = python3Target33.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup35 = python3Target33.templates;
        org.antlr.v4.tool.Grammar grammar36 = null;
        int[] intArray37 = new int[] {};
        java.lang.String[] strArray38 = python3Target33.getTokenTypesAsTargetLabels(grammar36, intArray37);
        java.lang.String[] strArray39 = python3Target19.getTokenTypesAsTargetLabels(grammar32, intArray37);
        java.lang.String[] strArray40 = python3Target7.getTokenTypesAsTargetLabels(grammar18, intArray37);
        java.lang.String[] strArray41 = python3Target0.getTokenTypesAsTargetLabels(grammar6, intArray37);
        org.antlr.v4.tool.ast.GrammarAST grammarAST42 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"" + "'", str12, "\"\"");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"i\"" + "'", str16, "\"i\"");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 29 + "'", int17 == 29);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 64 + "'", int34 == 64);
        org.junit.Assert.assertNull(sTGroup35);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[]");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(strArray41);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "hi!", true);
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        boolean boolean11 = python3Target0.templatesExist();
        java.lang.String str12 = python3Target0.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup13 = null;
        python3Target0.templates = sTGroup13;
        int int15 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"i\"" + "'", str9, "\"i\"");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "");
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python3Target0.genRecognizerHeaderFile(grammar11, sT12, "\"i\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python3Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        python3Target0.gen = codeGenerator16;
        java.lang.String str19 = python3Target0.encodeIntAsCharEscape(1);
        org.antlr.v4.tool.ast.GrammarAST grammarAST20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\\1" + "'", str19, "\\1");
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str4 = python3Target0.encodeIntAsCharEscape((int) (byte) 10);
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\12" + "'", str4, "\\12");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        python3Target0.addBadWords();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup11 = python3Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target();
        int int6 = python3Target5.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target5.language;
        java.lang.String str8 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python3Target5.templates = sTGroup9;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python3Target5.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "d", false);
        java.util.Set<java.lang.String> strSet15 = python3Target5.getBadWords();
        python3Target0.badWords = strSet15;
        python3Target0.language = "\".5.2.\"";
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup19 = python3Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.wantsBaseVisitor();
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\".5.2.\"\"", false);
        org.antlr.v4.codegen.target.Python3Target python3Target7 = new org.antlr.v4.codegen.target.Python3Target();
        int int8 = python3Target7.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target7.templates;
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target();
        int int11 = python3Target10.getInlineTestSetWordSize();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "" };
        python3Target10.targetCharValueEscape = strArray14;
        python3Target7.targetCharValueEscape = strArray14;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray14;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray14;
        python3Target0.targetCharValueEscape = strArray14;
        org.antlr.v4.tool.ast.GrammarAST grammarAST20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python3Target0.getLoopLabel(grammarAST20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\".5.2.\"\"" + "'", str6, "\"\".5.2.\"\"");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        java.lang.String str6 = python3Target0.language;
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(sTGroup3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str8 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target0.gen;
        boolean boolean10 = python3Target0.templatesExist();
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar11, sT12, "\"\\1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\0" + "'", str5, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.util.Set<java.lang.String> strSet3 = null;
        python3Target0.badWords = strSet3;
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target0.getLoopLabel(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.encodeIntAsCharEscape(100);
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target4 = new org.antlr.v4.codegen.target.Python3Target();
        int int5 = python3Target4.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target4.language;
        java.lang.String str7 = python3Target4.getVersion();
        int int8 = python3Target4.getInlineTestSetWordSize();
        java.lang.String str9 = python3Target4.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target4.gen;
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target();
        int int13 = python3Target12.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup14 = python3Target12.templates;
        org.antlr.v4.tool.Grammar grammar15 = null;
        int[] intArray16 = new int[] {};
        java.lang.String[] strArray17 = python3Target12.getTokenTypesAsTargetLabels(grammar15, intArray16);
        java.lang.String[] strArray18 = python3Target4.getTokenTypesAsTargetLabels(grammar11, intArray16);
        java.lang.String[] strArray19 = python3Target0.getTokenTypesAsTargetLabels(grammar3, intArray16);
        int int20 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = python3Target0.getCodeGenerator();
        int int22 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        java.lang.String str26 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator23, "\"\"4.5.2.1\"\"", false);
        java.lang.String str29 = python3Target0.getTargetStringLiteralFromString("\\0", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST30 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNull(sTGroup14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 29 + "'", int20 == 29);
        org.junit.Assert.assertNull(codeGenerator21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 64 + "'", int22 == 64);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\\\"4.5.2.1\\\"" + "'", str26, "\\\"4.5.2.1\\\"");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\\0\"" + "'", str29, "\"\\0\"");
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target();
        int int6 = python3Target5.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target5.language;
        java.lang.String str8 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python3Target5.templates = sTGroup9;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python3Target5.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "d", false);
        java.util.Set<java.lang.String> strSet15 = python3Target5.getBadWords();
        python3Target0.badWords = strSet15;
        org.antlr.v4.tool.ast.GrammarAST grammarAST17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        org.antlr.v4.tool.Grammar grammar11 = null;
        int[] intArray12 = new int[] {};
        java.lang.String[] strArray13 = python3Target8.getTokenTypesAsTargetLabels(grammar11, intArray12);
        java.lang.String[] strArray14 = python3Target0.getTokenTypesAsTargetLabels(grammar7, intArray12);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target0.getRuleFunctionContextStructName(ruleFunction15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(sTGroup10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        python3Target0.gen = codeGenerator2;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        java.lang.String str4 = python3Target0.getVersion();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target0.genRecognizerHeaderFile(grammar6, sT7, "");
        python3Target0.addBadWords();
        boolean boolean11 = python3Target0.templatesExist();
        java.lang.String str13 = python3Target0.getTargetStringLiteralFromString("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target0.getImplicitRuleLabel("i");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\"" + "'", str13, "\"\"");
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        python3Target0.badWords = strSet3;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.getCodeGenerator();
        boolean boolean7 = python3Target0.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target0.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str6 = python3Target0.getVersion();
        org.stringtemplate.v4.STGroup sTGroup7 = null;
        python3Target0.templates = sTGroup7;
        python3Target0.language = "\"\"\"i\"\"\"";
        java.lang.String str11 = python3Target0.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target0.getImplicitSetLabel("\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\"\"i\"\"\"" + "'", str11, "\"\"\"i\"\"\"");
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("hi!", false);
        python3Target0.language = "\"\"i\"\"";
        java.lang.String str12 = python3Target0.getTargetStringLiteralFromString("\"4.5.2.1\"");
        java.lang.String str15 = python3Target0.getTargetStringLiteralFromString("\"\".5.2.\"\"", true);
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.stringtemplate.v4.ST sT17 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar16, sT17, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\"4.5.2.1\"\"" + "'", str12, "\"\"4.5.2.1\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\"\".5.2.\"\"\"" + "'", str15, "\"\"\".5.2.\"\"\"");
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(0);
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str8 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python3Target0.gen = codeGenerator10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target0.getElementName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\0" + "'", str5, "\\0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator9);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        python3Target0.addBadWords();
        python3Target0.language = "\\0";
        boolean boolean10 = python3Target0.wantsBaseVisitor();
        java.lang.String str11 = python3Target0.getLanguage();
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.stringtemplate.v4.ST sT13 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar12, sT13, "\"\"\"4.5.2.1\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\0" + "'", str11, "\\0");
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        org.antlr.v4.tool.Grammar grammar11 = null;
        int[] intArray12 = new int[] {};
        java.lang.String[] strArray13 = python3Target8.getTokenTypesAsTargetLabels(grammar11, intArray12);
        java.lang.String[] strArray14 = python3Target0.getTokenTypesAsTargetLabels(grammar7, intArray12);
        java.lang.String str15 = python3Target0.getLanguage();
        java.lang.String str16 = python3Target0.getLanguage();
        java.lang.String str17 = python3Target0.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target0.getListLabel("\"\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(sTGroup10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        python3Target0.addBadWords();
        python3Target0.language = "\\0";
        boolean boolean10 = python3Target0.wantsBaseVisitor();
        java.lang.String str11 = python3Target0.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target0.encodeIntAsCharEscape((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\0" + "'", str11, "\\0");
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        java.lang.String str12 = python3Target0.getTargetStringLiteralFromString("hi!", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target0.getLoopCounter(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"" + "'", str12, "\"hi!\"");
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        java.lang.String str8 = python3Target0.encodeIntAsCharEscape((int) (short) 100);
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.templates;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = sTGroup9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "d" + "'", str8, "d");
        org.junit.Assert.assertNull(sTGroup9);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("4.5.2.1", true);
        java.util.Set<java.lang.String> strSet9 = python3Target0.badWords;
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getLoopLabel(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"4.5.2.1\"" + "'", str8, "\"4.5.2.1\"");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target0.genRecognizerHeaderFile(grammar6, sT7, "\"\"\"\"\"\"");
        boolean boolean10 = python3Target0.templatesExist();
        boolean boolean11 = python3Target0.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target0.getLoopLabel(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        org.antlr.v4.tool.Rule rule10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target0.getRuleFunctionContextStructName(rule10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target();
        int int10 = python3Target9.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target9.templates;
        org.antlr.v4.tool.Grammar grammar12 = null;
        int[] intArray13 = new int[] {};
        java.lang.String[] strArray14 = python3Target9.getTokenTypesAsTargetLabels(grammar12, intArray13);
        java.lang.String[] strArray15 = python3Target0.getTokenTypesAsTargetLabels(grammar8, intArray13);
        java.lang.String str16 = python3Target0.language;
        org.antlr.v4.tool.ast.GrammarAST grammarAST17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python3Target0.getLoopCounter(grammarAST17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNull(sTGroup11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        org.antlr.v4.tool.Grammar grammar11 = null;
        int[] intArray12 = new int[] {};
        java.lang.String[] strArray13 = python3Target8.getTokenTypesAsTargetLabels(grammar11, intArray12);
        java.lang.String[] strArray14 = python3Target0.getTokenTypesAsTargetLabels(grammar7, intArray12);
        java.lang.String str15 = python3Target0.getLanguage();
        java.lang.String str16 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        python3Target0.gen = codeGenerator17;
        python3Target0.language = "d";
        org.antlr.v4.tool.ast.GrammarAST grammarAST21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = python3Target0.getLoopCounter(grammarAST21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(sTGroup10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        python3Target0.badWords = strSet3;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target0.getTokenTypeAsTargetLabel(grammar7, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "");
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python3Target0.genRecognizerHeaderFile(grammar11, sT12, "\"i\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python3Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        python3Target0.gen = codeGenerator16;
        org.stringtemplate.v4.STGroup sTGroup18 = null;
        python3Target0.templates = sTGroup18;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python3Target0.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = python3Target0.getTokenTypeAsTargetLabel(grammar21, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertNull(codeGenerator20);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        python3Target0.gen = codeGenerator2;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        org.antlr.v4.tool.Rule rule5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target0.getRuleFunctionContextStructName(rule5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(codeGenerator4);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        java.lang.String str4 = python3Target0.getVersion();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        boolean boolean6 = python3Target0.supportsOverloadedMethods();
        int int7 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str8 = python3Target0.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target0.getLoopLabel(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target0.gen;
        java.lang.String str8 = python3Target0.getLanguage();
        java.lang.String str9 = python3Target0.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup10 = python3Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "d", locale3);
        java.util.Locale locale7 = null;
        java.lang.String str8 = pythonStringRenderer0.toString((java.lang.Object) "\".5.2.\"", "@", locale7);
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target();
        int int10 = python3Target9.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target9.templates;
        java.util.Locale locale13 = null;
        java.lang.String str14 = pythonStringRenderer0.toString((java.lang.Object) sTGroup11, "\"\"\"hi!\"\"\"", locale13);
        java.lang.Object obj15 = null;
        java.util.Locale locale17 = null;
        java.lang.String str18 = pythonStringRenderer0.toString(obj15, "\"\"\"\"4.5.2.1\"\"\"\"", locale17);
        org.antlr.v4.codegen.target.Python3Target python3Target19 = new org.antlr.v4.codegen.target.Python3Target();
        int int20 = python3Target19.getInlineTestSetWordSize();
        java.lang.String str21 = python3Target19.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        java.lang.String str25 = python3Target19.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator22, "", true);
        org.antlr.v4.tool.Grammar grammar26 = null;
        org.stringtemplate.v4.ST sT27 = null;
        python3Target19.genRecognizerHeaderFile(grammar26, sT27, "");
        java.util.Locale locale31 = null;
        java.lang.String str32 = pythonStringRenderer0.toString((java.lang.Object) sT27, "\"\"hi!\"\"", locale31);
        org.antlr.v4.codegen.target.Python3Target python3Target33 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup34 = null;
        python3Target33.templates = sTGroup34;
        java.lang.String[] strArray39 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        python3Target33.badWords = strSet40;
        java.lang.String str45 = python3Target33.getTargetStringLiteralFromString("hi!", true);
        java.util.Set<java.lang.String> strSet46 = python3Target33.badWords;
        java.util.Locale locale48 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str49 = pythonStringRenderer0.toString((java.lang.Object) strSet46, "\\64", locale48);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.LinkedHashSet cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "d" + "'", str4, "d");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "@" + "'", str8, "@");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNull(sTGroup11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"\"hi!\"\"\"" + "'", str14, "\"\"\"hi!\"\"\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\"\"\"4.5.2.1\"\"\"\"" + "'", str18, "\"\"\"\"4.5.2.1\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 64 + "'", int20 == 64);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"\"" + "'", str25, "\"\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\"hi!\"\"" + "'", str32, "\"\"hi!\"\"");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\"hi!\"" + "'", str45, "\"hi!\"");
        org.junit.Assert.assertNotNull(strSet46);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.util.Set<java.lang.String> strSet3 = null;
        python3Target0.badWords = strSet3;
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        java.lang.String str6 = python3Target0.getVersion();
        java.lang.String str7 = python3Target0.language;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target0.getAltLabelContextStructName("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.String str6 = python3Target0.getVersion();
        org.stringtemplate.v4.STGroup sTGroup7 = null;
        python3Target0.templates = sTGroup7;
        boolean boolean9 = python3Target0.supportsOverloadedMethods();
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getRuleFunctionContextStructName(ruleFunction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        org.antlr.v4.tool.Grammar grammar11 = null;
        int[] intArray12 = new int[] {};
        java.lang.String[] strArray13 = python3Target8.getTokenTypesAsTargetLabels(grammar11, intArray12);
        java.lang.String[] strArray14 = python3Target0.getTokenTypesAsTargetLabels(grammar7, intArray12);
        java.lang.String str17 = python3Target0.getTargetStringLiteralFromString("", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        java.lang.String str21 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator18, "\"i\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = python3Target0.gen;
        org.antlr.v4.tool.Rule rule23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = python3Target0.getRuleFunctionContextStructName(rule23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(sTGroup10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"i\"" + "'", str21, "\"i\"");
        org.junit.Assert.assertNull(codeGenerator22);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        java.util.Set<java.lang.String> strSet4 = python3Target0.getBadWords();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray5;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"");
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "\"\"\"\"\"4.5.2.1\"\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"" + "'", str2, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        org.antlr.v4.tool.Grammar grammar11 = null;
        int[] intArray12 = new int[] {};
        java.lang.String[] strArray13 = python3Target8.getTokenTypesAsTargetLabels(grammar11, intArray12);
        java.lang.String[] strArray14 = python3Target0.getTokenTypesAsTargetLabels(grammar7, intArray12);
        java.lang.String str15 = python3Target0.getLanguage();
        java.lang.String str17 = python3Target0.encodeIntAsCharEscape(64);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target0.getElementListName("\"\"\".5.2.\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(sTGroup10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "@" + "'", str17, "@");
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        org.antlr.v4.tool.Grammar grammar11 = null;
        int[] intArray12 = new int[] {};
        java.lang.String[] strArray13 = python3Target8.getTokenTypesAsTargetLabels(grammar11, intArray12);
        java.lang.String[] strArray14 = python3Target0.getTokenTypesAsTargetLabels(grammar7, intArray12);
        java.lang.String str16 = python3Target0.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str17 = python3Target0.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target0.getListLabel("\"\\\"i\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(sTGroup10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "d" + "'", str16, "d");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        java.lang.Class<?> wildcardClass6 = python3Target0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.encodeIntAsCharEscape(100);
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target4 = new org.antlr.v4.codegen.target.Python3Target();
        int int5 = python3Target4.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target4.language;
        java.lang.String str7 = python3Target4.getVersion();
        int int8 = python3Target4.getInlineTestSetWordSize();
        java.lang.String str9 = python3Target4.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target4.gen;
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target();
        int int13 = python3Target12.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup14 = python3Target12.templates;
        org.antlr.v4.tool.Grammar grammar15 = null;
        int[] intArray16 = new int[] {};
        java.lang.String[] strArray17 = python3Target12.getTokenTypesAsTargetLabels(grammar15, intArray16);
        java.lang.String[] strArray18 = python3Target4.getTokenTypesAsTargetLabels(grammar11, intArray16);
        java.lang.String[] strArray19 = python3Target0.getTokenTypesAsTargetLabels(grammar3, intArray16);
        int int20 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = python3Target0.getLoopCounter(grammarAST21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNull(sTGroup14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 29 + "'", int20 == 29);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        java.lang.String[] strArray10 = python3Target0.targetCharValueEscape;
        java.lang.Class<?> wildcardClass11 = strArray10.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "", false);
        int int9 = python3Target0.getInlineTestSetWordSize();
        boolean boolean10 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(sTGroup3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target();
        int int10 = python3Target9.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target9.templates;
        org.antlr.v4.tool.Grammar grammar12 = null;
        int[] intArray13 = new int[] {};
        java.lang.String[] strArray14 = python3Target9.getTokenTypesAsTargetLabels(grammar12, intArray13);
        java.lang.String[] strArray15 = python3Target0.getTokenTypesAsTargetLabels(grammar8, intArray13);
        java.lang.String str16 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python3Target0.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target0.getImplicitSetLabel("3");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNull(sTGroup11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(codeGenerator17);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        python3Target0.addBadWords();
        python3Target0.language = "\\0";
        boolean boolean10 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target0.getCodeGenerator();
        java.lang.String str12 = python3Target0.language;
        org.antlr.v4.tool.Grammar grammar13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target0.getTokenTypeAsTargetLabel(grammar13, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\0" + "'", str12, "\\0");
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.language;
        org.antlr.v4.codegen.target.Python3Target python3Target2 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup3 = null;
        python3Target2.templates = sTGroup3;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        python3Target2.badWords = strSet9;
        python3Target0.badWords = strSet9;
        python3Target0.language = "\"\"i\"\"";
        java.lang.String str15 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        python3Target0.gen = codeGenerator16;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target0.getImplicitSetLabel("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4.5.2.1" + "'", str15, "4.5.2.1");
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        org.antlr.v4.tool.Grammar grammar11 = null;
        int[] intArray12 = new int[] {};
        java.lang.String[] strArray13 = python3Target8.getTokenTypesAsTargetLabels(grammar11, intArray12);
        java.lang.String[] strArray14 = python3Target0.getTokenTypesAsTargetLabels(grammar7, intArray12);
        java.lang.String str15 = python3Target0.getLanguage();
        java.lang.String str16 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        python3Target0.gen = codeGenerator17;
        python3Target0.language = "d";
        python3Target0.language = "";
        org.antlr.v4.tool.Rule rule23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = python3Target0.getRuleFunctionContextStructName(rule23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(sTGroup10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getVersion();
        int int4 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        org.antlr.v4.tool.Grammar grammar11 = null;
        int[] intArray12 = new int[] {};
        java.lang.String[] strArray13 = python3Target8.getTokenTypesAsTargetLabels(grammar11, intArray12);
        java.lang.String[] strArray14 = python3Target0.getTokenTypesAsTargetLabels(grammar7, intArray12);
        java.lang.String str16 = python3Target0.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str17 = python3Target0.getLanguage();
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.stringtemplate.v4.ST sT19 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar18, sT19, "\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(sTGroup10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "d" + "'", str16, "d");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.encodeIntAsCharEscape(100);
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target4 = new org.antlr.v4.codegen.target.Python3Target();
        int int5 = python3Target4.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target4.language;
        java.lang.String str7 = python3Target4.getVersion();
        int int8 = python3Target4.getInlineTestSetWordSize();
        java.lang.String str9 = python3Target4.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target4.gen;
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target();
        int int13 = python3Target12.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup14 = python3Target12.templates;
        org.antlr.v4.tool.Grammar grammar15 = null;
        int[] intArray16 = new int[] {};
        java.lang.String[] strArray17 = python3Target12.getTokenTypesAsTargetLabels(grammar15, intArray16);
        java.lang.String[] strArray18 = python3Target4.getTokenTypesAsTargetLabels(grammar11, intArray16);
        java.lang.String[] strArray19 = python3Target0.getTokenTypesAsTargetLabels(grammar3, intArray16);
        int int20 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = python3Target0.getCodeGenerator();
        int int22 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        java.lang.String str26 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator23, "\"\"4.5.2.1\"\"", false);
        int int27 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = python3Target0.getLoopCounter(grammarAST28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNull(sTGroup14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 29 + "'", int20 == 29);
        org.junit.Assert.assertNull(codeGenerator21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 64 + "'", int22 == 64);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\\\"4.5.2.1\\\"" + "'", str26, "\\\"4.5.2.1\\\"");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 29 + "'", int27 == 29);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.util.Set<java.lang.String> strSet3 = null;
        python3Target0.badWords = strSet3;
        boolean boolean5 = python3Target0.templatesExist();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target0.genRecognizerHeaderFile(grammar6, sT7, "\"\"\"4.5.2.1\"\"\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target0.getLoopCounter(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        java.lang.String str4 = python3Target0.getVersion();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target0.genRecognizerHeaderFile(grammar6, sT7, "");
        python3Target0.addBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        int int12 = python3Target11.getInlineTestSetWordSize();
        boolean boolean13 = python3Target11.wantsBaseVisitor();
        java.lang.String str14 = python3Target11.getLanguage();
        int int15 = python3Target11.getInlineTestSetWordSize();
        java.lang.String[] strArray16 = python3Target11.targetCharValueEscape;
        python3Target0.targetCharValueEscape = strArray16;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target0.getImplicitRuleLabel("@");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 64 + "'", int15 == 64);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("\"hi!\"");
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        int int9 = python3Target8.getInlineTestSetWordSize();
        java.lang.String str10 = python3Target8.language;
        java.lang.String str11 = python3Target8.getLanguage();
        java.lang.String str13 = python3Target8.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target8.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "hi!", true);
        int int18 = python3Target8.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target20 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str21 = python3Target20.language;
        org.antlr.v4.codegen.target.Python3Target python3Target22 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup23 = null;
        python3Target22.templates = sTGroup23;
        java.lang.String[] strArray28 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        python3Target22.badWords = strSet29;
        python3Target20.badWords = strSet29;
        org.antlr.v4.tool.Grammar grammar33 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target34 = new org.antlr.v4.codegen.target.Python3Target();
        int int35 = python3Target34.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup36 = python3Target34.templates;
        org.antlr.v4.tool.Grammar grammar37 = null;
        int[] intArray38 = new int[] {};
        java.lang.String[] strArray39 = python3Target34.getTokenTypesAsTargetLabels(grammar37, intArray38);
        java.lang.String[] strArray40 = python3Target20.getTokenTypesAsTargetLabels(grammar33, intArray38);
        java.lang.String[] strArray41 = python3Target8.getTokenTypesAsTargetLabels(grammar19, intArray38);
        java.util.Set<java.lang.String> strSet42 = python3Target8.badWords;
        python3Target0.badWords = strSet42;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str45 = python3Target0.getImplicitTokenLabel("d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(sTGroup3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"hi!\"\"" + "'", str5, "\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\"" + "'", str13, "\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"i\"" + "'", str17, "\"i\"");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 29 + "'", int18 == 29);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 64 + "'", int35 == 64);
        org.junit.Assert.assertNull(sTGroup36);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[]");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strSet42);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        python3Target0.gen = codeGenerator4;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python3Target0.gen = codeGenerator6;
        int int8 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target0.getLoopLabel(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "\\0", "" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        python3Target0.badWords = strSet7;
        python3Target0.addBadWords();
        boolean boolean11 = python3Target0.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup12 = python3Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.stringtemplate.v4.STGroup sTGroup1 = null;
        python3Target0.templates = sTGroup1;
        java.util.Set<java.lang.String> strSet3 = null;
        python3Target0.badWords = strSet3;
        boolean boolean5 = python3Target0.wantsBaseListener();
        java.lang.String[] strArray6 = python3Target0.targetCharValueEscape;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\\\"hi!\\\"\"");
        python3Target0.language = "\\35";
        boolean boolean11 = python3Target0.wantsBaseListener();
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.stringtemplate.v4.ST sT13 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar12, sT13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\\\"hi!\\\"\"\"" + "'", str8, "\"\"\\\"hi!\\\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        boolean boolean5 = python3Target0.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python3Target0.gen = codeGenerator6;
        java.lang.Class<?> wildcardClass8 = python3Target0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(sTGroup3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\"\"", false);
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str11 = python3Target10.language;
        java.lang.String[] strArray12 = python3Target10.targetCharValueEscape;
        python3Target0.targetCharValueEscape = strArray12;
        boolean boolean14 = python3Target0.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target0.getImplicitSetLabel("\\0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        python3Target0.targetCharValueEscape = strArray4;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\"\"", false);
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        int int11 = python3Target0.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target0.getImplicitSetLabel("\"\"hi!\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        boolean boolean2 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.gen;
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target0.genRecognizerHeaderFile(grammar6, sT7, "\"\"\"\"\"\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target0.getElementName("\"\"\"\"i\"\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "hi!", true);
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        boolean boolean11 = python3Target0.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup12 = null;
        python3Target0.templates = sTGroup12;
        java.lang.String[] strArray14 = python3Target0.targetCharValueEscape;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target0.getElementListName("\\12");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"i\"" + "'", str9, "\"i\"");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target0.templates;
        boolean boolean4 = python3Target0.templatesExist();
        java.lang.String[] strArray5 = python3Target0.targetCharValueEscape;
        java.lang.String str6 = python3Target0.language;
        java.lang.String str7 = python3Target0.getVersion();
        java.lang.String str8 = python3Target0.getVersion();
        boolean boolean9 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getTokenTypeAsTargetLabel(grammar10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(sTGroup3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        java.util.Set<java.lang.String> strSet4 = python3Target0.getBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        python3Target5.badWords = strSet8;
        python3Target0.badWords = strSet8;
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        int int1 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str2 = python3Target0.language;
        java.lang.String str3 = python3Target0.getLanguage();
        java.lang.String str5 = python3Target0.getTargetStringLiteralFromString("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "hi!", true);
        int int10 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "4.5.2.1", true);
        java.lang.String[] strArray15 = python3Target0.targetCharValueEscape;
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup16 = python3Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"i\"" + "'", str9, "\"i\"");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\".5.2.\"" + "'", str14, "\".5.2.\"");
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.encodeIntAsCharEscape(100);
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target4 = new org.antlr.v4.codegen.target.Python3Target();
        int int5 = python3Target4.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target4.language;
        java.lang.String str7 = python3Target4.getVersion();
        int int8 = python3Target4.getInlineTestSetWordSize();
        java.lang.String str9 = python3Target4.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target4.gen;
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target();
        int int13 = python3Target12.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup14 = python3Target12.templates;
        org.antlr.v4.tool.Grammar grammar15 = null;
        int[] intArray16 = new int[] {};
        java.lang.String[] strArray17 = python3Target12.getTokenTypesAsTargetLabels(grammar15, intArray16);
        java.lang.String[] strArray18 = python3Target4.getTokenTypesAsTargetLabels(grammar11, intArray16);
        java.lang.String[] strArray19 = python3Target0.getTokenTypesAsTargetLabels(grammar3, intArray16);
        int int20 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = python3Target0.getCodeGenerator();
        int int22 = python3Target0.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup23 = python3Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d" + "'", str2, "d");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 64 + "'", int8 == 64);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNull(sTGroup14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[]");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 29 + "'", int20 == 29);
        org.junit.Assert.assertNull(codeGenerator21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 64 + "'", int22 == 64);
    }
}

