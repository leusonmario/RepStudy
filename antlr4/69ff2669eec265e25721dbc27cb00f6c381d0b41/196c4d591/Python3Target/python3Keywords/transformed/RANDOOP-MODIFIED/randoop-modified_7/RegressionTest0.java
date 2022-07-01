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
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python3Target0.getAltLabelContextStructName("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "";
        org.antlr.v4.tool.ast.GrammarAST grammarAST3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.antlr.v4.tool.ast.GrammarAST grammarAST1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\"" + "'", str1, "\"\"");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python3Target0.getTokenTypeAsTargetLabel(grammar3, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.antlr.v4.tool.Grammar grammar1 = null;
        org.stringtemplate.v4.ST sT2 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar1, sT2, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python3Target0.getTokenTypeAsTargetLabel(grammar3, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(sTGroup2);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar7, sT8, "4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar3, sT4, "\"\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"\"\"" + "'", str2, "\"\"\"\"\"\"");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target0.getLoopLabel(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean4 = python3Target3.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet5 = python3Target3.badWords;
        python3Target0.badWords = strSet5;
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"\"\"" + "'", str2, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python3Target1.getLoopCounter(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet2 = python3Target0.badWords;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python3Target0.getRuleFunctionContextStructName(ruleFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        int int3 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target0.getTokenTypeAsTargetLabel(grammar4, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.antlr.v4.tool.ast.GrammarAST grammarAST1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = python3Target0.getLoopCounter(grammarAST1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar3, sT4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar7, sT8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean4 = python3Target3.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet5 = python3Target3.badWords;
        python3Target0.badWords = strSet5;
        org.antlr.v4.tool.Grammar grammar7 = null;
        int[] intArray14 = new int[] { 64, 29, (byte) 0, (byte) -1, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray15 = python3Target0.getTokenTypesAsTargetLabels(grammar7, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"\"\"" + "'", str2, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[64, 29, 0, -1, 1, 100]");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.stringtemplate.v4.ST sT6 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genListenerFile(grammar5, sT6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        java.lang.String[] strArray16 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        python3Target0.badWords = strSet17;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python3Target0.getElementListName("\"\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        java.lang.String[] strArray16 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        python3Target0.badWords = strSet17;
        org.antlr.v4.tool.Rule rule20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python3Target0.getRuleFunctionContextStructName(rule20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.ast.GrammarAST grammarAST3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python3Target0.getLoopCounter(grammarAST3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(sTGroup2);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        java.lang.String[] strArray16 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        python3Target0.badWords = strSet17;
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup20 = python3Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.ast.GrammarAST grammarAST3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(sTGroup2);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
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
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet2 = python3Target0.badWords;
        int int3 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target0.getElementName("\\12");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python3Target0.templates = sTGroup9;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getAltLabelContextStructName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\"\"" + "'", str8, "\"\"\"\"");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet2 = python3Target0.badWords;
        int int3 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python3Target0.getLoopLabel(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genFile(grammar2, sT3, "\\12");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        org.antlr.v4.tool.Rule rule4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python3Target1.getRuleFunctionContextStructName(rule4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        java.lang.String[] strArray16 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        python3Target0.badWords = strSet17;
        java.lang.Class<?> wildcardClass20 = python3Target0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python3Target1.gen = codeGenerator3;
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target1.getLoopCounter(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target1.getRuleFunctionContextStructName(ruleFunction5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        org.antlr.v4.codegen.target.Python3Target python3Target7 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray8 = python3Target7.targetCharValueEscape;
        python3Target0.targetCharValueEscape = strArray8;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target0.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(codeGenerator10);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str6 = python3Target1.getImplicitSetLabel("\\12");
        org.antlr.v4.tool.Grammar grammar7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getTokenTypeAsTargetLabel(grammar7, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset\\12" + "'", str6, "_tset\\12");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        java.lang.String[] strArray16 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        python3Target0.badWords = strSet17;
        boolean boolean20 = python3Target0.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = python3Target0.getImplicitRuleLabel("\"\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\\\"4.5.2.1\\\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\\"4.5.2.1\\\"" + "'", str1, "\\\"4.5.2.1\\\"");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        python3Target0.language = "Python3";
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar9, sT10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        java.lang.String[] strArray16 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        python3Target0.badWords = strSet17;
        boolean boolean20 = python3Target0.templatesExist();
        org.antlr.v4.tool.Grammar grammar21 = null;
        org.stringtemplate.v4.ST sT22 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar21, sT22, "Python3");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "\"\\12\"", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target0.getListLabel("\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "12" + "'", str6, "12");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        python3Target1.language = "";
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("\"4.5.2.1\"", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getAltLabelContextStructName("\"\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\\"4.5.2.1\\\"" + "'", str8, "\\\"4.5.2.1\\\"");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        java.lang.String str7 = python3Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar8 = null;
        int[] intArray9 = new int[] {};
        java.lang.String[] strArray10 = python3Target0.getTokenTypesAsTargetLabels(grammar8, intArray9);
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        org.antlr.v4.codegen.target.Python3Target python3Target7 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray8 = python3Target7.targetCharValueEscape;
        python3Target0.targetCharValueEscape = strArray8;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target0.getListLabel("_tsetPython3");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target0.getRuleFunctionContextStructName(ruleFunction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Python3" + "'", str2, "Python3");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        python3Target0.language = "Python3";
        int int9 = python3Target0.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target0.loadTemplates();
        python3Target0.addBadWords();
        java.lang.Class<?> wildcardClass12 = python3Target0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.antlr.v4.tool.Rule rule3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python3Target1.getRuleFunctionContextStructName(rule3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator3);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.tool.ast.GrammarAST grammarAST3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        python3Target1.language = "";
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getLoopCounter(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"\"", false);
        org.antlr.v4.tool.Rule rule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target0.getRuleFunctionContextStructName(rule7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"\"\"\"\"" + "'", str6, "\"\"\"\"\"\"");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        java.lang.String[] strArray16 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        python3Target0.badWords = strSet17;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python3Target0.gen;
        java.lang.String str23 = python3Target0.getTargetStringLiteralFromString("\\12", true);
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup24 = python3Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(codeGenerator20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"\\12\"" + "'", str23, "\"\\12\"");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python3Target1.getElementListName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Python3" + "'", str2, "Python3");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        java.lang.Class<?> wildcardClass9 = python3Target0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        boolean boolean7 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar8, sT9, "\"4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("Python3");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Python3" + "'", str1, "Python3");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet2 = python3Target0.badWords;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar3, sT4, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strSet2);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.antlr.v4.tool.Grammar grammar1 = null;
        org.stringtemplate.v4.ST sT2 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar1, sT2, "Hi!Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python3Target0.gen = codeGenerator3;
        java.lang.String str5 = python3Target0.getVersion();
        org.antlr.v4.tool.Rule rule6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target0.getRuleFunctionContextStructName(rule6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"\"\"" + "'", str2, "\"\"\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str11 = python3Target0.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target0.getLoopLabel(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\"\"" + "'", str8, "\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"\"\"" + "'", str10, "\"\"\"\"");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"");
        org.antlr.v4.tool.Rule rule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getRuleFunctionContextStructName(rule11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\"\"" + "'", str8, "\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"\"\"" + "'", str10, "\"\"\"\"");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        org.antlr.v4.codegen.target.Python3Target python3Target7 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray8 = python3Target7.targetCharValueEscape;
        python3Target0.targetCharValueEscape = strArray8;
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target0.getLoopCounter(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet2 = python3Target0.badWords;
        boolean boolean3 = python3Target0.templatesExist();
        org.antlr.v4.tool.Grammar grammar4 = null;
        int[] intArray10 = new int[] { (byte) -1, (short) -1, (byte) 100, (byte) -1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray11 = python3Target0.getTokenTypesAsTargetLabels(grammar4, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, -1, 100, -1, 100]");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        int int3 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str8 = python3Target6.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean11 = python3Target10.supportsOverloadedMethods();
        java.lang.String str12 = python3Target10.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python3Target10.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "", true);
        java.lang.String str17 = python3Target10.getVersion();
        org.antlr.v4.tool.Grammar grammar18 = null;
        int[] intArray19 = new int[] {};
        java.lang.String[] strArray20 = python3Target10.getTokenTypesAsTargetLabels(grammar18, intArray19);
        java.lang.String[] strArray21 = python3Target6.getTokenTypesAsTargetLabels(grammar9, intArray19);
        java.lang.String[] strArray22 = python3Target0.getTokenTypesAsTargetLabels(grammar5, intArray19);
        java.lang.Class<?> wildcardClass23 = python3Target0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\"\"\"\"" + "'", str8, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"" + "'", str16, "\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        java.lang.String[] strArray16 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        python3Target0.badWords = strSet17;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python3Target0.gen;
        java.lang.String str23 = python3Target0.getTargetStringLiteralFromString("\\12", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = python3Target0.getElementListName("Python3");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(codeGenerator20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"\\12\"" + "'", str23, "\"\\12\"");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target1.language = "4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.gen;
        java.lang.String str6 = python3Target1.getLanguage();
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = pythonStringRenderer0.toString((java.lang.Object) python3Target1, "d", locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python3Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        java.lang.String[] strArray16 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        python3Target0.badWords = strSet17;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python3Target0.gen;
        java.lang.String str23 = python3Target0.getTargetStringLiteralFromString("\\12", true);
        java.lang.String str25 = python3Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.tool.ast.GrammarAST grammarAST26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = python3Target0.getLoopLabel(grammarAST26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(codeGenerator20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"\\12\"" + "'", str23, "\"\\12\"");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"hi!\"" + "'", str25, "\"hi!\"");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        java.lang.String[] strArray16 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        python3Target0.badWords = strSet17;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python3Target0.gen;
        java.lang.String str21 = python3Target0.getVersion();
        int int22 = python3Target0.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = python3Target0.getListLabel("\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(codeGenerator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4.5.2.1" + "'", str21, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 29 + "'", int22 == 29);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = null;
        python3Target0.templates = sTGroup4;
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator3);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        java.lang.String str7 = python3Target0.getVersion();
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str10 = python3Target8.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean13 = python3Target12.supportsOverloadedMethods();
        java.lang.String str14 = python3Target12.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        java.lang.String str18 = python3Target12.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator15, "", true);
        java.lang.String str19 = python3Target12.getVersion();
        org.antlr.v4.tool.Grammar grammar20 = null;
        int[] intArray21 = new int[] {};
        java.lang.String[] strArray22 = python3Target12.getTokenTypesAsTargetLabels(grammar20, intArray21);
        java.lang.String[] strArray23 = python3Target8.getTokenTypesAsTargetLabels(grammar11, intArray21);
        java.lang.String[] strArray24 = python3Target8.targetCharValueEscape;
        python3Target0.targetCharValueEscape = strArray24;
        org.antlr.v4.tool.Grammar grammar26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = python3Target0.getTokenTypeAsTargetLabel(grammar26, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"\"\"\"\"" + "'", str10, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\"" + "'", str18, "\"\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "4.5.2.1" + "'", str19, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"12\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"12\"" + "'", str1, "\"12\"");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.loadTemplates();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getRuleFunctionContextStructName(ruleFunction7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(sTGroup6);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", false);
        java.util.Set<java.lang.String> strSet11 = python3Target0.badWords;
        java.util.Set<java.lang.String> strSet12 = python3Target0.badWords;
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "";
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean4 = python3Target3.supportsOverloadedMethods();
        java.lang.String str5 = python3Target3.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target3.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python3Target3.gen = codeGenerator10;
        java.lang.String[] strArray19 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        python3Target3.badWords = strSet20;
        python3Target0.badWords = strSet20;
        java.lang.String str25 = python3Target0.encodeIntAsCharEscape((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = python3Target0.getAltLabelContextStructName("\"12\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"" + "'", str9, "\"\"");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        int int3 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.stringtemplate.v4.ST sT6 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar5, sT6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertNull(codeGenerator4);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("_tset\\12");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_tset\\12" + "'", str1, "_tset\\12");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        org.antlr.v4.codegen.target.Python3Target python3Target7 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray8 = python3Target7.targetCharValueEscape;
        python3Target0.targetCharValueEscape = strArray8;
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target0.getLoopLabel(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python3Target0.gen = codeGenerator3;
        java.lang.String str5 = python3Target0.getVersion();
        java.lang.Class<?> wildcardClass6 = python3Target0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"\"\"" + "'", str2, "\"\"\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "";
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean4 = python3Target3.supportsOverloadedMethods();
        java.lang.String str5 = python3Target3.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target3.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python3Target3.gen = codeGenerator10;
        java.lang.String[] strArray19 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        python3Target3.badWords = strSet20;
        python3Target0.badWords = strSet20;
        java.lang.String str25 = python3Target0.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str26 = python3Target0.getLanguage();
        java.lang.Class<?> wildcardClass27 = python3Target0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"" + "'", str9, "\"\"");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target4 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean5 = python3Target4.supportsOverloadedMethods();
        java.lang.String str6 = python3Target4.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target4.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        java.lang.String str11 = python3Target4.getVersion();
        org.antlr.v4.tool.Grammar grammar12 = null;
        int[] intArray13 = new int[] {};
        java.lang.String[] strArray14 = python3Target4.getTokenTypesAsTargetLabels(grammar12, intArray13);
        java.lang.String[] strArray15 = python3Target0.getTokenTypesAsTargetLabels(grammar3, intArray13);
        python3Target0.language = "d";
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"\"\"" + "'", str2, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str5 = python3Target3.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean7 = python3Target6.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet8 = python3Target6.badWords;
        python3Target3.badWords = strSet8;
        python3Target1.badWords = strSet8;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getElementName("\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"\"\"\"\"" + "'", str5, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.antlr.v4.tool.Rule rule2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = python3Target0.getRuleFunctionContextStructName(rule2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "\"\"\"\"\"\"", locale3);
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean6 = python3Target5.supportsOverloadedMethods();
        java.lang.String str7 = python3Target5.getVersion();
        java.lang.String str9 = python3Target5.getTargetStringLiteralFromString("12");
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = pythonStringRenderer0.toString((java.lang.Object) python3Target5, "\"Python3\"", locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python3Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"\"\"\"\"" + "'", str4, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"12\"" + "'", str9, "\"12\"");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.stringtemplate.v4.ST sT6 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genFile(grammar5, sT6, "\\\"4.5.2.1\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "\"\"\"\"\"\"", locale3);
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = pythonStringRenderer0.toString((java.lang.Object) 1, "DContext", locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"\"\"\"\"" + "'", str4, "\"\"\"\"\"\"");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        java.lang.String[] strArray16 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        python3Target0.badWords = strSet17;
        boolean boolean20 = python3Target0.templatesExist();
        org.antlr.v4.tool.Grammar grammar21 = null;
        org.stringtemplate.v4.ST sT22 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar21, sT22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.util.Set<java.lang.String> strSet5 = python3Target0.badWords;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target0.getAltLabelContextStructName("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        int int3 = python3Target0.getInlineTestSetWordSize();
        java.lang.Class<?> wildcardClass4 = python3Target0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"\"", false);
        boolean boolean7 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"\"\"\"\"" + "'", str6, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python3Target0.getLoopCounter(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator3);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.lang.String[] strArray0 = null;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        python3Target0.language = "Python3";
        java.util.Set<java.lang.String> strSet9 = null;
        python3Target0.badWords = strSet9;
        boolean boolean11 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        java.lang.String[] strArray3 = python3Target0.targetCharValueEscape;
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python3Target0.templates = sTGroup9;
        org.antlr.v4.tool.Grammar grammar11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target0.getTokenTypeAsTargetLabel(grammar11, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\"\"" + "'", str8, "\"\"\"\"");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.tool.Rule rule6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target0.getRuleFunctionContextStructName(rule6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        python3Target1.language = "";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getListLabel("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        int int3 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.addBadWords();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Python3" + "'", str2, "Python3");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = python3Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray8;
        python3Target0.targetCharValueEscape = strArray8;
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean12 = python3Target11.supportsOverloadedMethods();
        java.lang.String str13 = python3Target11.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target11.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        python3Target11.gen = codeGenerator18;
        java.lang.String[] strArray27 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        python3Target11.badWords = strSet28;
        python3Target0.badWords = strSet28;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = python3Target0.getRuleFunctionContextStructName(ruleFunction32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        python3Target0.gen = codeGenerator2;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python3Target0.getImplicitTokenLabel("DContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        python3Target0.language = "Python3";
        int int9 = python3Target0.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target0.loadTemplates();
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar11, sT12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
        org.junit.Assert.assertNotNull(sTGroup10);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        org.antlr.v4.codegen.target.Python3Target python3Target7 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray8 = python3Target7.targetCharValueEscape;
        python3Target0.targetCharValueEscape = strArray8;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target0.getListLabel("12");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target0.getLoopCounter(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(codeGenerator4);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = python3Target0.getCodeGenerator();
        org.antlr.v4.tool.Rule rule2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = python3Target0.getRuleFunctionContextStructName(rule2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator1);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        org.antlr.v4.codegen.target.Python3Target python3Target7 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray8 = python3Target7.targetCharValueEscape;
        python3Target0.targetCharValueEscape = strArray8;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target0.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getListLabel("Hi!Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(codeGenerator10);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", false);
        int int11 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str12 = python3Target0.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target0.getImplicitRuleLabel("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29 + "'", int11 == 29);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        java.lang.String str7 = python3Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        python3Target0.genRecognizerHeaderFile(grammar8, sT9, "\"\"\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.stringtemplate.v4.ST sT13 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar12, sT13, "\"12\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "";
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean4 = python3Target3.supportsOverloadedMethods();
        java.lang.String str5 = python3Target3.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target3.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python3Target3.gen = codeGenerator10;
        java.lang.String[] strArray19 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        python3Target3.badWords = strSet20;
        python3Target0.badWords = strSet20;
        java.lang.String str25 = python3Target0.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str26 = python3Target0.getLanguage();
        java.lang.String[] strArray27 = new java.lang.String[] {};
        python3Target0.targetCharValueEscape = strArray27;
        int int29 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = python3Target0.getLoopLabel(grammarAST30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"" + "'", str9, "\"\"");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 29 + "'", int29 == 29);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray8;
        python3Target0.targetCharValueEscape = strArray8;
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean12 = python3Target11.supportsOverloadedMethods();
        java.lang.String str13 = python3Target11.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target11.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        python3Target11.gen = codeGenerator18;
        java.lang.String[] strArray27 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        python3Target11.badWords = strSet28;
        python3Target0.badWords = strSet28;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = python3Target0.getElementName("\"12\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("_tsetPython3");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_tsetPython3" + "'", str1, "_tsetPython3");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target0.gen;
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target0.getLoopCounter(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\"\"" + "'", str8, "\"\"\"\"");
        org.junit.Assert.assertNull(codeGenerator9);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        python3Target0.language = "Python3";
        int int9 = python3Target0.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target0.loadTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getElementListName("\\12");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
        org.junit.Assert.assertNotNull(sTGroup10);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        java.lang.String str7 = python3Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        python3Target0.genRecognizerHeaderFile(grammar8, sT9, "\"\"\"\"\"\"");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target0.getRuleFunctionContextStructName(ruleFunction12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.lang.String str5 = python3Target0.getLanguage();
        python3Target0.addBadWords();
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar7, sT8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray1;
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getLanguage();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("Python3");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "\"\"\"\"", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getLoopCounter(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Python3" + "'", str2, "Python3");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tsetPython3" + "'", str4, "_tsetPython3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"\\\"\"" + "'", str8, "\"\\\"\\\"\"");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet2 = python3Target0.badWords;
        boolean boolean3 = python3Target0.templatesExist();
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar4, sT5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        java.lang.String[] strArray16 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        python3Target0.badWords = strSet17;
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup20 = python3Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "\"\"\"\"\"\"", locale3);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator5);
        java.lang.String str8 = python3Target6.getTargetStringLiteralFromString("");
        python3Target6.language = "";
        java.util.Locale locale12 = null;
        java.lang.String str13 = pythonStringRenderer0.toString((java.lang.Object) "", "\"\\\"hi!\\\"\"", locale12);
        java.util.Locale locale16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = pythonStringRenderer0.toString((java.lang.Object) 10L, "", locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Long cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"\"\"\"\"" + "'", str4, "\"\"\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"" + "'", str8, "\"\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str13, "\"\\\"hi!\\\"\"");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        java.lang.String str7 = python3Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target0.getTokenTypeAsTargetLabel(grammar8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        java.lang.String[] strArray16 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        python3Target0.badWords = strSet17;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python3Target0.gen;
        java.lang.String str21 = python3Target0.getVersion();
        int int22 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str23 = python3Target0.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = python3Target0.getListLabel("d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(codeGenerator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4.5.2.1" + "'", str21, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 29 + "'", int22 == 29);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        boolean boolean7 = python3Target0.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target0.getElementListName("\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        python3Target0.language = "Python3";
        java.util.Set<java.lang.String> strSet9 = null;
        python3Target0.badWords = strSet9;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "\"Hi!Context\"", false);
        java.lang.String str16 = python3Target0.getListLabel("Python3");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python3Target0.getElementListName("\"\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!Context" + "'", str14, "Hi!Context");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Python3" + "'", str16, "Python3");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python3Target0.gen = codeGenerator3;
        org.antlr.v4.tool.Rule rule5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target0.getRuleFunctionContextStructName(rule5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"\"\"" + "'", str2, "\"\"\"\"\"\"");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        java.lang.String str4 = python3Target0.getTargetStringLiteralFromString("12");
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.stringtemplate.v4.ST sT6 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar5, sT6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"12\"" + "'", str4, "\"12\"");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "";
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean4 = python3Target3.supportsOverloadedMethods();
        java.lang.String str5 = python3Target3.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target3.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python3Target3.gen = codeGenerator10;
        java.lang.String[] strArray19 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        python3Target3.badWords = strSet20;
        python3Target0.badWords = strSet20;
        java.lang.String str25 = python3Target0.encodeIntAsCharEscape((int) (byte) 100);
        org.antlr.v4.tool.ast.GrammarAST grammarAST26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = python3Target0.getLoopLabel(grammarAST26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"" + "'", str9, "\"\"");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        java.lang.String[] strArray16 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        python3Target0.badWords = strSet17;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python3Target0.gen;
        java.lang.String str23 = python3Target0.getTargetStringLiteralFromString("\\12", true);
        java.lang.String str25 = python3Target0.getTargetStringLiteralFromString("hi!");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = python3Target0.getRuleFunctionContextStructName(ruleFunction26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(codeGenerator20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"\\12\"" + "'", str23, "\"\\12\"");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\"hi!\"" + "'", str25, "\"hi!\"");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", false);
        int int11 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str12 = python3Target0.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target0.getLoopLabel(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29 + "'", int11 == 29);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.util.Set<java.lang.String> strSet5 = python3Target0.badWords;
        java.lang.String str6 = python3Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar7, sT8, "\"4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        org.antlr.v4.codegen.target.Python3Target python3Target7 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray8 = python3Target7.targetCharValueEscape;
        python3Target0.targetCharValueEscape = strArray8;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target0.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup11 = python3Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(codeGenerator10);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar4, sT5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python3Target1.getImplicitTokenLabel("\\12");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = python3Target1.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target1.templates;
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.gen;
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target7 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str9 = python3Target7.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean12 = python3Target11.supportsOverloadedMethods();
        java.lang.String str13 = python3Target11.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target11.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "", true);
        java.lang.String str18 = python3Target11.getVersion();
        org.antlr.v4.tool.Grammar grammar19 = null;
        int[] intArray20 = new int[] {};
        java.lang.String[] strArray21 = python3Target11.getTokenTypesAsTargetLabels(grammar19, intArray20);
        java.lang.String[] strArray22 = python3Target7.getTokenTypesAsTargetLabels(grammar10, intArray20);
        java.lang.String[] strArray23 = python3Target1.getTokenTypesAsTargetLabels(grammar6, intArray20);
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray23;
        java.util.Locale locale26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = pythonStringRenderer0.toString((java.lang.Object) strArray23, "d", locale26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.lang.String; cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNull(sTGroup3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"\"\"\"\"" + "'", str9, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[]");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray8;
        python3Target0.targetCharValueEscape = strArray8;
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str14 = python3Target12.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        python3Target12.gen = codeGenerator15;
        org.antlr.v4.tool.Grammar grammar17 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target18 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str20 = python3Target18.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar21 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target22 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean23 = python3Target22.supportsOverloadedMethods();
        java.lang.String str24 = python3Target22.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        java.lang.String str28 = python3Target22.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator25, "", true);
        java.lang.String str29 = python3Target22.getVersion();
        org.antlr.v4.tool.Grammar grammar30 = null;
        int[] intArray31 = new int[] {};
        java.lang.String[] strArray32 = python3Target22.getTokenTypesAsTargetLabels(grammar30, intArray31);
        java.lang.String[] strArray33 = python3Target18.getTokenTypesAsTargetLabels(grammar21, intArray31);
        java.lang.String[] strArray34 = python3Target12.getTokenTypesAsTargetLabels(grammar17, intArray31);
        java.lang.String[] strArray35 = python3Target0.getTokenTypesAsTargetLabels(grammar11, intArray31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = python3Target0.getListLabel("\"12\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"\"\"\"\"" + "'", str14, "\"\"\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\"\"\"\"\"" + "'", str20, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4.5.2.1" + "'", str24, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"\"" + "'", str28, "\"\"");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "4.5.2.1" + "'", str29, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[]");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray35);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str11 = python3Target0.getLanguage();
        int int12 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target0.getLoopCounter(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\"\"" + "'", str8, "\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"\"\"" + "'", str10, "\"\"\"\"");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        int int3 = python3Target1.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python3Target1.getImplicitTokenLabel("\"12\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        java.lang.Class<?> wildcardClass3 = python3Target0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"\"\"" + "'", str2, "\"\"\"\"\"\"");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        java.lang.String[] strArray16 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        python3Target0.badWords = strSet17;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python3Target0.gen;
        java.lang.String str21 = python3Target0.getVersion();
        int int22 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str23 = python3Target0.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = python3Target0.getElementName("\"\"\"\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(codeGenerator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4.5.2.1" + "'", str21, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 29 + "'", int22 == 29);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        int int3 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar4, sT5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python3Target1.gen = codeGenerator3;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "\"12\"", true);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getRuleFunctionContextStructName(ruleFunction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"12\"" + "'", str8, "\"12\"");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.lang.String str5 = python3Target0.getLanguage();
        python3Target0.addBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        java.lang.String str7 = python3Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar8 = null;
        int[] intArray9 = new int[] {};
        java.lang.String[] strArray10 = python3Target0.getTokenTypesAsTargetLabels(grammar8, intArray9);
        java.lang.String[] strArray11 = python3Target0.targetCharValueEscape;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target0.getElementListName("12");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        python3Target1.language = "";
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("\"4.5.2.1\"", false);
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup9 = python3Target1.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\\"4.5.2.1\\\"" + "'", str8, "\\\"4.5.2.1\\\"");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python3Target1.gen = codeGenerator3;
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("hi!");
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("\"hi!\"", true);
        boolean boolean10 = python3Target1.templatesExist();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getRuleFunctionContextStructName(ruleFunction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hi!Context" + "'", str6, "Hi!Context");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str9, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "\"\\12\"", false);
        java.lang.String str7 = python3Target0.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target0.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "12" + "'", str6, "12");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "";
        java.lang.String str4 = python3Target0.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target0.getTokenTypeAsTargetLabel(grammar5, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\12" + "'", str4, "\\12");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        int int3 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str8 = python3Target6.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean11 = python3Target10.supportsOverloadedMethods();
        java.lang.String str12 = python3Target10.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python3Target10.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "", true);
        java.lang.String str17 = python3Target10.getVersion();
        org.antlr.v4.tool.Grammar grammar18 = null;
        int[] intArray19 = new int[] {};
        java.lang.String[] strArray20 = python3Target10.getTokenTypesAsTargetLabels(grammar18, intArray19);
        java.lang.String[] strArray21 = python3Target6.getTokenTypesAsTargetLabels(grammar9, intArray19);
        java.lang.String[] strArray22 = python3Target0.getTokenTypesAsTargetLabels(grammar5, intArray19);
        java.lang.String[] strArray45 = new java.lang.String[] { "\"\\\"\\\"\"", "DContext", "", "hi!", "d", "\"\"\"\"\"\"", "\"\"\"\"\"\"", "_tsetPython3", "\"hi!\"", "\"hi!\"", "Hi!Context", "\"\"\"\"\"\"", "\"hi!\"", "12", "\"4.5.2.1\"", "DContext", "Hi!Context", "Python3", "\"hi!\"", "", "\"\"", "\\\"4.5.2.1\\\"" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        python3Target0.badWords = strSet46;
        org.antlr.v4.codegen.target.Python3Target python3Target49 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean50 = python3Target49.supportsOverloadedMethods();
        java.lang.String str51 = python3Target49.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator52 = null;
        java.lang.String str55 = python3Target49.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator52, "", true);
        java.lang.String str56 = python3Target49.getVersion();
        org.antlr.v4.codegen.target.Python3Target python3Target57 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str59 = python3Target57.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar60 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target61 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean62 = python3Target61.supportsOverloadedMethods();
        java.lang.String str63 = python3Target61.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator64 = null;
        java.lang.String str67 = python3Target61.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator64, "", true);
        java.lang.String str68 = python3Target61.getVersion();
        org.antlr.v4.tool.Grammar grammar69 = null;
        int[] intArray70 = new int[] {};
        java.lang.String[] strArray71 = python3Target61.getTokenTypesAsTargetLabels(grammar69, intArray70);
        java.lang.String[] strArray72 = python3Target57.getTokenTypesAsTargetLabels(grammar60, intArray70);
        java.lang.String[] strArray73 = python3Target57.targetCharValueEscape;
        python3Target49.targetCharValueEscape = strArray73;
        python3Target0.targetCharValueEscape = strArray73;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray73;
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\"\"\"\"" + "'", str8, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"" + "'", str16, "\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "4.5.2.1" + "'", str51, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\"\"" + "'", str55, "\"\"");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "4.5.2.1" + "'", str56, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "\"\"\"\"\"\"" + "'", str59, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "4.5.2.1" + "'", str63, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "\"\"" + "'", str67, "\"\"");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "4.5.2.1" + "'", str68, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[]");
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(strArray73);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("DContext");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DContext" + "'", str1, "DContext");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray9 = python3Target8.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        int int11 = python3Target8.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target8.gen;
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target14 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str16 = python3Target14.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar17 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target18 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean19 = python3Target18.supportsOverloadedMethods();
        java.lang.String str20 = python3Target18.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        java.lang.String str24 = python3Target18.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator21, "", true);
        java.lang.String str25 = python3Target18.getVersion();
        org.antlr.v4.tool.Grammar grammar26 = null;
        int[] intArray27 = new int[] {};
        java.lang.String[] strArray28 = python3Target18.getTokenTypesAsTargetLabels(grammar26, intArray27);
        java.lang.String[] strArray29 = python3Target14.getTokenTypesAsTargetLabels(grammar17, intArray27);
        java.lang.String[] strArray30 = python3Target8.getTokenTypesAsTargetLabels(grammar13, intArray27);
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray30;
        python3Target0.targetCharValueEscape = strArray30;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = python3Target0.getImplicitRuleLabel("d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(sTGroup10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"\"\"\"\"" + "'", str16, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4.5.2.1" + "'", str20, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"\"" + "'", str24, "\"\"");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4.5.2.1" + "'", str25, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray30);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "";
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean4 = python3Target3.supportsOverloadedMethods();
        java.lang.String str5 = python3Target3.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target3.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python3Target3.gen = codeGenerator10;
        java.lang.String[] strArray19 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        python3Target3.badWords = strSet20;
        python3Target0.badWords = strSet20;
        java.lang.String str25 = python3Target0.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str26 = python3Target0.getLanguage();
        java.lang.String[] strArray27 = new java.lang.String[] {};
        python3Target0.targetCharValueEscape = strArray27;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = python3Target0.getListLabel("\"\"\"\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"" + "'", str9, "\"\"");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python3Target0.getLoopCounter(grammarAST3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = null;
        python3Target0.templates = sTGroup4;
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getImplicitTokenLabel("\"Hi!Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(sTGroup6);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        java.lang.String str6 = python3Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getElementListName("12");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        java.lang.String[] strArray16 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        python3Target0.badWords = strSet17;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python3Target0.gen;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = python3Target0.getRuleFunctionContextStructName(ruleFunction21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(codeGenerator20);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray8;
        python3Target0.targetCharValueEscape = strArray8;
        boolean boolean11 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.stringtemplate.v4.ST sT13 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar12, sT13, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        python3Target0.language = "Python3";
        int int9 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str11 = python3Target0.getListLabel("_tsetPython3");
        org.antlr.v4.tool.Rule rule12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target0.getRuleFunctionContextStructName(rule12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tsetPython3" + "'", str11, "_tsetPython3");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "";
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
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target0.getAltLabelContextStructName("DContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "";
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean4 = python3Target3.supportsOverloadedMethods();
        java.lang.String str5 = python3Target3.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target3.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python3Target3.gen = codeGenerator10;
        java.lang.String[] strArray19 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        python3Target3.badWords = strSet20;
        python3Target0.badWords = strSet20;
        java.lang.String str25 = python3Target0.encodeIntAsCharEscape((int) (byte) 100);
        org.antlr.v4.tool.ast.GrammarAST grammarAST26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"" + "'", str9, "\"\"");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray8;
        python3Target0.targetCharValueEscape = strArray8;
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean12 = python3Target11.supportsOverloadedMethods();
        java.lang.String str13 = python3Target11.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target11.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        python3Target11.gen = codeGenerator18;
        java.lang.String[] strArray27 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        python3Target11.badWords = strSet28;
        python3Target0.badWords = strSet28;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = python3Target0.getImplicitSetLabel("4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str3 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup5 = null;
        python3Target1.templates = sTGroup5;
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.templates;
        java.util.Locale locale9 = null;
        java.lang.String str10 = pythonStringRenderer0.toString((java.lang.Object) sTGroup7, "Hi!Context", locale9);
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean12 = python3Target11.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet13 = python3Target11.badWords;
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = pythonStringRenderer0.toString((java.lang.Object) python3Target11, "hi!", locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python3Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertNull(sTGroup7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!Context" + "'", str10, "Hi!Context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSet13);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        java.lang.String str6 = python3Target1.getVersion();
        java.lang.String str8 = python3Target1.encodeIntAsCharEscape(29);
        org.antlr.v4.tool.Grammar grammar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getTokenTypeAsTargetLabel(grammar9, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\35" + "'", str8, "\\35");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target0.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target0.getAltLabelContextStructName("\"Hi!Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNull(codeGenerator7);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "\"\"\"\"\"\"", locale3);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator5);
        java.lang.String str8 = python3Target6.getTargetStringLiteralFromString("");
        python3Target6.language = "";
        java.util.Locale locale12 = null;
        java.lang.String str13 = pythonStringRenderer0.toString((java.lang.Object) "", "\"\\\"hi!\\\"\"", locale12);
        java.util.Locale locale16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = pythonStringRenderer0.toString((java.lang.Object) (byte) 100, "\"4.5.2.1\"", locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Byte cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"\"\"\"\"" + "'", str4, "\"\"\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"" + "'", str8, "\"\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str13, "\"\\\"hi!\\\"\"");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", false);
        java.util.Set<java.lang.String> strSet11 = python3Target0.badWords;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target0.getElementListName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python3Target0.gen = codeGenerator3;
        python3Target0.language = "\"\\12\"";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target0.getListLabel("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python3Target1.gen = codeGenerator3;
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("hi!");
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("\"hi!\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python3Target1.gen = codeGenerator10;
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target13 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray14 = python3Target13.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target13.templates;
        int int16 = python3Target13.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python3Target13.gen;
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target19 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str21 = python3Target19.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target23 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean24 = python3Target23.supportsOverloadedMethods();
        java.lang.String str25 = python3Target23.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        java.lang.String str29 = python3Target23.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator26, "", true);
        java.lang.String str30 = python3Target23.getVersion();
        org.antlr.v4.tool.Grammar grammar31 = null;
        int[] intArray32 = new int[] {};
        java.lang.String[] strArray33 = python3Target23.getTokenTypesAsTargetLabels(grammar31, intArray32);
        java.lang.String[] strArray34 = python3Target19.getTokenTypesAsTargetLabels(grammar22, intArray32);
        java.lang.String[] strArray35 = python3Target13.getTokenTypesAsTargetLabels(grammar18, intArray32);
        java.lang.String[] strArray36 = python3Target1.getTokenTypesAsTargetLabels(grammar12, intArray32);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction37 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = python3Target1.getRuleFunctionContextStructName(ruleFunction37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hi!Context" + "'", str6, "Hi!Context");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str9, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(sTGroup15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
        org.junit.Assert.assertNull(codeGenerator17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"\"\"\"\"\"" + "'", str21, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4.5.2.1" + "'", str25, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\"" + "'", str29, "\"\"");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "4.5.2.1" + "'", str30, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[]");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        java.lang.String str7 = python3Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar8 = null;
        int[] intArray9 = new int[] {};
        java.lang.String[] strArray10 = python3Target0.getTokenTypesAsTargetLabels(grammar8, intArray9);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "\"\"\"\"", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target0.getImplicitTokenLabel("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"\\\"\"" + "'", str14, "\"\\\"\\\"\"");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        java.lang.String[] strArray16 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        python3Target0.badWords = strSet17;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python3Target0.gen;
        java.lang.String str23 = python3Target0.getTargetStringLiteralFromString("\\12", true);
        java.lang.String str24 = python3Target0.getLanguage();
        org.antlr.v4.tool.Rule rule25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = python3Target0.getRuleFunctionContextStructName(rule25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(codeGenerator20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"\\12\"" + "'", str23, "\"\\12\"");
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        java.lang.String str4 = python3Target0.getTargetStringLiteralFromString("");
        int int5 = python3Target0.getSerializedATNSegmentLimit();
        java.util.Set<java.lang.String> strSet6 = python3Target0.badWords;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"\"\"" + "'", str2, "\"\"\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 29 + "'", int5 == 29);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python3Target0.gen = codeGenerator3;
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str8 = python3Target6.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean11 = python3Target10.supportsOverloadedMethods();
        java.lang.String str12 = python3Target10.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python3Target10.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "", true);
        java.lang.String str17 = python3Target10.getVersion();
        org.antlr.v4.tool.Grammar grammar18 = null;
        int[] intArray19 = new int[] {};
        java.lang.String[] strArray20 = python3Target10.getTokenTypesAsTargetLabels(grammar18, intArray19);
        java.lang.String[] strArray21 = python3Target6.getTokenTypesAsTargetLabels(grammar9, intArray19);
        java.lang.String[] strArray22 = python3Target0.getTokenTypesAsTargetLabels(grammar5, intArray19);
        org.antlr.v4.tool.ast.GrammarAST grammarAST23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = python3Target0.getLoopCounter(grammarAST23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"\"\"" + "'", str2, "\"\"\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\"\"\"\"" + "'", str8, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"" + "'", str16, "\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "\"\"\"\"\"\"", locale3);
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean6 = python3Target5.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet7 = python3Target5.badWords;
        boolean boolean8 = python3Target5.templatesExist();
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = pythonStringRenderer0.toString((java.lang.Object) boolean8, "_tset\\12", locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"\"\"\"\"" + "'", str4, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"\"", false);
        python3Target0.language = "";
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar9, sT10, "\"\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"\"\"\"\"" + "'", str6, "\"\"\"\"\"\"");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str11 = python3Target0.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target0.gen;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target0.getRuleFunctionContextStructName(ruleFunction14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\"\"" + "'", str8, "\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"\"\"" + "'", str10, "\"\"\"\"");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(sTGroup12);
        org.junit.Assert.assertNull(codeGenerator13);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "";
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean4 = python3Target3.supportsOverloadedMethods();
        java.lang.String str5 = python3Target3.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target3.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python3Target3.gen = codeGenerator10;
        java.lang.String[] strArray19 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        python3Target3.badWords = strSet20;
        python3Target0.badWords = strSet20;
        org.stringtemplate.v4.STGroup sTGroup24 = python3Target0.templates;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = python3Target0.getRuleFunctionContextStructName(ruleFunction25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"" + "'", str9, "\"\"");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(sTGroup24);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        python3Target0.language = "Python3";
        java.util.Set<java.lang.String> strSet9 = null;
        python3Target0.badWords = strSet9;
        boolean boolean11 = python3Target0.wantsBaseVisitor();
        java.lang.String str13 = python3Target0.getImplicitSetLabel("Python3");
        java.lang.Class<?> wildcardClass14 = python3Target0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_tsetPython3" + "'", str13, "_tsetPython3");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        int int9 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str11 = python3Target0.getTargetStringLiteralFromString("\\1");
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target0.getLoopCounter(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\1\"" + "'", str11, "\"\\1\"");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python3Target0.gen = codeGenerator3;
        java.lang.String str5 = python3Target0.getVersion();
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean7 = python3Target6.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target6.templates;
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        python3Target6.genRecognizerHeaderFile(grammar9, sT10, "");
        python3Target6.language = "Python3";
        int int15 = python3Target6.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup16 = python3Target6.loadTemplates();
        python3Target0.templates = sTGroup16;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target0.getElementListName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"\"\"" + "'", str2, "\"\"\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(sTGroup8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
        org.junit.Assert.assertNotNull(sTGroup16);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        org.antlr.v4.codegen.target.Python3Target python3Target7 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray8 = python3Target7.targetCharValueEscape;
        python3Target0.targetCharValueEscape = strArray8;
        python3Target0.addBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getLoopLabel(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray8;
        python3Target0.targetCharValueEscape = strArray8;
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean12 = python3Target11.supportsOverloadedMethods();
        java.lang.String str13 = python3Target11.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target11.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        python3Target11.gen = codeGenerator18;
        java.lang.String[] strArray27 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        python3Target11.badWords = strSet28;
        python3Target0.badWords = strSet28;
        java.lang.Class<?> wildcardClass32 = strSet28.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        java.lang.String[] strArray16 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        python3Target0.badWords = strSet17;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python3Target0.gen;
        java.lang.String str21 = python3Target0.getVersion();
        int int22 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str23 = python3Target0.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = python3Target0.getLoopLabel(grammarAST24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(codeGenerator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4.5.2.1" + "'", str21, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 29 + "'", int22 == 29);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        java.lang.String str7 = python3Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar8 = null;
        int[] intArray9 = new int[] {};
        java.lang.String[] strArray10 = python3Target0.getTokenTypesAsTargetLabels(grammar8, intArray9);
        java.lang.String[] strArray11 = python3Target0.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet12 = python3Target0.badWords;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target0.getElementListName("\\1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\"hi!\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\"hi!\"\"" + "'", str1, "\"\"hi!\"\"");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"Python3\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"Python3\"" + "'", str1, "\"Python3\"");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", false);
        int int11 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str12 = python3Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.stringtemplate.v4.ST sT14 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar13, sT14, "@");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29 + "'", int11 == 29);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.gen;
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertNull(codeGenerator7);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = null;
        python3Target0.templates = sTGroup4;
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target0.getElementName("12");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(sTGroup6);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getLanguage();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("Python3");
        org.antlr.v4.tool.Rule rule5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target1.getRuleFunctionContextStructName(rule5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Python3" + "'", str2, "Python3");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tsetPython3" + "'", str4, "_tsetPython3");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python3Target0.gen = codeGenerator3;
        python3Target0.language = "\"\\12\"";
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup7 = python3Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        java.lang.String[] strArray16 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        python3Target0.badWords = strSet17;
        python3Target0.language = "\"\"\"\"";
        java.lang.String str22 = python3Target0.getLanguage();
        org.antlr.v4.tool.Rule rule23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = python3Target0.getRuleFunctionContextStructName(rule23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"\"\"\"" + "'", str22, "\"\"\"\"");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet2 = python3Target0.badWords;
        boolean boolean3 = python3Target0.templatesExist();
        boolean boolean4 = python3Target0.templatesExist();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("DContext");
        java.lang.Class<?> wildcardClass7 = python3Target0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"DContext\"" + "'", str6, "\"DContext\"");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "";
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean4 = python3Target3.supportsOverloadedMethods();
        java.lang.String str5 = python3Target3.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target3.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python3Target3.gen = codeGenerator10;
        java.lang.String[] strArray19 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        python3Target3.badWords = strSet20;
        python3Target0.badWords = strSet20;
        java.lang.String str25 = python3Target0.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str26 = python3Target0.getLanguage();
        java.lang.String[] strArray27 = new java.lang.String[] {};
        python3Target0.targetCharValueEscape = strArray27;
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup29 = python3Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"" + "'", str9, "\"\"");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strArray27);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = null;
        python3Target0.templates = sTGroup4;
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getRuleFunctionContextStructName(ruleFunction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(sTGroup6);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        python3Target1.language = "";
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("\"4.5.2.1\"", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getAltLabelContextStructName("\\1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\\"4.5.2.1\\\"" + "'", str8, "\\\"4.5.2.1\\\"");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genListenerFile(grammar4, sT5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.gen;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean9 = python3Target8.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python3Target8.genRecognizerHeaderFile(grammar11, sT12, "");
        python3Target8.language = "Python3";
        int int17 = python3Target8.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup18 = python3Target8.loadTemplates();
        python3Target1.templates = sTGroup18;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python3Target1.getElementListName("4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(sTGroup10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 29 + "'", int17 == 29);
        org.junit.Assert.assertNotNull(sTGroup18);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getTokenTypeAsTargetLabel(grammar5, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getTokenTypeAsTargetLabel(grammar6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.util.Set<java.lang.String> strSet5 = python3Target0.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target0.gen;
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target0.getLoopCounter(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str5 = python3Target0.encodeIntAsCharEscape(1);
        java.lang.Class<?> wildcardClass6 = python3Target0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\1" + "'", str5, "\\1");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target4 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean5 = python3Target4.supportsOverloadedMethods();
        java.lang.String str6 = python3Target4.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target4.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        java.lang.String str11 = python3Target4.getVersion();
        org.antlr.v4.tool.Grammar grammar12 = null;
        int[] intArray13 = new int[] {};
        java.lang.String[] strArray14 = python3Target4.getTokenTypesAsTargetLabels(grammar12, intArray13);
        java.lang.String[] strArray15 = python3Target0.getTokenTypesAsTargetLabels(grammar3, intArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target0.getAltLabelContextStructName("\"DContext\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"\"\"" + "'", str2, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        python3Target0.language = "Python3";
        int int9 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str11 = python3Target0.getListLabel("_tsetPython3");
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target0.loadTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target0.getElementName("_\"\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tsetPython3" + "'", str11, "_tsetPython3");
        org.junit.Assert.assertNotNull(sTGroup12);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        org.antlr.v4.codegen.target.Python3Target python3Target7 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray8 = python3Target7.targetCharValueEscape;
        python3Target0.targetCharValueEscape = strArray8;
        boolean boolean10 = python3Target0.supportsOverloadedMethods();
        boolean boolean11 = python3Target0.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target0.getLoopLabel(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python3Target1.gen = codeGenerator3;
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("hi!");
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("\"hi!\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python3Target1.gen = codeGenerator10;
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target13 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray14 = python3Target13.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target13.templates;
        int int16 = python3Target13.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python3Target13.gen;
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target19 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str21 = python3Target19.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target23 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean24 = python3Target23.supportsOverloadedMethods();
        java.lang.String str25 = python3Target23.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        java.lang.String str29 = python3Target23.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator26, "", true);
        java.lang.String str30 = python3Target23.getVersion();
        org.antlr.v4.tool.Grammar grammar31 = null;
        int[] intArray32 = new int[] {};
        java.lang.String[] strArray33 = python3Target23.getTokenTypesAsTargetLabels(grammar31, intArray32);
        java.lang.String[] strArray34 = python3Target19.getTokenTypesAsTargetLabels(grammar22, intArray32);
        java.lang.String[] strArray35 = python3Target13.getTokenTypesAsTargetLabels(grammar18, intArray32);
        java.lang.String[] strArray36 = python3Target1.getTokenTypesAsTargetLabels(grammar12, intArray32);
        java.lang.String str38 = python3Target1.getAltLabelContextStructName("\"Python3\"");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction39 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = python3Target1.getRuleFunctionContextStructName(ruleFunction39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hi!Context" + "'", str6, "Hi!Context");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str9, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(sTGroup15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
        org.junit.Assert.assertNull(codeGenerator17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"\"\"\"\"\"" + "'", str21, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4.5.2.1" + "'", str25, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\"" + "'", str29, "\"\"");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "4.5.2.1" + "'", str30, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[]");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\"Python3\"Context" + "'", str38, "\"Python3\"Context");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
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
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.util.Set<java.lang.String> strSet5 = python3Target0.badWords;
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target0.getLoopCounter(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.ast.GrammarAST grammarAST2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("_tset12");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_tset12" + "'", str1, "_tset12");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        python3Target0.language = "Python3";
        java.util.Set<java.lang.String> strSet9 = null;
        python3Target0.badWords = strSet9;
        boolean boolean11 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        python3Target0.gen = codeGenerator12;
        org.antlr.v4.tool.Rule rule14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target0.getRuleFunctionContextStructName(rule14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "";
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean4 = python3Target3.supportsOverloadedMethods();
        java.lang.String str5 = python3Target3.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target3.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python3Target3.gen = codeGenerator10;
        java.lang.String[] strArray19 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        python3Target3.badWords = strSet20;
        python3Target0.badWords = strSet20;
        java.lang.String str25 = python3Target0.encodeIntAsCharEscape((int) (byte) 100);
        int int26 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = python3Target0.getLoopCounter(grammarAST27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"" + "'", str9, "\"\"");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 64 + "'", int26 == 64);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target0.getLoopCounter(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "\"\"\"\"\"\"", locale3);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator5);
        java.lang.String str8 = python3Target6.getTargetStringLiteralFromString("");
        python3Target6.language = "";
        java.util.Locale locale12 = null;
        java.lang.String str13 = pythonStringRenderer0.toString((java.lang.Object) "", "\"\\\"hi!\\\"\"", locale12);
        org.antlr.v4.codegen.target.Python3Target python3Target14 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray15 = python3Target14.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup16 = python3Target14.templates;
        int int17 = python3Target14.getInlineTestSetWordSize();
        java.util.Locale locale19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = pythonStringRenderer0.toString((java.lang.Object) int17, "_tset12", locale19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"\"\"\"\"" + "'", str4, "\"\"\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"" + "'", str8, "\"\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str13, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNull(sTGroup16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar9, sT10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\"\"" + "'", str8, "\"\"\"\"");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", false);
        java.util.Set<java.lang.String> strSet11 = python3Target0.badWords;
        java.lang.String str13 = python3Target0.getTargetStringLiteralFromString("12");
        int int14 = python3Target0.getSerializedATNSegmentLimit();
        boolean boolean15 = python3Target0.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup16 = python3Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"12\"" + "'", str13, "\"12\"");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        java.lang.String[] strArray16 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        python3Target0.badWords = strSet17;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python3Target0.gen;
        java.lang.String str23 = python3Target0.getTargetStringLiteralFromString("\\12", true);
        org.antlr.v4.tool.Grammar grammar24 = null;
        org.stringtemplate.v4.ST sT25 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar24, sT25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(codeGenerator20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"\\12\"" + "'", str23, "\"\\12\"");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str11 = python3Target0.getLanguage();
        boolean boolean12 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target0.getLoopLabel(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\"\"" + "'", str8, "\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"\"\"" + "'", str10, "\"\"\"\"");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\"\"" + "'", str1, "\"\\\"\\\"\"");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\"\"\\0\"\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\"\"\\0\"\"\"" + "'", str1, "\"\"\"\\0\"\"\"");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str5 = python3Target3.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean7 = python3Target6.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet8 = python3Target6.badWords;
        python3Target3.badWords = strSet8;
        python3Target1.badWords = strSet8;
        java.util.Set<java.lang.String> strSet11 = python3Target1.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target1.getCodeGenerator();
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("@");
        org.antlr.v4.tool.Grammar grammar15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.getTokenTypeAsTargetLabel(grammar15, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"\"\"\"\"" + "'", str5, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"@\"" + "'", str14, "\"@\"");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.tool.Grammar grammar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target0.getTokenTypeAsTargetLabel(grammar6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "";
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean4 = python3Target3.supportsOverloadedMethods();
        java.lang.String str5 = python3Target3.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target3.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python3Target3.gen = codeGenerator10;
        java.lang.String[] strArray19 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        python3Target3.badWords = strSet20;
        python3Target0.badWords = strSet20;
        java.lang.String str25 = python3Target0.encodeIntAsCharEscape((int) (byte) 100);
        org.antlr.v4.tool.Grammar grammar26 = null;
        org.stringtemplate.v4.ST sT27 = null;
        python3Target0.genRecognizerHeaderFile(grammar26, sT27, "");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = python3Target0.getRuleFunctionContextStructName(ruleFunction30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"" + "'", str9, "\"\"");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        python3Target1.language = "";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getAltLabelContextStructName("\"DContext\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.util.Set<java.lang.String> strSet5 = python3Target0.badWords;
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar6, sT7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray8;
        python3Target0.targetCharValueEscape = strArray8;
        boolean boolean11 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target0.getLoopLabel(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python3Target0.gen = codeGenerator3;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python3Target6.getBadWords();
        python3Target0.badWords = strSet7;
        java.lang.Class<?> wildcardClass9 = strSet7.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"\"\"" + "'", str2, "\"\"\"\"\"\"");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", false);
        java.util.Set<java.lang.String> strSet11 = python3Target0.badWords;
        java.lang.String str13 = python3Target0.getTargetStringLiteralFromString("12");
        int int14 = python3Target0.getSerializedATNSegmentLimit();
        boolean boolean15 = python3Target0.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup16 = python3Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"12\"" + "'", str13, "\"12\"");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        java.lang.String[] strArray16 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        python3Target0.badWords = strSet17;
        org.antlr.v4.tool.Grammar grammar20 = null;
        org.stringtemplate.v4.ST sT21 = null;
        python3Target0.genRecognizerHeaderFile(grammar20, sT21, "\"\"");
        java.lang.String str25 = python3Target0.encodeIntAsCharEscape((int) (byte) 10);
        java.lang.String str26 = python3Target0.language;
        java.util.Set<java.lang.String> strSet27 = python3Target0.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator28 = null;
        java.lang.String str31 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator28, "", false);
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup32 = python3Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\\12" + "'", str25, "\\12");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        python3Target0.language = "Python3";
        java.util.Set<java.lang.String> strSet9 = null;
        python3Target0.badWords = strSet9;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "\"Hi!Context\"", false);
        java.lang.String str16 = python3Target0.getListLabel("Python3");
        org.antlr.v4.tool.ast.GrammarAST grammarAST17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python3Target0.getLoopLabel(grammarAST17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Hi!Context" + "'", str14, "Hi!Context");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Python3" + "'", str16, "Python3");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", false);
        java.util.Set<java.lang.String> strSet11 = python3Target0.badWords;
        java.lang.String str13 = python3Target0.getTargetStringLiteralFromString("12");
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.stringtemplate.v4.ST sT15 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar14, sT15, "\"\\\"\\\"hi!\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"12\"" + "'", str13, "\"12\"");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "";
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean4 = python3Target3.supportsOverloadedMethods();
        java.lang.String str5 = python3Target3.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target3.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python3Target3.gen = codeGenerator10;
        java.lang.String[] strArray19 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        python3Target3.badWords = strSet20;
        python3Target0.badWords = strSet20;
        java.lang.String str25 = python3Target0.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str27 = python3Target0.getTargetStringLiteralFromString("12");
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup28 = python3Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"" + "'", str9, "\"\"");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"12\"" + "'", str27, "\"12\"");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        int int9 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Rule rule10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target0.getRuleFunctionContextStructName(rule10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray2 = python3Target1.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup3 = python3Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "\"\\12\"", false);
        java.lang.String str8 = python3Target1.getLanguage();
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("Hi!Context");
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("\"\"\\0\"\"", true);
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = pythonStringRenderer0.toString((java.lang.Object) true, "\\35", locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNull(sTGroup3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "12" + "'", str7, "12");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Hi!Context\"" + "'", str10, "\"Hi!Context\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\"\"\\0\"\"\"" + "'", str13, "\"\"\"\\0\"\"\"");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python3Target0.templates = sTGroup9;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target0.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup12 = python3Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\"\"" + "'", str8, "\"\"\"\"");
        org.junit.Assert.assertNull(codeGenerator11);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str5 = python3Target3.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean7 = python3Target6.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet8 = python3Target6.badWords;
        python3Target3.badWords = strSet8;
        python3Target1.badWords = strSet8;
        java.util.Set<java.lang.String> strSet11 = python3Target1.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target14 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean15 = python3Target14.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup16 = python3Target14.templates;
        org.antlr.v4.tool.Grammar grammar17 = null;
        org.stringtemplate.v4.ST sT18 = null;
        python3Target14.genRecognizerHeaderFile(grammar17, sT18, "");
        python3Target14.language = "Python3";
        java.util.Set<java.lang.String> strSet23 = null;
        python3Target14.badWords = strSet23;
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        java.lang.String str28 = python3Target14.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator25, "\"Hi!Context\"", false);
        java.lang.String str30 = python3Target14.getListLabel("Python3");
        java.lang.String str32 = python3Target14.getTargetStringLiteralFromString("\\0");
        org.antlr.v4.tool.Grammar grammar33 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target34 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str36 = python3Target34.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar37 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target38 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean39 = python3Target38.supportsOverloadedMethods();
        java.lang.String str40 = python3Target38.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator41 = null;
        java.lang.String str44 = python3Target38.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator41, "", true);
        java.lang.String str45 = python3Target38.getVersion();
        org.antlr.v4.tool.Grammar grammar46 = null;
        int[] intArray47 = new int[] {};
        java.lang.String[] strArray48 = python3Target38.getTokenTypesAsTargetLabels(grammar46, intArray47);
        java.lang.String[] strArray49 = python3Target34.getTokenTypesAsTargetLabels(grammar37, intArray47);
        java.lang.String[] strArray50 = python3Target14.getTokenTypesAsTargetLabels(grammar33, intArray47);
        java.lang.String[] strArray51 = python3Target1.getTokenTypesAsTargetLabels(grammar13, intArray47);
        org.antlr.v4.tool.ast.GrammarAST grammarAST52 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str53 = python3Target1.getLoopCounter(grammarAST52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"\"\"\"\"" + "'", str5, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(sTGroup16);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Hi!Context" + "'", str28, "Hi!Context");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Python3" + "'", str30, "Python3");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\\0\"" + "'", str32, "\"\\0\"");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\"\"\"\"\"\"" + "'", str36, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "4.5.2.1" + "'", str40, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\"\"" + "'", str44, "\"\"");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "4.5.2.1" + "'", str45, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[]");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(strArray51);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        python3Target0.language = "Python3";
        int int9 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str11 = python3Target0.getListLabel("_tsetPython3");
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target0.loadTemplates();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target0.getRuleFunctionContextStructName(ruleFunction13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tsetPython3" + "'", str11, "_tsetPython3");
        org.junit.Assert.assertNotNull(sTGroup12);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        java.lang.String[] strArray16 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        python3Target0.badWords = strSet17;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python3Target0.gen;
        java.lang.String str23 = python3Target0.getTargetStringLiteralFromString("\\12", true);
        boolean boolean24 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = python3Target0.getTokenTypeAsTargetLabel(grammar25, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(codeGenerator20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"\\12\"" + "'", str23, "\"\\12\"");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        java.lang.String[] strArray16 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        python3Target0.badWords = strSet17;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python3Target0.gen;
        java.lang.String str21 = python3Target0.getVersion();
        int int22 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str23 = python3Target0.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = python3Target0.getElementListName("_tset12");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(codeGenerator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4.5.2.1" + "'", str21, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 29 + "'", int22 == 29);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", false);
        java.util.Set<java.lang.String> strSet11 = python3Target0.badWords;
        java.lang.String str13 = python3Target0.getTargetStringLiteralFromString("12");
        int int14 = python3Target0.getSerializedATNSegmentLimit();
        boolean boolean15 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target0.getRuleFunctionContextStructName(ruleFunction16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"12\"" + "'", str13, "\"12\"");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\\35");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\35" + "'", str1, "\\35");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean2 = python3Target1.supportsOverloadedMethods();
        java.lang.String str3 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target1.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup5 = null;
        python3Target1.templates = sTGroup5;
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.templates;
        java.util.Locale locale9 = null;
        java.lang.String str10 = pythonStringRenderer0.toString((java.lang.Object) sTGroup7, "Hi!Context", locale9);
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean12 = python3Target11.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target11.templates;
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.stringtemplate.v4.ST sT15 = null;
        python3Target11.genRecognizerHeaderFile(grammar14, sT15, "");
        python3Target11.language = "Python3";
        java.util.Set<java.lang.String> strSet20 = null;
        python3Target11.badWords = strSet20;
        boolean boolean22 = python3Target11.wantsBaseVisitor();
        java.lang.String str24 = python3Target11.getImplicitSetLabel("Python3");
        java.util.Locale locale26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = pythonStringRenderer0.toString((java.lang.Object) python3Target11, "d", locale26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python3Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertNull(sTGroup7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!Context" + "'", str10, "Hi!Context");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(sTGroup13);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "_tsetPython3" + "'", str24, "_tsetPython3");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = python3Target0.getRuleFunctionContextStructName(ruleFunction2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        java.lang.String str4 = python3Target0.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\12" + "'", str4, "\\12");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\\1\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\1\"" + "'", str1, "\"\\1\"");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "";
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean4 = python3Target3.supportsOverloadedMethods();
        java.lang.String str5 = python3Target3.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target3.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python3Target3.gen = codeGenerator10;
        java.lang.String[] strArray19 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        python3Target3.badWords = strSet20;
        python3Target0.badWords = strSet20;
        org.stringtemplate.v4.STGroup sTGroup24 = python3Target0.templates;
        org.antlr.v4.tool.ast.GrammarAST grammarAST25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"" + "'", str9, "\"\"");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(sTGroup24);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "\"\"\"\"\"\"", locale3);
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray6 = python3Target5.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target5.templates;
        java.util.Locale locale9 = null;
        java.lang.String str10 = pythonStringRenderer0.toString((java.lang.Object) sTGroup7, "\"Hi!Context\"", locale9);
        java.util.Locale locale13 = null;
        java.lang.String str14 = pythonStringRenderer0.toString((java.lang.Object) "\"\"\"\"\"\"\"\"", "4.5.2.1", locale13);
        org.antlr.v4.codegen.target.Python3Target python3Target15 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean16 = python3Target15.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup17 = python3Target15.templates;
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!" };
        python3Target15.targetCharValueEscape = strArray20;
        java.lang.String str23 = python3Target15.getTargetStringLiteralFromString("\"\"");
        java.lang.String str24 = python3Target15.getLanguage();
        org.antlr.v4.codegen.target.Python3Target python3Target25 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray26 = python3Target25.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup27 = python3Target25.templates;
        int int28 = python3Target25.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator29 = python3Target25.gen;
        org.antlr.v4.tool.Grammar grammar30 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target31 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str33 = python3Target31.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar34 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target35 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean36 = python3Target35.supportsOverloadedMethods();
        java.lang.String str37 = python3Target35.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator38 = null;
        java.lang.String str41 = python3Target35.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator38, "", true);
        java.lang.String str42 = python3Target35.getVersion();
        org.antlr.v4.tool.Grammar grammar43 = null;
        int[] intArray44 = new int[] {};
        java.lang.String[] strArray45 = python3Target35.getTokenTypesAsTargetLabels(grammar43, intArray44);
        java.lang.String[] strArray46 = python3Target31.getTokenTypesAsTargetLabels(grammar34, intArray44);
        java.lang.String[] strArray47 = python3Target25.getTokenTypesAsTargetLabels(grammar30, intArray44);
        python3Target15.targetCharValueEscape = strArray47;
        java.util.Locale locale50 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str51 = pythonStringRenderer0.toString((java.lang.Object) strArray47, "Python3", locale50);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [Ljava.lang.String; cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"\"\"\"\"" + "'", str4, "\"\"\"\"\"\"");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(sTGroup7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Hi!Context\"" + "'", str10, "\"Hi!Context\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(sTGroup17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"\"\"\"" + "'", str23, "\"\"\"\"");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNull(sTGroup27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 64 + "'", int28 == 64);
        org.junit.Assert.assertNull(codeGenerator29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"\"\"\"\"\"" + "'", str33, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "4.5.2.1" + "'", str37, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\"\"" + "'", str41, "\"\"");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "4.5.2.1" + "'", str42, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[]");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        java.lang.String str7 = python3Target0.getVersion();
        boolean boolean8 = python3Target0.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target0.getImplicitRuleLabel("\\\"4.5.2.1\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray9 = python3Target8.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        int int11 = python3Target8.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target8.gen;
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target14 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str16 = python3Target14.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar17 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target18 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean19 = python3Target18.supportsOverloadedMethods();
        java.lang.String str20 = python3Target18.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        java.lang.String str24 = python3Target18.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator21, "", true);
        java.lang.String str25 = python3Target18.getVersion();
        org.antlr.v4.tool.Grammar grammar26 = null;
        int[] intArray27 = new int[] {};
        java.lang.String[] strArray28 = python3Target18.getTokenTypesAsTargetLabels(grammar26, intArray27);
        java.lang.String[] strArray29 = python3Target14.getTokenTypesAsTargetLabels(grammar17, intArray27);
        java.lang.String[] strArray30 = python3Target8.getTokenTypesAsTargetLabels(grammar13, intArray27);
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray30;
        python3Target0.targetCharValueEscape = strArray30;
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = python3Target0.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = python3Target0.getLoopCounter(grammarAST34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(sTGroup10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"\"\"\"\"" + "'", str16, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4.5.2.1" + "'", str20, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"\"" + "'", str24, "\"\"");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4.5.2.1" + "'", str25, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNull(codeGenerator33);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        java.lang.String str7 = python3Target0.getVersion();
        boolean boolean8 = python3Target0.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup9 = python3Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        java.lang.String str7 = python3Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar8 = null;
        int[] intArray9 = new int[] {};
        java.lang.String[] strArray10 = python3Target0.getTokenTypesAsTargetLabels(grammar8, intArray9);
        java.lang.String[] strArray11 = python3Target0.targetCharValueEscape;
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getAltLabelContextStructName("d");
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.getTemplates();
        java.lang.String str8 = python3Target1.getLanguage();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DContext" + "'", str4, "DContext");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python3" + "'", str8, "Python3");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.Class<?> wildcardClass2 = python3Target0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        java.lang.String str3 = python3Target1.language;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python3Target1.getElementName("_\"\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python3" + "'", str3, "Python3");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        python3Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target4 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator3);
        java.lang.String str6 = python3Target4.getTargetStringLiteralFromString("");
        int int7 = python3Target4.getSerializedATNSegmentLimit();
        boolean boolean8 = python3Target4.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target4.loadTemplates();
        python3Target0.templates = sTGroup9;
        boolean boolean11 = python3Target0.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target0.getImplicitTokenLabel("\\12");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"");
        boolean boolean11 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.stringtemplate.v4.ST sT13 = null;
        python3Target0.genRecognizerHeaderFile(grammar12, sT13, "");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target0.getRuleFunctionContextStructName(ruleFunction16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\"\"" + "'", str8, "\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"\"\"" + "'", str10, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        boolean boolean6 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        python3Target1.language = "";
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python3Target1.gen = codeGenerator6;
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getLoopCounter(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target2 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator1);
        java.lang.String str3 = python3Target2.getLanguage();
        java.lang.String str5 = python3Target2.getImplicitSetLabel("Python3");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target7 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator6);
        java.util.Set<java.lang.String> strSet8 = python3Target7.getBadWords();
        python3Target2.badWords = strSet8;
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = pythonStringRenderer0.toString((java.lang.Object) strSet8, "\"\"\"\"\"\"\"\"", locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.HashSet cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python3" + "'", str3, "Python3");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_tsetPython3" + "'", str5, "_tsetPython3");
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        python3Target0.language = "Python3";
        int int9 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target0.gen;
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getLoopCounter(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
        org.junit.Assert.assertNull(codeGenerator10);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getAltLabelContextStructName("d");
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getRuleFunctionContextStructName(ruleFunction8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DContext" + "'", str4, "DContext");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\"\\\"\"" + "'", str6, "\"\\\"\\\"\"");
        org.junit.Assert.assertNull(codeGenerator7);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        int int3 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.stringtemplate.v4.ST sT6 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar5, sT6, "\"4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertNull(codeGenerator4);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        int int3 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str8 = python3Target6.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean11 = python3Target10.supportsOverloadedMethods();
        java.lang.String str12 = python3Target10.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python3Target10.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "", true);
        java.lang.String str17 = python3Target10.getVersion();
        org.antlr.v4.tool.Grammar grammar18 = null;
        int[] intArray19 = new int[] {};
        java.lang.String[] strArray20 = python3Target10.getTokenTypesAsTargetLabels(grammar18, intArray19);
        java.lang.String[] strArray21 = python3Target6.getTokenTypesAsTargetLabels(grammar9, intArray19);
        java.lang.String[] strArray22 = python3Target0.getTokenTypesAsTargetLabels(grammar5, intArray19);
        java.lang.String[] strArray23 = python3Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = python3Target0.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = python3Target0.getAltLabelContextStructName("\"\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\"\"\"\"" + "'", str8, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"" + "'", str16, "\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNull(codeGenerator24);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "\"\"\"\"\"\"", locale3);
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray6 = python3Target5.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target5.templates;
        java.util.Locale locale9 = null;
        java.lang.String str10 = pythonStringRenderer0.toString((java.lang.Object) sTGroup7, "\"Hi!Context\"", locale9);
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean12 = python3Target11.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet13 = python3Target11.badWords;
        boolean boolean14 = python3Target11.templatesExist();
        java.lang.String str15 = python3Target11.getLanguage();
        java.util.Locale locale17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = pythonStringRenderer0.toString((java.lang.Object) python3Target11, "\\1", locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python3Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"\"\"\"\"" + "'", str4, "\"\"\"\"\"\"");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(sTGroup7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Hi!Context\"" + "'", str10, "\"Hi!Context\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\"\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\"\"\"\"\"" + "'", str1, "\"\"\"\"\"\"");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "\"\"\"\"\"\"", locale3);
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray6 = python3Target5.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target5.templates;
        java.util.Locale locale9 = null;
        java.lang.String str10 = pythonStringRenderer0.toString((java.lang.Object) sTGroup7, "\"Hi!Context\"", locale9);
        java.util.Locale locale13 = null;
        java.lang.String str14 = pythonStringRenderer0.toString((java.lang.Object) "\"\"\"\"\"\"\"\"", "4.5.2.1", locale13);
        org.antlr.v4.codegen.target.Python3Target python3Target15 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean16 = python3Target15.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup17 = python3Target15.templates;
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!" };
        python3Target15.targetCharValueEscape = strArray20;
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        java.lang.String str25 = python3Target15.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator22, "", false);
        java.util.Set<java.lang.String> strSet26 = python3Target15.badWords;
        java.lang.String str28 = python3Target15.getTargetStringLiteralFromString("12");
        int int29 = python3Target15.getSerializedATNSegmentLimit();
        java.util.Locale locale31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = pythonStringRenderer0.toString((java.lang.Object) int29, "\"_tset12\"", locale31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"\"\"\"\"" + "'", str4, "\"\"\"\"\"\"");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(sTGroup7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Hi!Context\"" + "'", str10, "\"Hi!Context\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(sTGroup17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"12\"" + "'", str28, "\"12\"");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 29 + "'", int29 == 29);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        python3Target0.language = "Python3";
        int int9 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target0.getTokenTypeAsTargetLabel(grammar11, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
        org.junit.Assert.assertNull(codeGenerator10);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        python3Target0.language = "Python3";
        int int9 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str11 = python3Target0.getListLabel("_tsetPython3");
        boolean boolean12 = python3Target0.wantsBaseVisitor();
        python3Target0.addBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target0.getElementListName("\"\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tsetPython3" + "'", str11, "_tsetPython3");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar7, sT8, "_\"\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "\"\"\"\"\"\"", locale3);
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = pythonStringRenderer0.toString((java.lang.Object) 10.0f, "\\0", locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Float cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"\"\"\"\"" + "'", str4, "\"\"\"\"\"\"");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getLanguage();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("Python3");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "\"\"\"\"", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getLoopLabel(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Python3" + "'", str2, "Python3");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tsetPython3" + "'", str4, "_tsetPython3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"\\\"\"" + "'", str8, "\"\\\"\\\"\"");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.util.Set<java.lang.String> strSet5 = python3Target0.badWords;
        python3Target0.language = "\"hi!\"";
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", false);
        int int11 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str12 = python3Target0.getVersion();
        boolean boolean13 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python3Target0.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup15 = python3Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29 + "'", int11 == 29);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(codeGenerator14);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "";
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean4 = python3Target3.supportsOverloadedMethods();
        java.lang.String str5 = python3Target3.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target3.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python3Target3.gen = codeGenerator10;
        java.lang.String[] strArray19 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        python3Target3.badWords = strSet20;
        python3Target0.badWords = strSet20;
        java.lang.String str25 = python3Target0.encodeIntAsCharEscape((int) (byte) 100);
        org.antlr.v4.tool.Rule rule26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = python3Target0.getRuleFunctionContextStructName(rule26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"" + "'", str9, "\"\"");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        python3Target0.addBadWords();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python3Target0.getRuleFunctionContextStructName(ruleFunction3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\"\"\"\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\"\"\"\"\"\"\"" + "'", str1, "\"\"\"\"\"\"\"\"");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python3Target0.getLoopLabel(grammarAST3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python3Target1.getElementListName("_tset12");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        int int3 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str8 = python3Target6.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean11 = python3Target10.supportsOverloadedMethods();
        java.lang.String str12 = python3Target10.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python3Target10.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "", true);
        java.lang.String str17 = python3Target10.getVersion();
        org.antlr.v4.tool.Grammar grammar18 = null;
        int[] intArray19 = new int[] {};
        java.lang.String[] strArray20 = python3Target10.getTokenTypesAsTargetLabels(grammar18, intArray19);
        java.lang.String[] strArray21 = python3Target6.getTokenTypesAsTargetLabels(grammar9, intArray19);
        java.lang.String[] strArray22 = python3Target0.getTokenTypesAsTargetLabels(grammar5, intArray19);
        java.lang.String[] strArray23 = python3Target0.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = python3Target0.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = python3Target0.getImplicitTokenLabel("Python3");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\"\"\"\"" + "'", str8, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"" + "'", str16, "\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNull(codeGenerator24);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", false);
        int int11 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str12 = python3Target0.getVersion();
        boolean boolean13 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.target.Python3Target python3Target14 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean15 = python3Target14.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup16 = python3Target14.templates;
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "hi!" };
        python3Target14.targetCharValueEscape = strArray19;
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray22;
        python3Target14.targetCharValueEscape = strArray22;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray22;
        python3Target0.targetCharValueEscape = strArray22;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray22;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29 + "'", int11 == 29);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(sTGroup16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray8;
        python3Target0.targetCharValueEscape = strArray8;
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str14 = python3Target12.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        python3Target12.gen = codeGenerator15;
        org.antlr.v4.tool.Grammar grammar17 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target18 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str20 = python3Target18.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar21 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target22 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean23 = python3Target22.supportsOverloadedMethods();
        java.lang.String str24 = python3Target22.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        java.lang.String str28 = python3Target22.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator25, "", true);
        java.lang.String str29 = python3Target22.getVersion();
        org.antlr.v4.tool.Grammar grammar30 = null;
        int[] intArray31 = new int[] {};
        java.lang.String[] strArray32 = python3Target22.getTokenTypesAsTargetLabels(grammar30, intArray31);
        java.lang.String[] strArray33 = python3Target18.getTokenTypesAsTargetLabels(grammar21, intArray31);
        java.lang.String[] strArray34 = python3Target12.getTokenTypesAsTargetLabels(grammar17, intArray31);
        java.lang.String[] strArray35 = python3Target0.getTokenTypesAsTargetLabels(grammar11, intArray31);
        org.antlr.v4.codegen.CodeGenerator codeGenerator36 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target37 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator36);
        java.util.Set<java.lang.String> strSet38 = python3Target37.getBadWords();
        java.lang.String str40 = python3Target37.getAltLabelContextStructName("d");
        java.lang.String str42 = python3Target37.getTargetStringLiteralFromString("\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator43 = python3Target37.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar44 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator45 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target46 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator45);
        java.util.Set<java.lang.String> strSet47 = python3Target46.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator48 = null;
        python3Target46.gen = codeGenerator48;
        java.lang.String str51 = python3Target46.getAltLabelContextStructName("hi!");
        java.lang.String str54 = python3Target46.getTargetStringLiteralFromString("\"hi!\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator55 = null;
        python3Target46.gen = codeGenerator55;
        org.antlr.v4.tool.Grammar grammar57 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target58 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray59 = python3Target58.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup60 = python3Target58.templates;
        int int61 = python3Target58.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator62 = python3Target58.gen;
        org.antlr.v4.tool.Grammar grammar63 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target64 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str66 = python3Target64.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar67 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target68 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean69 = python3Target68.supportsOverloadedMethods();
        java.lang.String str70 = python3Target68.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator71 = null;
        java.lang.String str74 = python3Target68.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator71, "", true);
        java.lang.String str75 = python3Target68.getVersion();
        org.antlr.v4.tool.Grammar grammar76 = null;
        int[] intArray77 = new int[] {};
        java.lang.String[] strArray78 = python3Target68.getTokenTypesAsTargetLabels(grammar76, intArray77);
        java.lang.String[] strArray79 = python3Target64.getTokenTypesAsTargetLabels(grammar67, intArray77);
        java.lang.String[] strArray80 = python3Target58.getTokenTypesAsTargetLabels(grammar63, intArray77);
        java.lang.String[] strArray81 = python3Target46.getTokenTypesAsTargetLabels(grammar57, intArray77);
        java.lang.String[] strArray82 = python3Target37.getTokenTypesAsTargetLabels(grammar44, intArray77);
        python3Target0.targetCharValueEscape = strArray82;
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup84 = python3Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"\"\"\"\"" + "'", str14, "\"\"\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\"\"\"\"\"" + "'", str20, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4.5.2.1" + "'", str24, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"\"" + "'", str28, "\"\"");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "4.5.2.1" + "'", str29, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[]");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "DContext" + "'", str40, "DContext");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\"\\\"\\\"\"" + "'", str42, "\"\\\"\\\"\"");
        org.junit.Assert.assertNull(codeGenerator43);
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Hi!Context" + "'", str51, "Hi!Context");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str54, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNull(sTGroup60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 64 + "'", int61 == 64);
        org.junit.Assert.assertNull(codeGenerator62);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "\"\"\"\"\"\"" + "'", str66, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "4.5.2.1" + "'", str70, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "\"\"" + "'", str74, "\"\"");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "4.5.2.1" + "'", str75, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[]");
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertNotNull(strArray82);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        python3Target0.gen = codeGenerator4;
        java.lang.Class<?> wildcardClass6 = python3Target0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        python3Target0.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target4 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator3);
        java.lang.String str6 = python3Target4.getTargetStringLiteralFromString("");
        int int7 = python3Target4.getSerializedATNSegmentLimit();
        boolean boolean8 = python3Target4.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target4.loadTemplates();
        python3Target0.templates = sTGroup9;
        boolean boolean11 = python3Target0.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target0.getElementName("\"\"\"\\0\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str5 = python3Target3.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python3Target3.gen = codeGenerator6;
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator8);
        java.util.Set<java.lang.String> strSet10 = python3Target9.getBadWords();
        python3Target3.badWords = strSet10;
        python3Target0.badWords = strSet10;
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup13 = python3Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"\"\"\"\"" + "'", str5, "\"\"\"\"\"\"");
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", false);
        java.util.Set<java.lang.String> strSet11 = python3Target0.badWords;
        java.lang.String str13 = python3Target0.getTargetStringLiteralFromString("12");
        int int14 = python3Target0.getSerializedATNSegmentLimit();
        boolean boolean15 = python3Target0.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target0.getImplicitRuleLabel("\"\\1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"12\"" + "'", str13, "\"12\"");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.gen;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean9 = python3Target8.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python3Target8.genRecognizerHeaderFile(grammar11, sT12, "");
        python3Target8.language = "Python3";
        int int17 = python3Target8.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup18 = python3Target8.loadTemplates();
        python3Target1.templates = sTGroup18;
        org.antlr.v4.tool.Grammar grammar20 = null;
        org.stringtemplate.v4.ST sT21 = null;
        python3Target1.genRecognizerHeaderFile(grammar20, sT21, "\"_tset12\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = python3Target1.getLoopLabel(grammarAST24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(sTGroup10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 29 + "'", int17 == 29);
        org.junit.Assert.assertNotNull(sTGroup18);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = null;
        python3Target0.templates = sTGroup4;
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target0.genRecognizerHeaderFile(grammar7, sT8, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getAltLabelContextStructName("\"\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(sTGroup6);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\\\"\\\"hi!\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\"hi!\\\"\\\"\"" + "'", str1, "\"\\\"\\\"hi!\\\"\\\"\"");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        java.lang.String str7 = python3Target0.getVersion();
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean9 = python3Target8.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        python3Target8.targetCharValueEscape = strArray13;
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray16;
        python3Target8.targetCharValueEscape = strArray16;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray16;
        python3Target0.targetCharValueEscape = strArray16;
        java.lang.Class<?> wildcardClass21 = python3Target0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(sTGroup10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        boolean boolean7 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        boolean boolean7 = python3Target0.supportsOverloadedMethods();
        python3Target0.language = "\"\\12\"";
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator11);
        java.util.Set<java.lang.String> strSet13 = python3Target12.getBadWords();
        java.lang.String str15 = python3Target12.getAltLabelContextStructName("d");
        java.lang.String str17 = python3Target12.getTargetStringLiteralFromString("\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python3Target12.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target21 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator20);
        java.util.Set<java.lang.String> strSet22 = python3Target21.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        python3Target21.gen = codeGenerator23;
        java.lang.String str26 = python3Target21.getAltLabelContextStructName("hi!");
        java.lang.String str29 = python3Target21.getTargetStringLiteralFromString("\"hi!\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator30 = null;
        python3Target21.gen = codeGenerator30;
        org.antlr.v4.tool.Grammar grammar32 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target33 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray34 = python3Target33.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup35 = python3Target33.templates;
        int int36 = python3Target33.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator37 = python3Target33.gen;
        org.antlr.v4.tool.Grammar grammar38 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target39 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str41 = python3Target39.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar42 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target43 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean44 = python3Target43.supportsOverloadedMethods();
        java.lang.String str45 = python3Target43.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator46 = null;
        java.lang.String str49 = python3Target43.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator46, "", true);
        java.lang.String str50 = python3Target43.getVersion();
        org.antlr.v4.tool.Grammar grammar51 = null;
        int[] intArray52 = new int[] {};
        java.lang.String[] strArray53 = python3Target43.getTokenTypesAsTargetLabels(grammar51, intArray52);
        java.lang.String[] strArray54 = python3Target39.getTokenTypesAsTargetLabels(grammar42, intArray52);
        java.lang.String[] strArray55 = python3Target33.getTokenTypesAsTargetLabels(grammar38, intArray52);
        java.lang.String[] strArray56 = python3Target21.getTokenTypesAsTargetLabels(grammar32, intArray52);
        java.lang.String[] strArray57 = python3Target12.getTokenTypesAsTargetLabels(grammar19, intArray52);
        java.lang.String[] strArray58 = python3Target0.getTokenTypesAsTargetLabels(grammar10, intArray52);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str60 = python3Target0.getListLabel("\"_tset12\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DContext" + "'", str15, "DContext");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\\\"\\\"\"" + "'", str17, "\"\\\"\\\"\"");
        org.junit.Assert.assertNull(codeGenerator18);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hi!Context" + "'", str26, "Hi!Context");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str29, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNull(sTGroup35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 64 + "'", int36 == 64);
        org.junit.Assert.assertNull(codeGenerator37);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\"\"\"\"\"\"" + "'", str41, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "4.5.2.1" + "'", str45, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\"\"" + "'", str49, "\"\"");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "4.5.2.1" + "'", str50, "4.5.2.1");
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
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"");
        boolean boolean11 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.stringtemplate.v4.ST sT13 = null;
        python3Target0.genRecognizerHeaderFile(grammar12, sT13, "");
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.stringtemplate.v4.ST sT17 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar16, sT17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\"\"" + "'", str8, "\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"\"\"" + "'", str10, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        python3Target0.gen = codeGenerator4;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target7 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator6);
        java.util.Set<java.lang.String> strSet8 = python3Target7.getBadWords();
        java.lang.String str10 = python3Target7.getAltLabelContextStructName("d");
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target7.getTemplates();
        python3Target0.templates = sTGroup11;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target0.gen;
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target0.getLoopLabel(grammarAST14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DContext" + "'", str10, "DContext");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNull(codeGenerator13);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target4 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean5 = python3Target4.supportsOverloadedMethods();
        java.lang.String str6 = python3Target4.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target4.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        java.lang.String str11 = python3Target4.getVersion();
        org.antlr.v4.tool.Grammar grammar12 = null;
        int[] intArray13 = new int[] {};
        java.lang.String[] strArray14 = python3Target4.getTokenTypesAsTargetLabels(grammar12, intArray13);
        java.lang.String[] strArray15 = python3Target0.getTokenTypesAsTargetLabels(grammar3, intArray13);
        org.stringtemplate.v4.STGroup sTGroup16 = python3Target0.templates;
        java.lang.String str17 = python3Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.stringtemplate.v4.ST sT19 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar18, sT19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"\"\"" + "'", str2, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNull(sTGroup16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.gen;
        java.lang.String str9 = python3Target1.encodeIntAsCharEscape(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getImplicitTokenLabel("\\1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\0" + "'", str9, "\\0");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", false);
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str14 = python3Target12.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target16 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean17 = python3Target16.supportsOverloadedMethods();
        java.lang.String str18 = python3Target16.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        java.lang.String str22 = python3Target16.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator19, "", true);
        java.lang.String str23 = python3Target16.getVersion();
        org.antlr.v4.tool.Grammar grammar24 = null;
        int[] intArray25 = new int[] {};
        java.lang.String[] strArray26 = python3Target16.getTokenTypesAsTargetLabels(grammar24, intArray25);
        java.lang.String[] strArray27 = python3Target12.getTokenTypesAsTargetLabels(grammar15, intArray25);
        java.lang.String[] strArray28 = python3Target0.getTokenTypesAsTargetLabels(grammar11, intArray25);
        java.lang.Class<?> wildcardClass29 = strArray28.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"\"\"\"\"" + "'", str14, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"\"" + "'", str22, "\"\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "4.5.2.1" + "'", str23, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet2 = python3Target0.badWords;
        boolean boolean3 = python3Target0.templatesExist();
        python3Target0.language = "_tset\"\\0\"";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        java.lang.String[] strArray16 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        python3Target0.badWords = strSet17;
        org.antlr.v4.tool.Grammar grammar20 = null;
        org.stringtemplate.v4.ST sT21 = null;
        python3Target0.genRecognizerHeaderFile(grammar20, sT21, "\"\"");
        java.lang.String str25 = python3Target0.encodeIntAsCharEscape((int) (byte) 10);
        java.lang.String str26 = python3Target0.language;
        java.util.Set<java.lang.String> strSet27 = python3Target0.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup28 = python3Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\\12" + "'", str25, "\\12");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(strSet27);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "";
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean4 = python3Target3.supportsOverloadedMethods();
        java.lang.String str5 = python3Target3.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target3.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python3Target3.gen = codeGenerator10;
        java.lang.String[] strArray19 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        python3Target3.badWords = strSet20;
        python3Target0.badWords = strSet20;
        java.lang.String str25 = python3Target0.encodeIntAsCharEscape((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup26 = python3Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"" + "'", str9, "\"\"");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = null;
        python3Target0.templates = sTGroup4;
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.templates;
        java.lang.String[] strArray7 = python3Target0.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet8 = python3Target0.badWords;
        java.util.Set<java.lang.String> strSet9 = python3Target0.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target0.getElementListName("\"\\\"\\\"hi!\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(sTGroup6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "";
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean4 = python3Target3.supportsOverloadedMethods();
        java.lang.String str5 = python3Target3.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target3.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python3Target3.gen = codeGenerator10;
        java.lang.String[] strArray19 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        python3Target3.badWords = strSet20;
        python3Target0.badWords = strSet20;
        java.lang.String str25 = python3Target0.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str26 = python3Target0.getLanguage();
        java.lang.String[] strArray27 = new java.lang.String[] {};
        python3Target0.targetCharValueEscape = strArray27;
        java.lang.String str31 = python3Target0.getTargetStringLiteralFromString("", true);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = python3Target0.getRuleFunctionContextStructName(ruleFunction32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"" + "'", str9, "\"\"");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\"\"" + "'", str31, "\"\"");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        java.lang.String str6 = python3Target1.getVersion();
        java.lang.String str8 = python3Target1.encodeIntAsCharEscape(29);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = python3Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\35" + "'", str8, "\\35");
        org.junit.Assert.assertNull(codeGenerator9);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python3Target0.gen = codeGenerator3;
        java.lang.String str5 = python3Target0.getVersion();
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean7 = python3Target6.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target6.templates;
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        python3Target6.genRecognizerHeaderFile(grammar9, sT10, "");
        python3Target6.language = "Python3";
        int int15 = python3Target6.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup16 = python3Target6.loadTemplates();
        python3Target0.templates = sTGroup16;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target0.getElementListName("\"4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"\"\"" + "'", str2, "\"\"\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(sTGroup8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
        org.junit.Assert.assertNotNull(sTGroup16);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python3Target0.templates = sTGroup9;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target0.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target0.getLoopLabel(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\"\"" + "'", str8, "\"\"\"\"");
        org.junit.Assert.assertNull(codeGenerator11);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        org.antlr.v4.codegen.target.Python3Target python3Target7 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray8 = python3Target7.targetCharValueEscape;
        python3Target0.targetCharValueEscape = strArray8;
        python3Target0.addBadWords();
        java.lang.String[] strArray11 = python3Target0.targetCharValueEscape;
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup12 = python3Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        python3Target0.language = "\"hi!\"";
        org.antlr.v4.codegen.model.RuleFunction ruleFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getRuleFunctionContextStructName(ruleFunction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\"\"" + "'", str8, "\"\"\"\"");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        java.lang.String str7 = python3Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar8, sT9, "_tset12");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.stringtemplate.v4.ST sT13 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar12, sT13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(codeGenerator11);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray8;
        python3Target0.targetCharValueEscape = strArray8;
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getLoopCounter(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "\"\\12\"", false);
        int int7 = python3Target0.getSerializedATNSegmentLimit();
        boolean boolean8 = python3Target0.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target0.getElementListName("\\1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "12" + "'", str6, "12");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        java.lang.String[] strArray16 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        python3Target0.badWords = strSet17;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python3Target0.gen;
        java.lang.String str21 = python3Target0.getVersion();
        int int22 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.target.Python3Target python3Target23 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray24 = python3Target23.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup25 = python3Target23.templates;
        int int26 = python3Target23.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = python3Target23.gen;
        org.antlr.v4.tool.Grammar grammar28 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target29 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str31 = python3Target29.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar32 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target33 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean34 = python3Target33.supportsOverloadedMethods();
        java.lang.String str35 = python3Target33.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator36 = null;
        java.lang.String str39 = python3Target33.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator36, "", true);
        java.lang.String str40 = python3Target33.getVersion();
        org.antlr.v4.tool.Grammar grammar41 = null;
        int[] intArray42 = new int[] {};
        java.lang.String[] strArray43 = python3Target33.getTokenTypesAsTargetLabels(grammar41, intArray42);
        java.lang.String[] strArray44 = python3Target29.getTokenTypesAsTargetLabels(grammar32, intArray42);
        java.lang.String[] strArray45 = python3Target23.getTokenTypesAsTargetLabels(grammar28, intArray42);
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray45;
        python3Target0.targetCharValueEscape = strArray45;
        org.antlr.v4.tool.Grammar grammar48 = null;
        org.stringtemplate.v4.ST sT49 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar48, sT49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(codeGenerator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4.5.2.1" + "'", str21, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 29 + "'", int22 == 29);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNull(sTGroup25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 64 + "'", int26 == 64);
        org.junit.Assert.assertNull(codeGenerator27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\"\"\"\"\"\"" + "'", str31, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "4.5.2.1" + "'", str35, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\"\"" + "'", str39, "\"\"");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "4.5.2.1" + "'", str40, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[]");
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strArray45);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "\"\"\"\"\"\"", locale3);
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean6 = python3Target5.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target5.templates;
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!" };
        python3Target5.targetCharValueEscape = strArray10;
        java.lang.String str13 = python3Target5.getTargetStringLiteralFromString("\"\"");
        java.lang.String str15 = python3Target5.getTargetStringLiteralFromString("\"\"");
        boolean boolean16 = python3Target5.wantsBaseVisitor();
        java.util.Locale locale18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = pythonStringRenderer0.toString((java.lang.Object) boolean16, "\\12", locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Boolean cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"\"\"\"\"" + "'", str4, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(sTGroup7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\"\"\"" + "'", str13, "\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\"\"\"" + "'", str15, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        int int3 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\"Python3\"", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\"Python3\\\"\"" + "'", str6, "\"\\\"Python3\\\"\"");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        java.lang.String str7 = python3Target0.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup8 = python3Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python3Target0.templates = sTGroup9;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getImplicitRuleLabel("\"\\1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\"\"" + "'", str8, "\"\"\"\"");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.tool.Rule rule3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python3Target0.getRuleFunctionContextStructName(rule3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        java.lang.String[] strArray16 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        python3Target0.badWords = strSet17;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python3Target0.gen;
        java.lang.String str21 = python3Target0.getVersion();
        int int22 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = python3Target0.getTokenTypeAsTargetLabel(grammar23, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(codeGenerator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4.5.2.1" + "'", str21, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 29 + "'", int22 == 29);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "";
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean4 = python3Target3.supportsOverloadedMethods();
        java.lang.String str5 = python3Target3.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target3.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python3Target3.gen = codeGenerator10;
        java.lang.String[] strArray19 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        python3Target3.badWords = strSet20;
        python3Target0.badWords = strSet20;
        java.lang.String str25 = python3Target0.encodeIntAsCharEscape((int) (byte) 100);
        org.antlr.v4.tool.Grammar grammar26 = null;
        org.stringtemplate.v4.ST sT27 = null;
        python3Target0.genRecognizerHeaderFile(grammar26, sT27, "");
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup30 = python3Target0.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"" + "'", str9, "\"\"");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\\\"DContext\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"DContext\\\"\"" + "'", str1, "\"\\\"DContext\\\"\"");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        java.lang.String str4 = python3Target0.getTargetStringLiteralFromString("12");
        boolean boolean5 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target0.getRuleFunctionContextStructName(ruleFunction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"12\"" + "'", str4, "\"12\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str5 = python3Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.loadTemplates();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.getTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertNotNull(sTGroup7);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "\"\"\"\"\"\"", locale3);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator5);
        java.lang.String str8 = python3Target6.getTargetStringLiteralFromString("");
        python3Target6.language = "";
        java.util.Locale locale12 = null;
        java.lang.String str13 = pythonStringRenderer0.toString((java.lang.Object) "", "\"\\\"hi!\\\"\"", locale12);
        org.antlr.v4.codegen.target.Python3Target python3Target14 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray15 = python3Target14.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup16 = python3Target14.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        java.lang.String str20 = python3Target14.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator17, "\"\\12\"", false);
        int int21 = python3Target14.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = python3Target14.getCodeGenerator();
        java.util.Locale locale24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = pythonStringRenderer0.toString((java.lang.Object) python3Target14, "\\1", locale24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python3Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"\"\"\"\"" + "'", str4, "\"\"\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"" + "'", str8, "\"\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str13, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNull(sTGroup16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "12" + "'", str20, "12");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 64 + "'", int21 == 64);
        org.junit.Assert.assertNull(codeGenerator22);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        int int3 = python3Target0.getInlineTestSetWordSize();
        int int4 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target0.getTokenTypeAsTargetLabel(grammar5, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", false);
        java.util.Set<java.lang.String> strSet11 = python3Target0.badWords;
        java.lang.String str13 = python3Target0.getTargetStringLiteralFromString("12");
        int int14 = python3Target0.getSerializedATNSegmentLimit();
        boolean boolean15 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target0.getLoopLabel(grammarAST16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"12\"" + "'", str13, "\"12\"");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target4 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean5 = python3Target4.supportsOverloadedMethods();
        java.lang.String str6 = python3Target4.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target4.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        java.lang.String str11 = python3Target4.getVersion();
        org.antlr.v4.tool.Grammar grammar12 = null;
        int[] intArray13 = new int[] {};
        java.lang.String[] strArray14 = python3Target4.getTokenTypesAsTargetLabels(grammar12, intArray13);
        java.lang.String[] strArray15 = python3Target0.getTokenTypesAsTargetLabels(grammar3, intArray13);
        org.stringtemplate.v4.STGroup sTGroup16 = python3Target0.templates;
        java.lang.String str18 = python3Target0.encodeIntAsCharEscape((int) ' ');
        org.antlr.v4.tool.ast.GrammarAST grammarAST19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python3Target0.getLoopCounter(grammarAST19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"\"\"" + "'", str2, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNull(sTGroup16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " " + "'", str18, " ");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        java.lang.String str4 = python3Target0.getTargetStringLiteralFromString("");
        int int5 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str6 = python3Target0.language;
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target0.getLoopLabel(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"\"\"" + "'", str2, "\"\"\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 29 + "'", int5 == 29);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray8;
        python3Target0.targetCharValueEscape = strArray8;
        org.antlr.v4.tool.Rule rule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getRuleFunctionContextStructName(rule11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        python3Target0.language = "Python3";
        java.util.Set<java.lang.String> strSet9 = null;
        python3Target0.badWords = strSet9;
        boolean boolean11 = python3Target0.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target0.getElementName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet2 = python3Target0.badWords;
        boolean boolean3 = python3Target0.templatesExist();
        boolean boolean4 = python3Target0.templatesExist();
        org.antlr.v4.tool.Grammar grammar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target0.getTokenTypeAsTargetLabel(grammar5, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getAltLabelContextStructName("d");
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "", true);
        java.lang.String str11 = python3Target1.getImplicitSetLabel("\"\\0\"");
        java.lang.String str13 = python3Target1.getListLabel("\"Python3\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getLoopCounter(grammarAST14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DContext" + "'", str4, "DContext");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"" + "'", str9, "\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset\"\\0\"" + "'", str11, "_tset\"\\0\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"Python3\"" + "'", str13, "\"Python3\"");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("_tset\"\\0\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_tset\"\\0\"" + "'", str1, "_tset\"\\0\"");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target0.getCodeGenerator();
        java.util.Set<java.lang.String> strSet8 = python3Target0.badWords;
        java.lang.String[] strArray9 = python3Target0.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar10, sT11, "\"DContext\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray9 = python3Target8.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        int int11 = python3Target8.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target8.gen;
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target14 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str16 = python3Target14.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar17 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target18 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean19 = python3Target18.supportsOverloadedMethods();
        java.lang.String str20 = python3Target18.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        java.lang.String str24 = python3Target18.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator21, "", true);
        java.lang.String str25 = python3Target18.getVersion();
        org.antlr.v4.tool.Grammar grammar26 = null;
        int[] intArray27 = new int[] {};
        java.lang.String[] strArray28 = python3Target18.getTokenTypesAsTargetLabels(grammar26, intArray27);
        java.lang.String[] strArray29 = python3Target14.getTokenTypesAsTargetLabels(grammar17, intArray27);
        java.lang.String[] strArray30 = python3Target8.getTokenTypesAsTargetLabels(grammar13, intArray27);
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray30;
        python3Target0.targetCharValueEscape = strArray30;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = python3Target0.getElementListName("\"\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(sTGroup10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"\"\"\"\"" + "'", str16, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4.5.2.1" + "'", str20, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"\"" + "'", str24, "\"\"");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4.5.2.1" + "'", str25, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray30);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\"\\0\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\"\\0\"\"" + "'", str1, "\"\"\\0\"\"");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = null;
        python3Target0.templates = sTGroup4;
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.templates;
        java.lang.String[] strArray7 = python3Target0.targetCharValueEscape;
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"12\"", false);
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean12 = python3Target11.supportsOverloadedMethods();
        java.lang.String str13 = python3Target11.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python3Target11.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup15 = null;
        python3Target11.templates = sTGroup15;
        org.stringtemplate.v4.STGroup sTGroup17 = python3Target11.templates;
        java.lang.String[] strArray18 = python3Target11.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet19 = python3Target11.badWords;
        java.util.Set<java.lang.String> strSet20 = python3Target11.getBadWords();
        python3Target0.badWords = strSet20;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = python3Target0.getAltLabelContextStructName("\"\\\"DContext\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(sTGroup6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"12\"" + "'", str10, "\"12\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator14);
        org.junit.Assert.assertNull(sTGroup17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strSet20);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.loadTemplates();
        java.lang.String str7 = python3Target1.getLanguage();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("\"\"\\0\"\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getLoopCounter(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"\\\"\\\\0\\\"\\\"\"" + "'", str9, "\"\\\"\\\"\\\\0\\\"\\\"\"");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        org.antlr.v4.codegen.target.Python3Target python3Target7 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray8 = python3Target7.targetCharValueEscape;
        python3Target0.targetCharValueEscape = strArray8;
        python3Target0.addBadWords();
        java.lang.String[] strArray11 = python3Target0.targetCharValueEscape;
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target0.getLoopLabel(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        java.lang.String[] strArray3 = python3Target0.targetCharValueEscape;
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        java.lang.String str4 = python3Target0.getTargetStringLiteralFromString("");
        int int5 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray7 = python3Target6.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target6.templates;
        int int9 = python3Target6.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target6.gen;
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str14 = python3Target12.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target16 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean17 = python3Target16.supportsOverloadedMethods();
        java.lang.String str18 = python3Target16.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        java.lang.String str22 = python3Target16.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator19, "", true);
        java.lang.String str23 = python3Target16.getVersion();
        org.antlr.v4.tool.Grammar grammar24 = null;
        int[] intArray25 = new int[] {};
        java.lang.String[] strArray26 = python3Target16.getTokenTypesAsTargetLabels(grammar24, intArray25);
        java.lang.String[] strArray27 = python3Target12.getTokenTypesAsTargetLabels(grammar15, intArray25);
        java.lang.String[] strArray28 = python3Target6.getTokenTypesAsTargetLabels(grammar11, intArray25);
        python3Target0.targetCharValueEscape = strArray28;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = python3Target0.getListLabel("\"_tset12\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"\"\"" + "'", str2, "\"\"\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 29 + "'", int5 == 29);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNull(sTGroup8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"\"\"\"\"" + "'", str14, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"\"" + "'", str22, "\"\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "4.5.2.1" + "'", str23, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet2 = python3Target0.badWords;
        java.lang.Class<?> wildcardClass3 = strSet2.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "\"\"\"\"\"\"", locale3);
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray6 = python3Target5.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target5.templates;
        java.util.Locale locale9 = null;
        java.lang.String str10 = pythonStringRenderer0.toString((java.lang.Object) sTGroup7, "\"Hi!Context\"", locale9);
        java.util.Locale locale13 = null;
        java.lang.String str14 = pythonStringRenderer0.toString((java.lang.Object) "\"\"\"\"\"\"\"\"", "4.5.2.1", locale13);
        org.antlr.v4.codegen.target.Python3Target python3Target15 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean16 = python3Target15.supportsOverloadedMethods();
        java.lang.String str17 = python3Target15.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        java.lang.String str21 = python3Target15.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator18, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        python3Target15.gen = codeGenerator22;
        java.lang.String[] strArray31 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        python3Target15.badWords = strSet32;
        boolean boolean35 = python3Target15.templatesExist();
        java.util.Locale locale37 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = pythonStringRenderer0.toString((java.lang.Object) python3Target15, "\\35", locale37);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python3Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"\"\"\"\"" + "'", str4, "\"\"\"\"\"\"");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(sTGroup7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Hi!Context\"" + "'", str10, "\"Hi!Context\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"\"" + "'", str21, "\"\"");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.lang.String str5 = python3Target0.getLanguage();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar6, sT7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.getVersion();
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "";
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean4 = python3Target3.supportsOverloadedMethods();
        java.lang.String str5 = python3Target3.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target3.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python3Target3.gen = codeGenerator10;
        java.lang.String[] strArray19 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        python3Target3.badWords = strSet20;
        python3Target0.badWords = strSet20;
        java.lang.String str25 = python3Target0.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str26 = python3Target0.getLanguage();
        java.lang.String str28 = python3Target0.getTargetStringLiteralFromString("\"\\0\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = python3Target0.getImplicitSetLabel("\"\"\"\\0\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"" + "'", str9, "\"\"");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"\"\\0\"\"" + "'", str28, "\"\"\\0\"\"");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        int int3 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str8 = python3Target6.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean11 = python3Target10.supportsOverloadedMethods();
        java.lang.String str12 = python3Target10.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python3Target10.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "", true);
        java.lang.String str17 = python3Target10.getVersion();
        org.antlr.v4.tool.Grammar grammar18 = null;
        int[] intArray19 = new int[] {};
        java.lang.String[] strArray20 = python3Target10.getTokenTypesAsTargetLabels(grammar18, intArray19);
        java.lang.String[] strArray21 = python3Target6.getTokenTypesAsTargetLabels(grammar9, intArray19);
        java.lang.String[] strArray22 = python3Target0.getTokenTypesAsTargetLabels(grammar5, intArray19);
        java.lang.String[] strArray45 = new java.lang.String[] { "\"\\\"\\\"\"", "DContext", "", "hi!", "d", "\"\"\"\"\"\"", "\"\"\"\"\"\"", "_tsetPython3", "\"hi!\"", "\"hi!\"", "Hi!Context", "\"\"\"\"\"\"", "\"hi!\"", "12", "\"4.5.2.1\"", "DContext", "Hi!Context", "Python3", "\"hi!\"", "", "\"\"", "\\\"4.5.2.1\\\"" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        python3Target0.badWords = strSet46;
        org.antlr.v4.codegen.target.Python3Target python3Target49 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean50 = python3Target49.supportsOverloadedMethods();
        java.lang.String str51 = python3Target49.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator52 = null;
        java.lang.String str55 = python3Target49.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator52, "", true);
        java.lang.String str56 = python3Target49.getVersion();
        org.antlr.v4.codegen.target.Python3Target python3Target57 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str59 = python3Target57.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar60 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target61 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean62 = python3Target61.supportsOverloadedMethods();
        java.lang.String str63 = python3Target61.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator64 = null;
        java.lang.String str67 = python3Target61.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator64, "", true);
        java.lang.String str68 = python3Target61.getVersion();
        org.antlr.v4.tool.Grammar grammar69 = null;
        int[] intArray70 = new int[] {};
        java.lang.String[] strArray71 = python3Target61.getTokenTypesAsTargetLabels(grammar69, intArray70);
        java.lang.String[] strArray72 = python3Target57.getTokenTypesAsTargetLabels(grammar60, intArray70);
        java.lang.String[] strArray73 = python3Target57.targetCharValueEscape;
        python3Target49.targetCharValueEscape = strArray73;
        python3Target0.targetCharValueEscape = strArray73;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str77 = python3Target0.getElementName("\"\\0\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\"\"\"\"" + "'", str8, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"" + "'", str16, "\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "4.5.2.1" + "'", str51, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\"\"" + "'", str55, "\"\"");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "4.5.2.1" + "'", str56, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "\"\"\"\"\"\"" + "'", str59, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "4.5.2.1" + "'", str63, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "\"\"" + "'", str67, "\"\"");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "4.5.2.1" + "'", str68, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[]");
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(strArray73);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "";
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean4 = python3Target3.supportsOverloadedMethods();
        java.lang.String str5 = python3Target3.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target3.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python3Target3.gen = codeGenerator10;
        java.lang.String[] strArray19 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        python3Target3.badWords = strSet20;
        python3Target0.badWords = strSet20;
        java.lang.String str25 = python3Target0.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str26 = python3Target0.getLanguage();
        java.lang.String[] strArray27 = new java.lang.String[] {};
        python3Target0.targetCharValueEscape = strArray27;
        int int29 = python3Target0.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = python3Target0.getElementListName("\"\"\"\"\"\"\"\"ContextContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"" + "'", str9, "\"\"");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 29 + "'", int29 == 29);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "";
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean4 = python3Target3.supportsOverloadedMethods();
        java.lang.String str5 = python3Target3.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target3.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python3Target3.gen = codeGenerator10;
        java.lang.String[] strArray19 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        python3Target3.badWords = strSet20;
        python3Target0.badWords = strSet20;
        python3Target0.addBadWords();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup25 = python3Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"" + "'", str9, "\"\"");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str11 = python3Target0.getLanguage();
        int int12 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.stringtemplate.v4.ST sT14 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar13, sT14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\"\"" + "'", str8, "\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"\"\"" + "'", str10, "\"\"\"\"");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean4 = python3Target3.supportsOverloadedMethods();
        python3Target3.language = "\"\"\"\"";
        org.antlr.v4.codegen.target.Python3Target python3Target7 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray8 = python3Target7.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target7.templates;
        int int10 = python3Target7.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target7.gen;
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target13 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str15 = python3Target13.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target17 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean18 = python3Target17.supportsOverloadedMethods();
        java.lang.String str19 = python3Target17.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        java.lang.String str23 = python3Target17.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator20, "", true);
        java.lang.String str24 = python3Target17.getVersion();
        org.antlr.v4.tool.Grammar grammar25 = null;
        int[] intArray26 = new int[] {};
        java.lang.String[] strArray27 = python3Target17.getTokenTypesAsTargetLabels(grammar25, intArray26);
        java.lang.String[] strArray28 = python3Target13.getTokenTypesAsTargetLabels(grammar16, intArray26);
        java.lang.String[] strArray29 = python3Target7.getTokenTypesAsTargetLabels(grammar12, intArray26);
        java.lang.String[] strArray52 = new java.lang.String[] { "\"\\\"\\\"\"", "DContext", "", "hi!", "d", "\"\"\"\"\"\"", "\"\"\"\"\"\"", "_tsetPython3", "\"hi!\"", "\"hi!\"", "Hi!Context", "\"\"\"\"\"\"", "\"hi!\"", "12", "\"4.5.2.1\"", "DContext", "Hi!Context", "Python3", "\"hi!\"", "", "\"\"", "\\\"4.5.2.1\\\"" };
        java.util.LinkedHashSet<java.lang.String> strSet53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet53, strArray52);
        python3Target7.badWords = strSet53;
        org.antlr.v4.codegen.target.Python3Target python3Target56 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean57 = python3Target56.supportsOverloadedMethods();
        java.lang.String str58 = python3Target56.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator59 = null;
        java.lang.String str62 = python3Target56.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator59, "", true);
        java.lang.String str63 = python3Target56.getVersion();
        org.antlr.v4.codegen.target.Python3Target python3Target64 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str66 = python3Target64.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar67 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target68 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean69 = python3Target68.supportsOverloadedMethods();
        java.lang.String str70 = python3Target68.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator71 = null;
        java.lang.String str74 = python3Target68.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator71, "", true);
        java.lang.String str75 = python3Target68.getVersion();
        org.antlr.v4.tool.Grammar grammar76 = null;
        int[] intArray77 = new int[] {};
        java.lang.String[] strArray78 = python3Target68.getTokenTypesAsTargetLabels(grammar76, intArray77);
        java.lang.String[] strArray79 = python3Target64.getTokenTypesAsTargetLabels(grammar67, intArray77);
        java.lang.String[] strArray80 = python3Target64.targetCharValueEscape;
        python3Target56.targetCharValueEscape = strArray80;
        python3Target7.targetCharValueEscape = strArray80;
        python3Target3.targetCharValueEscape = strArray80;
        python3Target0.targetCharValueEscape = strArray80;
        org.antlr.v4.tool.Grammar grammar85 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str87 = python3Target0.getTokenTypeAsTargetLabel(grammar85, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(sTGroup9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\"\"\"\"\"" + "'", str15, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "4.5.2.1" + "'", str19, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"\"" + "'", str23, "\"\"");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4.5.2.1" + "'", str24, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[]");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "4.5.2.1" + "'", str58, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "\"\"" + "'", str62, "\"\"");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "4.5.2.1" + "'", str63, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "\"\"\"\"\"\"" + "'", str66, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "4.5.2.1" + "'", str70, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "\"\"" + "'", str74, "\"\"");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "4.5.2.1" + "'", str75, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[]");
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(strArray80);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python3Target1.gen = codeGenerator3;
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("hi!");
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("\"hi!\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python3Target1.gen = codeGenerator10;
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target13 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray14 = python3Target13.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target13.templates;
        int int16 = python3Target13.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python3Target13.gen;
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target19 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str21 = python3Target19.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target23 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean24 = python3Target23.supportsOverloadedMethods();
        java.lang.String str25 = python3Target23.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        java.lang.String str29 = python3Target23.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator26, "", true);
        java.lang.String str30 = python3Target23.getVersion();
        org.antlr.v4.tool.Grammar grammar31 = null;
        int[] intArray32 = new int[] {};
        java.lang.String[] strArray33 = python3Target23.getTokenTypesAsTargetLabels(grammar31, intArray32);
        java.lang.String[] strArray34 = python3Target19.getTokenTypesAsTargetLabels(grammar22, intArray32);
        java.lang.String[] strArray35 = python3Target13.getTokenTypesAsTargetLabels(grammar18, intArray32);
        java.lang.String[] strArray36 = python3Target1.getTokenTypesAsTargetLabels(grammar12, intArray32);
        java.lang.String str38 = python3Target1.getAltLabelContextStructName("\"Python3\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator39 = python3Target1.gen;
        org.antlr.v4.codegen.target.Python3Target python3Target40 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean41 = python3Target40.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup42 = python3Target40.templates;
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "hi!" };
        python3Target40.targetCharValueEscape = strArray45;
        org.antlr.v4.codegen.CodeGenerator codeGenerator47 = null;
        java.lang.String str50 = python3Target40.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator47, "", false);
        java.util.Set<java.lang.String> strSet51 = python3Target40.badWords;
        java.util.Set<java.lang.String> strSet52 = python3Target40.badWords;
        python3Target1.badWords = strSet52;
        org.antlr.v4.tool.ast.GrammarAST grammarAST54 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean55 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hi!Context" + "'", str6, "Hi!Context");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str9, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNull(sTGroup15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
        org.junit.Assert.assertNull(codeGenerator17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"\"\"\"\"\"" + "'", str21, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4.5.2.1" + "'", str25, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\"" + "'", str29, "\"\"");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "4.5.2.1" + "'", str30, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[]");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\"Python3\"Context" + "'", str38, "\"Python3\"Context");
        org.junit.Assert.assertNull(codeGenerator39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(sTGroup42);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(strSet51);
        org.junit.Assert.assertNotNull(strSet52);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python3Target0.gen = codeGenerator3;
        python3Target0.language = "\"\\12\"";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target0.getImplicitRuleLabel("\"\"4.5.2.1\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getAltLabelContextStructName("d");
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator9);
        java.util.Set<java.lang.String> strSet11 = python3Target10.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        python3Target10.gen = codeGenerator12;
        java.lang.String str15 = python3Target10.getAltLabelContextStructName("hi!");
        java.lang.String str18 = python3Target10.getTargetStringLiteralFromString("\"hi!\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        python3Target10.gen = codeGenerator19;
        org.antlr.v4.tool.Grammar grammar21 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target22 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray23 = python3Target22.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup24 = python3Target22.templates;
        int int25 = python3Target22.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = python3Target22.gen;
        org.antlr.v4.tool.Grammar grammar27 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target28 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str30 = python3Target28.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar31 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target32 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean33 = python3Target32.supportsOverloadedMethods();
        java.lang.String str34 = python3Target32.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        java.lang.String str38 = python3Target32.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator35, "", true);
        java.lang.String str39 = python3Target32.getVersion();
        org.antlr.v4.tool.Grammar grammar40 = null;
        int[] intArray41 = new int[] {};
        java.lang.String[] strArray42 = python3Target32.getTokenTypesAsTargetLabels(grammar40, intArray41);
        java.lang.String[] strArray43 = python3Target28.getTokenTypesAsTargetLabels(grammar31, intArray41);
        java.lang.String[] strArray44 = python3Target22.getTokenTypesAsTargetLabels(grammar27, intArray41);
        java.lang.String[] strArray45 = python3Target10.getTokenTypesAsTargetLabels(grammar21, intArray41);
        java.lang.String[] strArray46 = python3Target1.getTokenTypesAsTargetLabels(grammar8, intArray41);
        org.antlr.v4.tool.ast.GrammarAST grammarAST47 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str48 = python3Target1.getLoopLabel(grammarAST47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DContext" + "'", str4, "DContext");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\"\\\"\"" + "'", str6, "\"\\\"\\\"\"");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!Context" + "'", str15, "Hi!Context");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str18, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNull(sTGroup24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 64 + "'", int25 == 64);
        org.junit.Assert.assertNull(codeGenerator26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\"\"\"\"\"\"" + "'", str30, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "4.5.2.1" + "'", str34, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\"\"" + "'", str38, "\"\"");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "4.5.2.1" + "'", str39, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[]");
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(strArray46);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target4 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean5 = python3Target4.supportsOverloadedMethods();
        java.lang.String str6 = python3Target4.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target4.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        java.lang.String str11 = python3Target4.getVersion();
        org.antlr.v4.tool.Grammar grammar12 = null;
        int[] intArray13 = new int[] {};
        java.lang.String[] strArray14 = python3Target4.getTokenTypesAsTargetLabels(grammar12, intArray13);
        java.lang.String[] strArray15 = python3Target0.getTokenTypesAsTargetLabels(grammar3, intArray13);
        org.stringtemplate.v4.STGroup sTGroup16 = python3Target0.templates;
        java.lang.String str18 = python3Target0.encodeIntAsCharEscape((int) ' ');
        org.antlr.v4.tool.Grammar grammar19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python3Target0.getTokenTypeAsTargetLabel(grammar19, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"\"\"" + "'", str2, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNull(sTGroup16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " " + "'", str18, " ");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        java.lang.String[] strArray16 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        python3Target0.badWords = strSet17;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python3Target0.gen;
        java.lang.String str21 = python3Target0.getVersion();
        int int22 = python3Target0.getSerializedATNSegmentLimit();
        java.util.Set<java.lang.String> strSet23 = python3Target0.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = python3Target0.getImplicitRuleLabel("Hi!Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(codeGenerator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4.5.2.1" + "'", str21, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 29 + "'", int22 == 29);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.loadTemplates();
        java.lang.String str7 = python3Target1.getLanguage();
        boolean boolean8 = python3Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getElementListName("\"\"4.5.2.1\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        java.lang.String str6 = python3Target1.getVersion();
        python3Target1.language = "\"\"\"\"\"\"\"\"";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getImplicitSetLabel("12Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "\"\\12\"", false);
        int int7 = python3Target0.getSerializedATNSegmentLimit();
        boolean boolean8 = python3Target0.templatesExist();
        boolean boolean9 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        python3Target0.genRecognizerHeaderFile(grammar10, sT11, "_tsetPython3");
        java.util.Set<java.lang.String> strSet14 = python3Target0.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        python3Target0.gen = codeGenerator15;
        org.antlr.v4.tool.Grammar grammar17 = null;
        org.stringtemplate.v4.ST sT18 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar17, sT18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "12" + "'", str6, "12");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "\"\\12\"", false);
        int int7 = python3Target0.getSerializedATNSegmentLimit();
        boolean boolean8 = python3Target0.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target0.getImplicitTokenLabel("\"\"\\0\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "12" + "'", str6, "12");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.gen;
        boolean boolean8 = python3Target1.wantsBaseListener();
        int int9 = python3Target1.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getImplicitTokenLabel("_tset\"\\\"Python3\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        java.lang.String[] strArray16 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        python3Target0.badWords = strSet17;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python3Target0.gen;
        java.lang.String str21 = python3Target0.getVersion();
        int int22 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.target.Python3Target python3Target23 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray24 = python3Target23.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup25 = python3Target23.templates;
        int int26 = python3Target23.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = python3Target23.gen;
        org.antlr.v4.tool.Grammar grammar28 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target29 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str31 = python3Target29.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar32 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target33 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean34 = python3Target33.supportsOverloadedMethods();
        java.lang.String str35 = python3Target33.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator36 = null;
        java.lang.String str39 = python3Target33.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator36, "", true);
        java.lang.String str40 = python3Target33.getVersion();
        org.antlr.v4.tool.Grammar grammar41 = null;
        int[] intArray42 = new int[] {};
        java.lang.String[] strArray43 = python3Target33.getTokenTypesAsTargetLabels(grammar41, intArray42);
        java.lang.String[] strArray44 = python3Target29.getTokenTypesAsTargetLabels(grammar32, intArray42);
        java.lang.String[] strArray45 = python3Target23.getTokenTypesAsTargetLabels(grammar28, intArray42);
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray45;
        python3Target0.targetCharValueEscape = strArray45;
        org.antlr.v4.tool.ast.GrammarAST grammarAST48 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(codeGenerator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4.5.2.1" + "'", str21, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 29 + "'", int22 == 29);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNull(sTGroup25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 64 + "'", int26 == 64);
        org.junit.Assert.assertNull(codeGenerator27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\"\"\"\"\"\"" + "'", str31, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "4.5.2.1" + "'", str35, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\"\"" + "'", str39, "\"\"");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "4.5.2.1" + "'", str40, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[]");
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strArray45);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.gen;
        boolean boolean8 = python3Target1.wantsBaseListener();
        int int9 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getLoopLabel(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        int int3 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str4 = python3Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.stringtemplate.v4.ST sT6 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genFile(grammar5, sT6, "\\12");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4.5.2.1" + "'", str4, "4.5.2.1");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        java.lang.String[] strArray16 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        python3Target0.badWords = strSet17;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python3Target0.gen;
        java.lang.String str21 = python3Target0.getVersion();
        int int22 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str23 = python3Target0.language;
        org.antlr.v4.tool.ast.GrammarAST grammarAST24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = python3Target0.getLoopCounter(grammarAST24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(codeGenerator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4.5.2.1" + "'", str21, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 29 + "'", int22 == 29);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "\"\"\"\"\"\"", locale3);
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray6 = python3Target5.targetCharValueEscape;
        java.lang.String str7 = python3Target5.language;
        int int8 = python3Target5.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        python3Target5.gen = codeGenerator9;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator11);
        java.util.Set<java.lang.String> strSet13 = python3Target12.getBadWords();
        java.lang.String str15 = python3Target12.getAltLabelContextStructName("d");
        org.stringtemplate.v4.STGroup sTGroup16 = python3Target12.getTemplates();
        python3Target5.templates = sTGroup16;
        java.util.Locale locale19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = pythonStringRenderer0.toString((java.lang.Object) sTGroup16, "\"DContext\"", locale19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.stringtemplate.v4.STGroupFile cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"\"\"\"\"" + "'", str4, "\"\"\"\"\"\"");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DContext" + "'", str15, "DContext");
        org.junit.Assert.assertNotNull(sTGroup16);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.stringtemplate.v4.ST sT6 = null;
        python3Target0.genRecognizerHeaderFile(grammar5, sT6, "\"\\\"\\\"\"");
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(codeGenerator4);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.loadTemplates();
        org.antlr.v4.codegen.target.Python3Target python3Target7 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target7.language = "4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target7.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target7.gen;
        java.util.Set<java.lang.String> strSet12 = python3Target7.badWords;
        python3Target1.badWords = strSet12;
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getLoopLabel(grammarAST14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.gen;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean9 = python3Target8.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python3Target8.genRecognizerHeaderFile(grammar11, sT12, "");
        python3Target8.language = "Python3";
        int int17 = python3Target8.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup18 = python3Target8.loadTemplates();
        python3Target1.templates = sTGroup18;
        boolean boolean20 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(sTGroup10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 29 + "'", int17 == 29);
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "\"\\12\"", false);
        int int7 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target0.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = codeGenerator8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "12" + "'", str6, "12");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertNull(codeGenerator8);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        boolean boolean7 = python3Target0.supportsOverloadedMethods();
        python3Target0.language = "\"\\12\"";
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator11);
        java.util.Set<java.lang.String> strSet13 = python3Target12.getBadWords();
        java.lang.String str15 = python3Target12.getAltLabelContextStructName("d");
        java.lang.String str17 = python3Target12.getTargetStringLiteralFromString("\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python3Target12.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target21 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator20);
        java.util.Set<java.lang.String> strSet22 = python3Target21.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        python3Target21.gen = codeGenerator23;
        java.lang.String str26 = python3Target21.getAltLabelContextStructName("hi!");
        java.lang.String str29 = python3Target21.getTargetStringLiteralFromString("\"hi!\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator30 = null;
        python3Target21.gen = codeGenerator30;
        org.antlr.v4.tool.Grammar grammar32 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target33 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray34 = python3Target33.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup35 = python3Target33.templates;
        int int36 = python3Target33.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator37 = python3Target33.gen;
        org.antlr.v4.tool.Grammar grammar38 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target39 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str41 = python3Target39.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar42 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target43 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean44 = python3Target43.supportsOverloadedMethods();
        java.lang.String str45 = python3Target43.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator46 = null;
        java.lang.String str49 = python3Target43.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator46, "", true);
        java.lang.String str50 = python3Target43.getVersion();
        org.antlr.v4.tool.Grammar grammar51 = null;
        int[] intArray52 = new int[] {};
        java.lang.String[] strArray53 = python3Target43.getTokenTypesAsTargetLabels(grammar51, intArray52);
        java.lang.String[] strArray54 = python3Target39.getTokenTypesAsTargetLabels(grammar42, intArray52);
        java.lang.String[] strArray55 = python3Target33.getTokenTypesAsTargetLabels(grammar38, intArray52);
        java.lang.String[] strArray56 = python3Target21.getTokenTypesAsTargetLabels(grammar32, intArray52);
        java.lang.String[] strArray57 = python3Target12.getTokenTypesAsTargetLabels(grammar19, intArray52);
        java.lang.String[] strArray58 = python3Target0.getTokenTypesAsTargetLabels(grammar10, intArray52);
        org.antlr.v4.tool.Rule rule59 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str60 = python3Target0.getRuleFunctionContextStructName(rule59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DContext" + "'", str15, "DContext");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\\\"\\\"\"" + "'", str17, "\"\\\"\\\"\"");
        org.junit.Assert.assertNull(codeGenerator18);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Hi!Context" + "'", str26, "Hi!Context");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str29, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNull(sTGroup35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 64 + "'", int36 == 64);
        org.junit.Assert.assertNull(codeGenerator37);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\"\"\"\"\"\"" + "'", str41, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "4.5.2.1" + "'", str45, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\"\"" + "'", str49, "\"\"");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "4.5.2.1" + "'", str50, "4.5.2.1");
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
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "";
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean4 = python3Target3.supportsOverloadedMethods();
        java.lang.String str5 = python3Target3.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target3.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python3Target3.gen = codeGenerator10;
        java.lang.String[] strArray19 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        python3Target3.badWords = strSet20;
        python3Target0.badWords = strSet20;
        java.lang.String str25 = python3Target0.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str26 = python3Target0.getLanguage();
        org.antlr.v4.tool.Grammar grammar27 = null;
        org.stringtemplate.v4.ST sT28 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar27, sT28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"" + "'", str9, "\"\"");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python3Target1.gen = codeGenerator3;
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("hi!");
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("\"hi!\"", true);
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genListenerFile(grammar10, sT11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hi!Context" + "'", str6, "Hi!Context");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str9, "\"\\\"hi!\\\"\"");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "\"\\12\"", false);
        int int7 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target0.getCodeGenerator();
        boolean boolean9 = python3Target0.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target0.getListLabel("12");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "12" + "'", str6, "12");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "\"\"\"\"\"\"", locale3);
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray6 = python3Target5.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target5.templates;
        java.util.Locale locale9 = null;
        java.lang.String str10 = pythonStringRenderer0.toString((java.lang.Object) sTGroup7, "\"Hi!Context\"", locale9);
        java.util.Locale locale13 = null;
        java.lang.String str14 = pythonStringRenderer0.toString((java.lang.Object) "\"DContext\"", "", locale13);
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target16 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator15);
        java.util.Set<java.lang.String> strSet17 = python3Target16.getBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target18 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str20 = python3Target18.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.codegen.target.Python3Target python3Target21 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean22 = python3Target21.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet23 = python3Target21.badWords;
        python3Target18.badWords = strSet23;
        python3Target16.badWords = strSet23;
        java.util.Set<java.lang.String> strSet26 = python3Target16.badWords;
        org.antlr.v4.codegen.target.Python3Target python3Target27 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target27.language = "";
        org.antlr.v4.codegen.target.Python3Target python3Target30 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean31 = python3Target30.supportsOverloadedMethods();
        java.lang.String str32 = python3Target30.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = null;
        java.lang.String str36 = python3Target30.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator33, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator37 = null;
        python3Target30.gen = codeGenerator37;
        java.lang.String[] strArray46 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        python3Target30.badWords = strSet47;
        python3Target27.badWords = strSet47;
        python3Target16.badWords = strSet47;
        java.util.Locale locale53 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str54 = pythonStringRenderer0.toString((java.lang.Object) python3Target16, "\\\"hi!\\\"", locale53);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python3Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"\"\"\"\"" + "'", str4, "\"\"\"\"\"\"");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(sTGroup7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Hi!Context\"" + "'", str10, "\"Hi!Context\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\"\"\"\"\"" + "'", str20, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "4.5.2.1" + "'", str32, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\"\"" + "'", str36, "\"\"");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        python3Target0.language = "Python3";
        int int9 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str11 = python3Target0.getListLabel("_tsetPython3");
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "\"\"\"hi!\"\"\"", true);
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.stringtemplate.v4.ST sT17 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar16, sT17, "\\\"4.5.2.1\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tsetPython3" + "'", str11, "_tsetPython3");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"\\\"hi!\\\"\\\"\"" + "'", str15, "\"\\\"\\\"hi!\\\"\\\"\"");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", false);
        java.util.Set<java.lang.String> strSet11 = python3Target0.badWords;
        java.lang.String str13 = python3Target0.getTargetStringLiteralFromString("12");
        int int14 = python3Target0.getSerializedATNSegmentLimit();
        boolean boolean15 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = python3Target0.gen;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"12\"" + "'", str13, "\"12\"");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(codeGenerator16);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "";
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean4 = python3Target3.supportsOverloadedMethods();
        java.lang.String str5 = python3Target3.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target3.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python3Target3.gen = codeGenerator10;
        java.lang.String[] strArray19 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        python3Target3.badWords = strSet20;
        python3Target0.badWords = strSet20;
        java.lang.String str25 = python3Target0.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str26 = python3Target0.getLanguage();
        boolean boolean27 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup28 = python3Target0.templates;
        org.antlr.v4.tool.Rule rule29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = python3Target0.getRuleFunctionContextStructName(rule29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"" + "'", str9, "\"\"");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(sTGroup28);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        java.lang.String[] strArray16 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        python3Target0.badWords = strSet17;
        org.antlr.v4.tool.Grammar grammar20 = null;
        org.stringtemplate.v4.ST sT21 = null;
        python3Target0.genRecognizerHeaderFile(grammar20, sT21, "\"\"");
        java.lang.String str25 = python3Target0.encodeIntAsCharEscape((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = python3Target0.getListLabel("12Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\\12" + "'", str25, "\\12");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getAltLabelContextStructName("d");
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = python3Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DContext" + "'", str4, "DContext");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        int int9 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str11 = python3Target0.getTargetStringLiteralFromString("\\1");
        java.lang.String str12 = python3Target0.language;
        org.antlr.v4.tool.Rule rule13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target0.getRuleFunctionContextStructName(rule13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\1\"" + "'", str11, "\"\\1\"");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        java.lang.String[] strArray16 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        python3Target0.badWords = strSet17;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python3Target0.gen;
        java.lang.String str23 = python3Target0.getTargetStringLiteralFromString("\\12", true);
        java.lang.String str24 = python3Target0.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = python3Target0.getAltLabelContextStructName("\"12\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(codeGenerator20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"\\12\"" + "'", str23, "\"\\12\"");
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", false);
        int int11 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str12 = python3Target0.getVersion();
        java.lang.String str14 = python3Target0.getTargetStringLiteralFromString("4.5.2.1");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target0.getElementListName("\\12");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29 + "'", int11 == 29);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"4.5.2.1\"" + "'", str14, "\"4.5.2.1\"");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getImplicitRuleLabel("\\35");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python3Target0.gen = codeGenerator3;
        java.lang.String str5 = python3Target0.getVersion();
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean7 = python3Target6.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target6.templates;
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        python3Target6.genRecognizerHeaderFile(grammar9, sT10, "");
        python3Target6.language = "Python3";
        int int15 = python3Target6.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup16 = python3Target6.loadTemplates();
        python3Target0.templates = sTGroup16;
        java.lang.String str19 = python3Target0.getAltLabelContextStructName("12");
        java.lang.Class<?> wildcardClass20 = python3Target0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"\"\"" + "'", str2, "\"\"\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(sTGroup8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
        org.junit.Assert.assertNotNull(sTGroup16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "12Context" + "'", str19, "12Context");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "\"\\12\"", false);
        int int7 = python3Target0.getSerializedATNSegmentLimit();
        boolean boolean8 = python3Target0.templatesExist();
        boolean boolean9 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        python3Target0.genRecognizerHeaderFile(grammar10, sT11, "_tsetPython3");
        boolean boolean14 = python3Target0.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target0.getImplicitTokenLabel("\"\"\"hi!\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "12" + "'", str6, "12");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"\"", false);
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar7, sT8, "\\0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"\"\"\"\"" + "'", str6, "\"\"\"\"\"\"");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        int int5 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target1.genRecognizerHeaderFile(grammar6, sT7, "@");
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"\"", false);
        boolean boolean7 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"\"\"\"\"" + "'", str6, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target0.genRecognizerHeaderFile(grammar4, sT5, "_tsetPython3");
        boolean boolean8 = python3Target0.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target0.getListLabel("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "\"\\12\"", false);
        boolean boolean7 = python3Target0.supportsOverloadedMethods();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "12" + "'", str6, "12");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getAltLabelContextStructName("d");
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.getTemplates();
        python3Target1.language = "\"\"";
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "\\\"4.5.2.1\\\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python3Target1.gen;
        org.antlr.v4.tool.Grammar grammar15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.getTokenTypeAsTargetLabel(grammar15, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DContext" + "'", str4, "DContext");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\\"4.5.2.1\\\"" + "'", str13, "\\\"4.5.2.1\\\"");
        org.junit.Assert.assertNull(codeGenerator14);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\"\"\"\"\"Context");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\"\"\"\"\"Context" + "'", str1, "\"\"\"\"\"\"Context");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"");
        boolean boolean11 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target0.getLoopLabel(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\"\"" + "'", str8, "\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"\"\"" + "'", str10, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        java.lang.String[] strArray16 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        python3Target0.badWords = strSet17;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python3Target0.gen;
        java.lang.String str21 = python3Target0.getVersion();
        int int22 = python3Target0.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = python3Target0.getElementName("\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(codeGenerator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4.5.2.1" + "'", str21, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 29 + "'", int22 == 29);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str11 = python3Target0.getLanguage();
        boolean boolean12 = python3Target0.wantsBaseVisitor();
        python3Target0.addBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target0.getLoopCounter(grammarAST14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\"\"" + "'", str8, "\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"\"\"" + "'", str10, "\"\"\"\"");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        java.lang.String str4 = python3Target0.getTargetStringLiteralFromString("");
        int int5 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray7 = python3Target6.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target6.templates;
        int int9 = python3Target6.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target6.gen;
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str14 = python3Target12.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target16 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean17 = python3Target16.supportsOverloadedMethods();
        java.lang.String str18 = python3Target16.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        java.lang.String str22 = python3Target16.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator19, "", true);
        java.lang.String str23 = python3Target16.getVersion();
        org.antlr.v4.tool.Grammar grammar24 = null;
        int[] intArray25 = new int[] {};
        java.lang.String[] strArray26 = python3Target16.getTokenTypesAsTargetLabels(grammar24, intArray25);
        java.lang.String[] strArray27 = python3Target12.getTokenTypesAsTargetLabels(grammar15, intArray25);
        java.lang.String[] strArray28 = python3Target6.getTokenTypesAsTargetLabels(grammar11, intArray25);
        python3Target0.targetCharValueEscape = strArray28;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = python3Target0.getElementListName("\"\\\"\\\"\\\\0\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"\"\"" + "'", str2, "\"\"\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 29 + "'", int5 == 29);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNull(sTGroup8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"\"\"\"\"" + "'", str14, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"\"" + "'", str22, "\"\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "4.5.2.1" + "'", str23, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray28);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.gen;
        boolean boolean8 = python3Target1.wantsBaseListener();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = python3Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.antlr.v4.tool.Grammar grammar1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = python3Target0.getTokenTypeAsTargetLabel(grammar1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getAltLabelContextStructName("d");
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet7 = python3Target1.badWords;
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DContext" + "'", str4, "DContext");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", false);
        java.util.Set<java.lang.String> strSet11 = python3Target0.badWords;
        java.util.Set<java.lang.String> strSet12 = python3Target0.badWords;
        org.antlr.v4.tool.Grammar grammar13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target0.getTokenTypeAsTargetLabel(grammar13, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python3Target0.gen = codeGenerator3;
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str8 = python3Target6.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean11 = python3Target10.supportsOverloadedMethods();
        java.lang.String str12 = python3Target10.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python3Target10.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "", true);
        java.lang.String str17 = python3Target10.getVersion();
        org.antlr.v4.tool.Grammar grammar18 = null;
        int[] intArray19 = new int[] {};
        java.lang.String[] strArray20 = python3Target10.getTokenTypesAsTargetLabels(grammar18, intArray19);
        java.lang.String[] strArray21 = python3Target6.getTokenTypesAsTargetLabels(grammar9, intArray19);
        java.lang.String[] strArray22 = python3Target0.getTokenTypesAsTargetLabels(grammar5, intArray19);
        org.antlr.v4.tool.Grammar grammar23 = null;
        org.stringtemplate.v4.ST sT24 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genListenerFile(grammar23, sT24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"\"\"" + "'", str2, "\"\"\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\"\"\"\"" + "'", str8, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"" + "'", str16, "\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        org.antlr.v4.codegen.target.Python3Target python3Target7 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray8 = python3Target7.targetCharValueEscape;
        python3Target0.targetCharValueEscape = strArray8;
        python3Target0.addBadWords();
        int int11 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python3Target1.gen = codeGenerator3;
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("hi!");
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("\"hi!\"", true);
        int int10 = python3Target1.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getElementListName("\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hi!Context" + "'", str6, "Hi!Context");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str9, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", false);
        int int11 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str12 = python3Target0.getVersion();
        boolean boolean13 = python3Target0.supportsOverloadedMethods();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target0.getRuleFunctionContextStructName(ruleFunction14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29 + "'", int11 == 29);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getAltLabelContextStructName("d");
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.getTemplates();
        python3Target1.language = "\"\"";
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "\\\"4.5.2.1\\\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python3Target1.gen;
        java.lang.String str16 = python3Target1.getListLabel("_tset12");
        org.antlr.v4.tool.ast.GrammarAST grammarAST17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python3Target1.getLoopLabel(grammarAST17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DContext" + "'", str4, "DContext");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\\"4.5.2.1\\\"" + "'", str13, "\\\"4.5.2.1\\\"");
        org.junit.Assert.assertNull(codeGenerator14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_tset12" + "'", str16, "_tset12");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "\"\"\"\"\"\"", locale3);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator5);
        java.lang.String str8 = python3Target6.getTargetStringLiteralFromString("");
        python3Target6.language = "";
        java.util.Locale locale12 = null;
        java.lang.String str13 = pythonStringRenderer0.toString((java.lang.Object) "", "\"\\\"hi!\\\"\"", locale12);
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target15 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator14);
        java.lang.String str17 = python3Target15.getTargetStringLiteralFromString("");
        python3Target15.language = "";
        java.lang.String str20 = python3Target15.getVersion();
        java.util.Locale locale22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = pythonStringRenderer0.toString((java.lang.Object) python3Target15, "DContext", locale22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python3Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"\"\"\"\"" + "'", str4, "\"\"\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"" + "'", str8, "\"\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str13, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\"" + "'", str17, "\"\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4.5.2.1" + "'", str20, "4.5.2.1");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        int int3 = python3Target0.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str8 = python3Target6.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean11 = python3Target10.supportsOverloadedMethods();
        java.lang.String str12 = python3Target10.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python3Target10.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "", true);
        java.lang.String str17 = python3Target10.getVersion();
        org.antlr.v4.tool.Grammar grammar18 = null;
        int[] intArray19 = new int[] {};
        java.lang.String[] strArray20 = python3Target10.getTokenTypesAsTargetLabels(grammar18, intArray19);
        java.lang.String[] strArray21 = python3Target6.getTokenTypesAsTargetLabels(grammar9, intArray19);
        java.lang.String[] strArray22 = python3Target0.getTokenTypesAsTargetLabels(grammar5, intArray19);
        java.lang.String[] strArray45 = new java.lang.String[] { "\"\\\"\\\"\"", "DContext", "", "hi!", "d", "\"\"\"\"\"\"", "\"\"\"\"\"\"", "_tsetPython3", "\"hi!\"", "\"hi!\"", "Hi!Context", "\"\"\"\"\"\"", "\"hi!\"", "12", "\"4.5.2.1\"", "DContext", "Hi!Context", "Python3", "\"hi!\"", "", "\"\"", "\\\"4.5.2.1\\\"" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        python3Target0.badWords = strSet46;
        org.antlr.v4.tool.Grammar grammar49 = null;
        org.stringtemplate.v4.ST sT50 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar49, sT50, "\"\"\\0\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\"\"\"\"" + "'", str8, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"" + "'", str16, "\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "\"\"\"\"\"\"", locale3);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator5);
        java.lang.String str8 = python3Target6.getTargetStringLiteralFromString("");
        python3Target6.language = "";
        java.util.Locale locale12 = null;
        java.lang.String str13 = pythonStringRenderer0.toString((java.lang.Object) "", "\"\\\"hi!\\\"\"", locale12);
        org.antlr.v4.codegen.target.Python3Target python3Target14 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean15 = python3Target14.supportsOverloadedMethods();
        java.lang.String str16 = python3Target14.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        java.lang.String str20 = python3Target14.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator17, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        python3Target14.gen = codeGenerator21;
        java.lang.String[] strArray30 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        python3Target14.badWords = strSet31;
        java.lang.String str34 = python3Target14.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = python3Target14.getCodeGenerator();
        java.util.Locale locale37 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = pythonStringRenderer0.toString((java.lang.Object) python3Target14, "\"@\"", locale37);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python3Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"\"\"\"\"" + "'", str4, "\"\"\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"" + "'", str8, "\"\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str13, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "4.5.2.1" + "'", str16, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\"" + "'", str20, "\"\"");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(codeGenerator35);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        org.antlr.v4.tool.Grammar grammar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target0.getTokenTypeAsTargetLabel(grammar9, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "";
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean4 = python3Target3.supportsOverloadedMethods();
        java.lang.String str5 = python3Target3.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target3.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python3Target3.gen = codeGenerator10;
        java.lang.String[] strArray19 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        python3Target3.badWords = strSet20;
        python3Target0.badWords = strSet20;
        python3Target0.addBadWords();
        boolean boolean25 = python3Target0.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = python3Target0.encodeIntAsCharEscape((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"" + "'", str9, "\"\"");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.gen;
        boolean boolean8 = python3Target1.wantsBaseListener();
        python3Target1.language = "\\35";
        java.lang.String str12 = python3Target1.encodeIntAsCharEscape(29);
        int int13 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.stringtemplate.v4.ST sT15 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genFile(grammar14, sT15, " ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\35" + "'", str12, "\\35");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29 + "'", int13 == 29);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String str3 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "\"\\\"hi!\\\"\"", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target0.getImplicitSetLabel("\"\"\"\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str7, "\"\\\"hi!\\\"\"");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"\"\"", false);
        python3Target0.language = "";
        java.lang.String str11 = python3Target0.getTargetStringLiteralFromString("\"_tsetHi!Context\"", false);
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean13 = python3Target12.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup14 = python3Target12.templates;
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        python3Target12.targetCharValueEscape = strArray17;
        java.lang.String str20 = python3Target12.getTargetStringLiteralFromString("\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = python3Target12.gen;
        org.antlr.v4.codegen.target.Python3Target python3Target22 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean23 = python3Target22.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup24 = python3Target22.templates;
        java.lang.String str25 = python3Target22.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        java.lang.String str29 = python3Target22.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator26, "\"\\\"hi!\\\"\"", true);
        java.util.Set<java.lang.String> strSet30 = python3Target22.badWords;
        python3Target12.badWords = strSet30;
        python3Target0.badWords = strSet30;
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"\"\"\"\"" + "'", str6, "\"\"\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"_tsetHi!Context\"" + "'", str11, "\"_tsetHi!Context\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(sTGroup14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\"\"\"" + "'", str20, "\"\"\"\"");
        org.junit.Assert.assertNull(codeGenerator21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(sTGroup24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4.5.2.1" + "'", str25, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str29, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertNotNull(strSet30);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        java.util.Set<java.lang.String> strSet5 = python3Target0.badWords;
        java.lang.String str6 = python3Target0.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "\"\"\"\"\"\"", locale3);
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray6 = python3Target5.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target5.templates;
        java.util.Locale locale9 = null;
        java.lang.String str10 = pythonStringRenderer0.toString((java.lang.Object) sTGroup7, "\"Hi!Context\"", locale9);
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean12 = python3Target11.supportsOverloadedMethods();
        int int13 = python3Target11.getInlineTestSetWordSize();
        java.lang.String[] strArray14 = python3Target11.targetCharValueEscape;
        java.util.Locale locale16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = pythonStringRenderer0.toString((java.lang.Object) python3Target11, "_\"\\\"\\\"\"", locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python3Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"\"\"\"\"" + "'", str4, "\"\"\"\"\"\"");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNull(sTGroup7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Hi!Context\"" + "'", str10, "\"Hi!Context\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        java.lang.String str7 = python3Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar8 = null;
        int[] intArray9 = new int[] {};
        java.lang.String[] strArray10 = python3Target0.getTokenTypesAsTargetLabels(grammar8, intArray9);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "\"\"\"\"", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target0.getLoopCounter(grammarAST15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"\\\"\"" + "'", str14, "\"\\\"\\\"\"");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "d", true);
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str10 = python3Target8.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean13 = python3Target12.supportsOverloadedMethods();
        java.lang.String str14 = python3Target12.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        java.lang.String str18 = python3Target12.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator15, "", true);
        java.lang.String str19 = python3Target12.getVersion();
        org.antlr.v4.tool.Grammar grammar20 = null;
        int[] intArray21 = new int[] {};
        java.lang.String[] strArray22 = python3Target12.getTokenTypesAsTargetLabels(grammar20, intArray21);
        java.lang.String[] strArray23 = python3Target8.getTokenTypesAsTargetLabels(grammar11, intArray21);
        python3Target0.targetCharValueEscape = strArray23;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = python3Target0.getRuleFunctionContextStructName(ruleFunction25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"\"\"\"\"" + "'", str10, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\"" + "'", str18, "\"\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "4.5.2.1" + "'", str19, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getLanguage();
        java.lang.String str4 = python3Target1.getImplicitSetLabel("Python3");
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator5);
        java.util.Set<java.lang.String> strSet7 = python3Target6.getBadWords();
        python3Target1.badWords = strSet7;
        java.lang.String str10 = python3Target1.getListLabel("\"hi!\"");
        org.antlr.v4.tool.Grammar grammar11 = null;
        int[] intArray12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray13 = python3Target1.getTokenTypesAsTargetLabels(grammar11, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Python3" + "'", str2, "Python3");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tsetPython3" + "'", str4, "_tsetPython3");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"hi!\"" + "'", str10, "\"hi!\"");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str2 = python3Target1.getVersion();
        int int3 = python3Target1.getSerializedATNSegmentLimit();
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", false);
        int int11 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str12 = python3Target0.getVersion();
        boolean boolean13 = python3Target0.supportsOverloadedMethods();
        boolean boolean14 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.tool.Rule rule15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target0.getRuleFunctionContextStructName(rule15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29 + "'", int11 == 29);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        java.lang.String str4 = python3Target0.getTargetStringLiteralFromString("");
        int int5 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray7 = python3Target6.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target6.templates;
        int int9 = python3Target6.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target6.gen;
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str14 = python3Target12.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target16 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean17 = python3Target16.supportsOverloadedMethods();
        java.lang.String str18 = python3Target16.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        java.lang.String str22 = python3Target16.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator19, "", true);
        java.lang.String str23 = python3Target16.getVersion();
        org.antlr.v4.tool.Grammar grammar24 = null;
        int[] intArray25 = new int[] {};
        java.lang.String[] strArray26 = python3Target16.getTokenTypesAsTargetLabels(grammar24, intArray25);
        java.lang.String[] strArray27 = python3Target12.getTokenTypesAsTargetLabels(grammar15, intArray25);
        java.lang.String[] strArray28 = python3Target6.getTokenTypesAsTargetLabels(grammar11, intArray25);
        python3Target0.targetCharValueEscape = strArray28;
        boolean boolean30 = python3Target0.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = python3Target0.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = python3Target0.getAltLabelContextStructName("\\35");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"\"\"" + "'", str2, "\"\"\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 29 + "'", int5 == 29);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNull(sTGroup8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"\"\"\"\"" + "'", str14, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"\"" + "'", str22, "\"\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "4.5.2.1" + "'", str23, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(codeGenerator31);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str9 = python3Target0.getLanguage();
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray11 = python3Target10.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target10.templates;
        int int13 = python3Target10.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python3Target10.gen;
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target16 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str18 = python3Target16.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target20 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean21 = python3Target20.supportsOverloadedMethods();
        java.lang.String str22 = python3Target20.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        java.lang.String str26 = python3Target20.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator23, "", true);
        java.lang.String str27 = python3Target20.getVersion();
        org.antlr.v4.tool.Grammar grammar28 = null;
        int[] intArray29 = new int[] {};
        java.lang.String[] strArray30 = python3Target20.getTokenTypesAsTargetLabels(grammar28, intArray29);
        java.lang.String[] strArray31 = python3Target16.getTokenTypesAsTargetLabels(grammar19, intArray29);
        java.lang.String[] strArray32 = python3Target10.getTokenTypesAsTargetLabels(grammar15, intArray29);
        python3Target0.targetCharValueEscape = strArray32;
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = null;
        java.lang.String str37 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator34, "\"12\"", false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\"\"" + "'", str8, "\"\"\"\"");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNull(sTGroup12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertNull(codeGenerator14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\"\"\"\"\"" + "'", str18, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4.5.2.1" + "'", str22, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"\"" + "'", str26, "\"\"");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "4.5.2.1" + "'", str27, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[]");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "12" + "'", str37, "12");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        int int9 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        python3Target0.genRecognizerHeaderFile(grammar10, sT11, "_tset12");
        java.util.Set<java.lang.String> strSet14 = python3Target0.getBadWords();
        org.antlr.v4.tool.Grammar grammar15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target0.getTokenTypeAsTargetLabel(grammar15, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"hi!\"");
        java.lang.String str11 = python3Target0.language;
        boolean boolean12 = python3Target0.wantsBaseListener();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\"\"" + "'", str8, "\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"hi!\"\"" + "'", str10, "\"\"hi!\"\"");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target4 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean5 = python3Target4.supportsOverloadedMethods();
        java.lang.String str6 = python3Target4.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target4.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        java.lang.String str11 = python3Target4.getVersion();
        org.antlr.v4.tool.Grammar grammar12 = null;
        int[] intArray13 = new int[] {};
        java.lang.String[] strArray14 = python3Target4.getTokenTypesAsTargetLabels(grammar12, intArray13);
        java.lang.String[] strArray15 = python3Target0.getTokenTypesAsTargetLabels(grammar3, intArray13);
        java.lang.String[] strArray16 = python3Target0.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray16;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"\"\"" + "'", str2, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        java.lang.String str7 = python3Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar8 = null;
        int[] intArray9 = new int[] {};
        java.lang.String[] strArray10 = python3Target0.getTokenTypesAsTargetLabels(grammar8, intArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getAltLabelContextStructName("\"\"\\0\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet2 = python3Target0.badWords;
        boolean boolean3 = python3Target0.templatesExist();
        python3Target0.addBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str11 = python3Target0.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target0.templates;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target0.getRuleFunctionContextStructName(ruleFunction13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\"\"" + "'", str8, "\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"\"\"" + "'", str10, "\"\"\"\"");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(sTGroup12);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target0.getCodeGenerator();
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("\"4.5.2.1\"");
        python3Target0.addBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getImplicitTokenLabel("\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"4.5.2.1\"\"" + "'", str9, "\"\"4.5.2.1\"\"");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python3Target0.gen = codeGenerator3;
        java.lang.String str5 = python3Target0.getVersion();
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean7 = python3Target6.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target6.templates;
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        python3Target6.genRecognizerHeaderFile(grammar9, sT10, "");
        python3Target6.language = "Python3";
        int int15 = python3Target6.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup16 = python3Target6.loadTemplates();
        python3Target0.templates = sTGroup16;
        org.antlr.v4.tool.Rule rule18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target0.getRuleFunctionContextStructName(rule18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"\"\"" + "'", str2, "\"\"\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(sTGroup8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
        org.junit.Assert.assertNotNull(sTGroup16);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python3Target0.templates = sTGroup9;
        java.lang.String[] strArray11 = python3Target0.targetCharValueEscape;
        int int12 = python3Target0.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target0.templates;
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target0.getLoopLabel(grammarAST14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\"\"" + "'", str8, "\"\"\"\"");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 64 + "'", int12 == 64);
        org.junit.Assert.assertNull(sTGroup13);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", false);
        java.util.Set<java.lang.String> strSet11 = python3Target0.badWords;
        java.lang.String str13 = python3Target0.getTargetStringLiteralFromString("12");
        int int14 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Rule rule15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target0.getRuleFunctionContextStructName(rule15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"12\"" + "'", str13, "\"12\"");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        python3Target0.language = "Python3";
        java.util.Set<java.lang.String> strSet9 = null;
        python3Target0.badWords = strSet9;
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getLoopLabel(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        java.lang.String str7 = python3Target0.getLanguage();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        python3Target0.language = "Python3";
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        python3Target0.genRecognizerHeaderFile(grammar9, sT10, "\"hi!\"");
        java.lang.Class<?> wildcardClass13 = python3Target0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        python3Target0.gen = codeGenerator4;
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        java.lang.String str4 = python3Target0.getTargetStringLiteralFromString("12");
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.stringtemplate.v4.ST sT6 = null;
        python3Target0.genRecognizerHeaderFile(grammar5, sT6, "");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target0.getRuleFunctionContextStructName(ruleFunction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"12\"" + "'", str4, "\"12\"");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", false);
        java.util.Set<java.lang.String> strSet11 = python3Target0.badWords;
        java.lang.String str13 = python3Target0.getTargetStringLiteralFromString("12");
        int int14 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        java.lang.String str18 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator15, "d", false);
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup19 = python3Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"12\"" + "'", str13, "\"12\"");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str5 = python3Target3.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean7 = python3Target6.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet8 = python3Target6.badWords;
        python3Target3.badWords = strSet8;
        python3Target1.badWords = strSet8;
        java.util.Set<java.lang.String> strSet11 = python3Target1.badWords;
        java.lang.String str12 = python3Target1.language;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        boolean boolean14 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python3Target1.gen;
        org.antlr.v4.tool.Rule rule16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.getRuleFunctionContextStructName(rule16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"\"\"\"\"" + "'", str5, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Python3" + "'", str12, "Python3");
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(codeGenerator15);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        python3Target0.language = "Python3";
        java.util.Set<java.lang.String> strSet9 = null;
        python3Target0.badWords = strSet9;
        boolean boolean11 = python3Target0.wantsBaseVisitor();
        java.lang.String str13 = python3Target0.getImplicitSetLabel("Python3");
        int int14 = python3Target0.getInlineTestSetWordSize();
        java.lang.String str15 = python3Target0.language;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target0.getRuleFunctionContextStructName(ruleFunction16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_tsetPython3" + "'", str13, "_tsetPython3");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 64 + "'", int14 == 64);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python3" + "'", str15, "Python3");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str11 = python3Target0.getLanguage();
        org.antlr.v4.tool.Grammar grammar12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target0.getTokenTypeAsTargetLabel(grammar12, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\"\"" + "'", str8, "\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"\"\"" + "'", str10, "\"\"\"\"");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "\"\\12\"", false);
        org.antlr.v4.tool.Grammar grammar7 = null;
        int[] intArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = python3Target0.getTokenTypesAsTargetLabels(grammar7, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "12" + "'", str6, "12");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target0.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator5);
        java.lang.String str8 = python3Target6.getTargetStringLiteralFromString("");
        int int9 = python3Target6.getSerializedATNSegmentLimit();
        boolean boolean10 = python3Target6.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target6.loadTemplates();
        python3Target0.templates = sTGroup11;
        java.lang.String str13 = python3Target0.language;
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target0.getLoopCounter(grammarAST14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"" + "'", str8, "\"\"");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = null;
        python3Target0.templates = sTGroup4;
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.templates;
        java.lang.String[] strArray7 = python3Target0.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet8 = python3Target0.badWords;
        java.util.Set<java.lang.String> strSet9 = python3Target0.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = python3Target0.grammarSymbolCausesIssueInGeneratedCode(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(sTGroup6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.gen;
        boolean boolean8 = python3Target1.wantsBaseListener();
        int int9 = python3Target1.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getElementName("\"_tset12\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        java.lang.String str3 = python3Target1.language;
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = python3Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Python3" + "'", str3, "Python3");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", false);
        java.util.Set<java.lang.String> strSet11 = python3Target0.badWords;
        java.lang.String str13 = python3Target0.getTargetStringLiteralFromString("12");
        int int14 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        java.lang.String str18 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator15, "d", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"12\"" + "'", str13, "\"12\"");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String[] strArray11 = python3Target0.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray11;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\"\"" + "'", str8, "\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"\"\"" + "'", str10, "\"\"\"\"");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python3Target0.gen = codeGenerator3;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        python3Target0.gen = codeGenerator5;
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(sTGroup2);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", false);
        java.util.Set<java.lang.String> strSet11 = python3Target0.badWords;
        java.lang.String str13 = python3Target0.getTargetStringLiteralFromString("12");
        boolean boolean14 = python3Target0.wantsBaseVisitor();
        java.lang.String str15 = python3Target0.language;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target0.getImplicitRuleLabel("\"\\\"\\\"\\\\0\\\"\\\"\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"12\"" + "'", str13, "\"12\"");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        java.lang.String[] strArray16 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        python3Target0.badWords = strSet17;
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = python3Target0.gen;
        java.lang.String str23 = python3Target0.getTargetStringLiteralFromString("\\12", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        java.lang.String str27 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator24, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator28 = null;
        python3Target0.gen = codeGenerator28;
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup30 = python3Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(codeGenerator20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"\\12\"" + "'", str23, "\"\\12\"");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"\"" + "'", str27, "\"\"");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "";
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean4 = python3Target3.supportsOverloadedMethods();
        java.lang.String str5 = python3Target3.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target3.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python3Target3.gen = codeGenerator10;
        java.lang.String[] strArray19 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        python3Target3.badWords = strSet20;
        python3Target0.badWords = strSet20;
        java.lang.String str25 = python3Target0.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str26 = python3Target0.getLanguage();
        java.lang.String[] strArray27 = new java.lang.String[] {};
        python3Target0.targetCharValueEscape = strArray27;
        java.lang.String str31 = python3Target0.getTargetStringLiteralFromString("", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = python3Target0.getElementName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"" + "'", str9, "\"\"");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\"\"" + "'", str31, "\"\"");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python3Target1.gen = codeGenerator3;
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("hi!");
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("\"hi!\"", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python3Target1.gen = codeGenerator10;
        java.lang.String str12 = python3Target1.language;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hi!Context" + "'", str6, "Hi!Context");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str9, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Python3" + "'", str12, "Python3");
        org.junit.Assert.assertNotNull(sTGroup13);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "";
        java.lang.String[] strArray3 = python3Target0.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray3;
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray9 = python3Target8.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        int int11 = python3Target8.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target8.gen;
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target14 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str16 = python3Target14.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar17 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target18 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean19 = python3Target18.supportsOverloadedMethods();
        java.lang.String str20 = python3Target18.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        java.lang.String str24 = python3Target18.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator21, "", true);
        java.lang.String str25 = python3Target18.getVersion();
        org.antlr.v4.tool.Grammar grammar26 = null;
        int[] intArray27 = new int[] {};
        java.lang.String[] strArray28 = python3Target18.getTokenTypesAsTargetLabels(grammar26, intArray27);
        java.lang.String[] strArray29 = python3Target14.getTokenTypesAsTargetLabels(grammar17, intArray27);
        java.lang.String[] strArray30 = python3Target8.getTokenTypesAsTargetLabels(grammar13, intArray27);
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray30;
        python3Target0.targetCharValueEscape = strArray30;
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = python3Target0.getCodeGenerator();
        org.antlr.v4.tool.ast.GrammarAST grammarAST34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = python3Target0.getLoopLabel(grammarAST34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(sTGroup10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"\"\"\"\"" + "'", str16, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4.5.2.1" + "'", str20, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"\"" + "'", str24, "\"\"");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4.5.2.1" + "'", str25, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNull(codeGenerator33);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str5 = python3Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.loadTemplates();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.getTemplates();
        java.util.Set<java.lang.String> strSet8 = null;
        python3Target1.badWords = strSet8;
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getLoopLabel(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertNotNull(sTGroup7);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        org.antlr.v4.codegen.target.Python3Target python3Target7 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray8 = python3Target7.targetCharValueEscape;
        python3Target0.targetCharValueEscape = strArray8;
        python3Target0.addBadWords();
        int int11 = python3Target0.getInlineTestSetWordSize();
        java.lang.String[] strArray12 = python3Target0.targetCharValueEscape;
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup13 = python3Target0.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str5 = python3Target3.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean7 = python3Target6.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet8 = python3Target6.badWords;
        python3Target3.badWords = strSet8;
        python3Target1.badWords = strSet8;
        java.util.Set<java.lang.String> strSet11 = python3Target1.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target1.getCodeGenerator();
        java.lang.String str14 = python3Target1.getImplicitSetLabel("12");
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.stringtemplate.v4.ST sT16 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genFile(grammar15, sT16, "\"\"\"hi!\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"\"\"\"\"" + "'", str5, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset12" + "'", str14, "_tset12");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = null;
        python3Target0.templates = sTGroup4;
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.templates;
        org.antlr.v4.codegen.target.Python3Target python3Target7 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray8 = python3Target7.targetCharValueEscape;
        python3Target7.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator10);
        java.lang.String str13 = python3Target11.getTargetStringLiteralFromString("");
        int int14 = python3Target11.getSerializedATNSegmentLimit();
        boolean boolean15 = python3Target11.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup16 = python3Target11.loadTemplates();
        python3Target7.templates = sTGroup16;
        python3Target0.templates = sTGroup16;
        java.lang.String str20 = python3Target0.getListLabel("\"\"");
        java.lang.String str21 = python3Target0.language;
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.stringtemplate.v4.ST sT23 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar22, sT23, "_tset_12");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(sTGroup6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\"" + "'", str13, "\"\"");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(sTGroup16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\"" + "'", str20, "\"\"");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target0.genRecognizerHeaderFile(grammar4, sT5, "_tsetPython3");
        boolean boolean8 = python3Target0.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target0.getListLabel("\"\"\"\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target0.gen = codeGenerator7;
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("Python3");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target0.getListLabel("\"hi!\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"Python3\"" + "'", str10, "\"Python3\"");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        python3Target1.language = "";
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("\"4.5.2.1\"", false);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!" };
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray10;
        python3Target1.targetCharValueEscape = strArray10;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getRuleFunctionContextStructName(ruleFunction13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\\"4.5.2.1\\\"" + "'", str8, "\\\"4.5.2.1\\\"");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"");
        boolean boolean11 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.stringtemplate.v4.ST sT13 = null;
        python3Target0.genRecognizerHeaderFile(grammar12, sT13, "");
        java.lang.Class<?> wildcardClass16 = python3Target0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\"\"" + "'", str8, "\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"\"\"" + "'", str10, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python3Target0.gen = codeGenerator3;
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str8 = python3Target6.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean11 = python3Target10.supportsOverloadedMethods();
        java.lang.String str12 = python3Target10.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python3Target10.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "", true);
        java.lang.String str17 = python3Target10.getVersion();
        org.antlr.v4.tool.Grammar grammar18 = null;
        int[] intArray19 = new int[] {};
        java.lang.String[] strArray20 = python3Target10.getTokenTypesAsTargetLabels(grammar18, intArray19);
        java.lang.String[] strArray21 = python3Target6.getTokenTypesAsTargetLabels(grammar9, intArray19);
        java.lang.String[] strArray22 = python3Target0.getTokenTypesAsTargetLabels(grammar5, intArray19);
        java.lang.String str23 = python3Target0.language;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = python3Target0.getRuleFunctionContextStructName(ruleFunction24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"\"\"" + "'", str2, "\"\"\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\"\"\"\"" + "'", str8, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"" + "'", str16, "\"\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[]");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        java.lang.Class<?> wildcardClass3 = strSet2.getClass();
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.gen;
        boolean boolean8 = python3Target1.wantsBaseListener();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getLoopLabel(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        python3Target1.gen = codeGenerator3;
        java.lang.String str6 = python3Target1.getAltLabelContextStructName("hi!");
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("\"hi!\"", true);
        int int10 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Rule rule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getRuleFunctionContextStructName(rule11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hi!Context" + "'", str6, "Hi!Context");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str9, "\"\\\"hi!\\\"\"");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        java.lang.String str7 = python3Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar8 = null;
        int[] intArray9 = new int[] {};
        java.lang.String[] strArray10 = python3Target0.getTokenTypesAsTargetLabels(grammar8, intArray9);
        java.lang.String[] strArray11 = python3Target0.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet12 = python3Target0.badWords;
        python3Target0.addBadWords();
        java.lang.String str15 = python3Target0.getTargetStringLiteralFromString("\"\\1\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target0.getLoopCounter(grammarAST16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\"\\1\"\"" + "'", str15, "\"\"\\1\"\"");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "";
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean4 = python3Target3.supportsOverloadedMethods();
        java.lang.String str5 = python3Target3.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target3.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python3Target3.gen = codeGenerator10;
        java.lang.String[] strArray19 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        python3Target3.badWords = strSet20;
        python3Target0.badWords = strSet20;
        python3Target0.addBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = python3Target0.getLoopCounter(grammarAST25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"" + "'", str9, "\"\"");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "", true);
        java.lang.String str7 = python3Target0.getVersion();
        org.antlr.v4.tool.Grammar grammar8 = null;
        int[] intArray9 = new int[] {};
        java.lang.String[] strArray10 = python3Target0.getTokenTypesAsTargetLabels(grammar8, intArray9);
        java.lang.String[] strArray11 = python3Target0.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet12 = python3Target0.badWords;
        org.antlr.v4.tool.Grammar grammar13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target0.getTokenTypeAsTargetLabel(grammar13, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"" + "'", str6, "\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String str3 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "\"\\\"hi!\\\"\"", true);
        org.antlr.v4.tool.Grammar grammar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target0.getTokenTypeAsTargetLabel(grammar8, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4.5.2.1" + "'", str3, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str7, "\"\\\"hi!\\\"\"");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target0.genRecognizerHeaderFile(grammar3, sT4, "");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target0.getCodeGenerator();
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray9 = python3Target8.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        int int11 = python3Target8.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target8.gen;
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target14 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str16 = python3Target14.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar17 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target18 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean19 = python3Target18.supportsOverloadedMethods();
        java.lang.String str20 = python3Target18.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        java.lang.String str24 = python3Target18.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator21, "", true);
        java.lang.String str25 = python3Target18.getVersion();
        org.antlr.v4.tool.Grammar grammar26 = null;
        int[] intArray27 = new int[] {};
        java.lang.String[] strArray28 = python3Target18.getTokenTypesAsTargetLabels(grammar26, intArray27);
        java.lang.String[] strArray29 = python3Target14.getTokenTypesAsTargetLabels(grammar17, intArray27);
        java.lang.String[] strArray30 = python3Target8.getTokenTypesAsTargetLabels(grammar13, intArray27);
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray30;
        python3Target0.targetCharValueEscape = strArray30;
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = python3Target0.getCodeGenerator();
        org.antlr.v4.tool.Rule rule34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = python3Target0.getRuleFunctionContextStructName(rule34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(sTGroup10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 64 + "'", int11 == 64);
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\"\"\"\"\"" + "'", str16, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4.5.2.1" + "'", str20, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"\"" + "'", str24, "\"\"");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4.5.2.1" + "'", str25, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNull(codeGenerator33);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "";
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean4 = python3Target3.supportsOverloadedMethods();
        java.lang.String str5 = python3Target3.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target3.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python3Target3.gen = codeGenerator10;
        java.lang.String[] strArray19 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        python3Target3.badWords = strSet20;
        python3Target0.badWords = strSet20;
        java.lang.String str25 = python3Target0.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str26 = python3Target0.getLanguage();
        java.lang.String str28 = python3Target0.getTargetStringLiteralFromString("\"\\0\"");
        org.antlr.v4.tool.Grammar grammar29 = null;
        org.stringtemplate.v4.ST sT30 = null;
        python3Target0.genRecognizerHeaderFile(grammar29, sT30, "\"\"\"\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = python3Target0.getListLabel("\"tset\\\"\\\"\\\"hi!\\\"\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"" + "'", str9, "\"\"");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"\"\\0\"\"" + "'", str28, "\"\"\\0\"\"");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        java.lang.String str4 = python3Target1.getAltLabelContextStructName("d");
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.getTemplates();
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.getTemplates();
        python3Target1.language = "\"\"";
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator10, "\\\"4.5.2.1\\\"", false);
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.stringtemplate.v4.ST sT15 = null;
        python3Target1.genRecognizerHeaderFile(grammar14, sT15, "\\\"hi!\\\"");
        org.antlr.v4.tool.Grammar grammar18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python3Target1.getTokenTypeAsTargetLabel(grammar18, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DContext" + "'", str4, "DContext");
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\\"4.5.2.1\\\"" + "'", str13, "\\\"4.5.2.1\\\"");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet2 = python3Target0.badWords;
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.templatesExist();
        java.lang.Class<?> wildcardClass5 = python3Target0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = null;
        java.lang.String str6 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator3, "\"\\12\"", false);
        java.lang.String str7 = python3Target0.getLanguage();
        java.lang.String str9 = python3Target0.getTargetStringLiteralFromString("Hi!Context");
        java.lang.String[] strArray10 = python3Target0.targetCharValueEscape;
        java.lang.Class<?> wildcardClass11 = python3Target0.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "12" + "'", str6, "12");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"Hi!Context\"" + "'", str9, "\"Hi!Context\"");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = null;
        python3Target0.templates = sTGroup4;
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.templates;
        java.lang.String[] strArray7 = python3Target0.targetCharValueEscape;
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"12\"", false);
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean12 = python3Target11.supportsOverloadedMethods();
        java.lang.String str13 = python3Target11.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python3Target11.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup15 = null;
        python3Target11.templates = sTGroup15;
        org.stringtemplate.v4.STGroup sTGroup17 = python3Target11.templates;
        java.lang.String[] strArray18 = python3Target11.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet19 = python3Target11.badWords;
        java.util.Set<java.lang.String> strSet20 = python3Target11.getBadWords();
        python3Target0.badWords = strSet20;
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target23 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator22);
        java.util.Set<java.lang.String> strSet24 = python3Target23.getBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target25 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str27 = python3Target25.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.codegen.target.Python3Target python3Target28 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean29 = python3Target28.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet30 = python3Target28.badWords;
        python3Target25.badWords = strSet30;
        python3Target23.badWords = strSet30;
        java.util.Set<java.lang.String> strSet33 = python3Target23.badWords;
        java.lang.String str34 = python3Target23.language;
        org.stringtemplate.v4.STGroup sTGroup35 = python3Target23.getTemplates();
        python3Target0.templates = sTGroup35;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = python3Target0.getElementName("\\\"hi!\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(sTGroup6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"12\"" + "'", str10, "\"12\"");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator14);
        org.junit.Assert.assertNull(sTGroup17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"\"\"\"\"\"" + "'", str27, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Python3" + "'", str34, "Python3");
        org.junit.Assert.assertNotNull(sTGroup35);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        org.stringtemplate.v4.STGroup sTGroup9 = null;
        python3Target0.templates = sTGroup9;
        java.lang.String str11 = python3Target0.getVersion();
        java.lang.String str14 = python3Target0.getTargetStringLiteralFromString("_tset\"\\\"Python3\\\"\"", true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\"\"" + "'", str8, "\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"_tset\"\\\"Python3\\\"\"\"" + "'", str14, "\"_tset\"\\\"Python3\\\"\"\"");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.lang.String str2 = python3Target0.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target0.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup4 = null;
        python3Target0.templates = sTGroup4;
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target0.templates;
        java.lang.String[] strArray7 = python3Target0.targetCharValueEscape;
        org.antlr.v4.tool.Rule rule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target0.getRuleFunctionContextStructName(rule8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4.5.2.1" + "'", str2, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertNull(sTGroup6);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet2 = python3Target0.badWords;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python3Target0.getRuleFunctionContextStructName(ruleFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target1.getLoopLabel(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("");
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.gen;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean9 = python3Target8.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target8.templates;
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python3Target8.genRecognizerHeaderFile(grammar11, sT12, "");
        python3Target8.language = "Python3";
        int int17 = python3Target8.getSerializedATNSegmentLimit();
        org.stringtemplate.v4.STGroup sTGroup18 = python3Target8.loadTemplates();
        python3Target1.templates = sTGroup18;
        java.lang.String str20 = python3Target1.getVersion();
        java.util.Set<java.lang.String> strSet21 = python3Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = python3Target1.getLoopLabel(grammarAST22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\"" + "'", str3, "\"\"");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(sTGroup6);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(sTGroup10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 29 + "'", int17 == 29);
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4.5.2.1" + "'", str20, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str5 = python3Target3.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean7 = python3Target6.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet8 = python3Target6.badWords;
        python3Target3.badWords = strSet8;
        python3Target1.badWords = strSet8;
        java.util.Set<java.lang.String> strSet11 = python3Target1.badWords;
        java.lang.String str12 = python3Target1.language;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getElementListName("4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"\"\"\"\"" + "'", str5, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Python3" + "'", str12, "Python3");
        org.junit.Assert.assertNotNull(sTGroup13);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet2 = python3Target0.badWords;
        int int3 = python3Target0.getInlineTestSetWordSize();
        boolean boolean4 = python3Target0.templatesExist();
        java.util.Set<java.lang.String> strSet5 = python3Target0.badWords;
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target0.genRecognizerHeaderFile(grammar6, sT7, "\\0");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target0.getElementName("\"\\\"Python3\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray1 = python3Target0.targetCharValueEscape;
        java.lang.String str2 = python3Target0.language;
        int int3 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "d", true);
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str10 = python3Target8.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean13 = python3Target12.supportsOverloadedMethods();
        java.lang.String str14 = python3Target12.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        java.lang.String str18 = python3Target12.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator15, "", true);
        java.lang.String str19 = python3Target12.getVersion();
        org.antlr.v4.tool.Grammar grammar20 = null;
        int[] intArray21 = new int[] {};
        java.lang.String[] strArray22 = python3Target12.getTokenTypesAsTargetLabels(grammar20, intArray21);
        java.lang.String[] strArray23 = python3Target8.getTokenTypesAsTargetLabels(grammar11, intArray21);
        python3Target0.targetCharValueEscape = strArray23;
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        java.lang.String str28 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator25, "#", false);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\"" + "'", str7, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"\"\"\"\"" + "'", str10, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\"\"" + "'", str18, "\"\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "4.5.2.1" + "'", str19, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet2 = python3Target0.badWords;
        boolean boolean3 = python3Target0.supportsOverloadedMethods();
        boolean boolean4 = python3Target0.supportsOverloadedMethods();
        int int5 = python3Target0.getSerializedATNSegmentLimit();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 29 + "'", int5 == 29);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target0.getTargetStringLiteralFromString("\"\"");
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromString("\"\"");
        python3Target0.language = "\\1";
        boolean boolean13 = python3Target0.wantsBaseVisitor();
        org.antlr.v4.tool.Rule rule14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target0.getRuleFunctionContextStructName(rule14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\"\"\"" + "'", str8, "\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"\"\"" + "'", str10, "\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "";
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean4 = python3Target3.supportsOverloadedMethods();
        java.lang.String str5 = python3Target3.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target3.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python3Target3.gen = codeGenerator10;
        java.lang.String[] strArray19 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        python3Target3.badWords = strSet20;
        python3Target0.badWords = strSet20;
        org.stringtemplate.v4.STGroup sTGroup24 = python3Target0.templates;
        java.lang.String str27 = python3Target0.getTargetStringLiteralFromString("\"\"\\0\"\"", true);
        boolean boolean28 = python3Target0.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = python3Target0.getElementName("\"\"hi!\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"" + "'", str9, "\"\"");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(sTGroup24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"\"\"\\0\"\"\"" + "'", str27, "\"\"\"\\0\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.util.Set<java.lang.String> strSet2 = python3Target1.getBadWords();
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str5 = python3Target3.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean7 = python3Target6.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet8 = python3Target6.badWords;
        python3Target3.badWords = strSet8;
        python3Target1.badWords = strSet8;
        java.util.Set<java.lang.String> strSet11 = python3Target1.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target1.getCodeGenerator();
        java.lang.String str14 = python3Target1.getImplicitSetLabel("12");
        java.lang.String str15 = python3Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.getImplicitTokenLabel("\"\"\\1\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"\"\"\"\"" + "'", str5, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset12" + "'", str14, "_tset12");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python3" + "'", str15, "Python3");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean1 = python3Target0.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup2 = python3Target0.templates;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        python3Target0.targetCharValueEscape = strArray5;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", false);
        int int11 = python3Target0.getSerializedATNSegmentLimit();
        java.lang.String str12 = python3Target0.getVersion();
        boolean boolean13 = python3Target0.supportsOverloadedMethods();
        boolean boolean14 = python3Target0.wantsBaseVisitor();
        java.lang.String str16 = python3Target0.encodeIntAsCharEscape(100);
        org.antlr.v4.tool.ast.GrammarAST grammarAST17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python3Target0.getLoopLabel(grammarAST17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(sTGroup2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29 + "'", int11 == 29);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4.5.2.1" + "'", str12, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "d" + "'", str16, "d");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        python3Target0.language = "";
        org.antlr.v4.codegen.target.Python3Target python3Target3 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean4 = python3Target3.supportsOverloadedMethods();
        java.lang.String str5 = python3Target3.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target3.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python3Target3.gen = codeGenerator10;
        java.lang.String[] strArray19 = new java.lang.String[] { "\"\"\"\"", "\\12", "\"\"", "4.5.2.1", "", "\"\"\"\"", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        python3Target3.badWords = strSet20;
        python3Target0.badWords = strSet20;
        java.lang.String str25 = python3Target0.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String str27 = python3Target0.getTargetStringLiteralFromString("12");
        java.lang.String str29 = python3Target0.getTargetStringLiteralFromString("\"_tset12\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = python3Target0.getImplicitTokenLabel("#");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\"" + "'", str9, "\"\"");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"12\"" + "'", str27, "\"12\"");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\"\"_tset12\"\"" + "'", str29, "\"\"_tset12\"\"");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str2 = python3Target0.getTargetStringLiteralFromString("\"\"\"\"");
        java.lang.String str4 = python3Target0.getTargetStringLiteralFromString("");
        int int5 = python3Target0.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String[] strArray7 = python3Target6.targetCharValueEscape;
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target6.templates;
        int int9 = python3Target6.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target6.gen;
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str14 = python3Target12.getTargetStringLiteralFromString("\"\"\"\"");
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target16 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean17 = python3Target16.supportsOverloadedMethods();
        java.lang.String str18 = python3Target16.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        java.lang.String str22 = python3Target16.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator19, "", true);
        java.lang.String str23 = python3Target16.getVersion();
        org.antlr.v4.tool.Grammar grammar24 = null;
        int[] intArray25 = new int[] {};
        java.lang.String[] strArray26 = python3Target16.getTokenTypesAsTargetLabels(grammar24, intArray25);
        java.lang.String[] strArray27 = python3Target12.getTokenTypesAsTargetLabels(grammar15, intArray25);
        java.lang.String[] strArray28 = python3Target6.getTokenTypesAsTargetLabels(grammar11, intArray25);
        python3Target0.targetCharValueEscape = strArray28;
        boolean boolean30 = python3Target0.wantsBaseListener();
        org.antlr.v4.codegen.target.Python3Target python3Target31 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean32 = python3Target31.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup33 = python3Target31.templates;
        org.antlr.v4.tool.Grammar grammar34 = null;
        org.stringtemplate.v4.ST sT35 = null;
        python3Target31.genRecognizerHeaderFile(grammar34, sT35, "");
        python3Target31.language = "Python3";
        java.util.Set<java.lang.String> strSet40 = null;
        python3Target31.badWords = strSet40;
        boolean boolean42 = python3Target31.wantsBaseVisitor();
        java.lang.String str44 = python3Target31.getImplicitSetLabel("Python3");
        org.antlr.v4.codegen.target.Python3Target python3Target45 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean46 = python3Target45.supportsOverloadedMethods();
        java.lang.String str47 = python3Target45.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator48 = python3Target45.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup49 = null;
        python3Target45.templates = sTGroup49;
        org.stringtemplate.v4.STGroup sTGroup51 = python3Target45.templates;
        java.lang.String[] strArray52 = python3Target45.targetCharValueEscape;
        java.lang.String str55 = python3Target45.getTargetStringLiteralFromString("\"12\"", false);
        org.antlr.v4.codegen.target.Python3Target python3Target56 = new org.antlr.v4.codegen.target.Python3Target();
        boolean boolean57 = python3Target56.supportsOverloadedMethods();
        java.lang.String str58 = python3Target56.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator59 = python3Target56.getCodeGenerator();
        org.stringtemplate.v4.STGroup sTGroup60 = null;
        python3Target56.templates = sTGroup60;
        org.stringtemplate.v4.STGroup sTGroup62 = python3Target56.templates;
        java.lang.String[] strArray63 = python3Target56.targetCharValueEscape;
        java.util.Set<java.lang.String> strSet64 = python3Target56.badWords;
        java.util.Set<java.lang.String> strSet65 = python3Target56.getBadWords();
        python3Target45.badWords = strSet65;
        python3Target31.badWords = strSet65;
        python3Target0.badWords = strSet65;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"\"\"\"\"\"" + "'", str2, "\"\"\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 29 + "'", int5 == 29);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNull(sTGroup8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertNull(codeGenerator10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\"\"\"\"\"" + "'", str14, "\"\"\"\"\"\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"\"" + "'", str22, "\"\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "4.5.2.1" + "'", str23, "4.5.2.1");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[]");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(sTGroup33);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "_tsetPython3" + "'", str44, "_tsetPython3");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "4.5.2.1" + "'", str47, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator48);
        org.junit.Assert.assertNull(sTGroup51);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\"12\"" + "'", str55, "\"12\"");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "4.5.2.1" + "'", str58, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator59);
        org.junit.Assert.assertNull(sTGroup62);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(strSet64);
        org.junit.Assert.assertNotNull(strSet65);
    }
}

