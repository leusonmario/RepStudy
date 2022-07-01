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
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = python3Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        python3Target1.addBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = python3Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\"" + "'", str1, "\"\"");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = python3Target1.getElementListName("hi!");
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
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getTokenTypeAsTargetLabel(grammar6, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertNull(codeGenerator5);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        python3Target1.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        python3Target1.gen = codeGenerator5;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getElementListName("\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.stringtemplate.v4.ST sT6 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genFile(grammar5, sT6, "\\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target1.getLoopLabel(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String[] strArray5 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target1.targetCharValueEscape = strArray5;
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genListenerFile(grammar7, sT8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.Class<?> wildcardClass2 = python3Target1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getLoopLabel(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target1.getLoopLabel(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNull(sTGroup4);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getListLabel("hi!");
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genFile(grammar8, sT9, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        python3Target1.language = "\"\"";
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getImplicitTokenLabel("\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String[] strArray5 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target1.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = python3Target1.gen;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertNull(codeGenerator9);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        python3Target1.addBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target1.getElementListName("4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python3Target1.getLoopCounter(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.loadTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup7);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("4.5.2.1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4.5.2.1" + "'", str1, "4.5.2.1");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = python3Target1.getElementListName("\"\\\\nContext\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String[] strArray5 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target1.targetCharValueEscape = strArray5;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getElementName("_tset");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\\n");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\n" + "'", str1, "\\n");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target1.getElementListName("4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.gen;
        org.antlr.v4.tool.Rule rule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getRuleFunctionContextStructName(rule7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertNull(sTGroup5);
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.loadTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getLoopCounter(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup7);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.ast.GrammarAST grammarAST2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = python3Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.Rule rule3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python3Target1.getRuleFunctionContextStructName(rule3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target1.gen;
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = python3Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.templates;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getElementName("\\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertNull(sTGroup5);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target1.gen = codeGenerator7;
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getLoopLabel(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target2 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator1);
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target2.genRecognizerHeaderFile(grammar3, sT4, "hi!");
        java.lang.String str7 = python3Target2.getVersion();
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target2.loadTemplates();
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = pythonStringRenderer0.toString((java.lang.Object) python3Target2, "tset4.5.2.", locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python3Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4.5.2.1" + "'", str7, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup8);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        python3Target1.language = "tset4.5.2.";
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getLoopCounter(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "", true);
        java.lang.String str6 = python3Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = python3Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        boolean boolean8 = python3Target1.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getElementName("\"4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.loadTemplates();
        java.util.Set<java.lang.String> strSet8 = python3Target1.badWords;
        org.antlr.v4.tool.Grammar grammar9 = null;
        int[] intArray10 = new int[] {};
        java.lang.String[] strArray11 = python3Target1.getTokenTypesAsTargetLabels(grammar9, intArray10);
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.stringtemplate.v4.ST sT13 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genFile(grammar12, sT13, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        boolean boolean4 = python3Target1.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator8);
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        python3Target9.genRecognizerHeaderFile(grammar10, sT11, "hi!");
        java.lang.String str14 = python3Target9.getVersion();
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target9.loadTemplates();
        python3Target1.templates = sTGroup15;
        java.lang.String str18 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.tool.ast.GrammarAST grammarAST19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python3Target1.getLoopCounter(grammarAST19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset4.5.2.1" + "'", str18, "_tset4.5.2.1");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getListLabel("hi!");
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genListenerFile(grammar8, sT9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getListLabel("hi!");
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("\\nContext");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getElementListName("\"\\\\nContext\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\\nContext\"" + "'", str9, "\"\\\\nContext\"");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        python3Target1.language = "\"\"";
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "", false);
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.stringtemplate.v4.ST sT13 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genFile(grammar12, sT13, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("4.5.2.1");
        org.antlr.v4.tool.ast.GrammarAST grammarAST6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = python3Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"4.5.2.1\"" + "'", str5, "\"4.5.2.1\"");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "_tset4.5.2.1", false);
        java.util.Set<java.lang.String> strSet8 = python3Target1.badWords;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getRuleFunctionContextStructName(ruleFunction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "tset4.5.2." + "'", str7, "tset4.5.2.");
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        java.lang.String[] strArray12 = new java.lang.String[] { "4.5.2.1", "\\n", "", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        python3Target1.badWords = strSet13;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = python3Target1.gen;
        org.antlr.v4.tool.ast.GrammarAST grammarAST17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(codeGenerator16);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        python3Target1.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        python3Target1.gen = codeGenerator5;
        java.lang.Class<?> wildcardClass7 = python3Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str5 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getLanguage();
        boolean boolean7 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        python3Target1.genRecognizerHeaderFile(grammar8, sT9, "");
        java.lang.String str13 = python3Target1.getImplicitRuleLabel("\"\\\\nContext\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_\"\\\\nContext\"" + "'", str13, "_\"\\\\nContext\"");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target1.gen = codeGenerator7;
        org.antlr.v4.tool.Rule rule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getRuleFunctionContextStructName(rule9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.stringtemplate.v4.ST sT15 = null;
        python3Target1.genRecognizerHeaderFile(grammar14, sT15, "\"4.5.2.1\"");
        java.lang.String str19 = python3Target1.encodeIntAsCharEscape((int) (byte) 10);
        org.antlr.v4.tool.ast.GrammarAST grammarAST20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\\n" + "'", str19, "\\n");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        java.lang.String[] strArray12 = new java.lang.String[] { "4.5.2.1", "\\n", "", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        python3Target1.badWords = strSet13;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = python3Target1.gen;
        org.stringtemplate.v4.STGroup sTGroup17 = python3Target1.getTemplates();
        java.lang.String str19 = python3Target1.getListLabel("\"\\\\nContext\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(codeGenerator16);
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\\\\nContext\"" + "'", str19, "\"\\\\nContext\"");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str5 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getLanguage();
        boolean boolean7 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        python3Target1.genRecognizerHeaderFile(grammar8, sT9, "");
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getLoopCounter(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.stringtemplate.v4.ST sT6 = null;
        python3Target1.genRecognizerHeaderFile(grammar5, sT6, "\\n");
        python3Target1.addBadWords();
        org.antlr.v4.tool.Rule rule10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getRuleFunctionContextStructName(rule10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("\"4.5.2.1\"");
        int int4 = python3Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target1.getElementListName("_tset4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"\\\"4.5.2.1\\\"\"" + "'", str3, "\"\\\"4.5.2.1\\\"\"");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.lang.String[] strArray0 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.antlr.v4.tool.Grammar grammar1 = null;
        org.stringtemplate.v4.ST sT2 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target0.genFile(grammar1, sT2, "\\nContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("d");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "d" + "'", str1, "d");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("4.5.2.1");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getElementListName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"4.5.2.1\"" + "'", str5, "\"4.5.2.1\"");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        int int6 = python3Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.templates;
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genFile(grammar8, sT9, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertNull(sTGroup7);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        int int6 = python3Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.templates;
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genFile(grammar8, sT9, "\"_tset\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertNull(sTGroup7);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        org.antlr.v4.tool.Rule rule13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getRuleFunctionContextStructName(rule13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        java.lang.String[] strArray12 = new java.lang.String[] { "4.5.2.1", "\\n", "", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        python3Target1.badWords = strSet13;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = python3Target1.gen;
        org.stringtemplate.v4.STGroup sTGroup17 = python3Target1.getTemplates();
        java.lang.String str19 = python3Target1.getListLabel("\"\\\\nContext\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python3Target1.getLoopLabel(grammarAST20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(codeGenerator16);
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\\\\nContext\"" + "'", str19, "\"\\\\nContext\"");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        java.lang.String str5 = python3Target1.getAltLabelContextStructName("\\n");
        java.lang.String str6 = python3Target1.getLanguage();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("_tset_tset_tset4.5.2.1", false);
        org.antlr.v4.tool.Rule rule10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getRuleFunctionContextStructName(rule10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\nContext" + "'", str5, "\\nContext");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset_tset_tset4.5.2.1" + "'", str9, "_tset_tset_tset4.5.2.1");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("tset4.5.2.");
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("d", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getLoopCounter(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"tset4.5.2.\"" + "'", str6, "\"tset4.5.2.\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"4.5.2.1\"", false);
        org.stringtemplate.v4.STGroup sTGroup18 = python3Target1.getTemplates();
        boolean boolean19 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Rule rule20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python3Target1.getRuleFunctionContextStructName(rule20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"4.5.2.1\"", false);
        org.stringtemplate.v4.STGroup sTGroup18 = python3Target1.getTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python3Target1.getLoopLabel(grammarAST19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup18);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target2 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator1);
        java.lang.String str4 = python3Target2.encodeIntAsCharEscape(10);
        int int5 = python3Target2.getSerializedATNSegmentLimit();
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = pythonStringRenderer0.toString((java.lang.Object) python3Target2, "_tset", locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python3Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\n" + "'", str4, "\\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 29 + "'", int5 == 29);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getLoopLabel(grammarAST14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        int int4 = python3Target1.getInlineTestSetWordSize();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getTokenTypeAsTargetLabel(grammar6, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"4.5.2.1\"", false);
        org.stringtemplate.v4.STGroup sTGroup18 = python3Target1.getTemplates();
        boolean boolean19 = python3Target1.supportsOverloadedMethods();
        org.stringtemplate.v4.STGroup sTGroup20 = python3Target1.loadTemplates();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = python3Target1.getRuleFunctionContextStructName(ruleFunction21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(sTGroup20);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String[] strArray5 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target1.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target1.getImplicitSetLabel("");
        java.lang.String[] strArray18 = new java.lang.String[] { "\"\\\\n\"", "\\nContext", "4.5.2.1", "\"\"", "_tset", "\\nContext", "\\nContext", "\\nContext", "\\nContext" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python3Target1.badWords = strSet19;
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.stringtemplate.v4.ST sT23 = null;
        python3Target1.genRecognizerHeaderFile(grammar22, sT23, "4.5.2.1");
        org.antlr.v4.tool.ast.GrammarAST grammarAST26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = python3Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        python3Target1.language = "\"\"";
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        python3Target1.gen = codeGenerator8;
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genListenerFile(grammar10, sT11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("_\"\\\\n\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_\"\\\\n\"" + "'", str1, "_\"\\\\n\"");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String[] strArray5 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target1.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target1.getImplicitSetLabel("");
        java.lang.String[] strArray18 = new java.lang.String[] { "\"\\\\n\"", "\\nContext", "4.5.2.1", "\"\"", "_tset", "\\nContext", "\\nContext", "\\nContext", "\\nContext" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python3Target1.badWords = strSet19;
        java.util.Set<java.lang.String> strSet22 = python3Target1.badWords;
        boolean boolean23 = python3Target1.templatesExist();
        org.antlr.v4.tool.ast.GrammarAST grammarAST24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = python3Target1.getLoopLabel(grammarAST24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("4.5.2.1");
        java.lang.Class<?> wildcardClass6 = python3Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"4.5.2.1\"" + "'", str5, "\"4.5.2.1\"");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.lang.String[] strArray0 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
        java.lang.Class<?> wildcardClass2 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        java.lang.String str5 = python3Target1.getAltLabelContextStructName("\\n");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getElementName("4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\nContext" + "'", str5, "\\nContext");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String[] strArray5 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target1.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator9);
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python3Target10.genRecognizerHeaderFile(grammar11, sT12, "hi!");
        java.lang.String str15 = python3Target10.getVersion();
        org.stringtemplate.v4.STGroup sTGroup16 = python3Target10.loadTemplates();
        python3Target1.templates = sTGroup16;
        org.antlr.v4.tool.Rule rule18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target1.getRuleFunctionContextStructName(rule18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4.5.2.1" + "'", str15, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup16);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        python3Target1.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        python3Target1.gen = codeGenerator5;
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        python3Target1.gen = codeGenerator8;
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.loadTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getLoopLabel(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(sTGroup10);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "\"\\\\nContext\"", false);
        java.util.Set<java.lang.String> strSet8 = python3Target1.badWords;
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genFile(grammar9, sT10, "Python3Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\\\nContext" + "'", str7, "\\\\nContext");
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"4.5.2.1\"", false);
        java.lang.String str18 = python3Target1.getVersion();
        java.util.Set<java.lang.String> strSet19 = python3Target1.badWords;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python3Target1.getElementName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genListenerFile(grammar4, sT5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        int int4 = python3Target1.getInlineTestSetWordSize();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        java.lang.String str6 = python3Target1.getLanguage();
        org.antlr.v4.tool.Grammar grammar7 = null;
        int[] intArray10 = new int[] { 64, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray11 = python3Target1.getTokenTypesAsTargetLabels(grammar7, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[64, 10]");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "_tset4.5.2.1", false);
        java.lang.String str8 = python3Target1.getVersion();
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "tset4.5.2." + "'", str7, "tset4.5.2.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        java.lang.Class<?> wildcardClass4 = python3Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.stringtemplate.v4.ST sT6 = null;
        python3Target1.genRecognizerHeaderFile(grammar5, sT6, "\\n");
        python3Target1.addBadWords();
        java.lang.String[] strArray10 = python3Target1.targetCharValueEscape;
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = python3Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        boolean boolean4 = python3Target1.wantsBaseListener();
        org.antlr.v4.tool.ast.GrammarAST grammarAST5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = python3Target1.getLoopCounter(grammarAST5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        python3Target1.language = "\"\"";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getListLabel("_\"\\\\nContext\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.lang.String[] strArray0 = null;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray0;
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.gen;
        java.lang.String str7 = python3Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = python3Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertNull(sTGroup5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        int int4 = python3Target1.getInlineTestSetWordSize();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        java.lang.String str7 = python3Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String[] strArray8 = python3Target1.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator10);
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.stringtemplate.v4.ST sT13 = null;
        python3Target11.genRecognizerHeaderFile(grammar12, sT13, "hi!");
        java.lang.String str16 = python3Target11.getVersion();
        org.stringtemplate.v4.STGroup sTGroup17 = python3Target11.loadTemplates();
        java.util.Set<java.lang.String> strSet18 = python3Target11.badWords;
        org.antlr.v4.tool.Grammar grammar19 = null;
        int[] intArray20 = new int[] {};
        java.lang.String[] strArray21 = python3Target11.getTokenTypesAsTargetLabels(grammar19, intArray20);
        java.lang.String[] strArray22 = python3Target1.getTokenTypesAsTargetLabels(grammar9, intArray20);
        java.lang.Class<?> wildcardClass23 = intArray20.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d" + "'", str7, "d");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "4.5.2.1" + "'", str16, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[]");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.loadTemplates();
        java.util.Set<java.lang.String> strSet8 = python3Target1.badWords;
        python3Target1.language = "\"\\\"4.5.2.1\\\"\"";
        int int11 = python3Target1.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getElementName("\\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29 + "'", int11 == 29);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        java.lang.String str9 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.tool.Grammar grammar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getTokenTypeAsTargetLabel(grammar10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset4.5.2.1" + "'", str9, "_tset4.5.2.1");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator7);
        java.lang.String str10 = python3Target8.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python3Target8.genRecognizerHeaderFile(grammar11, sT12, "\\nContext");
        java.lang.String[] strArray19 = new java.lang.String[] { "4.5.2.1", "\\n", "", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        python3Target8.badWords = strSet20;
        python3Target1.badWords = strSet20;
        org.antlr.v4.tool.Rule rule24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = python3Target1.getRuleFunctionContextStructName(rule24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertNull(sTGroup5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\n" + "'", str10, "\\n");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\\n");
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\\n\"" + "'", str6, "\"\\\\n\"");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "", true);
        java.lang.String str6 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("_tset_tset4.5.2.1");
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.addBadWords();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "__tset_tset4.5.2.1" + "'", str8, "__tset_tset4.5.2.1");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"4.5.2.1\"", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target1.getElementListName("\\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        java.lang.String str8 = python3Target1.getImplicitSetLabel("_tset4.5.2.1");
        java.lang.String str10 = python3Target1.encodeIntAsCharEscape((int) (byte) 1);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getRuleFunctionContextStructName(ruleFunction11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset_tset4.5.2.1" + "'", str8, "_tset_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\1" + "'", str10, "\\1");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str5 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getImplicitTokenLabel("_tsetContext");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        java.lang.String str5 = python3Target1.getAltLabelContextStructName("\\n");
        java.lang.String str6 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getListLabel("");
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        python3Target1.genRecognizerHeaderFile(grammar9, sT10, "\"\"");
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.stringtemplate.v4.ST sT14 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genListenerFile(grammar13, sT14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\nContext" + "'", str5, "\\nContext");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target1.gen = codeGenerator7;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getRuleFunctionContextStructName(ruleFunction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.templates;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.lang.String> strSet6 = python3Target1.getBadWords();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertNull(sTGroup5);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"4.5.2.1\"", false);
        org.stringtemplate.v4.STGroup sTGroup18 = python3Target1.getTemplates();
        boolean boolean19 = python3Target1.supportsOverloadedMethods();
        java.lang.String str21 = python3Target1.getImplicitRuleLabel("\"\\\\n\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "_\"\\\\n\"" + "'", str21, "_\"\\\\n\"");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target1.gen;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.addBadWords();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.templates;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getRuleFunctionContextStructName(ruleFunction6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertNull(sTGroup5);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator8);
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        python3Target9.genRecognizerHeaderFile(grammar10, sT11, "hi!");
        java.lang.String str14 = python3Target9.getVersion();
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target9.loadTemplates();
        python3Target1.templates = sTGroup15;
        java.lang.String str18 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.stringtemplate.v4.ST sT20 = null;
        python3Target1.genRecognizerHeaderFile(grammar19, sT20, "_tset");
        java.lang.String str23 = python3Target1.getLanguage();
        org.antlr.v4.tool.Grammar grammar24 = null;
        org.stringtemplate.v4.ST sT25 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genFile(grammar24, sT25, "_\"tset4.5.2.\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset4.5.2.1" + "'", str18, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Python3" + "'", str23, "Python3");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        python3Target1.language = "\"\"";
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        python3Target1.gen = codeGenerator8;
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getLoopLabel(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "", true);
        java.lang.String str6 = python3Target1.getLanguage();
        python3Target1.language = "Python3";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getElementName("_tset\\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"_tset_tset_tset4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"_tset_tset_tset4.5.2.1\"" + "'", str1, "\"_tset_tset_tset4.5.2.1\"");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "\"\"", locale3);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator5);
        java.lang.String str8 = python3Target6.getAltLabelContextStructName("\\n");
        java.lang.String str10 = python3Target6.getAltLabelContextStructName("\\n");
        java.lang.String str11 = python3Target6.getLanguage();
        java.util.Locale locale13 = null;
        java.lang.String str14 = pythonStringRenderer0.toString((java.lang.Object) str11, "Python3", locale13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\nContext" + "'", str8, "\\nContext");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\nContext" + "'", str10, "\\nContext");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python3" + "'", str11, "Python3");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Python3" + "'", str14, "Python3");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        python3Target1.language = "\"\"";
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target1.gen;
        int int13 = python3Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getElementListName("\\1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.stringtemplate.v4.ST sT15 = null;
        python3Target1.genRecognizerHeaderFile(grammar14, sT15, "\"4.5.2.1\"");
        boolean boolean18 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python3Target1.getRuleFunctionContextStructName(ruleFunction19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genListenerFile(grammar6, sT7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertNull(codeGenerator5);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        int int4 = python3Target1.getInlineTestSetWordSize();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        java.lang.String str7 = python3Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String[] strArray8 = python3Target1.targetCharValueEscape;
        org.antlr.v4.tool.Rule rule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getRuleFunctionContextStructName(rule9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d" + "'", str7, "d");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"4.5.2.1\"", false);
        org.stringtemplate.v4.STGroup sTGroup18 = python3Target1.getTemplates();
        boolean boolean19 = python3Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet20 = python3Target1.badWords;
        java.lang.String str21 = python3Target1.language;
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Python3" + "'", str21, "Python3");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        java.lang.String[] strArray12 = new java.lang.String[] { "4.5.2.1", "\\n", "", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        python3Target1.badWords = strSet13;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = python3Target1.gen;
        org.stringtemplate.v4.STGroup sTGroup17 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python3Target1.getCodeGenerator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(codeGenerator16);
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertNull(codeGenerator18);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
// flaky:         python3Target1.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        python3Target1.gen = codeGenerator5;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.gen;
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genListenerFile(grammar8, sT9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNull(codeGenerator7);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target2 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator3 = python3Target2.getCodeGenerator();
        boolean boolean4 = python3Target2.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        java.lang.String str8 = python3Target2.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator5, "\"\\\\nContext\"", false);
        java.util.Set<java.lang.String> strSet9 = python3Target2.badWords;
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target2.loadTemplates();
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = pythonStringRenderer0.toString((java.lang.Object) sTGroup10, "", locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.stringtemplate.v4.STGroupFile cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\\\nContext" + "'", str8, "\\\\nContext");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(sTGroup10);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String[] strArray5 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target1.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target1.getImplicitSetLabel("");
        java.lang.String[] strArray18 = new java.lang.String[] { "\"\\\\n\"", "\\nContext", "4.5.2.1", "\"\"", "_tset", "\\nContext", "\\nContext", "\\nContext", "\\nContext" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python3Target1.badWords = strSet19;
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.stringtemplate.v4.ST sT23 = null;
        python3Target1.genRecognizerHeaderFile(grammar22, sT23, "4.5.2.1");
        org.antlr.v4.tool.Grammar grammar26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = python3Target1.getTokenTypeAsTargetLabel(grammar26, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
// flaky:         org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"4.5.2.1\"", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target1.getElementListName("\"\\\\nContext\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String[] strArray5 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target1.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target1.getImplicitSetLabel("");
        java.lang.String[] strArray18 = new java.lang.String[] { "\"\\\\n\"", "\\nContext", "4.5.2.1", "\"\"", "_tset", "\\nContext", "\\nContext", "\\nContext", "\\nContext" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python3Target1.badWords = strSet19;
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target24 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator23);
        org.antlr.v4.tool.Grammar grammar25 = null;
        org.stringtemplate.v4.ST sT26 = null;
        python3Target24.genRecognizerHeaderFile(grammar25, sT26, "hi!");
        java.lang.String str29 = python3Target24.getVersion();
        org.stringtemplate.v4.STGroup sTGroup30 = python3Target24.loadTemplates();
        java.util.Set<java.lang.String> strSet31 = python3Target24.badWords;
        python3Target24.language = "\"\\\"4.5.2.1\\\"\"";
        org.antlr.v4.tool.Grammar grammar34 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target36 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator35);
        java.lang.String str38 = python3Target36.getAltLabelContextStructName("\\n");
        int int39 = python3Target36.getInlineTestSetWordSize();
        boolean boolean40 = python3Target36.wantsBaseVisitor();
        java.lang.String str42 = python3Target36.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String[] strArray43 = python3Target36.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar44 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator45 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target46 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator45);
        org.antlr.v4.tool.Grammar grammar47 = null;
        org.stringtemplate.v4.ST sT48 = null;
        python3Target46.genRecognizerHeaderFile(grammar47, sT48, "hi!");
        java.lang.String str51 = python3Target46.getVersion();
        org.stringtemplate.v4.STGroup sTGroup52 = python3Target46.loadTemplates();
        java.util.Set<java.lang.String> strSet53 = python3Target46.badWords;
        org.antlr.v4.tool.Grammar grammar54 = null;
        int[] intArray55 = new int[] {};
        java.lang.String[] strArray56 = python3Target46.getTokenTypesAsTargetLabels(grammar54, intArray55);
        java.lang.String[] strArray57 = python3Target36.getTokenTypesAsTargetLabels(grammar44, intArray55);
        java.lang.String[] strArray58 = python3Target24.getTokenTypesAsTargetLabels(grammar34, intArray55);
        java.lang.String[] strArray59 = python3Target1.getTokenTypesAsTargetLabels(grammar22, intArray55);
        java.lang.String[] strArray60 = python3Target1.targetCharValueEscape;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str62 = python3Target1.getElementListName("_tset4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
// flaky:         org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "4.5.2.1" + "'", str29, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\\nContext" + "'", str38, "\\nContext");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 64 + "'", int39 == 64);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "d" + "'", str42, "d");
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "4.5.2.1" + "'", str51, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup52);
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[]");
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(strArray59);
// flaky:         org.junit.Assert.assertNotNull(strArray60);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        java.lang.String str8 = python3Target1.getImplicitSetLabel("_tset4.5.2.1");
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genListenerFile(grammar9, sT10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset_tset4.5.2.1" + "'", str8, "_tset_tset4.5.2.1");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator8);
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        python3Target9.genRecognizerHeaderFile(grammar10, sT11, "hi!");
        java.lang.String str14 = python3Target9.getVersion();
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target9.loadTemplates();
        python3Target1.templates = sTGroup15;
        java.lang.String str18 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.stringtemplate.v4.ST sT20 = null;
        python3Target1.genRecognizerHeaderFile(grammar19, sT20, "_tset");
        boolean boolean23 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = python3Target1.getLoopLabel(grammarAST24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset4.5.2.1" + "'", str18, "_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator7);
        java.lang.String str10 = python3Target8.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python3Target8.genRecognizerHeaderFile(grammar11, sT12, "\\nContext");
        java.lang.String[] strArray19 = new java.lang.String[] { "4.5.2.1", "\\n", "", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        python3Target8.badWords = strSet20;
        python3Target1.badWords = strSet20;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = python3Target1.getRuleFunctionContextStructName(ruleFunction24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertNull(sTGroup5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\n" + "'", str10, "\\n");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"4.5.2.1\"", false);
        java.lang.String str18 = python3Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python3Target1.getLoopLabel(grammarAST19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        int int6 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genFile(grammar7, sT8, "_\\1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.util.Set<java.lang.String> strSet1 = python3Target0.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        python3Target0.gen = codeGenerator2;
        org.junit.Assert.assertNotNull(strSet1);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"4.5.2.1\"", false);
        java.lang.String str18 = python3Target1.getVersion();
        java.lang.String str19 = python3Target1.getLanguage();
        boolean boolean20 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        java.lang.String str24 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator21, "_Python3", true);
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Python3" + "'", str19, "Python3");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"Python\"" + "'", str24, "\"Python\"");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"4.5.2.1\"", false);
        java.lang.String str18 = python3Target1.getVersion();
        java.lang.String str19 = python3Target1.getLanguage();
        org.antlr.v4.tool.Grammar grammar20 = null;
        org.stringtemplate.v4.ST sT21 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genListenerFile(grammar20, sT21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Python3" + "'", str19, "Python3");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("tset4.5.2.");
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getImplicitTokenLabel("_\\1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"tset4.5.2.\"" + "'", str6, "\"tset4.5.2.\"");
        org.junit.Assert.assertNotNull(sTGroup7);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"4.5.2.1\"", false);
        java.lang.String str18 = python3Target1.getVersion();
        java.util.Set<java.lang.String> strSet19 = python3Target1.badWords;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python3Target1.getElementName("_\\1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        java.lang.String str5 = python3Target1.getAltLabelContextStructName("\\n");
        java.lang.String[] strArray6 = python3Target1.targetCharValueEscape;
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getLoopCounter(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\nContext" + "'", str5, "\\nContext");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        java.lang.String str5 = python3Target1.getAltLabelContextStructName("\\n");
        java.lang.String[] strArray6 = python3Target1.targetCharValueEscape;
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("\"tset4.5.2.\"Context");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getImplicitTokenLabel("\"\\\"tset4.5.2.\\\"Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\nContext" + "'", str5, "\\nContext");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"tset4.5.2.\\\"Context\"" + "'", str9, "\"\\\"tset4.5.2.\\\"Context\"");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        int int4 = python3Target1.getInlineTestSetWordSize();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        java.lang.String str7 = python3Target1.getListLabel("_\"\\\\nContext\"");
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_\"\\\\nContext\"" + "'", str7, "_\"\\\\nContext\"");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator8);
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        python3Target9.genRecognizerHeaderFile(grammar10, sT11, "hi!");
        java.lang.String str14 = python3Target9.getVersion();
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target9.loadTemplates();
        python3Target1.templates = sTGroup15;
        java.lang.String str18 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = python3Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python3Target1.getElementName("_\"\\\\nContext\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset4.5.2.1" + "'", str18, "_tset4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator19);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        python3Target1.language = "tset4.5.2.";
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genListenerFile(grammar8, sT9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "", true);
        java.lang.String str6 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.gen;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertNull(codeGenerator7);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        java.lang.String[] strArray12 = new java.lang.String[] { "4.5.2.1", "\\n", "", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        python3Target1.badWords = strSet13;
        java.lang.String str17 = python3Target1.getListLabel("hi!");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target1.getRuleFunctionContextStructName(ruleFunction18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\\n");
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("_\"\\\\nContext\"");
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("_tset_tset_tset4.5.2.1");
        java.util.Set<java.lang.String> strSet11 = python3Target1.badWords;
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = python3Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\\n\"" + "'", str6, "\"\\\\n\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_\\\"\\\\\\\\nContext\\\"\"" + "'", str8, "\"_\\\"\\\\\\\\nContext\\\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tset_tset_tset4.5.2.1\"" + "'", str10, "\"_tset_tset_tset4.5.2.1\"");
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        java.lang.String str9 = python3Target1.getImplicitSetLabel("4.5.2.1");
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromString("_tset", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getElementListName("_Python3");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset4.5.2.1" + "'", str9, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_tset\"" + "'", str12, "\"_tset\"");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"4.5.2.1\"", false);
        org.stringtemplate.v4.STGroup sTGroup18 = python3Target1.getTemplates();
        boolean boolean19 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python3Target1.getRuleFunctionContextStructName(ruleFunction20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        java.lang.String[] strArray12 = new java.lang.String[] { "4.5.2.1", "\\n", "", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        python3Target1.badWords = strSet13;
        java.lang.Class<?> wildcardClass16 = strSet13.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getImplicitSetLabel("_tset_tset4.5.2.1");
        java.lang.String str7 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.gen;
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset_tset_tset4.5.2.1" + "'", str6, "_tset_tset_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target2 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator1);
        java.lang.String str4 = python3Target2.getAltLabelContextStructName("\\n");
// flaky:         python3Target2.addBadWords();
        java.lang.String str7 = python3Target2.getTargetStringLiteralFromString("\\\\nContext");
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = pythonStringRenderer0.toString((java.lang.Object) python3Target2, "\"4.5.2.1\"", locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python3Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\nContext" + "'", str4, "\\nContext");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\\\\\\nContext\"" + "'", str7, "\"\\\\\\\\nContext\"");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python3Target1.encodeIntAsCharEscape((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        java.lang.String[] strArray12 = new java.lang.String[] { "4.5.2.1", "\\n", "", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        python3Target1.badWords = strSet13;
        java.lang.String str17 = python3Target1.getListLabel("hi!");
        java.util.Set<java.lang.String> strSet18 = python3Target1.badWords;
        java.lang.String str20 = python3Target1.getImplicitRuleLabel("Python3");
        java.util.Set<java.lang.String> strSet21 = python3Target1.getBadWords();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = python3Target1.getElementName("tset4.5.2.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "_Python3" + "'", str20, "_Python3");
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        java.lang.Class<?> wildcardClass14 = python3Target1.getClass();
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target1.gen = codeGenerator7;
        java.lang.String str10 = python3Target1.getImplicitRuleLabel("\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_\"\"" + "'", str10, "_\"\"");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        java.lang.String[] strArray12 = new java.lang.String[] { "4.5.2.1", "\\n", "", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        python3Target1.badWords = strSet13;
        java.lang.String str17 = python3Target1.getListLabel("hi!");
        org.antlr.v4.tool.Grammar grammar18 = null;
        int[] intArray23 = new int[] { 1, (byte) 10, 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray24 = python3Target1.getTokenTypesAsTargetLabels(grammar18, intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 10, 1, 10]");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.loadTemplates();
        java.util.Set<java.lang.String> strSet8 = python3Target1.badWords;
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("\"tset4.5.2.\"");
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("Python3");
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getLoopCounter(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_\"tset4.5.2.\"" + "'", str6, "_\"tset4.5.2.\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python3Context" + "'", str8, "Python3Context");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\\\"_tset_tset_tset4.5.2.1\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"_tset_tset_tset4.5.2.1\\\"\"" + "'", str1, "\"\\\"_tset_tset_tset4.5.2.1\\\"\"");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("tset4.5.2.");
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getImplicitTokenLabel("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"tset4.5.2.\"" + "'", str6, "\"tset4.5.2.\"");
        org.junit.Assert.assertNotNull(sTGroup7);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.loadTemplates();
        java.util.Set<java.lang.String> strSet8 = python3Target1.badWords;
        org.antlr.v4.tool.Grammar grammar9 = null;
        int[] intArray10 = new int[] {};
        java.lang.String[] strArray11 = python3Target1.getTokenTypesAsTargetLabels(grammar9, intArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getElementListName("\"tset4.5.2.\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        python3Target1.gen = codeGenerator8;
        int int10 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 29 + "'", int10 == 29);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator8);
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        python3Target9.genRecognizerHeaderFile(grammar10, sT11, "hi!");
        java.lang.String str14 = python3Target9.getVersion();
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target9.loadTemplates();
        python3Target1.templates = sTGroup15;
        java.lang.String str18 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.stringtemplate.v4.ST sT20 = null;
        python3Target1.genRecognizerHeaderFile(grammar19, sT20, "_tset");
        java.lang.String str23 = python3Target1.getLanguage();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = python3Target1.getRuleFunctionContextStructName(ruleFunction24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset4.5.2.1" + "'", str18, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Python3" + "'", str23, "Python3");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String[] strArray6 = python3Target1.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genFile(grammar7, sT8, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.loadTemplates();
        java.util.Set<java.lang.String> strSet8 = python3Target1.badWords;
        java.lang.String str10 = python3Target1.getImplicitSetLabel("\"\\\\n\"");
        org.antlr.v4.tool.Rule rule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getRuleFunctionContextStructName(rule11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_tset\"\\\\n\"" + "'", str10, "_tset\"\\\\n\"");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.loadTemplates();
        java.util.Set<java.lang.String> strSet8 = python3Target1.badWords;
        java.lang.String str10 = python3Target1.getImplicitSetLabel("\"\\\\n\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getLoopCounter(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_tset\"\\\\n\"" + "'", str10, "_tset\"\\\\n\"");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        int int4 = python3Target1.getInlineTestSetWordSize();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        java.lang.String str7 = python3Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String[] strArray8 = python3Target1.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator9);
        java.lang.String str12 = python3Target10.getAltLabelContextStructName("\\n");
        java.lang.String str14 = python3Target10.getAltLabelContextStructName("\\n");
        java.lang.String[] strArray15 = python3Target10.targetCharValueEscape;
        python3Target1.targetCharValueEscape = strArray15;
        org.antlr.v4.tool.ast.GrammarAST grammarAST17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d" + "'", str7, "d");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\nContext" + "'", str12, "\\nContext");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\nContext" + "'", str14, "\\nContext");
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("\"tset4.5.2.\"");
// flaky:         python3Target1.addBadWords();
        boolean boolean8 = python3Target1.templatesExist();
        java.lang.Class<?> wildcardClass9 = python3Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_\"tset4.5.2.\"" + "'", str6, "_\"tset4.5.2.\"");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getListLabel("hi!");
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("\\nContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator10);
        java.lang.String str13 = python3Target11.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup14 = python3Target11.templates;
        java.lang.String[] strArray15 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target11.targetCharValueEscape = strArray15;
        java.lang.String str18 = python3Target11.getImplicitSetLabel("");
        java.lang.String[] strArray28 = new java.lang.String[] { "\"\\\\n\"", "\\nContext", "4.5.2.1", "\"\"", "_tset", "\\nContext", "\\nContext", "\\nContext", "\\nContext" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        python3Target11.badWords = strSet29;
        python3Target1.badWords = strSet29;
        java.lang.Class<?> wildcardClass33 = strSet29.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\\nContext\"" + "'", str9, "\"\\\\nContext\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\nContext" + "'", str13, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup14);
// flaky:         org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset" + "'", str18, "_tset");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "\"\"", locale3);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator5);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target6.getCodeGenerator();
        boolean boolean8 = python3Target6.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\"\\\\nContext\"", false);
        java.util.Locale locale14 = null;
        java.lang.String str15 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator9, "\"tset4.5.2.\"", locale14);
        java.util.Locale locale18 = null;
        java.lang.String str19 = pythonStringRenderer0.toString((java.lang.Object) "\\n", "_tset_tset4.5.2.1", locale18);
        java.util.Locale locale22 = null;
        java.lang.String str23 = pythonStringRenderer0.toString((java.lang.Object) "_tsetContext", "_", locale22);
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target25 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator24);
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = python3Target25.getCodeGenerator();
        boolean boolean27 = python3Target25.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator28 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target29 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator28);
        org.antlr.v4.tool.Grammar grammar30 = null;
        org.stringtemplate.v4.ST sT31 = null;
        python3Target29.genRecognizerHeaderFile(grammar30, sT31, "hi!");
        java.lang.String str34 = python3Target29.getVersion();
        org.stringtemplate.v4.STGroup sTGroup35 = python3Target29.loadTemplates();
        python3Target25.templates = sTGroup35;
        org.stringtemplate.v4.STGroup sTGroup37 = python3Target25.getTemplates();
        int int38 = python3Target25.getInlineTestSetWordSize();
        java.util.Locale locale40 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = pythonStringRenderer0.toString((java.lang.Object) int38, "\"\\\"4.5.2.1\\\"\"", locale40);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.Integer cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\\\nContext" + "'", str12, "\\\\nContext");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"tset4.5.2.\"" + "'", str15, "\"tset4.5.2.\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_tset_tset4.5.2.1" + "'", str19, "_tset_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "_" + "'", str23, "_");
        org.junit.Assert.assertNull(codeGenerator26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "4.5.2.1" + "'", str34, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup35);
        org.junit.Assert.assertNotNull(sTGroup37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 64 + "'", int38 == 64);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        java.lang.String[] strArray12 = new java.lang.String[] { "4.5.2.1", "\\n", "", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        python3Target1.badWords = strSet13;
        java.lang.String str17 = python3Target1.getListLabel("hi!");
        java.util.Set<java.lang.String> strSet18 = python3Target1.badWords;
        java.lang.String str20 = python3Target1.getTargetStringLiteralFromString("_Python3");
        boolean boolean21 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = python3Target1.getLoopCounter(grammarAST22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"_Python3\"" + "'", str20, "\"_Python3\"");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
// flaky:         python3Target1.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        python3Target1.gen = codeGenerator5;
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet8 = python3Target1.badWords;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getRuleFunctionContextStructName(ruleFunction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"4.5.2.1\"", false);
        java.lang.String str18 = python3Target1.getVersion();
        java.util.Set<java.lang.String> strSet19 = python3Target1.badWords;
        org.antlr.v4.tool.Grammar grammar20 = null;
        org.stringtemplate.v4.ST sT21 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genFile(grammar20, sT21, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("_tset\"\\\\n\"");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python3Target1.getRuleFunctionContextStructName(ruleFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"_tset\\\"\\\\\\\\n\\\"\"" + "'", str3, "\"_tset\\\"\\\\\\\\n\\\"\"");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.loadTemplates();
        java.util.Set<java.lang.String> strSet8 = python3Target1.badWords;
        python3Target1.language = "\"\\\"4.5.2.1\\\"\"";
        int int11 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str12 = python3Target1.language;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getImplicitTokenLabel("_tset_tset4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29 + "'", int11 == 29);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"4.5.2.1\\\"\"" + "'", str12, "\"\\\"4.5.2.1\\\"\"");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator8);
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        python3Target9.genRecognizerHeaderFile(grammar10, sT11, "hi!");
        java.lang.String str14 = python3Target9.getVersion();
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target9.loadTemplates();
        python3Target1.templates = sTGroup15;
        java.lang.String str18 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.stringtemplate.v4.ST sT20 = null;
        python3Target1.genRecognizerHeaderFile(grammar19, sT20, "_tset");
        boolean boolean23 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Rule rule24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = python3Target1.getRuleFunctionContextStructName(rule24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset4.5.2.1" + "'", str18, "_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String[] strArray5 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target1.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target1.getImplicitSetLabel("");
        java.lang.String[] strArray18 = new java.lang.String[] { "\"\\\\n\"", "\\nContext", "4.5.2.1", "\"\"", "_tset", "\\nContext", "\\nContext", "\\nContext", "\\nContext" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python3Target1.badWords = strSet19;
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target24 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator23);
        org.antlr.v4.tool.Grammar grammar25 = null;
        org.stringtemplate.v4.ST sT26 = null;
        python3Target24.genRecognizerHeaderFile(grammar25, sT26, "hi!");
        java.lang.String str29 = python3Target24.getVersion();
        org.stringtemplate.v4.STGroup sTGroup30 = python3Target24.loadTemplates();
        java.util.Set<java.lang.String> strSet31 = python3Target24.badWords;
        python3Target24.language = "\"\\\"4.5.2.1\\\"\"";
        org.antlr.v4.tool.Grammar grammar34 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target36 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator35);
        java.lang.String str38 = python3Target36.getAltLabelContextStructName("\\n");
        int int39 = python3Target36.getInlineTestSetWordSize();
        boolean boolean40 = python3Target36.wantsBaseVisitor();
        java.lang.String str42 = python3Target36.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String[] strArray43 = python3Target36.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar44 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator45 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target46 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator45);
        org.antlr.v4.tool.Grammar grammar47 = null;
        org.stringtemplate.v4.ST sT48 = null;
        python3Target46.genRecognizerHeaderFile(grammar47, sT48, "hi!");
        java.lang.String str51 = python3Target46.getVersion();
        org.stringtemplate.v4.STGroup sTGroup52 = python3Target46.loadTemplates();
        java.util.Set<java.lang.String> strSet53 = python3Target46.badWords;
        org.antlr.v4.tool.Grammar grammar54 = null;
        int[] intArray55 = new int[] {};
        java.lang.String[] strArray56 = python3Target46.getTokenTypesAsTargetLabels(grammar54, intArray55);
        java.lang.String[] strArray57 = python3Target36.getTokenTypesAsTargetLabels(grammar44, intArray55);
        java.lang.String[] strArray58 = python3Target24.getTokenTypesAsTargetLabels(grammar34, intArray55);
        java.lang.String[] strArray59 = python3Target1.getTokenTypesAsTargetLabels(grammar22, intArray55);
        org.antlr.v4.tool.ast.GrammarAST grammarAST60 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str61 = python3Target1.getLoopCounter(grammarAST60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
// flaky:         org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "4.5.2.1" + "'", str29, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\\nContext" + "'", str38, "\\nContext");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 64 + "'", int39 == 64);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "d" + "'", str42, "d");
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "4.5.2.1" + "'", str51, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup52);
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[]");
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(strArray59);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "\"\"", locale3);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator5);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target6.getCodeGenerator();
        boolean boolean8 = python3Target6.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\"\\\\nContext\"", false);
        java.util.Locale locale14 = null;
        java.lang.String str15 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator9, "\"tset4.5.2.\"", locale14);
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target17 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator16);
        java.lang.String str19 = python3Target17.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup20 = python3Target17.templates;
        java.lang.String[] strArray21 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target17.targetCharValueEscape = strArray21;
        java.lang.String str24 = python3Target17.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = python3Target17.gen;
        java.util.Locale locale27 = null;
        java.lang.String str28 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator25, "\"_\\\"\\\\\\\\nContext\\\"\"", locale27);
        org.antlr.v4.codegen.CodeGenerator codeGenerator29 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target30 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator29);
        org.antlr.v4.codegen.CodeGenerator codeGenerator31 = python3Target30.getCodeGenerator();
        boolean boolean32 = python3Target30.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = null;
        java.lang.String str36 = python3Target30.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator33, "\"\\\\nContext\"", false);
        java.util.Set<java.lang.String> strSet37 = python3Target30.badWords;
        java.util.Locale locale39 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = pythonStringRenderer0.toString((java.lang.Object) strSet37, "4.5.2.1", locale39);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.HashSet cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\\\nContext" + "'", str12, "\\\\nContext");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"tset4.5.2.\"" + "'", str15, "\"tset4.5.2.\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\\nContext" + "'", str19, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup20);
// flaky:         org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "_tset" + "'", str24, "_tset");
        org.junit.Assert.assertNull(codeGenerator25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"_\\\"\\\\\\\\nContext\\\"\"" + "'", str28, "\"_\\\"\\\\\\\\nContext\\\"\"");
        org.junit.Assert.assertNull(codeGenerator31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\\\\nContext" + "'", str36, "\\\\nContext");
        org.junit.Assert.assertNotNull(strSet37);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        python3Target1.language = "\"\"";
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target1.gen;
        int int13 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target15 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator14);
        java.lang.String str17 = python3Target15.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup18 = python3Target15.templates;
        java.lang.String str20 = python3Target15.getTargetStringLiteralFromString("\\n");
        java.lang.String str22 = python3Target15.getTargetStringLiteralFromString("_\"\\\\nContext\"");
        java.lang.String str24 = python3Target15.getTargetStringLiteralFromString("_tset_tset_tset4.5.2.1");
        java.util.Set<java.lang.String> strSet25 = python3Target15.badWords;
        python3Target1.badWords = strSet25;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = python3Target1.gen;
        org.antlr.v4.tool.Grammar grammar28 = null;
        org.stringtemplate.v4.ST sT29 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genFile(grammar28, sT29, "__tset_tset4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\nContext" + "'", str17, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\\\\n\"" + "'", str20, "\"\\\\n\"");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"_\\\"\\\\\\\\nContext\\\"\"" + "'", str22, "\"_\\\"\\\\\\\\nContext\\\"\"");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"_tset_tset_tset4.5.2.1\"" + "'", str24, "\"_tset_tset_tset4.5.2.1\"");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNull(codeGenerator27);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        python3Target1.language = "\"\"";
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "", false);
        java.util.Set<java.lang.String> strSet12 = python3Target1.badWords;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getRuleFunctionContextStructName(ruleFunction13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String[] strArray5 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target1.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target1.getImplicitSetLabel("");
        java.lang.String[] strArray18 = new java.lang.String[] { "\"\\\\n\"", "\\nContext", "4.5.2.1", "\"\"", "_tset", "\\nContext", "\\nContext", "\\nContext", "\\nContext" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python3Target1.badWords = strSet19;
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.stringtemplate.v4.ST sT23 = null;
        python3Target1.genRecognizerHeaderFile(grammar22, sT23, "4.5.2.1");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = python3Target1.getRuleFunctionContextStructName(ruleFunction26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
// flaky:         org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String[] strArray6 = python3Target1.targetCharValueEscape;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("\"_tset_tset_tset4.5.2.1\"", true);
        java.lang.Class<?> wildcardClass10 = python3Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"_tset_tset_tset4.5.2.1\\\"\"" + "'", str9, "\"\\\"_tset_tset_tset4.5.2.1\\\"\"");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"4.5.2.1\"", false);
        org.stringtemplate.v4.STGroup sTGroup18 = python3Target1.getTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python3Target1.getImplicitTokenLabel("_tset\"\\\\n\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup18);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        python3Target1.language = "\"\"";
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target1.gen;
        java.lang.String str13 = python3Target1.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = python3Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target17 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator16);
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.stringtemplate.v4.ST sT19 = null;
        python3Target17.genRecognizerHeaderFile(grammar18, sT19, "hi!");
        java.lang.String str22 = python3Target17.getVersion();
        org.stringtemplate.v4.STGroup sTGroup23 = python3Target17.loadTemplates();
        python3Target1.templates = sTGroup23;
        org.stringtemplate.v4.STGroup sTGroup25 = python3Target1.loadTemplates();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = python3Target1.getRuleFunctionContextStructName(ruleFunction26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset4.5.2.1" + "'", str15, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4.5.2.1" + "'", str22, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup23);
        org.junit.Assert.assertNotNull(sTGroup25);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        int int4 = python3Target1.getInlineTestSetWordSize();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        java.lang.String str7 = python3Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String[] strArray8 = python3Target1.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator9);
        java.lang.String str12 = python3Target10.getAltLabelContextStructName("\\n");
        java.lang.String str14 = python3Target10.getAltLabelContextStructName("\\n");
        java.lang.String[] strArray15 = python3Target10.targetCharValueEscape;
        python3Target1.targetCharValueEscape = strArray15;
        org.antlr.v4.tool.Grammar grammar17 = null;
        org.stringtemplate.v4.ST sT18 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genFile(grammar17, sT18, "Python3Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d" + "'", str7, "d");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\nContext" + "'", str12, "\\nContext");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\nContext" + "'", str14, "\\nContext");
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.loadTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = python3Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup7);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator8);
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        python3Target9.genRecognizerHeaderFile(grammar10, sT11, "hi!");
        java.lang.String str14 = python3Target9.getVersion();
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target9.loadTemplates();
        python3Target1.templates = sTGroup15;
        java.lang.String str18 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.stringtemplate.v4.ST sT20 = null;
        python3Target1.genRecognizerHeaderFile(grammar19, sT20, "_tset");
        java.lang.String str23 = python3Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = python3Target1.getElementListName("\"\\\"tset4.5.2.\\\"Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset4.5.2.1" + "'", str18, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Python3" + "'", str23, "Python3");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str5 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getLanguage();
        boolean boolean7 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        python3Target1.genRecognizerHeaderFile(grammar8, sT9, "");
        python3Target1.language = "_tset_tset4.5.2.1";
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup14 = python3Target1.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.loadTemplates();
        java.util.Set<java.lang.String> strSet8 = python3Target1.badWords;
        python3Target1.language = "\"\\\"4.5.2.1\\\"\"";
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target13 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator12);
        java.lang.String str15 = python3Target13.getAltLabelContextStructName("\\n");
        int int16 = python3Target13.getInlineTestSetWordSize();
        boolean boolean17 = python3Target13.wantsBaseVisitor();
        java.lang.String str19 = python3Target13.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String[] strArray20 = python3Target13.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar21 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target23 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator22);
        org.antlr.v4.tool.Grammar grammar24 = null;
        org.stringtemplate.v4.ST sT25 = null;
        python3Target23.genRecognizerHeaderFile(grammar24, sT25, "hi!");
        java.lang.String str28 = python3Target23.getVersion();
        org.stringtemplate.v4.STGroup sTGroup29 = python3Target23.loadTemplates();
        java.util.Set<java.lang.String> strSet30 = python3Target23.badWords;
        org.antlr.v4.tool.Grammar grammar31 = null;
        int[] intArray32 = new int[] {};
        java.lang.String[] strArray33 = python3Target23.getTokenTypesAsTargetLabels(grammar31, intArray32);
        java.lang.String[] strArray34 = python3Target13.getTokenTypesAsTargetLabels(grammar21, intArray32);
        java.lang.String[] strArray35 = python3Target1.getTokenTypesAsTargetLabels(grammar11, intArray32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = python3Target1.getAltLabelContextStructName("\"\\\"4.5.2.1\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\nContext" + "'", str15, "\\nContext");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "d" + "'", str19, "d");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "4.5.2.1" + "'", str28, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[]");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray35);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        python3Target1.language = "\"\"";
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "", false);
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.stringtemplate.v4.ST sT13 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genFile(grammar12, sT13, "\\1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String[] strArray5 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target1.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target1.getImplicitSetLabel("");
        java.lang.String[] strArray18 = new java.lang.String[] { "\"\\\\n\"", "\\nContext", "4.5.2.1", "\"\"", "_tset", "\\nContext", "\\nContext", "\\nContext", "\\nContext" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python3Target1.badWords = strSet19;
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target24 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator23);
        org.antlr.v4.tool.Grammar grammar25 = null;
        org.stringtemplate.v4.ST sT26 = null;
        python3Target24.genRecognizerHeaderFile(grammar25, sT26, "hi!");
        java.lang.String str29 = python3Target24.getVersion();
        org.stringtemplate.v4.STGroup sTGroup30 = python3Target24.loadTemplates();
        java.util.Set<java.lang.String> strSet31 = python3Target24.badWords;
        python3Target24.language = "\"\\\"4.5.2.1\\\"\"";
        org.antlr.v4.tool.Grammar grammar34 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target36 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator35);
        java.lang.String str38 = python3Target36.getAltLabelContextStructName("\\n");
        int int39 = python3Target36.getInlineTestSetWordSize();
        boolean boolean40 = python3Target36.wantsBaseVisitor();
        java.lang.String str42 = python3Target36.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String[] strArray43 = python3Target36.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar44 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator45 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target46 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator45);
        org.antlr.v4.tool.Grammar grammar47 = null;
        org.stringtemplate.v4.ST sT48 = null;
        python3Target46.genRecognizerHeaderFile(grammar47, sT48, "hi!");
        java.lang.String str51 = python3Target46.getVersion();
        org.stringtemplate.v4.STGroup sTGroup52 = python3Target46.loadTemplates();
        java.util.Set<java.lang.String> strSet53 = python3Target46.badWords;
        org.antlr.v4.tool.Grammar grammar54 = null;
        int[] intArray55 = new int[] {};
        java.lang.String[] strArray56 = python3Target46.getTokenTypesAsTargetLabels(grammar54, intArray55);
        java.lang.String[] strArray57 = python3Target36.getTokenTypesAsTargetLabels(grammar44, intArray55);
        java.lang.String[] strArray58 = python3Target24.getTokenTypesAsTargetLabels(grammar34, intArray55);
        java.lang.String[] strArray59 = python3Target1.getTokenTypesAsTargetLabels(grammar22, intArray55);
        org.antlr.v4.tool.ast.GrammarAST grammarAST60 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str61 = python3Target1.getLoopLabel(grammarAST60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
// flaky:         org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "4.5.2.1" + "'", str29, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\\nContext" + "'", str38, "\\nContext");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 64 + "'", int39 == 64);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "d" + "'", str42, "d");
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "4.5.2.1" + "'", str51, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup52);
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[]");
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(strArray59);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        int int4 = python3Target1.getInlineTestSetWordSize();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        java.lang.String str6 = python3Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getElementName("d");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.loadTemplates();
        java.util.Set<java.lang.String> strSet8 = python3Target1.badWords;
        python3Target1.language = "\"\\\"4.5.2.1\\\"\"";
        org.antlr.v4.tool.Rule rule11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getRuleFunctionContextStructName(rule11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("tset4.5.2.");
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator8);
        java.lang.String str11 = python3Target9.getAltLabelContextStructName("\\n");
        java.lang.String str13 = python3Target9.getAltLabelContextStructName("\\n");
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python3Target9.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target16 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator15);
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = python3Target16.getCodeGenerator();
        boolean boolean18 = python3Target16.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target20 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator19);
        org.antlr.v4.tool.Grammar grammar21 = null;
        org.stringtemplate.v4.ST sT22 = null;
        python3Target20.genRecognizerHeaderFile(grammar21, sT22, "hi!");
        java.lang.String str25 = python3Target20.getVersion();
        org.stringtemplate.v4.STGroup sTGroup26 = python3Target20.loadTemplates();
        python3Target16.templates = sTGroup26;
        org.stringtemplate.v4.STGroup sTGroup28 = python3Target16.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator29 = null;
        java.lang.String str32 = python3Target16.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator29, "\"4.5.2.1\"", false);
        org.stringtemplate.v4.STGroup sTGroup33 = python3Target16.getTemplates();
        python3Target9.templates = sTGroup33;
        python3Target1.templates = sTGroup33;
        org.stringtemplate.v4.STGroup sTGroup36 = python3Target1.getTemplates();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"tset4.5.2.\"" + "'", str6, "\"tset4.5.2.\"");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\nContext" + "'", str11, "\\nContext");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\nContext" + "'", str13, "\\nContext");
        org.junit.Assert.assertNull(codeGenerator14);
        org.junit.Assert.assertNull(codeGenerator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4.5.2.1" + "'", str25, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup26);
        org.junit.Assert.assertNotNull(sTGroup28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "4.5.2.1" + "'", str32, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup33);
        org.junit.Assert.assertNotNull(sTGroup36);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        int int4 = python3Target1.getInlineTestSetWordSize();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        java.lang.String str7 = python3Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String[] strArray8 = python3Target1.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator9);
        java.lang.String str12 = python3Target10.getAltLabelContextStructName("\\n");
        java.lang.String str14 = python3Target10.getAltLabelContextStructName("\\n");
        java.lang.String[] strArray15 = python3Target10.targetCharValueEscape;
        python3Target1.targetCharValueEscape = strArray15;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray15;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d" + "'", str7, "d");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\nContext" + "'", str12, "\\nContext");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\nContext" + "'", str14, "\\nContext");
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"4.5.2.1\"", false);
        org.stringtemplate.v4.STGroup sTGroup18 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = python3Target1.gen;
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertNull(codeGenerator19);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        java.lang.String str4 = python3Target1.language;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Python3" + "'", str4, "Python3");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        boolean boolean4 = python3Target1.wantsBaseListener();
        java.lang.String str5 = python3Target1.getVersion();
        org.antlr.v4.tool.Rule rule6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getRuleFunctionContextStructName(rule6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"4.5.2.1\"", false);
        org.stringtemplate.v4.STGroup sTGroup18 = python3Target1.getTemplates();
        java.lang.String str20 = python3Target1.getTargetStringLiteralFromString("hi!");
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"hi!\"" + "'", str20, "\"hi!\"");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "\"\\\\nContext\"", false);
        java.util.Set<java.lang.String> strSet8 = python3Target1.badWords;
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\\\nContext" + "'", str7, "\\\\nContext");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        boolean boolean4 = python3Target1.wantsBaseListener();
        java.lang.String str5 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        python3Target1.gen = codeGenerator6;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator8);
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        python3Target9.genRecognizerHeaderFile(grammar10, sT11, "hi!");
        java.lang.String str14 = python3Target9.getVersion();
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target9.loadTemplates();
        python3Target1.templates = sTGroup15;
        java.lang.String str18 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.stringtemplate.v4.ST sT20 = null;
        python3Target1.genRecognizerHeaderFile(grammar19, sT20, "_tset");
        boolean boolean23 = python3Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = python3Target1.getElementName("\"\\\"tset4.5.2.\\\"Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset4.5.2.1" + "'", str18, "_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.loadTemplates();
        java.util.Set<java.lang.String> strSet8 = python3Target1.badWords;
        org.antlr.v4.tool.Grammar grammar9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getTokenTypeAsTargetLabel(grammar9, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        python3Target1.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        python3Target1.gen = codeGenerator5;
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        java.util.Set<java.lang.String> strSet8 = python3Target1.badWords;
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genFile(grammar9, sT10, "\"_tset_tset_tset4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"_tset_tset4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"_tset_tset4.5.2.1\"" + "'", str1, "\"_tset_tset4.5.2.1\"");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator8);
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        python3Target9.genRecognizerHeaderFile(grammar10, sT11, "hi!");
        java.lang.String str14 = python3Target9.getVersion();
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target9.loadTemplates();
        python3Target1.templates = sTGroup15;
        java.lang.String str18 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.stringtemplate.v4.ST sT20 = null;
        python3Target1.genRecognizerHeaderFile(grammar19, sT20, "_tset");
        boolean boolean23 = python3Target1.supportsOverloadedMethods();
        java.lang.String str24 = python3Target1.getLanguage();
        int int25 = python3Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = python3Target1.getAltLabelContextStructName("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset4.5.2.1" + "'", str18, "_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Python3" + "'", str24, "Python3");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 64 + "'", int25 == 64);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genListenerFile(grammar3, sT4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.getElementListName("\"_tset_tset_tset4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset4.5.2.1" + "'", str15, "_tset4.5.2.1");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target17 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator16);
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.stringtemplate.v4.ST sT19 = null;
        python3Target17.genRecognizerHeaderFile(grammar18, sT19, "hi!");
        java.lang.String str22 = python3Target17.getVersion();
        org.stringtemplate.v4.STGroup sTGroup23 = python3Target17.loadTemplates();
        python3Target1.templates = sTGroup23;
        org.stringtemplate.v4.STGroup sTGroup25 = python3Target1.loadTemplates();
        int int26 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = python3Target1.getTokenTypeAsTargetLabel(grammar27, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset4.5.2.1" + "'", str15, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4.5.2.1" + "'", str22, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup23);
        org.junit.Assert.assertNotNull(sTGroup25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 29 + "'", int26 == 29);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\\n");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator7);
        java.lang.String str10 = python3Target8.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target8.templates;
        java.lang.String[] strArray12 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target8.targetCharValueEscape = strArray12;
        java.lang.String str15 = python3Target8.getImplicitSetLabel("");
        java.lang.String[] strArray25 = new java.lang.String[] { "\"\\\\n\"", "\\nContext", "4.5.2.1", "\"\"", "_tset", "\\nContext", "\\nContext", "\\nContext", "\\nContext" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        python3Target8.badWords = strSet26;
        python3Target1.badWords = strSet26;
        org.antlr.v4.tool.Grammar grammar30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = python3Target1.getTokenTypeAsTargetLabel(grammar30, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\\n\"" + "'", str6, "\"\\\\n\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\nContext" + "'", str10, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset" + "'", str15, "_tset");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        java.lang.String[] strArray12 = new java.lang.String[] { "4.5.2.1", "\\n", "", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        python3Target1.badWords = strSet13;
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.stringtemplate.v4.ST sT17 = null;
        python3Target1.genRecognizerHeaderFile(grammar16, sT17, "");
        org.antlr.v4.tool.ast.GrammarAST grammarAST20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python3Target1.getLoopCounter(grammarAST20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        java.lang.String str14 = python3Target1.getListLabel("\"\\\"_tset_tset_tset4.5.2.1\\\"\"");
        java.lang.Class<?> wildcardClass15 = python3Target1.getClass();
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"_tset_tset_tset4.5.2.1\\\"\"" + "'", str14, "\"\\\"_tset_tset_tset4.5.2.1\\\"\"");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\\n");
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("_\"\\\\nContext\"");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getRuleFunctionContextStructName(ruleFunction9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\\n\"" + "'", str6, "\"\\\\n\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_\\\"\\\\\\\\nContext\\\"\"" + "'", str8, "\"_\\\"\\\\\\\\nContext\\\"\"");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "", true);
        java.lang.String str6 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator9);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target10.getCodeGenerator();
        boolean boolean12 = python3Target10.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target14 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator13);
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.stringtemplate.v4.ST sT16 = null;
        python3Target14.genRecognizerHeaderFile(grammar15, sT16, "hi!");
        java.lang.String str19 = python3Target14.getVersion();
        org.stringtemplate.v4.STGroup sTGroup20 = python3Target14.loadTemplates();
        python3Target10.templates = sTGroup20;
        org.stringtemplate.v4.STGroup sTGroup22 = python3Target10.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        java.lang.String str26 = python3Target10.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator23, "\"4.5.2.1\"", false);
        org.stringtemplate.v4.STGroup sTGroup27 = python3Target10.getTemplates();
        python3Target1.templates = sTGroup27;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = python3Target1.getRuleFunctionContextStructName(ruleFunction29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_" + "'", str8, "_");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "4.5.2.1" + "'", str19, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup20);
        org.junit.Assert.assertNotNull(sTGroup22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "4.5.2.1" + "'", str26, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup27);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str6 = python3Target1.language;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        boolean boolean2 = python3Target1.wantsBaseListener();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = python3Target1.getImplicitTokenLabel("_");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getListLabel("hi!");
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("\\nContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target1.gen;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\\nContext\"" + "'", str9, "\"\\\\nContext\"");
        org.junit.Assert.assertNull(codeGenerator10);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\\n");
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("_\"\\\\nContext\"");
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("_tset_tset_tset4.5.2.1");
        java.util.Set<java.lang.String> strSet11 = python3Target1.badWords;
        java.util.Set<java.lang.String> strSet12 = python3Target1.badWords;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\\n\"" + "'", str6, "\"\\\\n\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_\\\"\\\\\\\\nContext\\\"\"" + "'", str8, "\"_\\\"\\\\\\\\nContext\\\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tset_tset_tset4.5.2.1\"" + "'", str10, "\"_tset_tset_tset4.5.2.1\"");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator8);
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        python3Target9.genRecognizerHeaderFile(grammar10, sT11, "hi!");
        java.lang.String str14 = python3Target9.getVersion();
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target9.loadTemplates();
        python3Target1.templates = sTGroup15;
        java.lang.String str18 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.stringtemplate.v4.ST sT20 = null;
        python3Target1.genRecognizerHeaderFile(grammar19, sT20, "_tset");
        java.lang.String str24 = python3Target1.getTargetStringLiteralFromString("\"tset\\\"\\\\n\\\"Contex\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset4.5.2.1" + "'", str18, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"\\\"tset\\\\\\\"\\\\\\\\n\\\\\\\"Contex\\\"\"" + "'", str24, "\"\\\"tset\\\\\\\"\\\\\\\\n\\\\\\\"Contex\\\"\"");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("\"tset4.5.2.\"");
        python3Target1.addBadWords();
        java.lang.String str9 = python3Target1.encodeIntAsCharEscape(29);
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getLoopCounter(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_\"tset4.5.2.\"" + "'", str6, "_\"tset4.5.2.\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\35" + "'", str9, "\\35");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        int int6 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genFile(grammar7, sT8, "4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String[] strArray5 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target1.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target1.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator9);
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python3Target10.genRecognizerHeaderFile(grammar11, sT12, "hi!");
        java.lang.String str15 = python3Target10.getVersion();
        org.stringtemplate.v4.STGroup sTGroup16 = python3Target10.loadTemplates();
        python3Target1.templates = sTGroup16;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target1.getElementListName("\"tset\\\"\\\\n\\\"Contex\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4.5.2.1" + "'", str15, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup16);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.loadTemplates();
        java.util.Set<java.lang.String> strSet8 = python3Target1.badWords;
        python3Target1.language = "\"\\\"4.5.2.1\\\"\"";
        int int11 = python3Target1.getSerializedATNSegmentLimit();
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup12 = python3Target1.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29 + "'", int11 == 29);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        python3Target1.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        python3Target1.gen = codeGenerator5;
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        python3Target1.gen = codeGenerator8;
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genListenerFile(grammar10, sT11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\\n");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator7);
        java.lang.String str10 = python3Target8.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target8.templates;
        java.lang.String[] strArray12 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target8.targetCharValueEscape = strArray12;
        java.lang.String str15 = python3Target8.getImplicitSetLabel("");
        java.lang.String[] strArray25 = new java.lang.String[] { "\"\\\\n\"", "\\nContext", "4.5.2.1", "\"\"", "_tset", "\\nContext", "\\nContext", "\\nContext", "\\nContext" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        python3Target8.badWords = strSet26;
        python3Target1.badWords = strSet26;
        org.antlr.v4.tool.ast.GrammarAST grammarAST30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = python3Target1.getLoopLabel(grammarAST30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\\n\"" + "'", str6, "\"\\\\n\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\nContext" + "'", str10, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset" + "'", str15, "_tset");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str1 = python3Target0.getVersion();
        org.antlr.v4.tool.ast.GrammarAST grammarAST2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = python3Target0.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4.5.2.1" + "'", str1, "4.5.2.1");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.loadTemplates();
        java.util.Set<java.lang.String> strSet8 = python3Target1.badWords;
        org.antlr.v4.tool.Grammar grammar9 = null;
        int[] intArray10 = new int[] {};
        java.lang.String[] strArray11 = python3Target1.getTokenTypesAsTargetLabels(grammar9, intArray10);
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray11;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\\35");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\35" + "'", str1, "\\35");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String[] strArray5 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target1.targetCharValueEscape = strArray5;
        int int7 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\\\"tset\\\\\\\"_tset\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"tset\\\\\\\"_tset\\\"\"" + "'", str1, "\"\\\"tset\\\\\\\"_tset\\\"\"");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getImplicitSetLabel("_tset_tset4.5.2.1");
        java.lang.String str7 = python3Target1.getLanguage();
        org.antlr.v4.tool.Grammar grammar8 = null;
        int[] intArray10 = new int[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray11 = python3Target1.getTokenTypesAsTargetLabels(grammar8, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset_tset_tset4.5.2.1" + "'", str6, "_tset_tset_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[97]");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator8);
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        python3Target9.genRecognizerHeaderFile(grammar10, sT11, "hi!");
        java.lang.String str14 = python3Target9.getVersion();
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target9.loadTemplates();
        python3Target1.templates = sTGroup15;
        java.lang.String str18 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.stringtemplate.v4.ST sT20 = null;
        python3Target1.genRecognizerHeaderFile(grammar19, sT20, "_tset");
        boolean boolean23 = python3Target1.supportsOverloadedMethods();
        java.lang.String str24 = python3Target1.getLanguage();
        org.antlr.v4.tool.Rule rule25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = python3Target1.getRuleFunctionContextStructName(rule25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset4.5.2.1" + "'", str18, "_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Python3" + "'", str24, "Python3");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("\"tset4.5.2.\"");
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("Python3");
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getTokenTypeAsTargetLabel(grammar10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_\"tset4.5.2.\"" + "'", str6, "_\"tset4.5.2.\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python3Context" + "'", str8, "Python3Context");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        java.lang.String[] strArray12 = new java.lang.String[] { "4.5.2.1", "\\n", "", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        python3Target1.badWords = strSet13;
        java.lang.String str17 = python3Target1.getListLabel("hi!");
        java.util.Set<java.lang.String> strSet18 = python3Target1.badWords;
        boolean boolean19 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python3Target1.getRuleFunctionContextStructName(ruleFunction20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"4.5.2.1\"", false);
        org.stringtemplate.v4.STGroup sTGroup18 = python3Target1.getTemplates();
        boolean boolean19 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar20 = null;
        org.stringtemplate.v4.ST sT21 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genListenerFile(grammar20, sT21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        int int4 = python3Target1.getInlineTestSetWordSize();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        java.lang.String str7 = python3Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String[] strArray8 = python3Target1.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator10);
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.stringtemplate.v4.ST sT13 = null;
        python3Target11.genRecognizerHeaderFile(grammar12, sT13, "hi!");
        java.lang.String str16 = python3Target11.getVersion();
        org.stringtemplate.v4.STGroup sTGroup17 = python3Target11.loadTemplates();
        java.util.Set<java.lang.String> strSet18 = python3Target11.badWords;
        org.antlr.v4.tool.Grammar grammar19 = null;
        int[] intArray20 = new int[] {};
        java.lang.String[] strArray21 = python3Target11.getTokenTypesAsTargetLabels(grammar19, intArray20);
        java.lang.String[] strArray22 = python3Target1.getTokenTypesAsTargetLabels(grammar9, intArray20);
        java.lang.String str24 = python3Target1.encodeIntAsCharEscape(64);
        org.antlr.v4.tool.ast.GrammarAST grammarAST25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = python3Target1.getLoopLabel(grammarAST25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d" + "'", str7, "d");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "4.5.2.1" + "'", str16, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[]");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "@" + "'", str24, "@");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        python3Target1.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        python3Target1.gen = codeGenerator5;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.gen;
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        python3Target1.gen = codeGenerator8;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getImplicitTokenLabel("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup7);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.stringtemplate.v4.ST sT6 = null;
        python3Target1.genRecognizerHeaderFile(grammar5, sT6, "\\n");
        python3Target1.addBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getLoopLabel(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\\n");
        java.lang.String str8 = python3Target1.encodeIntAsCharEscape(10);
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromString("\"_tset_tset4.5.2.1\"", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\\n\"" + "'", str6, "\"\\\\n\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\n" + "'", str8, "\\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\\"_tset_tset4.5.2.1\\\"" + "'", str11, "\\\"_tset_tset4.5.2.1\\\"");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"4.5.2.1\"", false);
        java.lang.String str18 = python3Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python3Target1.getElementName("@");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target17 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator16);
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.stringtemplate.v4.ST sT19 = null;
        python3Target17.genRecognizerHeaderFile(grammar18, sT19, "hi!");
        java.lang.String str22 = python3Target17.getVersion();
        org.stringtemplate.v4.STGroup sTGroup23 = python3Target17.loadTemplates();
        python3Target1.templates = sTGroup23;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = python3Target1.getRuleFunctionContextStructName(ruleFunction25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset4.5.2.1" + "'", str15, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4.5.2.1" + "'", str22, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup23);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        boolean boolean4 = python3Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        python3Target1.addBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getLoopCounter(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        python3Target1.language = "_tset";
        org.antlr.v4.codegen.model.RuleFunction ruleFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getRuleFunctionContextStructName(ruleFunction15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        boolean boolean4 = python3Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        python3Target1.addBadWords();
        org.antlr.v4.tool.Grammar grammar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getTokenTypeAsTargetLabel(grammar8, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        python3Target1.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        python3Target1.gen = codeGenerator5;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target1.getCodeGenerator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNull(codeGenerator7);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String[] strArray5 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target1.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target1.getImplicitSetLabel("");
        java.lang.String[] strArray18 = new java.lang.String[] { "\"\\\\n\"", "\\nContext", "4.5.2.1", "\"\"", "_tset", "\\nContext", "\\nContext", "\\nContext", "\\nContext" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python3Target1.badWords = strSet19;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = python3Target1.getElementListName("1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("\"tset4.5.2.\"");
        python3Target1.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator8);
        java.lang.String str11 = python3Target9.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target9.templates;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target9.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python3Target9.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target16 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator15);
        java.lang.String str18 = python3Target16.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.stringtemplate.v4.ST sT20 = null;
        python3Target16.genRecognizerHeaderFile(grammar19, sT20, "\\nContext");
        java.lang.String[] strArray27 = new java.lang.String[] { "4.5.2.1", "\\n", "", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        python3Target16.badWords = strSet28;
        python3Target9.badWords = strSet28;
        python3Target1.badWords = strSet28;
        org.stringtemplate.v4.STGroup sTGroup33 = python3Target1.loadTemplates();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = python3Target1.getRuleFunctionContextStructName(ruleFunction34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_\"tset4.5.2.\"" + "'", str6, "_\"tset4.5.2.\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\n" + "'", str11, "\\n");
        org.junit.Assert.assertNull(sTGroup12);
        org.junit.Assert.assertNull(sTGroup13);
        org.junit.Assert.assertNull(codeGenerator14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\\n" + "'", str18, "\\n");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(sTGroup33);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("tset4.5.2.");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "tset4.5.2." + "'", str1, "tset4.5.2.");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.loadTemplates();
        java.util.Set<java.lang.String> strSet8 = python3Target1.badWords;
        org.antlr.v4.tool.Grammar grammar9 = null;
        int[] intArray10 = new int[] {};
        java.lang.String[] strArray11 = python3Target1.getTokenTypesAsTargetLabels(grammar9, intArray10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target13 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator12);
        java.lang.String str15 = python3Target13.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup16 = python3Target13.templates;
        java.lang.String[] strArray17 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target13.targetCharValueEscape = strArray17;
        java.lang.String str20 = python3Target13.getImplicitSetLabel("");
        java.lang.String[] strArray30 = new java.lang.String[] { "\"\\\\n\"", "\\nContext", "4.5.2.1", "\"\"", "_tset", "\\nContext", "\\nContext", "\\nContext", "\\nContext" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        python3Target13.badWords = strSet31;
        org.antlr.v4.tool.Grammar grammar34 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target36 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator35);
        org.antlr.v4.tool.Grammar grammar37 = null;
        org.stringtemplate.v4.ST sT38 = null;
        python3Target36.genRecognizerHeaderFile(grammar37, sT38, "hi!");
        java.lang.String str41 = python3Target36.getVersion();
        org.stringtemplate.v4.STGroup sTGroup42 = python3Target36.loadTemplates();
        java.util.Set<java.lang.String> strSet43 = python3Target36.badWords;
        python3Target36.language = "\"\\\"4.5.2.1\\\"\"";
        org.antlr.v4.tool.Grammar grammar46 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator47 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target48 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator47);
        java.lang.String str50 = python3Target48.getAltLabelContextStructName("\\n");
        int int51 = python3Target48.getInlineTestSetWordSize();
        boolean boolean52 = python3Target48.wantsBaseVisitor();
        java.lang.String str54 = python3Target48.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String[] strArray55 = python3Target48.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar56 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator57 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target58 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator57);
        org.antlr.v4.tool.Grammar grammar59 = null;
        org.stringtemplate.v4.ST sT60 = null;
        python3Target58.genRecognizerHeaderFile(grammar59, sT60, "hi!");
        java.lang.String str63 = python3Target58.getVersion();
        org.stringtemplate.v4.STGroup sTGroup64 = python3Target58.loadTemplates();
        java.util.Set<java.lang.String> strSet65 = python3Target58.badWords;
        org.antlr.v4.tool.Grammar grammar66 = null;
        int[] intArray67 = new int[] {};
        java.lang.String[] strArray68 = python3Target58.getTokenTypesAsTargetLabels(grammar66, intArray67);
        java.lang.String[] strArray69 = python3Target48.getTokenTypesAsTargetLabels(grammar56, intArray67);
        java.lang.String[] strArray70 = python3Target36.getTokenTypesAsTargetLabels(grammar46, intArray67);
        java.lang.String[] strArray71 = python3Target13.getTokenTypesAsTargetLabels(grammar34, intArray67);
        python3Target1.targetCharValueEscape = strArray71;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\nContext" + "'", str15, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "_tset" + "'", str20, "_tset");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "4.5.2.1" + "'", str41, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup42);
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "\\nContext" + "'", str50, "\\nContext");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 64 + "'", int51 == 64);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "d" + "'", str54, "d");
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "4.5.2.1" + "'", str63, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup64);
        org.junit.Assert.assertNotNull(strSet65);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[]");
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(strArray71);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator8);
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        python3Target9.genRecognizerHeaderFile(grammar10, sT11, "hi!");
        java.lang.String str14 = python3Target9.getVersion();
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target9.loadTemplates();
        python3Target1.templates = sTGroup15;
        java.lang.String str18 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.stringtemplate.v4.ST sT20 = null;
        python3Target1.genRecognizerHeaderFile(grammar19, sT20, "_tset");
        org.stringtemplate.v4.STGroup sTGroup23 = python3Target1.loadTemplates();
        java.lang.String str25 = python3Target1.encodeIntAsCharEscape((int) (short) 100);
        org.antlr.v4.tool.ast.GrammarAST grammarAST26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset4.5.2.1" + "'", str18, "_tset4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        python3Target1.language = "\"\"";
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "", false);
        java.util.Set<java.lang.String> strSet12 = python3Target1.badWords;
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.loadTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"4.5.2.1\"", false);
        java.lang.String str18 = python3Target1.getVersion();
        java.lang.String str19 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        python3Target1.gen = codeGenerator20;
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Python3" + "'", str19, "Python3");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "\"\"", locale3);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator5);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target6.getCodeGenerator();
        boolean boolean8 = python3Target6.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\"\\\\nContext\"", false);
        java.util.Locale locale14 = null;
        java.lang.String str15 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator9, "\"tset4.5.2.\"", locale14);
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target17 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator16);
        java.lang.String str19 = python3Target17.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup20 = python3Target17.templates;
        java.lang.String[] strArray21 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target17.targetCharValueEscape = strArray21;
        java.lang.String str24 = python3Target17.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = python3Target17.gen;
        java.util.Locale locale27 = null;
        java.lang.String str28 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator25, "\"_\\\"\\\\\\\\nContext\\\"\"", locale27);
        org.antlr.v4.codegen.CodeGenerator codeGenerator29 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target30 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator29);
        java.lang.String str32 = python3Target30.getAltLabelContextStructName("\\n");
        int int33 = python3Target30.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = python3Target30.getCodeGenerator();
        java.lang.String[] strArray35 = python3Target30.targetCharValueEscape;
        python3Target30.language = "_tset_tset4.5.2.1";
        java.util.Locale locale39 = null;
        java.lang.String str40 = pythonStringRenderer0.toString((java.lang.Object) "_tset_tset4.5.2.1", "_tset\"tset4.5.2.\"", locale39);
        java.util.Locale locale43 = null;
        java.lang.String str44 = pythonStringRenderer0.toString((java.lang.Object) "\\\\nContext", "\"4.5.2.1\"", locale43);
        org.antlr.v4.codegen.CodeGenerator codeGenerator45 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target46 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator45);
        org.antlr.v4.tool.Grammar grammar47 = null;
        org.stringtemplate.v4.ST sT48 = null;
        python3Target46.genRecognizerHeaderFile(grammar47, sT48, "hi!");
        java.lang.String str51 = python3Target46.getVersion();
        org.stringtemplate.v4.STGroup sTGroup52 = python3Target46.loadTemplates();
        java.util.Set<java.lang.String> strSet53 = python3Target46.badWords;
        python3Target46.language = "\"\\\"4.5.2.1\\\"\"";
        org.antlr.v4.tool.Grammar grammar56 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator57 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target58 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator57);
        java.lang.String str60 = python3Target58.getAltLabelContextStructName("\\n");
        int int61 = python3Target58.getInlineTestSetWordSize();
        boolean boolean62 = python3Target58.wantsBaseVisitor();
        java.lang.String str64 = python3Target58.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String[] strArray65 = python3Target58.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar66 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator67 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target68 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator67);
        org.antlr.v4.tool.Grammar grammar69 = null;
        org.stringtemplate.v4.ST sT70 = null;
        python3Target68.genRecognizerHeaderFile(grammar69, sT70, "hi!");
        java.lang.String str73 = python3Target68.getVersion();
        org.stringtemplate.v4.STGroup sTGroup74 = python3Target68.loadTemplates();
        java.util.Set<java.lang.String> strSet75 = python3Target68.badWords;
        org.antlr.v4.tool.Grammar grammar76 = null;
        int[] intArray77 = new int[] {};
        java.lang.String[] strArray78 = python3Target68.getTokenTypesAsTargetLabels(grammar76, intArray77);
        java.lang.String[] strArray79 = python3Target58.getTokenTypesAsTargetLabels(grammar66, intArray77);
        java.lang.String[] strArray80 = python3Target46.getTokenTypesAsTargetLabels(grammar56, intArray77);
        java.util.Locale locale82 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str83 = pythonStringRenderer0.toString((java.lang.Object) intArray77, "\"\\\"tset\\\\\\\"\\\\\\\\n\\\\\\\"Contex\\\"\"", locale82);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: [I cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\\\nContext" + "'", str12, "\\\\nContext");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"tset4.5.2.\"" + "'", str15, "\"tset4.5.2.\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\\nContext" + "'", str19, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "_tset" + "'", str24, "_tset");
        org.junit.Assert.assertNull(codeGenerator25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"_\\\"\\\\\\\\nContext\\\"\"" + "'", str28, "\"_\\\"\\\\\\\\nContext\\\"\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\\nContext" + "'", str32, "\\nContext");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 64 + "'", int33 == 64);
        org.junit.Assert.assertNull(codeGenerator34);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "_tset\"tset4.5.2.\"" + "'", str40, "_tset\"tset4.5.2.\"");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\"4.5.2.1\"" + "'", str44, "\"4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "4.5.2.1" + "'", str51, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup52);
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "\\nContext" + "'", str60, "\\nContext");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 64 + "'", int61 == 64);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "d" + "'", str64, "d");
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "4.5.2.1" + "'", str73, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup74);
        org.junit.Assert.assertNotNull(strSet75);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[]");
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(strArray80);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("\"tset4.5.2.\"");
        python3Target1.addBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getLoopCounter(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_\"tset4.5.2.\"" + "'", str6, "_\"tset4.5.2.\"");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("4.5.2.1");
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target1.genRecognizerHeaderFile(grammar6, sT7, "_tset\"\\\\n\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = python3Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"4.5.2.1\"" + "'", str5, "\"4.5.2.1\"");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        python3Target1.language = "\"\"";
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target1.gen;
        int int13 = python3Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getImplicitRuleLabel("\"tset4.5.2.\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String[] strArray5 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target1.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target1.getImplicitSetLabel("");
        java.lang.String[] strArray18 = new java.lang.String[] { "\"\\\\n\"", "\\nContext", "4.5.2.1", "\"\"", "_tset", "\\nContext", "\\nContext", "\\nContext", "\\nContext" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python3Target1.badWords = strSet19;
        java.util.Set<java.lang.String> strSet22 = python3Target1.badWords;
        java.lang.String str24 = python3Target1.getTargetStringLiteralFromString("_tset\\n");
        org.antlr.v4.tool.ast.GrammarAST grammarAST25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = python3Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"_tset\\n\"" + "'", str24, "\"_tset\\n\"");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        python3Target1.language = "\"\"";
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "", false);
        boolean boolean12 = python3Target1.wantsBaseListener();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target1.gen;
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(codeGenerator13);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.stringtemplate.v4.ST sT14 = null;
        python3Target1.genRecognizerHeaderFile(grammar13, sT14, "");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python3Target1.getRuleFunctionContextStructName(ruleFunction17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str5 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getLanguage();
        boolean boolean7 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        python3Target1.genRecognizerHeaderFile(grammar8, sT9, "");
        python3Target1.language = "_tset_tset4.5.2.1";
        java.lang.String str14 = python3Target1.getVersion();
        java.lang.String[] strArray15 = python3Target1.targetCharValueEscape;
        org.antlr.v4.tool.ast.GrammarAST grammarAST16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        boolean boolean4 = python3Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("\"tset\\\"_tset\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getLoopCounter(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"tset\\\\\\\"_tset\\\"\"" + "'", str8, "\"\\\"tset\\\\\\\"_tset\\\"\"");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "\"\"", locale3);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator5);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "", true);
        java.lang.String str11 = python3Target6.getLanguage();
        java.lang.String str13 = python3Target6.getImplicitRuleLabel("_tset_tset4.5.2.1");
        java.util.Locale locale15 = null;
        java.lang.String str16 = pythonStringRenderer0.toString((java.lang.Object) str13, "\"\\\\\\\\nContext\"", locale15);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\"" + "'", str10, "\"\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Python3" + "'", str11, "Python3");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "__tset_tset4.5.2.1" + "'", str13, "__tset_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\\\\\\\nContext\"" + "'", str16, "\"\\\\\\\\nContext\"");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        python3Target1.language = "\"\"";
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "", false);
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target1.templates;
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.stringtemplate.v4.ST sT14 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genListenerFile(grammar13, sT14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(sTGroup12);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "_tset4.5.2.1", false);
        java.lang.String str8 = python3Target1.getVersion();
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genListenerFile(grammar9, sT10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "tset4.5.2." + "'", str7, "tset4.5.2.");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target15 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator14);
        java.lang.String str17 = python3Target15.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup18 = python3Target15.templates;
        python3Target1.templates = sTGroup18;
        java.lang.String str21 = python3Target1.getImplicitSetLabel("\"\\\\n\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = python3Target1.getElementName("_tset\"\\\"_Python3\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\nContext" + "'", str17, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "_tset\"\\\\n\"" + "'", str21, "_tset\"\\\\n\"");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "", true);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target1.genRecognizerHeaderFile(grammar6, sT7, "_tset\"\\\\n\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getLoopLabel(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\\\"tset4.5.2.\\\"Context\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"tset4.5.2.\\\"Context\"" + "'", str1, "\"\\\"tset4.5.2.\\\"Context\"");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        java.lang.String str9 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.tool.Grammar grammar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getTokenTypeAsTargetLabel(grammar10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset4.5.2.1" + "'", str9, "_tset4.5.2.1");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        java.lang.String str9 = python3Target1.getImplicitSetLabel("4.5.2.1");
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromString("_tset", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getElementListName("\"\\\"_tset_tset4.5.2.1\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset4.5.2.1" + "'", str9, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_tset\"" + "'", str12, "\"_tset\"");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        int int4 = python3Target1.getInlineTestSetWordSize();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        java.lang.String str7 = python3Target1.encodeIntAsCharEscape((int) ' ');
        org.antlr.v4.tool.Grammar grammar8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getTokenTypeAsTargetLabel(grammar8, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        boolean boolean4 = python3Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.loadTemplates();
        java.lang.String str7 = python3Target1.getAltLabelContextStructName("_tset_tset_tset4.5.2.1");
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genFile(grammar8, sT9, "_tset\"_tset\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset_tset_tset4.5.2.1Context" + "'", str7, "_tset_tset_tset4.5.2.1Context");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.loadTemplates();
        java.util.Set<java.lang.String> strSet8 = python3Target1.badWords;
        python3Target1.language = "\"\\\"4.5.2.1\\\"\"";
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromString("_tset_tset4.5.2.1");
        boolean boolean13 = python3Target1.supportsOverloadedMethods();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getListLabel("\"_\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_tset_tset4.5.2.1\"" + "'", str12, "\"_tset_tset4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        int int6 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str8 = python3Target1.encodeIntAsCharEscape((int) '#');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#" + "'", str8, "#");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        java.lang.String str8 = python3Target1.getImplicitSetLabel("_tset4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator9);
        java.lang.String str12 = python3Target10.getAltLabelContextStructName("\\n");
        python3Target10.addBadWords();
        java.util.Set<java.lang.String> strSet14 = python3Target10.badWords;
        python3Target1.badWords = strSet14;
        org.stringtemplate.v4.STGroup sTGroup16 = python3Target1.templates;
        org.antlr.v4.tool.ast.GrammarAST grammarAST17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python3Target1.getLoopLabel(grammarAST17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset_tset4.5.2.1" + "'", str8, "_tset_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\nContext" + "'", str12, "\\nContext");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(sTGroup16);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String[] strArray5 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target1.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target1.getImplicitSetLabel("");
        java.lang.String[] strArray18 = new java.lang.String[] { "\"\\\\n\"", "\\nContext", "4.5.2.1", "\"\"", "_tset", "\\nContext", "\\nContext", "\\nContext", "\\nContext" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python3Target1.badWords = strSet19;
        java.util.Set<java.lang.String> strSet22 = python3Target1.badWords;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = python3Target1.getElementName("\"\\\"tset4.5.2.\\\"Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        java.lang.String[] strArray12 = new java.lang.String[] { "4.5.2.1", "\\n", "", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        python3Target1.badWords = strSet13;
        java.lang.String str17 = python3Target1.getListLabel("hi!");
        java.util.Set<java.lang.String> strSet18 = python3Target1.badWords;
        java.lang.String str20 = python3Target1.getTargetStringLiteralFromString("_Python3");
        org.antlr.v4.codegen.model.RuleFunction ruleFunction21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = python3Target1.getRuleFunctionContextStructName(ruleFunction21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"_Python3\"" + "'", str20, "\"_Python3\"");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        python3Target1.language = "\"\"";
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target1.gen;
        int int13 = python3Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getImplicitSetLabel("_tset\"tset4.5.2.\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"4.5.2.1\"", false);
        java.lang.String str18 = python3Target1.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = python3Target1.getElementListName("#");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_tset4.5.2.1" + "'", str1, "_tset4.5.2.1");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "\"\"", locale3);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator5);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target6.getCodeGenerator();
        boolean boolean8 = python3Target6.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\"\\\\nContext\"", false);
        java.util.Locale locale14 = null;
        java.lang.String str15 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator9, "\"tset4.5.2.\"", locale14);
        java.util.Locale locale18 = null;
        java.lang.String str19 = pythonStringRenderer0.toString((java.lang.Object) "\\n", "_tset_tset4.5.2.1", locale18);
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target21 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator20);
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = python3Target21.getCodeGenerator();
        boolean boolean23 = python3Target21.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target25 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator24);
        org.antlr.v4.tool.Grammar grammar26 = null;
        org.stringtemplate.v4.ST sT27 = null;
        python3Target25.genRecognizerHeaderFile(grammar26, sT27, "hi!");
        java.lang.String str30 = python3Target25.getVersion();
        org.stringtemplate.v4.STGroup sTGroup31 = python3Target25.loadTemplates();
        python3Target21.templates = sTGroup31;
        org.stringtemplate.v4.STGroup sTGroup33 = python3Target21.getTemplates();
        org.antlr.v4.tool.Grammar grammar34 = null;
        org.stringtemplate.v4.ST sT35 = null;
        python3Target21.genRecognizerHeaderFile(grammar34, sT35, "\"4.5.2.1\"");
        java.lang.String str39 = python3Target21.encodeIntAsCharEscape((int) (byte) 10);
        org.stringtemplate.v4.STGroup sTGroup40 = python3Target21.getTemplates();
        java.util.Locale locale42 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str43 = pythonStringRenderer0.toString((java.lang.Object) sTGroup40, "\"\\\"tset\\\\\\\"_tset\\\"\"Context", locale42);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.stringtemplate.v4.STGroupFile cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\\\nContext" + "'", str12, "\\\\nContext");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"tset4.5.2.\"" + "'", str15, "\"tset4.5.2.\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_tset_tset4.5.2.1" + "'", str19, "_tset_tset4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "4.5.2.1" + "'", str30, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup31);
        org.junit.Assert.assertNotNull(sTGroup33);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\\n" + "'", str39, "\\n");
        org.junit.Assert.assertNotNull(sTGroup40);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.stringtemplate.v4.ST sT6 = null;
        python3Target1.genRecognizerHeaderFile(grammar5, sT6, "\\n");
        java.lang.String str9 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python3Target1.gen = codeGenerator10;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target13 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator12);
        java.lang.String str15 = python3Target13.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.stringtemplate.v4.ST sT17 = null;
        python3Target13.genRecognizerHeaderFile(grammar16, sT17, "\\nContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target21 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator20);
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.stringtemplate.v4.ST sT23 = null;
        python3Target21.genRecognizerHeaderFile(grammar22, sT23, "hi!");
        java.lang.String str26 = python3Target21.getVersion();
        org.stringtemplate.v4.STGroup sTGroup27 = python3Target21.loadTemplates();
        python3Target13.templates = sTGroup27;
        python3Target1.templates = sTGroup27;
        org.antlr.v4.tool.Grammar grammar30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = python3Target1.getTokenTypeAsTargetLabel(grammar30, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\n" + "'", str15, "\\n");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "4.5.2.1" + "'", str26, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup27);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String[] strArray6 = python3Target1.targetCharValueEscape;
        python3Target1.language = "_tset_tset4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator9);
        java.lang.String str12 = python3Target10.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target10.templates;
        java.lang.String[] strArray14 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target10.targetCharValueEscape = strArray14;
        java.lang.String str17 = python3Target10.getImplicitSetLabel("");
        java.lang.String[] strArray27 = new java.lang.String[] { "\"\\\\n\"", "\\nContext", "4.5.2.1", "\"\"", "_tset", "\\nContext", "\\nContext", "\\nContext", "\\nContext" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        python3Target10.badWords = strSet28;
        org.antlr.v4.tool.Grammar grammar31 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target33 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator32);
        org.antlr.v4.tool.Grammar grammar34 = null;
        org.stringtemplate.v4.ST sT35 = null;
        python3Target33.genRecognizerHeaderFile(grammar34, sT35, "hi!");
        java.lang.String str38 = python3Target33.getVersion();
        org.stringtemplate.v4.STGroup sTGroup39 = python3Target33.loadTemplates();
        java.util.Set<java.lang.String> strSet40 = python3Target33.badWords;
        python3Target33.language = "\"\\\"4.5.2.1\\\"\"";
        org.antlr.v4.tool.Grammar grammar43 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator44 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target45 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator44);
        java.lang.String str47 = python3Target45.getAltLabelContextStructName("\\n");
        int int48 = python3Target45.getInlineTestSetWordSize();
        boolean boolean49 = python3Target45.wantsBaseVisitor();
        java.lang.String str51 = python3Target45.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String[] strArray52 = python3Target45.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar53 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator54 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target55 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator54);
        org.antlr.v4.tool.Grammar grammar56 = null;
        org.stringtemplate.v4.ST sT57 = null;
        python3Target55.genRecognizerHeaderFile(grammar56, sT57, "hi!");
        java.lang.String str60 = python3Target55.getVersion();
        org.stringtemplate.v4.STGroup sTGroup61 = python3Target55.loadTemplates();
        java.util.Set<java.lang.String> strSet62 = python3Target55.badWords;
        org.antlr.v4.tool.Grammar grammar63 = null;
        int[] intArray64 = new int[] {};
        java.lang.String[] strArray65 = python3Target55.getTokenTypesAsTargetLabels(grammar63, intArray64);
        java.lang.String[] strArray66 = python3Target45.getTokenTypesAsTargetLabels(grammar53, intArray64);
        java.lang.String[] strArray67 = python3Target33.getTokenTypesAsTargetLabels(grammar43, intArray64);
        java.lang.String[] strArray68 = python3Target10.getTokenTypesAsTargetLabels(grammar31, intArray64);
        python3Target1.targetCharValueEscape = strArray68;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str71 = python3Target1.getAltLabelContextStructName("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\nContext" + "'", str12, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_tset" + "'", str17, "_tset");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "4.5.2.1" + "'", str38, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup39);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\\nContext" + "'", str47, "\\nContext");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 64 + "'", int48 == 64);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "d" + "'", str51, "d");
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "4.5.2.1" + "'", str60, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup61);
        org.junit.Assert.assertNotNull(strSet62);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[]");
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(strArray68);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target1.gen;
        java.util.Set<java.lang.String> strSet5 = python3Target1.getBadWords();
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertNotNull(strSet5);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("_tset_tset_tset4.5.2.1Context");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_tset_tset_tset4.5.2.1Context" + "'", str1, "_tset_tset_tset4.5.2.1Context");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getImplicitSetLabel("_tset_tset4.5.2.1");
        java.lang.String str7 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getElementName("_tset\"tset4.5.2.\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset_tset_tset4.5.2.1" + "'", str6, "_tset_tset_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python3" + "'", str8, "Python3");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\\n");
        java.lang.String str8 = python3Target1.encodeIntAsCharEscape(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getAltLabelContextStructName("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\\n\"" + "'", str6, "\"\\\\n\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\n" + "'", str8, "\\n");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String[] strArray6 = python3Target1.targetCharValueEscape;
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getLoopLabel(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\\\\1\"Context");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\\1\"Context" + "'", str1, "\"\\\\1\"Context");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        int int7 = python3Target1.getInlineTestSetWordSize();
        java.lang.Class<?> wildcardClass8 = python3Target1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"4.5.2.1\"", false);
        org.stringtemplate.v4.STGroup sTGroup18 = python3Target1.getTemplates();
        java.lang.String str20 = python3Target1.getListLabel("\\1");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = python3Target1.getImplicitTokenLabel("_tset\"4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\\1" + "'", str20, "\\1");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        int int6 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target1.genRecognizerHeaderFile(grammar7, sT8, "\\nContext");
        int int11 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str13 = python3Target1.getAltLabelContextStructName("_");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29 + "'", int11 == 29);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_Context" + "'", str13, "_Context");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        int int6 = python3Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.templates;
        java.util.Set<java.lang.String> strSet8 = python3Target1.badWords;
        java.lang.String str10 = python3Target1.getListLabel("\"\\\"tset\\\\\\\"_tset\\\"\"");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertNull(sTGroup7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"tset\\\\\\\"_tset\\\"\"" + "'", str10, "\"\\\"tset\\\\\\\"_tset\\\"\"");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.loadTemplates();
        java.util.Set<java.lang.String> strSet8 = python3Target1.badWords;
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genListenerFile(grammar9, sT10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String[] strArray5 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target1.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target1.getImplicitSetLabel("");
        java.lang.String[] strArray18 = new java.lang.String[] { "\"\\\\n\"", "\\nContext", "4.5.2.1", "\"\"", "_tset", "\\nContext", "\\nContext", "\\nContext", "\\nContext" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python3Target1.badWords = strSet19;
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target24 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator23);
        org.antlr.v4.tool.Grammar grammar25 = null;
        org.stringtemplate.v4.ST sT26 = null;
        python3Target24.genRecognizerHeaderFile(grammar25, sT26, "hi!");
        java.lang.String str29 = python3Target24.getVersion();
        org.stringtemplate.v4.STGroup sTGroup30 = python3Target24.loadTemplates();
        java.util.Set<java.lang.String> strSet31 = python3Target24.badWords;
        python3Target24.language = "\"\\\"4.5.2.1\\\"\"";
        org.antlr.v4.tool.Grammar grammar34 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target36 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator35);
        java.lang.String str38 = python3Target36.getAltLabelContextStructName("\\n");
        int int39 = python3Target36.getInlineTestSetWordSize();
        boolean boolean40 = python3Target36.wantsBaseVisitor();
        java.lang.String str42 = python3Target36.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String[] strArray43 = python3Target36.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar44 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator45 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target46 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator45);
        org.antlr.v4.tool.Grammar grammar47 = null;
        org.stringtemplate.v4.ST sT48 = null;
        python3Target46.genRecognizerHeaderFile(grammar47, sT48, "hi!");
        java.lang.String str51 = python3Target46.getVersion();
        org.stringtemplate.v4.STGroup sTGroup52 = python3Target46.loadTemplates();
        java.util.Set<java.lang.String> strSet53 = python3Target46.badWords;
        org.antlr.v4.tool.Grammar grammar54 = null;
        int[] intArray55 = new int[] {};
        java.lang.String[] strArray56 = python3Target46.getTokenTypesAsTargetLabels(grammar54, intArray55);
        java.lang.String[] strArray57 = python3Target36.getTokenTypesAsTargetLabels(grammar44, intArray55);
        java.lang.String[] strArray58 = python3Target24.getTokenTypesAsTargetLabels(grammar34, intArray55);
        java.lang.String[] strArray59 = python3Target1.getTokenTypesAsTargetLabels(grammar22, intArray55);
        java.lang.String[] strArray60 = python3Target1.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator61 = null;
        java.lang.String str64 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator61, "\"\\\"_Python3\\\"\"", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST65 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str66 = python3Target1.getLoopLabel(grammarAST65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "4.5.2.1" + "'", str29, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\\nContext" + "'", str38, "\\nContext");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 64 + "'", int39 == 64);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "d" + "'", str42, "d");
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "4.5.2.1" + "'", str51, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup52);
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[]");
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "\"\\\"_Python3\\\"\"" + "'", str64, "\"\\\"_Python3\\\"\"");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        java.lang.String[] strArray12 = new java.lang.String[] { "4.5.2.1", "\\n", "", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        python3Target1.badWords = strSet13;
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.stringtemplate.v4.ST sT17 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genListenerFile(grammar16, sT17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        int int5 = python3Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getImplicitTokenLabel("tset4.5.2.");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 64 + "'", int5 == 64);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        int int4 = python3Target1.getInlineTestSetWordSize();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        java.lang.String str7 = python3Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String[] strArray8 = python3Target1.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator9);
        java.lang.String str12 = python3Target10.getAltLabelContextStructName("\\n");
        java.lang.String str14 = python3Target10.getAltLabelContextStructName("\\n");
        java.lang.String[] strArray15 = python3Target10.targetCharValueEscape;
        python3Target1.targetCharValueEscape = strArray15;
        java.lang.String[] strArray17 = python3Target1.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = null;
        java.lang.String str21 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator18, "_tset_tset_tset4.5.2.1Context", true);
        java.lang.Class<?> wildcardClass22 = python3Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d" + "'", str7, "d");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\nContext" + "'", str12, "\\nContext");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\nContext" + "'", str14, "\\nContext");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"tset_tset_tset4.5.2.1Contex\"" + "'", str21, "\"tset_tset_tset4.5.2.1Contex\"");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator8);
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        python3Target9.genRecognizerHeaderFile(grammar10, sT11, "hi!");
        java.lang.String str14 = python3Target9.getVersion();
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target9.loadTemplates();
        python3Target1.templates = sTGroup15;
        java.lang.String str18 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.stringtemplate.v4.ST sT20 = null;
        python3Target1.genRecognizerHeaderFile(grammar19, sT20, "_tset");
        org.stringtemplate.v4.STGroup sTGroup23 = python3Target1.loadTemplates();
        java.lang.String str25 = python3Target1.getImplicitSetLabel("\"Python\"");
        org.antlr.v4.tool.Grammar grammar26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = python3Target1.getTokenTypeAsTargetLabel(grammar26, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset4.5.2.1" + "'", str18, "_tset4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "_tset\"Python\"" + "'", str25, "_tset\"Python\"");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("_tset");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_tset" + "'", str1, "_tset");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.antlr.v4.tool.Rule rule1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = python3Target0.getRuleFunctionContextStructName(rule1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("__tset\"4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "__tset\"4.5.2.1\"" + "'", str1, "__tset\"4.5.2.1\"");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String[] strArray6 = python3Target1.targetCharValueEscape;
        python3Target1.language = "_tset_tset4.5.2.1";
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator9);
        java.lang.String str12 = python3Target10.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target10.templates;
        java.lang.String[] strArray14 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target10.targetCharValueEscape = strArray14;
        java.lang.String str17 = python3Target10.getImplicitSetLabel("");
        java.lang.String[] strArray27 = new java.lang.String[] { "\"\\\\n\"", "\\nContext", "4.5.2.1", "\"\"", "_tset", "\\nContext", "\\nContext", "\\nContext", "\\nContext" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        python3Target10.badWords = strSet28;
        org.antlr.v4.tool.Grammar grammar31 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator32 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target33 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator32);
        org.antlr.v4.tool.Grammar grammar34 = null;
        org.stringtemplate.v4.ST sT35 = null;
        python3Target33.genRecognizerHeaderFile(grammar34, sT35, "hi!");
        java.lang.String str38 = python3Target33.getVersion();
        org.stringtemplate.v4.STGroup sTGroup39 = python3Target33.loadTemplates();
        java.util.Set<java.lang.String> strSet40 = python3Target33.badWords;
        python3Target33.language = "\"\\\"4.5.2.1\\\"\"";
        org.antlr.v4.tool.Grammar grammar43 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator44 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target45 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator44);
        java.lang.String str47 = python3Target45.getAltLabelContextStructName("\\n");
        int int48 = python3Target45.getInlineTestSetWordSize();
        boolean boolean49 = python3Target45.wantsBaseVisitor();
        java.lang.String str51 = python3Target45.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String[] strArray52 = python3Target45.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar53 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator54 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target55 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator54);
        org.antlr.v4.tool.Grammar grammar56 = null;
        org.stringtemplate.v4.ST sT57 = null;
        python3Target55.genRecognizerHeaderFile(grammar56, sT57, "hi!");
        java.lang.String str60 = python3Target55.getVersion();
        org.stringtemplate.v4.STGroup sTGroup61 = python3Target55.loadTemplates();
        java.util.Set<java.lang.String> strSet62 = python3Target55.badWords;
        org.antlr.v4.tool.Grammar grammar63 = null;
        int[] intArray64 = new int[] {};
        java.lang.String[] strArray65 = python3Target55.getTokenTypesAsTargetLabels(grammar63, intArray64);
        java.lang.String[] strArray66 = python3Target45.getTokenTypesAsTargetLabels(grammar53, intArray64);
        java.lang.String[] strArray67 = python3Target33.getTokenTypesAsTargetLabels(grammar43, intArray64);
        java.lang.String[] strArray68 = python3Target10.getTokenTypesAsTargetLabels(grammar31, intArray64);
        python3Target1.targetCharValueEscape = strArray68;
        boolean boolean70 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\nContext" + "'", str12, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_tset" + "'", str17, "_tset");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "4.5.2.1" + "'", str38, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup39);
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\\nContext" + "'", str47, "\\nContext");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 64 + "'", int48 == 64);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "d" + "'", str51, "d");
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "4.5.2.1" + "'", str60, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup61);
        org.junit.Assert.assertNotNull(strSet62);
        org.junit.Assert.assertNotNull(intArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray64), "[]");
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator8);
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        python3Target9.genRecognizerHeaderFile(grammar10, sT11, "hi!");
        java.lang.String str14 = python3Target9.getVersion();
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target9.loadTemplates();
        python3Target1.templates = sTGroup15;
        java.lang.String[] strArray17 = python3Target1.targetCharValueEscape;
        java.lang.String str19 = python3Target1.getImplicitRuleLabel("\"\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python3Target1.getElementListName("\"\\\\n\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_\"\"" + "'", str19, "_\"\"");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String[] strArray5 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target1.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target1.getImplicitSetLabel("");
        java.lang.String[] strArray18 = new java.lang.String[] { "\"\\\\n\"", "\\nContext", "4.5.2.1", "\"\"", "_tset", "\\nContext", "\\nContext", "\\nContext", "\\nContext" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python3Target1.badWords = strSet19;
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        python3Target1.gen = codeGenerator22;
        int int24 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = python3Target1.getRuleFunctionContextStructName(ruleFunction25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 29 + "'", int24 == 29);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "", true);
        java.lang.String str6 = python3Target1.getLanguage();
        python3Target1.language = "Python3";
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator11);
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.stringtemplate.v4.ST sT14 = null;
        python3Target12.genRecognizerHeaderFile(grammar13, sT14, "hi!");
        java.lang.String str17 = python3Target12.getVersion();
        org.stringtemplate.v4.STGroup sTGroup18 = python3Target12.loadTemplates();
        java.util.Set<java.lang.String> strSet19 = python3Target12.badWords;
        python3Target12.language = "\"\\\"4.5.2.1\\\"\"";
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target24 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator23);
        java.lang.String str26 = python3Target24.getAltLabelContextStructName("\\n");
        int int27 = python3Target24.getInlineTestSetWordSize();
        boolean boolean28 = python3Target24.wantsBaseVisitor();
        java.lang.String str30 = python3Target24.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String[] strArray31 = python3Target24.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar32 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target34 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator33);
        org.antlr.v4.tool.Grammar grammar35 = null;
        org.stringtemplate.v4.ST sT36 = null;
        python3Target34.genRecognizerHeaderFile(grammar35, sT36, "hi!");
        java.lang.String str39 = python3Target34.getVersion();
        org.stringtemplate.v4.STGroup sTGroup40 = python3Target34.loadTemplates();
        java.util.Set<java.lang.String> strSet41 = python3Target34.badWords;
        org.antlr.v4.tool.Grammar grammar42 = null;
        int[] intArray43 = new int[] {};
        java.lang.String[] strArray44 = python3Target34.getTokenTypesAsTargetLabels(grammar42, intArray43);
        java.lang.String[] strArray45 = python3Target24.getTokenTypesAsTargetLabels(grammar32, intArray43);
        java.lang.String[] strArray46 = python3Target12.getTokenTypesAsTargetLabels(grammar22, intArray43);
        java.lang.String[] strArray47 = python3Target1.getTokenTypesAsTargetLabels(grammar10, intArray43);
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray47;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\\nContext" + "'", str26, "\\nContext");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 64 + "'", int27 == 64);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "d" + "'", str30, "d");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "4.5.2.1" + "'", str39, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup40);
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[]");
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNotNull(strArray47);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target1.genRecognizerHeaderFile(grammar3, sT4, "");
        boolean boolean7 = python3Target1.templatesExist();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String[] strArray5 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target1.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target1.getImplicitSetLabel("");
        java.lang.String[] strArray18 = new java.lang.String[] { "\"\\\\n\"", "\\nContext", "4.5.2.1", "\"\"", "_tset", "\\nContext", "\\nContext", "\\nContext", "\\nContext" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python3Target1.badWords = strSet19;
        java.util.Set<java.lang.String> strSet22 = python3Target1.badWords;
        boolean boolean23 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup24 = python3Target1.loadTemplates();
        boolean boolean25 = python3Target1.templatesExist();
        org.antlr.v4.tool.Grammar grammar26 = null;
        org.stringtemplate.v4.ST sT27 = null;
        python3Target1.genRecognizerHeaderFile(grammar26, sT27, "_tsetContext");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = python3Target1.getImplicitTokenLabel("\"\\\"tset\\\\\\\"\\\\\\\\n\\\\\\\"Contex\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(sTGroup24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator8);
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        python3Target9.genRecognizerHeaderFile(grammar10, sT11, "hi!");
        java.lang.String str14 = python3Target9.getVersion();
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target9.loadTemplates();
        python3Target1.templates = sTGroup15;
        java.lang.String str18 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.stringtemplate.v4.ST sT20 = null;
        python3Target1.genRecognizerHeaderFile(grammar19, sT20, "_tset");
        java.lang.String str24 = python3Target1.getAltLabelContextStructName("_tset\\n");
        java.lang.String str26 = python3Target1.getListLabel("\\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset4.5.2.1" + "'", str18, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "_tset\\nContext" + "'", str24, "_tset\\nContext");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\\n" + "'", str26, "\\n");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        java.lang.String str9 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.loadTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getImplicitTokenLabel("\"\\\"tset4.5.2.\\\"Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset4.5.2.1" + "'", str9, "_tset4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup10);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\\\"tset\\\\\\\"_tset\\\"\"Context");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"tset\\\\\\\"_tset\\\"\"Context" + "'", str1, "\"\\\"tset\\\\\\\"_tset\\\"\"Context");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getImplicitSetLabel("_tset_tset4.5.2.1");
        java.lang.String str7 = python3Target1.getLanguage();
        java.lang.String str9 = python3Target1.getAltLabelContextStructName("\\35");
        java.lang.String str11 = python3Target1.getImplicitSetLabel("_tset\"Python\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset_tset_tset4.5.2.1" + "'", str6, "_tset_tset_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\\35Context" + "'", str9, "\\35Context");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset_tset\"Python\"" + "'", str11, "_tset_tset\"Python\"");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        python3Target5.language = "\"\"";
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python3Target5.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "", false);
        java.util.Set<java.lang.String> strSet16 = python3Target5.badWords;
        python3Target1.badWords = strSet16;
        org.antlr.v4.tool.ast.GrammarAST grammarAST18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = python3Target1.getLoopLabel(grammarAST18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        int int6 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("\"tset\\\"_tset\"", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 29 + "'", int6 == 29);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"tset\\\\\\\"_tset\\\"\"" + "'", str9, "\"\\\"tset\\\\\\\"_tset\\\"\"");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("\"tset4.5.2.\"");
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("Python3");
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getRuleFunctionContextStructName(ruleFunction10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_\"tset4.5.2.\"" + "'", str6, "_\"tset4.5.2.\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python3Context" + "'", str8, "Python3Context");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "", true);
        java.lang.String str6 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator9);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target10.getCodeGenerator();
        boolean boolean12 = python3Target10.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target14 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator13);
        org.antlr.v4.tool.Grammar grammar15 = null;
        org.stringtemplate.v4.ST sT16 = null;
        python3Target14.genRecognizerHeaderFile(grammar15, sT16, "hi!");
        java.lang.String str19 = python3Target14.getVersion();
        org.stringtemplate.v4.STGroup sTGroup20 = python3Target14.loadTemplates();
        python3Target10.templates = sTGroup20;
        org.stringtemplate.v4.STGroup sTGroup22 = python3Target10.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        java.lang.String str26 = python3Target10.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator23, "\"4.5.2.1\"", false);
        org.stringtemplate.v4.STGroup sTGroup27 = python3Target10.getTemplates();
        python3Target1.templates = sTGroup27;
        boolean boolean29 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar30 = null;
        org.stringtemplate.v4.ST sT31 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genFile(grammar30, sT31, "\"\\\\\\\\nContext\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_" + "'", str8, "_");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "4.5.2.1" + "'", str19, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup20);
        org.junit.Assert.assertNotNull(sTGroup22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "4.5.2.1" + "'", str26, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "", true);
        java.lang.String str6 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getImplicitRuleLabel("_tset_tset4.5.2.1");
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genListenerFile(grammar9, sT10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "__tset_tset4.5.2.1" + "'", str8, "__tset_tset4.5.2.1");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator8);
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        python3Target9.genRecognizerHeaderFile(grammar10, sT11, "hi!");
        java.lang.String str14 = python3Target9.getVersion();
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target9.loadTemplates();
        python3Target1.templates = sTGroup15;
        java.lang.String[] strArray17 = python3Target1.targetCharValueEscape;
        java.lang.String str19 = python3Target1.getImplicitRuleLabel("\"\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python3Target1.getLoopCounter(grammarAST20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_\"\"" + "'", str19, "_\"\"");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.loadTemplates();
        java.util.Set<java.lang.String> strSet8 = python3Target1.badWords;
        python3Target1.language = "\"\\\"4.5.2.1\\\"\"";
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target13 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator12);
        java.lang.String str15 = python3Target13.getAltLabelContextStructName("\\n");
        int int16 = python3Target13.getInlineTestSetWordSize();
        boolean boolean17 = python3Target13.wantsBaseVisitor();
        java.lang.String str19 = python3Target13.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String[] strArray20 = python3Target13.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar21 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target23 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator22);
        org.antlr.v4.tool.Grammar grammar24 = null;
        org.stringtemplate.v4.ST sT25 = null;
        python3Target23.genRecognizerHeaderFile(grammar24, sT25, "hi!");
        java.lang.String str28 = python3Target23.getVersion();
        org.stringtemplate.v4.STGroup sTGroup29 = python3Target23.loadTemplates();
        java.util.Set<java.lang.String> strSet30 = python3Target23.badWords;
        org.antlr.v4.tool.Grammar grammar31 = null;
        int[] intArray32 = new int[] {};
        java.lang.String[] strArray33 = python3Target23.getTokenTypesAsTargetLabels(grammar31, intArray32);
        java.lang.String[] strArray34 = python3Target13.getTokenTypesAsTargetLabels(grammar21, intArray32);
        java.lang.String[] strArray35 = python3Target1.getTokenTypesAsTargetLabels(grammar11, intArray32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = python3Target1.getElementListName("__tset\"4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\nContext" + "'", str15, "\\nContext");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "d" + "'", str19, "d");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "4.5.2.1" + "'", str28, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[]");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray35);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        int int4 = python3Target1.getInlineTestSetWordSize();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        java.lang.String str6 = python3Target1.getLanguage();
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genListenerFile(grammar8, sT9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "\"\"", locale3);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator5);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target6.getCodeGenerator();
        boolean boolean8 = python3Target6.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\"\\\\nContext\"", false);
        java.util.Locale locale14 = null;
        java.lang.String str15 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator9, "\"tset4.5.2.\"", locale14);
        java.util.Locale locale18 = null;
        java.lang.String str19 = pythonStringRenderer0.toString((java.lang.Object) "\\n", "_tset_tset4.5.2.1", locale18);
        java.util.Locale locale22 = null;
        java.lang.String str23 = pythonStringRenderer0.toString((java.lang.Object) "_\\1", "hi!", locale22);
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target25 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator24);
        org.antlr.v4.tool.Grammar grammar26 = null;
        org.stringtemplate.v4.ST sT27 = null;
        python3Target25.genRecognizerHeaderFile(grammar26, sT27, "hi!");
        int int30 = python3Target25.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup31 = python3Target25.templates;
        java.util.Locale locale33 = null;
        java.lang.String str34 = pythonStringRenderer0.toString((java.lang.Object) sTGroup31, "_tset_tset_tset4.5.2.1", locale33);
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target36 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator35);
        java.lang.String str38 = python3Target36.getAltLabelContextStructName("\\n");
        java.lang.String str40 = python3Target36.getAltLabelContextStructName("\\n");
        org.antlr.v4.codegen.CodeGenerator codeGenerator41 = python3Target36.getCodeGenerator();
        java.util.Locale locale43 = null;
        java.lang.String str44 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator41, "_\"\\\\n\"", locale43);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\\\nContext" + "'", str12, "\\\\nContext");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"tset4.5.2.\"" + "'", str15, "\"tset4.5.2.\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_tset_tset4.5.2.1" + "'", str19, "_tset_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 64 + "'", int30 == 64);
        org.junit.Assert.assertNull(sTGroup31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "_tset_tset_tset4.5.2.1" + "'", str34, "_tset_tset_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\\nContext" + "'", str38, "\\nContext");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\\nContext" + "'", str40, "\\nContext");
        org.junit.Assert.assertNull(codeGenerator41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "_\"\\\\n\"" + "'", str44, "_\"\\\\n\"");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator8);
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        python3Target9.genRecognizerHeaderFile(grammar10, sT11, "hi!");
        java.lang.String str14 = python3Target9.getVersion();
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target9.loadTemplates();
        python3Target1.templates = sTGroup15;
        java.lang.String str18 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.stringtemplate.v4.ST sT20 = null;
        python3Target1.genRecognizerHeaderFile(grammar19, sT20, "_tset");
        boolean boolean23 = python3Target1.supportsOverloadedMethods();
        java.lang.String str24 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target26 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator25);
        java.lang.String str28 = python3Target26.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup29 = python3Target26.templates;
        java.lang.String[] strArray30 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target26.targetCharValueEscape = strArray30;
        python3Target1.targetCharValueEscape = strArray30;
        java.lang.String str33 = python3Target1.language;
        java.lang.String str34 = python3Target1.getLanguage();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset4.5.2.1" + "'", str18, "_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Python3" + "'", str24, "Python3");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\\nContext" + "'", str28, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Python3" + "'", str33, "Python3");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Python3" + "'", str34, "Python3");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "", false);
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target1.gen;
        java.lang.String str5 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\\n", false);
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        python3Target1.genRecognizerHeaderFile(grammar3, sT4, "");
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.loadTemplates();
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target1.templates;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertNull(sTGroup8);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "\"\"", locale3);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator5);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target6.getCodeGenerator();
        boolean boolean8 = python3Target6.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\"\\\\nContext\"", false);
        java.util.Locale locale14 = null;
        java.lang.String str15 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator9, "\"tset4.5.2.\"", locale14);
        java.util.Locale locale18 = null;
        java.lang.String str19 = pythonStringRenderer0.toString((java.lang.Object) "\\n", "_tset_tset4.5.2.1", locale18);
        java.util.Locale locale22 = null;
        java.lang.String str23 = pythonStringRenderer0.toString((java.lang.Object) "Python3", "\"\\\\nContext\"", locale22);
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target25 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator24);
        org.antlr.v4.tool.Grammar grammar26 = null;
        org.stringtemplate.v4.ST sT27 = null;
        python3Target25.genRecognizerHeaderFile(grammar26, sT27, "hi!");
        int int30 = python3Target25.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup31 = python3Target25.templates;
        java.lang.String str33 = python3Target25.getImplicitSetLabel("\"\\\"_Python3\\\"\"");
        java.util.Locale locale35 = null;
        java.lang.String str36 = pythonStringRenderer0.toString((java.lang.Object) str33, "4.5.2.1", locale35);
        org.antlr.v4.codegen.CodeGenerator codeGenerator37 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target38 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator37);
        java.lang.String str40 = python3Target38.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup41 = python3Target38.templates;
        java.lang.String str43 = python3Target38.getImplicitRuleLabel("\"tset4.5.2.\"");
        python3Target38.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator45 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target46 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator45);
        java.lang.String str48 = python3Target46.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup49 = python3Target46.templates;
        org.stringtemplate.v4.STGroup sTGroup50 = python3Target46.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator51 = python3Target46.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator52 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target53 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator52);
        java.lang.String str55 = python3Target53.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar56 = null;
        org.stringtemplate.v4.ST sT57 = null;
        python3Target53.genRecognizerHeaderFile(grammar56, sT57, "\\nContext");
        java.lang.String[] strArray64 = new java.lang.String[] { "4.5.2.1", "\\n", "", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet65 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet65, strArray64);
        python3Target53.badWords = strSet65;
        python3Target46.badWords = strSet65;
        python3Target38.badWords = strSet65;
        java.util.Set<java.lang.String> strSet70 = python3Target38.badWords;
        java.util.Locale locale72 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str73 = pythonStringRenderer0.toString((java.lang.Object) python3Target38, "_tset\"\\\\n\"Context", locale72);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python3Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\\\nContext" + "'", str12, "\\\\nContext");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"tset4.5.2.\"" + "'", str15, "\"tset4.5.2.\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_tset_tset4.5.2.1" + "'", str19, "_tset_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"\\\\nContext\"" + "'", str23, "\"\\\\nContext\"");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 64 + "'", int30 == 64);
        org.junit.Assert.assertNull(sTGroup31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "_tset\"\\\"_Python3\\\"\"" + "'", str33, "_tset\"\\\"_Python3\\\"\"");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "4.5.2.1" + "'", str36, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\\nContext" + "'", str40, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "_\"tset4.5.2.\"" + "'", str43, "_\"tset4.5.2.\"");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\\n" + "'", str48, "\\n");
        org.junit.Assert.assertNull(sTGroup49);
        org.junit.Assert.assertNull(sTGroup50);
        org.junit.Assert.assertNull(codeGenerator51);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\\n" + "'", str55, "\\n");
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(strSet70);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        java.lang.String[] strArray12 = new java.lang.String[] { "4.5.2.1", "\\n", "", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        python3Target1.badWords = strSet13;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = python3Target1.gen;
        org.stringtemplate.v4.STGroup sTGroup17 = python3Target1.getTemplates();
        java.lang.String str19 = python3Target1.getTargetStringLiteralFromString("");
        org.antlr.v4.tool.Grammar grammar20 = null;
        org.stringtemplate.v4.ST sT21 = null;
        python3Target1.genRecognizerHeaderFile(grammar20, sT21, "");
        org.antlr.v4.tool.Grammar grammar24 = null;
        org.stringtemplate.v4.ST sT25 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genFile(grammar24, sT25, "Python3Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(codeGenerator16);
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\"" + "'", str19, "\"\"");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("\"tset4.5.2.\"");
        python3Target1.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator8);
        java.lang.String str11 = python3Target9.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target9.templates;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target9.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = python3Target9.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target16 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator15);
        java.lang.String str18 = python3Target16.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.stringtemplate.v4.ST sT20 = null;
        python3Target16.genRecognizerHeaderFile(grammar19, sT20, "\\nContext");
        java.lang.String[] strArray27 = new java.lang.String[] { "4.5.2.1", "\\n", "", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        python3Target16.badWords = strSet28;
        python3Target9.badWords = strSet28;
        python3Target1.badWords = strSet28;
        org.stringtemplate.v4.STGroup sTGroup33 = python3Target1.loadTemplates();
        org.antlr.v4.tool.Grammar grammar34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = python3Target1.getTokenTypeAsTargetLabel(grammar34, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_\"tset4.5.2.\"" + "'", str6, "_\"tset4.5.2.\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\n" + "'", str11, "\\n");
        org.junit.Assert.assertNull(sTGroup12);
        org.junit.Assert.assertNull(sTGroup13);
        org.junit.Assert.assertNull(codeGenerator14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\\n" + "'", str18, "\\n");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(sTGroup33);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"tset4.5.2.\"Context");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"tset4.5.2.\"Context" + "'", str1, "\"tset4.5.2.\"Context");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\\n");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator7);
        java.lang.String str10 = python3Target8.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target8.templates;
        java.lang.String[] strArray12 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target8.targetCharValueEscape = strArray12;
        java.lang.String str15 = python3Target8.getImplicitSetLabel("");
        java.lang.String[] strArray25 = new java.lang.String[] { "\"\\\\n\"", "\\nContext", "4.5.2.1", "\"\"", "_tset", "\\nContext", "\\nContext", "\\nContext", "\\nContext" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        python3Target8.badWords = strSet26;
        python3Target1.badWords = strSet26;
        int int30 = python3Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup31 = python3Target1.loadTemplates();
        python3Target1.language = "\"_tset\\n\"";
        org.antlr.v4.codegen.model.RuleFunction ruleFunction34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = python3Target1.getRuleFunctionContextStructName(ruleFunction34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\\n\"" + "'", str6, "\"\\\\n\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\nContext" + "'", str10, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset" + "'", str15, "_tset");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 64 + "'", int30 == 64);
        org.junit.Assert.assertNotNull(sTGroup31);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str5 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getLanguage();
        boolean boolean7 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        python3Target1.genRecognizerHeaderFile(grammar8, sT9, "");
        python3Target1.language = "_tset_tset4.5.2.1";
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("Python3");
        boolean boolean16 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"Python3\"" + "'", str15, "\"Python3\"");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"4.5.2.1\"", false);
        java.lang.String str18 = python3Target1.getVersion();
        java.util.Set<java.lang.String> strSet19 = python3Target1.badWords;
        java.lang.String str20 = python3Target1.getVersion();
        int int21 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str24 = python3Target1.getTargetStringLiteralFromString("", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = python3Target1.getCodeGenerator();
        java.lang.String str27 = python3Target1.getTargetStringLiteralFromString("_tset\"tset4.5.2.\"");
        org.stringtemplate.v4.STGroup sTGroup28 = python3Target1.loadTemplates();
        boolean boolean29 = python3Target1.supportsOverloadedMethods();
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4.5.2.1" + "'", str20, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 29 + "'", int21 == 29);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"\"" + "'", str24, "\"\"");
        org.junit.Assert.assertNull(codeGenerator25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"_tset\\\"tset4.5.2.\\\"\"" + "'", str27, "\"_tset\\\"tset4.5.2.\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        java.lang.String str8 = python3Target1.getImplicitSetLabel("_tset4.5.2.1");
        java.lang.String str10 = python3Target1.encodeIntAsCharEscape((int) (byte) 1);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator11);
        java.lang.String str14 = python3Target12.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target12.templates;
        java.lang.String str17 = python3Target12.getImplicitRuleLabel("\"tset4.5.2.\"");
        python3Target12.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator19 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target20 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator19);
        java.lang.String str22 = python3Target20.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup23 = python3Target20.templates;
        org.stringtemplate.v4.STGroup sTGroup24 = python3Target20.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = python3Target20.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target27 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator26);
        java.lang.String str29 = python3Target27.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar30 = null;
        org.stringtemplate.v4.ST sT31 = null;
        python3Target27.genRecognizerHeaderFile(grammar30, sT31, "\\nContext");
        java.lang.String[] strArray38 = new java.lang.String[] { "4.5.2.1", "\\n", "", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        python3Target27.badWords = strSet39;
        python3Target20.badWords = strSet39;
        python3Target12.badWords = strSet39;
        java.util.Set<java.lang.String> strSet44 = python3Target12.badWords;
        org.antlr.v4.codegen.CodeGenerator codeGenerator45 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target46 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator45);
        org.antlr.v4.tool.Grammar grammar47 = null;
        org.stringtemplate.v4.ST sT48 = null;
        python3Target46.genRecognizerHeaderFile(grammar47, sT48, "hi!");
        java.lang.String str51 = python3Target46.getVersion();
        org.stringtemplate.v4.STGroup sTGroup52 = python3Target46.loadTemplates();
        java.util.Set<java.lang.String> strSet53 = python3Target46.badWords;
        org.antlr.v4.tool.Grammar grammar54 = null;
        int[] intArray55 = new int[] {};
        java.lang.String[] strArray56 = python3Target46.getTokenTypesAsTargetLabels(grammar54, intArray55);
        python3Target12.targetCharValueEscape = strArray56;
        python3Target1.targetCharValueEscape = strArray56;
        org.antlr.v4.tool.Grammar grammar59 = null;
        org.stringtemplate.v4.ST sT60 = null;
        python3Target1.genRecognizerHeaderFile(grammar59, sT60, "_tset\\nContext");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset_tset4.5.2.1" + "'", str8, "_tset_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\1" + "'", str10, "\\1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\nContext" + "'", str14, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_\"tset4.5.2.\"" + "'", str17, "_\"tset4.5.2.\"");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\\n" + "'", str22, "\\n");
        org.junit.Assert.assertNull(sTGroup23);
        org.junit.Assert.assertNull(sTGroup24);
        org.junit.Assert.assertNull(codeGenerator25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\\n" + "'", str29, "\\n");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "4.5.2.1" + "'", str51, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup52);
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[]");
        org.junit.Assert.assertNotNull(strArray56);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"4.5.2.1\"", false);
        java.lang.String str18 = python3Target1.getVersion();
        java.util.Set<java.lang.String> strSet19 = python3Target1.badWords;
        java.lang.String str20 = python3Target1.getVersion();
        int int21 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str24 = python3Target1.getTargetStringLiteralFromString("", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = python3Target1.getCodeGenerator();
        java.lang.String str27 = python3Target1.getTargetStringLiteralFromString("_tset\"tset4.5.2.\"");
        org.stringtemplate.v4.STGroup sTGroup28 = python3Target1.loadTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST29 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4.5.2.1" + "'", str20, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 29 + "'", int21 == 29);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"\"" + "'", str24, "\"\"");
        org.junit.Assert.assertNull(codeGenerator25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\"_tset\\\"tset4.5.2.\\\"\"" + "'", str27, "\"_tset\\\"tset4.5.2.\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup28);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\\n");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator7);
        java.lang.String str10 = python3Target8.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target8.templates;
        java.lang.String[] strArray12 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target8.targetCharValueEscape = strArray12;
        java.lang.String str15 = python3Target8.getImplicitSetLabel("");
        java.lang.String[] strArray25 = new java.lang.String[] { "\"\\\\n\"", "\\nContext", "4.5.2.1", "\"\"", "_tset", "\\nContext", "\\nContext", "\\nContext", "\\nContext" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        python3Target8.badWords = strSet26;
        python3Target1.badWords = strSet26;
        int int30 = python3Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup31 = python3Target1.loadTemplates();
        python3Target1.language = "\"_tset\\n\"";
        org.antlr.v4.tool.ast.GrammarAST grammarAST34 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = python3Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\\n\"" + "'", str6, "\"\\\\n\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\nContext" + "'", str10, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset" + "'", str15, "_tset");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 64 + "'", int30 == 64);
        org.junit.Assert.assertNotNull(sTGroup31);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator8);
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        python3Target9.genRecognizerHeaderFile(grammar10, sT11, "hi!");
        java.lang.String str14 = python3Target9.getVersion();
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target9.loadTemplates();
        python3Target1.templates = sTGroup15;
        java.lang.String str18 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.stringtemplate.v4.ST sT20 = null;
        python3Target1.genRecognizerHeaderFile(grammar19, sT20, "_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = python3Target1.gen;
        boolean boolean24 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target26 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator25);
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = python3Target26.getCodeGenerator();
        boolean boolean28 = python3Target26.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator29 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target30 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator29);
        org.antlr.v4.tool.Grammar grammar31 = null;
        org.stringtemplate.v4.ST sT32 = null;
        python3Target30.genRecognizerHeaderFile(grammar31, sT32, "hi!");
        java.lang.String str35 = python3Target30.getVersion();
        org.stringtemplate.v4.STGroup sTGroup36 = python3Target30.loadTemplates();
        python3Target26.templates = sTGroup36;
        org.stringtemplate.v4.STGroup sTGroup38 = python3Target26.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator39 = null;
        java.lang.String str42 = python3Target26.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator39, "\"4.5.2.1\"", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator43 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target44 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator43);
        java.lang.String str46 = python3Target44.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup47 = python3Target44.templates;
        java.lang.String str49 = python3Target44.getTargetStringLiteralFromString("\\n");
        org.antlr.v4.codegen.CodeGenerator codeGenerator50 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target51 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator50);
        java.lang.String str53 = python3Target51.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup54 = python3Target51.templates;
        java.lang.String[] strArray55 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target51.targetCharValueEscape = strArray55;
        java.lang.String str58 = python3Target51.getImplicitSetLabel("");
        java.lang.String[] strArray68 = new java.lang.String[] { "\"\\\\n\"", "\\nContext", "4.5.2.1", "\"\"", "_tset", "\\nContext", "\\nContext", "\\nContext", "\\nContext" };
        java.util.LinkedHashSet<java.lang.String> strSet69 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet69, strArray68);
        python3Target51.badWords = strSet69;
        python3Target44.badWords = strSet69;
        int int73 = python3Target44.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup74 = python3Target44.loadTemplates();
        python3Target26.templates = sTGroup74;
        python3Target1.templates = sTGroup74;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset4.5.2.1" + "'", str18, "_tset4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(codeGenerator27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "4.5.2.1" + "'", str35, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup36);
        org.junit.Assert.assertNotNull(sTGroup38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "4.5.2.1" + "'", str42, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\\nContext" + "'", str46, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\"\\\\n\"" + "'", str49, "\"\\\\n\"");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "\\nContext" + "'", str53, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup54);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "_tset" + "'", str58, "_tset");
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 64 + "'", int73 == 64);
        org.junit.Assert.assertNotNull(sTGroup74);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "\"\"", locale3);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator5);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target6.getCodeGenerator();
        boolean boolean8 = python3Target6.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\"\\\\nContext\"", false);
        java.util.Locale locale14 = null;
        java.lang.String str15 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator9, "\"tset4.5.2.\"", locale14);
        org.antlr.v4.codegen.target.Python3Target python3Target16 = new org.antlr.v4.codegen.target.Python3Target();
        java.lang.String str17 = python3Target16.getVersion();
        java.util.Locale locale19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = pythonStringRenderer0.toString((java.lang.Object) python3Target16, "\"tset4.5.2.\"Context", locale19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python3Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\\\nContext" + "'", str12, "\\\\nContext");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"tset4.5.2.\"" + "'", str15, "\"tset4.5.2.\"");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String[] strArray5 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target1.targetCharValueEscape = strArray5;
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getLoopCounter(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator8);
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        python3Target9.genRecognizerHeaderFile(grammar10, sT11, "hi!");
        java.lang.String str14 = python3Target9.getVersion();
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target9.loadTemplates();
        python3Target1.templates = sTGroup15;
        java.lang.String str18 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.stringtemplate.v4.ST sT20 = null;
        python3Target1.genRecognizerHeaderFile(grammar19, sT20, "_tset");
        java.lang.String str24 = python3Target1.getAltLabelContextStructName("_tset\\n");
        java.lang.String str25 = python3Target1.getVersion();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset4.5.2.1" + "'", str18, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "_tset\\nContext" + "'", str24, "_tset\\nContext");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4.5.2.1" + "'", str25, "4.5.2.1");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        python3Target1.language = "\"\"";
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "", false);
        java.util.Set<java.lang.String> strSet12 = python3Target1.badWords;
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getLoopLabel(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "\"\"", locale3);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator5);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target6.getCodeGenerator();
        boolean boolean8 = python3Target6.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\"\\\\nContext\"", false);
        java.util.Locale locale14 = null;
        java.lang.String str15 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator9, "\"tset4.5.2.\"", locale14);
        java.util.Locale locale18 = null;
        java.lang.String str19 = pythonStringRenderer0.toString((java.lang.Object) "\\n", "_tset_tset4.5.2.1", locale18);
        java.util.Locale locale22 = null;
        java.lang.String str23 = pythonStringRenderer0.toString((java.lang.Object) "Python3", "\"\\\\nContext\"", locale22);
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target25 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator24);
        java.lang.String str27 = python3Target25.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup28 = python3Target25.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator29 = python3Target25.getCodeGenerator();
        java.lang.String str31 = python3Target25.getListLabel("hi!");
        java.lang.String str33 = python3Target25.getTargetStringLiteralFromString("\\nContext");
        java.util.Set<java.lang.String> strSet34 = python3Target25.badWords;
        java.util.Locale locale36 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = pythonStringRenderer0.toString((java.lang.Object) python3Target25, "_tset4.5.2.1", locale36);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python3Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\\\nContext" + "'", str12, "\\\\nContext");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"tset4.5.2.\"" + "'", str15, "\"tset4.5.2.\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_tset_tset4.5.2.1" + "'", str19, "_tset_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\"\\\\nContext\"" + "'", str23, "\"\\\\nContext\"");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\\n" + "'", str27, "\\n");
        org.junit.Assert.assertNull(sTGroup28);
        org.junit.Assert.assertNull(codeGenerator29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\"\\\\nContext\"" + "'", str33, "\"\\\\nContext\"");
        org.junit.Assert.assertNotNull(strSet34);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.stringtemplate.v4.ST sT6 = null;
        python3Target1.genRecognizerHeaderFile(grammar5, sT6, "\\n");
        python3Target1.addBadWords();
        java.lang.String[] strArray10 = python3Target1.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator11, "\\35Context", false);
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromString("\"hi!\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "35Contex" + "'", str14, "35Contex");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\\"hi!\\\"\"" + "'", str16, "\"\\\"hi!\\\"\"");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\\n");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator7);
        java.lang.String str10 = python3Target8.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target8.templates;
        java.lang.String[] strArray12 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target8.targetCharValueEscape = strArray12;
        java.lang.String str15 = python3Target8.getImplicitSetLabel("");
        java.lang.String[] strArray25 = new java.lang.String[] { "\"\\\\n\"", "\\nContext", "4.5.2.1", "\"\"", "_tset", "\\nContext", "\\nContext", "\\nContext", "\\nContext" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        python3Target8.badWords = strSet26;
        python3Target1.badWords = strSet26;
        org.antlr.v4.codegen.CodeGenerator codeGenerator30 = python3Target1.gen;
        java.lang.String[] strArray31 = python3Target1.targetCharValueEscape;
        int int32 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\\n\"" + "'", str6, "\"\\\\n\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\nContext" + "'", str10, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset" + "'", str15, "_tset");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(codeGenerator30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 64 + "'", int32 == 64);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str5 = python3Target1.getVersion();
        boolean boolean6 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("\"tset4.5.2.\"");
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("Python3");
        java.lang.String[] strArray9 = python3Target1.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator10);
        java.lang.String str13 = python3Target11.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup14 = python3Target11.templates;
        python3Target1.templates = sTGroup14;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.getElementName("_Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_\"tset4.5.2.\"" + "'", str6, "_\"tset4.5.2.\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python3Context" + "'", str8, "Python3Context");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\nContext" + "'", str13, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup14);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String[] strArray5 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target1.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target1.getImplicitSetLabel("");
        java.lang.String[] strArray18 = new java.lang.String[] { "\"\\\\n\"", "\\nContext", "4.5.2.1", "\"\"", "_tset", "\\nContext", "\\nContext", "\\nContext", "\\nContext" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python3Target1.badWords = strSet19;
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target24 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator23);
        org.antlr.v4.tool.Grammar grammar25 = null;
        org.stringtemplate.v4.ST sT26 = null;
        python3Target24.genRecognizerHeaderFile(grammar25, sT26, "hi!");
        java.lang.String str29 = python3Target24.getVersion();
        org.stringtemplate.v4.STGroup sTGroup30 = python3Target24.loadTemplates();
        java.util.Set<java.lang.String> strSet31 = python3Target24.badWords;
        python3Target24.language = "\"\\\"4.5.2.1\\\"\"";
        org.antlr.v4.tool.Grammar grammar34 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target36 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator35);
        java.lang.String str38 = python3Target36.getAltLabelContextStructName("\\n");
        int int39 = python3Target36.getInlineTestSetWordSize();
        boolean boolean40 = python3Target36.wantsBaseVisitor();
        java.lang.String str42 = python3Target36.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String[] strArray43 = python3Target36.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar44 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator45 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target46 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator45);
        org.antlr.v4.tool.Grammar grammar47 = null;
        org.stringtemplate.v4.ST sT48 = null;
        python3Target46.genRecognizerHeaderFile(grammar47, sT48, "hi!");
        java.lang.String str51 = python3Target46.getVersion();
        org.stringtemplate.v4.STGroup sTGroup52 = python3Target46.loadTemplates();
        java.util.Set<java.lang.String> strSet53 = python3Target46.badWords;
        org.antlr.v4.tool.Grammar grammar54 = null;
        int[] intArray55 = new int[] {};
        java.lang.String[] strArray56 = python3Target46.getTokenTypesAsTargetLabels(grammar54, intArray55);
        java.lang.String[] strArray57 = python3Target36.getTokenTypesAsTargetLabels(grammar44, intArray55);
        java.lang.String[] strArray58 = python3Target24.getTokenTypesAsTargetLabels(grammar34, intArray55);
        java.lang.String[] strArray59 = python3Target1.getTokenTypesAsTargetLabels(grammar22, intArray55);
        java.lang.String[] strArray60 = python3Target1.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar61 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str63 = python3Target1.getTokenTypeAsTargetLabel(grammar61, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "4.5.2.1" + "'", str29, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup30);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\\nContext" + "'", str38, "\\nContext");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 64 + "'", int39 == 64);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "d" + "'", str42, "d");
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "4.5.2.1" + "'", str51, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup52);
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[]");
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertNotNull(strArray60);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str5 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getLoopCounter(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\\nContext");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\nContext" + "'", str1, "\\nContext");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator8);
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        python3Target9.genRecognizerHeaderFile(grammar10, sT11, "hi!");
        java.lang.String str14 = python3Target9.getVersion();
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target9.loadTemplates();
        python3Target1.templates = sTGroup15;
        java.lang.String str18 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.tool.ast.GrammarAST grammarAST19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset4.5.2.1" + "'", str18, "_tset4.5.2.1");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getListLabel("hi!");
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("\\nContext");
        int int10 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genFile(grammar11, sT12, "\"tset\\\"\\\\n\\\"Contex\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\\nContext\"" + "'", str9, "\"\\\\nContext\"");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        java.lang.String str8 = python3Target1.getImplicitSetLabel("_tset4.5.2.1");
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.stringtemplate.v4.ST sT10 = null;
        python3Target1.genRecognizerHeaderFile(grammar9, sT10, "\"\\\"tset4.5.2.\\\"Context\"Context");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset_tset4.5.2.1" + "'", str8, "_tset_tset4.5.2.1");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        org.antlr.v4.codegen.CodeGenerator codeGenerator1 = null;
        java.lang.String str4 = python3Target0.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator1, "\"_tset\\n\"", false);
        java.lang.String str6 = python3Target0.encodeIntAsCharEscape((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_tset\\n" + "'", str4, "_tset\\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\0" + "'", str6, "\\0");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        java.lang.String[] strArray12 = new java.lang.String[] { "4.5.2.1", "\\n", "", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        python3Target1.badWords = strSet13;
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.stringtemplate.v4.ST sT17 = null;
        python3Target1.genRecognizerHeaderFile(grammar16, sT17, "");
        java.lang.String str21 = python3Target1.getTargetStringLiteralFromString("Python3");
        java.lang.String str22 = python3Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = python3Target1.getImplicitTokenLabel("_Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\"Python3\"" + "'", str21, "\"Python3\"");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Python3" + "'", str22, "Python3");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator7);
        java.lang.String str10 = python3Target8.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python3Target8.genRecognizerHeaderFile(grammar11, sT12, "\\nContext");
        java.lang.String[] strArray19 = new java.lang.String[] { "4.5.2.1", "\\n", "", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        python3Target8.badWords = strSet20;
        python3Target1.badWords = strSet20;
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target25 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator24);
        java.lang.String str27 = python3Target25.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup28 = python3Target25.templates;
        java.lang.String str30 = python3Target25.getImplicitSetLabel("_tset_tset4.5.2.1");
        org.stringtemplate.v4.STGroup sTGroup31 = python3Target25.loadTemplates();
        python3Target1.templates = sTGroup31;
        org.antlr.v4.tool.Grammar grammar33 = null;
        org.stringtemplate.v4.ST sT34 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genListenerFile(grammar33, sT34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertNull(sTGroup5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\n" + "'", str10, "\\n");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\\n" + "'", str27, "\\n");
        org.junit.Assert.assertNull(sTGroup28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "_tset_tset_tset4.5.2.1" + "'", str30, "_tset_tset_tset4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup31);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = python3Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "\"\"", locale3);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator5);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target6.getCodeGenerator();
        boolean boolean8 = python3Target6.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\"\\\\nContext\"", false);
        java.util.Locale locale14 = null;
        java.lang.String str15 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator9, "\"tset4.5.2.\"", locale14);
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target17 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator16);
        java.lang.String str19 = python3Target17.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup20 = python3Target17.templates;
        java.lang.String[] strArray21 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target17.targetCharValueEscape = strArray21;
        java.lang.String str24 = python3Target17.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = python3Target17.gen;
        java.util.Locale locale27 = null;
        java.lang.String str28 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator25, "\"_\\\"\\\\\\\\nContext\\\"\"", locale27);
        org.antlr.v4.codegen.CodeGenerator codeGenerator29 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target30 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator29);
        java.lang.String str32 = python3Target30.getAltLabelContextStructName("\\n");
        int int33 = python3Target30.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator34 = python3Target30.getCodeGenerator();
        java.lang.String[] strArray35 = python3Target30.targetCharValueEscape;
        python3Target30.language = "_tset_tset4.5.2.1";
        java.util.Locale locale39 = null;
        java.lang.String str40 = pythonStringRenderer0.toString((java.lang.Object) "_tset_tset4.5.2.1", "_tset\"tset4.5.2.\"", locale39);
        java.util.Locale locale43 = null;
        java.lang.String str44 = pythonStringRenderer0.toString((java.lang.Object) "_tset_tset4.5.2.1", "\\\\nContext", locale43);
        java.lang.Class<?> wildcardClass45 = pythonStringRenderer0.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\\\nContext" + "'", str12, "\\\\nContext");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"tset4.5.2.\"" + "'", str15, "\"tset4.5.2.\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\\nContext" + "'", str19, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "_tset" + "'", str24, "_tset");
        org.junit.Assert.assertNull(codeGenerator25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"_\\\"\\\\\\\\nContext\\\"\"" + "'", str28, "\"_\\\"\\\\\\\\nContext\\\"\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\\nContext" + "'", str32, "\\nContext");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 64 + "'", int33 == 64);
        org.junit.Assert.assertNull(codeGenerator34);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "_tset\"tset4.5.2.\"" + "'", str40, "_tset\"tset4.5.2.\"");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "\\\\nContext" + "'", str44, "\\\\nContext");
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("\"tset4.5.2.\"");
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("Python3");
        java.lang.String[] strArray9 = python3Target1.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator10);
        java.lang.String str13 = python3Target11.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup14 = python3Target11.templates;
        python3Target1.templates = sTGroup14;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.getImplicitTokenLabel("\\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_\"tset4.5.2.\"" + "'", str6, "_\"tset4.5.2.\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python3Context" + "'", str8, "Python3Context");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\nContext" + "'", str13, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup14);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.antlr.v4.codegen.target.Python3Target python3Target0 = new org.antlr.v4.codegen.target.Python3Target();
        java.util.Set<java.lang.String> strSet1 = python3Target0.badWords;
        java.lang.String str3 = python3Target0.encodeIntAsCharEscape(1);
        org.antlr.v4.codegen.model.RuleFunction ruleFunction4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python3Target0.getRuleFunctionContextStructName(ruleFunction4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\1" + "'", str3, "\\1");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str5 = python3Target1.getVersion();
        python3Target1.language = "\"\\\\nContext\"";
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "_tset4.5.2.1", false);
        boolean boolean8 = python3Target1.supportsOverloadedMethods();
        python3Target1.addBadWords();
        java.lang.String str11 = python3Target1.encodeIntAsCharEscape((int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "tset4.5.2." + "'", str7, "tset4.5.2.");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\64" + "'", str11, "\\64");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.loadTemplates();
        java.util.Set<java.lang.String> strSet8 = python3Target1.badWords;
        python3Target1.language = "\"\\\"4.5.2.1\\\"\"";
        int int11 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.stringtemplate.v4.ST sT13 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genListenerFile(grammar12, sT13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29 + "'", int11 == 29);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getListLabel("hi!");
        int int8 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String[] strArray9 = python3Target1.targetCharValueEscape;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 29 + "'", int8 == 29);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        java.lang.String str9 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.loadTemplates();
        boolean boolean11 = python3Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getElementListName("\"_tset_tset4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset4.5.2.1" + "'", str9, "_tset4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.stringtemplate.v4.ST sT6 = null;
        python3Target1.genRecognizerHeaderFile(grammar5, sT6, "\\n");
        java.lang.String str9 = python3Target1.getVersion();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("_tset");
        java.lang.String str12 = python3Target1.getLanguage();
        boolean boolean13 = python3Target1.wantsBaseVisitor();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tsetContext" + "'", str11, "_tsetContext");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Python3" + "'", str12, "Python3");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"\\\\1\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\\1\"" + "'", str1, "\"\\\\1\"");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\"\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getLoopLabel(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"\"" + "'", str9, "_\"\"");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator8);
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        python3Target9.genRecognizerHeaderFile(grammar10, sT11, "hi!");
        java.lang.String str14 = python3Target9.getVersion();
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target9.loadTemplates();
        python3Target1.templates = sTGroup15;
        java.lang.String str18 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.stringtemplate.v4.ST sT20 = null;
        python3Target1.genRecognizerHeaderFile(grammar19, sT20, "_tset");
        boolean boolean23 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = python3Target1.getTokenTypeAsTargetLabel(grammar24, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset4.5.2.1" + "'", str18, "_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.gen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getElementListName("_tset_tset4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNull(codeGenerator8);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("_tset\\nContext");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_tset\\nContext" + "'", str1, "_tset\\nContext");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        python3Target1.language = "\"\"";
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target1.gen;
        int int13 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target15 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator14);
        java.lang.String str17 = python3Target15.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup18 = python3Target15.templates;
        java.lang.String str20 = python3Target15.getTargetStringLiteralFromString("\\n");
        java.lang.String str22 = python3Target15.getTargetStringLiteralFromString("_\"\\\\nContext\"");
        java.lang.String str24 = python3Target15.getTargetStringLiteralFromString("_tset_tset_tset4.5.2.1");
        java.util.Set<java.lang.String> strSet25 = python3Target15.badWords;
        python3Target1.badWords = strSet25;
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = python3Target1.gen;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = python3Target1.getAltLabelContextStructName("\"_tset\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 64 + "'", int13 == 64);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\\nContext" + "'", str17, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\"\\\\n\"" + "'", str20, "\"\\\\n\"");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\"_\\\"\\\\\\\\nContext\\\"\"" + "'", str22, "\"_\\\"\\\\\\\\nContext\\\"\"");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "\"_tset_tset_tset4.5.2.1\"" + "'", str24, "\"_tset_tset_tset4.5.2.1\"");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNull(codeGenerator27);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator8);
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        python3Target9.genRecognizerHeaderFile(grammar10, sT11, "hi!");
        java.lang.String str14 = python3Target9.getVersion();
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target9.loadTemplates();
        python3Target1.templates = sTGroup15;
        java.lang.String str18 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.stringtemplate.v4.ST sT20 = null;
        python3Target1.genRecognizerHeaderFile(grammar19, sT20, "_tset");
        boolean boolean23 = python3Target1.supportsOverloadedMethods();
        java.lang.String str24 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target26 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator25);
        java.lang.String str28 = python3Target26.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup29 = python3Target26.templates;
        java.lang.String[] strArray30 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target26.targetCharValueEscape = strArray30;
        python3Target1.targetCharValueEscape = strArray30;
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target34 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator33);
        org.antlr.v4.tool.Grammar grammar35 = null;
        org.stringtemplate.v4.ST sT36 = null;
        python3Target34.genRecognizerHeaderFile(grammar35, sT36, "hi!");
        java.lang.String str39 = python3Target34.getVersion();
        org.stringtemplate.v4.STGroup sTGroup40 = python3Target34.loadTemplates();
        java.util.Set<java.lang.String> strSet41 = python3Target34.badWords;
        python3Target34.language = "\"\\\"4.5.2.1\\\"\"";
        org.antlr.v4.tool.Grammar grammar44 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator45 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target46 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator45);
        java.lang.String str48 = python3Target46.getAltLabelContextStructName("\\n");
        int int49 = python3Target46.getInlineTestSetWordSize();
        boolean boolean50 = python3Target46.wantsBaseVisitor();
        java.lang.String str52 = python3Target46.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String[] strArray53 = python3Target46.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar54 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator55 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target56 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator55);
        org.antlr.v4.tool.Grammar grammar57 = null;
        org.stringtemplate.v4.ST sT58 = null;
        python3Target56.genRecognizerHeaderFile(grammar57, sT58, "hi!");
        java.lang.String str61 = python3Target56.getVersion();
        org.stringtemplate.v4.STGroup sTGroup62 = python3Target56.loadTemplates();
        java.util.Set<java.lang.String> strSet63 = python3Target56.badWords;
        org.antlr.v4.tool.Grammar grammar64 = null;
        int[] intArray65 = new int[] {};
        java.lang.String[] strArray66 = python3Target56.getTokenTypesAsTargetLabels(grammar64, intArray65);
        java.lang.String[] strArray67 = python3Target46.getTokenTypesAsTargetLabels(grammar54, intArray65);
        java.lang.String[] strArray68 = python3Target34.getTokenTypesAsTargetLabels(grammar44, intArray65);
        python3Target1.targetCharValueEscape = strArray68;
        org.antlr.v4.tool.Grammar grammar70 = null;
        org.stringtemplate.v4.ST sT71 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genListenerFile(grammar70, sT71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset4.5.2.1" + "'", str18, "_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Python3" + "'", str24, "Python3");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\\nContext" + "'", str28, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup29);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "4.5.2.1" + "'", str39, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup40);
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\\nContext" + "'", str48, "\\nContext");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 64 + "'", int49 == 64);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "d" + "'", str52, "d");
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "4.5.2.1" + "'", str61, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup62);
        org.junit.Assert.assertNotNull(strSet63);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[]");
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(strArray68);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        java.lang.String[] strArray12 = new java.lang.String[] { "4.5.2.1", "\\n", "", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        python3Target1.badWords = strSet13;
        java.lang.String str17 = python3Target1.getListLabel("hi!");
        java.util.Set<java.lang.String> strSet18 = python3Target1.badWords;
        java.lang.String str20 = python3Target1.getImplicitRuleLabel("Python3");
        java.lang.String str22 = python3Target1.getImplicitRuleLabel("_");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = python3Target1.getImplicitTokenLabel("\"\\\"tset4.5.2.\\\"Context\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "_Python3" + "'", str20, "_Python3");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "__" + "'", str22, "__");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getListLabel("hi!");
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("\\nContext");
        int int10 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str12 = python3Target1.getImplicitRuleLabel("_tset_tset4.5.2.1");
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.loadTemplates();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getImplicitTokenLabel("\"\\\\1\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\\nContext\"" + "'", str9, "\"\\\\nContext\"");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "__tset_tset4.5.2.1" + "'", str12, "__tset_tset4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup13);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "\"\\\\nContext\"", false);
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target1.getTemplates();
        boolean boolean9 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.loadTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = python3Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\\\nContext" + "'", str7, "\\\\nContext");
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(sTGroup10);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        java.lang.String str7 = python3Target1.language;
        java.lang.String str8 = python3Target1.language;
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getLoopLabel(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python3" + "'", str8, "Python3");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator8);
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        python3Target9.genRecognizerHeaderFile(grammar10, sT11, "hi!");
        java.lang.String str14 = python3Target9.getVersion();
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target9.loadTemplates();
        python3Target1.templates = sTGroup15;
        java.lang.String[] strArray17 = python3Target1.targetCharValueEscape;
        java.lang.String str18 = python3Target1.language;
        int int19 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar20 = null;
        org.stringtemplate.v4.ST sT21 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genFile(grammar20, sT21, "\"\\\"_tset\\\\n\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Python3" + "'", str18, "Python3");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 64 + "'", int19 == 64);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "\"\"", locale3);
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator5);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target6.getCodeGenerator();
        boolean boolean8 = python3Target6.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        java.lang.String str12 = python3Target6.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator9, "\"\\\\nContext\"", false);
        java.util.Locale locale14 = null;
        java.lang.String str15 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator9, "\"tset4.5.2.\"", locale14);
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target17 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator16);
        java.lang.String str19 = python3Target17.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup20 = python3Target17.templates;
        java.lang.String[] strArray21 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target17.targetCharValueEscape = strArray21;
        java.lang.String str24 = python3Target17.getImplicitSetLabel("");
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = python3Target17.gen;
        java.util.Locale locale27 = null;
        java.lang.String str28 = pythonStringRenderer0.toString((java.lang.Object) codeGenerator25, "\"_\\\"\\\\\\\\nContext\\\"\"", locale27);
        org.antlr.v4.codegen.CodeGenerator codeGenerator29 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target30 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator29);
        java.lang.String str32 = python3Target30.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar33 = null;
        org.stringtemplate.v4.ST sT34 = null;
        python3Target30.genRecognizerHeaderFile(grammar33, sT34, "\\nContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator37 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target38 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator37);
        org.antlr.v4.tool.Grammar grammar39 = null;
        org.stringtemplate.v4.ST sT40 = null;
        python3Target38.genRecognizerHeaderFile(grammar39, sT40, "hi!");
        java.lang.String str43 = python3Target38.getVersion();
        org.stringtemplate.v4.STGroup sTGroup44 = python3Target38.loadTemplates();
        python3Target30.templates = sTGroup44;
        java.lang.String str47 = python3Target30.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.tool.Grammar grammar48 = null;
        org.stringtemplate.v4.ST sT49 = null;
        python3Target30.genRecognizerHeaderFile(grammar48, sT49, "\"_\\\"\\\\\\\\nContext\\\"\"");
        java.util.Locale locale53 = null;
        java.lang.String str54 = pythonStringRenderer0.toString((java.lang.Object) sT49, "\"_tset_tset_tset4.5.2.1\"", locale53);
        org.antlr.v4.codegen.CodeGenerator codeGenerator55 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target56 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator55);
        org.antlr.v4.codegen.CodeGenerator codeGenerator57 = python3Target56.getCodeGenerator();
        boolean boolean58 = python3Target56.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator59 = null;
        java.lang.String str62 = python3Target56.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator59, "\"\\\\nContext\"", false);
        org.stringtemplate.v4.STGroup sTGroup63 = python3Target56.getTemplates();
        java.util.Locale locale65 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str66 = pythonStringRenderer0.toString((java.lang.Object) python3Target56, "_tset\"Python\"", locale65);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python3Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\\\nContext" + "'", str12, "\\\\nContext");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"tset4.5.2.\"" + "'", str15, "\"tset4.5.2.\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\\nContext" + "'", str19, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup20);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "_tset" + "'", str24, "_tset");
        org.junit.Assert.assertNull(codeGenerator25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\"_\\\"\\\\\\\\nContext\\\"\"" + "'", str28, "\"_\\\"\\\\\\\\nContext\\\"\"");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\\n" + "'", str32, "\\n");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "4.5.2.1" + "'", str43, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "_tset4.5.2.1" + "'", str47, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\"_tset_tset_tset4.5.2.1\"" + "'", str54, "\"_tset_tset_tset4.5.2.1\"");
        org.junit.Assert.assertNull(codeGenerator57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "\\\\nContext" + "'", str62, "\\\\nContext");
        org.junit.Assert.assertNotNull(sTGroup63);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"4.5.2.1\"", false);
        java.lang.String str18 = python3Target1.getVersion();
        java.util.Set<java.lang.String> strSet19 = python3Target1.badWords;
        java.lang.String str20 = python3Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = python3Target1.getLoopLabel(grammarAST21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Python3" + "'", str20, "Python3");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.loadTemplates();
        java.util.Set<java.lang.String> strSet8 = python3Target1.badWords;
        boolean boolean9 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator5);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target6.getCodeGenerator();
        boolean boolean8 = python3Target6.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator9);
        java.lang.String str12 = python3Target10.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target10.templates;
        java.lang.String[] strArray14 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target10.targetCharValueEscape = strArray14;
        python3Target6.targetCharValueEscape = strArray14;
        python3Target1.targetCharValueEscape = strArray14;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray14;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\nContext" + "'", str12, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        int int4 = python3Target1.getInlineTestSetWordSize();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        java.lang.String str7 = python3Target1.getListLabel("_\"\\\\nContext\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.gen;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_\"\\\\nContext\"" + "'", str7, "_\"\\\\nContext\"");
        org.junit.Assert.assertNull(codeGenerator8);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        int int4 = python3Target1.getInlineTestSetWordSize();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        java.lang.String str7 = python3Target1.getListLabel("_\"\\\\nContext\"");
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target1.loadTemplates();
        java.lang.String str9 = python3Target1.getVersion();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_\"\\\\nContext\"" + "'", str7, "_\"\\\\nContext\"");
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        int int6 = python3Target1.getSerializedATNSegmentLimit();
        int int7 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "_Context", true);
        java.lang.Class<?> wildcardClass12 = python3Target1.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 29 + "'", int6 == 29);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"Contex\"" + "'", str11, "\"Contex\"");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"_\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"_\"" + "'", str1, "\"_\"");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "", true);
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("\"_tset_tset4.5.2.1\"", true);
        python3Target1.language = "tset4.5.2.";
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"_tset_tset4.5.2.1\\\"\"" + "'", str8, "\"\\\"_tset_tset4.5.2.1\\\"\"");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator7);
        java.lang.String str10 = python3Target8.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python3Target8.genRecognizerHeaderFile(grammar11, sT12, "\\nContext");
        java.lang.String[] strArray19 = new java.lang.String[] { "4.5.2.1", "\\n", "", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        python3Target8.badWords = strSet20;
        python3Target1.badWords = strSet20;
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target25 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator24);
        java.lang.String str27 = python3Target25.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup28 = python3Target25.templates;
        java.lang.String str30 = python3Target25.getImplicitSetLabel("_tset_tset4.5.2.1");
        org.stringtemplate.v4.STGroup sTGroup31 = python3Target25.loadTemplates();
        python3Target1.templates = sTGroup31;
        org.stringtemplate.v4.STGroup sTGroup33 = python3Target1.loadTemplates();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertNull(sTGroup5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\n" + "'", str10, "\\n");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\\n" + "'", str27, "\\n");
        org.junit.Assert.assertNull(sTGroup28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "_tset_tset_tset4.5.2.1" + "'", str30, "_tset_tset_tset4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup31);
        org.junit.Assert.assertNotNull(sTGroup33);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        java.lang.String str9 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.loadTemplates();
        java.lang.String str11 = python3Target1.getVersion();
        boolean boolean12 = python3Target1.wantsBaseListener();
        java.lang.String str14 = python3Target1.encodeIntAsCharEscape((int) ' ');
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target16 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator15);
        java.lang.String str18 = python3Target16.getAltLabelContextStructName("\\n");
        java.lang.String str20 = python3Target16.getAltLabelContextStructName("\\n");
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = python3Target16.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target23 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator22);
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = python3Target23.getCodeGenerator();
        boolean boolean25 = python3Target23.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target27 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator26);
        org.antlr.v4.tool.Grammar grammar28 = null;
        org.stringtemplate.v4.ST sT29 = null;
        python3Target27.genRecognizerHeaderFile(grammar28, sT29, "hi!");
        java.lang.String str32 = python3Target27.getVersion();
        org.stringtemplate.v4.STGroup sTGroup33 = python3Target27.loadTemplates();
        python3Target23.templates = sTGroup33;
        org.stringtemplate.v4.STGroup sTGroup35 = python3Target23.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator36 = null;
        java.lang.String str39 = python3Target23.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator36, "\"4.5.2.1\"", false);
        org.stringtemplate.v4.STGroup sTGroup40 = python3Target23.getTemplates();
        python3Target16.templates = sTGroup40;
        python3Target1.templates = sTGroup40;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset4.5.2.1" + "'", str9, "_tset4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4.5.2.1" + "'", str11, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " " + "'", str14, " ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\\nContext" + "'", str18, "\\nContext");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\\nContext" + "'", str20, "\\nContext");
        org.junit.Assert.assertNull(codeGenerator21);
        org.junit.Assert.assertNull(codeGenerator24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "4.5.2.1" + "'", str32, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup33);
        org.junit.Assert.assertNotNull(sTGroup35);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "4.5.2.1" + "'", str39, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup40);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("4.5.2.1");
        java.lang.String str7 = python3Target1.encodeIntAsCharEscape(0);
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"4.5.2.1\"" + "'", str5, "\"4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\0" + "'", str7, "\\0");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getLoopLabel(grammarAST7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        boolean boolean4 = python3Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("\"tset\\\"_tset\"");
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator10);
        java.lang.String str13 = python3Target11.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup14 = python3Target11.templates;
        java.lang.String[] strArray15 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target11.targetCharValueEscape = strArray15;
        java.lang.String str18 = python3Target11.getImplicitSetLabel("");
        java.lang.String[] strArray28 = new java.lang.String[] { "\"\\\\n\"", "\\nContext", "4.5.2.1", "\"\"", "_tset", "\\nContext", "\\nContext", "\\nContext", "\\nContext" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        python3Target11.badWords = strSet29;
        org.antlr.v4.tool.Grammar grammar32 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target34 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator33);
        org.antlr.v4.tool.Grammar grammar35 = null;
        org.stringtemplate.v4.ST sT36 = null;
        python3Target34.genRecognizerHeaderFile(grammar35, sT36, "hi!");
        java.lang.String str39 = python3Target34.getVersion();
        org.stringtemplate.v4.STGroup sTGroup40 = python3Target34.loadTemplates();
        java.util.Set<java.lang.String> strSet41 = python3Target34.badWords;
        python3Target34.language = "\"\\\"4.5.2.1\\\"\"";
        org.antlr.v4.tool.Grammar grammar44 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator45 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target46 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator45);
        java.lang.String str48 = python3Target46.getAltLabelContextStructName("\\n");
        int int49 = python3Target46.getInlineTestSetWordSize();
        boolean boolean50 = python3Target46.wantsBaseVisitor();
        java.lang.String str52 = python3Target46.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String[] strArray53 = python3Target46.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar54 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator55 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target56 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator55);
        org.antlr.v4.tool.Grammar grammar57 = null;
        org.stringtemplate.v4.ST sT58 = null;
        python3Target56.genRecognizerHeaderFile(grammar57, sT58, "hi!");
        java.lang.String str61 = python3Target56.getVersion();
        org.stringtemplate.v4.STGroup sTGroup62 = python3Target56.loadTemplates();
        java.util.Set<java.lang.String> strSet63 = python3Target56.badWords;
        org.antlr.v4.tool.Grammar grammar64 = null;
        int[] intArray65 = new int[] {};
        java.lang.String[] strArray66 = python3Target56.getTokenTypesAsTargetLabels(grammar64, intArray65);
        java.lang.String[] strArray67 = python3Target46.getTokenTypesAsTargetLabels(grammar54, intArray65);
        java.lang.String[] strArray68 = python3Target34.getTokenTypesAsTargetLabels(grammar44, intArray65);
        java.lang.String[] strArray69 = python3Target11.getTokenTypesAsTargetLabels(grammar32, intArray65);
        java.lang.String[] strArray70 = python3Target1.getTokenTypesAsTargetLabels(grammar9, intArray65);
        org.antlr.v4.tool.Rule rule71 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str72 = python3Target1.getRuleFunctionContextStructName(rule71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"\\\"tset\\\\\\\"_tset\\\"\"" + "'", str8, "\"\\\"tset\\\\\\\"_tset\\\"\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\nContext" + "'", str13, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset" + "'", str18, "_tset");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "4.5.2.1" + "'", str39, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup40);
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\\nContext" + "'", str48, "\\nContext");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 64 + "'", int49 == 64);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "d" + "'", str52, "d");
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "4.5.2.1" + "'", str61, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup62);
        org.junit.Assert.assertNotNull(strSet63);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[]");
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(strArray70);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"4.5.2.1\"", false);
        org.stringtemplate.v4.STGroup sTGroup18 = python3Target1.getTemplates();
        java.lang.String str20 = python3Target1.getImplicitRuleLabel("\\1");
        java.lang.String str21 = python3Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = python3Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "_\\1" + "'", str20, "_\\1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Python3" + "'", str21, "Python3");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        java.lang.String[] strArray12 = new java.lang.String[] { "4.5.2.1", "\\n", "", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        python3Target1.badWords = strSet13;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = python3Target1.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target18 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator17);
        java.lang.String str20 = python3Target18.getAltLabelContextStructName("\\n");
        python3Target18.addBadWords();
        java.util.Set<java.lang.String> strSet22 = python3Target18.badWords;
        python3Target1.badWords = strSet22;
        java.util.Set<java.lang.String> strSet24 = python3Target1.badWords;
        boolean boolean25 = python3Target1.templatesExist();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(codeGenerator16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\\nContext" + "'", str20, "\\nContext");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator8);
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        python3Target9.genRecognizerHeaderFile(grammar10, sT11, "hi!");
        java.lang.String str14 = python3Target9.getVersion();
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target9.loadTemplates();
        python3Target1.templates = sTGroup15;
        java.lang.String str18 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.stringtemplate.v4.ST sT20 = null;
        python3Target1.genRecognizerHeaderFile(grammar19, sT20, "_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = python3Target1.gen;
        boolean boolean24 = python3Target1.supportsOverloadedMethods();
        java.lang.String str26 = python3Target1.getTargetStringLiteralFromString("\"tset\\\"_tset\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset4.5.2.1" + "'", str18, "_tset4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\"\\\"tset\\\\\\\"_tset\\\"\"" + "'", str26, "\"\\\"tset\\\\\\\"_tset\\\"\"");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.loadTemplates();
        java.util.Set<java.lang.String> strSet8 = python3Target1.badWords;
        python3Target1.language = "\"\\\"4.5.2.1\\\"\"";
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromString("_tset_tset4.5.2.1");
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_tset_tset4.5.2.1\"" + "'", str12, "\"_tset_tset4.5.2.1\"");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String[] strArray5 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target1.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target1.getImplicitSetLabel("");
        java.lang.String[] strArray18 = new java.lang.String[] { "\"\\\\n\"", "\\nContext", "4.5.2.1", "\"\"", "_tset", "\\nContext", "\\nContext", "\\nContext", "\\nContext" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python3Target1.badWords = strSet19;
        java.util.Set<java.lang.String> strSet22 = python3Target1.badWords;
        org.antlr.v4.tool.ast.GrammarAST grammarAST23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strSet22);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator8);
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        python3Target9.genRecognizerHeaderFile(grammar10, sT11, "hi!");
        java.lang.String str14 = python3Target9.getVersion();
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target9.loadTemplates();
        python3Target1.templates = sTGroup15;
        java.lang.String str18 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.stringtemplate.v4.ST sT20 = null;
        python3Target1.genRecognizerHeaderFile(grammar19, sT20, "_tset");
        org.stringtemplate.v4.STGroup sTGroup23 = python3Target1.loadTemplates();
        java.lang.String str25 = python3Target1.encodeIntAsCharEscape((int) (short) 100);
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target27 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator26);
        java.lang.String str29 = python3Target27.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup30 = python3Target27.templates;
        java.lang.String str32 = python3Target27.getTargetStringLiteralFromString("\\n");
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target34 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator33);
        java.lang.String str36 = python3Target34.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup37 = python3Target34.templates;
        java.lang.String[] strArray38 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target34.targetCharValueEscape = strArray38;
        java.lang.String str41 = python3Target34.getImplicitSetLabel("");
        java.lang.String[] strArray51 = new java.lang.String[] { "\"\\\\n\"", "\\nContext", "4.5.2.1", "\"\"", "_tset", "\\nContext", "\\nContext", "\\nContext", "\\nContext" };
        java.util.LinkedHashSet<java.lang.String> strSet52 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet52, strArray51);
        python3Target34.badWords = strSet52;
        python3Target27.badWords = strSet52;
        org.antlr.v4.codegen.CodeGenerator codeGenerator56 = python3Target27.gen;
        java.lang.String[] strArray57 = python3Target27.targetCharValueEscape;
        python3Target1.targetCharValueEscape = strArray57;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset4.5.2.1" + "'", str18, "_tset4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "d" + "'", str25, "d");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\\nContext" + "'", str29, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\\\\n\"" + "'", str32, "\"\\\\n\"");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\\nContext" + "'", str36, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "_tset" + "'", str41, "_tset");
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNull(codeGenerator56);
        org.junit.Assert.assertNotNull(strArray57);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("tset4.5.2.");
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("d", false);
        java.lang.String str11 = python3Target1.getImplicitSetLabel("\\n");
        python3Target1.language = "\"_\\\"\\\\\\\\nContext\\\"\"";
        java.lang.String str15 = python3Target1.getListLabel("\"_\\\"\\\\\\\\nContext\\\"\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"tset4.5.2.\"" + "'", str6, "\"tset4.5.2.\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset\\n" + "'", str11, "_tset\\n");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"_\\\"\\\\\\\\nContext\\\"\"" + "'", str15, "\"_\\\"\\\\\\\\nContext\\\"\"");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getListLabel("hi!");
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("\\nContext");
        int int10 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getTokenTypeAsTargetLabel(grammar11, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\\nContext\"" + "'", str9, "\"\\\\nContext\"");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        java.lang.String[] strArray12 = new java.lang.String[] { "4.5.2.1", "\\n", "", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        python3Target1.badWords = strSet13;
        java.lang.String str17 = python3Target1.getAltLabelContextStructName("\"tset4.5.2.\"");
        int int18 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"tset4.5.2.\"Context" + "'", str17, "\"tset4.5.2.\"Context");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 29 + "'", int18 == 29);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "", true);
        java.lang.String str6 = python3Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.loadTemplates();
        org.antlr.v4.tool.Rule rule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getRuleFunctionContextStructName(rule8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertNotNull(sTGroup7);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("_Context");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_Context" + "'", str1, "_Context");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator8);
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        python3Target9.genRecognizerHeaderFile(grammar10, sT11, "hi!");
        java.lang.String str14 = python3Target9.getVersion();
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target9.loadTemplates();
        python3Target1.templates = sTGroup15;
        java.lang.String str18 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.stringtemplate.v4.ST sT20 = null;
        python3Target1.genRecognizerHeaderFile(grammar19, sT20, "_tset");
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = python3Target1.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator24 = python3Target1.gen;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset4.5.2.1" + "'", str18, "_tset4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator23);
        org.junit.Assert.assertNull(codeGenerator24);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"4.5.2.1\"", false);
        java.lang.String str18 = python3Target1.getVersion();
        java.lang.String str19 = python3Target1.getLanguage();
        boolean boolean20 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = python3Target1.getLoopLabel(grammarAST21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Python3" + "'", str19, "Python3");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        java.lang.String str5 = python3Target1.getAltLabelContextStructName("\\n");
        java.lang.String[] strArray6 = python3Target1.targetCharValueEscape;
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        java.lang.String[] strArray8 = python3Target1.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar9 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target11 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator10);
        java.lang.String str13 = python3Target11.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup14 = python3Target11.templates;
        java.lang.String[] strArray15 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target11.targetCharValueEscape = strArray15;
        java.lang.String str18 = python3Target11.getImplicitSetLabel("");
        java.lang.String[] strArray28 = new java.lang.String[] { "\"\\\\n\"", "\\nContext", "4.5.2.1", "\"\"", "_tset", "\\nContext", "\\nContext", "\\nContext", "\\nContext" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        python3Target11.badWords = strSet29;
        org.antlr.v4.tool.Grammar grammar32 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target34 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator33);
        org.antlr.v4.tool.Grammar grammar35 = null;
        org.stringtemplate.v4.ST sT36 = null;
        python3Target34.genRecognizerHeaderFile(grammar35, sT36, "hi!");
        java.lang.String str39 = python3Target34.getVersion();
        org.stringtemplate.v4.STGroup sTGroup40 = python3Target34.loadTemplates();
        java.util.Set<java.lang.String> strSet41 = python3Target34.badWords;
        python3Target34.language = "\"\\\"4.5.2.1\\\"\"";
        org.antlr.v4.tool.Grammar grammar44 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator45 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target46 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator45);
        java.lang.String str48 = python3Target46.getAltLabelContextStructName("\\n");
        int int49 = python3Target46.getInlineTestSetWordSize();
        boolean boolean50 = python3Target46.wantsBaseVisitor();
        java.lang.String str52 = python3Target46.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String[] strArray53 = python3Target46.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar54 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator55 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target56 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator55);
        org.antlr.v4.tool.Grammar grammar57 = null;
        org.stringtemplate.v4.ST sT58 = null;
        python3Target56.genRecognizerHeaderFile(grammar57, sT58, "hi!");
        java.lang.String str61 = python3Target56.getVersion();
        org.stringtemplate.v4.STGroup sTGroup62 = python3Target56.loadTemplates();
        java.util.Set<java.lang.String> strSet63 = python3Target56.badWords;
        org.antlr.v4.tool.Grammar grammar64 = null;
        int[] intArray65 = new int[] {};
        java.lang.String[] strArray66 = python3Target56.getTokenTypesAsTargetLabels(grammar64, intArray65);
        java.lang.String[] strArray67 = python3Target46.getTokenTypesAsTargetLabels(grammar54, intArray65);
        java.lang.String[] strArray68 = python3Target34.getTokenTypesAsTargetLabels(grammar44, intArray65);
        java.lang.String[] strArray69 = python3Target11.getTokenTypesAsTargetLabels(grammar32, intArray65);
        java.lang.String[] strArray70 = python3Target1.getTokenTypesAsTargetLabels(grammar9, intArray65);
        org.antlr.v4.codegen.CodeGenerator codeGenerator71 = python3Target1.getCodeGenerator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\nContext" + "'", str5, "\\nContext");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\nContext" + "'", str13, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset" + "'", str18, "_tset");
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "4.5.2.1" + "'", str39, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup40);
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\\nContext" + "'", str48, "\\nContext");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 64 + "'", int49 == 64);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "d" + "'", str52, "d");
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "4.5.2.1" + "'", str61, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup62);
        org.junit.Assert.assertNotNull(strSet63);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[]");
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNull(codeGenerator71);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("_\"\\\\n\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_\"\\\\n\"Context" + "'", str8, "_\"\\\\n\"Context");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.stringtemplate.v4.ST sT6 = null;
        python3Target1.genRecognizerHeaderFile(grammar5, sT6, "\\n");
        java.lang.String str9 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python3Target1.gen = codeGenerator10;
        boolean boolean12 = python3Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getElementName("\\35Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getImplicitSetLabel("_tset_tset4.5.2.1");
        java.lang.String str7 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getLoopCounter(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset_tset_tset4.5.2.1" + "'", str6, "_tset_tset_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python3" + "'", str8, "Python3");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        int int6 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str7 = python3Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getElementListName("_tset\"\\\\n\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Python3" + "'", str7, "Python3");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.stringtemplate.v4.ST sT6 = null;
        python3Target1.genRecognizerHeaderFile(grammar5, sT6, "\\n");
        java.lang.String str9 = python3Target1.getVersion();
        java.lang.String str11 = python3Target1.getAltLabelContextStructName("_tset");
        org.antlr.v4.tool.ast.GrammarAST grammarAST12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = python3Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tsetContext" + "'", str11, "_tsetContext");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "", true);
        java.lang.String str6 = python3Target1.getLanguage();
        python3Target1.language = "Python3";
        java.lang.String str9 = python3Target1.language;
        java.lang.String[] strArray10 = python3Target1.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = python3Target1.getTokenTypeAsTargetLabel(grammar11, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python3" + "'", str9, "Python3");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("tset4.5.2.");
        java.util.Set<java.lang.String> strSet7 = python3Target1.getBadWords();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getLoopLabel(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"tset4.5.2.\"" + "'", str6, "\"tset4.5.2.\"");
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str5 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "\"\"", locale3);
        java.util.Locale locale7 = null;
        java.lang.String str8 = pythonStringRenderer0.toString((java.lang.Object) "_\"\\\\n\"", "\\n", locale7);
        java.lang.Object obj9 = null;
        java.util.Locale locale11 = null;
        java.lang.String str12 = pythonStringRenderer0.toString(obj9, "#", locale11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\n" + "'", str8, "\\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "#" + "'", str12, "#");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        int int7 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("\"_tset\\n\"", true);
        java.util.Set<java.lang.String> strSet11 = python3Target1.getBadWords();
        boolean boolean12 = python3Target1.supportsOverloadedMethods();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"_tset\\\\n\\\"\"" + "'", str10, "\"\\\"_tset\\\\n\\\"\"");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target17 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator16);
        org.antlr.v4.tool.Grammar grammar18 = null;
        org.stringtemplate.v4.ST sT19 = null;
        python3Target17.genRecognizerHeaderFile(grammar18, sT19, "hi!");
        java.lang.String str22 = python3Target17.getVersion();
        org.stringtemplate.v4.STGroup sTGroup23 = python3Target17.loadTemplates();
        python3Target1.templates = sTGroup23;
        org.stringtemplate.v4.STGroup sTGroup25 = python3Target1.loadTemplates();
        org.antlr.v4.tool.Grammar grammar26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = python3Target1.getTokenTypeAsTargetLabel(grammar26, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset4.5.2.1" + "'", str15, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "4.5.2.1" + "'", str22, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup23);
        org.junit.Assert.assertNotNull(sTGroup25);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.ast.GrammarAST grammarAST2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = python3Target1.getLoopLabel(grammarAST2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("\"tset\\\"_tset\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"tset\\\"_tset\"" + "'", str1, "\"tset\\\"_tset\"");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        java.lang.String str8 = python3Target1.getImplicitSetLabel("_tset4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator9);
        java.lang.String str12 = python3Target10.getAltLabelContextStructName("\\n");
        python3Target10.addBadWords();
        java.util.Set<java.lang.String> strSet14 = python3Target10.badWords;
        python3Target1.badWords = strSet14;
        org.stringtemplate.v4.STGroup sTGroup16 = python3Target1.templates;
        org.antlr.v4.tool.ast.GrammarAST grammarAST17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset_tset4.5.2.1" + "'", str8, "_tset_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\nContext" + "'", str12, "\\nContext");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(sTGroup16);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getImplicitTokenLabel("_tset\"4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        int int4 = python3Target1.getInlineTestSetWordSize();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        java.lang.String str7 = python3Target1.encodeIntAsCharEscape((int) ' ');
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("\"\"", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\\"\\\"" + "'", str10, "\\\"\\\"");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.loadTemplates();
        java.util.Set<java.lang.String> strSet8 = python3Target1.badWords;
        python3Target1.language = "\"\\\"4.5.2.1\\\"\"";
        int int11 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str12 = python3Target1.language;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.templates;
        // The following exception was thrown during execution in test generation
        try {
            org.stringtemplate.v4.STGroup sTGroup14 = python3Target1.getTemplates();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29 + "'", int11 == 29);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\"4.5.2.1\\\"\"" + "'", str12, "\"\\\"4.5.2.1\\\"\"");
        org.junit.Assert.assertNull(sTGroup13);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"4.5.2.1\"", false);
        org.stringtemplate.v4.STGroup sTGroup18 = python3Target1.getTemplates();
        java.lang.String str20 = python3Target1.getListLabel("\\1");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = python3Target1.getElementListName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\\1" + "'", str20, "\\1");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        python3Target1.gen = codeGenerator8;
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        python3Target1.gen = codeGenerator11;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertNotNull(sTGroup10);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.stringtemplate.v4.ST sT6 = null;
        python3Target1.genRecognizerHeaderFile(grammar5, sT6, "\\n");
        java.lang.String str9 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = null;
        python3Target1.gen = codeGenerator10;
        boolean boolean12 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.model.RuleFunction ruleFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = python3Target1.getRuleFunctionContextStructName(ruleFunction13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4.5.2.1" + "'", str9, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target1.genRecognizerHeaderFile(grammar7, sT8, "\"\\\\nContext\"");
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target12 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator11);
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = python3Target12.getCodeGenerator();
        boolean boolean14 = python3Target12.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target16 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator15);
        org.antlr.v4.tool.Grammar grammar17 = null;
        org.stringtemplate.v4.ST sT18 = null;
        python3Target16.genRecognizerHeaderFile(grammar17, sT18, "hi!");
        java.lang.String str21 = python3Target16.getVersion();
        org.stringtemplate.v4.STGroup sTGroup22 = python3Target16.loadTemplates();
        python3Target12.templates = sTGroup22;
        java.lang.String str26 = python3Target12.getTargetStringLiteralFromString("_tset4.5.2.1", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator27 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target28 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator27);
        org.antlr.v4.tool.Grammar grammar29 = null;
        org.stringtemplate.v4.ST sT30 = null;
        python3Target28.genRecognizerHeaderFile(grammar29, sT30, "hi!");
        java.lang.String str33 = python3Target28.getVersion();
        org.stringtemplate.v4.STGroup sTGroup34 = python3Target28.loadTemplates();
        python3Target12.templates = sTGroup34;
        org.stringtemplate.v4.STGroup sTGroup36 = python3Target12.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator37 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target38 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator37);
        java.lang.String str40 = python3Target38.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup41 = python3Target38.templates;
        java.lang.String str43 = python3Target38.getImplicitRuleLabel("\"tset4.5.2.\"");
        python3Target38.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator45 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target46 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator45);
        java.lang.String str48 = python3Target46.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup49 = python3Target46.templates;
        org.stringtemplate.v4.STGroup sTGroup50 = python3Target46.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator51 = python3Target46.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator52 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target53 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator52);
        java.lang.String str55 = python3Target53.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar56 = null;
        org.stringtemplate.v4.ST sT57 = null;
        python3Target53.genRecognizerHeaderFile(grammar56, sT57, "\\nContext");
        java.lang.String[] strArray64 = new java.lang.String[] { "4.5.2.1", "\\n", "", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet65 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet65, strArray64);
        python3Target53.badWords = strSet65;
        python3Target46.badWords = strSet65;
        python3Target38.badWords = strSet65;
        python3Target12.badWords = strSet65;
        python3Target1.badWords = strSet65;
        java.lang.String str73 = python3Target1.getTargetStringLiteralFromString("\"tset\\\"\\\\n\\\"Contex\"");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(codeGenerator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4.5.2.1" + "'", str21, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "_tset4.5.2.1" + "'", str26, "_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "4.5.2.1" + "'", str33, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup34);
        org.junit.Assert.assertNotNull(sTGroup36);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\\nContext" + "'", str40, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "_\"tset4.5.2.\"" + "'", str43, "_\"tset4.5.2.\"");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\\n" + "'", str48, "\\n");
        org.junit.Assert.assertNull(sTGroup49);
        org.junit.Assert.assertNull(sTGroup50);
        org.junit.Assert.assertNull(codeGenerator51);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "\\n" + "'", str55, "\\n");
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "\"\\\"tset\\\\\\\"\\\\\\\\n\\\\\\\"Contex\\\"\"" + "'", str73, "\"\\\"tset\\\\\\\"\\\\\\\\n\\\\\\\"Contex\\\"\"");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String[] strArray5 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target1.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target1.getImplicitSetLabel("");
        java.lang.String[] strArray18 = new java.lang.String[] { "\"\\\\n\"", "\\nContext", "4.5.2.1", "\"\"", "_tset", "\\nContext", "\\nContext", "\\nContext", "\\nContext" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python3Target1.badWords = strSet19;
        java.util.Set<java.lang.String> strSet22 = python3Target1.badWords;
        java.lang.String str24 = python3Target1.getListLabel("_tsetContext");
        boolean boolean25 = python3Target1.supportsOverloadedMethods();
        boolean boolean26 = python3Target1.templatesExist();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "_tsetContext" + "'", str24, "_tsetContext");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        java.lang.String str8 = python3Target1.getImplicitSetLabel("_tset4.5.2.1");
        java.lang.String str10 = python3Target1.encodeIntAsCharEscape((int) (byte) 1);
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genFile(grammar11, sT12, "_Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset_tset4.5.2.1" + "'", str8, "_tset_tset4.5.2.1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\1" + "'", str10, "\\1");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("tset4.5.2.");
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("d", false);
        java.lang.String str11 = python3Target1.getImplicitSetLabel("\\n");
        python3Target1.language = "\"_\\\"\\\\\\\\nContext\\\"\"";
        boolean boolean14 = python3Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getAltLabelContextStructName("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"tset4.5.2.\"" + "'", str6, "\"tset4.5.2.\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset\\n" + "'", str11, "_tset\\n");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"4.5.2.1\"", false);
        org.stringtemplate.v4.STGroup sTGroup18 = python3Target1.getTemplates();
        boolean boolean19 = python3Target1.supportsOverloadedMethods();
        java.lang.String str21 = python3Target1.getImplicitRuleLabel("\"\\\\n\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = python3Target1.getLoopCounter(grammarAST22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "_\"\\\\n\"" + "'", str21, "_\"\\\\n\"");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String str7 = python3Target1.getListLabel("hi!");
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("\\nContext");
        int int10 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str12 = python3Target1.getImplicitRuleLabel("_tset_tset4.5.2.1");
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.loadTemplates();
        org.antlr.v4.tool.Grammar grammar14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = python3Target1.getTokenTypeAsTargetLabel(grammar14, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\\nContext\"" + "'", str9, "\"\\\\nContext\"");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "__tset_tset4.5.2.1" + "'", str12, "__tset_tset4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup13);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer pythonStringRenderer0 = new org.antlr.v4.codegen.target.Python3Target.PythonStringRenderer();
        java.lang.Object obj1 = null;
        java.util.Locale locale3 = null;
        java.lang.String str4 = pythonStringRenderer0.toString(obj1, "\"\"", locale3);
        java.util.Locale locale7 = null;
        java.lang.String str8 = pythonStringRenderer0.toString((java.lang.Object) "_\"\\\\n\"", "\\n", locale7);
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator9);
        org.antlr.v4.codegen.CodeGenerator codeGenerator11 = python3Target10.getCodeGenerator();
        int int12 = python3Target10.getSerializedATNSegmentLimit();
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = pythonStringRenderer0.toString((java.lang.Object) python3Target10, "\"\\\"4.5.2.1\\\"\"", locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.antlr.v4.codegen.target.Python3Target cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"\"" + "'", str4, "\"\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\n" + "'", str8, "\\n");
        org.junit.Assert.assertNull(codeGenerator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 29 + "'", int12 == 29);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "\"\\\\nContext\"", false);
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target1.getTemplates();
        java.lang.String str9 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target1.getCodeGenerator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.encodeIntAsCharEscape((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\\\nContext" + "'", str7, "\\\\nContext");
        org.junit.Assert.assertNotNull(sTGroup8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python3" + "'", str9, "Python3");
        org.junit.Assert.assertNull(codeGenerator10);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String[] strArray5 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target1.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target1.getImplicitSetLabel("");
        java.lang.String[] strArray18 = new java.lang.String[] { "\"\\\\n\"", "\\nContext", "4.5.2.1", "\"\"", "_tset", "\\nContext", "\\nContext", "\\nContext", "\\nContext" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python3Target1.badWords = strSet19;
        java.util.Set<java.lang.String> strSet22 = python3Target1.badWords;
        boolean boolean23 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup24 = python3Target1.loadTemplates();
        boolean boolean25 = python3Target1.templatesExist();
        java.lang.String str27 = python3Target1.getAltLabelContextStructName("_tset\"\\\\n\"");
        boolean boolean28 = python3Target1.templatesExist();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(sTGroup24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "_tset\"\\\\n\"Context" + "'", str27, "_tset\"\\\\n\"Context");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String[] strArray5 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target1.targetCharValueEscape = strArray5;
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genFile(grammar7, sT8, "\"\\\\1\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.loadTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        python3Target1.gen = codeGenerator8;
        java.lang.String str11 = python3Target1.getImplicitSetLabel("_tset\"\\\"_Python3\\\"\"Context");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset_tset\"\\\"_Python3\\\"\"Context" + "'", str11, "_tset_tset\"\\\"_Python3\\\"\"Context");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        python3Target1.language = "\"\"";
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = python3Target1.gen;
        java.lang.String str13 = python3Target1.getVersion();
        python3Target1.language = "\"Python\"";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.getElementName("_\\\"\\\\\\\\nContext\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(codeGenerator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4.5.2.1" + "'", str13, "4.5.2.1");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.lang.String str1 = org.stringtemplate.v4.StringRenderer.escapeHTML("_tset\"tset4.5.2.\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_tset\"tset4.5.2.\"" + "'", str1, "_tset\"tset4.5.2.\"");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        python3Target1.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        python3Target1.gen = codeGenerator5;
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        python3Target1.gen = codeGenerator8;
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.loadTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = python3Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(sTGroup10);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("tset4.5.2.");
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.getTemplates();
        org.antlr.v4.tool.Rule rule8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getRuleFunctionContextStructName(rule8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"tset4.5.2.\"" + "'", str6, "\"tset4.5.2.\"");
        org.junit.Assert.assertNotNull(sTGroup7);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        python3Target1.language = "\"\"";
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        java.lang.String str11 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator8, "_\\1", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator12, "_\"_tset\\n\"", true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\\\"_tset\\n\"" + "'", str15, "\"\\\"_tset\\n\"");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar5 = null;
        org.stringtemplate.v4.ST sT6 = null;
        python3Target1.genRecognizerHeaderFile(grammar5, sT6, "\\n");
        org.antlr.v4.tool.Rule rule9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getRuleFunctionContextStructName(rule9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String[] strArray5 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target1.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target1.getImplicitSetLabel("");
        java.lang.String[] strArray18 = new java.lang.String[] { "\"\\\\n\"", "\\nContext", "4.5.2.1", "\"\"", "_tset", "\\nContext", "\\nContext", "\\nContext", "\\nContext" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python3Target1.badWords = strSet19;
        java.util.Set<java.lang.String> strSet22 = python3Target1.badWords;
        java.lang.String str24 = python3Target1.getListLabel("_tsetContext");
        boolean boolean25 = python3Target1.supportsOverloadedMethods();
        boolean boolean26 = python3Target1.templatesExist();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = python3Target1.getElementListName("\"_tset\\n\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "_tsetContext" + "'", str24, "_tsetContext");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String[] strArray5 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target1.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target1.getImplicitSetLabel("");
        java.lang.String str10 = python3Target1.getImplicitSetLabel("\"4.5.2.1\"");
        java.lang.String str12 = python3Target1.getListLabel("_tset\"4.5.2.1\"");
        org.antlr.v4.tool.Grammar grammar13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getTokenTypeAsTargetLabel(grammar13, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_tset\"4.5.2.1\"" + "'", str10, "_tset\"4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_tset\"4.5.2.1\"" + "'", str12, "_tset\"4.5.2.1\"");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "", true);
        java.lang.String str6 = python3Target1.getLanguage();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.loadTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = python3Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertNotNull(sTGroup7);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str5 = python3Target1.getVersion();
        python3Target1.language = "\"\\\\nContext\"";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = python3Target1.getAltLabelContextStructName("\"\\\\n\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str5 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getLanguage();
        boolean boolean7 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        python3Target1.genRecognizerHeaderFile(grammar8, sT9, "");
        python3Target1.language = "_tset_tset4.5.2.1";
        java.lang.String str14 = python3Target1.getVersion();
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromString("\"\\\"_tset\\\"\"");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python3Target1.getAltLabelContextStructName("_tset4.5.2.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\\"\\\\\\\"_tset\\\\\\\"\\\"\"" + "'", str16, "\"\\\"\\\\\\\"_tset\\\\\\\"\\\"\"");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "", true);
        java.lang.String str6 = python3Target1.getLanguage();
        python3Target1.language = "Python3";
        boolean boolean9 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getTokenTypeAsTargetLabel(grammar10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        int int4 = python3Target1.getInlineTestSetWordSize();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        java.lang.String str7 = python3Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String[] strArray8 = python3Target1.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator9);
        java.lang.String str12 = python3Target10.getAltLabelContextStructName("\\n");
        java.lang.String str14 = python3Target10.getAltLabelContextStructName("\\n");
        java.lang.String[] strArray15 = python3Target10.targetCharValueEscape;
        python3Target1.targetCharValueEscape = strArray15;
        java.lang.String[] strArray17 = python3Target1.targetCharValueEscape;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray17;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d" + "'", str7, "d");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\nContext" + "'", str12, "\\nContext");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\nContext" + "'", str14, "\\nContext");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String[] strArray5 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target1.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target1.getImplicitSetLabel("");
        java.lang.String[] strArray18 = new java.lang.String[] { "\"\\\\n\"", "\\nContext", "4.5.2.1", "\"\"", "_tset", "\\nContext", "\\nContext", "\\nContext", "\\nContext" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python3Target1.badWords = strSet19;
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator23 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target24 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator23);
        java.lang.String str26 = python3Target24.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup27 = python3Target24.templates;
        java.lang.String[] strArray28 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target24.targetCharValueEscape = strArray28;
        java.lang.String str31 = python3Target24.getImplicitSetLabel("");
        java.lang.String[] strArray41 = new java.lang.String[] { "\"\\\\n\"", "\\nContext", "4.5.2.1", "\"\"", "_tset", "\\nContext", "\\nContext", "\\nContext", "\\nContext" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        python3Target24.badWords = strSet42;
        org.antlr.v4.tool.Grammar grammar45 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator46 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target47 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator46);
        org.antlr.v4.tool.Grammar grammar48 = null;
        org.stringtemplate.v4.ST sT49 = null;
        python3Target47.genRecognizerHeaderFile(grammar48, sT49, "hi!");
        java.lang.String str52 = python3Target47.getVersion();
        org.stringtemplate.v4.STGroup sTGroup53 = python3Target47.loadTemplates();
        java.util.Set<java.lang.String> strSet54 = python3Target47.badWords;
        python3Target47.language = "\"\\\"4.5.2.1\\\"\"";
        org.antlr.v4.tool.Grammar grammar57 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator58 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target59 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator58);
        java.lang.String str61 = python3Target59.getAltLabelContextStructName("\\n");
        int int62 = python3Target59.getInlineTestSetWordSize();
        boolean boolean63 = python3Target59.wantsBaseVisitor();
        java.lang.String str65 = python3Target59.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String[] strArray66 = python3Target59.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar67 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator68 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target69 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator68);
        org.antlr.v4.tool.Grammar grammar70 = null;
        org.stringtemplate.v4.ST sT71 = null;
        python3Target69.genRecognizerHeaderFile(grammar70, sT71, "hi!");
        java.lang.String str74 = python3Target69.getVersion();
        org.stringtemplate.v4.STGroup sTGroup75 = python3Target69.loadTemplates();
        java.util.Set<java.lang.String> strSet76 = python3Target69.badWords;
        org.antlr.v4.tool.Grammar grammar77 = null;
        int[] intArray78 = new int[] {};
        java.lang.String[] strArray79 = python3Target69.getTokenTypesAsTargetLabels(grammar77, intArray78);
        java.lang.String[] strArray80 = python3Target59.getTokenTypesAsTargetLabels(grammar67, intArray78);
        java.lang.String[] strArray81 = python3Target47.getTokenTypesAsTargetLabels(grammar57, intArray78);
        java.lang.String[] strArray82 = python3Target24.getTokenTypesAsTargetLabels(grammar45, intArray78);
        java.lang.String[] strArray83 = python3Target1.getTokenTypesAsTargetLabels(grammar22, intArray78);
        org.antlr.v4.tool.ast.GrammarAST grammarAST84 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean85 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "\\nContext" + "'", str26, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup27);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "_tset" + "'", str31, "_tset");
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "4.5.2.1" + "'", str52, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup53);
        org.junit.Assert.assertNotNull(strSet54);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "\\nContext" + "'", str61, "\\nContext");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 64 + "'", int62 == 64);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "d" + "'", str65, "d");
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "4.5.2.1" + "'", str74, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup75);
        org.junit.Assert.assertNotNull(strSet76);
        org.junit.Assert.assertNotNull(intArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray78), "[]");
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertNotNull(strArray83);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator8);
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        python3Target9.genRecognizerHeaderFile(grammar10, sT11, "hi!");
        java.lang.String str14 = python3Target9.getVersion();
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target9.loadTemplates();
        python3Target1.templates = sTGroup15;
        java.lang.String str18 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.stringtemplate.v4.ST sT20 = null;
        python3Target1.genRecognizerHeaderFile(grammar19, sT20, "_tset");
        boolean boolean23 = python3Target1.supportsOverloadedMethods();
        java.lang.String str24 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target26 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator25);
        java.lang.String str28 = python3Target26.getAltLabelContextStructName("\\n");
        python3Target26.addBadWords();
        java.util.Set<java.lang.String> strSet30 = python3Target26.badWords;
        java.lang.String str32 = python3Target26.getAltLabelContextStructName("\"\\\"tset\\\\\\\"_tset\\\"\"");
        java.util.Set<java.lang.String> strSet33 = python3Target26.badWords;
        python3Target1.badWords = strSet33;
        int int35 = python3Target1.getSerializedATNSegmentLimit();
        java.util.Set<java.lang.String> strSet36 = python3Target1.getBadWords();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset4.5.2.1" + "'", str18, "_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Python3" + "'", str24, "Python3");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\\nContext" + "'", str28, "\\nContext");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\"\\\"tset\\\\\\\"_tset\\\"\"Context" + "'", str32, "\"\\\"tset\\\\\\\"_tset\\\"\"Context");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 29 + "'", int35 == 29);
        org.junit.Assert.assertNotNull(strSet36);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        boolean boolean4 = python3Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.loadTemplates();
        java.lang.String str7 = python3Target1.getAltLabelContextStructName("_tset_tset_tset4.5.2.1");
        java.lang.String str8 = python3Target1.getLanguage();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset_tset_tset4.5.2.1Context" + "'", str7, "_tset_tset_tset4.5.2.1Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python3" + "'", str8, "Python3");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"4.5.2.1\"", false);
        java.lang.String str18 = python3Target1.getVersion();
        java.lang.String str19 = python3Target1.getLanguage();
        boolean boolean20 = python3Target1.supportsOverloadedMethods();
        boolean boolean21 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target23 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator22);
        java.lang.String str25 = python3Target23.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup26 = python3Target23.templates;
        java.lang.String[] strArray27 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target23.targetCharValueEscape = strArray27;
        java.lang.String str30 = python3Target23.getImplicitSetLabel("");
        java.lang.String[] strArray40 = new java.lang.String[] { "\"\\\\n\"", "\\nContext", "4.5.2.1", "\"\"", "_tset", "\\nContext", "\\nContext", "\\nContext", "\\nContext" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        python3Target23.badWords = strSet41;
        java.util.Set<java.lang.String> strSet44 = python3Target23.badWords;
        python3Target1.badWords = strSet44;
        org.antlr.v4.codegen.model.RuleFunction ruleFunction46 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str47 = python3Target1.getRuleFunctionContextStructName(ruleFunction46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Python3" + "'", str19, "Python3");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\\nContext" + "'", str25, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "_tset" + "'", str30, "_tset");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strSet44);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        java.lang.String str5 = python3Target1.getVersion();
        java.lang.String str6 = python3Target1.getLanguage();
        boolean boolean7 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.tool.Grammar grammar8 = null;
        org.stringtemplate.v4.ST sT9 = null;
        python3Target1.genRecognizerHeaderFile(grammar8, sT9, "");
        python3Target1.language = "_tset_tset4.5.2.1";
        java.lang.String str14 = python3Target1.getVersion();
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromString("\"\\\"_tset\\\"\"");
        int int17 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str20 = python3Target1.getTargetStringLiteralFromString("_tset\"tset4.5.2.\"", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4.5.2.1" + "'", str5, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\"\\\"\\\\\\\"_tset\\\\\\\"\\\"\"" + "'", str16, "\"\\\"\\\\\\\"_tset\\\\\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 64 + "'", int17 == 64);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "_tset\\\"tset4.5.2.\\\"" + "'", str20, "_tset\\\"tset4.5.2.\\\"");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        int int4 = python3Target1.getInlineTestSetWordSize();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = null;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator6, "\"\\\"tset4.5.2.\\\"Context\"", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = python3Target1.getImplicitTokenLabel("\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"tset4.5.2.\\\"Context\"" + "'", str9, "\"\\\"tset4.5.2.\\\"Context\"");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String[] strArray5 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target1.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target1.getImplicitSetLabel("");
        java.lang.String str10 = python3Target1.encodeIntAsCharEscape(100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "d" + "'", str10, "d");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        java.lang.String str5 = python3Target1.getAltLabelContextStructName("\\n");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.getCodeGenerator();
        org.antlr.v4.tool.Rule rule7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = python3Target1.getRuleFunctionContextStructName(rule7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\nContext" + "'", str5, "\\nContext");
        org.junit.Assert.assertNull(codeGenerator6);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.stringtemplate.v4.ST sT15 = null;
        python3Target1.genRecognizerHeaderFile(grammar14, sT15, "\"4.5.2.1\"");
        org.stringtemplate.v4.STGroup sTGroup18 = python3Target1.loadTemplates();
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertNotNull(sTGroup18);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getImplicitRuleLabel("\"tset4.5.2.\"");
        java.lang.String str8 = python3Target1.getAltLabelContextStructName("Python3");
        java.lang.String[] strArray9 = python3Target1.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator10 = python3Target1.gen;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_\"tset4.5.2.\"" + "'", str6, "_\"tset4.5.2.\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python3Context" + "'", str8, "Python3Context");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNull(codeGenerator10);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        org.antlr.v4.codegen.CodeGenerator codeGenerator6 = python3Target1.gen;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator7, "\"\\\"_tset\\n\"", true);
        org.junit.Assert.assertNull(codeGenerator6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"_tset\\n\"" + "'", str10, "\"\\\"_tset\\n\"");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        java.lang.String[] strArray12 = new java.lang.String[] { "4.5.2.1", "\\n", "", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        python3Target1.badWords = strSet13;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = python3Target1.getImplicitTokenLabel("_tset_tset_tset4.5.2.1Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        boolean boolean4 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        java.lang.String[] strArray12 = new java.lang.String[] { "4.5.2.1", "\\n", "", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        python3Target1.badWords = strSet13;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = python3Target1.gen;
        org.stringtemplate.v4.STGroup sTGroup17 = python3Target1.getTemplates();
        java.lang.String str19 = python3Target1.getTargetStringLiteralFromString("");
        java.lang.String str20 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target22 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator21);
        org.antlr.v4.tool.Grammar grammar23 = null;
        org.stringtemplate.v4.ST sT24 = null;
        python3Target22.genRecognizerHeaderFile(grammar23, sT24, "hi!");
        int int27 = python3Target22.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup28 = python3Target22.templates;
        org.stringtemplate.v4.STGroup sTGroup29 = python3Target22.loadTemplates();
        python3Target1.templates = sTGroup29;
        java.lang.Class<?> wildcardClass31 = sTGroup29.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(codeGenerator16);
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\"" + "'", str19, "\"\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Python3" + "'", str20, "Python3");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 64 + "'", int27 == 64);
        org.junit.Assert.assertNull(sTGroup28);
        org.junit.Assert.assertNotNull(sTGroup29);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        int int5 = python3Target1.getSerializedATNSegmentLimit();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 29 + "'", int5 == 29);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.Grammar grammar7 = null;
        org.stringtemplate.v4.ST sT8 = null;
        python3Target1.genRecognizerHeaderFile(grammar7, sT8, "\"\\\\nContext\"");
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("_\"\\\\n\"Context", true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"_\\\"\\\\\\\\n\\\"Context\"" + "'", str13, "\"_\\\"\\\\\\\\n\\\"Context\"");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\\n");
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("_\"\\\\nContext\"");
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("_tset_tset_tset4.5.2.1");
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromString("\\1");
        java.lang.String str14 = python3Target1.getImplicitSetLabel("_tset\"Python\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\\n\"" + "'", str6, "\"\\\\n\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_\\\"\\\\\\\\nContext\\\"\"" + "'", str8, "\"_\\\"\\\\\\\\nContext\\\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tset_tset_tset4.5.2.1\"" + "'", str10, "\"_tset_tset_tset4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\\1\"" + "'", str12, "\"\\\\1\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_tset_tset\"Python\"" + "'", str14, "_tset_tset\"Python\"");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        python3Target1.gen = codeGenerator7;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator9);
        java.lang.String str12 = python3Target10.getAltLabelContextStructName("\\n");
        java.lang.String str14 = python3Target10.getAltLabelContextStructName("\\n");
        org.antlr.v4.codegen.CodeGenerator codeGenerator15 = python3Target10.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target17 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator16);
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python3Target17.getCodeGenerator();
        boolean boolean19 = python3Target17.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target21 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator20);
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.stringtemplate.v4.ST sT23 = null;
        python3Target21.genRecognizerHeaderFile(grammar22, sT23, "hi!");
        java.lang.String str26 = python3Target21.getVersion();
        org.stringtemplate.v4.STGroup sTGroup27 = python3Target21.loadTemplates();
        python3Target17.templates = sTGroup27;
        org.stringtemplate.v4.STGroup sTGroup29 = python3Target17.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator30 = null;
        java.lang.String str33 = python3Target17.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator30, "\"4.5.2.1\"", false);
        org.stringtemplate.v4.STGroup sTGroup34 = python3Target17.getTemplates();
        python3Target10.templates = sTGroup34;
        python3Target1.templates = sTGroup34;
        java.lang.String str38 = python3Target1.getTargetStringLiteralFromString("\"\\\"_tset\\\"\"");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\nContext" + "'", str12, "\\nContext");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\nContext" + "'", str14, "\\nContext");
        org.junit.Assert.assertNull(codeGenerator15);
        org.junit.Assert.assertNull(codeGenerator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "4.5.2.1" + "'", str26, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup27);
        org.junit.Assert.assertNotNull(sTGroup29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "4.5.2.1" + "'", str33, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\"\\\"\\\\\\\"_tset\\\\\\\"\\\"\"" + "'", str38, "\"\\\"\\\\\\\"_tset\\\\\\\"\\\"\"");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        java.lang.String str15 = python3Target1.getTargetStringLiteralFromString("_tset4.5.2.1", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        python3Target1.gen = codeGenerator16;
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset4.5.2.1" + "'", str15, "_tset4.5.2.1");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        int int4 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = python3Target1.getCodeGenerator();
        java.lang.String[] strArray6 = python3Target1.targetCharValueEscape;
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("\"_tset_tset_tset4.5.2.1\"", true);
        org.antlr.v4.tool.ast.GrammarAST grammarAST10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = python3Target1.grammarSymbolCausesIssueInGeneratedCode(grammarAST10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertNull(codeGenerator5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\\\"_tset_tset_tset4.5.2.1\\\"\"" + "'", str9, "\"\\\"_tset_tset_tset4.5.2.1\\\"\"");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        java.lang.String[] strArray12 = new java.lang.String[] { "4.5.2.1", "\\n", "", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        python3Target1.badWords = strSet13;
        java.lang.String str17 = python3Target1.getListLabel("hi!");
        java.util.Set<java.lang.String> strSet18 = python3Target1.badWords;
        boolean boolean19 = python3Target1.wantsBaseVisitor();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = python3Target1.getElementName("_tset_tset\"\\\"_Python3\\\"\"Context");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        java.lang.String str9 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.loadTemplates();
        boolean boolean11 = python3Target1.wantsBaseVisitor();
        java.util.Set<java.lang.String> strSet12 = python3Target1.badWords;
        org.antlr.v4.tool.ast.GrammarAST grammarAST13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = python3Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset4.5.2.1" + "'", str9, "_tset4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        int int4 = python3Target1.getInlineTestSetWordSize();
        boolean boolean5 = python3Target1.wantsBaseVisitor();
        java.lang.String str7 = python3Target1.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String[] strArray8 = python3Target1.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator9);
        java.lang.String str12 = python3Target10.getAltLabelContextStructName("\\n");
        java.lang.String str14 = python3Target10.getAltLabelContextStructName("\\n");
        java.lang.String[] strArray15 = python3Target10.targetCharValueEscape;
        python3Target1.targetCharValueEscape = strArray15;
        org.antlr.v4.codegen.CodeGenerator codeGenerator17 = null;
        python3Target1.gen = codeGenerator17;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 64 + "'", int4 == 64);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d" + "'", str7, "d");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\nContext" + "'", str12, "\\nContext");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\\nContext" + "'", str14, "\\nContext");
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        java.lang.String str9 = python3Target1.getImplicitRuleLabel("\"\"");
        int int10 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str13 = python3Target1.getTargetStringLiteralFromString("__tset_tset4.5.2.1", true);
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target15 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator14);
        org.antlr.v4.tool.Grammar grammar16 = null;
        org.stringtemplate.v4.ST sT17 = null;
        python3Target15.genRecognizerHeaderFile(grammar16, sT17, "hi!");
        java.lang.String str20 = python3Target15.getVersion();
        org.stringtemplate.v4.STGroup sTGroup21 = python3Target15.loadTemplates();
        java.util.Set<java.lang.String> strSet22 = python3Target15.badWords;
        python3Target15.language = "\"\\\"4.5.2.1\\\"\"";
        org.antlr.v4.tool.Grammar grammar25 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target27 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator26);
        java.lang.String str29 = python3Target27.getAltLabelContextStructName("\\n");
        int int30 = python3Target27.getInlineTestSetWordSize();
        boolean boolean31 = python3Target27.wantsBaseVisitor();
        java.lang.String str33 = python3Target27.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String[] strArray34 = python3Target27.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar35 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator36 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target37 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator36);
        org.antlr.v4.tool.Grammar grammar38 = null;
        org.stringtemplate.v4.ST sT39 = null;
        python3Target37.genRecognizerHeaderFile(grammar38, sT39, "hi!");
        java.lang.String str42 = python3Target37.getVersion();
        org.stringtemplate.v4.STGroup sTGroup43 = python3Target37.loadTemplates();
        java.util.Set<java.lang.String> strSet44 = python3Target37.badWords;
        org.antlr.v4.tool.Grammar grammar45 = null;
        int[] intArray46 = new int[] {};
        java.lang.String[] strArray47 = python3Target37.getTokenTypesAsTargetLabels(grammar45, intArray46);
        java.lang.String[] strArray48 = python3Target27.getTokenTypesAsTargetLabels(grammar35, intArray46);
        java.lang.String[] strArray49 = python3Target15.getTokenTypesAsTargetLabels(grammar25, intArray46);
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray49;
        python3Target1.targetCharValueEscape = strArray49;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_\"\"" + "'", str9, "_\"\"");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 64 + "'", int10 == 64);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"__tset_tset4.5.2.1\"" + "'", str13, "\"__tset_tset4.5.2.1\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "4.5.2.1" + "'", str20, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\\nContext" + "'", str29, "\\nContext");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 64 + "'", int30 == 64);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "d" + "'", str33, "d");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "4.5.2.1" + "'", str42, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup43);
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[]");
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(strArray49);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getImplicitSetLabel("_tset_tset4.5.2.1");
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.loadTemplates();
        python3Target1.addBadWords();
        python3Target1.language = "\"\\\"\\\\\\\"\\\\\\\\n\\\"\"";
        org.antlr.v4.tool.ast.GrammarAST grammarAST11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = python3Target1.visibleGrammarSymbolCausesIssueInGeneratedCode(grammarAST11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_tset_tset_tset4.5.2.1" + "'", str6, "_tset_tset_tset4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup7);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target1.gen;
        java.lang.String str5 = python3Target1.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = python3Target1.getElementListName("\"_tset\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Python3" + "'", str5, "Python3");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("tset4.5.2.");
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("d", false);
        java.lang.String str11 = python3Target1.getImplicitSetLabel("\\n");
        java.lang.String str12 = python3Target1.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        python3Target1.gen = codeGenerator13;
        java.lang.String str15 = python3Target1.getLanguage();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"tset4.5.2.\"" + "'", str6, "\"tset4.5.2.\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset\\n" + "'", str11, "_tset\\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Python3" + "'", str12, "Python3");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Python3" + "'", str15, "Python3");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String[] strArray5 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target1.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target1.getImplicitSetLabel("");
        java.lang.String[] strArray18 = new java.lang.String[] { "\"\\\\n\"", "\\nContext", "4.5.2.1", "\"\"", "_tset", "\\nContext", "\\nContext", "\\nContext", "\\nContext" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python3Target1.badWords = strSet19;
        java.util.Set<java.lang.String> strSet22 = python3Target1.badWords;
        java.lang.String str24 = python3Target1.getImplicitSetLabel("___\"tset\\\"_tset\"");
        org.antlr.v4.tool.ast.GrammarAST grammarAST25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = python3Target1.getLoopLabel(grammarAST25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "_tset___\"tset\\\"_tset\"" + "'", str24, "_tset___\"tset\\\"_tset\"");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = null;
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator2, "", true);
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("_Context");
        java.lang.String str8 = python3Target1.getLanguage();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getLoopLabel(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\"" + "'", str5, "\"\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"_Context\"" + "'", str7, "\"_Context\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Python3" + "'", str8, "Python3");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        java.lang.String str5 = python3Target1.getTargetStringLiteralFromString("4.5.2.1");
        org.stringtemplate.v4.STGroup sTGroup6 = python3Target1.templates;
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator7);
        java.lang.String str10 = python3Target8.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target8.templates;
        java.lang.String[] strArray12 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target8.targetCharValueEscape = strArray12;
        java.lang.String str15 = python3Target8.getImplicitSetLabel("");
        java.lang.String[] strArray25 = new java.lang.String[] { "\"\\\\n\"", "\\nContext", "4.5.2.1", "\"\"", "_tset", "\\nContext", "\\nContext", "\\nContext", "\\nContext" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        python3Target8.badWords = strSet26;
        org.antlr.v4.tool.Grammar grammar29 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator30 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target31 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator30);
        org.antlr.v4.tool.Grammar grammar32 = null;
        org.stringtemplate.v4.ST sT33 = null;
        python3Target31.genRecognizerHeaderFile(grammar32, sT33, "hi!");
        java.lang.String str36 = python3Target31.getVersion();
        org.stringtemplate.v4.STGroup sTGroup37 = python3Target31.loadTemplates();
        java.util.Set<java.lang.String> strSet38 = python3Target31.badWords;
        python3Target31.language = "\"\\\"4.5.2.1\\\"\"";
        org.antlr.v4.tool.Grammar grammar41 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator42 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target43 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator42);
        java.lang.String str45 = python3Target43.getAltLabelContextStructName("\\n");
        int int46 = python3Target43.getInlineTestSetWordSize();
        boolean boolean47 = python3Target43.wantsBaseVisitor();
        java.lang.String str49 = python3Target43.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String[] strArray50 = python3Target43.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar51 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator52 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target53 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator52);
        org.antlr.v4.tool.Grammar grammar54 = null;
        org.stringtemplate.v4.ST sT55 = null;
        python3Target53.genRecognizerHeaderFile(grammar54, sT55, "hi!");
        java.lang.String str58 = python3Target53.getVersion();
        org.stringtemplate.v4.STGroup sTGroup59 = python3Target53.loadTemplates();
        java.util.Set<java.lang.String> strSet60 = python3Target53.badWords;
        org.antlr.v4.tool.Grammar grammar61 = null;
        int[] intArray62 = new int[] {};
        java.lang.String[] strArray63 = python3Target53.getTokenTypesAsTargetLabels(grammar61, intArray62);
        java.lang.String[] strArray64 = python3Target43.getTokenTypesAsTargetLabels(grammar51, intArray62);
        java.lang.String[] strArray65 = python3Target31.getTokenTypesAsTargetLabels(grammar41, intArray62);
        java.lang.String[] strArray66 = python3Target8.getTokenTypesAsTargetLabels(grammar29, intArray62);
        python3Target1.targetCharValueEscape = strArray66;
        java.lang.String str70 = python3Target1.getTargetStringLiteralFromString("", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"4.5.2.1\"" + "'", str5, "\"4.5.2.1\"");
        org.junit.Assert.assertNull(sTGroup6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\nContext" + "'", str10, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset" + "'", str15, "_tset");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "4.5.2.1" + "'", str36, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup37);
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\\nContext" + "'", str45, "\\nContext");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 64 + "'", int46 == 64);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "d" + "'", str49, "d");
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "4.5.2.1" + "'", str58, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup59);
        org.junit.Assert.assertNotNull(strSet60);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[]");
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "_tset4.5.2.1", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        int int9 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str11 = python3Target1.getImplicitSetLabel("\\n");
        org.antlr.v4.tool.Grammar grammar12 = null;
        org.stringtemplate.v4.ST sT13 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genFile(grammar12, sT13, "\\\"_tset_tset4.5.2.1\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "tset4.5.2." + "'", str7, "tset4.5.2.");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset\\n" + "'", str11, "_tset\\n");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.loadTemplates();
        java.util.Set<java.lang.String> strSet8 = python3Target1.badWords;
        java.lang.String str10 = python3Target1.getImplicitSetLabel("Python3");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.getElementName("__tset\"4.5.2.1\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_tsetPython3" + "'", str10, "_tsetPython3");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        int int2 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.Grammar grammar3 = null;
        org.stringtemplate.v4.ST sT4 = null;
        // The following exception was thrown during execution in test generation
        try {
            python3Target1.genFile(grammar3, sT4, "_\"\\\\nContext\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.loadTemplates();
        java.util.Set<java.lang.String> strSet8 = python3Target1.badWords;
        python3Target1.language = "\"\\\"4.5.2.1\\\"\"";
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target13 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator12);
        java.lang.String str15 = python3Target13.getAltLabelContextStructName("\\n");
        int int16 = python3Target13.getInlineTestSetWordSize();
        boolean boolean17 = python3Target13.wantsBaseVisitor();
        java.lang.String str19 = python3Target13.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String[] strArray20 = python3Target13.targetCharValueEscape;
        org.antlr.v4.tool.Grammar grammar21 = null;
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target23 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator22);
        org.antlr.v4.tool.Grammar grammar24 = null;
        org.stringtemplate.v4.ST sT25 = null;
        python3Target23.genRecognizerHeaderFile(grammar24, sT25, "hi!");
        java.lang.String str28 = python3Target23.getVersion();
        org.stringtemplate.v4.STGroup sTGroup29 = python3Target23.loadTemplates();
        java.util.Set<java.lang.String> strSet30 = python3Target23.badWords;
        org.antlr.v4.tool.Grammar grammar31 = null;
        int[] intArray32 = new int[] {};
        java.lang.String[] strArray33 = python3Target23.getTokenTypesAsTargetLabels(grammar31, intArray32);
        java.lang.String[] strArray34 = python3Target13.getTokenTypesAsTargetLabels(grammar21, intArray32);
        java.lang.String[] strArray35 = python3Target1.getTokenTypesAsTargetLabels(grammar11, intArray32);
        org.antlr.v4.tool.Grammar grammar36 = null;
        org.stringtemplate.v4.ST sT37 = null;
        python3Target1.genRecognizerHeaderFile(grammar36, sT37, "_Python3");
        org.antlr.v4.codegen.CodeGenerator codeGenerator40 = null;
        java.lang.String str43 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator40, "\"\\\"tset4.5.2.\\\"Context\"", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str45 = python3Target1.getListLabel("\\35");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\nContext" + "'", str15, "\\nContext");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 64 + "'", int16 == 64);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "d" + "'", str19, "d");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "4.5.2.1" + "'", str28, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[]");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\\\"tset4.5.2.\\\"Context" + "'", str43, "\\\"tset4.5.2.\\\"Context");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        int int7 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("\"_tset\\n\"", true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = python3Target1.encodeIntAsCharEscape((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot encode the specified value: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"_tset\\\\n\\\"\"" + "'", str10, "\"\\\"_tset\\\\n\\\"\"");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("tset4.5.2.");
        java.lang.String str9 = python3Target1.getTargetStringLiteralFromString("d", false);
        java.lang.String str11 = python3Target1.getImplicitSetLabel("\\n");
        java.lang.String str12 = python3Target1.language;
        org.antlr.v4.codegen.CodeGenerator codeGenerator13 = null;
        java.lang.String str16 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator13, "\"_\\\"\\\\\\\\nContext\\\"\"", false);
        boolean boolean17 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"tset4.5.2.\"" + "'", str6, "\"tset4.5.2.\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d" + "'", str9, "d");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_tset\\n" + "'", str11, "_tset\\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Python3" + "'", str12, "Python3");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_\\\"\\\\\\\\nContext\\\"" + "'", str16, "_\\\"\\\\\\\\nContext\\\"");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator14 = null;
        java.lang.String str17 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator14, "\"4.5.2.1\"", false);
        java.lang.String str18 = python3Target1.getVersion();
        java.lang.String str19 = python3Target1.getLanguage();
        boolean boolean20 = python3Target1.supportsOverloadedMethods();
        boolean boolean21 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator22 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target23 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator22);
        java.lang.String str25 = python3Target23.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup26 = python3Target23.templates;
        java.lang.String[] strArray27 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target23.targetCharValueEscape = strArray27;
        java.lang.String str30 = python3Target23.getImplicitSetLabel("");
        java.lang.String[] strArray40 = new java.lang.String[] { "\"\\\\n\"", "\\nContext", "4.5.2.1", "\"\"", "_tset", "\\nContext", "\\nContext", "\\nContext", "\\nContext" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        python3Target23.badWords = strSet41;
        java.util.Set<java.lang.String> strSet44 = python3Target23.badWords;
        python3Target1.badWords = strSet44;
        java.lang.String str48 = python3Target1.getTargetStringLiteralFromString("\"4.5.2.1\"", false);
        org.antlr.v4.tool.ast.GrammarAST grammarAST49 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str50 = python3Target1.getLoopCounter(grammarAST49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4.5.2.1" + "'", str17, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "4.5.2.1" + "'", str18, "4.5.2.1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Python3" + "'", str19, "Python3");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\\nContext" + "'", str25, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup26);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "_tset" + "'", str30, "_tset");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\\\"4.5.2.1\\\"" + "'", str48, "\\\"4.5.2.1\\\"");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        boolean boolean6 = python3Target1.supportsOverloadedMethods();
        int int7 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("\"_tset\\n\"", true);
        java.util.Set<java.lang.String> strSet11 = python3Target1.getBadWords();
        java.lang.Class<?> wildcardClass12 = strSet11.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 64 + "'", int7 == 64);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"\\\"_tset\\\\n\\\"\"" + "'", str10, "\"\\\"_tset\\\\n\\\"\"");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target1.getTemplates();
        org.antlr.v4.tool.Grammar grammar14 = null;
        org.stringtemplate.v4.ST sT15 = null;
        python3Target1.genRecognizerHeaderFile(grammar14, sT15, "\"4.5.2.1\"");
        boolean boolean18 = python3Target1.supportsOverloadedMethods();
        int int19 = python3Target1.getSerializedATNSegmentLimit();
        python3Target1.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target22 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator21);
        org.antlr.v4.tool.Grammar grammar23 = null;
        org.stringtemplate.v4.ST sT24 = null;
        python3Target22.genRecognizerHeaderFile(grammar23, sT24, "hi!");
        python3Target22.language = "\"\"";
        org.antlr.v4.codegen.CodeGenerator codeGenerator29 = null;
        java.lang.String str32 = python3Target22.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator29, "", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator33 = python3Target22.gen;
        int int34 = python3Target22.getInlineTestSetWordSize();
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target36 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator35);
        java.lang.String str38 = python3Target36.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup39 = python3Target36.templates;
        java.lang.String str41 = python3Target36.getTargetStringLiteralFromString("\\n");
        java.lang.String str43 = python3Target36.getTargetStringLiteralFromString("_\"\\\\nContext\"");
        java.lang.String str45 = python3Target36.getTargetStringLiteralFromString("_tset_tset_tset4.5.2.1");
        java.util.Set<java.lang.String> strSet46 = python3Target36.badWords;
        python3Target22.badWords = strSet46;
        python3Target1.badWords = strSet46;
        org.antlr.v4.tool.ast.GrammarAST grammarAST49 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str50 = python3Target1.getLoopLabel(grammarAST49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 29 + "'", int19 == 29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(codeGenerator33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 64 + "'", int34 == 64);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\\nContext" + "'", str38, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\"\\\\n\"" + "'", str41, "\"\\\\n\"");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\"_\\\"\\\\\\\\nContext\\\"\"" + "'", str43, "\"_\\\"\\\\\\\\nContext\\\"\"");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "\"_tset_tset_tset4.5.2.1\"" + "'", str45, "\"_tset_tset_tset4.5.2.1\"");
        org.junit.Assert.assertNotNull(strSet46);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator4, "_tset4.5.2.1", false);
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = python3Target1.getCodeGenerator();
        int int9 = python3Target1.getInlineTestSetWordSize();
        java.lang.String str11 = python3Target1.encodeIntAsCharEscape((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "tset4.5.2." + "'", str7, "tset4.5.2.");
        org.junit.Assert.assertNull(codeGenerator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 64 + "'", int9 == 64);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d" + "'", str11, "d");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        int int3 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.tool.ast.GrammarAST grammarAST4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = python3Target1.getLoopLabel(grammarAST4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        int int4 = python3Target1.getSerializedATNSegmentLimit();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator5);
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = python3Target6.getCodeGenerator();
        boolean boolean8 = python3Target6.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator9 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target10 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator9);
        java.lang.String str12 = python3Target10.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup13 = python3Target10.templates;
        java.lang.String[] strArray14 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target10.targetCharValueEscape = strArray14;
        python3Target6.targetCharValueEscape = strArray14;
        python3Target1.targetCharValueEscape = strArray14;
        java.lang.String str19 = python3Target1.encodeIntAsCharEscape(10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertNull(codeGenerator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\\nContext" + "'", str12, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\\12" + "'", str19, "\\12");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        int int6 = python3Target1.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.templates;
        java.lang.String str9 = python3Target1.getImplicitSetLabel("\"\\\"_Python3\\\"\"");
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.loadTemplates();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 64 + "'", int6 == 64);
        org.junit.Assert.assertNull(sTGroup7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_tset\"\\\"_Python3\\\"\"" + "'", str9, "_tset\"\\\"_Python3\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup10);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.codegen.CodeGenerator codeGenerator2 = python3Target1.getCodeGenerator();
        boolean boolean3 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target5 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator4);
        org.antlr.v4.tool.Grammar grammar6 = null;
        org.stringtemplate.v4.ST sT7 = null;
        python3Target5.genRecognizerHeaderFile(grammar6, sT7, "hi!");
        java.lang.String str10 = python3Target5.getVersion();
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target5.loadTemplates();
        python3Target1.templates = sTGroup11;
        org.antlr.v4.tool.Grammar grammar13 = null;
        org.stringtemplate.v4.ST sT14 = null;
        python3Target1.genRecognizerHeaderFile(grammar13, sT14, "tset4.5.2.");
        org.antlr.v4.tool.Rule rule17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = python3Target1.getRuleFunctionContextStructName(rule17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(codeGenerator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4.5.2.1" + "'", str10, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup11);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        boolean boolean4 = python3Target1.wantsBaseListener();
        org.stringtemplate.v4.STGroup sTGroup5 = python3Target1.loadTemplates();
        java.lang.String str7 = python3Target1.getAltLabelContextStructName("_tset_tset_tset4.5.2.1");
        java.lang.String str8 = python3Target1.getVersion();
        boolean boolean9 = python3Target1.supportsOverloadedMethods();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(sTGroup5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_tset_tset_tset4.5.2.1Context" + "'", str7, "_tset_tset_tset4.5.2.1Context");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "4.5.2.1" + "'", str8, "4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getTargetStringLiteralFromString("_tsetContext");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"_tsetContext\"" + "'", str3, "\"_tsetContext\"");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str6 = python3Target1.getVersion();
        org.stringtemplate.v4.STGroup sTGroup7 = python3Target1.loadTemplates();
        java.util.Set<java.lang.String> strSet8 = python3Target1.badWords;
        python3Target1.language = "\"\\\"4.5.2.1\\\"\"";
        java.lang.String str12 = python3Target1.getTargetStringLiteralFromString("_tset_tset4.5.2.1");
        boolean boolean13 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.tool.ast.GrammarAST grammarAST14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = python3Target1.getLoopCounter(grammarAST14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4.5.2.1" + "'", str6, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup7);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"_tset_tset4.5.2.1\"" + "'", str12, "\"_tset_tset4.5.2.1\"");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String[] strArray5 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target1.targetCharValueEscape = strArray5;
        java.lang.String str8 = python3Target1.getImplicitSetLabel("");
        java.lang.String[] strArray18 = new java.lang.String[] { "\"\\\\n\"", "\\nContext", "4.5.2.1", "\"\"", "_tset", "\\nContext", "\\nContext", "\\nContext", "\\nContext" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        python3Target1.badWords = strSet19;
        java.util.Set<java.lang.String> strSet22 = python3Target1.badWords;
        boolean boolean23 = python3Target1.templatesExist();
        org.stringtemplate.v4.STGroup sTGroup24 = python3Target1.loadTemplates();
        boolean boolean25 = python3Target1.wantsBaseVisitor();
        org.antlr.v4.codegen.CodeGenerator codeGenerator26 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target27 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator26);
        java.lang.String str29 = python3Target27.getAltLabelContextStructName("\\n");
        int int30 = python3Target27.getInlineTestSetWordSize();
        boolean boolean31 = python3Target27.wantsBaseVisitor();
        java.lang.String str33 = python3Target27.encodeIntAsCharEscape((int) (byte) 100);
        java.lang.String[] strArray34 = python3Target27.targetCharValueEscape;
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target36 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator35);
        java.lang.String str38 = python3Target36.getAltLabelContextStructName("\\n");
        java.lang.String str40 = python3Target36.getAltLabelContextStructName("\\n");
        java.lang.String[] strArray41 = python3Target36.targetCharValueEscape;
        python3Target27.targetCharValueEscape = strArray41;
        java.lang.String[] strArray43 = python3Target27.targetCharValueEscape;
        python3Target1.targetCharValueEscape = strArray43;
        int int45 = python3Target1.getInlineTestSetWordSize();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_tset" + "'", str8, "_tset");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(sTGroup24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\\nContext" + "'", str29, "\\nContext");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 64 + "'", int30 == 64);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "d" + "'", str33, "d");
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\\nContext" + "'", str38, "\\nContext");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "\\nContext" + "'", str40, "\\nContext");
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 64 + "'", int45 == 64);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        org.antlr.v4.tool.Grammar grammar2 = null;
        org.stringtemplate.v4.ST sT3 = null;
        python3Target1.genRecognizerHeaderFile(grammar2, sT3, "hi!");
        java.lang.String str7 = python3Target1.getTargetStringLiteralFromString("\"_Python3\"");
        org.stringtemplate.v4.STGroup sTGroup8 = python3Target1.loadTemplates();
        org.antlr.v4.tool.ast.GrammarAST grammarAST9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = python3Target1.getLoopCounter(grammarAST9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"\\\"_Python3\\\"\"" + "'", str7, "\"\\\"_Python3\\\"\"");
        org.junit.Assert.assertNotNull(sTGroup8);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\\n");
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("_\"\\\\nContext\"");
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("_tset_tset_tset4.5.2.1");
        java.util.Set<java.lang.String> strSet11 = python3Target1.badWords;
        org.stringtemplate.v4.STGroup sTGroup12 = python3Target1.loadTemplates();
        java.lang.String str14 = python3Target1.getTargetStringLiteralFromString("\"\\\"hi!\\\"\"");
        boolean boolean15 = python3Target1.wantsBaseListener();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\\n\"" + "'", str6, "\"\\\\n\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_\\\"\\\\\\\\nContext\\\"\"" + "'", str8, "\"_\\\"\\\\\\\\nContext\\\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tset_tset_tset4.5.2.1\"" + "'", str10, "\"_tset_tset_tset4.5.2.1\"");
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(sTGroup12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"" + "'", str14, "\"\\\"\\\\\\\"hi!\\\\\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        java.lang.String[] strArray12 = new java.lang.String[] { "4.5.2.1", "\\n", "", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        python3Target1.badWords = strSet13;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = python3Target1.gen;
        org.stringtemplate.v4.STGroup sTGroup17 = python3Target1.getTemplates();
        java.lang.String str19 = python3Target1.getTargetStringLiteralFromString("");
        java.lang.String str20 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator21 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target22 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator21);
        org.antlr.v4.tool.Grammar grammar23 = null;
        org.stringtemplate.v4.ST sT24 = null;
        python3Target22.genRecognizerHeaderFile(grammar23, sT24, "hi!");
        int int27 = python3Target22.getInlineTestSetWordSize();
        org.stringtemplate.v4.STGroup sTGroup28 = python3Target22.templates;
        org.stringtemplate.v4.STGroup sTGroup29 = python3Target22.loadTemplates();
        python3Target1.templates = sTGroup29;
        org.antlr.v4.tool.Grammar grammar31 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = python3Target1.getTokenTypeAsTargetLabel(grammar31, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(codeGenerator16);
        org.junit.Assert.assertNotNull(sTGroup17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\"" + "'", str19, "\"\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Python3" + "'", str20, "Python3");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 64 + "'", int27 == 64);
        org.junit.Assert.assertNull(sTGroup28);
        org.junit.Assert.assertNotNull(sTGroup29);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator8);
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        python3Target9.genRecognizerHeaderFile(grammar10, sT11, "hi!");
        java.lang.String str14 = python3Target9.getVersion();
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target9.loadTemplates();
        python3Target1.templates = sTGroup15;
        java.lang.String str18 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.stringtemplate.v4.ST sT20 = null;
        python3Target1.genRecognizerHeaderFile(grammar19, sT20, "_tset");
        boolean boolean23 = python3Target1.supportsOverloadedMethods();
        java.lang.String str24 = python3Target1.getLanguage();
        int int25 = python3Target1.getInlineTestSetWordSize();
        org.antlr.v4.tool.Grammar grammar26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = python3Target1.getTokenTypeAsTargetLabel(grammar26, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset4.5.2.1" + "'", str18, "_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Python3" + "'", str24, "Python3");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 64 + "'", int25 == 64);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        java.lang.String str5 = python3Target1.getAltLabelContextStructName("\\n");
        java.lang.String str6 = python3Target1.getLanguage();
        java.lang.String str8 = python3Target1.getListLabel("");
        java.lang.String str9 = python3Target1.language;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\nContext" + "'", str5, "\\nContext");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Python3" + "'", str6, "Python3");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Python3" + "'", str9, "Python3");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getListLabel("_tset_tset4.5.2.1");
        org.antlr.v4.codegen.CodeGenerator codeGenerator4 = python3Target1.getCodeGenerator();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target6 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator5);
        java.lang.String str8 = python3Target6.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup9 = python3Target6.templates;
        java.lang.String str11 = python3Target6.getTargetStringLiteralFromString("\\n");
        org.antlr.v4.codegen.CodeGenerator codeGenerator12 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target13 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator12);
        java.lang.String str15 = python3Target13.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup16 = python3Target13.templates;
        java.lang.String[] strArray17 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target13.targetCharValueEscape = strArray17;
        java.lang.String str20 = python3Target13.getImplicitSetLabel("");
        java.lang.String[] strArray30 = new java.lang.String[] { "\"\\\\n\"", "\\nContext", "4.5.2.1", "\"\"", "_tset", "\\nContext", "\\nContext", "\\nContext", "\\nContext" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        python3Target13.badWords = strSet31;
        python3Target6.badWords = strSet31;
        org.antlr.v4.codegen.CodeGenerator codeGenerator35 = python3Target6.gen;
        java.lang.String[] strArray36 = python3Target6.targetCharValueEscape;
        python3Target1.targetCharValueEscape = strArray36;
        org.antlr.v4.tool.Rule rule38 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = python3Target1.getRuleFunctionContextStructName(rule38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_tset_tset4.5.2.1" + "'", str3, "_tset_tset4.5.2.1");
        org.junit.Assert.assertNull(codeGenerator4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\nContext" + "'", str8, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"\\\\n\"" + "'", str11, "\"\\\\n\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\nContext" + "'", str15, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup16);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "_tset" + "'", str20, "_tset");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(codeGenerator35);
        org.junit.Assert.assertNotNull(strArray36);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        java.lang.String[] strArray12 = new java.lang.String[] { "4.5.2.1", "\\n", "", "\"\"" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        python3Target1.badWords = strSet13;
        org.antlr.v4.codegen.CodeGenerator codeGenerator16 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target17 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator16);
        org.antlr.v4.codegen.CodeGenerator codeGenerator18 = python3Target17.getCodeGenerator();
        boolean boolean19 = python3Target17.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator20 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target21 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator20);
        org.antlr.v4.tool.Grammar grammar22 = null;
        org.stringtemplate.v4.ST sT23 = null;
        python3Target21.genRecognizerHeaderFile(grammar22, sT23, "hi!");
        java.lang.String str26 = python3Target21.getVersion();
        org.stringtemplate.v4.STGroup sTGroup27 = python3Target21.loadTemplates();
        python3Target17.templates = sTGroup27;
        org.stringtemplate.v4.STGroup sTGroup29 = python3Target17.getTemplates();
        org.antlr.v4.codegen.CodeGenerator codeGenerator30 = null;
        java.lang.String str33 = python3Target17.getTargetStringLiteralFromANTLRStringLiteral(codeGenerator30, "\"4.5.2.1\"", false);
        org.stringtemplate.v4.STGroup sTGroup34 = python3Target17.getTemplates();
        boolean boolean35 = python3Target17.templatesExist();
        java.util.Set<java.lang.String> strSet36 = python3Target17.badWords;
        java.util.Set<java.lang.String> strSet37 = python3Target17.badWords;
        python3Target1.badWords = strSet37;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(codeGenerator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "4.5.2.1" + "'", str26, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup27);
        org.junit.Assert.assertNotNull(sTGroup29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "4.5.2.1" + "'", str33, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertNotNull(strSet37);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.encodeIntAsCharEscape(10);
        org.antlr.v4.tool.Grammar grammar4 = null;
        org.stringtemplate.v4.ST sT5 = null;
        python3Target1.genRecognizerHeaderFile(grammar4, sT5, "\\nContext");
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target9 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator8);
        org.antlr.v4.tool.Grammar grammar10 = null;
        org.stringtemplate.v4.ST sT11 = null;
        python3Target9.genRecognizerHeaderFile(grammar10, sT11, "hi!");
        java.lang.String str14 = python3Target9.getVersion();
        org.stringtemplate.v4.STGroup sTGroup15 = python3Target9.loadTemplates();
        python3Target1.templates = sTGroup15;
        java.lang.String str18 = python3Target1.getImplicitSetLabel("4.5.2.1");
        org.antlr.v4.tool.Grammar grammar19 = null;
        org.stringtemplate.v4.ST sT20 = null;
        python3Target1.genRecognizerHeaderFile(grammar19, sT20, "_tset");
        boolean boolean23 = python3Target1.supportsOverloadedMethods();
        java.lang.String str24 = python3Target1.getLanguage();
        org.antlr.v4.codegen.CodeGenerator codeGenerator25 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target26 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator25);
        java.lang.String str28 = python3Target26.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup29 = python3Target26.templates;
        java.lang.String[] strArray30 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target26.targetCharValueEscape = strArray30;
        python3Target1.targetCharValueEscape = strArray30;
        org.antlr.v4.codegen.target.Python3Target.python3Keywords = strArray30;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\n" + "'", str3, "\\n");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "4.5.2.1" + "'", str14, "4.5.2.1");
        org.junit.Assert.assertNotNull(sTGroup15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_tset4.5.2.1" + "'", str18, "_tset4.5.2.1");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Python3" + "'", str24, "Python3");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\\nContext" + "'", str28, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup29);
        org.junit.Assert.assertNotNull(strArray30);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\\n");
        java.lang.String str8 = python3Target1.getTargetStringLiteralFromString("_\"\\\\nContext\"");
        java.lang.String str10 = python3Target1.getTargetStringLiteralFromString("_tset_tset_tset4.5.2.1");
        org.antlr.v4.tool.Grammar grammar11 = null;
        org.stringtemplate.v4.ST sT12 = null;
        python3Target1.genRecognizerHeaderFile(grammar11, sT12, "\"_tset\\\"\\\\\\\\n\\\"\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\\n\"" + "'", str6, "\"\\\\n\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"_\\\"\\\\\\\\nContext\\\"\"" + "'", str8, "\"_\\\"\\\\\\\\nContext\\\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\"_tset_tset_tset4.5.2.1\"" + "'", str10, "\"_tset_tset_tset4.5.2.1\"");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup4 = python3Target1.templates;
        java.lang.String str6 = python3Target1.getTargetStringLiteralFromString("\\n");
        org.antlr.v4.codegen.CodeGenerator codeGenerator7 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target8 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator7);
        java.lang.String str10 = python3Target8.getAltLabelContextStructName("\\n");
        org.stringtemplate.v4.STGroup sTGroup11 = python3Target8.templates;
        java.lang.String[] strArray12 = org.antlr.v4.codegen.target.Python3Target.python3Keywords;
        python3Target8.targetCharValueEscape = strArray12;
        java.lang.String str15 = python3Target8.getImplicitSetLabel("");
        java.lang.String[] strArray25 = new java.lang.String[] { "\"\\\\n\"", "\\nContext", "4.5.2.1", "\"\"", "_tset", "\\nContext", "\\nContext", "\\nContext", "\\nContext" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        python3Target8.badWords = strSet26;
        python3Target1.badWords = strSet26;
        int int30 = python3Target1.getInlineTestSetWordSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = python3Target1.getElementListName("\\\"4.5.2.1\\\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\\\\n\"" + "'", str6, "\"\\\\n\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\\nContext" + "'", str10, "\\nContext");
        org.junit.Assert.assertNotNull(sTGroup11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_tset" + "'", str15, "_tset");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 64 + "'", int30 == 64);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.antlr.v4.codegen.CodeGenerator codeGenerator0 = null;
        org.antlr.v4.codegen.target.Python3Target python3Target1 = new org.antlr.v4.codegen.target.Python3Target(codeGenerator0);
        java.lang.String str3 = python3Target1.getAltLabelContextStructName("\\n");
        python3Target1.addBadWords();
        org.antlr.v4.codegen.CodeGenerator codeGenerator5 = null;
        python3Target1.gen = codeGenerator5;
        boolean boolean7 = python3Target1.supportsOverloadedMethods();
        org.antlr.v4.codegen.CodeGenerator codeGenerator8 = null;
        python3Target1.gen = codeGenerator8;
        org.stringtemplate.v4.STGroup sTGroup10 = python3Target1.loadTemplates();
        java.lang.String str12 = python3Target1.getListLabel("\"\\\\1\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\nContext" + "'", str3, "\\nContext");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(sTGroup10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"\\\\1\"" + "'", str12, "\"\\\\1\"");
    }
}
